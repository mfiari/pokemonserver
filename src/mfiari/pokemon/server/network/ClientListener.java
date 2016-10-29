/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.network;

import java.net.Socket;
import mfiari.lib.game.reseau.Connexion;
import mfiari.lib.game.reseau.NetworkObjectTranmetter;
import mfiari.lib.game.reseau.ServeurManager;
import mfiari.pokemon.core.network.User;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.core.ville.Terrain;
import mfiari.pokemon.server.connexionBD.TransfertDonnee;

/**
 *
 * @author mike
 */
public class ClientListener extends mfiari.lib.game.reseau.ClientListener {
    
    public ClientListener (Socket socket, ServeurManager manager, User user) {
        super(socket, manager, user);
    }

    @Override
    public void run() {
        try {
            this.sendMessage(new NetworkObjectTranmetter("connexion", null));
            NetworkObjectTranmetter objectTranmetter;
            boolean connexionSucces = false;
            do {
                objectTranmetter = this.receiveMessage();
                if ("connexion".equals(objectTranmetter.getMessage())) {
                    Connexion connexion = (Connexion) objectTranmetter.getObject();
                    System.out.println(connexion);
                    TransfertDonnee transfertDonnee = new TransfertDonnee();
                    if (transfertDonnee.connexion(connexion.getLogin(), connexion.getPassword())) {
                        System.out.println("correct login & password");
                        connexionSucces = true;
                        this.user.setLogin(connexion.getLogin());
                    }
                    this.sendMessage(new NetworkObjectTranmetter("connexion", connexionSucces));
                }
            } while (!connexionSucces);
            System.out.println("connexion réussi");
            objectTranmetter = this.receiveMessage();
            if ("fight".equals(objectTranmetter.getMessage())) {
                System.out.println("lancement du mode combat");
                objectTranmetter = this.receiveMessage();
                if ("dresseur".equals(objectTranmetter.getMessage())) {
                    Dresseur dresseur1 = (Dresseur) objectTranmetter.getObject();
                    ((User)this.user).setDresseur(dresseur1);
                    System.out.println("mon dresseur : " + dresseur1.getNom());
                    objectTranmetter = this.receiveMessage();
                    if ("creer".equals(objectTranmetter.getMessage())) {
                        System.out.println("creation partie, attente adv");
                        Terrain terrain = (Terrain) objectTranmetter.getObject();
                        System.out.println("terrain : " + terrain.toString());
                        this.manager.addClientToType("fight", this.user);
                        objectTranmetter = this.receiveMessage();
                        if ("accepte".equals(objectTranmetter.getMessage())) {
                            User client = (User) objectTranmetter.getObject();
                            System.out.println("demande de " + client.getLogin() + " accepter");
                            this.manager.notifyClient(client, new NetworkObjectTranmetter("dresseur", dresseur1));
                            this.manager.notifyClient(client, new NetworkObjectTranmetter("terrain", terrain));
                            objectTranmetter = this.receiveMessage();
                            if ("dresseur".equals(objectTranmetter.getMessage())) {
                                Dresseur dresseur2 = (Dresseur) objectTranmetter.getObject();
                                FightServerController serverManager = new FightServerController(terrain, dresseur1, dresseur2, client, this.manager);
                                do {
                                    serverManager.notifyClientAction(this.receiveMessage(), this);
                                } while (true);
                            }
                        }
                    } else if ("rejoindre".equals(objectTranmetter.getMessage())) {
                        this.sendMessage(new NetworkObjectTranmetter("users", this.manager.getClientByType("fight")));
                        objectTranmetter = this.receiveMessage();
                        if ("user".equals(objectTranmetter.getMessage())) {
                            User client = (User) objectTranmetter.getObject();
                            this.manager.notifyClient(client, new NetworkObjectTranmetter("demande", this.user));
                            objectTranmetter = this.receiveMessage();
                            if ("dresseur".equals(objectTranmetter.getMessage())) {
                                Dresseur dresseur2 = (Dresseur) objectTranmetter.getObject();
                                objectTranmetter = this.receiveMessage();
                                if ("terrain".equals(objectTranmetter.getMessage())) {
                                    Terrain terrain = (Terrain) objectTranmetter.getObject();
                                    System.out.println("terrain : " + terrain.toString());
                                    this.manager.notifyClient(client, new NetworkObjectTranmetter("dresseur", dresseur1));
                                    FightServerController serverManager = new FightServerController(terrain, dresseur1, dresseur2, client, this.manager);
                                    do {
                                        serverManager.notifyClientAction(this.receiveMessage(), this);
                                    } while (true);
                                }
                            }
                        }
                    }
                }
            } else if ("game".equals(objectTranmetter.getMessage())) {
                this.manager.addClientToType("game", this.user);
                this.sendMessage(new NetworkObjectTranmetter("nouvellePartie", null));
                objectTranmetter = this.receiveMessage();
                if ("dresseur".equals(objectTranmetter.getMessage())) {
                    Dresseur dresseur1 = (Dresseur) objectTranmetter.getObject();
                    ((User)this.user).setDresseur(dresseur1);
                    System.out.println("mon dresseur : " + dresseur1.getNom());
                    this.manager.notifyAllClient(new NetworkObjectTranmetter("connexionJoueur", dresseur1));
                    PokemonServerController serverController = new PokemonServerController(manager);
                    do {
                        serverController.notifyClientAction(this.receiveMessage(), this);
                    } while (true);
                }
            }
        } catch (ClientCloseException ex) {
            System.out.println("client close, stopping listener.");
        }
    }
    
}

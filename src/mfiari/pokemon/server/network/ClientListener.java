/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.network;

import java.net.Socket;
import mfiari.lib.game.connexionBD.ConnexionBD;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.position.Position;
import mfiari.lib.game.reseau.Connexion;
import mfiari.lib.game.reseau.NetworkObjectTranmetter;
import mfiari.lib.game.reseau.ServeurManager;
import mfiari.pokemon.server.Global;
import mfiari.pokemon.server.demarrage.CreationPerso;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.DresseurClassique;
import mfiari.pokemon.server.perso.Dresseurs;
import mfiari.pokemon.server.perso.Maitre;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.ville.Endroits;
import mfiari.pokemon.server.ville.Terrain;

/**
 *
 * @author mike
 */
public class ClientListener extends mfiari.lib.game.reseau.ClientListener {
    
    public ClientListener (Socket socket, ServeurManager manager, User user) {
        super(socket, manager, user);
    }
    
    public Dresseur loadDresseur () {
        if (this.manager.getAllKeys().size() == 1) {
            return Dresseurs.sachaTournoi;
        } else {
            return Dresseurs.regisTournoi;
        }
    }

    @Override
    public void run() {
        try {
            this.sendMessage(new NetworkObjectTranmetter("connexion", null));
            NetworkObjectTranmetter objectTranmetter;
            boolean connexionSucces = false;
            int partie = 0;
            do {
                objectTranmetter = this.receiveMessage();
                if ("connexion".equals(objectTranmetter.getMessage())) {
                    Connexion connexion = (Connexion) objectTranmetter.getObject();
                    System.out.println(connexion);
                    ConnexionBD connexionBD = new ConnexionBD();
                    mfiari.pokemon.server.connexionBD.Connexion c = new mfiari.pokemon.server.connexionBD.Connexion(connexionBD.getConnexionDB2(Global.hsqlLocation, Global.hsqlUser, Global.hsqlMdp));
                    if (c.connexionSucced(connexion)) {
                        connexionSucces = true;
                        this.user.setLogin(connexion.getLogin());
                        partie = c.getPartie();
                    }
                    this.sendMessage(new NetworkObjectTranmetter("connexion", connexionSucces));
                }
            } while (!connexionSucces);
            System.out.println("connexion réussi");
            this.sendMessage(new NetworkObjectTranmetter("partie", partie));
            /*Dresseur dresseur1 = this.loadDresseur();
            ((User)this.user).setDresseur(dresseur1);
            System.out.println("mon dresseur : " + dresseur1.getNom());
            this.sendMessage(new NetworkObjectTranmetter("dresseur", dresseur1));*/
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

                    /*if ("client".equals(objectTranmetter.getMessage())) {
                        ClientListener clientListener = (ClientListener) this.manager.getClient((Socket)objectTranmetter.getObject());
                        Terrain [] terrains = {new Terrain(Type.normal)};
                        this.sendMessage(new NetworkObjectTranmetter("terrains", terrains));
                        objectTranmetter = this.receiveMessage();
                        if ("terrain".equals(objectTranmetter.getMessage())) {
                            FightServerManager serverManager = new FightServerManager((Terrain)objectTranmetter.getObject());
                            serverManager.ajouterClient(this.socket, this);
                            do {
                                serverManager.notifyClientAction(this.receiveMessage(), this);
                            } while (true);
                        }
                    }*/
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
                /*Global.nbPersoConnecter++;
                switch (Global.nbPersoConnecter) {
                    case 1:
                        this.dresseur = new DresseurClassique(Dresseurs.mike);
                        break;
                    case 2:
                        this.dresseur = new Maitre(Dresseurs.sacha);
                        break;
                    case 3:
                        this.dresseur = new Maitre(Dresseurs.regis);
                        break;
                }
                //this.dresseur = new DresseurClassique(Dresseurs.mike);
                this.dresseur.setPosition(new Position(3, 2, 0, Endroits.quartierDresseur_bourgPalette, Orientation.droite));
                Endroits.quartierDresseur_bourgPalette.ajouterGens(this.dresseur);
                System.out.println(this.dresseur.getNom());
                EquipePokemon equipe = this.dresseur.getEquipe();
                for (int j = 0 ; j < equipe.lenght() ; j++) {
                    if (equipe.aPokemon(j)) {
                        equipe.getPokemon(j).changeNiveau(50);
                    }
                }
                this.sendMessage(new NetworkObjectTranmetter("dresseur", this.dresseur));
                this.manager.notifyAllClient(new NetworkObjectTranmetter("connexionJoueur", this.dresseur));
                do {
                    this.manager.notifyClientAction(this.receiveMessage(), this);
                } while (true);*/
            }
        } catch (ClientCloseException ex) {
            System.out.println("client close, stopping listener.");
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.extra;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mfiari.lib.game.connexionBD.ConnexionBD;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.controlleur.Vues;
import mfiari.lib.game.liste.ListeDeMusique;
import mfiari.lib.game.media.Musique;
import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.objet.ObjetEndroitPassage;
import mfiari.pokemon.server.Global;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.combat.CombatReseau;
import mfiari.pokemon.server.connexionBD.TransfertDonnee;
import mfiari.pokemon.server.demarrage.CreationCapacite;
import mfiari.pokemon.server.demarrage.CreationPerso;
import mfiari.pokemon.server.demarrage.CreationPokemon;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.musique.Musiques;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.Dresseurs;
import mfiari.lib.game.position.Position;
import mfiari.lib.game.reseau.Client;
import mfiari.lib.game.reseau.EnvoiObjet;
import mfiari.lib.game.reseau.ReceveurObjet;
import mfiari.lib.game.reseau.Serveur;
import mfiari.lib.game.texte.Langue;
import mfiari.pokemon.server.texte.Texte;
import mfiari.pokemon.server.type.TypeTournoi;

/**
 *
 * @author mike
 */
public class MenuExtra extends ControlleurVue {
    
    private TypeTournoi typeTournoi;
    private int nbParticipant;
    private int nbJoueur;
    private boolean valider;
    private int etape;
    private String tab[];
    private int musiqueEnCour;

    public MenuExtra() {
        
    }
    
    public void menu () {
        do {
            this.pcsControlleurVue.firePropertyChange("afficherMenu", null, null);
            switch (this.choix) {
                case (1):
                    this.enLigne();
                    break;
                case (2):
                    this.duel();
                    break;
                case (3):
                    this.tournoi();
                    this.choix = -1;
                    break;
                case (4):
                    this.musiqueEtVideo();
                    break;
                case (5):
                    this.configuration();
                    break;
            }
        } while (choix != 0);
    }
    
    public void setTab (String tab[]) {
        this.tab = tab;
    }
    
    public ListeDeMusique getMusiques () {
        return Musiques.getListeDeMusique();
    }
    
    public Musique getMusique () {
        return Musiques.getListeDeMusique().getMusique(this.musiqueEnCour);
    }
    
    private void enLigne() {
        /*this.pcsControlleurVue.firePropertyChange("enLigne", null, null);
        CreationCapacite creationCapacite = new CreationCapacite();
        CreationPokemon creationPokemon = new CreationPokemon();
        CreationPerso creationPerso = new CreationPerso();
        if (this.choix == 1) {
            Serveur serveur = new Serveur();
            serveur.lancerServeur(Global.port);
            while (!serveur.clientArrive()) {
                this.pcsControlleurVue.firePropertyChange("attenteJoueur", null, null);
                this.attendre(1000);
            }
            Socket socket = serveur.getSocket();
            ReceveurObjet receveur = new ReceveurObjet(socket);
            Dresseur d = (Dresseur)receveur.readObject();
            if (d!=null) {
                System.out.println(d.getNom());
            }
            Dresseur d2 = Dresseurs.sachaTournoi;
            System.out.println(d2.getNom());
            EquipePokemon equipe = d2.getEquipe();
            for (int j = 0 ; j < equipe.lenght() ; j++) {
                if (equipe.aPokemon(j)) {
                    equipe.getPokemon(j).changeNiveau(50);
                }
            }
            EnvoiObjet envoi = new EnvoiObjet(socket);
            envoi.writeObject(d2);
            CombatReseau c = new CombatReseau (Terrains.terrainNormal, socket);
            c.combatSimpleReseau(d2, d);
            receveur.close();
            envoi.close();
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuExtra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (this.choix == 2) {
            Client client = new Client();
            do {
                this.pcsControlleurVue.firePropertyChange("rechercheHote", null, null);
                this.attendre(1000);
                client.lancerClient(Global.serveur, Global.port);
            } while (!client.estConnecter());
            Socket socket = client.getSocket();
            Dresseur d = Dresseurs.regisTournoi;
            System.out.println(d.getNom());
            EquipePokemon equipe = d.getEquipe();
            for (int j = 0 ; j < equipe.lenght() ; j++) {
                if (equipe.aPokemon(j)) {
                    equipe.getPokemon(j).changeNiveau(50);
                }
            }
            EnvoiObjet envoi = new EnvoiObjet(socket);
            envoi.writeObject(d);
            ReceveurObjet receveur = new ReceveurObjet(socket);
            Dresseur d2 = (Dresseur)receveur.readObject();
            if (d2!=null){
                System.out.println(d2.getNom());
            }
            CombatReseau c = new CombatReseau (Terrains.terrainNormal, socket);
            c.combatSimpleReseau(d, d2);
            envoi.close();
            receveur.close();
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuExtra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (this.choix == 3) {
            this.tournoiReseaux();
        } else if (this.choix == 4) {
            this.typeTournoi = TypeTournoi.liguePokemon;
            this.nbParticipant = 32;
            this.nbJoueur = 1;
            TournoiExtraReseauClient tournoiExtra = new TournoiExtraReseauClient (this.typeTournoi, this.nbParticipant, this.nbJoueur);
            tournoiExtra.menu();
        }*/
    }

    private void duel() {
        DuelExtra duel = new DuelExtra();
        duel.menu();
    }

    private void tournoi() {
        this.etape = 1;
        do {
            switch (this.etape) {
                case 1 :
                    this.choixTypeTournoi();
                    break;
                case 2 :
                    this.choixNbParticipant();
                    break;
                case 3 :
                    this.choixNbJoueur();
                    break;
                case 4 :
                    TournoiExtra tournoiExtra = new TournoiExtra (this.typeTournoi, this.nbParticipant, this.nbJoueur);
                    tournoiExtra.menu();
                    this.etape--;
                    break;
            }
        } while (this.choix != 0 && this.etape != 0);
    }

    private void tournoiReseaux() {
        this.etape = 1;
        do {
            switch (this.etape) {
                case 1 :
                    this.choixTypeTournoi();
                    break;
                case 2 :
                    this.choixNbParticipant();
                    break;
                case 3 :
                    this.choixNbJoueur();
                    break;
                case 4 :
                    TournoiExtraReseauServeur tournoiExtra = new TournoiExtraReseauServeur (this.typeTournoi, this.nbParticipant, this.nbJoueur);
                    tournoiExtra.menu();
                    this.etape--;
                    break;
            }
        } while (this.choix != 0 && this.etape != 0);
    }
    
    private void etapeSuivant () {
        this.etape++;
    }
    
    private void etapePrecedente () {
        this.etape--;
    }
    
    public void choixTypeTournoi() {
        do {
            this.pcsControlleurVue.firePropertyChange("choixTypeTournoi", null, null);
        } while (this.choix < 0 && this.choix > TypeTournoi.values().length);
        if (this.choix != 0) {
            this.typeTournoi = TypeTournoi.values()[this.choix -1];
            this.etapeSuivant();
        } else {
            this.etapePrecedente();
        }
    }
    
    public void choixNbParticipant () {
        do {
            this.pcsControlleurVue.firePropertyChange("choixNbParticipant", null, null);
        } while (this.choix < 0 && this.choix > 4);
        if (this.choix != 0) {
            switch (this.choix) {
                case 1:
                    this.nbParticipant = 8;
                    break;
                case 2:
                    this.nbParticipant = 16;
                    break;
                case 3:
                    this.nbParticipant = 32;
                    break;
                case 4:
                    this.nbParticipant = 64;
                    break;
                default:
                    this.nbParticipant = 16;
                    break;
            }
            this.etapeSuivant();
        } else {
            this.etapePrecedente();
        }
    }
    
    public void choixNbJoueur () {
        do {
            this.pcsControlleurVue.firePropertyChange("choixNbJoueur", null, null);
        } while (this.choix < 0 && this.choix > this.nbParticipant);
        if (this.choix != 0) {
            this.nbJoueur = this.choix;
            this.etapeSuivant();
        } else {
            this.etapePrecedente();
        }
    }

    private void musiqueEtVideo() {
        do {
            this.pcsControlleurVue.firePropertyChange("musiqueEtVideo", null, null);
            if (this.choix != -1) {
                this.musiqueEnCour = this.choix -1;
                if (this.getMusique() != null) {
                    this.getMusique().start(true);
                    do {
                        this.pcsControlleurVue.firePropertyChange("playMusique", null, null);
                        if (this.choix == 1) {
                            this.getMusique().stop();
                        }
                    } while (this.choix != 0);
                    this.getMusique().terminer();
                }
            }
        } while (this.choix != -1);
    }

    private void configuration() {
        do {
            this.pcsControlleurVue.firePropertyChange("configuration", null, null);
            switch (this.choix) {
                case 1 :
                    this.pcsControlleurVue.firePropertyChange("configurationServeur", null, null);
                    if (this.choix == 1) {
                        Global.serveur = this.tab[0];
                        Global.port = Integer.parseInt(this.tab[1]);
                    }
                    break;
                case 2:
                    this.pcsControlleurVue.firePropertyChange("configurationSiteWeb", null, null);
                    if (this.choix == 1) {
                        Global.hostsiteWeb = this.tab[0];
                        Global.nomsiteWeb = this.tab[1];
                    }
                    break;
                case 3:
                    ConnexionBD connexionBD = new ConnexionBD();
                    TransfertDonnee transfertDonnee = new TransfertDonnee(
                            connexionBD.getConnexionHSQL(Global.hsqlLocation, Global.hsqlUser, Global.hsqlMdp), 
                            connexionBD.getConnexionMySQL(Global.hostsiteWeb, Global.nomsiteWeb, Global.hsqlMdp));
                    /*transfertDonnee.tansfertDonnee();
                    connexionBD.fermerConnexionHSQL();
                    connexionBD.fermerConnexionMySQL();*/
                    transfertDonnee.transfertDonnees();
                    break;
                case 4:
                    do {
                        this.pcsControlleurVue.firePropertyChange("choixLangue", null, null);
                    } while (this.choix != 1 && this.choix != 2);
                    Texte.langue = Langue.values()[this.choix-1];
                    this.pcsControlleurVue.firePropertyChange("actualiseLangue", null, null);
                    break;
                case 5:
                    do {
                        this.pcsControlleurVue.firePropertyChange("configurationJeu", null, null);
                        switch (this.choix) {
                            case 1 :
                                
                                break;
                        }
                    } while (this.choix != 0);
                    break;
            }
        } while (this.choix != -1);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.extra;

import mfiari.pokemon.core.perso.pokemon.Pokemon;
import java.net.Socket;
import mfiari.lib.game.reseau.EnvoiObjet;
import mfiari.lib.game.reseau.ReceveurObjet;
import mfiari.lib.game.reseau.Serveur;
import mfiari.pokemon.core.list.ListeDeDresseur;
import mfiari.pokemon.core.list.ListeDePokemon;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.core.perso.dresseur.DresseurClassique;
import mfiari.pokemon.core.perso.pokemon.EquipePokemon;
import mfiari.pokemon.server.Global;
import mfiari.pokemon.server.demarrage.CreationCapacite;
import mfiari.pokemon.server.demarrage.CreationPerso;
import mfiari.pokemon.server.demarrage.CreationPokemon;
import mfiari.pokemon.core.type.TypeTournoi;

/**
 *
 * @author mike
 */
public class TournoiExtraReseauServeur extends TournoiExtra {
    
    private TypeTournoi typeTournoi;
    private int nbParticipant;
    private int nbJoueur;
    private boolean valider;
    private boolean commencerPartie;
    private ListeDeDresseur dresseurs;
    private ListeDeDresseur dresseursDuTournoi;
    private ListeDeDresseur vosDresseur;
    private ListeDeDresseur dresseurReseau;
    private int dresseurEnCour;
    private int pokemonEnCour;
    private CreationPokemon creationPokemon;
    private CreationPerso creationPerso;
    private CreationCapacite creationCapacite;
    private ListeDePokemon pokemons;
    private String affichage;
    private Serveur serveur;
    private Socket socket;
    private EnvoiObjet envoi;
    private ReceveurObjet receveur;
    
    public TournoiExtraReseauServeur () {
    }
    
    public TournoiExtraReseauServeur (TypeTournoi typeTournoi, int nbParticipant, int nbJoueur) {
        this.typeTournoi = typeTournoi;
        this.nbParticipant = nbParticipant;
        this.nbJoueur = nbJoueur;
        this.creationPokemon = new CreationPokemon();
        this.creationPerso = new CreationPerso();
        this.commencerPartie = false;
        this.serveur = new Serveur();
        this.serveur.lancerServeur(Global.port);
        while (!this.serveur.clientArrive()) {
            this.attendre(1000);
        }
        this.socket = this.serveur.getSocket();
        this.envoi = new EnvoiObjet(this.socket);
        this.receveur = new ReceveurObjet(this.socket);
        ListeDePokemon listeDePokemon;
        this.pokemons = new ListeDePokemon(200);
        this.creationCapacite = new CreationCapacite();
        this.dresseursDuTournoi = this.creationPerso.getDresseurs();
        listeDePokemon = this.creationPokemon.getListeDePokemon();
        for (int i = 0 ; i < listeDePokemon.size() ; i++) {
            this.pokemons.ajouterPokemon(Pokemon.getInstance(listeDePokemon.getPokemon(i)));
        }
        switch (typeTournoi) {
            case liguePokemon :
                for (int i = 0 ; i < this.pokemons.size() ; i++) {
                    this.pokemons.getPokemon(i).changeNiveau(50);
                }
                for (int i = 0 ; i < this.dresseursDuTournoi.size() ; i++) {
                    EquipePokemon equipe = this.dresseursDuTournoi.getDresseur(i).getEquipe();
                    for (int j = 0 ; j < equipe.lenght() ; j++) {
                        if (equipe.aPokemon(j)) {
                            equipe.getPokemon(j).changeNiveau(50);
                        }
                    }
                }
                break;
            case combat :
                for (int i = 0 ; i < this.pokemons.size() ; i++) {
                    this.pokemons.getPokemon(i).changeNiveau(50);
                }
                break;
           case superLiguePokemon :
                for (int i = 0 ; i < this.pokemons.size() ; i++) {
                    this.pokemons.getPokemon(i).changeNiveau(100);
                }
                break;
        }
    }
    
    public String getAffichage () {
        return this.affichage;
    }
    
    public Dresseur getDresseurEnCour () {
        return this.dresseurs.getDresseur(this.dresseurEnCour-1);
    }
    
    public Pokemon getPokemonEnCour () {
        return this.dresseurs.getDresseur(this.dresseurEnCour-1).getEquipe().getPokemon(this.pokemonEnCour-1);
    }
    
    public ListeDePokemon getPokemons () {
        return this.pokemons;
    }
    
    public ListeDeDresseur getDresseurs () {
        return this.dresseursDuTournoi;
    }
    
    public ListeDeDresseur getParticipant () {
        return this.dresseurs;
    }
    
    public void menu () {
        this.pcsControlleurVue.firePropertyChange("choixVoirRegle", null, null);
        if (this.valider) {
            this.pcsControlleurVue.firePropertyChange("voirRegle", null, null);
        }
        this.dresseurEnCour = 0;
        this.pokemonEnCour = 0;
        this.dresseurs = new ListeDeDresseur();
        this.vosDresseur = new ListeDeDresseur();
        this.dresseurReseau = new ListeDeDresseur();
        Thread t = new Thread(new Accepter_clients());
        t.start();
        do {
            this.pcsControlleurVue.firePropertyChange("choixDresseur", null, null);
            if (this.choix == 1 ) {
                this.dresseurEnCour++;
                this.pokemonEnCour = 0;
                Dresseur d = new DresseurClassique();
                d.changerNom("J"+(this.dresseurEnCour));
                d.setEquipe(new EquipePokemon(10));
                this.dresseurs.ajouterDresseur(d);
                this.vosDresseur.ajouterDresseur(d);
                do {
                    this.choixPokemon();
                } while ((this.choix != 500 && this.pokemonEnCour < 10 && this.pokemonEnCour >= 0) || (this.choix == 500 && this.pokemonEnCour < 6));
                if (this.pokemonEnCour < 0) {
                    if (!this.vosDresseur.isEmpty() && this.vosDresseur.size() == this.dresseurEnCour) {
                        this.vosDresseur.removeDresseur(this.dresseurEnCour-1);
                    }
                    if (!this.dresseurs.isEmpty() && this.dresseurs.size() == this.dresseurEnCour) {
                        this.dresseurs.removeDresseur(this.dresseurEnCour-1);
                    }
                    this.dresseurEnCour--;
                }
            } else if (this.choix >= 2 && this.choix <= this.dresseursDuTournoi.size() +1) {
                this.dresseurEnCour++;
                Dresseur d = this.dresseursDuTournoi.getDresseur(this.choix -2);
                d.changerNom(d.getNom() + " J"+this.dresseurEnCour);
                this.dresseurs.ajouterDresseur(d);
                this.vosDresseur.ajouterDresseur(d);
            } else if (this.choix == 0 ) {
                if (!this.vosDresseur.isEmpty() && this.vosDresseur.size() == this.dresseurEnCour) {
                    this.vosDresseur.removeDresseur(this.dresseurEnCour);
                }
                if (!this.dresseurs.isEmpty() && this.dresseurs.size() == this.dresseurEnCour) {
                    this.dresseurs.removeDresseur(this.dresseurEnCour);
                }
                this.dresseurEnCour--;
            } else if (this.choix == -1) {
                System.out.println(this.dresseurReseau.size());
                System.out.println(this.serveur.getNbClient());
                if (this.dresseurReseau.size() == this.serveur.getNbClient()) {
                    this.commencerPartie = true;
                }
            }
        } while (((this.nbJoueur > this.dresseurEnCour) && (this.dresseurEnCour >= 0)) || (!this.commencerPartie));
        if (this.dresseurEnCour > 0) {
            this.terminer();
        }
    }
    
    public void setValider (boolean choix) {
        this.valider = choix;
    }
    
    public void choixPokemon() {
        this.pcsControlleurVue.firePropertyChange("choixPokemon", null, null);
        if (this.choix == 500) {
            if (this.dresseurs.getDresseur(this.dresseurEnCour-1).getEquipe().getNbPokemon() >= 6) {
                this.pokemonEnCour = 0;
            } else {
                this.pcsControlleurVue.firePropertyChange("pokemonInssufisant", null, null);
            }
        } else if (this.choix > 0 && this.choix <= this.pokemons.size()) {
            this.pcsControlleurVue.firePropertyChange("confirmerPokemon", null, null);
            if (this.valider) {
                this.dresseurs.getDresseur(this.dresseurEnCour-1).ajouterPokemon(this.pokemons.getPokemon(this.choix-1));
                this.pokemonEnCour++;
            }
        } else if (this.choix == 0) {
            if (this.pokemonEnCour > 0 && this.dresseurs.getDresseur(this.dresseurEnCour-1).getEquipe().aPokemon(this.pokemonEnCour-1)) {
                this.dresseurs.getDresseur(this.dresseurEnCour-1).getEquipe().enleverPokemon(this.pokemonEnCour-1);
            }
            this.pokemonEnCour--;
        }
    }
    
    public void terminer () {
        /*int indice;
        for (int i = 0 ; i < this.dresseurReseau.size() ; i++) {
            this.dresseurs.ajouterDresseur(this.dresseurReseau.getDresseur(i));
        }
        while ((this.dresseurs.size()) < this.nbParticipant) {
            indice = (int) (Math.random() * this.dresseursDuTournoi.size() - 1);
            this.dresseurs.ajouterDresseur(this.dresseursDuTournoi.getDresseur(indice));
        }
        this.pcsControlleurVue.firePropertyChange("confirmerDresseurTournoi", null, null);
        if (this.valider) {
            this.envoi.writeObject(this.dresseurs);
            this.envoi.writeObject(this.vosDresseur);
            TournoiReseauServeur t = new TournoiReseauServeur (this.dresseurs, this.vosDresseur, this.dresseurReseau, this.socket, 
                    this.envoi, this.receveur);
            t.commencerTournoi();
        }*/
    }
    
    private class Accepter_clients implements Runnable {
        @Override
        public void run() {
            /*Dresseur d = (Dresseur)receveur.readObject();
            if (d!=null) {
                System.out.println(d.getNom());
            }
            dresseurReseau.ajouterDresseur(d);*/
        }
    }
    
}

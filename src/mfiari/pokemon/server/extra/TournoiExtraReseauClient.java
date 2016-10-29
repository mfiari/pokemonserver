/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.extra;

import mfiari.pokemon.core.perso.pokemon.Pokemon;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.net.Socket;
import mfiari.lib.game.reseau.Client;
import mfiari.lib.game.reseau.EnvoiObjet;
import mfiari.lib.game.reseau.ReceveurObjet;
import mfiari.pokemon.core.list.ListeDeDresseur;
import mfiari.pokemon.core.list.ListeDePokemon;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
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
public class TournoiExtraReseauClient extends TournoiExtra {
    
    private PropertyChangeSupport pcsDeroulementTournoi = new PropertyChangeSupport(this);
    private int choix;
    private TypeTournoi typeTournoi;
    private int nbParticipant;
    private int nbJoueur;
    private boolean valider;
    private boolean commencerPartie;
    private ListeDeDresseur dresseursDuTournoi;
    private ListeDeDresseur vosDresseur;
    private int dresseurEnCour;
    private int pokemonEnCour;
    private CreationPokemon creationPokemon;
    private CreationPerso creationPerso;
    private CreationCapacite creationCapacite;
    private ListeDePokemon pokemons;
    private String affichage;
    private Socket socket;
    private EnvoiObjet envoi;
    private ReceveurObjet receveur;
    
    public TournoiExtraReseauClient () {
    }
    
    public TournoiExtraReseauClient (TypeTournoi typeTournoi, int nbParticipant, int nbJoueur) {
        this.creationPokemon = new CreationPokemon();
        this.creationPerso = new CreationPerso();
        this.typeTournoi = typeTournoi;
        this.nbParticipant = nbParticipant;
        this.nbJoueur = nbJoueur;
        Client client = new Client();
        client.lancerClient(Global.serveur, Global.port);
        this.socket = client.getSocket();
        this.envoi = new EnvoiObjet(this.socket);
        this.receveur = new ReceveurObjet(this.socket);
        ListeDePokemon listeDePokemon;
        this.pokemons = new ListeDePokemon(200);
        listeDePokemon = this.creationPokemon.getListeDePokemon();
        this.dresseursDuTournoi = this.creationPerso.getDresseurs();
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
        return this.vosDresseur.getDresseur(this.dresseurEnCour-1);
    }
    
    public Pokemon getPokemonEnCour () {
        return this.vosDresseur.getDresseur(this.dresseurEnCour-1).getEquipe().getPokemon(this.pokemonEnCour-1);
    }
    
    public ListeDePokemon getPokemons () {
        return this.pokemons;
    }
    
    public ListeDeDresseur getDresseurs () {
        return this.dresseursDuTournoi;
    }
    
    public ListeDeDresseur getParticipant () {
        return this.vosDresseur;
    }
    
    public void menu () {
        /*this.pcsDeroulementTournoi.firePropertyChange("choixVoirRegle", null, null);
        if (this.valider) {
            this.pcsDeroulementTournoi.firePropertyChange("voirRegle", null, null);
        }
        this.dresseurEnCour = 0;
        this.pokemonEnCour = 0;
        this.vosDresseur = new ListeDeDresseur();
        do {
            this.pcsDeroulementTournoi.firePropertyChange("choixDresseur", null, null);
            if (this.choix == 1 ) {
                this.dresseurEnCour++;
                this.pokemonEnCour = 0;
                Dresseur d = new DresseurClassique();
                d.changerNom("J"+(this.dresseurEnCour));
                d.setEquipe(new EquipePokemon(10));
                this.vosDresseur.ajouterDresseur(d);
                this.envoi.writeObject(d);
                do {
                    this.choixPokemon();
                } while ((this.choix != 500 && this.pokemonEnCour < 10 && this.pokemonEnCour >= 0) || (this.choix == 500 && this.pokemonEnCour < 6));
                if (this.pokemonEnCour < 0) {
                    if (!this.vosDresseur.isEmpty() && this.vosDresseur.size() == this.dresseurEnCour) {
                        this.vosDresseur.removeDresseur(this.dresseurEnCour-1);
                    }
                    this.dresseurEnCour--;
                }
            } else if (this.choix >= 2 && this.choix <= this.dresseursDuTournoi.size() +1) {
                this.dresseurEnCour++;
                Dresseur d = this.dresseursDuTournoi.getDresseur(this.choix -2);
                d.changerNom(d.getNom() + " J"+this.dresseurEnCour);
                this.vosDresseur.ajouterDresseur(d);
                this.envoi.writeObject(d);
            } else if (this.choix == 0 ) {
                if (!this.vosDresseur.isEmpty() && this.vosDresseur.size() == this.dresseurEnCour) {
                    this.vosDresseur.removeDresseur(this.dresseurEnCour);
                }
                this.dresseurEnCour--;
            } else if (this.choix == -1) {
                this.commencerPartie = true;
            }
        } while ((this.nbJoueur > this.dresseurEnCour) && (this.dresseurEnCour >= 0));
        if (this.dresseurEnCour > 0) {
            this.terminer();
        }*/
    }
    
    public int getChoix () {
        return this.choix;
    }
    
    public void setChoix (int choix) {
        this.choix = choix;
    }
    
    public void setValider (boolean choix) {
        this.valider = choix;
    }
    
    public void choixPokemon() {
        this.pcsDeroulementTournoi.firePropertyChange("choixPokemon", null, null);
        if (this.choix == 500) {
            if (this.vosDresseur.getDresseur(this.dresseurEnCour-1).getEquipe().getNbPokemon() >= 6) {
                this.pokemonEnCour = 0;
            } else {
                this.pcsDeroulementTournoi.firePropertyChange("pokemonInssufisant", null, null);
            }
        } else if (this.choix > 0 && this.choix <= this.pokemons.size()) {
            this.pcsDeroulementTournoi.firePropertyChange("confirmerPokemon", null, null);
            if (this.valider) {
                this.vosDresseur.getDresseur(this.dresseurEnCour-1).ajouterPokemon(this.pokemons.getPokemon(this.choix-1));
                this.pokemonEnCour++;
            }
        } else if (this.choix == 0) {
            if (this.pokemonEnCour > 0 && this.vosDresseur.getDresseur(this.dresseurEnCour-1).getEquipe().aPokemon(this.pokemonEnCour-1)) {
                this.vosDresseur.getDresseur(this.dresseurEnCour-1).getEquipe().enleverPokemon(this.pokemonEnCour-1);
            }
            this.pokemonEnCour--;
        }
    }
    
    public void terminer () {
        /*ListeDeDresseur dresseurs = (ListeDeDresseur)receveur.readObject();
        ListeDeDresseur dresseursReseau = (ListeDeDresseur)receveur.readObject();
        //this.pcsDeroulementTournoi.firePropertyChange("confirmerDresseurTournoi", null, null);
        TournoiReseauClient t = new TournoiReseauClient (dresseurs, this.vosDresseur, dresseursReseau, this.socket, this.envoi, this.receveur);
        t.commencerTournoi();*/
    }
    
    public void ajouterEcouteurTournoi(PropertyChangeListener ecouteur) {
        this.pcsDeroulementTournoi.addPropertyChangeListener(ecouteur);
    }
}

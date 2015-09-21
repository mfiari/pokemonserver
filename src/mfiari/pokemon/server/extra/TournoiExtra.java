/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.extra;

import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.server.perso.pokemon.PokemonClassique;
import mfiari.pokemon.server.perso.pokemon.PokemonFinal;
import mfiari.pokemon.server.perso.pokemon.PokemonLegendaire;
import mfiari.pokemon.server.perso.pokemon.PokemonMultiEvolution;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.pokemon.server.demarrage.CreationCapacite;
import mfiari.pokemon.server.demarrage.CreationPerso;
import mfiari.pokemon.server.demarrage.CreationPokemon;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.server.objet.Pokedex;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.DresseurClassique;
import mfiari.pokemon.server.tournoi.Tournoi;
import mfiari.pokemon.server.type.TypeTournoi;
import mfiari.pokemon.server.ville.Terrains;

/**
 *
 * @author mike
 */
public class TournoiExtra extends ControlleurVue {
    
    private TypeTournoi typeTournoi;
    private int nbParticipant;
    private int nbJoueur;
    private boolean valider;
    private ListeDeDresseur dresseurs;
    private ListeDeDresseur dresseursDuTournoi;
    private ListeDeDresseur vosDresseur;
    private int dresseurEnCour;
    private int pokemonEnCour;
    private CreationPokemon creationPokemon;
    private CreationPerso creationPerso;
    private CreationCapacite creationCapacite;
    private ListeDePokemon pokemons;
    private String affichage;
    private int page;
    private int nbPokemonParPage;
    private Pokemon pokemonChoisit;
    
    public TournoiExtra () {
        this.creationPokemon = new CreationPokemon();
        this.creationPerso = new CreationPerso();
    }
    
    public TournoiExtra (TypeTournoi typeTournoi, int nbParticipant, int nbJoueur) {
        this.typeTournoi = typeTournoi;
        this.nbParticipant = nbParticipant;
        this.nbJoueur = nbJoueur;
        this.page = 1;
        this.nbPokemonParPage = 30;
        ListeDePokemon listeDePokemon;
        this.pokemons = new ListeDePokemon(493);
        this.creationCapacite = new CreationCapacite();
        this.creationPokemon = new CreationPokemon();
        this.creationPerso = new CreationPerso();
        listeDePokemon = this.creationPokemon.getListeDePokemon();
        for (int i = 0 ; i < listeDePokemon.size() ; i++) {
            this.pokemons.ajouterPokemon(Pokemon.getInstance(listeDePokemon.getPokemon(i)));
        }
        int nivPokemon = this.getNivPokemonByTypeTournoi();
        this.dresseursDuTournoi = this.creationPerso.getDresseurs(typeTournoi);
        for (int i = 0 ; i < this.pokemons.size() ; i++) {
            this.pokemons.getPokemon(i).changeNiveau(nivPokemon);
        }
        for (int i = 0 ; i < this.dresseursDuTournoi.size() ; i++) {
            EquipePokemon equipe = this.dresseursDuTournoi.getDresseur(i).getEquipe();
            for (int j = 0 ; j < equipe.lenght() ; j++) {
                if (equipe.aPokemon(j)) {
                    equipe.getPokemon(j).changeNiveau(nivPokemon);
                }
            }
        }
    }
    
    private int getNivPokemonByTypeTournoi () {
        int nivPokemon = 50;
        switch (typeTournoi) {
            case liguePokemon :
                nivPokemon = 50;
                break;
            case combat :
                nivPokemon = 50;
                break;
           case superLiguePokemon :
                nivPokemon = 100;
                break;
        }
        return nivPokemon;
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
    
    public Pokemon getPokemonChoisit () {
        return this.pokemonChoisit;
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
    
    public int getPage () {
        return this.page;
    }
    
    public int getNbPokemonParPage () {
        return this.nbPokemonParPage;
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
                Dresseur d = Dresseur.getDresseur(this.dresseursDuTournoi.getDresseur(this.choix -2), true);
                this.dresseurs.ajouterDresseur(d);
                this.vosDresseur.ajouterDresseur(d);
                this.pcsControlleurVue.firePropertyChange("confirmerChoixDresseur", null, null);
                if (!this.valider) {
                    if (!this.vosDresseur.isEmpty() && this.vosDresseur.size() == this.dresseurEnCour) {
                        this.vosDresseur.removeDresseur(this.dresseurEnCour - 1);
                    }
                    if (!this.dresseurs.isEmpty() && this.dresseurs.size() == this.dresseurEnCour) {
                        this.dresseurs.removeDresseur(this.dresseurEnCour - 1);
                    }
                    this.dresseurEnCour--;
                } else {
                    this.vosDresseur.getDresseur(this.dresseurEnCour -1).changerNom(d.getNom() + " J"+this.dresseurEnCour);
                }
            } else if (this.choix == 0 ) {
                if (!this.vosDresseur.isEmpty() && this.vosDresseur.size() == this.dresseurEnCour) {
                    this.vosDresseur.removeDresseur(this.dresseurEnCour - 1);
                }
                if (!this.dresseurs.isEmpty() && this.dresseurs.size() == this.dresseurEnCour) {
                    this.dresseurs.removeDresseur(this.dresseurEnCour - 1);
                }
                this.dresseurEnCour--;
            }
        } while ((this.nbJoueur > this.dresseurEnCour) && (this.dresseurEnCour >= 0));
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
                //this.pokemonEnCour = this.dresseurs.getDresseur(this.dresseurEnCour-1).getEquipe().getNbPokemon();
            } else {
                this.pcsControlleurVue.firePropertyChange("pokemonInssufisant", null, null);
            }
        } else if (this.choix > 0 && this.choix <= this.pokemons.size()) {
            this.pokemonChoisit = this.pokemons.getPokemon(this.choix-1);
            if (this.typeTournoi.acceptePokemon(this.pokemonChoisit)) {
                this.pcsControlleurVue.firePropertyChange("confirmerPokemon", null, null);
                if (this.valider) {
                    this.dresseurs.getDresseur(this.dresseurEnCour-1).ajouterPokemon(this.pokemons.getPokemon(this.choix-1));
                    this.pokemonEnCour++;
                }
            } else {
                this.pcsControlleurVue.firePropertyChange("pokemonNonConforme", null, null);
            }
        } else if (this.choix == 0) {
            if (this.pokemonEnCour > 0 && this.dresseurs.getDresseur(this.dresseurEnCour-1).getEquipe().aPokemon(this.pokemonEnCour-1)) {
                this.dresseurs.getDresseur(this.dresseurEnCour-1).getEquipe().enleverPokemon(this.pokemonEnCour-1);
            }
            this.pokemonEnCour--;
        } else if (this.choix == -1) {
            if (this.page == 1) {
                this.page = this.getPageMax();
            } else {
                this.page--;
            }
        } else if (this.choix == -2) {
            if (this.page == this.getPageMax()) {
                this.page = 1;
            } else {
                this.page++;
            }
        }
    }
    
    private int getPageMax () {
        int division = (this.pokemons.size() / this.nbPokemonParPage);
        if (division * this.nbPokemonParPage == this.pokemons.size()) {
            return division;
        } else {
            return division + 1;
        }
    }
    
    public void terminer () {
        do  {
            int indice;
            while (this.dresseurs.size() < this.nbParticipant) {
                indice = (int) (Math.random() * this.dresseursDuTournoi.size() - 1);
                this.dresseurs.ajouterDresseur(Dresseur.getDresseur(this.dresseursDuTournoi.getDresseur(indice), true));
            }
            this.pcsControlleurVue.firePropertyChange("confirmerDresseurTournoi", null, null);
            if (this.valider) {
                for (int i = 0 ; i < this.vosDresseur.size() ; i++) {
                    this.vosDresseur.getDresseur(i).setPokedex(new Pokedex());
                }
                Tournoi t = new Tournoi (this.dresseurs, this.vosDresseur, Terrains.getTerrain(this.typeTournoi));
                t.commencerTournoi();
            } else {
                while (this.dresseurs.size() > this.vosDresseur.size()) {
                    this.dresseurs.removeDresseur(this.dresseurs.size() -1);
                }
            }
        } while (!this.valider && this.choix != 0);
    }
    
}

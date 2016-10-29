/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.extra;

import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.pokemon.core.list.ListeDeDresseur;
import mfiari.pokemon.core.list.ListeDePokemon;
import mfiari.pokemon.server.combat.Combat;
import mfiari.pokemon.server.demarrage.CreationCapacite;
import mfiari.pokemon.server.demarrage.CreationPerso;
import mfiari.pokemon.server.demarrage.CreationPokemon;
import mfiari.pokemon.core.objet.Pokedex;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.core.perso.dresseur.DresseurClassique;
import mfiari.pokemon.core.perso.pokemon.EquipePokemon;
import mfiari.pokemon.core.perso.pokemon.Pokemon;
import mfiari.pokemon.core.ville.Terrains;

/**
 *
 * @author mike
 */
public class DuelExtra extends ControlleurVue {
    

    private boolean valider;
    private ListeDeDresseur dresseurs;
    private int pokemonEnCour;
    private ListeDePokemon pokemons;
    private String affichage;
    private int page;
    private int nbPokemonParPage;
    private Pokemon pokemonChoisit;
    private Dresseur DresseurPerso;
    private Dresseur DresseurAdv;
    
    public DuelExtra () {
        this.page = 1;
        this.nbPokemonParPage = 30;
        ListeDePokemon listeDePokemon;
        CreationCapacite creationCapacite = new CreationCapacite();
        CreationPokemon creationPokemon = new CreationPokemon();
        CreationPerso creationPerso = new CreationPerso();
        listeDePokemon = creationPokemon.getListeDePokemon();
        this.pokemons = new ListeDePokemon(listeDePokemon.size());
        this.DresseurPerso = null;
        this.DresseurAdv = null;
        for (int i = 0 ; i < listeDePokemon.size() ; i++) {
            this.pokemons.ajouterPokemon(Pokemon.getInstance(listeDePokemon.getPokemon(i)));
        }
        int nivPokemon = 50;
        for (int i = 0 ; i < this.pokemons.size() ; i++) {
            this.pokemons.getPokemon(i).changeNiveau(nivPokemon);
        }
        this.dresseurs = creationPerso.getDresseurs();
        for (int i = 0 ; i < this.dresseurs.size() ; i++) {
            EquipePokemon equipe = this.dresseurs.getDresseur(i).getEquipe();
            for (int j = 0 ; j < equipe.lenght() ; j++) {
                if (equipe.aPokemon(j)) {
                    equipe.getPokemon(j).changeNiveau(nivPokemon);
                }
            }
        }
    }
    
    public String getAffichage () {
        return this.affichage;
    }
    
    public Dresseur getDresseurEnCour () {
        if (this.DresseurAdv == null && this.DresseurPerso != null) {
            return this.DresseurPerso;
        } else if (this.DresseurAdv != null) {
            return this.DresseurAdv;
        }
        return null;
    }
    
    public Pokemon getPokemonEnCour () {
        if (this.DresseurAdv == null && this.DresseurPerso != null) {
            return this.DresseurPerso.getEquipe().getPokemon(this.pokemonEnCour-1);
        } else if (this.DresseurAdv != null) {
            return this.DresseurAdv.getEquipe().getPokemon(this.pokemonEnCour-1);
        }
        return null;
    }
    
    public Pokemon getPokemonChoisit () {
        return this.pokemonChoisit;
    }
    
    public ListeDePokemon getPokemons () {
        return this.pokemons;
    }
    
    public ListeDeDresseur getDresseurs () {
        return this.dresseurs;
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
        this.pokemonEnCour = 0;
        do {
            this.pcsControlleurVue.firePropertyChange("choixDresseur", null, null);
            if (this.DresseurPerso == null) {
                if (this.choix == 1 ) {
                    this.pokemonEnCour = 0;
                    this.DresseurPerso = new DresseurClassique();
                    this.DresseurPerso.changerNom("J1");
                    this.DresseurPerso.setEquipe(new EquipePokemon(6));
                    do {
                        this.choixPokemon();
                    } while ((this.choix != 500 && this.pokemonEnCour < 6 && this.pokemonEnCour >= 0) || (this.choix == 500 && this.pokemonEnCour < 1));
                    if (this.pokemonEnCour < 0) {
                        this.DresseurPerso = null;
                    }
                } else if (this.choix >= 2 && this.choix <= this.dresseurs.size() +1) {
                    this.DresseurPerso = Dresseur.getDresseur(this.dresseurs.getDresseur(this.choix -2), true);
                    this.pcsControlleurVue.firePropertyChange("confirmerChoixDresseur", null, null);
                    if (!this.valider) {
                        this.DresseurPerso = null;
                    }
                } else if (this.choix == 0 ) {
                    this.DresseurPerso = null;
                }
            } else {
                if (this.choix == 1 ) {
                    this.pokemonEnCour = 0;
                    this.DresseurAdv = new DresseurClassique();
                    this.DresseurAdv.changerNom("J2");
                    this.DresseurAdv.setEquipe(new EquipePokemon(6));
                    do {
                        this.choixPokemon();
                    } while ((this.choix != 500 && this.pokemonEnCour < 6 && this.pokemonEnCour >= 0) || (this.choix == 500 && this.pokemonEnCour < 1));
                    if (this.pokemonEnCour < 0) {
                        this.DresseurAdv = null;
                    }
                } else if (this.choix >= 2 && this.choix <= this.dresseurs.size() +1) {
                    this.DresseurAdv = Dresseur.getDresseur(this.dresseurs.getDresseur(this.choix -2), true);
                    this.pcsControlleurVue.firePropertyChange("confirmerChoixDresseur", null, null);
                    if (!this.valider) {
                        this.DresseurAdv = null;
                    }
                } else if (this.choix == 0 ) {
                    this.DresseurAdv = null;
                }
            }
        } while ((this.DresseurPerso == null || this.DresseurAdv == null));
        if (this.DresseurPerso != null && this.DresseurAdv != null) {
            this.terminer();
        }
    }
    
    public void setValider (boolean choix) {
        this.valider = choix;
    }
    
    public void choixPokemon() {
        this.pcsControlleurVue.firePropertyChange("choixPokemon", null, null);
        if (this.choix == 500) {
            if (this.getDresseurEnCour().getEquipe().getNbPokemon() >= 1) {
                //this.pokemonEnCour = this.dresseurs.getDresseur(this.dresseurEnCour-1).getEquipe().getNbPokemon();
            } else {
                this.pcsControlleurVue.firePropertyChange("pokemonInssufisant", null, null);
            }
        } else if (this.choix > 0 && this.choix <= this.pokemons.size()) {
            this.pokemonChoisit = this.pokemons.getPokemon(this.choix-1);
            this.pcsControlleurVue.firePropertyChange("confirmerPokemon", null, null);
            if (this.valider) {
                this.getDresseurEnCour().ajouterPokemon(this.pokemons.getPokemon(this.choix-1));
                this.pokemonEnCour++;
            }
        } else if (this.choix == 0) {
            if (this.pokemonEnCour > 0 && this.getDresseurEnCour().getEquipe().aPokemon(this.pokemonEnCour-1)) {
                this.getDresseurEnCour().getEquipe().enleverPokemon(this.pokemonEnCour-1);
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
        this.DresseurPerso.setPokedex(new Pokedex(500));
        this.DresseurAdv.setPokedex(new Pokedex(500));
        Combat combat = new Combat(Terrains.terrainNormal);
        //combat.combatSimple(this.DresseurPerso, this.DresseurAdv);
    }
    
}
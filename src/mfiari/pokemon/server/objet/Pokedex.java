/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import java.io.Serializable;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.server.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class Pokedex extends ControlleurVue implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private ListeDePokemon pokemons;
    private boolean capture[];
    private boolean pokedex[];
    private String nom;
    private int nbPokemonvue;
    private int nbPokemonPokedex;
    private int nbPokemonCapture;
    private int pagePokedexMenu;
    private int pagePokedexCombat;
    private Pokemon pokemonCombat;
    
    public Pokedex () {
        this(500);
    }
    
    public Pokedex (int nbPokemon) {
        this(nbPokemon, false);
    }
    
    public Pokedex (int nbPokemon, boolean loadVue) {
        super(loadVue);
        this.pokemons = new ListeDePokemon (nbPokemon);
        this.capture = new boolean [nbPokemon];
        for (int i = 0 ; i < nbPokemon ; i++) {
            this.capture[i] = false;
        }
        this.pokedex = new boolean [nbPokemon];
        for (int i = 0 ; i < nbPokemon ; i++) {
            this.pokedex[i] = false;
        }
        this.nbPokemonvue = 0;
        this.nbPokemonPokedex = 0;
        this.nbPokemonCapture = 0;
        this.nom = "pokedex";
        this.pagePokedexMenu = 1;
        this.pagePokedexCombat = 1;
    }
    
    public Pokedex (int nbPokemon, String nom) {
        this(nbPokemon);
        this.nom = nom;
    }
    
    public int getPagePokedexMenu () {
        return this.pagePokedexMenu;
    }
    
    public int getPagePokedexCombat () {
        return this.pagePokedexCombat;
    }
    
    public Pokemon getPokemonCombat () {
        return this.pokemonCombat;
    }

    public void setPagePokedex(int page) {
        if (page < 1) {
            this.pagePokedexCombat = 4;
        } else if (page > 4) {
            this.pagePokedexCombat = 1;
        } else {
            this.pagePokedexCombat = page;
        }
    }
    
    public void pokedex () {
        do {
            System.out.println("afficherPokedex");
            this.pcsControlleurVue.firePropertyChange("afficherPokedex", null, null);
            if (this.choix > -3 && this.choix != 0 && this.choix <= this.size()) {
                if (this.choix == -1) {
                    System.out.println("page prec");
                    if (this.pagePokedexMenu != 1) {
                        this.pagePokedexMenu--;
                    }
                } else if (this.choix == -2) {
                    System.out.println("page suiv");
                    if (this.pagePokedexMenu != this.size() / 30) {
                        this.pagePokedexMenu++;
                    }
                } else if (this.aPokemon(this.choix -1)) {
                    this.pokemonCombat = this.getPokemon(this.choix -1);
                    do {
                        System.out.println("afficherPokemon");
                        this.pcsControlleurVue.firePropertyChange("afficherPokemon", null, null);
                        if (this.choix == -1) {
                            System.out.println("afficherPokemon suiv");
                            this.setPagePokedex(this.pagePokedexCombat + 1);
                        } else if (this.choix == -2) {
                            System.out.println("afficherPokemon prec");
                            this.setPagePokedex(this.pagePokedexCombat - 1);
                        }
                    } while (this.choix != -3);
                }
            }
        } while (this.choix != 0);
        this.supprimerTousEcouteur();
    }
    
    public void pokedexCombat (Pokemon pkmn) {
        this.pokemonCombat = pkmn;
        do {
            this.pcsControlleurVue.firePropertyChange("afficherPokedexCombat", null, null);
        } while (this.choix != 0);
    }
    
    public void VoirPokemon (Pokemon pk) {
        if (this.pokemons.getPokemon(pk.getNumero() -1) == null) {
            this.pokemons.remplacerPokemon(pk, pk.getNumero() -1);
            this.nbPokemonvue++;
        }
    }
    
    public void pokedexPokemon (Pokemon pk) {
        this.VoirPokemon(pk);
        if (!this.pokedex[pk.getNumero() -1]) {
            this.pokedex[pk.getNumero() -1] = true;
            this.nbPokemonPokedex++;
        }
    }
    
    public void capturePokemon (Pokemon pk) {
        this.pokedexPokemon(pk);
        if (!this.capture[pk.getNumero() -1]) {
            this.capture[pk.getNumero() -1] = true;
            this.nbPokemonCapture++;
        }
    }
    
    public boolean aPokemon (int i) {
        return this.pokemons.getPokemon(i) != null;
    }
    
    public boolean estPokedex (int i) {
        return this.pokedex[i];
    }
    
    public boolean estCapture (int i) {
        return this.capture[i];
    }
    
    public Pokemon getPokemon (int i) {
        return this.pokemons.getPokemon(i);
    }
    
    public String affichePokemon (int i) {
        String affichage;
        if (this.pokemons.getPokemon(i) == null) {
            affichage = ".....";
        } else {
            affichage = this.pokemons.getPokemon(i).getNom();
            if (this.capture[i]) {
                affichage += "   *";
            }
        }
        return affichage;
    }
    
    public int getNbPokemonVue () {
        return this.nbPokemonvue;
    }
    
    public int getNbPokemonCapture () {
        return this.nbPokemonCapture;
    }
    
    public int size () {
        return this.pokemons.getNbPokemonMax();
    }
    
    @Override
    public String toString () {
        return this.nom;
    }
    
}

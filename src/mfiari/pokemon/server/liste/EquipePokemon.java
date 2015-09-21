/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.liste;

import java.io.Serializable;
import mfiari.pokemon.server.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class EquipePokemon implements Serializable {
    
    private static final long serialVersionUID = 354054054059L;
    
    /* Ce sont les pokemons que le dresseurs possède sur lui */
    private Pokemon[] pokemons;
    /* Ce sont les pokemons que le dresseur dépose lors d'un tournoi */
    private Pokemon[] pokemonStocke;
    int nbPokemon;
    
    public EquipePokemon () {
        this(6);
    }
    
    public EquipePokemon (int nbPokemon) {
        this.pokemons = new Pokemon[nbPokemon];
        for (int i=0; i<this.pokemons.length; i++) {
            this.pokemons[i] = null;
        }
        this.nbPokemon = 0;
        this.pokemonStocke = new Pokemon[10];
    }
    
    public EquipePokemon (Pokemon... pokemons) {
        this.pokemons = pokemons;
        this.nbPokemon = this.pokemons.length;
        this.pokemonStocke = new Pokemon[10];
    }
    
    public EquipePokemon (EquipePokemon equipe) {
        this.pokemons = new Pokemon[equipe.pokemons.length];
        System.arraycopy(equipe.pokemons, 0, this.pokemons, 0, equipe.pokemons.length);
        this.pokemonStocke = new Pokemon[equipe.pokemonStocke.length];
        System.arraycopy(equipe.pokemonStocke, 0, this.pokemonStocke, 0, equipe.pokemonStocke.length);
        this.nbPokemon = equipe.nbPokemon;
    }
    
    public void modifieTailleListePokemon (int newTaille) {
        for (Pokemon pokemon : this.pokemons) {
            if (pokemon != null) {
                this.setPokemonStocker(pokemon);
            }
        }
        this.pokemons = new Pokemon[newTaille];
        this.nbPokemon = 0;
    }
    
    public boolean ajouterPokemon (Pokemon pk) {
        if (this.nbPokemon < pokemons.length) {
            this.insererPokemon(pk);
            this.nbPokemon++;
            return true;
        }
        return false;
    }
    
    public void ajouterPokemon (Pokemon pk, int i) {
        System.out.println("i : " + i + " length : " + this.pokemons.length);
        if (i >= 0 && i < this.pokemons.length) {
            if (this.pokemons[i] == null) {
                this.nbPokemon++;
            }
            this.pokemons[i] = pk;
            System.out.println(this.pokemons[i].getNom());
        }
    }
    
    public Pokemon enleverPokemon (int i) {
        Pokemon pk;
        if (i >= 0 && i < this.pokemons.length) {
            pk = this.pokemons[i];
            this.pokemons[i] = null;
            this.nbPokemon--;
        } else {
            pk = null;
        }
        return pk;
    }
    
    public boolean enleverPokemon (Pokemon pk) {
        for (int i = 0 ; i < this.pokemons.length ; i++) {
            if (pk.equals(this.pokemons[i])) {
                this.pokemons[i] = null;
                this.nbPokemon--;
                return true;
            }
        }
        return false;
    }
    
    public void enleverTousPokemon () {
        for (int i = 0 ; i < this.pokemons.length ; i++) {
            if (this.pokemons[i] != null) {
                this.setPokemonStocker(this.pokemons[i]);
            }
            this.pokemons[i] = null;
        }
        this.nbPokemon = 0;
    }
    
    public Pokemon enleverPokemonStocker (int i) {
        Pokemon pk;
        if (i >= 0 && i < this.pokemonStocke.length) {
            pk = this.pokemonStocke[i];
            this.pokemonStocke[i] = null;
        } else {
            pk = null;
        }
        return pk;
    }
    
    private void insererPokemon (Pokemon pk) {
        for (int i = 0; i <this.pokemons.length ; i++) {
            if (this.pokemons[i] == null) {
                this.pokemons[i] = pk;
                break;
            }
        }
    }
    
    public boolean aPokemon (int i) {
        return this.getPokemon(i) != null;
    }
    
    public void soin () {
        for (int i = 0; i <this.pokemons.length ; i++) {
            if (this.pokemons[i] != null) {
                this.pokemons[i].soin();
            }
        }
    }
    
    public boolean aPokemon (Pokemon pk) {
        for (int i = 0; i <this.pokemons.length ; i++) {
            if (this.pokemons[i] != null) {
                if (this.pokemons[i].equals(pk)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Pokemon getPokemon (int i) {
        if (i >= 0 && i < this.pokemons.length) {
            return this.pokemons[i];
        } else {
            return null;
        }
    }
    
    public Pokemon getPokemon() {
        for (int i=0 ; i<this.pokemons.length ; i++) {
            if (this.pokemons[i] != null && this.pokemons[i].getPv() > 0) {
                return this.pokemons[i];
            }
        }
        return null;
    }
    
    public Pokemon getPokemonStocke (int i) {
        if (i >= 0 && i < this.pokemonStocke.length) {
            return this.pokemonStocke[i];
        } else {
            return null;
        }
    }
    
    public void setPokemonStocker(Pokemon pk) {
        int indice = 0;
        while (indice < this.pokemonStocke.length && this.pokemonStocke[indice] != null) {
            indice++;
        }
        if (indice < this.pokemonStocke.length) {
            this.pokemonStocke[indice] = pk;
        }
    }
    
    public int getNbPokemonApte () {
        int nbApte = 0;
        for (int i=0 ; i<this.pokemons.length ; i++) {
            if (this.pokemons[i] != null && this.pokemons[i].getPv() > 0) {
                nbApte++;
            }
        }
        return nbApte;
    }
    
    public boolean aPokemonStocker (int i) {
        if (i >= 0 && i < this.pokemonStocke.length) {
            return this.pokemonStocke[i] != null;
        } else {
            return false;
        }
    }
    
    public int lenght () {
        return this.pokemons.length;
    }
    
    public int getNbPokemon () {
        return this.nbPokemon;
    }
    
    public int size() {
        return this.pokemonStocke.length;
    }
    
    public boolean auComplet () {
        return this.nbPokemon ==  this.pokemons.length;
    }
}

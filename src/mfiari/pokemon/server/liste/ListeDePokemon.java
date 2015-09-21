/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.liste;

import java.io.Serializable;
import java.util.ArrayList;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.core.ville.Environnement;


/**
 *
 * @author mike
 */
public class ListeDePokemon implements Serializable {
    
    private static final long serialVersionUID = 1L;
    /* Ce sont les pokemons que le dresseurs possède sur lui */
    private ArrayList<Pokemon> pokemons;
    private ArrayList<Environnement> environnements;
    private ArrayList<Integer> pourcentage;
    int nbPokemonMax;
    
    public ListeDePokemon () {
        this.pokemons = new ArrayList<>();
        this.environnements = new ArrayList<>();
        this.pourcentage = new ArrayList<>();
        this.nbPokemonMax = 50;
    }
    
    public ListeDePokemon (int nbPokemon) {
        this();
        this.nbPokemonMax = nbPokemon;
    }
    
    public void modifieTailleListePokemon (int newTaille) {
        this.nbPokemonMax = newTaille;
    }
    
    public boolean ajouterPokemon (Pokemon pk) {
        return this.ajouterPokemon(pk, Environnement.haute_herbe, 0);
    }
    
    public boolean ajouterPokemon (Pokemon pk, Environnement environnement, int pourcentage) {
        if (this.nbPokemonMax > pokemons.size()) {
            this.insererPokemon(pk);
            this.environnements.add(environnement);
            this.pourcentage.add(pourcentage);
            return true;
        }
        return false;
    }
    
    public void ajouterPokemon (Pokemon pk, int i) {
        if (i > this.pokemons.size()) {
            for (int j = 0 ; j <= i ; j++) {
                if (this.getPokemon(j) == null) {
                    this.pokemons.add(null);
                }
            }
        }
        this.pokemons.add(i, pk);
    }
    
    public void remplacerPokemon (Pokemon pk, int i) {
        if (i >= this.pokemons.size()) {
            for (int j = 0 ; j <= i ; j++) {
                if (this.getPokemon(j) == null) {
                    this.pokemons.add(null);
                }
            }
        }
        this.pokemons.set(i, pk);
    }
    
    public Pokemon enleverPokemon (int i) {
        return this.pokemons.remove(i);
    }
    
    private void insererPokemon (Pokemon pk) {
        this.pokemons.add(pk);
    }
    
    public boolean aPokemon (int i) {
        return this.pokemons.size() > i && this.pokemons.get(i) != null;
    }
    
    public Pokemon getPokemon (int i) {
        if (i>=0 && i < this.pokemons.size()) {
            return this.pokemons.get(i);
        }
        return null;
    }
    
    public Pokemon getPokemonByNumero (int numero) {
        for (int i = 0 ; i < this.pokemons.size() ; i++) {
            if (this.pokemons.get(i).getNumero() == numero) {
                return this.pokemons.get(i);
            }
        }
        return null;
    }
    
    public Pokemon getPokemonByEnvironnementAndPourcentage (Environnement environnement, int pourcentage) {
        int pourcentageApparition = 75;
        if (pourcentage >= pourcentageApparition) {
            int indice = 0;
            int newPourcentage = pourcentageApparition;
            while (indice < this.pokemons.size()) {
                if (this.environnements.get(indice).equals(environnement)) {
                    if (pourcentage <= ((this.pourcentage.get(indice) * (100 - pourcentageApparition)) / 100) + newPourcentage) {
                        return this.pokemons.get(indice); 
                    }
                    newPourcentage += (this.pourcentage.get(indice) * (100 - pourcentageApparition)) / 100;
                }
                indice++;
            }
        }
        return null;
    }
    
    public Pokemon getPokemon() {
        return null;
    }
    
    public int getNbPokemonMax () {
        return this.nbPokemonMax;
    }
    
    public int size () {
        return this.pokemons.size();
    }
    
    public int getNbPokemonByEnvironnement (Environnement environnement) {
        int nbPokemon = 0;
        int indice = 0;
        while (indice < this.pokemons.size()) {
            if (this.environnements.get(indice).equals(environnement)) {
                nbPokemon++;
            }
            indice++;
        }
        return nbPokemon;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.demarrage;

import mfiari.pokemon.server.perso.pokemon.PokemonMultiEvolution;
import mfiari.pokemon.server.perso.pokemon.PokemonFinal;
import mfiari.pokemon.server.perso.pokemon.PokemonClassique;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.lib.game.liste.ListeDeGens;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.type.TypeTournoi;


/**
 *
 * @author mike
 */
public class CreationPerso {

    private final ListeDeDresseur dresseurs;
    private ListeDeDresseur dresseursCombat;
    
    private ListeDeGens gens;
    
    public CreationPerso () {
        this.dresseurs = new ListeDeDresseur();
    }

    public CreationPerso (Demarrage demarrage) {
        this.dresseurs = new ListeDeDresseur();
    }
    
    public ListeDeDresseur getDresseurs () {
        return this.dresseurs;
    }
    
    public ListeDeGens getGens () {
        return this.gens;
    }
    
    public ListeDeDresseur getDresseurs (TypeTournoi typeTournoi) {
        switch (typeTournoi) {
            case combat :
                return this.dresseursCombat;
            default :
               return this.dresseurs;
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.demarrage;

import mfiari.pokemon.server.liste.ListeDePokemon;

/**
 *
 * @author mike
 */
public class CreationPokemon {
    
    private final ListeDePokemon listeDePokemon;
    
    public CreationPokemon () {
        this.listeDePokemon = new ListeDePokemon(500);
    }
    
    public ListeDePokemon getListeDePokemon() {
        return this.listeDePokemon;
    }
    
}

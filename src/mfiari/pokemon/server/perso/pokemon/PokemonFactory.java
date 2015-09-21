/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.perso.pokemon;

import mfiari.pokemon.server.capacite.CapaciteContreCoup;
import mfiari.pokemon.server.capacite.CapaciteEtat;
import mfiari.pokemon.server.capacite.CapaciteMultiple;
import mfiari.pokemon.server.capacite.CapaciteSimple;
import mfiari.pokemon.server.capacite.CapaciteSoin;
import mfiari.pokemon.server.capacite.CapaciteStat;
import mfiari.pokemon.server.capacite.Capacites;
import mfiari.pokemon.core.stat.CourbeParabolique;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class PokemonFactory {
    
    public Pokemon createPokemon (Pokemons pokemons) {
        switch (pokemons) {
            default:
                return null;
        }
        
    }
    
}

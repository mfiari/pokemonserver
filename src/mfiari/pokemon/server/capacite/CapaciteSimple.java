/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.capacite;

import mfiari.pokemon.core.capacite.PokemonVise;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class CapaciteSimple extends Capacite {
    
    private static final long serialVersionUID = 1L;
    
    public CapaciteSimple () {
        super();
    }
    
    public CapaciteSimple (String nom, Type type, int force, int prec, int pp, Attribut classe) {
        super(nom, type, force, prec, pp, classe);
    }

    public CapaciteSimple (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
    }

    public CapaciteSimple (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, int priorite) {
        super(nom, type, force, prec, pp, classe, pokemonVise, priorite);
    }

    public CapaciteSimple (CapaciteSimple c) {
        super(c);
    }
    
}

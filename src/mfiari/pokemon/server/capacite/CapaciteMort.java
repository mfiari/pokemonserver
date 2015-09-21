/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.capacite;

import mfiari.pokemon.core.capacite.PokemonVise;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class CapaciteMort extends Capacite {
    
    private static final long serialVersionUID = 1L;
    
    private int pourcentagePvEnlever;
    
    public CapaciteMort () {
        super();
    }
    
    public CapaciteMort (String nom, Type type, int force, int prec, int pp, Attribut classe) {
        super(nom, type, force, prec, pp, classe);
        this.pourcentagePvEnlever = 100;
    }
    
    public CapaciteMort (String nom, Type type, int force, int prec, int pp, Attribut classe, int pourCent) {
        super(nom, type, force, prec, pp, classe);
        this.pourcentagePvEnlever = pourCent;
    }

    public CapaciteMort (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.pourcentagePvEnlever = 100;
    }

    public CapaciteMort (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, int pourCent) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.pourcentagePvEnlever = pourCent;
    }

    public CapaciteMort (CapaciteMort c) {
        super(c);
        this.pourcentagePvEnlever = c.pourcentagePvEnlever;
    }
    
    public double getDegat (Pokemon pk) {
        return (pk.getPv() * this.pourcentagePvEnlever) /100;
    }
}

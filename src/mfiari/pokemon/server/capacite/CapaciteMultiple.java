/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.capacite;

import mfiari.pokemon.core.capacite.Etat;
import mfiari.pokemon.core.capacite.PokemonVise;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class CapaciteMultiple extends Capacite {
    
    private static final long serialVersionUID = 1L;
    
    private int nbCoup;
    private boolean fixe;
    private boolean tour;
    private Etat etatRetour;
    
    public CapaciteMultiple () {
        super();
    }
    
    public CapaciteMultiple (String nom, Type type, int force, int prec, int pp, Attribut classe, int nbCoup, boolean fixe, boolean tour) {
        super(nom, type, force, prec, pp, classe);
        this.nbCoup = nbCoup;
        this.fixe = fixe;
    }
    
    public CapaciteMultiple (String nom, Type type, int force, int prec, int pp, Attribut classe, int nbCoup, boolean fixe, boolean tour, Etat etat) {
        super(nom, type, force, prec, pp, classe);
        this.nbCoup = nbCoup;
        this.fixe = fixe;
        this.tour = tour;
        this.etatRetour = etat;
    }

    public CapaciteMultiple (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, int nbCoup, boolean fixe, 
            boolean tour) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.nbCoup = nbCoup;
        this.fixe = fixe;
    }

    public CapaciteMultiple (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, int nbCoup, boolean fixe, 
            boolean tour, Etat etat) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.nbCoup = nbCoup;
        this.fixe = fixe;
        this.nbCoup = nbCoup;
        this.fixe = fixe;
    }

    public CapaciteMultiple (CapaciteMultiple c) {
        super(c);
        this.nbCoup = c.nbCoup;
        this.fixe = c.fixe;
        this.tour = c.tour;
        this.etatRetour = c.etatRetour;
    }
    
    public boolean parTour () {
        return this.tour;
    }
    
    public int getNbCoup () {
        if (this.fixe) {
            return this.nbCoup;
        }
        return ((int) (Math.random() * this.nbCoup + 1));
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.capacite;

import mfiari.pokemon.core.capacite.Etat;
import mfiari.pokemon.core.capacite.PokemonVise;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class CapaciteSoin extends Capacite {
    
    private static final long serialVersionUID = 1L;
    
    int pourcentagePv;
    Etat[] etats;
    
    public CapaciteSoin () {
        super();
        this.pourcentagePv = 0;
        this.etats = new Etat[Etat.values().length];
    }
    
    public CapaciteSoin (String nom, Type type, int force, int prec, int pp, Attribut classe) {
        super(nom, type, force, prec, pp, classe);
        this.pourcentagePv = 0;
        this.etats = new Etat[Etat.values().length];
    }
    
    public CapaciteSoin (String nom, Type type, int force, int prec, int pp, Attribut classe, int pourCent) {
        super(nom, type, force, prec, pp, classe);
        this.pourcentagePv = pourCent;
        this.etats = new Etat[Etat.values().length];
    }

    public CapaciteSoin (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.pourcentagePv = 0;
        this.etats = new Etat[Etat.values().length];
    }

    public CapaciteSoin (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, int pourCent) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.pourcentagePv = pourCent;
        this.etats = new Etat[Etat.values().length];
    }

    public CapaciteSoin (CapaciteSoin c) {
        super(c);
        this.pourcentagePv = c.pourcentagePv;
        this.etats = c.etats;
    }
    
    public void ajouterEtat (Etat e) {
        int indice = 0;
        while (indice < this.etats.length && this.etats[indice] != null) {
            indice++;
        }
        if (indice < this.etats.length) {
            this.etats[indice] = e;
        }
    }
    
    public double getPvGagner (Pokemon pk) {
        return (pk.getPvMax() * this.pourcentagePv) / 100;
    }
    
    public Etat[] getEtats () {
        return this.etats;
    }
}

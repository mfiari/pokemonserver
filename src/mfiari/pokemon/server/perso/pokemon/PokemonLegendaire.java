/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso.pokemon;

import mfiari.lib.game.personnage.Stat;
import mfiari.pokemon.server.capacite.Capacite;
import mfiari.pokemon.core.capacite.CapaciteSpe;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public abstract class PokemonLegendaire extends Pokemon {
    
   private CapaciteSpe capaciteSpe2;
    
    public PokemonLegendaire(String nom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, 
            double pourcentageMale, int nbPasAvantEclosion, String typePokemon, int pv, int att, int def, int attSpe, int defSpe, int vit, int esq, 
            int prec, int expBase, Stat.CourbeExperience courbeExperience, Capacite cap, String description) {
        super(nom, numero, type1, type2, taille, poids, pourcentageMale, nbPasAvantEclosion, typePokemon, pv, att, def, attSpe, defSpe, 
                vit, esq, prec, expBase, cap, description, tauxCapture, courbeExperience);
    }
    
    public PokemonLegendaire (PokemonLegendaire pk) {
        super(pk);
        this.capaciteSpe2 = pk.capaciteSpe2;
    }

    public CapaciteSpe getCapaciteSpe2() {
        return capaciteSpe2;
    }

    public void setCapaciteSpe2(CapaciteSpe capaciteSpe2) {
        this.capaciteSpe2 = capaciteSpe2;
    }

    @Override
    public boolean evolue() {
        return false;
    }

    @Override
    public Pokemon getPokemonEvolution() {
        return null;
    }
    
}

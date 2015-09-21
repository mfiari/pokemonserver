/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso.pokemon;

import mfiari.lib.game.personnage.Stat;
import mfiari.pokemon.server.capacite.Capacite;
import mfiari.pokemon.core.capacite.CapaciteSpe;
import mfiari.pokemon.core.stat.CourbeParabolique;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.ville.Endroit;
import mfiari.pokemon.core.ville.Environnement;

/**
 *
 * @author mike
 */
public class PokemonFinal extends Pokemon {
    
    private static final long serialVersionUID = 7556264584391514945L;
    
    public PokemonFinal(String nom, String surnom, int numero, Type type1, Type type2, double taille, double poids, int pourcentageMale, 
            String typePokemon, int niveau, int exp, int expNivSuiv, int pv, int att, int def, int attSpe, int defSpe, int vit, int esq, int prec, 
            CapaciteSpe capSpe, Capacite cap, String description) {
        this(nom, surnom, numero, type1, type2, taille, poids, 45, pourcentageMale, 0, typePokemon, niveau, pv, att, def, attSpe, defSpe, vit,
                esq, prec, capSpe, cap, description);
    }
    
    public PokemonFinal(String nom, String surnom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, int pourcentageMale, 
            int nbPasAvantEclosion, String typePokemon, int niveau, int pv, int att, int def, int attSpe, int defSpe, int vit, int esq, int prec, 
            CapaciteSpe capSpe, Capacite cap, String description) {
        this(nom, surnom, numero, type1, type2, taille, poids, tauxCapture, pourcentageMale, nbPasAvantEclosion, typePokemon, niveau, pv, att, def, 
                attSpe, defSpe, vit, esq, prec, 208, capSpe, cap, description);
    }
    
    public PokemonFinal(String nom, String surnom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, int pourcentageMale, 
            int nbPasAvantEclosion, String typePokemon, int niveau, int pv, int att, int def, int attSpe, int defSpe, int vit, int esq, int prec, 
            int expBase, CapaciteSpe capSpe, Capacite cap, String description) {
        super(nom, numero, type1, type2, taille, poids, pourcentageMale, nbPasAvantEclosion, typePokemon, pv, att, def, attSpe, defSpe, 
                vit, esq, prec, expBase, cap, description, tauxCapture, new CourbeParabolique());
    }
    
    public PokemonFinal(String nom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, 
            double pourcentageMale, int nbPasAvantEclosion, String typePokemon, int pv, int att, int def, int attSpe, int defSpe, int vit, int esq, 
            int prec, int expBase, Stat.CourbeExperience courbeExperience, Capacite cap, String description) {
        super(nom, numero, type1, type2, taille, poids, pourcentageMale, nbPasAvantEclosion, typePokemon, pv, att, def, attSpe, defSpe, 
                vit, esq, prec, expBase, cap, description, tauxCapture, courbeExperience);
    }
    
    public PokemonFinal (PokemonFinal pk) {
        super(pk);
    }
    
    @Override
    public void ajouterEndroits (Endroit e, int nivMin, int nivMax, Environnement environnement, int pourcentage) {
        for (int i = nivMin ; i<=nivMax ; i++) {
            PokemonFinal pk = new PokemonFinal(this);
            pk.changeNiveau(i);
            e.ajouterPokemon(pk, environnement, (pourcentage/(nivMax - nivMin +1)));
        }
        this.getEndroits().ajouterEndroit(e);
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

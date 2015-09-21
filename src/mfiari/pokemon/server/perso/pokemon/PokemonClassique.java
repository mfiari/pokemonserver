/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso.pokemon;

import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Stat;
import mfiari.pokemon.server.capacite.Capacite;
import mfiari.pokemon.core.capacite.CapaciteSpe;
import mfiari.pokemon.core.stat.CourbeMoyenne;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.ville.Endroit;
import mfiari.pokemon.core.ville.Environnement;

/**
 *
 * @author mike
 */
public class PokemonClassique extends Pokemon {
    
    private Pokemon pokemonEvolution;
    private int niveauEvolution;
    private Objet objetEvolution;
    private static final long serialVersionUID = 1866809807769578508L;
    
    public PokemonClassique(String nom, String surnom, int numero, Type type1, Type type2, double taille, double poids, 
            int pourcentageMale, String typePokemon, int niveau, int exp, int expNivSuiv, int pv, int att, int def, int attSpe, int defSpe, int vit, 
            int esq, int prec, CapaciteSpe capSpe, Capacite cap, int nivEvolution, Objet objetEvolution, Pokemon pk, String description) {
        this(nom, surnom, numero, type1, type2, taille, poids, 45, pourcentageMale, 0, typePokemon, niveau, pv, att, def, attSpe, defSpe, vit, 
            esq, prec, capSpe, cap, nivEvolution, objetEvolution, pk, description);
    }
    
    public PokemonClassique(String nom, String surnom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, 
            int pourcentageMale, int nbPasAvantEclosion, String typePokemon, int niveau, int pv, int att, int def, int attSpe, int defSpe, int vit, 
            int esq, int prec, CapaciteSpe capSpe, Capacite cap, int nivEvolution, Objet objetEvolution, Pokemon pk, String description) {
        this(nom, surnom, numero, type1, type2, taille, poids, tauxCapture, pourcentageMale, nbPasAvantEclosion, typePokemon, niveau, pv, att, def, 
                attSpe, defSpe, vit, esq, prec, 64, capSpe, cap, nivEvolution, objetEvolution, pk, description);
        
    }
    
    public PokemonClassique(String nom, String surnom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, 
            int pourcentageMale, int nbPasAvantEclosion, String typePokemon, int niveau, int pv, int att, int def, int attSpe, int defSpe, int vit, 
            int esq, int prec, int expBase, CapaciteSpe capSpe, Capacite cap, int nivEvolution, Objet objetEvolution, Pokemon pk, String description) {
        super(nom, numero, type1, type2, taille, poids, pourcentageMale, nbPasAvantEclosion, typePokemon, pv, att, def, attSpe, defSpe, 
                vit, esq, prec, expBase, cap, description, tauxCapture, new CourbeMoyenne());
        this.pokemonEvolution = pk;
        this.niveauEvolution = nivEvolution;
        this.objetEvolution = objetEvolution;
        
    }
    
    public PokemonClassique(String nom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, 
            double pourcentageMale, int nbPasAvantEclosion, String typePokemon, int pv, int att, int def, int attSpe, int defSpe, int vit, 
            int esq, int prec, int expBase, Stat.CourbeExperience courbeExperience, Capacite cap, int nivEvolution, 
            Objet objetEvolution, Pokemon pk, String description) {
        super(nom, numero, type1, type2, taille, poids, pourcentageMale, nbPasAvantEclosion, typePokemon, pv, att, def, attSpe, defSpe, 
                vit, esq, prec, expBase, cap, description, tauxCapture, courbeExperience);
        this.pokemonEvolution = pk;
        this.niveauEvolution = nivEvolution;
        this.objetEvolution = objetEvolution;
        
    }
    
    public PokemonClassique (PokemonClassique pk) {
        super(pk);
        this.pokemonEvolution = pk.pokemonEvolution;
        this.niveauEvolution = pk.niveauEvolution;
        this.objetEvolution = pk.objetEvolution;
    }
    
    @Override
    public void ajouterEndroits (Endroit e, int nivMin, int nivMax, Environnement environnement, int pourcentage) {
        for (int i = nivMin ; i<=nivMax ; i++) {
            PokemonClassique pk = new PokemonClassique(this);
            pk.changeNiveau(i);
            e.ajouterPokemon(pk, environnement, (pourcentage/((nivMax - nivMin) +1)));
        }
        this.getEndroits().ajouterEndroit(e);
    }

    public int getNiveauEvolution() {
        return niveauEvolution;
    }

    public void setNiveauEvolution(int niveauEvolution) {
        this.niveauEvolution = niveauEvolution;
    }

    @Override
    public Pokemon getPokemonEvolution() {
        return pokemonEvolution;
    }

    public void setPokemonEvolution(Pokemon pokemonEvolution) {
        this.pokemonEvolution = pokemonEvolution;
    }

    public Objet getObjetEvolution() {
        return objetEvolution;
    }

    public void setObjetEvolution(Objet objetEvolution) {
        this.objetEvolution = objetEvolution;
    }

    @Override
    public boolean evolue() {
        return (this.niveauEvolution > 0 && this.getNiveau() >= this.niveauEvolution && this.objetEvolution == null) /*|| (this.objetEvolution != null  &&)*/ ;
    }
    
}

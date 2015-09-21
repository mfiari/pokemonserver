/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso.pokemon;

import java.util.ArrayList;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Stat;
import mfiari.pokemon.server.capacite.Capacite;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.ville.Endroit;
import mfiari.pokemon.core.ville.Environnement;

/**
 *
 * @author mike
 */
public class PokemonMultiEvolution extends Pokemon {
    
    private static final long serialVersionUID = 3440423097075336313L;
    
    private ArrayList<Pokemon> pokemonEvolution;
    private ArrayList<Integer> niveauEvolution;
    private ArrayList<Objet> objetEvolution;
    
    public PokemonMultiEvolution(String nom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, 
            double pourcentageMale, int nbPasAvantEclosion, String typePokemon, int pv, int att, int def, int attSpe, int defSpe, 
            int vit, int esq, int prec, int expBase, Stat.CourbeExperience courbeExperience, Capacite cap, String description) {
        super(nom, numero, type1, type2, taille, poids, pourcentageMale, nbPasAvantEclosion, typePokemon, pv, att, def, attSpe, defSpe, 
                vit, esq, prec, expBase, cap, description, tauxCapture, courbeExperience);
        this.pokemonEvolution = new ArrayList<>();
        this.niveauEvolution = new ArrayList<>();
        this.objetEvolution = new ArrayList<>();
        
    }
    
    public PokemonMultiEvolution (PokemonMultiEvolution pk) {
        super(pk);
    }
    
    @Override
    public void ajouterEndroits (Endroit e, int nivMin, int nivMax, Environnement environnement, int pourcentage) {
        for (int i = nivMin ; i<=nivMax ; i++) {
            PokemonMultiEvolution pk = new PokemonMultiEvolution(this);
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

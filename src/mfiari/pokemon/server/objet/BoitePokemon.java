/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import java.io.Serializable;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.server.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class BoitePokemon implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private ListeDePokemon boite;
    private String nom;
    
    public BoitePokemon () {
        this.boite = new ListeDePokemon(30);
        this.nom = "boite 1";
    }
    
    public BoitePokemon (String nom) {
        this.boite = new ListeDePokemon(30);
        this.nom = nom;
    }
    
    public String getNom () {
        return this.nom;
    }
    
    public boolean ajouterPokemon (Pokemon pk) {
        return this.boite.ajouterPokemon(pk);
    }
    
    public ListeDePokemon getListePokemon () {
        return this.boite;
    }
    
}

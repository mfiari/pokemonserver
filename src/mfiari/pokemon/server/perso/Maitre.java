/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso;

import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.ville.Endroit;

/**
 *
 * @author mike
 */
public class Maitre extends Dresseur{
    
    private static final long serialVersionUID = 354054054065L;
    
    public Maitre () {
        super();
    }
    
    public Maitre (String nom, int numeroID, int positionX, int positionY, Endroit ville, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, Titre.maitre, orientation);
    }
    
    public Maitre (Maitre maitre) {
        super(maitre);
    }
    
    public Maitre (Maitre maitre, boolean changeNumId) {
        super(maitre, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(600);
        pk.getAttributsExp().setAllNiveau(4);
        pk.getTypeExp().setAllNiveau(4);
        this.getEquipe().ajouterPokemon(pk);
    }
    
}

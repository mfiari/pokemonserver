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
public class Topdresseur extends Dresseur{
    
    public Topdresseur () {
        super();
    }
    
    public Topdresseur (String nom, int numeroID, int positionX, int positionY, Endroit ville, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, Titre.topdresseur, orientation);
    }
    
    public Topdresseur (Topdresseur topdresseur) {
        super(topdresseur);
    }
    
    public Topdresseur (Topdresseur topdresseur, boolean changeNumId) {
        super(topdresseur, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(100);
        pk.getAttributsExp().setAllNiveau(2);
        pk.getTypeExp().setAllNiveau(2);
        this.getEquipe().ajouterPokemon(pk);
    }
    
}

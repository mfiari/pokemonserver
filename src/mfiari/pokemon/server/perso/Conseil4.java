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
public class Conseil4 extends Dresseur{
    
    public Conseil4 () {
        super();
    }
    
    public Conseil4 (String nom, int numeroID, int positionX, int positionY, Endroit ville, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, Titre.conseil4, orientation);
    }
    
    public Conseil4 (Conseil4 dress) {
        super(dress);
    }
    
    public Conseil4 (Conseil4 dress, boolean changeNumId) {
        super(dress, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(400);
        pk.getAttributsExp().setAllNiveau(3);
        pk.getTypeExp().setAllNiveau(3);
        this.getEquipe().ajouterPokemon(pk);
    }
    
}

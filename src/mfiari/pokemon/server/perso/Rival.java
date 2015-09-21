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
public class Rival extends Dresseur{
    
    public Rival () {
        super();
    }
    
    public Rival (String nom, int numeroID, int positionX, int positionY, Endroit ville, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, Titre.rival, orientation);
    }
    
    public Rival (Rival rival) {
        super(rival);
    }
    
    public Rival (Rival rival, boolean changeNumId) {
        super(rival, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(400);
        pk.getAttributsExp().setAllNiveau(3);
        pk.getTypeExp().setAllNiveau(3);
        this.getEquipe().ajouterPokemon(pk);
    }
    
}

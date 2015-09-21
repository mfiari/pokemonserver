/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso;

import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.lib.game.personnage.Sexe;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.ville.Endroit;

/**
 *
 * @author mike
 */
public class DresseurClassique extends Dresseur {
    
    private static final long serialVersionUID = 354054054064L;
    
    public DresseurClassique () {
        super();
    }
    
    public DresseurClassique (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, titre, orientation);
    }
    
    public DresseurClassique (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, Orientation orientation, Sexe sexe) {
        super(nom, numeroID, positionX, positionY, ville, titre, orientation, sexe);
    }
    
    public DresseurClassique (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, int nbPokemon, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, titre, orientation, nbPokemon);
    }
    
    public DresseurClassique (DresseurClassique d) {
        super(d);
    }
    
    public DresseurClassique (DresseurClassique d, boolean changeNumId) {
        super(d, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(105);
        if (!this.getEquipe().ajouterPokemon(pk)) {
            this.getPC().ajouterPokemon(pk);
        }
    }
    
}

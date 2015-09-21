/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.lib.game.position.Orientation;

/**
 *
 * @author mike
 */
public class ArenePkmn extends Batiments {

    public ArenePkmn (String nom, int positionX, int positionY,int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
    }
}

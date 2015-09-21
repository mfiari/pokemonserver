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
public class Grotte extends Batiments {

    public Grotte (String nom, int positionX, int positionY,int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
    }

    public Grotte (String nom, int positionX, int positionY,int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, etageMin, etageMax, orientation, endroitBatiment);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.TypeBatiment;
import mfiari.lib.game.position.Orientation;

/**
 *
 * @author mike
 */
public class Batiment extends Batiments {

    private TypeBatiment type;

    public Batiment (String nom, int positionX, int positionY,int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment, TypeBatiment type) {
        super(nom, positionX, positionY, longueur, largeur, etageMin, etageMax, orientation, endroitBatiment);
        this.type = type;
    }
    
    public TypeBatiment getType() {
        return this.type;
    }

}

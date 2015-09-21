/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Sol;
import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.core.objet.Objet_endroit_pc;
import mfiari.pokemon.server.objet.Objet_endroit_soin;
import mfiari.pokemon.core.objet.Type_objet;

/**
 *
 * @author mike
 */
public class CentrePokemon extends Batiments {
    
    private static final long serialVersionUID = 1L;

    public CentrePokemon (String nom, int positionX, int positionY,int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
        Salle basCentrePokemon = new Salle("rez de chausse centre pokemon", 0, 0, 10, 7, this, 0);
        basCentrePokemon.ajouterObjetEndroit(new Objet_endroit_soin(Type_objet.infirmiere_joel, 0, 5,
                "voulez vous soignez vos pokemon ?"));
        basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 2));
        basCentrePokemon.ajouterObjetEndroit(new Objet_endroit_pc(Type_objet.pc_leo, 0, 9));
        basCentrePokemon.setSol(Sol.carrelage);
    }
}

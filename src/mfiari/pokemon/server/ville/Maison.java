/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Sol;
import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.core.objet.Type_objet;

/**
 *
 * @author mike
 */
public class Maison extends Batiments {

    public Maison (String nom, int positionX, int positionY,int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment, boolean maisonClassqiue) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
        if (maisonClassqiue) {
            Salle basMaison = new Salle("rez de chausse", 0, 0, 10, 7, this, 0);
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
            basMaison.setSol(Sol.bois);
        }
    }

}

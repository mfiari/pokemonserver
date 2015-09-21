/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Sol;
import java.util.ArrayList;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.objet.Objet_endroit_guichet;
import mfiari.pokemon.core.objet.Type_objet;

/**
 *
 * @author mike
 */
public class Gare extends Batiments {
    
    private ArrayList<Gare> destinations;
    private Objet_endroit_guichet distributeur;

    public Gare (String nom, int positionX, int positionY,int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
        this.destinations = new ArrayList<>();
        Salle basGare = new Salle("rez de chausse", 0, 0, 10, 7, this, 0);
        this.distributeur = new Objet_endroit_guichet(Type_objet.pc_leo, 2, 7, this.destinations);
        for (int j = 0 ; j < 10 ; j++) {
            basGare.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.rail, 0, j));
        }
        for (int j = 0 ; j < 5 ; j++) {
            basGare.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            basGare.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, j));
        }
        basGare.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.train, 0, 5));
        basGare.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 4, 2));
        basGare.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        basGare.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        basGare.ajouterObjetEndroit(this.distributeur);
        basGare.setSol(Sol.bois);
    }

    public void ajouterObjet (Objet o) {
        this.distributeur.ajouterObjet(o);
    }
    
    public void ajouterDestination (Gare gare) {
        this.destinations.add(gare);
    }
    
    public ArrayList<Gare> getDestinations () {
        return this.destinations;
    }
}

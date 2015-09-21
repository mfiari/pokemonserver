/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Environnement;
import mfiari.pokemon.core.ville.Sol;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.objet.Objet_endroit_vente;
import mfiari.pokemon.core.objet.Type_objet;

/**
 *
 * @author mike
 */
public class Magasin extends Batiments {
    
    private static final long serialVersionUID = 1L;
    
    private Objet_endroit_vente magasin;

    public Magasin (String nom, int positionX, int positionY, int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
        this.magasin = new Objet_endroit_vente(Type_objet.vendeur_shop, 0, 0);
        Salle basShop = new Salle("rez de chausse shop", 0, 0, 10, 7, this, 0);
        basShop.ajouterObjetEndroit(this.magasin, Environnement.aucun);
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.vitrine_shop, 0, 2));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_mur_shop, 0, 4));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_mur_shop, 0, 6));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_gauche_shop, 3, 4));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_droite_shop, 3, 5));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_gauche_shop, 3, 9));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        basShop.setSol(Sol.carrelage);
    }

    public void ajouterObjet (Objet o) {
        this.magasin.ajouterObjet(o);
    }
}

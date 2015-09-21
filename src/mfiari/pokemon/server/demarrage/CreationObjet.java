/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.demarrage;

import mfiari.lib.game.liste.ListeObjet;
import mfiari.lib.game.objet.Objet;
import mfiari.pokemon.server.objet.Objets;

/**
 *
 * @author mike
 */
public class CreationObjet {
    
    protected ListeObjet listeDObjet = new ListeObjet<>();

    public CreationObjet () {
        this.creerObjet();
        this.creerArme();
        this.listeDObjet.ajoutObjet(Objets.antidote);
        this.listeDObjet.ajoutObjet(Objets.huile);
        this.listeDObjet.ajoutObjet(Objets.pierreEau);
        this.listeDObjet.ajoutObjet(Objets.pierreFeu);
        this.listeDObjet.ajoutObjet(Objets.pierreFoudre);
        this.listeDObjet.ajoutObjet(Objets.pierreLune);
        this.listeDObjet.ajoutObjet(Objets.pierrePlante);
        this.listeDObjet.ajoutObjet(Objets.pokeball);
        this.listeDObjet.ajoutObjet(Objets.potion);
        this.listeDObjet.ajoutObjet(Objets.rappel);
    }

    private void creerObjet () {

    }

    private void creerArme () {

    }

    public ListeObjet getListeDObjet () {
        return this.listeDObjet;
    }
    
}

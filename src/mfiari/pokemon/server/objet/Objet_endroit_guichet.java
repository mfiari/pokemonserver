/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import mfiari.pokemon.core.objet.Type_objet;
import java.util.ArrayList;
import mfiari.lib.game.controlleur.Vues;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.ville.Gare;

/**
 *
 * @author mike
 */
public class Objet_endroit_guichet extends Objet_endroit_vente {
    
    private ArrayList<Gare> destinations;
    
    public Objet_endroit_guichet (Type_objet nom, int positionX, int positionY, ArrayList<Gare> destinations) {
        super(nom, positionX, positionY);
        this.destinations = destinations;
    }
    
    @Override
    public void menu () {
        do {
            this.pcsDeroulementVendeur.firePropertyChange("menu", null, null);
            switch (this.choix) {
                case 1:
                    do {
                        this.pcsDeroulementVendeur.firePropertyChange("afficherObjets", null, null);
                        if (this.choix > 0 && this.choix <= this.objets.size()) {
                            this.objet = this.objets.getObjet(this.choix - 1);
                            this.vente = false;
                            this.pcsDeroulementVendeur.firePropertyChange("choixQuantite", null, null);
                            if (this.choix != 0) {
                                this.dresseur.getSac().acheter(this.objet, this.quantite);
                            }
                        }
                    } while (this.choix != 500);
                    break;
                case 2:
                    Vues.createVue(this.dresseur.getSac());
                    this.dresseur.getSac().afficheSac();
                    this.objet = this.dresseur.getSac().getObjetFromSac();
                    if (this.objet != null) {
                        this.vente = true;
                        this.pcsDeroulementVendeur.firePropertyChange("choixQuantite", null, null);
                        if (this.choix != 0) {
                            this.dresseur.getSac().vendre(this.objet, this.quantite);
                        }
                    }
                    break;
                case 3:
                    this.pcsDeroulementVendeur.firePropertyChange("choixQuantite", null, null);
                    if (this.choix != 0) {
                        if (this.controle(this.dresseur)) {
                            this.prendreTrain(this.dresseur, this.choix - 1);
                        } else {
                            this.pcsDeroulementVendeur.firePropertyChange("pasTicket", null, null);
                        }
                    } else {
                        this.choix = -1;
                    }
                    break;
            }
        } while (this.choix != 0);
    }
    
    public boolean controle (Dresseur d) {
        return d.getSac().contains(Objets.ticket) || d.getSac().contains(Objets.passe_train);
    }
    
    public ArrayList<Gare> getDestinations () {
        return this.destinations;
    }
    
    public void prendreTrain (Dresseur d, int choixDestination) {
        if (d.getSac().contains(Objets.ticket)) {
            d.getSac().getObjets_divers().getObjet(Objets.ticket.getNom()).vendre(1);
        }
        d.getPosition().setEndroit(this.destinations.get(choixDestination).getSalle(0, 0));
    }
}

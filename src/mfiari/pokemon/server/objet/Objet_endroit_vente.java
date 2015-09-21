/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import mfiari.pokemon.core.objet.Type_objet;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import mfiari.lib.game.controlleur.Vues;
import mfiari.lib.game.liste.ListeObjetVendable;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.objet.ObjetEndroit;
import mfiari.pokemon.server.interfaces.Vendeur;
import mfiari.pokemon.server.perso.Dresseur;

/**
 *
 * @author etudiant
 */
public class Objet_endroit_vente extends ObjetEndroit implements Vendeur {
    
    protected int choix;
    protected ListeObjetVendable objets;
    protected Dresseur dresseur;
    protected Objet objet;
    protected boolean vente;
    protected int quantite;
    protected PropertyChangeSupport pcsDeroulementVendeur = new PropertyChangeSupport(this);
    
    public Objet_endroit_vente (Type_objet nom, int positionX, int positionY) {
        super(nom, positionX, positionY);
        this.objets = new ListeObjetVendable();
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
                                int argent = this.objet.getPrixAchat() * this.quantite;
                                if (this.dresseur.getArgent() >= argent) {
                                    this.dresseur.getSac().acheter(this.objet, this.quantite);
                                    this.dresseur.setArgent(this.dresseur.getArgent() - argent);
                                    this.pcsDeroulementVendeur.firePropertyChange("merci", null, null);
                                } else {
                                    this.pcsDeroulementVendeur.firePropertyChange("pasAssezArgent", null, null);
                                }
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
                            if (this.objet.getQuantite() >= this.quantite) {
                                int argent = this.objet.getPrixVente() * this.quantite;
                                this.dresseur.getSac().vendre(this.objet, this.quantite);
                                this.dresseur.setArgent(this.dresseur.getArgent() + argent);
                                this.pcsDeroulementVendeur.firePropertyChange("merci", null, null);
                            } else {
                                this.pcsDeroulementVendeur.firePropertyChange("pasAssezObjet", null, null);
                            }
                        }
                    }
                    break;
            }
        } while (this.choix != 0);
        this.supprimerTousEcouteur();
    }

    @Override
    public void setChoix(int choix) {
        this.choix = choix;
    }

    @Override
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public void ajouterObjet(Objet obj) {
        this.objets.ajoutObjet(obj);
    }

    @Override
    public void ajouterDresseur(Dresseur dresseur) {
        this.dresseur = dresseur;
    }

    @Override
    public Dresseur getDresseur() {
        return this.dresseur;
    }

    @Override
    public Sac getSac() {
        return this.dresseur.getSac();
    }

    @Override
    public Objet getObjetChoisit() {
        return this.objet;
    }

    @Override
    public boolean vente() {
        return this.vente;
    }

    @Override
    public void ajouterEcouteurVendeur(PropertyChangeListener ecouteur) {
        this.pcsDeroulementVendeur.addPropertyChangeListener(ecouteur);
    }
    
    public void supprimerTousEcouteur() {
        PropertyChangeListener[] ecouteurs = this.pcsDeroulementVendeur.getPropertyChangeListeners();
        for (int i = 0 ; i < ecouteurs.length ; i++) {
            this.pcsDeroulementVendeur.removePropertyChangeListener(ecouteurs[i]);
        }
    }

    @Override
    public ListeObjetVendable getObjetsVendu() {
        return this.objets;
    }
    
}

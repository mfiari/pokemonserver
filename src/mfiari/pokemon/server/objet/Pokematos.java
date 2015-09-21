/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import java.io.Serializable;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.liste.ListeDeGens;
import mfiari.lib.game.personnage.Gens;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.perso.Dresseur;

/**
 *
 * @author mike
 */
public class Pokematos extends ControlleurVue implements Serializable {
    
    private ListeDeGens contact;
    private Carte carte;
    private static final long serialVersionUID = 1L;
    
    public Pokematos () {
        super(false);
        this.contact = new ListeDeGens();
        this.carte = new Carte();
        this.choix = 1;
    }
    
    public void ouvrirPokematos () {
        int choixPrec;
        do {
            choixPrec = this.choix;
            switch (this.choix) {
                case 1:
                    this.pcsControlleurVue.firePropertyChange("afficherMenu", null, null);
                    break;
                case 2:
                    this.pcsControlleurVue.firePropertyChange("afficherNumero", null, null);
                    break;
                case 3:
                    this.pcsControlleurVue.firePropertyChange("afficherCarte", null, null);
                    break;
                case 4:
                    this.pcsControlleurVue.firePropertyChange("afficherRadio", null, null);
                    break;
            }
        } while (this.choix != 0);
        this.choix = choixPrec;
    }
    
    public ListeDeGens getContact () {
        return this.contact;
    }
    
    public void ajouterGens (Gens gens) {
        this.contact.ajouterPerso(gens);
    }
    
    public Carte getCarte () {
        return this.carte;
    }
    
}

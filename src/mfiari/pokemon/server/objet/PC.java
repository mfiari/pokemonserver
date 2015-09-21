/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import java.io.Serializable;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class PC extends ControlleurVue implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private BoitePokemon [] boites;
    private Sac objets;
    private String nom;
    private int boiteEnCour;
    private int choixPokemon;
    private EquipePokemon equipe;
    
    public PC () {
        this("Leo");
    }
    
    public PC (String nom) {
        super(false);
        this.boites = new BoitePokemon[15];
        for (int i = 0 ; i < 15 ; i++) {
            this.boites[i] = new BoitePokemon("boite "+(i+1));
        }
        this.boiteEnCour = 0;
        this.choixPokemon = 0;
        this.objets = new Sac();
        this.nom = nom;
    }
    
    public String getNom () {
        return this.nom;
    }
    
    public EquipePokemon getEquipe () {
        return this.equipe;
    }
    
    public boolean ajouterPokemon (Pokemon pk) {
        for (int i=0 ; i<this.boites.length ; i++) {
            if (this.boites[i].ajouterPokemon(pk)) {
                return true;
            }
        }
        return false;
    }
    
    public Pokemon getPokemonChoisit () {
        if (this.choixPokemon < this.equipe.getNbPokemon()) {
            return this.equipe.getPokemon(this.choixPokemon);
        } else {
            return this.boites[this.boiteEnCour].getListePokemon().getPokemon(this.choixPokemon - this.equipe.getNbPokemon());
        }
    }
    
    public void allumePc (EquipePokemon equipe) {
        this.equipe = equipe;
        do {
            this.pcsControlleurVue.firePropertyChange("menu", null, null);
            switch (this.choix) {
                case 1:
                    do {
                        this.pcsControlleurVue.firePropertyChange("afficherBoite", null, null);
                        if (this.choix == -1) {
                            if (this.boiteEnCour < this.boites.length -1) {
                                this.boiteEnCour++;
                            }
                        } else if (this.choix == -2) {
                            if (this.boiteEnCour > 0) {
                                this.boiteEnCour--;
                            }
                        } else {
                            if (this.choix > 0 && this.choix < this.boites[this.boiteEnCour].getListePokemon().size() + this.equipe.getNbPokemon()) {
                                this.choixPokemon = this.choix -1;
                                do {
                                    this.pcsControlleurVue.firePropertyChange("menuChoixPokemon", null, null);
                                    if (this.choix == 1) {
                                        this.pcsControlleurVue.firePropertyChange("affichePokemon", null, null);
                                    } else if (this.choix == 2) {
                                        this.pcsControlleurVue.firePropertyChange("afficherBoite", null, null);
                                        if (this.choix > 0 && this.choix < this.boites[this.boiteEnCour].getListePokemon().getNbPokemonMax() + this.equipe.lenght()) {
                                            Pokemon pk, pk2;
                                            if (this.choix -1 < this.equipe.lenght()) {
                                                if (this.equipe.aPokemon(this.choix-1)) {
                                                    pk  = this.equipe.enleverPokemon(this.choix-1);
                                                    if (this.choixPokemon < this.equipe.getNbPokemon() +1) {
                                                        pk2 = this.equipe.enleverPokemon(this.choixPokemon);
                                                        this.equipe.ajouterPokemon(pk2, this.choix-1);
                                                        this.equipe.ajouterPokemon(pk, this.choixPokemon);
                                                    } else {
                                                        pk2 = this.boites[this.boiteEnCour].getListePokemon().enleverPokemon(this.choixPokemon - this.equipe.lenght() - 1);
                                                        this.boites[this.boiteEnCour].getListePokemon().ajouterPokemon(pk, this.choixPokemon - this.equipe.lenght() + 1);
                                                        this.equipe.ajouterPokemon(pk2, this.choix -1);
                                                    }
                                                } else {
                                                    if (this.choixPokemon < this.equipe.getNbPokemon() +1) {
                                                        pk2 = this.equipe.enleverPokemon(this.choixPokemon);
                                                        this.equipe.ajouterPokemon(pk2, this.choix-1);
                                                    } else {
                                                        pk2 = this.boites[this.boiteEnCour].getListePokemon().enleverPokemon(this.choixPokemon - this.equipe.lenght());
                                                        this.equipe.ajouterPokemon(pk2, this.choix -1);
                                                    }
                                                }
                                            } else {
                                                if (this.boites[this.boiteEnCour].getListePokemon().aPokemon(this.choix -1 - this.equipe.lenght())) {
                                                    pk  = this.boites[this.boiteEnCour].getListePokemon().enleverPokemon(this.choix -1 - this.equipe.lenght());
                                                    if (this.choixPokemon < this.equipe.getNbPokemon()) {
                                                        pk2 = this.equipe.enleverPokemon(this.choixPokemon);
                                                        this.equipe.ajouterPokemon(pk, this.choixPokemon);
                                                        this.boites[this.boiteEnCour].getListePokemon().ajouterPokemon(pk2, this.choix -1 - this.equipe.lenght());
                                                    } else {
                                                        if (this.choix -1 - this.equipe.lenght() > this.choixPokemon - this.equipe.lenght()) {
                                                            pk2 = this.boites[this.boiteEnCour].getListePokemon().enleverPokemon(this.choixPokemon - this.equipe.lenght());
                                                        } else {
                                                            pk2 = this.boites[this.boiteEnCour].getListePokemon().enleverPokemon(this.choixPokemon - this.equipe.lenght() -1);
                                                        }
                                                        this.boites[this.boiteEnCour].getListePokemon().ajouterPokemon(pk, this.choixPokemon - this.equipe.lenght());
                                                        this.boites[this.boiteEnCour].getListePokemon().ajouterPokemon(pk2, this.choix -1 - this.equipe.lenght());
                                                    }
                                                } else {
                                                    if (this.choixPokemon < this.equipe.lenght()) {
                                                        pk2 = this.equipe.enleverPokemon(this.choixPokemon);
                                                        this.boites[this.boiteEnCour].getListePokemon().ajouterPokemon(pk2, this.choix -1 - this.equipe.lenght());
                                                    } else {
                                                        if (this.choix -1 - this.equipe.lenght() > this.choixPokemon - this.equipe.lenght()) {
                                                            pk2 = this.boites[this.boiteEnCour].getListePokemon().enleverPokemon(this.choixPokemon - this.equipe.lenght());
                                                        } else {
                                                            pk2 = this.boites[this.boiteEnCour].getListePokemon().enleverPokemon(this.choixPokemon - this.equipe.lenght() -1);
                                                        }
                                                        this.boites[this.boiteEnCour].getListePokemon().ajouterPokemon(pk2, this.choix -1 - this.equipe.lenght());
                                                    }
                                                }
                                            }
                                            this.choix = 0;
                                        }
                                    }
                                } while (this.choix != 0);
                            }
                        }
                    } while (this.choix != 500);
                    break;
                case 2:
                    break;
            }
        } while (this.choix != -1);
    }
    
    public int getNbBoite () {
        return this.boites.length;
    }
    
    public BoitePokemon getBoite (int i) {
        return this.boites[i];
    }
    
    public BoitePokemon getBoiteEnCour () {
        return this.getBoite(this.boiteEnCour);
    }
}

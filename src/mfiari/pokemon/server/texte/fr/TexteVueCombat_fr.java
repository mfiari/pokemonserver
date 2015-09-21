/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte.fr;

import mfiari.pokemon.server.texte.TexteVueCombat;

/**
 *
 * @author mike
 */
public class TexteVueCombat_fr extends TexteVueCombat {
    
    public TexteVueCombat_fr () {
        this.pv = "pv";
        this.suivant = "suivant";
        this.attaquer = "attaquer";
        this.fuite = "fuite";
        this.sac = "sac";
        this.pokedex = "pokedex";
        this.pkmn = "pkmn";
        this.pageSuivant = "page suivante";
        this.pagePrecedente = "page précédente";
        this.retour = "retour";
        this.afficher = "afficher";
        this.changer = "changer";
        this.attenteAdv = "En attente du joueur adverse";
    }

    @Override
    public String estKO(String nom) {
        return nom + " est K.O";
    }

    @Override
    public String rateAttaque(String nom) {
        return nom + " rate son attaque";
    }

    @Override
    public String esquiveAttaque(String nom) {
        return nom + " esquive l'attaque";
    }
    
}

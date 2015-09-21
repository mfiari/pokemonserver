/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte.en;

import mfiari.pokemon.server.texte.TexteVueCombat;

/**
 *
 * @author mike
 */
public class TexteVueCombat_en extends TexteVueCombat {
    
    public TexteVueCombat_en () {
        this.pv = "lp";
        this.suivant = "next";
        this.attaquer = "attack";
        this.fuite = "escape";
        this.sac = "bag";
        this.pokedex = "pokedex";
        this.pkmn = "pkmn";
        this.pageSuivant = "next page";
        this.pagePrecedente = "previous page";
        this.retour = "back";
        this.afficher = "show";
        this.changer = "change";
        this.attenteAdv = "waiting for the opponent";
    }

    @Override
    public String estKO(String nom) {
        return nom + " is K.O";
    }

    @Override
    public String rateAttaque(String nom) {
        return nom + " misses his attack";
    }

    @Override
    public String esquiveAttaque(String nom) {
        return nom + " evade the attack";
    }
    
}

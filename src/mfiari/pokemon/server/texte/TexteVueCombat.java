/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public abstract class TexteVueCombat extends Texte {
    
    public String pv;
    public String attaquer;
    public String pkmn;
    public String sac;
    public String fuite;
    public String pokedex;
    public String pageSuivant;
    public String pagePrecedente;
    public String retour;
    public String afficher;
    public String changer;
    public String attenteAdv;
    
    public static TexteVueCombat getInstance () {
        return (TexteVueCombat) getInstance(TexteVueCombat.class);
    }
    
    public abstract String estKO (String nom);
    public abstract String rateAttaque (String nom);
    public abstract String esquiveAttaque (String nom);
}

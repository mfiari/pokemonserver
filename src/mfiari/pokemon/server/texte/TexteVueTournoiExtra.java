/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public class TexteVueTournoiExtra extends Texte {
    
    public String oui;
    public String non;
    public String voulerVoirRegle;
    public String nouveauDresseur;
    public String terminer;
    public String retour;
    public String regleTournoi;
    public String pasAssezPokemon;
    public String confirmer;
    public String pageSuivante;
    public String pagePrecedente;
    public String confirmerQ;
    
    public static TexteVueTournoiExtra getInstance () {
        return (TexteVueTournoiExtra) getInstance(TexteVueTournoiExtra.class);
    }
}

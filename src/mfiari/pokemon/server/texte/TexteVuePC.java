/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author etudiant
 */
public class TexteVuePC extends Texte {
    
    public String objets;
    public String quitter;
    public String boitePrecedente;
    public String boiteSuivante;
    public String retour;
    
    public static TexteVuePC getInstance () {
        return (TexteVuePC) getInstance(TexteVuePC.class);
    }
}

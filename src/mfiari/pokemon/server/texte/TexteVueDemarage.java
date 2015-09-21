/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public abstract class TexteVueDemarage extends Texte {
    
    public String nouvellePartie;
    public String continuer;
    public String extra;
    public String entrerNom;
    
    public static TexteVueDemarage getInstance () {
        return (TexteVueDemarage) getInstance(TexteVueDemarage.class);
    }
}

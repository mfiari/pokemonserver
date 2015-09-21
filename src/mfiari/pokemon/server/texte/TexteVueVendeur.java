/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author etudiant
 */
public class TexteVueVendeur extends Texte {
    
    public String objets;
    public String quitter;
    public String retour;
    
    public static TexteVueVendeur getInstance () {
        return (TexteVueVendeur) getInstance(TexteVueVendeur.class);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public abstract class TexteVueConnexion extends Texte {
    
    public String retour;
    
    public static TexteVueConnexion getInstance () {
        return (TexteVueConnexion) getInstance(TexteVueConnexion.class);
    }
    
}

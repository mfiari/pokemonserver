/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public class TexteVuePokedex extends Texte {
    
    public String pageSuivant;
    public String pagePrecedente;
    public String retour;
    
    public static TexteVuePokedex getInstance () {
        return (TexteVuePokedex) getInstance(TexteVuePokedex.class);
    }
}

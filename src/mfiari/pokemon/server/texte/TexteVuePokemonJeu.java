/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public class TexteVuePokemonJeu extends Texte {
    
    public String haut;
    public String bas;
    public String droite;
    public String gauche;
    public String action;
    public String menu;
    public String queFaire;
    public String oui;
    public String non;
    public String quitter;
    
    public static TexteVuePokemonJeu getInstance () {
        return (TexteVuePokemonJeu) getInstance(TexteVuePokemonJeu.class);
    }
}

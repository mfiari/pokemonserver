/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public class TexteVueSac extends Texte {
    
    public String objetDivers;
    public String medicaments;
    public String ball;
    public String ct_cs;
    public String baie;
    public String lettre;
    public String objetCombat;
    public String objetRare;
    public String sacPrecedent;
    public String sacSuivant;
    public String retour;
    
    public static TexteVueSac getInstance () {
        return (TexteVueSac) getInstance(TexteVueSac.class);
    }
}

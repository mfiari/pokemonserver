/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public class TexteVueTournoi extends Texte {
    
    public String affichStatAdv;
    public String commencerCombat;
    public String organiserEquipe;
    public String soignerEquipe;
    public String terminer;
    public String retour;
    public String quelPokemonRemplacer;
    
    public static TexteVueTournoi getInstance () {
        return (TexteVueTournoi) getInstance(TexteVueTournoi.class);
    }
    
}

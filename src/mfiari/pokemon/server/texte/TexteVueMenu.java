/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
public abstract class TexteVueMenu extends Texte {
    
    public String configuration;
    public String sauvegarder;
    public String quitter;
    public String pieceOr;
    public String tempsjeu;
    public String queFaire;
    public String pokedex;
    public String pokemon;
    public String sac;
    public String pokematos;
    public String carteDresseur;
    public String pagePrecedente;
    public String pageSuivant;
    public String retour;
    public String changerPlace;
    public String deplacer;
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
    
    public static TexteVueMenu getInstance () {
        return (TexteVueMenu) getInstance(TexteVueMenu.class);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;


/**
 *
 * @author mike
 */
public class TexteVueMenuExtra extends Texte {
    
    public String enLigne;
    public String duel;
    public String tournoi;
    public String musiqueVideo;
    public String configuration;
    public String retour;
    public String cbParticipant;
    public String ok;
    public String cbJoueur;
    public String transferDonneeSite;
    public String configServeur;
    public String configAdresseSite;
    public String modifier;
    public String annuler;
    public String play;
    public String pause;
    public String choixLangue;
    
    public static TexteVueMenuExtra getInstance () {
        return (TexteVueMenuExtra) getInstance(TexteVueMenuExtra.class);
    }
}

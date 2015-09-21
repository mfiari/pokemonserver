/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.musique;

import java.io.File;
import java.net.URL;
import mfiari.lib.game.liste.ListeDeMusique;
import mfiari.lib.game.media.Musique;
import mfiari.pokemon.server.texte.Texte;

/**
 *
 * @author mike
 */
public class Musiques {
    
    public static Musique combat_arene;
    
    public Musiques () {
        combat_arene = new Musique("Combat Arène", "Pokemon_combat_arene", new File(this.getUrlAudio("Pokemon_combat_arene").getFile()));
    }
    
    public static ListeDeMusique getListeDeMusique () {
        ListeDeMusique musiques = new ListeDeMusique();
        switch (Texte.langue) {
            case fr :
                musiques.ajouterMusique(Musiques.combat_arene);
                break;
            case en :
                musiques.ajouterMusique(Musiques.combat_arene);
                break;
        }
        return musiques;
    }
    
    private URL getUrlAudio (String nom) {
        URL url = getClass().getResource(nom+".mp3");
        if (url == null) {
            url = getClass().getResource(nom+".wav");
            if (url == null) {
                url = getClass().getResource(nom+".gif");
            }
        }
        return url;
    }
    
}

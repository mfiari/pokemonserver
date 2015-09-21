/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server;

import mfiari.lib.game.clavier.CodeBouton;
import mfiari.lib.game.media.SoundController;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.server.ville.Endroits;
import mfiari.pokemon.server.ville.Pays;

/**
 *
 * @author mike
 */
public class Global {
    
    public static Pays paysDepart = Endroits.Kanto;
    public static Pokemon pokemonRival1 = null;
    public static Pokemon pokemonRival2 = null;
    public static Pokemon pokemonRival3 = null;
    public static String serveur = "pc-mike";
    public static String nomsiteWeb = "jeu_pokemon";
    public static String hostsiteWeb = "localhost";
    public static int port = 2009;
    public static String hsqlLocation = "pokemon";
    public static String hsqlUser = "sa";
    public static String hsqlMdp = "";
    public static String webserviceLogin = "mokratos";
    public static String webserviceMdp = "mangadbz";
    
    public static int TOUCHE_ACTION = CodeBouton.ACTION;
    public static int TOUCHE_ANNULE = CodeBouton.ANNULATION;
    public static int TOUCHE_START = CodeBouton.START;
    public static int TOUCHE_SELECT = CodeBouton.SELECT;
    public static int TOUCHE_HAUT = CodeBouton.HAUT;
    public static int TOUCHE_BAS = CodeBouton.BAS;
    public static int TOUCHE_DROITE = CodeBouton.DROITE;
    public static int TOUCHE_GAUCHE = CodeBouton.GAUCHE;
    public static int TOUCHE_L = CodeBouton.E;
    public static int TOUCHE_R = CodeBouton.R;
    
    public static SoundController soundController = new SoundController();
    
    
    public static int getAleatoireId () {
        return (int) (Math.random() * 65535 + 1);
    }
    
}

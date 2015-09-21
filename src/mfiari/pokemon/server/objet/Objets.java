/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import mfiari.pokemon.core.objet.ObjetCanne;
import mfiari.pokemon.core.objet.Objet_ball;
import mfiari.pokemon.core.objet.Objet_medicament;
import mfiari.pokemon.core.objet.Type_objet;
import mfiari.pokemon.core.objet.Objet_rare;
import mfiari.pokemon.core.objet.Objet_divers;
import mfiari.pokemon.core.ville.Environnement;

/**
 *
 * @author mike
 */
public class Objets {
    
    public static Objet_medicament potion = new Objet_medicament("potion", Type_objet.soin, "statP", "rien", 100, 0, 0, 0, 0, 0, 0, 0, 0, 75, 25, 
            "redonne des pv", 0);
    public static Objet_medicament huile = new Objet_medicament("ether", Type_objet.soin, "statP", "rien", 0, 50, 0, 0, 0, 0, 0, 0, 0, 120, 40, 
            "redonne des pm", 0);
    public static Objet_medicament antidote = new Objet_medicament("antidote", Type_objet.soin, "etatP", "rien", 100, 0, 0, 0, 0, 0, 0, 0, 0, 50, 15, 
            "soigne poison", 0);
    public static Objet_medicament rappel = new Objet_medicament("antidote", Type_objet.soin, "etatP", "rien", 100, 0, 0, 0, 0, 0, 0, 0, 0, 50, 15, 
            "soigne poison", 0);
    public static Objet_divers passe_train = new Objet_divers ("Passe train", Type_objet.rare, "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "passe train", 0);
    public static Objet_divers ticket = new Objet_divers ("Ticket", Type_objet.rare, "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "ticket", 0);
    
    /* Pierre */
    public static Objet_divers pierreFoudre = new Objet_divers ("Pierre foudre", Type_objet.pierre, "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 500, "pierre foudre", 0);
    public static Objet_divers pierreEau = new Objet_divers ("Pierre eau", Type_objet.pierre, "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 500, "pierre eau", 0);
    public static Objet_divers pierrePlante = new Objet_divers ("Pierre plante", Type_objet.pierre, "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 500, "pierre plante", 0);
    public static Objet_divers pierreFeu = new Objet_divers ("Pierre feu", Type_objet.pierre, "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 500, "pierre feu", 0);
    public static Objet_divers pierreLune = new Objet_divers ("Pierre lune", Type_objet.pierre, "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 500, "pierre lune", 0);
    
    /* pokeball */
    public static Objet_ball pokeball = new Objet_ball ("poké ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball superball = new Objet_ball ("super ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1.5);
    public static Objet_ball hyperball = new Objet_ball ("hyper ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 2);
    public static Objet_ball masterball = new Objet_ball ("master ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 255);
    public static Objet_ball safariball = new Objet_ball ("safari ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1.5);
    public static Objet_ball niveauball = new Objet_ball ("niveau ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball appatball = new Objet_ball ("appat ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball luneball = new Objet_ball ("lune ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball copainball = new Objet_ball ("copain ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball loveball = new Objet_ball ("love ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball masseball = new Objet_ball ("masse ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball speedball = new Objet_ball ("speed ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball competball = new Objet_ball ("compèt ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1.5);
    public static Objet_ball filetball = new Objet_ball ("filet ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball faibloball = new Objet_ball ("faiblo ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball bisball = new Objet_ball ("bis ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball chronoball = new Objet_ball ("chrono ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball honorball = new Objet_ball ("honor ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball luxeball = new Objet_ball ("luxe ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball scubaball = new Objet_ball ("scuba ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball sombreball = new Objet_ball ("sombre ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball rapideball = new Objet_ball ("rapide ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball soinball = new Objet_ball ("soin ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball memoireball = new Objet_ball ("mémoire ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 1);
    public static Objet_ball parcball = new Objet_ball ("parc ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 255);
    public static Objet_ball reveball = new Objet_ball ("reve ball", Type_objet.ball, 0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 100, "pokeball", 0, 255);
    
    /* canne */
    public static ObjetCanne canne = new ObjetCanne("canne", Environnement.canne);
    /* fin canne */
    
    /* rare */
    public static Objet_rare gsball = new Objet_rare ("gs ball");
    public static Objet_rare mewtwo_ball = new Objet_rare ("mewtwo ball");
    public static Objet_rare orbe_foudre = new Objet_rare ("orbe foudre");
    public static Objet_rare orbe_glace = new Objet_rare ("orbe glace");
    public static Objet_rare orbe_feu = new Objet_rare ("orbe feu");
    public static Objet_rare badge_ligue_kanto = new Objet_rare ("badge ligue kanto");
    /* Fin rare */
    
}

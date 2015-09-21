/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso;

import mfiari.lib.game.personnage.Habitant;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.ville.Endroits;

/**
 *
 * @author mike
 */
public class Habitants {
    
    /* Habitant Kanto */
    
    /* Bourg palette */
    public static Habitant mamanRival1Kanto = new Habitant ("maman", 1, 1, Endroits.bas_maisonRival1_quartierDresseur_bourgPalette, Orientation.face);
    public static Habitant mamanBlueKanto = new Habitant ("maman", 1, 1, Endroits.bas_maisonRival2_quartierDresseur_bourgPalette, Orientation.face);
    public static Habitant mamanYellowKanto = new Habitant ("maman", 1, 1, Endroits.bas_maisonRival3_quartierDresseur_bourgPalette, Orientation.face);
    public static Habitant delia_ketchum = new Habitant ("delia", 1, 1, Endroits.bas_maisonSacha_quartierDresseur_bourgPalette, Orientation.face);
    public static Habitant daisy_chen = new Habitant ("daisy", 1, 1, Endroits.bas_maisonRegis_quartierDresseur_bourgPalette, Orientation.face);
    public static Habitant habitant1BourgPalette = new Habitant ("Habitant", 5, 2, Endroits.quartierHabitant_bourgPalette, Orientation.face);
    public static Habitant habitant2BourgPalette = new Habitant ("Habitant", 4, 7, Endroits.quartierHabitant_bourgPalette, Orientation.face);
    public static Habitant habitant3BourgPalette = new Habitant ("Habitant", 6, 3, Endroits.quartierDresseur_bourgPalette, Orientation.droite);
    public static Habitant femme_profchen = new Habitant ("femme prof chen", 1, 1, Endroits.maisonProfChen_quartierHabitant_bourgPalette.getSalle(0, 0), Orientation.face);
    public static Habitant habitant_shop_bourgPalette = new Habitant ("Habitant", 4, 1, Endroits.shop_bourgPalette.getSalle(0, 0), Orientation.droite);
    public static Habitant habitant_centre_pokemon_bourgPalette = new Habitant ("Habitant", 2, 3, Endroits.centrepokemon_bourgPalette.getSalle(0, 0), Orientation.face);
    public static Habitant profchen = new Habitant ("prof chen", 1, 5, Endroits.bas_laboProfChen_quartierLabo_bourgPalette, Orientation.face);
    public static Habitant scientifique1LaboProfChen = new Habitant ("scientifique", 5, 3, Endroits.bas_laboProfChen_quartierLabo_bourgPalette, Orientation.droite);
    public static Habitant scientifique2LaboProfChen = new Habitant ("scientifique", 5, 6, Endroits.bas_laboProfChen_quartierLabo_bourgPalette, Orientation.gauche);
    /* Fin Bourg palette */
    
    /* Jadielle */
    public static Habitant conseillerAreneJadielle = new Habitant ("Conseiller", 5, 4, Endroits.salle1_arene_jadielle, Orientation.droite);
    public static Habitant habitant1Jadielle = new Habitant ("Habitant", 2, 8, Endroits.quartierBoutique_jadielle, Orientation.face);
    public static Habitant habitant2Jadielle = new Habitant ("Habitant", 4, 2, Endroits.quartierBoutique_jadielle, Orientation.droite);
    public static Habitant habitant3Jadielle = new Habitant ("Habitant", 0, 6, Endroits.quartierArene_jadielle, Orientation.face);
    public static Habitant habitant4Jadielle = new Habitant ("Habitant", 2, 3, Endroits.maisonHabitant_quartierArene_jadielle.getSalle(0, 0), Orientation.face);
    /* Fin Jadielle */
    
    /* Jadielle */
    public static Habitant conseillerAreneArgenta = new Habitant ("Conseiller", 5, 4, Endroits.bas_arene_argenta, Orientation.droite);
    public static Habitant habitant1Argenta = new Habitant ("Habitant", 5, 7, Endroits.quartierBoutique_argenta, Orientation.dos);
    public static Habitant habitant2Argenta = new Habitant ("Habitant", 3, 2, Endroits.quartierBoutique_argenta, Orientation.droite);
    public static Habitant habitant3Argenta = new Habitant ("Habitant", 4, 8, Endroits.quartierArene_argenta, Orientation.face);
    public static Habitant habitant4Argenta = new Habitant ("Habitant", 6, 1, Endroits.quartierArene_argenta, Orientation.droite);
    /* Fin Jadielle */
    
    /* Azuria */
    public static Habitant conseillerAreneAzuria = new Habitant ("Conseiller", 5, 4, Endroits.bas_arene_azuria, Orientation.droite);
    /* fin azuria */
    
    /* route 24 */
    /* fin route 24 */
    
    /* route 25 */
    public static Habitant eleve1_ecolePokemon = new Habitant ("eleve", 4, 3, Endroits.entree_ecolePokemon, Orientation.droite);
    public static Habitant eleve2_ecolePokemon = new Habitant ("eleve", 1, 7, Endroits.entree_ecolePokemon, Orientation.face);
    public static Habitant prof1_ecolePokemon = new Habitant ("prof", 2, 1, Endroits.salle_machine_ecolePokemon, Orientation.face);
    public static Habitant eleve3_ecolePokemon = new Habitant ("eleve", 2, 4, Endroits.salle_machine_ecolePokemon, Orientation.dos);
    public static Habitant eleve4_ecolePokemon = new Habitant ("eleve", 5, 6, Endroits.salle_machine_ecolePokemon, Orientation.dos);
    public static Habitant eleve5_ecolePokemon = new Habitant ("eleve", 5, 8, Endroits.salle_machine_ecolePokemon, Orientation.dos);
    public static Habitant prof2_ecolePokemon = new Habitant ("prof", 0, 4, Endroits.salle_classe_ecolePokemon, Orientation.face);
    public static Habitant eleve6_ecolePokemon = new Habitant ("eleve", 2, 6, Endroits.salle_classe_ecolePokemon, Orientation.dos);
    public static Habitant eleve7_ecolePokemon = new Habitant ("eleve", 5, 1, Endroits.salle_classe_ecolePokemon, Orientation.droite);
    /* fin route 25 */
    public static Habitant grand_pere_leo = new Habitant ("Grand pere de leo", 1, 5, Endroits.bas_maisonLeo, Orientation.face);
    public static Habitant leo = new Habitant ("Leo", 1, 5, Endroits.salleTravail_maisonLeo, Orientation.face);
    
    public static Habitant conseillerAreneMorganeSafrania = new Habitant ("Conseiller", 5, 4, Endroits.bas_arene_morgane_safrania, Orientation.droite);
    public static Habitant conseillerAreneCombatSafrania = new Habitant ("Conseiller", 5, 4, Endroits.bas_arene_combat_safrania, Orientation.droite);
    
    
    /* Caverne azuree */
    public static Habitant mewtwo_caverne_azuree = new Habitant ("Mewtwo", 5, 2, Endroits.caverne_azuree_ss1, Orientation.face);
    /* Fin Caverne azuree */
    
    /* Carmin sur mer */
    public static Habitant regisCarminSurMer = new Habitant ("regis", 2, 6, Endroits.quartierHabitant_carmin_sur_mer, Orientation.face);
    public static Habitant pecheurCarminSurMer = new Habitant ("pecheur", 2, 2, Endroits.maisonPecheur_quartierHabitant_carmin_sur_mer.getSalle(0, 0), Orientation.face);
    public static Habitant sbire_rocket = new Habitant ("sbire rocket", 4, 3, Endroits.port_carmin_sur_mer, Orientation.dos);
    public static Habitant capitain_aquaria = new Habitant ("capitain aquaria", 4, 3, Endroits.cabine_capitaine_aquaria, Orientation.dos);
    /* Fin Carmin sur mer */
    
    /* Canyon */
    public static Habitant ptera_canyon = new Habitant ("Ptera", 6, 5, Endroits.canyon_p3, Orientation.dos);
    /* Fin Canyon */
    
    /* ile mewtwo */
    public static Habitant mewtwo_tournoi_mewtwo = new Habitant ("Mewtwo", 5, 2, Endroits.entree_ile_de_mewtwo, Orientation.face);
    public static Habitant mew_tournoi_mewtwo = new Habitant ("Mew", 5, 2, Endroits.entree_ile_de_mewtwo, Orientation.face);
    /* ile mewtwo */
    
    /* Fin Habitant Kanto */
    
    /* Habitant Johto */
    public static Habitant conseillerAreneMauville = new Habitant ("Conseiller", 5, 4, Endroits.bas_arene_albert_mauville, Orientation.droite);
    
    /* Bourg geon */
    public static Habitant mamanRival1Johto = new Habitant ("maman", 1, 1, Endroits.bas_maisonRival1_quartierHabitant_bourg_geon, Orientation.face);
    public static Habitant profOrme = new Habitant ("prof orme", 1, 5, Endroits.bas_laboProfOrme_quartierLabo_bourg_geon, Orientation.face);
    public static Habitant scientifique1LaboProfOrme = new Habitant ("scientifique", 5, 3, Endroits.bas_laboProfOrme_quartierLabo_bourg_geon, Orientation.droite);
    public static Habitant scientifique2LaboProfOrme = new Habitant ("scientifique", 5, 6, Endroits.bas_laboProfOrme_quartierLabo_bourg_geon, Orientation.gauche);
    /* Fin Bourg geon */
    
    /* Oliville */
    public static Habitant peterOliville = new Habitant ("peter", 5, 2, Endroits.quartier_boutique_oliville, Orientation.face);
    /* Fin Oliville */
    /* Fin Habitant Johto */
    
    /* Habitant Hoenn */
    public static Habitant conseillerAreneClementiVille = new Habitant ("Conseiller", 5, 4, Endroits.bas_arene_norman_clementi_ville, Orientation.droite);
    public static Habitant mamanRival1Hoenn = new Habitant ("maman", 1, 1, Endroits.bas_maisonRival1_quartierDresseur_bourgPalette, Orientation.face);
    public static Habitant profSeko = new Habitant ("prof Seko", 3, 3, Endroits.bas_laboProfSeko_quartier_labo_bourg_en_vol, Orientation.face);
    /* Fin Habitant Hoenn */
    
    /* Habitant Sinnoh */
    public static Habitant conseillerAreneJoliberges = new Habitant ("Conseiller", 5, 4, Endroits.salle1_arene_jadielle, Orientation.droite);
    public static Habitant mamanRival1Sinnoh = new Habitant ("maman", 1, 1, Endroits.bas_maisonRival1_quartierDresseur_bourgPalette, Orientation.face);
    public static Habitant profSorbier = new Habitant ("prof sorbier", 3, 3, Endroits.bas_laboProfSorbier_quartier_labo_littorella, Orientation.face);
    /* Fin Habitant Sinnoh */
    
}

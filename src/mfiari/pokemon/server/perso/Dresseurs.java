/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso;

import mfiari.pokemon.core.perso.Titre;
import mfiari.lib.game.personnage.Sexe;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.objet.Badges;
import mfiari.pokemon.server.objet.Objets_CT_CS;
import mfiari.pokemon.server.ville.Endroits;

/**
 *
 * @author mike
 */
public class Dresseurs {
    
    /* Kanto */
    public static DresseurClassique rival1Kanto = new DresseurClassique ("red", 0, 3, 6, null, Titre.rival, Orientation.droite, Sexe.garcon);
    public static DresseurClassique rival2Kanto = new DresseurClassique ("yellow", 0, 3, 6, null, Titre.rival, Orientation.droite, Sexe.fille);
    public static DresseurClassique rival3Kanto = new DresseurClassique ("blue", 0, 3, 6, null, Titre.rival, Orientation.droite, Sexe.garcon);
    public static DresseurClassique jessie = new DresseurClassique ("Jessie", 0, 0, 0, null, Titre.teamRocket, Orientation.face);
    public static DresseurClassique james = new DresseurClassique ("James", 0, 0, 0, null, Titre.teamRocket, Orientation.face);
    
    public static DresseurClassique dresseur1_niveauGamin_tournoiBougPalette = new DresseurClassique ("Frank", 0, 0, 0, null, Titre.gamin, null);
    public static DresseurClassique dresseur2_niveauGamin_tournoiBougPalette = new DresseurClassique ("Ernest", 0, 0, 0, null, Titre.gamin, null);
    public static DresseurClassique dresseur3_niveauGamin_tournoiBougPalette = new DresseurClassique ("Juliette", 0, 0, 0, null, Titre.fillette, null);
    public static DresseurClassique dresseur4_niveauGamin_tournoiBougPalette = new DresseurClassique ("Rose", 0, 0, 0, null, Titre.fillette, null);
    public static DresseurClassique dresseur1_niveauDresseur_tournoiBougPalette = new DresseurClassique ("Romain", 0, 0, 0, null, Titre.ornithologue, null);
    public static DresseurClassique dresseur2_niveauDresseur_tournoiBougPalette = new DresseurClassique ("Simeon", 0, 0, 0, null, Titre.pokefan, null);
    public static DresseurClassique dresseur3_niveauDresseur_tournoiBougPalette = new DresseurClassique ("Alberto", 0, 0, 0, null, Titre.pokemaniac, null);
    public static DresseurClassique dresseur4_niveauDresseur_tournoiBougPalette = new DresseurClassique ("Luc", 0, 0, 0, null, Titre.gentleman, null);
    public static DresseurClassique dresseur5_niveauDresseur_tournoiBougPalette = new DresseurClassique ("Romeo & juliette", 0, 0, 0, null, Titre.jeune_couple, null);
    public static DresseurClassique dresseur6_niveauDresseur_tournoiBougPalette = new DresseurClassique ("Zara & Sarah", 0, 0, 0, null, Titre.jumelle, null);
    public static DresseurClassique dresseur7_niveauDresseur_tournoiBougPalette = new DresseurClassique ("Marvin", 0, 0, 0, null, Titre.ornithologue, null);
    public static Topdresseur dresseur1_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Nathan", 0, 0, 0, null, null);
    public static Topdresseur dresseur2_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Jake", 0, 0, 0, null, null);
    public static Topdresseur dresseur3_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Tim", 0, 0, 0, null, null);
    public static Topdresseur dresseur4_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Keith", 0, 0, 0, null, null);
    public static Topdresseur dresseur5_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Dan", 0, 0, 0, null, null);
    public static Topdresseur dresseur6_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Antoine", 0, 0, 0, null, null);
    public static Topdresseur dresseur7_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Mourad", 0, 0, 0, null, null);
    public static Topdresseur dresseur8_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Dominique", 0, 0, 0, null, null);
    public static Topdresseur dresseur9_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Stanley", 0, 0, 0, null, null);
    public static Topdresseur dresseur10_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Edward", 0, 0, 0, null, null);
    public static Topdresseur dresseur11_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Alfonse", 0, 0, 0, null, null);
    public static Topdresseur dresseur12_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Gary", 0, 0, 0, null, null);
    public static Topdresseur dresseur13_niveauTopdresseur_tournoiBougPalette = new Topdresseur ("Loic", 0, 0, 0, null, null);
    public static Maitre regis_niveauTopdresseur_tournoiBougPalette = new Maitre("Regis", 0, 0, 0, null, null);
    public static Maitre sacha_niveauTopdresseur_tournoiBougPalette = new Maitre("Sacha", 0, 0, 0, null, null);
    
    public static DresseurClassique gamin1 = new DresseurClassique ("Romain", 0, 3, 9, Endroits.debut_route1, Titre.gamin, Orientation.gauche);
    public static DresseurClassique gamin2 = new DresseurClassique ("Steve", 0, 3, 1, Endroits.milieu_route1, Titre.gamin, Orientation.droite);
    public static DresseurClassique agentKYou1 = new DresseurClassique ("Maria", 0, 0, 0, Endroits.quartierBoutique_jadielle, Titre.agent_jenny, 
            Orientation.droite);
    public static DresseurClassique dompteurGiovanie1 = new DresseurClassique ("Lionel", 0, 3, 2, Endroits.salle1_arene_jadielle, Titre.dompteur, Orientation.droite);
    public static DresseurClassique dompteurGiovanie2 = new DresseurClassique ("Raoul", 0, 3, 2, Endroits.salle1_arene_jadielle, Titre.dompteur, Orientation.droite);
    public static Topdresseur topdresseurGiovanie3 = new Topdresseur ("Martin", 0, 3, 0, Endroits.salle1_arene_jadielle, Orientation.face);
    public static Topdresseur jessieArene = new Topdresseur ("Jessie", 0, 5, 4, Endroits.salle2_arene_jadielle, Orientation.gauche);
    public static Topdresseur jamesArene = new Topdresseur ("James", 0, 5, 6, Endroits.salle2_arene_jadielle, Orientation.droite);
    public static Topdresseur cassidyArene = new Topdresseur ("Cassidy", 0, 3, 4, Endroits.salle2_arene_jadielle, Orientation.gauche);
    public static Topdresseur butchArene = new Topdresseur ("Butch", 0, 3, 6, Endroits.salle2_arene_jadielle, Orientation.droite);
    public static ChampionArene giovanie = new ChampionArene ("Giovanie", 0, 0, 5, Endroits.salle_champion_arene_jadielle, Badges.badgeTerre, Orientation.face, Objets_CT_CS.ct26);
    public static DresseurClassique ornithologueOdilon_debutRoute2 = new DresseurClassique ("odilon", 0, 1, 3, Endroits.debut_route2, Titre.ornithologue, 
            Orientation.gauche);
    public static DresseurClassique ornithologueAymeric_milieuRoute2 = new DresseurClassique ("Aymeric", 0, 6, 4, Endroits.milieu_route2, Titre.ornithologue, 
            Orientation.dos);
    public static DresseurClassique scoutConstantin_foretDeJade1 = new DresseurClassique ("Constantin", 0, 4, 1, Endroits.foretDeJade1, Titre.scout, Orientation.droite);
    public static DresseurClassique scoutJoan_foretDeJade1 = new DresseurClassique ("Joan", 0, 1, 9, Endroits.foretDeJade1, Titre.scout, Orientation.face);
    public static DresseurClassique scoutCalixte_foretDeJade2 = new DresseurClassique ("Calixte", 0, 2, 2, Endroits.foretDeJade2, Titre.scout, Orientation.droite);
    public static DresseurClassique scoutVivian_foret_de_jade2 = new DresseurClassique ("Vivian", 0, 6, 9, Endroits.foretDeJade2, Titre.scout, Orientation.dos);
    public static DresseurClassique scoutEmilian_foret_de_jade3 = new DresseurClassique ("Emilian", 0, 1, 2, Endroits.foretDeJade3, Titre.scout, Orientation.face);
    public static Topdresseur samourai = new Topdresseur ("samourai", 0, 7, 3, Endroits.foretDeJade4, Orientation.face);
    public static DresseurClassique agentKYou2 = new DresseurClassique ("Jane", 0, 1, 8, Endroits.quartierBoutique_argenta, Titre.agent_jenny, 
            Orientation.gauche);
    public static Topdresseur forrest = new Topdresseur ("forrest", 0, 3, 4, Endroits.bas_arene_argenta, Orientation.face);
    public static Topdresseur flint = new Topdresseur ("flint", 0, 3, 6, Endroits.bas_arene_argenta, Orientation.face);
    public static ChampionArene pierre = new ChampionArene ("Pierre", 0, 0, 5, Endroits.salle_champion_arene_argenta, Badges.badgeRoche, Orientation.face, Objets_CT_CS.ct80);
    public static DresseurClassique filletteSophie_debutRoute3 = new DresseurClassique ("Sophie", 0, 3, 9, Endroits.debut_route3, Titre.fillette, Orientation.gauche);
    public static DresseurClassique gamin_debutRoute3 = new DresseurClassique ("Romain", 0, 6, 4, Endroits.debut_route3, Titre.gamin, Orientation.dos);
    public static DresseurClassique pick_nick_debutRoute3 = new DresseurClassique ("Noémie", 0, 1, 2, Endroits.debut_route3, Titre.pick_nick, Orientation.face);
    public static DresseurClassique campeur_debutRoute3 = new DresseurClassique ("Luc", 0, 6, 5, Endroits.milieu_route3_1, Titre.campeur, Orientation.dos);
    public static DresseurClassique ornithologue_milieuRoute3_2 = new DresseurClassique ("Hugo", 0, 6, 4, Endroits.milieu_route3_2, Titre.ornithologue, 
            Orientation.dos);
    public static DresseurClassique scoutMarc_milieuRoute3_2 = new DresseurClassique ("Marc", 0, 4, 1, Endroits.milieu_route3_2, Titre.scout, 
            Orientation.droite);
    public static DresseurClassique pokefan_finRoute3 = new DresseurClassique ("Otis", 0, 5, 9, Endroits.fin_route3, Titre.pokefan, Orientation.gauche);
    public static DresseurClassique kinesiste_finRoute3 = new DresseurClassique ("Lucas", 0, 3, 1, Endroits.fin_route3, Titre.kinesiste, Orientation.droite);
    public static DresseurClassique montagnard_mont_selenite_n0_p1 = new DresseurClassique ("Montagnard", 0, 1, 7, Endroits.montSelenite_rdc_partie1, Titre.montagnard, Orientation.face);
    public static DresseurClassique karateka_mont_selenite_n0_p1 = new DresseurClassique ("karateka", 0, 2, 1, Endroits.montSelenite_rdc_partie1, Titre.karateka, Orientation.droite);
    public static DresseurClassique montagnard_mont_selenite_n0_p2 = new DresseurClassique ("Montagnard", 0, 1, 7, Endroits.montSelenite_rdc_partie2, Titre.montagnard, Orientation.face);
    public static DresseurClassique pokemaniac_mont_selenite_n0_p2 = new DresseurClassique ("pokemaniac", 0, 4, 3, Endroits.montSelenite_rdc_partie2, Titre.pokemaniac, Orientation.droite);
    public static DresseurClassique scientifique_mont_selenite_n0_p3 = new DresseurClassique ("scientifique", 0, 1, 7, Endroits.montSelenite_rdc_partie3, Titre.scientifique, Orientation.face);
    public static DresseurClassique pokefan_mont_selenite_n0_p3 = new DresseurClassique ("pokefan", 0, 2, 1, Endroits.montSelenite_rdc_partie3, Titre.pokefan, Orientation.droite);
    public static DresseurClassique montagnard_mont_selenite_n0_p4 = new DresseurClassique ("Montagnard", 0, 1, 7, Endroits.montSelenite_rdc_partie4, Titre.montagnard, Orientation.face);
    public static DresseurClassique karateka_mont_selenite_n0_p4 = new DresseurClassique ("karateka", 0, 2, 1, Endroits.montSelenite_rdc_partie4, Titre.karateka, Orientation.droite);
    public static DresseurClassique fillette_route4 = new DresseurClassique ("fillette", 0, 4, 9, Endroits.milieu_route4, Titre.fillette, Orientation.gauche);
    public static DresseurClassique gamin_route4 = new DresseurClassique ("gamin", 0, 6, 3, Endroits.milieu_route4, Titre.gamin, Orientation.dos);
    public static Topdresseur daisy = new Topdresseur ("daisy", 0, 4, 6, Endroits.bas_arene_azuria, Orientation.gauche);
    public static Topdresseur lily = new Topdresseur ("lily", 0, 3, 4, Endroits.bas_arene_azuria, Orientation.droite);
    public static Topdresseur violette = new Topdresseur ("violette", 0, 2, 6, Endroits.bas_arene_azuria, Orientation.gauche);
    public static ChampionArene ondine = new ChampionArene ("Ondine", 0, 0, 5, Endroits.salle_champion_arene_azuria, Badges.badgeCascade, Orientation.face, Objets_CT_CS.ct01);
    public static DresseurClassique scout_aymeric_debut_route24 = new DresseurClassique ("Aymeric", 0, 5, 4, Endroits.debut_route24, Titre.scout, Orientation.gauche);
    public static DresseurClassique fillette_meg_debut_route24 = new DresseurClassique ("Meg", 0, 3, 3, Endroits.debut_route24, Titre.fillette, Orientation.droite);
    public static DresseurClassique gamin_tim_debut_route24 = new DresseurClassique ("Tim", 0, 1, 4, Endroits.debut_route24, Titre.gamin, Orientation.gauche);
    public static DresseurClassique fillette_lana_milieu_route24 = new DresseurClassique ("Lana", 0, 5, 3, Endroits.milieu_route24, Titre.fillette, Orientation.droite);
    public static DresseurClassique karateka_diego_milieu_route24 = new DresseurClassique ("Diego", 0, 3, 4, Endroits.milieu_route24, Titre.karateka, Orientation.gauche);
    public static DresseurClassique ornithologue_djamel_milieu_route24 = new DresseurClassique ("Djamel", 0, 1, 3, Endroits.milieu_route24, Titre.ornithologue, Orientation.droite);
    public static DresseurClassique sbire_rocket_fin_route24 = new DresseurClassique ("rocket", 0, 6, 4, Endroits.fin_route24, Titre.sbire_rocket, Orientation.gauche);
    public static Topdresseur albert_route24 = new Topdresseur ("albert", 0, 0, 5, Endroits.arene_areneAlbert, Orientation.face);
    public static DresseurClassique montagnard_francois_debut_route25 = new DresseurClassique ("François", 0, 2, 4, Endroits.debut_route25, Titre.montagnard, Orientation.face);
    public static DresseurClassique montagnard_jeremy_debut_route25 = new DresseurClassique ("Jeremy", 0, 2, 9, Endroits.debut_route25, Titre.montagnard, Orientation.gauche);
    public static DresseurClassique campeur_frederic_milieu_route25_1 = new DresseurClassique ("Frédéric", 0, 3, 3, Endroits.milieu_route25_1, Titre.campeur, Orientation.face);
    public static DresseurClassique gamin_jo_milieu_route25_1 = new DresseurClassique ("Jo", 0, 4, 7, Endroits.milieu_route25_1, Titre.gamin, Orientation.dos);
    public static DresseurClassique montagnard_hiro_milieu_route25_2 = new DresseurClassique ("Hiro", 0, 1, 3, Endroits.milieu_route25_2, Titre.montagnard, Orientation.face);
    public static DresseurClassique fillette_aude_milieu_route25_2 = new DresseurClassique ("Aude", 0, 2, 7, Endroits.milieu_route25_2, Titre.fillette, Orientation.gauche);
    public static DresseurClassique gamin_cedric_ecolePokemon = new DresseurClassique ("Cédric", 0, 4, 3, Endroits.cour_ecolePokemon, Titre.gamin, Orientation.droite);
    public static DresseurClassique joe_ecolePokemon = new DresseurClassique ("Joe", 0, 2, 6, Endroits.cour_ecolePokemon, Titre.gamin, Orientation.gauche);
    public static DresseurClassique giselle_ecolePokemon = new DresseurClassique ("giselle", 0, 2, 8, Endroits.cour_ecolePokemon, Titre.fillette, Orientation.dos);
    public static DresseurClassique prof_zora_ecolePokemon = new DresseurClassique ("Zora", 0, 0, 2, Endroits.cour_ecolePokemon, Titre.prof, Orientation.face);
    public static DresseurClassique campeur_rex_route6 = new DresseurClassique ("rex", 0, 2, 1, Endroits.debut_route6, Titre.campeur, Orientation.droite);
    public static DresseurClassique campeur_alain_route6 = new DresseurClassique ("alain", 0, 4, 6, Endroits.debut_route6, Titre.campeur, Orientation.face);
    public static DresseurClassique gamin_majid_route6 = new DresseurClassique ("majid", 0, 6, 1, Endroits.debut_route6, Titre.gamin, Orientation.droite);
    public static DresseurClassique pique_nick_zora_route6 = new DresseurClassique ("zora", 0, 1, 9, Endroits.fin_route6, Titre.pick_nick, Orientation.gauche);
    public static DresseurClassique canon_alema_route6 = new DresseurClassique ("alema", 0, 3, 2, Endroits.fin_route6, Titre.canon, Orientation.dos);
    public static DresseurClassique fillette_aya_route6 = new DresseurClassique ("aya", 0, 9, 7, Endroits.fin_route6, Titre.fillette, Orientation.dos);
    public static DresseurClassique commandant_lambda = new DresseurClassique ("lambda", 0, 3, 2, Endroits.cabine_capitaine_aquaria, Titre.commandant_rocket, Orientation.droite);
    public static ChampionArene major_bob = new ChampionArene ("Major Bob", 0, 0, 5, Endroits.salle_champion_arene_carmin_sur_mer, Badges.badgeFoudre, Orientation.face, Objets_CT_CS.ct01);
    public static DresseurClassique karateka1_arene_combat_safrania = new DresseurClassique ("karateka", 0, 3, 2, Endroits.bas_arene_combat_safrania, Titre.karateka, Orientation.droite);
    public static DresseurClassique karateka2_arene_combat_safrania = new DresseurClassique ("karateka", 0, 3, 2, Endroits.bas_arene_combat_safrania, Titre.karateka, Orientation.droite);
    public static DresseurClassique karateka3_arene_combat_safrania = new DresseurClassique ("karateka", 0, 3, 2, Endroits.bas_arene_combat_safrania, Titre.karateka, Orientation.droite);
    public static DresseurClassique karateka4_arene_combat_safrania = new DresseurClassique ("karateka", 0, 3, 2, Endroits.bas_arene_combat_safrania, Titre.karateka, Orientation.droite);
    public static ChampionArene karateka = new ChampionArene ("Karateka", 0, 0, 5, Endroits.salle_champion_arene_combat_safrania, Badges.badgeCombat, Orientation.face, Objets_CT_CS.ct01);
    public static DresseurClassique medium_lola_arene_morgane_safrania = new DresseurClassique ("lola", 0, 3, 2, Endroits.bas_arene_morgane_safrania, Titre.medium, Orientation.droite);
    public static DresseurClassique medium_irma_arene_morgane_safrania = new DresseurClassique ("irma", 0, 3, 2, Endroits.bas_arene_morgane_safrania, Titre.medium, Orientation.droite);
    public static DresseurClassique kinesiste_norbert_arene_morgane_safrania = new DresseurClassique ("norbert", 0, 3, 2, Endroits.bas_arene_morgane_safrania, Titre.kinesiste, Orientation.droite);
    public static DresseurClassique kinesiste_honore_arene_morgane_safrania = new DresseurClassique ("honoré", 0, 3, 2, Endroits.bas_arene_morgane_safrania, Titre.kinesiste, Orientation.droite);
    public static DresseurClassique exorciste_agathe_arene_morgane_safrania = new DresseurClassique ("agathe", 0, 3, 2, Endroits.bas_arene_morgane_safrania, Titre.exorciste, Orientation.droite);
    public static DresseurClassique exorciste_sylvie_arene_morgane_safrania = new DresseurClassique ("sylvie", 0, 3, 2, Endroits.bas_arene_morgane_safrania, Titre.exorciste, Orientation.droite);
    public static ChampionArene morgane = new ChampionArene ("Morgane", 0, 0, 5, Endroits.salle_champion_arene_morgane_safrania, Badges.badgeMarais, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene erika = new ChampionArene ("Erika", 0, 0, 5, Endroits.salle_champion_arene_erika_celadopole, Badges.badgePrisme, Orientation.face, Objets_CT_CS.ct01);
    public static DresseurClassique motard_bruno_route8 = new DresseurClassique ("Bruno", 0, 4, 3, Endroits.debut_route8, Titre.motard, Orientation.gauche);
    public static DresseurClassique motard_christophe_route8 = new DresseurClassique ("Christophe", 0, 6, 2, Endroits.debut_route8, Titre.motard, Orientation.droite);
    public static DresseurClassique motard_johnny_route8 = new DresseurClassique ("Johnny", 0, 5, 7, Endroits.debut_route8, Titre.motard, Orientation.gauche);
    public static DresseurClassique croupier_fred_route8 = new DresseurClassique ("fred", 0, 1, 9, Endroits.debut_route8, Titre.croupier, Orientation.face);
    public static DresseurClassique intello_edouard_route8 = new DresseurClassique ("Edouard", 0, 1, 2, Endroits.fin_route8, Titre.intello, Orientation.face);
    public static DresseurClassique intello_adrien_route8 = new DresseurClassique ("Adrien", 0, 3, 5, Endroits.fin_route8, Titre.intello, Orientation.gauche);
    public static DresseurClassique gentleman_ernest_route8 = new DresseurClassique ("Ernest", 0, 3, 8, Endroits.fin_route8, Titre.gentleman, Orientation.face);
    public static DresseurClassique pick_nick_edna_route9 = new DresseurClassique ("Edna", 0, 6, 4, Endroits.debut_route9, Titre.pick_nick, Orientation.dos);
    public static DresseurClassique campeur_claude_route9 = new DresseurClassique ("Claude", 0, 6, 6, Endroits.debut_route9, Titre.campeur, Orientation.dos);
    public static DresseurClassique gamin_loic_route9 = new DresseurClassique ("Loïc", 0, 6, 8, Endroits.debut_route9, Titre.gamin, Orientation.dos);
    public static DresseurClassique campeur_jeannot_route9 = new DresseurClassique ("Jeannot", 0, 4, 1, Endroits.milieu_route9, Titre.campeur, Orientation.droite);
    public static DresseurClassique montagnard_urbain_route9 = new DresseurClassique ("Urbain", 0, 6, 6, Endroits.milieu_route9, Titre.montagnard, Orientation.dos);
    public static DresseurClassique pick_nick_paule_route9 = new DresseurClassique ("Paule", 0, 3, 9, Endroits.milieu_route9, Titre.pick_nick, Orientation.face);
    public static DresseurClassique montagnard_herve_route9 = new DresseurClassique ("Hervé", 0, 6, 7, Endroits.fin_route9, Titre.montagnard, Orientation.dos);
    public static DresseurClassique gamin_romain_route9 = new DresseurClassique ("Romain", 0, 1, 9, Endroits.fin_route9, Titre.gamin, Orientation.face);
    public static DresseurClassique montagnard_eric_route10 = new DresseurClassique ("Eric", 0, 3, 1, Endroits.debut_route10, Titre.montagnard, Orientation.droite);
    public static DresseurClassique pokemaniac_jack_route10 = new DresseurClassique ("Jack", 0, 6, 4, Endroits.debut_route10, Titre.pokemaniac, Orientation.dos);
    public static DresseurClassique pokemaniac_gilles_route10 = new DresseurClassique ("Gilles", 0, 6, 5, Endroits.milieu_route10, Titre.pokemaniac, Orientation.dos);
    public static DresseurClassique montagnard_paul_route10 = new DresseurClassique ("Paul", 0, 3, 1, Endroits.milieu_route10, Titre.montagnard, Orientation.droite);
    public static DresseurClassique montagnard_albin_route10 = new DresseurClassique ("Albin", 0, 6, 2, Endroits.fin_route10, Titre.montagnard, Orientation.dos);
    public static DresseurClassique pokefan_rob_route10 = new DresseurClassique ("Rob", 0, 1, 9, Endroits.fin_route10, Titre.pokefan, Orientation.face);
    public static DresseurClassique montagnard_yvan_grotteSombre = new DresseurClassique ("Yvan", 0, 1, 4, Endroits.grotte_route10_rdc_p1, Titre.montagnard, Orientation.face);
    public static DresseurClassique karateka_ryan_grotteSombre = new DresseurClassique ("Ryan", 0, 4, 7, Endroits.grotte_route10_rdc_p1, Titre.karateka, Orientation.gauche);
    public static DresseurClassique montagnard_charles_grotteSombre = new DresseurClassique ("Charles", 0, 4, 2, Endroits.grotte_route10_rdc_p2, Titre.montagnard, Orientation.droite);
    public static DresseurClassique intelllo_kevin_grotteSombre = new DresseurClassique ("Kevin", 0, 6, 7, Endroits.grotte_route10_rdc_p2, Titre.intello, Orientation.dos);
    public static DresseurClassique pokemaniac_vladimir_grotteSombre = new DresseurClassique ("Vladimir", 0, 4, 1, Endroits.grotte_route10_ss_p1, Titre.pokemaniac, Orientation.droite);
    public static DresseurClassique karateka_chris_grotteSombre = new DresseurClassique ("Chris", 0, 6, 8, Endroits.grotte_route10_ss_p1, Titre.karateka, Orientation.dos);
    public static DresseurClassique pokemaniac_ted_grotteSombre = new DresseurClassique ("Ted", 0, 1, 5, Endroits.grotte_route10_ss_p2, Titre.pokemaniac, Orientation.face);
    public static DresseurClassique intello_bob_grotteSombre = new DresseurClassique ("Bob", 0, 4, 9, Endroits.grotte_route10_ss_p2, Titre.intello, Orientation.gauche);
    public static DresseurClassique pecheur_olive_route12 = new DresseurClassique ("olive", 0, 6, 2, Endroits.debut_route12, Titre.pecheur, Orientation.face);
    public static DresseurClassique pecheur_pascal_route12 = new DresseurClassique ("pascal", 0, 1, 6, Endroits.milieu_route12_1, Titre.pecheur, Orientation.face);
    public static DresseurClassique pecheur_simonin_route12 = new DresseurClassique ("simonin", 0, 3, 1, Endroits.milieu_route12_2, Titre.pecheur, Orientation.face);
    public static DresseurClassique pecheur_yvon_route12 = new DresseurClassique ("yvon", 0, 5, 1, Endroits.milieu_route12_6, Titre.pecheur, Orientation.droite);
    public static DresseurClassique pecheur_zachary_route12 = new DresseurClassique ("zachary", 0, 2, 8, Endroits.milieu_route12_7, Titre.pecheur, Orientation.droite);
    public static DresseurClassique ornithologue_guy_route12 = new DresseurClassique ("guy", 0, 6, 4, Endroits.milieu_route12_3, Titre.ornithologue, Orientation.dos);
    public static DresseurClassique jeune_couple_rio_kimber_route12 = new DresseurClassique ("rio & kimber", 0, 1, 4, Endroits.milieu_route12_4, Titre.jeune_couple, Orientation.face);
    public static DresseurClassique ornithologue_theophile_route12 = new DresseurClassique ("theophile", 0, 4, 4, Endroits.milieu_route12_5, Titre.ornithologue, Orientation.gauche);
    public static ChampionArene yas = new ChampionArene ("Yas", 0, 0, 5, Endroits.salle_champion_arene_yas_sombreville, Badges.badgeYas, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene kas = new ChampionArene ("Kas", 0, 0, 5, Endroits.salle_champion_arene_kas_sombreville, Badges.badgeKas, Orientation.face, Objets_CT_CS.ct01);
    public static DresseurClassique montagnard_gilles_route13 = new DresseurClassique ("gilles", 0, 3, 2, Endroits.debut_route13, Titre.montagnard, Orientation.droite);
    public static DresseurClassique ornithologue_bret_route13 = new DresseurClassique ("bret", 0, 1, 8, Endroits.milieu_route13_3, Titre.ornithologue, Orientation.face);
    public static DresseurClassique pique_nick_chloe_route13 = new DresseurClassique ("chloé", 0, 6, 5, Endroits.milieu_route13_3, Titre.pick_nick, Orientation.dos);
    public static DresseurClassique ornithologue_jeff_route13 = new DresseurClassique ("jeff", 0, 1, 3, Endroits.milieu_route13_3, Titre.ornithologue, Orientation.face);
    public static DresseurClassique jeune_couple_andre_tina_route13 = new DresseurClassique ("andré & tina", 0, 6, 8, Endroits.milieu_route13_4, Titre.jeune_couple, Orientation.dos);
    public static DresseurClassique pokefan_josh_route13 = new DresseurClassique ("josh", 0, 1, 5, Endroits.milieu_route13_4, Titre.pokefan, Orientation.face);
    public static DresseurClassique pokefan_adelin_route13 = new DresseurClassique ("adelin", 0, 6, 3, Endroits.milieu_route13_4, Titre.pokefan, Orientation.dos);
    public static DresseurClassique campeur_xavier_route13 = new DresseurClassique ("xavier", 0, 2, 9, Endroits.fin_route13, Titre.campeur, Orientation.gauche);
    public static DresseurClassique pique_nick_berta_route13 = new DresseurClassique ("berta", 0, 4, 1, Endroits.fin_route13, Titre.pick_nick, Orientation.droite);
    public static DresseurClassique campeur_gustave_route13 = new DresseurClassique ("gustave", 0, 6, 9, Endroits.fin_route13, Titre.campeur, Orientation.gauche);
    public static DresseurClassique eleve_julien_route14 = new DresseurClassique ("julien", 0, 1, 7, Endroits.debut_route14, Titre.ecolier, Orientation.face);
    public static DresseurClassique prof_euphrasie_route14 = new DresseurClassique ("euphrasie", 0, 6, 4, Endroits.debut_route14, Titre.prof, Orientation.dos);
    public static DresseurClassique eleve_justin_route14 = new DresseurClassique ("justin", 0, 1, 7, Endroits.milieu_route14_1, Titre.ecolier, Orientation.face);
    public static DresseurClassique eleve_claudius_route14 = new DresseurClassique ("claudius", 0, 6, 4, Endroits.milieu_route14_1, Titre.ecolier, Orientation.dos);
    public static DresseurClassique ornithologue_mamadou_route14 = new DresseurClassique ("mamadou", 0, 1, 6, Endroits.milieu_route14_2, Titre.ornithologue, Orientation.face);
    public static DresseurClassique pokefan_donald_route14 = new DresseurClassique ("donald", 0, 4, 1, Endroits.milieu_route14_2, Titre.pokefan, Orientation.droite);
    public static DresseurClassique pokefan_arnaut_route14 = new DresseurClassique ("arnaut", 0, 4, 4, Endroits.milieu_route14_3, Titre.pokefan, Orientation.gauche);
    public static DresseurClassique ornithologue_william_route14 = new DresseurClassique ("william", 0, 3, 6, Endroits.milieu_route14_3, Titre.ornithologue, Orientation.droite);
    public static DresseurClassique ornithologue_marc_route14 = new DresseurClassique ("marc", 0, 3, 1, Endroits.fin_route14, Titre.ornithologue, Orientation.droite);
    public static DresseurClassique pokefan_arsene_route14 = new DresseurClassique ("arsène", 0, 5, 9, Endroits.fin_route14, Titre.pokefan, Orientation.gauche);
    public static DresseurClassique eleve_cyril_route15 = new DresseurClassique ("cyril", 0, 3, 3, Endroits.debut_route15, Titre.ecolier, Orientation.face);
    public static DresseurClassique eleve_tommy_route15 = new DresseurClassique ("tommy", 0, 6, 7, Endroits.debut_route15, Titre.ecolier, Orientation.dos);
    public static DresseurClassique prof_josianne_route15 = new DresseurClassique ("josianne", 0, 3, 3, Endroits.milieu_route15_1, Titre.prof, Orientation.face);
    public static DresseurClassique pokefan_iban_route15 = new DresseurClassique ("iban", 0, 6, 7, Endroits.milieu_route15_1, Titre.pokefan, Orientation.dos);
    public static DresseurClassique eleve_nestor_route15 = new DresseurClassique ("nestor", 0, 1, 3, Endroits.milieu_route15_2, Titre.ecolier, Orientation.face);
    public static DresseurClassique eleve_bilhal_route15 = new DresseurClassique ("bilhal", 0, 6, 7, Endroits.milieu_route15_2, Titre.ecolier, Orientation.dos);
    public static DresseurClassique prof_colette_route15 = new DresseurClassique ("colette", 0, 1, 3, Endroits.milieu_route15_3, Titre.prof, Orientation.face);
    public static DresseurClassique jumelle_nini_nina_route15 = new DresseurClassique ("nini & nina", 0, 6, 7, Endroits.milieu_route15_3, Titre.jumelle, Orientation.dos);
    public static DresseurClassique pokefan_clemence_route15 = new DresseurClassique ("clémence", 0, 1, 3, Endroits.fin_route15, Titre.pokefan, Orientation.face);
    public static Topdresseur michael = new Topdresseur ("michael", 0, 3, 0, Endroits.salle_arene_evoli_manoir_rocheville, Orientation.face);
    public static Topdresseur sparky = new Topdresseur ("sparky", 0, 3, 0, Endroits.salle_arene_evoli_manoir_rocheville, Orientation.face);
    public static Topdresseur rainer = new Topdresseur ("rainer", 0, 3, 0, Endroits.salle_arene_evoli_manoir_rocheville, Orientation.face);
    public static Topdresseur pyro = new Topdresseur ("pyro", 0, 3, 0, Endroits.salle_arene_evoli_manoir_rocheville, Orientation.face);
    public static ChampionArene maitre_evoli = new ChampionArene ("Maitre evoli", 0, 0, 5, Endroits.salle_champion_arene_evoli_manoir_rocheville, Badges.badgeEvoli, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene koga = new ChampionArene ("Koga", 0, 0, 5, Endroits.salle_champion_arene_koga_parmanie, Badges.badgeAme, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene auguste = new ChampionArene ("Auguste", 0, 0, 5, Endroits.salle_champion_arene_auguste_cramois_ile, Badges.badgeVolcan, Orientation.face, Objets_CT_CS.ct01);
    public static Conseil4 olga = new Conseil4("Olga", 0, 3, 5, Endroits.salle_olga_batimentConseil4_ligue_pokemon_kanto, Orientation.face);
    public static Conseil4 aldo = new Conseil4("Aldo", 0, 3, 5, Endroits.salle_aldo_batimentConseil4_ligue_pokemon_kanto, Orientation.face);
    public static Conseil4 agatha = new Conseil4("Agatha", 0, 3, 5, Endroits.salle_agatha_batimentConseil4_ligue_pokemon_kanto, Orientation.face);
    public static Conseil4 peter = new Conseil4("Peter", 0, 3, 5, Endroits.salle_peter_batimentConseil4_ligue_pokemon_kanto, Orientation.face);
    public static Maitre regis = new Maitre("Regis", 0, 3, 5, Endroits.salle_regis_batimentConseil4_ligue_pokemon_kanto, Orientation.face);
    public static Maitre sacha = new Maitre("Sacha", 0, 3, 5, Endroits.salle_regis_batimentConseil4_ligue_pokemon_kanto, Orientation.face);
    /* Fin Kanto */
    
    /* Johto */
    public static DresseurClassique rival1Johto = new DresseurClassique ("gold", 0, 3, 6, null, Titre.rival, Orientation.droite, Sexe.garcon);
    public static DresseurClassique rival2Johto = new DresseurClassique ("crystal", 0, 3, 6, null, Titre.rival, Orientation.droite, Sexe.fille);
    public static DresseurClassique rival3Johto = new DresseurClassique ("silver", 0, 3, 6, null, Titre.rival, Orientation.droite, Sexe.garcon);
    
    public static DresseurClassique cassidy = new DresseurClassique ("Cassidy", 0, 0, 0, null, Titre.teamRocket, Orientation.face);
    public static DresseurClassique butch = new DresseurClassique ("Butch", 0, 0, 0, null, Titre.teamRocket, Orientation.face);
    
    public static DresseurClassique gaminNoahRoute29 = new DresseurClassique ("Noah", 0, 3, 7, Endroits.milieu_route29, Titre.gamin, Orientation.face);
    public static DresseurClassique gaminTimmyRoute29 = new DresseurClassique ("Timmy", 0, 3, 1, Endroits.milieu_route29, Titre.gamin, Orientation.face);
    public static DresseurClassique cathyRoute29 = new DresseurClassique ("Cathy", 0, 3, 10, Endroits.fin_route29, Titre.fillette, Orientation.droite);
    
    public static DresseurClassique gaminGaspardRoute30 = new DresseurClassique ("Gaspard", 0, 9, 6, Endroits.milieu_route30_2, Titre.gamin, Orientation.gauche);
    public static DresseurClassique gaminMarinRoute30 = new DresseurClassique ("Marin", 0, 5, 5, Endroits.milieu_route30_2, Titre.gamin, Orientation.gauche);
    public static DresseurClassique scoutJeanRaoulRoute30 = new DresseurClassique ("Jean-Raoul", 0, 5, 4, Endroits.fin_route30, Titre.scout, Orientation.droite);
    
    public static DresseurClassique scoutMaximeRoute31 = new DresseurClassique ("Maxime", 0, 9, 10, Endroits.fin_route31, Titre.scout, Orientation.dos);
    
    public static DresseurClassique sageQuentinTourChetiflor = new DresseurClassique ("Quentin", 0, 1, 0, Endroits.rc_tour_chetiflor, Titre.sage, Orientation.droite);
    public static DresseurClassique sageBriandTourChetiflor = new DresseurClassique ("Briand", 0, 5, 4, Endroits.etage1_tour_chetiflor, Titre.sage, Orientation.gauche);
    public static DresseurClassique sageHorstTourChetiflor = new DresseurClassique ("Horst", 0, 1, 7, Endroits.etage1_tour_chetiflor, Titre.sage, Orientation.face);
    public static DresseurClassique sageAlfonseTourChetiflor = new DresseurClassique ("Alfonse", 0, 5, 7, Endroits.etage2_tour_chetiflor, Titre.sage, Orientation.gauche);
    public static DresseurClassique sageAchilleTourChetiflor = new DresseurClassique ("Achille", 0, 4, 3, Endroits.etage2_tour_chetiflor, Titre.sage, Orientation.droite);
    public static DresseurClassique sageBatisteTourChetiflor = new DresseurClassique ("Batiste", 0, 3, 6, Endroits.etage2_tour_chetiflor, Titre.sage, Orientation.face);
    public static DresseurClassique ancienJehanTourChetiflor = new DresseurClassique ("Jehan", 0, 0, 3, Endroits.etage2_tour_chetiflor, Titre.ancien, Orientation.face);
    
    public static DresseurClassique ornithologue_ben_arene_albert_mauville = new DresseurClassique ("Ben", 0, 3, 3, Endroits.bas_arene_albert_mauville, Titre.ornithologue, Orientation.droite);
    public static DresseurClassique ornithologue_elie_arene_albert_mauville = new DresseurClassique ("Elie", 0, 2, 7, Endroits.bas_arene_albert_mauville, Titre.ornithologue, Orientation.gauche);
    public static ChampionArene albert = new ChampionArene ("Albert", 0, 0, 5, Endroits.salle_champion_arene_albert_mauville, Badges.badgeZephir, Orientation.face, Objets_CT_CS.ct01);
    
    public static DresseurClassique gaminRomeoRoute32 = new DresseurClassique ("Romeo", 0, 1, 13, Endroits.milieu_route32_2, Titre.gamin, Orientation.dos);
    public static DresseurClassique piqueNiqueElisabethRoute32 = new DresseurClassique ("Elisabeth", 0, 6, 10, Endroits.milieu_route32_2, Titre.pick_nick, Orientation.gauche);
    public static DresseurClassique pecheurLoicRoute32 = new DresseurClassique ("Loïc", 0, 5, 8, Endroits.milieu_route32_3, Titre.pecheur, Orientation.gauche);
    public static DresseurClassique pecheurCesarRoute32 = new DresseurClassique ("César", 0, 6, 9, Endroits.milieu_route32_3, Titre.pecheur, Orientation.face);
    public static DresseurClassique pecheurAuffrayRoute32 = new DresseurClassique ("Auffray", 0, 9, 12, Endroits.milieu_route32_3, Titre.pecheur, Orientation.dos);
    public static DresseurClassique campeurRaymondRoute32 = new DresseurClassique ("Raymond", 0, 8, 3, Endroits.milieu_route32_3, Titre.campeur, Orientation.dos);
    public static DresseurClassique gaminMomoRoute32 = new DresseurClassique ("Momo", 0, 5, 8, Endroits.milieu_route32_4, Titre.gamin, Orientation.gauche);
    public static DresseurClassique ornithologueJoeRoute32 = new DresseurClassique ("Joe", 0, 6, 9, Endroits.fin_route32, Titre.ornithologue, Orientation.dos);
    
    public static DresseurClassique cracheFeuLuigiCavesJumelle = new DresseurClassique ("Luigi", 0, 1, 3, Endroits.caves_jumelle_rdc_p1, Titre.crache_feu, Orientation.face);
    public static DresseurClassique montagnardSammyCavesJumelle = new DresseurClassique ("Sammy", 0, 1, 1, Endroits.caves_jumelle_rdc_p2, Titre.montagnard, Orientation.droite);
    public static DresseurClassique montagnardAbelardCavesJumelle = new DresseurClassique ("Abélard", 0, 1, 6, Endroits.caves_jumelle_rdc_p2, Titre.montagnard, Orientation.face);
    public static DresseurClassique cracheFeuAndreaCavesJumelle = new DresseurClassique ("Andréa", 0, 0, 8, Endroits.caves_jumelle_rdc_p3, Titre.crache_feu, Orientation.face);
    public static DresseurClassique pokemaniacRaynalCavesJumelle = new DresseurClassique ("Raynal", 0, 2, 4, Endroits.caves_jumelle_rdc_p3, Titre.pokemaniac, Orientation.face);
    
    public static DresseurClassique montagnardMarioRoute33 = new DresseurClassique ("Mario", 0, 4, 4, Endroits.debut_route33, Titre.montagnard, Orientation.face);
    
    public static DresseurClassique jumelleLiaLizAreneEcorcia = new DresseurClassique ("Lia & Liz", 0, 2, 4, Endroits.bas_arene_hector_ecorcia, Titre.jumelle, Orientation.face);
    public static DresseurClassique scoutArnaudAreneEcorcia = new DresseurClassique ("Arnaud", 0, 2, 4, Endroits.bas_arene_hector_ecorcia, Titre.scout, Orientation.face);
    public static DresseurClassique scoutFoulqueAreneEcorcia = new DresseurClassique ("Foulque", 0, 2, 4, Endroits.bas_arene_hector_ecorcia, Titre.scout, Orientation.face);
    public static DresseurClassique scoutJeanLoicAreneEcorcia = new DresseurClassique ("Jean-loïc", 0, 2, 4, Endroits.bas_arene_hector_ecorcia, Titre.scout, Orientation.face);
    public static ChampionArene hector = new ChampionArene ("Hector", 0, 0, 5, Endroits.bas_arene_hector_ecorcia, Badges.badgeEssaim, Orientation.face, Objets_CT_CS.ct01);
    
    public static DresseurClassique gaminGontranRoute34 = new DresseurClassique ("Gontran", 0, 4, 6, Endroits.fin_route34, Titre.gamin, Orientation.face);
    public static DresseurClassique pokefanBrandonRoute34 = new DresseurClassique ("Brandon", 0, 6, 9, Endroits.milieu_route34, Titre.pokefan, Orientation.gauche);
    public static DresseurClassique piqueNiqueGinaRoute34 = new DresseurClassique ("Gina", 0, 5, 3, Endroits.milieu_route34, Titre.pick_nick, Orientation.droite);
    public static DresseurClassique gaminIanRoute34 = new DresseurClassique ("Ian", 0, 2, 7, Endroits.milieu_route34, Titre.gamin, Orientation.face);
    public static DresseurClassique agentNicolasRoute34 = new DresseurClassique ("Nicolas", 0, 4, 3, Endroits.debut_route34, Titre.agent, Orientation.face);
    public static DresseurClassique campeurMatthiasRoute34 = new DresseurClassique ("Matthias", 0, 2, 3, Endroits.debut_route34, Titre.campeur, Orientation.gauche);
    
    public static DresseurClassique canonVictoriaAreneDoublonville = new DresseurClassique ("Victoria", 0, 2, 4, Endroits.bas_arene_blanche_doublonville, Titre.canon, Orientation.face);
    public static DresseurClassique canonCarlaAreneDoublonville = new DresseurClassique ("Carla", 0, 2, 4, Endroits.bas_arene_blanche_doublonville, Titre.canon, Orientation.face);
    public static DresseurClassique filletteJenniferAreneDoublonville = new DresseurClassique ("Jennifer", 0, 2, 4, Endroits.bas_arene_blanche_doublonville, Titre.fillette, Orientation.face);
    public static DresseurClassique filletteBarbaraAreneDoublonville = new DresseurClassique ("Barbara", 0, 2, 4, Endroits.bas_arene_blanche_doublonville, Titre.fillette, Orientation.face);
    public static ChampionArene blanche = new ChampionArene ("Blanche", 0, 0, 5, Endroits.salle_champion_arene_blanche_doublonville, Badges.badgePlaine, Orientation.face, Objets_CT_CS.ct01);
    
    public static DresseurClassique piqueNiqueKalaRoute35 = new DresseurClassique ("Kala", 0, 3, 1, Endroits.debut_route35, Titre.pick_nick, Orientation.droite);
    public static DresseurClassique ornithologueGregRoute35 = new DresseurClassique ("Greg", 0, 5, 4, Endroits.debut_route35, Titre.ornithologue, Orientation.face);
    public static DresseurClassique piqueNiqueBrookeRoute35 = new DresseurClassique ("Brooke", 0, 0, 4, Endroits.milieu_route35, Titre.pick_nick, Orientation.face);
    public static DresseurClassique campeurAmilcarRoute35 = new DresseurClassique ("Amilcar", 0, 0, 5, Endroits.milieu_route35, Titre.campeur, Orientation.face);
    public static DresseurClassique agentBaptisteRoute35 = new DresseurClassique ("Baptiste", 0, 0, 3, Endroits.fin_route35, Titre.agent, Orientation.face);
    public static DresseurClassique scoutHenriRoute35 = new DresseurClassique ("Henri", 0, 1, 8, Endroits.fin_route35, Titre.scout, Orientation.face);
    public static DresseurClassique cracheFeuBimboRoute35 = new DresseurClassique ("Bimbo", 0, 3, 1, Endroits.fin_route35, Titre.crache_feu, Orientation.droite);
    public static DresseurClassique jongleurAnthonyRoute35 = new DresseurClassique ("Anthony", 0, 4, 3, Endroits.fin_route35, Titre.jongleur, Orientation.gauche);
    public static DresseurClassique campeurYvanRoute35 = new DresseurClassique ("Yvan", 0, 6, 1, Endroits.fin_route35, Titre.campeur, Orientation.droite);
    
    public static DresseurClassique eleveAimeRoute36 = new DresseurClassique ("Aimé", 0, 5, 4, Endroits.milieu_route36, Titre.ecolier, Orientation.face);
    public static DresseurClassique kinesisteFreddyRoute36 = new DresseurClassique ("Freddy", 0, 3, 4, Endroits.debut_route36, Titre.kinesiste, Orientation.droite);
    
    public static ChampionArene Mortimer = new ChampionArene ("Mortimer", 0, 0, 5, Endroits.bas_arene_mortimer_rosalia, Badges.badgeBrume, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene jasmine = new ChampionArene ("Jasmine", 0, 0, 5, Endroits.bas_arene_jasmine_oliville, Badges.badgeMineral, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene chuck = new ChampionArene ("Chuck", 0, 0, 5, Endroits.bas_arene_chuck_irisia, Badges.badgeSauvage, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene fredo = new ChampionArene ("Fredo", 0, 0, 5, Endroits.bas_arene_fredo_acajou, Badges.badgeGlacier, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene sandra = new ChampionArene ("Sandra", 0, 0, 5, Endroits.bas_arene_sandra_ebenelle, Badges.badgeLever, Orientation.face, Objets_CT_CS.ct01);
    /* Fin Johto */
    
    /* Hoenn */
    public static DresseurClassique rival1Hoenn = new DresseurClassique ("rubis", 0, 3, 6, null, Titre.rival, Orientation.droite);
    public static DresseurClassique rival2Hoenn = new DresseurClassique ("grenat", 0, 3, 6, null, Titre.rival, Orientation.droite);
    public static DresseurClassique rival3Hoenn = new DresseurClassique ("saphir", 0, 3, 6, null, Titre.rival, Orientation.droite);
    public static ChampionArene roxanne = new ChampionArene ("Roxanne", 0, 0, 5, Endroits.bas_arene_roxanne_merouville, Badges.badgeRoche2, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene bastien = new ChampionArene ("Bastien", 0, 0, 5, Endroits.bas_arene_bastien_village_myokara, Badges.badgePoing, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene voltere = new ChampionArene ("Voltère", 0, 0, 5, Endroits.bas_arene_voltere_lavandia, Badges.badgeDynamo, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene adriane = new ChampionArene ("Adriane", 0, 0, 5, Endroits.bas_arene_adriane_vermilava, Badges.badgeChaleur, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene norman = new ChampionArene ("Norman", 0, 0, 5, Endroits.bas_arene_norman_clementi_ville, Badges.badgeBalancier, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene alizee = new ChampionArene ("Alizée", 0, 0, 5, Endroits.bas_arene_alizee_cimetronelle, Badges.badgePlume, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene levy_tatia = new ChampionArene ("Lévy & Tatia", 0, 0, 5, Endroits.bas_arene_levy_tatia_algatia, Badges.badgeEsprit, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene juan = new ChampionArene ("Juan", 0, 0, 5, Endroits.bas_arene_juan_atalanopolis, Badges.badgePluie, Orientation.face, Objets_CT_CS.ct01);
    /* Fin Hoenn */
    
    /* Sinnoh */
    public static DresseurClassique rival1Sinnoh = new DresseurClassique ("diamond", 0, 3, 6, null, Titre.rival, Orientation.droite);
    public static DresseurClassique rival2Sinnoh = new DresseurClassique ("pearl", 0, 3, 6, null, Titre.rival, Orientation.droite);
    public static DresseurClassique rival3Sinnoh = new DresseurClassique ("Rival3", 0, 3, 6, null, Titre.rival, Orientation.droite);
    public static ChampionArene pierrick = new ChampionArene ("Pierrick", 0, 0, 5, Endroits.bas_arene_pierrick_charbourg, Badges.badgeCharbon, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene flo = new ChampionArene ("Flo", 0, 0, 5, Endroits.bas_arene_flo_vestigon, Badges.badgeForet, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene melina = new ChampionArene ("Mélina", 0, 0, 5, Endroits.bas_arene_melina_voilaroc, Badges.badgePave, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene lovis = new ChampionArene ("Lovis", 0, 0, 5, Endroits.bas_arene_lovis_verchamps, Badges.badgePalustre, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene kimera = new ChampionArene ("Kiméra", 0, 0, 5, Endroits.bas_arene_kimera_unionpolis, Badges.badgeFantome, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene charles = new ChampionArene ("Charles", 0, 0, 5, Endroits.bas_arene_charles_joliberges, Badges.badgeMine, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene gladys = new ChampionArene ("Gladys", 0, 0, 5, Endroits.bas_arene_gladys_frimapic, Badges.badgeGlacon, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene tanguy = new ChampionArene ("Tanguy", 0, 0, 5, Endroits.bas_arene_tanguy_rivamar, Badges.badgePhare, Orientation.face, Objets_CT_CS.ct01);
    /*Fin Sinnoh */
    
    /* Ile orange */
    public static ChampionArene cissy = new ChampionArene ("Cissy", 0, 0, 5, Endroits.bas_arene_cissy_ile_dame_blanche, Badges.badgeOeilCorail, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene danny = new ChampionArene ("Danny", 0, 0, 5, Endroits.bas_arene_danny_ile_double_chantilly, Badges.badgeRubisMer, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene rudy = new ChampionArene ("rudy", 0, 0, 5, Endroits.bas_arene_rudy_ile_tartofou, Badges.badgePicoquille, Orientation.face, Objets_CT_CS.ct01);
    public static ChampionArene luana = new ChampionArene ("luana", 0, 0, 5, Endroits.bas_arene_luana_ile_citrus, Badges.badgeEtoileJade, Orientation.face, Objets_CT_CS.ct01);
    /* Ile Orange */
    
    public static DresseurClassique mike = new DresseurClassique("Mike", 0, 0, 0, null, Titre.DresseurPokemon, 10, Orientation.face);
    public static ChampionArene pierreTournoi = new ChampionArene("Pierre", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene ondineTournoi = new ChampionArene("Ondine", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene majorBobTournoi = new ChampionArene("Major Bob", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene erikaTournoi = new ChampionArene("Erika", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene karatekaTournoi = new ChampionArene("Karateka", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene morganeTournoi = new ChampionArene("Morgane", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene yasTournoi = new ChampionArene("Yas", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene kasTournoi = new ChampionArene("Kas", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene kogaTournoi = new ChampionArene("Koga", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene augusteTournoi = new ChampionArene("Auguste", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene giovanieTournoi = new ChampionArene("Giovanie", 0, 0, 0, null, null, Orientation.face, null);
    public static Conseil4 olgaTournoi = new Conseil4("Olga", 0, 0, 0, null, Orientation.face);
    public static Conseil4 aldoTournoi = new Conseil4("Aldo", 0, 0, 0, null, Orientation.face);
    public static Conseil4 agathaTournoi = new Conseil4("Agatha", 0, 0, 0, null, Orientation.face);
    public static Maitre peterTournoi = new Maitre("Peter", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress1Tournoi = new Topdresseur("Dress1", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress2Tournoi = new Topdresseur("Dress2", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress3Tournoi = new Topdresseur("Dress3", 0, 0, 0, null, Orientation.face);
    public static Rival richisTournoi = new Rival("Richie", 0, 0, 0, null, Orientation.face);
    public static Rival sachaTournoi = new Rival("Sacha", 0, 0, 0, null, Orientation.face);
    public static Rival goldTournoi = new Rival("Gold", 0, 0, 0, null, Orientation.face);
    public static Rival silverTournoi = new Rival("Silver", 0, 0, 0, null, Orientation.face);
    public static Rival regisTournoi = new Rival("Regis", 0, 0, 0, null, Orientation.face);
    
    public static Topdresseur mark_ligue_pokemon_kanto = new Topdresseur("Mark l'epoustouflant", 0, 0, 0, null, Orientation.face);
    public static Topdresseur eric_ligue_pokemon_kanto = new Topdresseur("Eric de granite", 0, 0, 0, null, Orientation.face);
    public static Topdresseur melissa_ligue_pokemon_kanto = new Topdresseur("Melissa", 0, 0, 0, null, Orientation.face);
    public static Topdresseur janette_ligue_pokemon_kanto = new Topdresseur("Janette Olsec", 0, 0, 0, null, Orientation.face);
    public static Maitre asunta_ligue_pokemon_kanto = new Maitre("Asunta", 0, 0, 0, null, Orientation.face);
    public static ChampionArene pierre_ligue_pokemon_kanto = new ChampionArene("Pierre", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene ondine_ligue_pokemon_kanto = new ChampionArene("Ondine", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene majorBob_ligue_pokemon_kanto = new ChampionArene("Major Bob", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene erika_ligue_pokemon_kanto = new ChampionArene("Erika", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene karateka_ligue_pokemon_kanto = new ChampionArene("Karateka", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene morgane_ligue_pokemon_kanto = new ChampionArene("Morgane", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene yas_ligue_pokemon_kanto = new ChampionArene("Yas", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene kas_ligue_pokemon_kanto = new ChampionArene("Kas", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene maitreEvoli_ligue_pokemon_kanto = new ChampionArene("Maitre evoli", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene koga_ligue_pokemon_kanto = new ChampionArene("Koga", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene auguste_ligue_pokemon_kanto = new ChampionArene("Auguste", 0, 0, 0, null, null, Orientation.face, null);
    public static ChampionArene giovanie_ligue_pokemon_kanto = new ChampionArene("Giovanie", 0, 0, 0, null, null, Orientation.face, null);
    public static Conseil4 olga_ligue_pokemon_kanto = new Conseil4("Olga", 0, 0, 0, null, Orientation.face);
    public static Conseil4 aldo_ligue_pokemon_kanto = new Conseil4("Aldo", 0, 0, 0, null, Orientation.face);
    public static Conseil4 agatha_ligue_pokemon_kanto = new Conseil4("Agatha", 0, 0, 0, null, Orientation.face);
    public static Maitre peter_ligue_pokemon_kanto = new Maitre("Peter", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress1Mewtwo_ligue_pokemon_kanto = new Topdresseur("Dress1", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress2Mewtwo_ligue_pokemon_kanto = new Topdresseur("Dress2", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress3Mewtwo_ligue_pokemon_kanto = new Topdresseur("Dress3", 0, 0, 0, null, Orientation.face);
    public static Rival richis_ligue_pokemon_kanto = new Rival("Richie", 0, 0, 0, null, Orientation.face);
    public static Rival sacha_ligue_pokemon_kanto = new Rival("Sacha", 0, 0, 0, null, Orientation.face);
    public static Rival regis_ligue_pokemon_kanto = new Rival("Regis", 0, 0, 0, null, Orientation.face);
    public static Rival rival1_ligue_pokemon_kanto = new Rival("Rival 1", 0, 0, 0, null, Orientation.face);
    public static Rival rival2_ligue_pokemon_kanto = new Rival("Rival 2", 0, 0, 0, null, Orientation.face);
    public static Rival samourai_ligue_pokemon_kanto = new Rival("Samourai", 0, 0, 0, null, Orientation.face);
    public static Rival albert_ligue_pokemon_kanto = new Rival("Albert", 0, 0, 0, null, Orientation.face);
    public static Rival damien_ligue_pokemon_kanto = new Rival("Damien", 0, 0, 0, null, Orientation.face);
    public static Rival catherine_ligue_pokemon_kanto = new Rival("Catherine", 0, 0, 0, null, Orientation.face);
    public static Rival cyclo_ligue_pokemon_kanto = new Rival("Cyclo", 0, 0, 0, null, Orientation.face);
    public static Rival dario_ligue_pokemon_kanto = new Rival("Dario", 0, 0, 0, null, Orientation.face);
    public static Rival duplica_ligue_pokemon_kanto = new Rival("Duplicata", 0, 0, 0, null, Orientation.face);
    public static Rival giselle_ligue_pokemon_kanto = new Rival("Giselle", 0, 0, 0, null, Orientation.face);
    public static Rival lara_ligue_pokemon_kanto = new Rival("Lara Larami", 0, 0, 0, null, Orientation.face);
    public static Rival stella_ligue_pokemon_kanto = new Rival("Stella", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress1_ligue_pokemon_kanto = new Topdresseur("Dress1", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress2_ligue_pokemon_kanto = new Topdresseur("Dress2", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress3_ligue_pokemon_kanto = new Topdresseur("Dress3", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress4_ligue_pokemon_kanto = new Topdresseur("Dress4", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress5_ligue_pokemon_kanto = new Topdresseur("Dress5", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress6_ligue_pokemon_kanto = new Topdresseur("Dress6", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress7_ligue_pokemon_kanto = new Topdresseur("Dress7", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress8_ligue_pokemon_kanto = new Topdresseur("Dress8", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress9_ligue_pokemon_kanto = new Topdresseur("Dress9", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress10_ligue_pokemon_kanto = new Topdresseur("Dress10", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress11_ligue_pokemon_kanto = new Topdresseur("Dress11", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress12_ligue_pokemon_kanto = new Topdresseur("Dress12", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress13_ligue_pokemon_kanto = new Topdresseur("Dress13", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress14_ligue_pokemon_kanto = new Topdresseur("Dress14", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress15_ligue_pokemon_kanto = new Topdresseur("Dress15", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress16_ligue_pokemon_kanto = new Topdresseur("Dress16", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress17_ligue_pokemon_kanto = new Topdresseur("Dress17", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress18_ligue_pokemon_kanto = new Topdresseur("Dress18", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress19_ligue_pokemon_kanto = new Topdresseur("Dress19", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress20_ligue_pokemon_kanto = new Topdresseur("Dress20", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress21_ligue_pokemon_kanto = new Topdresseur("Dress21", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress22_ligue_pokemon_kanto = new Topdresseur("Dress22", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress23_ligue_pokemon_kanto = new Topdresseur("Dress23", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress24_ligue_pokemon_kanto = new Topdresseur("Dress24", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress25_ligue_pokemon_kanto = new Topdresseur("Dress25", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress26_ligue_pokemon_kanto = new Topdresseur("Dress26", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress27_ligue_pokemon_kanto = new Topdresseur("Dress27", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress28_ligue_pokemon_kanto = new Topdresseur("Dress28", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress29_ligue_pokemon_kanto = new Topdresseur("Dress29", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress30_ligue_pokemon_kanto = new Topdresseur("Dress30", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress31_ligue_pokemon_kanto = new Topdresseur("Dress31", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress32_ligue_pokemon_kanto = new Topdresseur("Dress32", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress33_ligue_pokemon_kanto = new Topdresseur("Dress33", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress34_ligue_pokemon_kanto = new Topdresseur("Dress34", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress35_ligue_pokemon_kanto = new Topdresseur("Dress35", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress36_ligue_pokemon_kanto = new Topdresseur("Dress36", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress37_ligue_pokemon_kanto = new Topdresseur("Dress37", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress38_ligue_pokemon_kanto = new Topdresseur("Dress38", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress39_ligue_pokemon_kanto = new Topdresseur("Dress39", 0, 0, 0, null, Orientation.face);
    public static Topdresseur dress40_ligue_pokemon_kanto = new Topdresseur("Dress40", 0, 0, 0, null, Orientation.face);
}

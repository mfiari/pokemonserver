/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.TypeBatiment;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.core.tournoi.NiveauTournoi;
import mfiari.pokemon.core.ville.Batiment;
import mfiari.pokemon.core.ville.BatimentTournoi;
import mfiari.pokemon.core.ville.CentrePokemon;
import mfiari.pokemon.core.ville.Magasin;
import mfiari.pokemon.core.ville.Maison;
import mfiari.pokemon.core.ville.Pays;
import mfiari.pokemon.core.ville.Quartier;
import mfiari.pokemon.core.ville.Salle;
import mfiari.pokemon.core.ville.SousZone;
import mfiari.pokemon.core.ville.Terrains;
import mfiari.pokemon.core.ville.Ville;
import mfiari.pokemon.core.ville.Zone;
import mfiari.pokemon.core.type.TypeTournoi;
import mfiari.pokemon.core.ville.ArenePkmn;
import mfiari.pokemon.core.ville.Gare;
import mfiari.pokemon.core.ville.Grotte;

/**
 *
 * @author mike
 */
public class Endroits {
    
    public static String bourgPalette_kanto = "bourg_palette";
    
    public static Pays Kanto = new Pays("kanto", 5, 3, 12, 12);
    public static Zone zoneDebut_kanto = new Zone("zone de debut", 0, 0, 3, 2);
    public static SousZone zoneBourgPalette_zoneDebut_kanto = new SousZone("zone de bourg palette", 1, 1, 10, 6);
    
    public static Ville bourgPalette = new Ville("Bourg Palette", 2, 6, 1, 3);
    public static Quartier quartierDresseur_bourgPalette = new Quartier("quartier Dresseur bourg palette", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonRival1_quartierDresseur_bourgPalette = new Maison("maison de Rival1", 2, 3, 1, 1, 1, Orientation.face, 
            Endroits.quartierDresseur_bourgPalette, false);
    public static Salle bas_maisonRival1_quartierDresseur_bourgPalette = new Salle("rez de chausse maison Rival1", 0, 0, 10, 7, 
            Endroits.maisonRival1_quartierDresseur_bourgPalette, 0);
    public static Salle chambreRival1_maisonRival1_quartierDresseur_bourgPalette = new Salle("chambre de Rival1", 0, 0, 10, 7, 
            Endroits.maisonRival1_quartierDresseur_bourgPalette, 1);
    public static Maison maisonRival2_quartierDresseur_bourgPalette = new Maison("maison de Rival2", 2, 8, 1, 1, 1, Orientation.face, 
            Endroits.quartierDresseur_bourgPalette, false);
    public static Salle bas_maisonRival2_quartierDresseur_bourgPalette = new Salle("rez de chausse maison Rival2", 0, 0, 10, 7, 
            Endroits.maisonRival2_quartierDresseur_bourgPalette, 0);
    public static Salle chambreRival2_maisonRival2_quartierDresseur_bourgPalette = new Salle("chambre de Rival2", 0, 0, 10, 7, 
            Endroits.maisonRival2_quartierDresseur_bourgPalette, 0);
    public static Maison maisonRival3_quartierDresseur_bourgPalette = new Maison("maison de Rival3", 4, 1, 1, 1, 1, Orientation.face, 
            Endroits.quartierDresseur_bourgPalette, false);
    public static Salle bas_maisonRival3_quartierDresseur_bourgPalette = new Salle("rez de chausse maison Rival3", 0, 0, 10, 7, 
            Endroits.maisonRival3_quartierDresseur_bourgPalette, 0);
    public static Salle chambreRival3_maisonRival3_quartierDresseur_bourgPalette = new Salle("chambre de Rival3", 0, 0, 10, 7, 
            Endroits.maisonRival3_quartierDresseur_bourgPalette, 0);
    public static Maison maisonSacha_quartierDresseur_bourgPalette = new Maison("maison de Sacha", 4, 6, 1, 1, 1, Orientation.face, 
            Endroits.quartierDresseur_bourgPalette, false);
    public static Salle bas_maisonSacha_quartierDresseur_bourgPalette = new Salle("rez de chausse maison Sacha", 0, 0, 10, 7, 
            Endroits.maisonSacha_quartierDresseur_bourgPalette, 0);
    public static Salle chambreSacha_maisonSacha_quartierDresseur_bourgPalette = new Salle("chambre de Sacha", 0, 0, 10, 7, 
            Endroits.maisonSacha_quartierDresseur_bourgPalette, 0);
    public static Maison maisonRegis_quartierDresseur_bourgPalette = new Maison("maison de Regis", 4, 8, 1, 1, 1, Orientation.face, 
            Endroits.quartierDresseur_bourgPalette, false);
    public static Salle bas_maisonRegis_quartierDresseur_bourgPalette = new Salle("rez de chausse maison Regis", 0, 0, 10, 7, 
            Endroits.maisonRegis_quartierDresseur_bourgPalette, 0);
    public static Salle chambreRegis_maisonRegis_quartierDresseur_bourgPalette = new Salle("chambre de Regis", 0, 0, 10, 7, 
            Endroits.maisonRegis_quartierDresseur_bourgPalette, 0);
    public static Quartier quartierHabitant_bourgPalette = new Quartier("quartier habitant bourg palette", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierHabitant_bourgPalette = new Maison("maison habitant", 2, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_bourgPalette, true);
    public static CentrePokemon centrepokemon_bourgPalette = new CentrePokemon("centre pokemon", 4, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_bourgPalette);
    public static Magasin shop_bourgPalette = new Magasin("shop", 1, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_bourgPalette);
    public static Maison maisonProfChen_quartierHabitant_bourgPalette = new Maison("maison prof chen", 3, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_bourgPalette, true);
    public static BatimentTournoi salleTournoiPokemonNormal_bourgPalette = new BatimentTournoi("Tournoi pokemon normal", 1, 9, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierHabitant_bourgPalette, TypeTournoi.normal, NiveauTournoi.gamin, NiveauTournoi.topDresseur);
    public static Quartier quartierLabo_bourgPalette = new Quartier("quartier labo bourg palette", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment laboProfChen_quartierLabo_bourgPalette = new Batiment("Labo du prof chen", 2, 7, 1, 1, 0, 1,Orientation.face, 
            Endroits.quartierLabo_bourgPalette, TypeBatiment.labo);
    public static Salle bas_laboProfChen_quartierLabo_bourgPalette = new Salle("rez de chausse labo prof chen", 0, 0, 10, 7, 
            Endroits.laboProfChen_quartierLabo_bourgPalette, 0);
    public static Quartier quartierParcLaboProfChen_bourgPalette = new Quartier("quartier parc labo prof chen bourg palette", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route1 = new Ville("Route 1", 2, 5, 1, 3);
    public static Quartier debut_route1 = new Quartier("debut route 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route1 = new Quartier("milieu route 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route1 = new Quartier("fin route 1", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville jadielle = new Ville("Jadielle", 2, 4, 1, 3);
    public static Quartier quartierBoutique_jadielle = new Quartier("quartier boutique jadielle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_jadielle = new CentrePokemon("centre pokemon", 5, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_jadielle);
    public static Magasin shop_jadielle = new Magasin("shop", 2, 9, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_jadielle);
    public static Maison maisonHabitant_quartierBoutique_jadielle = new Maison("maison habitant", 2, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_jadielle, true);
    public static Quartier quartierArene_jadielle = new Quartier("quartier arène jadielle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant_quartierArene_jadielle = new Maison("maison habitant", 4, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_jadielle, true);
    public static ArenePkmn arene_jadielle = new ArenePkmn("arène de jadielle", 2, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_jadielle);
    public static Salle salle1_arene_jadielle = new Salle("salle1 arène de jadielle", 0, 0, 10, 7, 
            Endroits.arene_jadielle, 0, Terrains.terrainSol);
    public static Salle salle2_arene_jadielle = new Salle("salle 2 arène de jadielle", 0, 0, 10, 7, 
            Endroits.arene_jadielle, 0, Terrains.terrainSol);
    public static Salle salle_champion_arene_jadielle = new Salle("salle champion arène de jadielle", 0, 0, 10, 7, 
            Endroits.arene_jadielle, 0, Terrains.terrainSol);
    public static BatimentTournoi salleTournoi_quartierArene_jadielle = new BatimentTournoi("Tournoi pokemon sol", 4, 9, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierArene_jadielle, TypeTournoi.sol, NiveauTournoi.dresseurPkmn);
    
    public static Ville route22 = new Ville("Route 22", 10, 11, 1, 3);
    public static Quartier debut_route22 = new Quartier("debut route 22", 0, 0, 10, 11, Terrains.terrainNormal);
    public static Quartier milieu_route22 = new Quartier("milieu route 22", 0, 0, 8, 11, Terrains.terrainNormal);
    public static Quartier fin_route22 = new Quartier("fin route 22", 0, 0, 7, 11, Terrains.terrainNormal);
    public static Maison passageLigue_route22 = new Maison("passage ligue", 0, 3, 1, 1, 0, Orientation.face, 
            Endroits.fin_route22, false);
    
    public static Ville route2 = new Ville("Route 2", 10, 11, 1, 3);
    public static Quartier debut_route2 = new Quartier("debut route 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route2 = new Quartier("milieu route 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route2 = new Quartier("fin route 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte cave_taupiqueur_route2 = new Grotte("Cave taupiqueur route 2", 1, 8, 1, 1, 0, Orientation.face, Endroits.fin_route2);
    
    public static Ville foretDeJade = new Ville("foret de jade", 10, 11, 1, 3);
    public static Quartier foretDeJade1 = new Quartier("foret de jade 1", 0, 0, 11, 8, Terrains.terrainInsecte);
    public static Quartier foretDeJade2 = new Quartier("foret de jade 2", 0, 0, 11, 8, Terrains.terrainInsecte);
    public static Quartier foretDeJade3 = new Quartier("foret de jade 3", 0, 0, 11, 8, Terrains.terrainInsecte);
    public static Quartier foretDeJade4 = new Quartier("foret de jade 4", 0, 0, 11, 8, Terrains.terrainInsecte);
    
    public static Ville argenta = new Ville("Argenta", 10, 11, 1, 3);
    public static Quartier quartierBoutique_argenta = new Quartier("quartier boutique argenta", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_argenta = new CentrePokemon("centre pokemon", 1, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_argenta);
    public static Maison maisonHabitant_quartierBoutique_argenta = new Maison("maison habitant", 4, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_argenta, true);
    public static BatimentTournoi salleTournoi_quartierBoutique_argenta = new BatimentTournoi("Tournoi pokemon roche", 3, 8, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierBoutique_argenta, TypeTournoi.roche, NiveauTournoi.dresseurPkmn);
    public static Salle bas_salleTournoi_quartierBoutique_argenta = new Salle("rez de chausse maison habitant", 0, 0, 6, 5, 
            Endroits.salleTournoi_quartierBoutique_argenta, 0);
    public static Quartier quartierArene_argenta = new Quartier("quartier arène argenta", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_argenta = new Magasin("shop", 4, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_argenta);
    public static Maison maisonHabitant_quartierArene_argenta = new Maison("maison habitant", 1, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_argenta, true);
    public static ArenePkmn arene_argenta = new ArenePkmn("arène de argenta", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_argenta);
    public static Salle bas_arene_argenta = new Salle("rez de chausse arène de argenta", 0, 0, 10, 7, 
            Endroits.arene_argenta, 0, Terrains.terrainRoche);
    public static Salle salle_champion_arene_argenta = new Salle("salle champion arène d'argenta", 0, 0, 10, 7, 
            Endroits.arene_argenta, 0, Terrains.terrainRoche);
    public static Maison musee_argenta = new Maison("musée", 0, 4, 1, 1, 0, Orientation.face, Endroits.quartierArene_argenta, false);
    public static Salle bas_musee_argenta = new Salle("rez de chausse musée", 0, 0, 6, 5, Endroits.musee_argenta, 0);
    
    public static Ville route3 = new Ville("Route 3", 10, 11, 1, 3);
    public static Quartier debut_route3 = new Quartier("debut route 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route3_1 = new Quartier("milieu route 3 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route3_2 = new Quartier("milieu route 3 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route3 = new Quartier("fin route 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_route3 = new CentrePokemon("centre pokemon", 1, 5, 1, 1, 0, Orientation.face, Endroits.fin_route3);
    
    public static Ville route4 = new Ville("Route 4", 10, 11, 1, 3);
    public static Quartier debut_route4 = new Quartier("debut route 4", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route4 = new Quartier("milieu route 4", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route4 = new Quartier("fin route 4", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Grotte mont_selenite_route3 = new Grotte("Mont Sélénite", 1, 9, 1, 1, 0, Orientation.face, Endroits.fin_route3);
    public static Grotte mont_selenite_route4 = new Grotte("Mont Sélénite", 1, 1, 1, 1, 0, Orientation.face, Endroits.debut_route4);
    public static Salle montSelenite_rdc_partie1 = new Salle("mont Sélénite rdc partie 1", 0, 0, 11, 8, Endroits.mont_selenite_route3, 0, 
            Terrains.terrainRoche);
    public static Salle montSelenite_rdc_partie2 = new Salle("mont Sélénite rdc partie 2", 0, 0, 11, 8, Endroits.mont_selenite_route3, 0, 
            Terrains.terrainRoche);
    public static Salle montSelenite_rdc_partie3 = new Salle("mont Sélénite rdc partie 3", 0, 0, 11, 8, Endroits.mont_selenite_route3, 0, 
            Terrains.terrainRoche);
    public static Salle montSelenite_rdc_partie4 = new Salle("mont Sélénite rdc partie 4", 0, 0, 11, 8, Endroits.mont_selenite_route4, 0, 
            Terrains.terrainRoche);
    public static Salle montSelenite_ss1_partie1 = new Salle("mont Sélénite ss1 partie 1", 0, 0, 12, 10, Endroits.mont_selenite_route3, 0, 
            Terrains.terrainRoche);
    public static Salle montSelenite_ss1_partie2 = new Salle("mont Sélénite ss1 partie 2", 0, 0, 12, 10, Endroits.mont_selenite_route3, 0, 
            Terrains.terrainRoche);
    public static Salle montSelenite_ss2_partie1 = new Salle("mont Sélénite ss2 partie 1", 0, 0, 11, 8, Endroits.mont_selenite_route3, 0, 
            Terrains.terrainRoche);
    public static Salle montSelenite_ss2_partie2 = new Salle("mont Sélénite ss2 partie 2", 0, 0, 11, 8, Endroits.mont_selenite_route3, 0, 
            Terrains.terrainRoche);
    public static Salle montSelenite_ss2_partie3 = new Salle("mont Sélénite ss2 partie 3", 0, 0, 11, 8, Endroits.mont_selenite_route3, 0, 
            Terrains.terrainRoche);
    
    public static Grotte caverne_azuree = new Grotte("Caverne azuree", 0, 8, 1, 1, -1, 1, Orientation.face, Endroits.fin_route4);
    public static Salle caverne_azuree_rdc = new Salle("Caverne azuree rdc", 0, 0, 11, 8, Endroits.caverne_azuree, 0, Terrains.terrainRoche);
    public static Salle caverne_azuree_e1 = new Salle("Caverne azuree e1", 0, 0, 11, 8, Endroits.caverne_azuree, 1, Terrains.terrainRoche);
    public static Salle caverne_azuree_ss1 = new Salle("Caverne azuree ss1", 0, 0, 11, 8, Endroits.caverne_azuree, 0, Terrains.terrainRoche);
    
    public static Ville azuria = new Ville("Azuria", 10, 11, 1, 3);
    public static Quartier quartierHabitant_azuria = new Quartier("quartier habitant azuria", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant_quartierHabitant_azuria = new Maison("maison habitant", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_azuria, true);
    public static Maison maisonHabitant2_quartierHabitant_azuria = new Maison("maison habitant", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_azuria, true);
    public static Maison maisonHabitant3_quartierHabitant_azuria = new Maison("maison habitant", 3, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_azuria, true);
    public static Quartier quartierArene_azuria = new Quartier("quartier arène azuria", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant_quartierArene_azuria = new Maison("maison habitant", 0, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_azuria, true);
    public static CentrePokemon centrepokemon_azuria = new CentrePokemon("centre pokemon", 0, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_azuria);
    public static ArenePkmn arene_azuria = new ArenePkmn("arène d'azuria", 0, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_azuria);
    public static Salle bas_arene_azuria = new Salle("rez de chausse arène d'azuria", 0, 0, 10, 7, 
            Endroits.arene_azuria, 0, Terrains.terrainEau);
    public static Salle salle_champion_arene_azuria = new Salle("salle champion arène d'azuria", 0, 0, 10, 7, 
            Endroits.arene_azuria, 0, Terrains.terrainEau);
    public static Magasin boutiqueVelo_azuria = new Magasin("Cycles a gogos", 3, 2, 1, 1, 0, Orientation.face, Endroits.quartierArene_azuria);
    public static Magasin shop_azuria = new Magasin("shop", 3, 5, 1, 1, 0, Orientation.face, Endroits.quartierArene_azuria);
    public static BatimentTournoi salleTournoiPokemonEau_azuria = new BatimentTournoi("Tournoi pokemon eau", 3, 4, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierArene_azuria, TypeTournoi.eau, NiveauTournoi.dresseurPkmn);
    public static Salle bas_salleTournoiPokemonEau_azuria = new Salle("rez de chausse tournoi azuria", 0, 0, 6, 5, 
            Endroits.salleTournoiPokemonEau_azuria, 0);
    
    public static Ville route24 = new Ville("Route 24", 10, 11, 1, 3);
    public static Quartier debut_route24 = new Quartier("debut route 24", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route24 = new Quartier("milieu route 24", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route24 = new Quartier("fin route 24", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison areneAlbert = new Maison("Arene d'albert", 1, 5, 1, 1, 0, Orientation.face, Endroits.fin_route24, false);
    public static Salle arene_areneAlbert = new Salle("arene arene d'albert", 0, 0, 10, 7, Endroits.areneAlbert, 0);
    public static Salle salle_entrainement_areneAlbert = new Salle("salle entrainement arene d'albert", 0, 0, 10, 7, Endroits.areneAlbert, 0);
    
    public static Ville route25 = new Ville("Route 25", 10, 11, 1, 3);
    public static Quartier debut_route25 = new Quartier("debut route 25", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route25_1 = new Quartier("milieu route 25 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment ecolePokemon = new Batiment("Ecole pokemon", 0, 5, 1, 1, 0, 0, Orientation.face, Endroits.milieu_route25_1, TypeBatiment.grand_batiment);
    public static Salle entree_ecolePokemon = new Salle("entree ecole pokemon", 0, 0, 10, 7, Endroits.ecolePokemon, 0);
    public static Salle salle_classe_ecolePokemon = new Salle("salle de classe ecole pokemon", 0, 0, 10, 7, Endroits.ecolePokemon, 0);
    public static Salle salle_machine_ecolePokemon = new Salle("salle machine ecole pokemon", 0, 0, 10, 7, Endroits.ecolePokemon, 0);
    public static Salle cour_ecolePokemon = new Salle("cour ecole pokemon", 0, 0, 10, 7, Endroits.ecolePokemon, 0);
    public static Quartier milieu_route25_2 = new Quartier("milieu route 25 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route25 = new Quartier("fin route 25", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment maisonLeo = new Batiment("Leo", 1, 6, 1, 1, 0, 5, Orientation.face, Endroits.fin_route25, TypeBatiment.phare);
    public static Salle bas_maisonLeo = new Salle("rez de chausse leo", 0, 0, 10, 7, Endroits.maisonLeo, 0);
    public static Salle salleKanto_maisonLeo = new Salle("salle kanto phare leo", 0, 0, 10, 7, Endroits.maisonLeo, 1);
    public static Salle salleJohto_maisonLeo = new Salle("salle johto phare leo", 0, 0, 10, 7, Endroits.maisonLeo, 2);
    public static Salle salleHoenn_maisonLeo = new Salle("salle hoenn phare leo", 0, 0, 10, 7, Endroits.maisonLeo, 3);
    public static Salle salleSinnoh_maisonLeo = new Salle("salle sinnoh phare leo", 0, 0, 10, 7, Endroits.maisonLeo, 4);
    public static Salle salleTravail_maisonLeo = new Salle("salle travail phare leo", 0, 0, 10, 7, Endroits.maisonLeo, 5);
    
    public static Ville route5 = new Ville("Route 5", 10, 11, 1, 3);
    public static Quartier debut_route5 = new Quartier("debut route 5", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route5 = new Quartier("fin route 5", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonDressagePokemon_route5 = new Maison("Dressage pokemon", 3, 5, 1, 1, 0, Orientation.face, Endroits.fin_route5, false);
    public static Salle bas_maisonDressagePokemon_route5 = new Salle("rez de chausse Dressage pokemon", 0, 0, 6, 5, Endroits.maisonDressagePokemon_route5, 0);
    
    public static Ville safrania = new Ville("Safrania", 10, 11, 1, 3);
    public static Quartier quartierArene_safrania = new Quartier("quartier Arene Safrania", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierArene_safrania = new Maison("maison habitant", 3, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_safrania, true);
    public static Gare gare_safrania = new Gare("Gare de safrania", 2, 2, 1, 1, 0, Orientation.face, Endroits.quartierArene_safrania);
    public static Maison maisonHabitant2_quartierArene_safrania = new Maison("maison habitant", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_safrania, true);
    public static ArenePkmn arene_morgane_safrania = new ArenePkmn("arène de Morgane", 3, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_safrania);
    public static Salle bas_arene_morgane_safrania = new Salle("rez de chausse arène de Morgane", 0, 0, 10, 7, 
            Endroits.arene_morgane_safrania, 0, Terrains.terrainPsy);
    public static Salle salle_champion_arene_morgane_safrania = new Salle("salle champion arène de Morgane", 0, 0, 10, 7, 
            Endroits.arene_morgane_safrania, 0, Terrains.terrainPsy);
    public static ArenePkmn arene_combat_safrania = new ArenePkmn("arène de combat", 3, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_safrania);
    public static Salle bas_arene_combat_safrania = new Salle("rez de chausse arène de combat", 0, 0, 10, 7, 
            Endroits.arene_combat_safrania, 0, Terrains.terrainCombat);
    public static Salle salle_champion_arene_combat_safrania = new Salle("salle champion arène de combat", 0, 0, 10, 7, 
            Endroits.arene_combat_safrania, 0, Terrains.terrainCombat);
    public static Maison maisonHabitant3_quartierArene_safrania = new Maison("maison habitant", 3, 9, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_safrania, true);
    public static BatimentTournoi salleTournoiPokemonPsy_safrania = new BatimentTournoi("Tournoi pokemon psy", 3, 4, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierArene_safrania, TypeTournoi.psy, NiveauTournoi.dresseurPkmn);
    public static Quartier quartierBoutique_safrania = new Quartier("quartier Boutique Safrania", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierBoutique_safrania = new Maison("maison habitant", 0, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Maison maisonHabitant2_quartierBoutique_safrania = new Maison("maison habitant", 0, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Maison maisonHabitant3_quartierBoutique_safrania = new Maison("maison habitant", 0, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Magasin shop_safrania = new Magasin("shop", 0, 6, 1, 1, 0, Orientation.face, Endroits.quartierBoutique_safrania);
    public static Maison maisonHabitant4_quartierBoutique_safrania = new Maison("maison habitant", 0, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Maison maisonHabitant5_quartierBoutique_safrania = new Maison("maison habitant", 0, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Maison maisonHabitant6_quartierBoutique_safrania = new Maison("maison habitant", 4, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Maison maisonHabitant7_quartierBoutique_safrania = new Maison("maison habitant", 4, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Batiment sylph_sarl = new Batiment("Sylph sarl", 4, 5, 1, 1, 0, 0, Orientation.face, Endroits.quartierBoutique_safrania, TypeBatiment.sylph_sarl);
    public static Salle sylph_sarl_rdc = new Salle("rez de chausse Sylph sarl", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e1 = new Salle("Sylph sarl e1", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e2 = new Salle("Sylph sarl e2", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e3 = new Salle("Sylph sarl e3", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e4 = new Salle("Sylph sarl e4", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e5 = new Salle("Sylph sarl e5", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e6 = new Salle("Sylph sarl e6", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e7 = new Salle("Sylph sarl e7", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e8 = new Salle("Sylph sarl e8", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e9 = new Salle("Sylph sarl e9", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Salle sylph_sarl_e10 = new Salle("Sylph sarl e10", 0, 0, 6, 5, Endroits.sylph_sarl, 0);
    public static Maison maisonHabitant8_quartierBoutique_safrania = new Maison("maison habitant", 4, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Maison maisonHabitant9_quartierBoutique_safrania = new Maison("maison habitant", 4, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_safrania, true);
    public static Quartier quartierHabitant_safrania = new Quartier("quartier habitant Safrania", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierHabitant_safrania = new Maison("maison habitant", 0, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_safrania, true);
    public static CentrePokemon centrepokemon_safrania = new CentrePokemon("centre pokemon", 0, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_safrania);
    public static Maison maisonHabitant2_quartierHabitant_safrania = new Maison("maison habitant", 0, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_safrania, true);
    public static Maison maisonHabitant3_quartierHabitant_safrania = new Maison("maison habitant", 0, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_safrania, true);
    public static Maison maisonHabitant4_quartierHabitant_safrania = new Maison("maison habitant", 0, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_safrania, true);
    public static Maison maisonHabitant5_quartierHabitant_safrania = new Maison("maison habitant", 0, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_safrania, true);
    public static Maison maisonHabitant6_quartierHabitant_safrania = new Maison("maison habitant", 0, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_safrania, true);
    
    public static Ville route6 = new Ville("Route 6", 10, 11, 1, 3);
    public static Quartier debut_route6 = new Quartier("debut route 6", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route6 = new Quartier("fin route 6", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville carmin_sur_mer = new Ville("Carmin sur mer", 10, 11, 1, 3);
    public static Quartier quartierHabitant_carmin_sur_mer = new Quartier("quartier habitant Carmin sur mer", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonPecheur_quartierHabitant_carmin_sur_mer = new Maison("maison pecheur", 1, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_carmin_sur_mer, true);
    public static CentrePokemon centrepokemon_carmin_sur_mer = new CentrePokemon("centre pokemon", 1, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_carmin_sur_mer);
    public static Maison maisonHabitant2_quartierHabitant_carmin_sur_mer = new Maison("maison habitant", 1, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_carmin_sur_mer, true);
    public static Maison maisonHabitant3_quartierHabitant_carmin_sur_mer = new Maison("maison habitant", 1, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_carmin_sur_mer, true);
    public static BatimentTournoi salleTournoiPokemonElectrique_carmin_sur_mer = new BatimentTournoi("Tournoi pokemon electrique", 2, 8, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierHabitant_carmin_sur_mer, TypeTournoi.electrique, NiveauTournoi.dresseurPkmn);
    public static Quartier quartierArene_carmin_sur_mer = new Quartier("quartier arene Carmin sur mer", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierArene_carmin_sur_mer = new Maison("maison habitant", 0, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_carmin_sur_mer, true);
    public static Maison maisonHabitant2_quartierArene_carmin_sur_mer = new Maison("maison habitant", 0, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_carmin_sur_mer, true);
    public static Magasin shop_carmin_sur_mer = new Magasin("shop", 0, 6, 1, 1, 0, Orientation.face, Endroits.quartierArene_carmin_sur_mer);
    public static ArenePkmn arene_majorBob_carmin_sur_mer = new ArenePkmn("arène de Major bob", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_carmin_sur_mer);
    public static Salle bas_arene_carmin_sur_mer = new Salle("rez de chausse arène de carmin sur mer", 0, 0, 10, 7, 
            Endroits.arene_majorBob_carmin_sur_mer, 0, Terrains.terrainElectrique);
    public static Salle salle_champion_arene_carmin_sur_mer = new Salle("salle champion arène de carmin sur mer", 0, 0, 10, 7, 
            Endroits.arene_majorBob_carmin_sur_mer, 0, Terrains.terrainElectrique);
    public static Maison maisonHabitant3_quartierArene_carmin_sur_mer = new Maison("maison habitant", 3, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_carmin_sur_mer, true);
    public static Quartier port_carmin_sur_mer = new Quartier("port Carmin sur mer", 0, 0, 11, 8, Terrains.terrainEau);
    public static Batiment aquaria_carmin_sur_mer = new Batiment("Aquaria", 5, 3, 1, 1, 0, 0, Orientation.dos, Endroits.port_carmin_sur_mer, TypeBatiment.aquaria);
    public static Salle salle1_aquaria = new Salle("salle 1 aquaria", 0, 0, 10, 7, Endroits.aquaria_carmin_sur_mer, 0, Terrains.terrainEau);
    public static Salle salle2_aquaria = new Salle("salle 2 aquaria", 0, 0, 10, 7, Endroits.aquaria_carmin_sur_mer, 0, Terrains.terrainEau);
    public static Salle salle3_aquaria = new Salle("salle 3 aquaria", 0, 0, 10, 7, Endroits.aquaria_carmin_sur_mer, 0, Terrains.terrainEau);
    public static Salle salle4_aquaria = new Salle("salle 4 aquaria", 0, 0, 10, 7, Endroits.aquaria_carmin_sur_mer, 0, Terrains.terrainEau);
    public static Salle salle5_aquaria = new Salle("salle 5 aquaria", 0, 0, 10, 7, Endroits.aquaria_carmin_sur_mer, 0, Terrains.terrainEau);
    public static Salle salle6_aquaria = new Salle("salle 6 aquaria", 0, 0, 10, 7, Endroits.aquaria_carmin_sur_mer, 0, Terrains.terrainEau);
    public static Salle cabine_joueur_aquaria = new Salle("cabine joueur aquaria", 0, 0, 10, 7, Endroits.aquaria_carmin_sur_mer, 0, Terrains.terrainEau);
    public static Salle cabine_capitaine_aquaria = new Salle("cabine capitain aquaria", 0, 0, 10, 7, Endroits.aquaria_carmin_sur_mer, 0, Terrains.terrainEau);
    
    public static Ville route7 = new Ville("Route 7", 10, 11, 1, 3);
    public static Quartier debut_route7 = new Quartier("debut route 7", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville celadopole = new Ville("Celadopole", 10, 11, 1, 3);
    public static Quartier quartierHabitant_celadopole = new Quartier("quartier habitant Celadopole", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_celadopole = new CentrePokemon("centre pokemon", 4, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_celadopole);
    public static Maison maisonHabitant1_quartierHabitant_celadopole = new Maison("maison habitant", 4, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_celadopole, true);
    public static Maison maisonHabitant2_quartierHabitant_celadopole = new Maison("maison habitant", 4, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_celadopole, true);
    public static Maison maisonHabitant3_quartierHabitant_celadopole = new Maison("maison habitant", 4, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_celadopole, true);
    public static Batiment batiment_quartierHabitant_celadopole = new Batiment("Batiment", 4, 1, 1, 1, 0, 0, Orientation.face, Endroits.quartierHabitant_celadopole, TypeBatiment.grand_batiment);
    public static Quartier quartierBoutique_celadopole = new Quartier("quartier boutique Celadopole", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment batiment1_quartierBoutique_celadopole = new Batiment("Batiment", 4, 7, 1, 1, 0, 0, Orientation.face, Endroits.quartierBoutique_celadopole, TypeBatiment.grand_batiment);
    public static Batiment centre_commerciale_quartierBoutique_celadopole = new Batiment("Centre commerciale", 4, 5, 1, 1, 0, 0, Orientation.face, Endroits.quartierBoutique_celadopole, TypeBatiment.centre_commercial);
    public static Batiment batiment2_quartierBoutique_celadopole = new Batiment("Batiment", 4, 3, 1, 1, 0, 0, Orientation.face, Endroits.quartierBoutique_celadopole, TypeBatiment.grand_batiment);
    public static Quartier quartierArene_celadopole = new Quartier("quartier arene Celadopole", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierArene_celadopole = new Maison("maison habitant", 4, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_celadopole, true);
    public static ArenePkmn arene_erika_celadopole = new ArenePkmn("arène de Erika", 4, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_celadopole);
    public static Salle bas_arene_erika_celadopole = new Salle("rez de chausse arène de Erika", 0, 0, 10, 7, 
            Endroits.arene_erika_celadopole, 0, Terrains.terrainPlante);
    public static Salle salle_champion_arene_erika_celadopole = new Salle("salle champion arène de Erika", 0, 0, 10, 7, 
            Endroits.arene_erika_celadopole, 0, Terrains.terrainPlante);
    public static Maison maisonHabitant2_quartierArene_celadopole = new Maison("maison habitant", 4, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_celadopole, true);
    public static Maison maisonHabitant3_quartierArene_celadopole = new Maison("maison habitant", 4, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_celadopole, true);
    public static Maison maisonHabitant4_quartierArene_celadopole = new Maison("maison habitant", 5, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_celadopole, true);
    public static Quartier quartierCasino_celadopole = new Quartier("quartier casino Celadopole", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierCasino_celadopole = new Maison("maison habitant", 0, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    public static Batiment casino_quartierCasino_celadopole = new Batiment("Casino", 0, 3, 1, 1, 0, 0, Orientation.face, Endroits.quartierCasino_celadopole, TypeBatiment.casino);
    public static Salle repaire_rocket_ss1 = new Salle("Repaire rocket ss1", 0, 0, 6, 5, Endroits.casino_quartierCasino_celadopole, 0);
    public static Salle repaire_rocket_ss2 = new Salle("Repaire rocket ss2", 0, 0, 6, 5, Endroits.casino_quartierCasino_celadopole, 0);
    public static Salle repaire_rocket_ss3 = new Salle("Repaire rocket ss3", 0, 0, 6, 5, Endroits.casino_quartierCasino_celadopole, 0);
    public static Salle repaire_rocket_ss4 = new Salle("Repaire rocket ss4", 0, 0, 6, 5, Endroits.casino_quartierCasino_celadopole, 0);
    public static BatimentTournoi salleTournoiPokemonPlante_celadopole = new BatimentTournoi("Tournoi pokemon plante", 3, 4, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierCasino_celadopole, TypeTournoi.plante, NiveauTournoi.dresseurPkmn);
    public static Maison maisonHabitant2_quartierCasino_celadopole = new Maison("maison habitant", 0, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    public static Maison maisonHabitant3_quartierCasino_celadopole = new Maison("maison habitant", 0, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    public static Maison maisonHabitant4_quartierCasino_celadopole = new Maison("maison habitant", 0, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    public static Maison maisonHabitant5_quartierCasino_celadopole = new Maison("maison habitant", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    public static Maison maisonHabitant6_quartierCasino_celadopole = new Maison("maison habitant", 3, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    public static Maison maisonHabitant7_quartierCasino_celadopole = new Maison("maison habitant", 3, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    public static Maison maisonHabitant8_quartierCasino_celadopole = new Maison("maison habitant", 3, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    public static Maison maisonHabitant9_quartierCasino_celadopole = new Maison("maison habitant", 3, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierCasino_celadopole, true);
    
    public static Ville route8 = new Ville("Route 8", 10, 11, 1, 3);
    public static Quartier debut_route8 = new Quartier("debut route 8", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison souterrain_debut_route8 = new Maison("Souterrain", 1, 2, 1, 1, 0, Orientation.face, 
            Endroits.debut_route8, true);
    public static Quartier fin_route8 = new Quartier("fin route 8", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route9 = new Ville("Route 9", 10, 11, 1, 3);
    public static Quartier debut_route9 = new Quartier("debut route 9", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route9 = new Quartier("milieu route 9", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route9 = new Quartier("fin route 9", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route10 = new Ville("Route 10", 10, 11, 1, 3);
    public static Quartier debut_route10 = new Quartier("debut route 10", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route10 = new Quartier("milieu route 10", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_route10 = new CentrePokemon("centre pokemon", 1, 5, 1, 1, 0, Orientation.face, 
            Endroits.milieu_route10);
    public static Quartier centrale_route10 = new Quartier("centrale route 10", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment centrale_centrale_route10 = new Batiment("Centrale", 1, 3, 1, 1, 0, 0, Orientation.face, 
            Endroits.centrale_route10, TypeBatiment.grand_batiment);
    public static Salle centrale_partie1 = new Salle("Centrale partie1", 0, 0, 12, 9, Endroits.centrale_centrale_route10, 0);
    public static Salle centrale_partie2 = new Salle("Centrale partie2", 0, 0, 12, 9, Endroits.centrale_centrale_route10, 0);
    public static Salle centrale_partie3 = new Salle("Centrale partie3", 0, 0, 12, 9, Endroits.centrale_centrale_route10, 0);
    public static Salle centrale_partie4 = new Salle("Centrale partie4", 0, 0, 12, 9, Endroits.centrale_centrale_route10, 0);
    public static Salle centrale_partie5 = new Salle("Centrale partie4", 0, 0, 12, 9, Endroits.centrale_centrale_route10, 0);
    public static Quartier fin_route10 = new Quartier("fin route 10", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Grotte grotte_milieu_route10 = new Grotte("grotte", 1, 4, 1, 1, -1, 0, Orientation.face, Endroits.milieu_route10);
    public static Grotte grotte_fin_route10 = new Grotte("grotte", 1, 3, 1, 1, -1, 0, Orientation.face, Endroits.fin_route10);
    public static Salle grotte_route10_rdc_p1 = new Salle("grotte rdc p1", 0, 0, 11, 8, Endroits.grotte_milieu_route10, 0, Terrains.terrainRoche);
    public static Salle grotte_route10_rdc_p2 = new Salle("grotte rdc p2", 0, 0, 11, 8, Endroits.grotte_fin_route10, 0, Terrains.terrainRoche);
    public static Salle grotte_route10_ss_p1 = new Salle("grotte ss p1", 0, 0, 11, 8, Endroits.grotte_milieu_route10, 0, Terrains.terrainRoche);
    public static Salle grotte_route10_ss_p2 = new Salle("grotte ss p2", 0, 0, 11, 8, Endroits.grotte_milieu_route10, 0, Terrains.terrainRoche);
    
    public static Ville lavanville = new Ville("Lavanville", 10, 11, 1, 3);
    public static Quartier quartierBoutique_lavanville = new Quartier("quartier boutique Lavanville", 0, 0, 8, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_lavanville = new CentrePokemon("centre pokemon", 1, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_lavanville);
    public static Magasin shop_lavanville = new Magasin("shop", 5, 6, 1, 1, 0, Orientation.face, Endroits.quartierBoutique_lavanville);
    public static Maison maisonHabitant1_quartierBoutique_lavanville = new Maison("maison habitant", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_lavanville, true);
    public static Maison maisonHabitant2_quartierBoutique_lavanville = new Maison("maison habitant", 5, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_lavanville, true);
    public static Maison maisonHabitant3_quartierBoutique_lavanville = new Maison("maison habitant", 5, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_lavanville, true);
    public static Batiment tour_radio_quartierBoutique_lavanville = new Batiment("Tour radio lavanville", 2, 5, 1, 1, 0, 0, Orientation.face, 
            Endroits.quartierBoutique_lavanville, TypeBatiment.tour_radio);
    public static Batiment tour_pokemon_quartierBoutique_lavanville = new Batiment("Tour pokemon lavanville", 0, 6, 1, 1, 0, 6, Orientation.face, 
            Endroits.quartierBoutique_lavanville, TypeBatiment.grand_batiment);
    public static Salle rdc_tour_pokemon_lavanville = new Salle("rdc Tour pokemon lavanville", 0, 0, 12, 9, Endroits.tour_pokemon_quartierBoutique_lavanville, 0);
    public static Salle etage1_tour_pokemon_lavanville = new Salle("etage 1 Tour pokemon lavanville", 0, 0, 12, 9, Endroits.tour_pokemon_quartierBoutique_lavanville, 1);
    public static Salle etage2_tour_pokemon_lavanville = new Salle("etage 2 Tour pokemon lavanville", 0, 0, 12, 9, Endroits.tour_pokemon_quartierBoutique_lavanville, 2);
    public static Salle etage3_tour_pokemon_lavanville = new Salle("etage 3 Tour pokemon lavanville", 0, 0, 12, 9, Endroits.tour_pokemon_quartierBoutique_lavanville, 3);
    public static Salle etage4_tour_pokemon_lavanville = new Salle("etage 4 Tour pokemon lavanville", 0, 0, 12, 9, Endroits.tour_pokemon_quartierBoutique_lavanville, 4);
    public static Salle etage5_tour_pokemon_lavanville = new Salle("etage 5 Tour pokemon lavanville", 0, 0, 12, 9, Endroits.tour_pokemon_quartierBoutique_lavanville, 5);
    public static Salle etage6_tour_pokemon_lavanville = new Salle("etage 6 Tour pokemon lavanville", 0, 0, 12, 9, Endroits.tour_pokemon_quartierBoutique_lavanville, 6);
    public static BatimentTournoi salleTournoiPokemonSpectre_lavanville = new BatimentTournoi("Tournoi pokemon spectre", 3, 4, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierBoutique_lavanville, TypeTournoi.spectre, NiveauTournoi.dresseurPkmn);
    
    public static Ville route11 = new Ville("Route 11", 10, 11, 1, 3);
    public static Quartier debut_route11 = new Quartier("debut route 11", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte cave_taupiqueur_route11 = new Grotte("Cave taupiqueur route 11", 2, 2, 1, 1, 0, Orientation.face, Endroits.debut_route11);
    public static Salle cave_taupiqueur_p1 = new Salle("Cave taupiqueur p1", 0, 0, 11, 8, Endroits.cave_taupiqueur_route11, 0, Terrains.terrainRoche);
    public static Salle cave_taupiqueur_p2 = new Salle("Cave taupiqueur p2", 0, 0, 11, 8, Endroits.cave_taupiqueur_route11, 0, Terrains.terrainRoche);
    public static Salle cave_taupiqueur_p3 = new Salle("Cave taupiqueur p3", 0, 0, 11, 8, Endroits.cave_taupiqueur_route11, 0, Terrains.terrainRoche);
    public static Salle cave_taupiqueur_p4 = new Salle("Cave taupiqueur p4", 0, 0, 11, 8, Endroits.cave_taupiqueur_route2, 0, Terrains.terrainRoche);
    public static Quartier milieu_route11 = new Quartier("milieu route 11", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route11 = new Quartier("fin route 11", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route12 = new Ville("Route 12", 10, 11, 1, 3);
    public static Quartier debut_route12 = new Quartier("debut route 12", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier milieu_route12_1 = new Quartier("milieu route 12 1", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier milieu_route12_2 = new Quartier("milieu route 12 2", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier milieu_route12_3 = new Quartier("milieu route 12 3", 0, 0, 11, 8, Terrains.terrainPlante);
    public static Quartier milieu_route12_4 = new Quartier("milieu route 12 4", 0, 0, 11, 8, Terrains.terrainPlante);
    public static Quartier milieu_route12_5 = new Quartier("milieu route 12 5", 0, 0, 11, 8, Terrains.terrainPlante);
    public static Quartier milieu_route12_6 = new Quartier("milieu route 12 6", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier milieu_route12_7 = new Quartier("milieu route 12 7", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier fin_route12 = new Quartier("fin route 12", 0, 0, 11, 8, Terrains.terrainEau);
    
    public static Ville sombreville = new Ville("Sombreville", 10, 11, 1, 3);
    public static Quartier quartierHabitant_sombreville = new Quartier("quartier habitant Sombreville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierHabitant_sombreville = new Maison("maison habitant", 0, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant2_quartierHabitant_sombreville = new Maison("maison habitant", 0, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant3_quartierHabitant_sombreville = new Maison("maison habitant", 0, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant4_quartierHabitant_sombreville = new Maison("maison habitant", 0, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant5_quartierHabitant_sombreville = new Maison("maison habitant", 0, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant6_quartierHabitant_sombreville = new Maison("maison habitant", 0, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant7_quartierHabitant_sombreville = new Maison("maison habitant", 3, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant8_quartierHabitant_sombreville = new Maison("maison habitant", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant9_quartierHabitant_sombreville = new Maison("maison habitant", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant10_quartierHabitant_sombreville = new Maison("maison habitant", 3, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant11_quartierHabitant_sombreville = new Maison("maison habitant", 3, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Maison maisonHabitant12_quartierHabitant_sombreville = new Maison("maison habitant", 3, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_sombreville, true);
    public static Quartier quartierArene_sombreville = new Quartier("quartier Arene Sombreville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static ArenePkmn arene_yas_sombreville = new ArenePkmn("arène de Yas", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_sombreville);
    public static Salle bas_arene_yas_sombreville = new Salle("rez de chausse arène de Yas", 0, 0, 10, 7, 
            Endroits.arene_yas_sombreville, 0, Terrains.terrainSol);
    public static Salle salle_champion_arene_yas_sombreville = new Salle("Salle champion arène de Yas", 0, 0, 10, 7, 
            Endroits.arene_yas_sombreville, 0, Terrains.terrainSol);
    public static ArenePkmn arene_kas_sombreville = new ArenePkmn("arène de Kas", 3, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_sombreville);
    public static Salle bas_arene_kas_sombreville = new Salle("rez de chausse arène de kas", 0, 0, 10, 7, 
            Endroits.arene_kas_sombreville, 0, Terrains.terrainCombat);
    public static Salle salle_champion_arene_kas_sombreville = new Salle("salle champion arène de kas", 0, 0, 10, 7, 
            Endroits.arene_kas_sombreville, 0, Terrains.terrainCombat);
    public static CentrePokemon centrepokemon_sombreville = new CentrePokemon("centre pokemon", 5, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_sombreville);
    public static Magasin shop_sombreville = new Magasin("shop", 5, 7, 1, 1, 0, Orientation.face, Endroits.quartierArene_sombreville);
    public static BatimentTournoi salleTournoiPokemonTenebres_sombreville = new BatimentTournoi("Tournoi pokemon tenebres", 3, 4, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierArene_sombreville, TypeTournoi.tenebres, NiveauTournoi.dresseurPkmn);
    
    public static Ville route13 = new Ville("Route 13", 10, 11, 1, 3);
    public static Quartier debut_route13 = new Quartier("debut route 13", 0, 0, 11, 8, Terrains.terrainSol);
    public static Quartier milieu_route13_1 = new Quartier("milieu route 13 1", 0, 0, 11, 8, Terrains.terrainSol);
    public static Quartier milieu_route13_2 = new Quartier("milieu route 13 2", 0, 0, 11, 8, Terrains.terrainSol);
    public static Grotte canyon = new Grotte("Canyon", 7, 5, 1, 1, 0, Orientation.dos, Endroits.milieu_route13_2);
    public static Salle canyon_p1 = new Salle("Canyon p1", 0, 0, 11, 8, Endroits.canyon, 0, Terrains.terrainRoche);
    public static Salle canyon_p2 = new Salle("Canyon p2", 0, 0, 11, 8, Endroits.canyon, 0, Terrains.terrainRoche);
    public static Salle canyon_p3 = new Salle("Canyon p3", 0, 0, 11, 8, Endroits.canyon, 0, Terrains.terrainRoche);
    public static Quartier milieu_route13_3 = new Quartier("milieu route 13 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route13_4 = new Quartier("milieu route 13 4", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route13 = new Quartier("fin route 13", 0, 0, 11, 8, Terrains.terrainNormal);
    public static BatimentTournoi tournoi_princesse_route13 = new BatimentTournoi("Tournoi princesse", 0, 1, 1, 1, 0, 0, 
            Orientation.face, Endroits.fin_route13, TypeTournoi.tous, NiveauTournoi.dresseurPkmn);
    
    public static Ville route14 = new Ville("Route 14", 10, 11, 1, 3);
    public static Quartier debut_route14 = new Quartier("debut route 14", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route14_1 = new Quartier("milieu route 14 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route14_2 = new Quartier("milieu route 14 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route14_3 = new Quartier("milieu route 14 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route14 = new Quartier("fin route 14", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route15 = new Ville("Route 15", 10, 11, 1, 3);
    public static Quartier debut_route15 = new Quartier("debut route 15", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route15_1 = new Quartier("milieu route 15 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route15_2 = new Quartier("milieu route 15 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route15_3 = new Quartier("milieu route 15 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route15 = new Quartier("fin route 15", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville rocheville = new Ville("Rocheville", 10, 11, 1, 3);
    public static Quartier quartierHabitant_rocheville = new Quartier("quartier habitant Rocheville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop1_rocheville = new Magasin("shop", 2, 2, 1, 1, 0, Orientation.face, Endroits.quartierHabitant_rocheville);
    public static Magasin shop2_rocheville = new Magasin("shop", 2, 4, 1, 1, 0, Orientation.face, Endroits.quartierHabitant_rocheville);
    public static Magasin shop3_rocheville = new Magasin("shop", 2, 6, 1, 1, 0, Orientation.face, Endroits.quartierHabitant_rocheville);
    public static Magasin shop4_rocheville = new Magasin("shop", 2, 8, 1, 1, 0, Orientation.face, Endroits.quartierHabitant_rocheville);
    public static Magasin shop5_rocheville = new Magasin("shop", 5, 2, 1, 1, 0, Orientation.dos, Endroits.quartierHabitant_rocheville);
    public static Magasin shop6_rocheville = new Magasin("shop", 5, 4, 1, 1, 0, Orientation.dos, Endroits.quartierHabitant_rocheville);
    public static Magasin shop7_rocheville = new Magasin("shop", 5, 6, 1, 1, 0, Orientation.dos, Endroits.quartierHabitant_rocheville);
    public static Magasin shop8_rocheville = new Magasin("shop", 5, 8, 1, 1, 0, Orientation.dos, Endroits.quartierHabitant_rocheville);
    public static Quartier quartierManoir_rocheville = new Quartier("quartier Manoir Rocheville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment manoir_rocheville = new Batiment("Manoir Rocheville", 2, 5, 1, 1, 0, 0, Orientation.face, Endroits.quartierManoir_rocheville, TypeBatiment.chateau);
    public static Salle entree_manoir_rocheville = new Salle("entrée manoir rocheville", 0, 0, 10, 7, 
            Endroits.manoir_rocheville, 0, Terrains.terrainNormal);
    public static Salle salle_arene_evoli_manoir_rocheville = new Salle("Salle arène manoir rocheville", 0, 0, 10, 7, 
            Endroits.manoir_rocheville, 0, Terrains.terrainNormal);
    public static Salle salle_champion_arene_evoli_manoir_rocheville = new Salle("Salle champion arène manoir rocheville", 0, 0, 10, 7, 
            Endroits.manoir_rocheville, 0, Terrains.terrainNormal);
    public static Quartier jardin_manoir_rocheville = new Quartier("jardin Manoir Rocheville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_manoir_rocheville = new Magasin("shop pierre rocheville", 0, 8, 1, 1, 0, Orientation.face, Endroits.jardin_manoir_rocheville);
    public static BatimentTournoi salleTournoiPokemonInsecte_rocheville = new BatimentTournoi("Tournoi pokemon insecte", 0, 2, 1, 1, 0, 0, 
            Orientation.face, Endroits.jardin_manoir_rocheville, TypeTournoi.insecte, NiveauTournoi.gamin, NiveauTournoi.topDresseur);
    
    public static Ville route16 = new Ville("Route 16", 10, 11, 1, 3);
    public static Quartier debut_route16 = new Quartier("debut route 16", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route16 = new Quartier("fin route 16", 0, 0, 11, 8, Terrains.terrainNormal);
    public static BatimentTournoi salleTournoiPokemonCombat_route16 = new BatimentTournoi("Tournoi pokemon combat", 3, 4, 1, 1, 0, 0, 
            Orientation.face, Endroits.fin_route16, TypeTournoi.combat, NiveauTournoi.dresseurPkmn);
    
    public static Ville piste_cyclable = new Ville("Piste cyclable", 10, 11, 1, 3);
    public static Quartier debut_piste_cyclable = new Quartier("debut Piste cyclable", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_piste_cyclable = new Quartier("milieu Piste cyclable", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_piste_cyclable = new Quartier("fin Piste cyclable", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route18 = new Ville("Route 18", 10, 11, 1, 3);
    public static Quartier debut_route18 = new Quartier("debut route 18", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route18 = new Quartier("fin route 18", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville parmanie = new Ville("Parmanie", 10, 11, 1, 3);
    public static Quartier quartierArene_parmanie = new Quartier("quartier Arene Parmanie", 0, 0, 11, 8, Terrains.terrainNormal);
    public static ArenePkmn arene_koga_parmanie = new ArenePkmn("arène de Koga", 3, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_parmanie);
    public static Salle bas_arene_koga_parmanie = new Salle("rez de chausse arène de Koga", 0, 0, 10, 7, 
            Endroits.arene_koga_parmanie, 0, Terrains.terrainPoison);
    public static Salle salle_champion_arene_koga_parmanie = new Salle("salle champion arène de Koga", 0, 0, 10, 7, 
            Endroits.arene_koga_parmanie, 0, Terrains.terrainPoison);
    public static Maison maisonHabitant1_quartierArene_parmanie = new Maison("maison habitant", 3, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_parmanie, true);
    public static Maison maisonHabitant2_quartierArene_parmanie = new Maison("maison habitant", 3, 10, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_parmanie, true);
    public static Quartier quartierHabitant_parmanie = new Quartier("quartier habitant Parmanie", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_parmanie = new CentrePokemon("centre pokemon", 3, 0, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_parmanie);
    public static Maison maisonHabitant1_quartierHabitant_parmanie = new Maison("maison habitant", 4, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_parmanie, true);
    public static Maison maisonHabitant2_quartierHabitant_parmanie = new Maison("maison habitant", 4, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_parmanie, true);
    public static Quartier quartierBoutique_parmanie = new Quartier("quartier boutique Parmanie", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_parmanie = new Magasin("shop", 4, 5, 1, 1, 0, Orientation.face, Endroits.quartierBoutique_parmanie);
    public static BatimentTournoi salleTournoiPokemonPoison_parmanie = new BatimentTournoi("Tournoi pokemon poison", 3, 4, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierBoutique_parmanie, TypeTournoi.poison, NiveauTournoi.dresseurPkmn);
    public static Quartier quartierParcSafari_parmanie = new Quartier("quartier parc safari Parmanie", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville parc_safari = new Ville("Parc safari", 10, 11, 1, 3);
    public static Quartier parc_safari1 = new Quartier("Parc safari", 0, 0, 15, 15, Terrains.terrainNormal);
    public static Quartier parc_safari2 = new Quartier("Parc safari", 0, 0, 16, 16, Terrains.terrainNormal);
    public static Quartier parc_safari3 = new Quartier("Parc safari", 0, 0, 16, 18, Terrains.terrainNormal);
    public static Quartier parc_safari4 = new Quartier("Parc safari", 0, 0, 15, 17, Terrains.terrainNormal);
    
    public static Ville route19 = new Ville("Route 19", 10, 11, 1, 3);
    public static Quartier debut_route19 = new Quartier("debut Route 19", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route19 = new Quartier("milieu Route 19 1", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier fin_route19 = new Quartier("fin Route 19", 0, 0, 11, 8, Terrains.terrainEau);
    
    public static Ville iles_ecume = new Ville("Ile ecume", 10, 11, 1, 3);
    public static Quartier ile_ecume_1 = new Quartier("Ile ecume 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier ile_ecume_2 = new Quartier("Ile ecume 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte ile_ecume = new Grotte("Ile ecume", 7, 5, 1, 1, 0, Orientation.face, Endroits.ile_ecume_1);
    public static Salle ile_ecume_rdc = new Salle("Ile ecume ss7", 0, 0, 11, 8, Endroits.ile_ecume, 0, Terrains.terrainGlace);
    public static Salle ile_ecume_ss1 = new Salle("Ile ecume ss1", 0, 0, 11, 8, Endroits.ile_ecume, 0, Terrains.terrainGlace);
    public static Salle ile_ecume_ss2 = new Salle("Ile ecume ss2", 0, 0, 11, 8, Endroits.ile_ecume, 0, Terrains.terrainGlace);
    public static Salle ile_ecume_ss3 = new Salle("Ile ecume ss3", 0, 0, 11, 8, Endroits.ile_ecume, 0, Terrains.terrainGlace);
    public static Salle ile_ecume_ss4 = new Salle("Ile ecume ss4", 0, 0, 11, 8, Endroits.ile_ecume, 0, Terrains.terrainGlace);
    
    public static Ville route20 = new Ville("Route 20", 10, 11, 1, 3);
    public static Quartier debut_route20 = new Quartier("debut route 20", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier milieu_route20 = new Quartier("milieu route 20", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier fin_route20 = new Quartier("fin route 20", 0, 0, 11, 8, Terrains.terrainEau);
    
    public static Ville cramois_ile = new Ville("Cramois'ile", 10, 11, 1, 3);
    public static Quartier quartierArene_cramois_ile = new Quartier("quartier Arene Cramois'ile", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment manoir_cramois_ile = new Batiment("Manoir Cramois'ile", 0, 2, 1, 1, 0, 0, Orientation.face, Endroits.quartierArene_cramois_ile, TypeBatiment.grand_batiment);
    public static Salle manoir_rdc = new Salle("Manoir rdc", 0, 0, 6, 5, Endroits.manoir_cramois_ile, 0);
    public static Salle manoir_ss1 = new Salle("Manoir ss1", 0, 0, 6, 5, Endroits.manoir_cramois_ile, 0);
    public static Salle manoir_e1 = new Salle("Manoir e1", 0, 0, 6, 5, Endroits.manoir_cramois_ile, 0);
    public static Salle manoir_e2 = new Salle("Manoir e2", 0, 0, 6, 5, Endroits.manoir_cramois_ile, 0);
    public static ArenePkmn arene_auguste_cramois_ile = new ArenePkmn("arène de Auguste", 0, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_cramois_ile);
    public static Salle bas_arene_auguste_cramois_ile = new Salle("rez de chausse arène de Auguste", 0, 0, 10, 7, 
            Endroits.arene_auguste_cramois_ile, 0, Terrains.terrainFeu);
    public static Salle salle_champion_arene_auguste_cramois_ile = new Salle("rez de chausse arène de Auguste", 0, 0, 10, 7, 
            Endroits.arene_auguste_cramois_ile, 0, Terrains.terrainFeu);
    public static Batiment salleTournoi_quartierArene_cramois_ile = new Batiment("Tournoi pokemon feu", 2, 2, 1, 1, 0, 0, Orientation.face, Endroits.quartierArene_cramois_ile, TypeBatiment.batiment_tournoi);
    public static Salle bas_salleTournoi_quartierArene_cramois_ile = new Salle("rez de chausse Tournoi pokemon feu", 0, 0, 6, 5, 
            Endroits.salleTournoi_quartierArene_cramois_ile, 0);
    public static CentrePokemon centrepokemon_cramois_ile = new CentrePokemon("centre pokemon", 2, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_cramois_ile);
    public static Magasin shop_cramois_ile = new Magasin("shop", 2, 5, 1, 1, 0, Orientation.face, Endroits.quartierArene_cramois_ile);
    public static BatimentTournoi salleTournoiPokemonFeu_cramois_ile = new BatimentTournoi("Tournoi pokemon feu", 3, 4, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierArene_cramois_ile, TypeTournoi.feu, NiveauTournoi.dresseurPkmn);
    
    public static Ville ile_mont_braise = new Ville("mont braise", 10, 11, 1, 3);
    public static Quartier entree_mont_braise = new Quartier("entree mont braise", 0, 0, 11, 8, Terrains.terrainFeu);
    public static Grotte mont_braise = new Grotte("mont braise", 7, 5, 1, 1, 0, Orientation.face, Endroits.entree_mont_braise);
    public static Salle mont_braise_ss1 = new Salle("mont braise ss1", 0, 0, 11, 8, Endroits.mont_braise, 0, Terrains.terrainFeu);
    public static Salle mont_braise_ss2 = new Salle("mont braise ss2", 0, 0, 11, 8, Endroits.mont_braise, 0, Terrains.terrainFeu);
    public static Salle mont_braise_ss3 = new Salle("mont braise ss3", 0, 0, 11, 8, Endroits.mont_braise, 0, Terrains.terrainFeu);
    public static Salle mont_braise_ss4 = new Salle("mont braise ss4", 0, 0, 11, 8, Endroits.mont_braise, 0, Terrains.terrainFeu);
    public static Salle mont_braise_ss5 = new Salle("mont braise ss5", 0, 0, 11, 8, Endroits.mont_braise, 0, Terrains.terrainFeu);
    public static Salle mont_braise_ss6 = new Salle("mont braise ss6", 0, 0, 11, 8, Endroits.mont_braise, 0, Terrains.terrainFeu);
    public static Salle mont_braise_ss7 = new Salle("mont braise ss7", 0, 0, 11, 8, Endroits.mont_braise, 0, Terrains.terrainFeu);
    
    public static Ville route21 = new Ville("Route 21", 10, 11, 1, 3);
    public static Quartier debut_route21 = new Quartier("debut route 21", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier milieu_route21 = new Quartier("debut route 21", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier fin_route21 = new Quartier("fin route 21", 0, 0, 11, 8, Terrains.terrainEau);
    
    public static Ville route23 = new Ville("Route 23", 10, 11, 1, 3);
    public static Quartier debut_route23 = new Quartier("debut route 23", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route23_1 = new Quartier("milieu route 23 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route23_2 = new Quartier("milieu route 23 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route23_3 = new Quartier("milieu route 23 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route23_4 = new Quartier("milieu route 23 4", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route23 = new Quartier("fin route 23", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Grotte route_victoire_milieu_route23 = new Grotte("Route victoire", 7, 5, 1, 1, 0, Orientation.face, Endroits.milieu_route23_4);
    public static Grotte route_victoire_fin_route23 = new Grotte("Route victoire", 7, 5, 1, 1, 0, Orientation.face, Endroits.fin_route23);
    public static Salle route_victoire_rdc = new Salle("Route victoire rdc", 0, 0, 11, 8, Endroits.route_victoire_milieu_route23, 0, 
            Terrains.terrainRoche);
    public static Salle route_victoire_e1_p1 = new Salle("Route victoire e1 p1", 0, 0, 11, 8, Endroits.route_victoire_milieu_route23, 0, 
            Terrains.terrainRoche);
    public static Salle route_victoire_e1_p2 = new Salle("Route victoire e1 p2", 0, 0, 11, 8, Endroits.route_victoire_fin_route23, 0, 
            Terrains.terrainRoche);
    public static Salle route_victoire_e2_p1 = new Salle("Route victoire e2 p1", 0, 0, 11, 8, Endroits.route_victoire_milieu_route23, 0, 
            Terrains.terrainRoche);
    public static Salle route_victoire_e2_p2 = new Salle("Route victoire e2 p2", 0, 0, 11, 8, Endroits.route_victoire_milieu_route23, 0, 
            Terrains.terrainRoche);
    
    public static Ville ligue_pokemon_kanto = new Ville("Ligue pokemon de kanto", 10, 11, 1, 3);
    public static Quartier entree_ligue_pokemon_kanto = new Quartier("Entree Ligue pokemon de kanto", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartierConseil4_ligue_pokemon_kanto = new Quartier("quartier conseil4 Ligue pokemon de kanto", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment batimentConseil4_ligue_pokemon_kanto = new Batiment("Batiment Conseil4 kanto", 0, 5, 1, 1, 0, 0, Orientation.face, Endroits.quartierConseil4_ligue_pokemon_kanto, TypeBatiment.conseil4);
    public static Salle entree_batimentConseil4_ligue_pokemon_kanto = new Salle("entree Batiment Conseil4 kanto", 0, 0, 10, 7, 
            Endroits.batimentConseil4_ligue_pokemon_kanto, 0, Terrains.terrainNormal);
    public static Salle salle_olga_batimentConseil4_ligue_pokemon_kanto = new Salle("Salle Olga Batiment Conseil4 kanto", 0, 0, 10, 7, 
            Endroits.batimentConseil4_ligue_pokemon_kanto, 0, Terrains.terrainGlace);
    public static Salle salle_aldo_batimentConseil4_ligue_pokemon_kanto = new Salle("Salle Aldo Batiment Conseil4 kanto", 0, 0, 10, 7, 
            Endroits.batimentConseil4_ligue_pokemon_kanto, 0, Terrains.terrainCombat);
    public static Salle salle_agatha_batimentConseil4_ligue_pokemon_kanto = new Salle("Salle Agatha Batiment Conseil4 kanto", 0, 0, 10, 7, 
            Endroits.batimentConseil4_ligue_pokemon_kanto, 0, Terrains.terrainSpectre);
    public static Salle salle_peter_batimentConseil4_ligue_pokemon_kanto = new Salle("Salle Peter Batiment Conseil4 kanto", 0, 0, 10, 7, 
            Endroits.batimentConseil4_ligue_pokemon_kanto, 0, Terrains.terrainDragon);
    public static Salle salle_regis_batimentConseil4_ligue_pokemon_kanto = new Salle("Salle Regis Batiment Conseil4 kanto", 0, 0, 10, 7, 
            Endroits.batimentConseil4_ligue_pokemon_kanto, 0, Terrains.terrainNormal);
    public static Quartier quartierStade_ligue_pokemon_kanto = new Quartier("quartier Stade Ligue pokemon de kanto", 0, 0, 11, 8, Terrains.terrainNormal);
    public static BatimentTournoi stade_ligue_pokemon_kanto = new BatimentTournoi("Stade Ligue pokemon de kanto", 0, 5, 1, 1, 0, 0, 
            Orientation.face, Endroits.quartierStade_ligue_pokemon_kanto, TypeTournoi.liguePokemon, NiveauTournoi.topDresseur);
    public static Quartier quartierBoutique_ligue_pokemon_kanto = new Quartier("quartier boutique Ligue pokemon de kanto", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_ligue_pokemon_kanto = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartierBoutique_ligue_pokemon_kanto);
    public static CentrePokemon centrepokemon_ligue_pokemon_kanto = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_ligue_pokemon_kanto);
    
    public static Ville route47 = new Ville("Route 47", 10, 11, 1, 3);
    public static Quartier debut_route47 = new Quartier("debut route 47", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier milieu_route47 = new Quartier("debut route 47", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier fin_route47 = new Quartier("fin route 47", 0, 0, 11, 8, Terrains.terrainEau);
    
    public static Ville ile_de_mewtwo = new Ville("ile de mewtwo", 10, 11, 1, 3);
    public static Quartier entree_ile_de_mewtwo = new Quartier("Entree ile de mewtwo", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville ile_de_mew = new Ville("ile de mew", 10, 11, 1, 3);
    public static Quartier quartierLabo_ile_de_mew = new Quartier("Quartier labo ile de mew", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartierForet_ile_de_mew = new Quartier("Quartier foret ile de mew", 0, 0, 11, 8, Terrains.terrainNormal);
    
    
    
    public static Pays Jhoto = new Pays("Jhoto", 5, 3, 102, 100);
    public static Zone zoneDebut_jhoto = new Zone("zone de debut jhoto", 0, 0, 3, 2);
    public static SousZone zoneBourgGeon_zoneDebut_jhoto = new SousZone("zone de bourg geon", 1, 1, 10, 6);
    
    public static Ville bourg_geon = new Ville("Bourg Geon", 10, 11, 1, 3);
    public static Quartier quartierHabitant_bourg_geon = new Quartier("quartier habitant Bourg Geon", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonRival1_quartierHabitant_bourg_geon = new Maison("maison de Rival1 bourg geon", 5, 4, 1, 1, 1, Orientation.face, 
            Endroits.quartierHabitant_bourg_geon, false);
    public static Salle bas_maisonRival1_quartierHabitant_bourg_geon = new Salle("rez de chausse maison Rival1 bourg geon", 0, 0, 10, 7, 
            Endroits.maisonRival1_quartierHabitant_bourg_geon, 0);
    public static Salle chambreRival1_maisonRival1_quartierHabitant_bourg_geon = new Salle("chambre de Rival1 bourg geon", 0, 0, 10, 7, 
            Endroits.maisonRival1_quartierHabitant_bourg_geon, 1);
    public static Maison maisonRival2_quartierHabitant_bourg_geon = new Maison("maison de Rival2 bourg geon", 5, 6, 1, 1, 1, Orientation.face, 
            Endroits.quartierHabitant_bourg_geon, false);
    public static Salle bas_maisonRival2_quartierHabitant_bourg_geon = new Salle("rez de chausse maison Rival2 bourg geon", 0, 0, 10, 7, 
            Endroits.maisonRival2_quartierHabitant_bourg_geon, 0);
    public static Salle chambreRival2_maisonRival2_quartierHabitant_bourg_geon = new Salle("chambre de Rival2 bourg geon", 0, 0, 10, 7, 
            Endroits.maisonRival2_quartierHabitant_bourg_geon, 0);
    public static Maison maisonRival3_quartierHabitant_bourg_geon = new Maison("maison de Rival3 bourg geon", 5, 8, 1, 1, 1, Orientation.face, 
            Endroits.quartierHabitant_bourg_geon, false);
    public static Salle bas_maisonRival3_quartierHabitant_bourg_geon = new Salle("rez de chausse maison Rival3 bourg geon", 0, 0, 10, 7, 
            Endroits.maisonRival3_quartierHabitant_bourg_geon, 0);
    public static Salle chambreRival3_maisonRival3_quartierHabitant_bourg_geon = new Salle("chambre de Rival3 bourg geon", 0, 0, 10, 7, 
            Endroits.maisonRival3_quartierHabitant_bourg_geon, 0);
    public static CentrePokemon centrepokemon_bourg_geon = new CentrePokemon("centre pokemon bourg geon", 1, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_bourg_geon);
    public static Magasin shop_bourg_geon = new Magasin("shop bourg geon", 1, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_bourg_geon);
    public static Maison maisonProfOrme_quartierHabitant_bourg_geon = new Maison("maison prof orme", 1, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_bourg_geon, true);
    public static Quartier quartierLabo_bourg_geon = new Quartier("quartier labo Bourg Geon", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment laboProfOrme_quartierLabo_bourg_geon = new Batiment("Labo du prof orme", 2, 5, 1, 1, 0, 1,Orientation.face, 
            Endroits.quartierLabo_bourg_geon, TypeBatiment.labo);
    public static Salle bas_laboProfOrme_quartierLabo_bourg_geon = new Salle("rez de chausse labo prof orme", 0, 0, 10, 7, 
            Endroits.laboProfOrme_quartierLabo_bourg_geon, 0);
    public static Quartier quartierParcLaboProfOrm_bourgGeon = new Quartier("quartier parc labo prof orm bourg geon", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route29 = new Ville("Route 29", 10, 11, 1, 3);
    public static Quartier debut_route29 = new Quartier("debut route 29", 0, 0, 17, 16, Terrains.terrainNormal);
    public static Quartier milieu_route29 = new Quartier("milieu route 29", 0, 0, 17, 16, Terrains.terrainNormal);
    public static Quartier fin_route29 = new Quartier("fin route 29", 0, 0, 16, 16, Terrains.terrainNormal);
    
    public static Ville ville_griotte = new Ville("Ville griotte", 10, 11, 1, 3);
    public static Quartier quartierHabitant_ville_griotte = new Quartier("quartier habitant Ville griotte", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_ville_griotte = new CentrePokemon("centre pokemon", 1, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_ville_griotte);
    public static Magasin shop_ville_griotte = new Magasin("shop", 1, 3, 1, 1, 0, Orientation.face, Endroits.quartierHabitant_ville_griotte);
    public static Maison maisonHabitant1_quartierHabitant_ville_griotte = new Maison("maison habitant", 3, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_ville_griotte, true);
    public static Maison maisonHabitant2_quartierHabitant_ville_griotte = new Maison("maison habitant", 3, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_ville_griotte, true);
    public static Maison maisonHabitant3_quartierHabitant_ville_griotte = new Maison("maison habitant", 5, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_ville_griotte, true);
    public static Quartier quartierEau_ville_griotte = new Quartier("quartier eau Ville griotte", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route30 = new Ville("Route 30", 10, 11, 1, 3);
    public static Quartier debut_route30 = new Quartier("debut route 30", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route30_1 = new Quartier("milieu route 30", 0, 0, 18, 10, Terrains.terrainNormal);
    public static Maison maison_milieu_route30_1 = new Maison("maison habitant", 6, 6, 1, 1, 0, Orientation.face, Endroits.milieu_route30_1, true);
    public static Quartier milieu_route30_2 = new Quartier("milieu route 30 2", 0, 0, 18, 13, Terrains.terrainNormal);
    public static Quartier fin_route30 = new Quartier("fin route 30", 0, 0, 17, 13, Terrains.terrainNormal);
    public static Maison maison_fin_route30 = new Maison("maison habitant", 2, 13, 1, 1, 0, Orientation.face, Endroits.fin_route30, true);
    
    public static Ville route31 = new Ville("Route 31", 10, 11, 1, 3);
    public static Quartier debut_route31 = new Quartier("debut route 31", 0, 0, 14, 13, Terrains.terrainNormal);
    public static Grotte antre_noir_debut_route31 = new Grotte("Cave taupiqueur route 11", 4, 8, 1, 1, 0, Orientation.face, Endroits.debut_route31);
    public static Quartier fin_route31 = new Quartier("fin route 31", 0, 0, 14, 13, Terrains.terrainNormal);
    
    public static Ville mauville = new Ville("Mauville", 10, 11, 1, 3);
    public static Quartier quartier_arene_mauville = new Quartier("Quartier Arene Mauville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_mauville = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_mauville);
    public static ArenePkmn arene_albert_mauville = new ArenePkmn("arène de Albert", 3, 9, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_mauville);
    public static Salle bas_arene_albert_mauville = new Salle("rez de chausse arène de Albert", 0, 0, 10, 7, 
            Endroits.arene_albert_mauville, 0, Terrains.terrainVol);
    public static Salle salle_champion_arene_albert_mauville = new Salle("salle champion arène de Albert", 0, 0, 10, 7, 
            Endroits.arene_albert_mauville, 0, Terrains.terrainVol);
    public static Maison maisonHabitant_quartierArene_mauville = new Maison("maison habitant", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_mauville, true);
    public static Quartier quartier_tour_chetiflor_mauville = new Quartier("Quartier Tour chetiflor Mauville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment tour_chetiflor = new Batiment("tour chetiflor", 2, 5, 1, 1, 0, 2, Orientation.face, 
            Endroits.quartier_tour_chetiflor_mauville, TypeBatiment.grand_batiment);
    public static Salle rc_tour_chetiflor = new Salle("rez de chausse tour chetiflor", 0, 0, 10, 7, Endroits.tour_chetiflor, 0);
    public static Salle etage1_tour_chetiflor = new Salle("etage 1 tour chetiflor", 0, 0, 10, 7, Endroits.tour_chetiflor, 1);
    public static Salle etage2_tour_chetiflor = new Salle("etage 2 tour chetiflor", 0, 0, 10, 7, Endroits.tour_chetiflor, 2);
    public static Quartier quartier_habitant_mauville = new Quartier("Quartier habitant Mauville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_mauville = new CentrePokemon("centre pokemon", 3, 5, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_mauville);
    public static Batiment academiePokemonMauville = new Batiment("Académie POkemon", 0, 4, 1, 1, 0, 0, Orientation.face, 
            Endroits.quartier_habitant_mauville, TypeBatiment.grand_batiment);
    public static Maison maisonHabitant_quartierHabitant_mauville = new Maison("maison habitant", 4, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_mauville, true);
    
    public static Ville route32 = new Ville("Route 32", 10, 11, 1, 3);
    public static Quartier debut_route32 = new Quartier("debut route32", 0, 0, 17, 12, Terrains.terrainNormal);
    public static Quartier milieu_route32_1 = new Quartier("milieu route32 1", 0, 0, 17, 12, Terrains.terrainNormal);
    public static Quartier milieu_route32_2 = new Quartier("milieu route32 2", 0, 0, 17, 12, Terrains.terrainNormal);
    public static Quartier milieu_route32_3 = new Quartier("milieu route32 3", 0, 0, 17, 12, Terrains.terrainNormal);
    public static Quartier milieu_route32_4 = new Quartier("milieu route32 4", 0, 0, 17, 12, Terrains.terrainNormal);
    public static Quartier fin_route32 = new Quartier("fin route32", 0, 0, 17, 12, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_route32 = new CentrePokemon("centre pokemon route 32", 10, 12, 1, 1, 0, Orientation.face, 
            Endroits.milieu_route32_4);
    
    public static Ville ruine_alpha = new Ville("ruine alpha", 10, 11, 1, 3);
    public static Quartier debut_ruine_alpha = new Quartier("debut ruine alpha", 0, 0, 17, 12, Terrains.terrainNormal);
    public static Quartier milieu_ruine_alpha = new Quartier("milieu ruine alpha", 0, 0, 17, 12, Terrains.terrainNormal);
    public static Quartier fin_ruine_alpha = new Quartier("fin ruine alpha", 0, 0, 17, 12, Terrains.terrainNormal);
    
    public static Ville route33 = new Ville("Route 33", 10, 11, 1, 3);
    public static Quartier debut_route33 = new Quartier("debut route33", 0, 0, 14, 12, Terrains.terrainNormal);
    
    public static Grotte caves_jumelle_fin_route32 = new Grotte("Caves jumelles", 1, 7, 1, 1, 0, Orientation.face, Endroits.fin_route32);
    public static Grotte caves_jumelle_route33 = new Grotte("Caves jumelles", 3, 9, 1, 1, 0, Orientation.face, Endroits.debut_route33);
    public static Salle caves_jumelle_rdc_p1 = new Salle("Caves jumelles rdc p1", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_rdc_p2 = new Salle("Caves jumelles rdc p2", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_rdc_p3 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_route33, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_rdc_p4 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_rdc_p5 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_etage1_p1 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_etage1_p2 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_ss1_p1 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_ss1_p2 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_ss1_p3 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_ss2_p1 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    public static Salle caves_jumelle_ss2_p2 = new Salle("Caves jumelles rdc p3", 0, 0, 11, 8, Endroits.caves_jumelle_fin_route32, 0, 
            Terrains.terrainRoche);
    
    public static Ville ecorcia = new Ville("Ecorcia", 10, 11, 1, 3);
    public static Quartier quartier_arene_ecorcia = new Quartier("Quartier Arene Mauville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonFargas_ecorcia = new Maison("maison fargas", 1, 3, 1, 1, 0, Orientation.face, Endroits.quartier_arene_ecorcia, true);
    public static CentrePokemon centrepokemon_ecorcia = new CentrePokemon("centre pokemon", 2, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ecorcia);
    public static Magasin shop_ecorcia = new Magasin("shop", 2, 9, 1, 1, 0, Orientation.face, Endroits.quartier_arene_ecorcia);
    public static ArenePkmn arene_hector_ecorcia = new ArenePkmn("arène de Hector", 5, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ecorcia);
    public static Salle bas_arene_hector_ecorcia = new Salle("rez de chausse arène de Hector", 0, 0, 10, 7, 
            Endroits.arene_hector_ecorcia, 0, Terrains.terrainInsecte);
    public static Maison fourCharbon_ecorcia = new Maison("four a charbon", 5, 9, 1, 1, 0, Orientation.face, Endroits.quartier_arene_ecorcia, true);
    public static Quartier quartier_puit_ecorcia = new Quartier("Quartier habitant Mauville", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Grotte puit_ramoloss = new Grotte("puit ramoloss", 1, 5, 1, 1, 0, Orientation.face, Endroits.quartier_puit_ecorcia);
    public static Salle entree_puit_ramoloss = new Salle("puit ramoloss entree", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    public static Salle puit_ramoloss_ss1_p1 = new Salle("puit ramoloss ss1 p1", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    public static Salle puit_ramoloss_ss1_p2 = new Salle("puit ramoloss ss1 p2", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    public static Salle puit_ramoloss_ss1_p3 = new Salle("puit ramoloss ss1 p3", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    public static Salle puit_ramoloss_ss1_p4 = new Salle("puit ramoloss ss1 p4", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    public static Salle puit_ramoloss_ss2_p1 = new Salle("puit ramoloss ss2 p1", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    public static Salle puit_ramoloss_ss2_p2 = new Salle("puit ramoloss ss2 p2", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    public static Salle puit_ramoloss_ss2_p3 = new Salle("puit ramoloss ss2 p3", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    public static Salle puit_ramoloss_ss2_p4 = new Salle("puit ramoloss ss2 p4", 0, 0, 11, 8, Endroits.puit_ramoloss, 0, Terrains.terrainRoche);
    
    public static Ville bois_aux_chene = new Ville("Bois aux chenes", 10, 11, 1, 3);
    /*public static Quartier bois_aux_chene1 = new Quartier("Bois aux chenes 1", 0, 0, 13, 12, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene2 = new Quartier("Bois aux chenes 2", 0, 0, 13, 12, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene3 = new Quartier("Bois aux chenes 3", 0, 0, 13, 12, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene4 = new Quartier("Bois aux chenes 4", 0, 0, 13, 12, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene5 = new Quartier("Bois aux chenes 5", 0, 0, 13, 12, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene6 = new Quartier("Bois aux chenes 6", 0, 0, 13, 12, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene7 = new Quartier("Bois aux chenes 7", 0, 0, 12, 15, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene8 = new Quartier("Bois aux chenes 8", 0, 0, 13, 12, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene9 = new Quartier("Bois aux chenes 9", 0, 0, 13, 12, Terrains.terrainInsecte);*/
    public static Quartier bois_aux_chene1 = new Quartier("Bois aux chenes 1", 0, 0, 24, 19, Terrains.terrainInsecte);
    public static Quartier bois_aux_chene2 = new Quartier("Bois aux chenes 2", 0, 0, 27, 19, Terrains.terrainInsecte);
    
    public static Ville route34 = new Ville("Route 34", 10, 11, 1, 3);
    public static Quartier debut_route34 = new Quartier("debut route 34", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison pensionPokemonJhoto = new Maison("Pension pokemon", 5, 4, 1, 1, 0, Orientation.face, Endroits.debut_route34, true);
    public static Quartier milieu_route34 = new Quartier("milieu route 34", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route34 = new Quartier("fin route 34", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville doublonville = new Ville("Doublonville", 10, 11, 1, 3);
    public static Quartier quartierBoutique_doublonville = new Quartier("quartier boutique Doublonville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonHabitant1_quartierBoutique_doublonville = new Maison("maison", 0, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison maisonHabitant2_quartierBoutique_doublonville = new Maison("maison", 0, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison casino_quartierBoutique_doublonville = new Maison("casino", 0, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison maisonHabitant3_quartierBoutique_doublonville = new Maison("maison", 1, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison leo_quartierBoutique_doublonville = new Maison("leo", 2, 1, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static CentrePokemon centrepokemon_doublonville = new CentrePokemon("centre pokemon", 3, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville);
    public static Batiment centre_commercial_doublonville = new Batiment("Centre commercial", 3, 6, 1, 1, 0, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, TypeBatiment.centre_commercial);
    public static Maison sousTerrain_quartierBoutique_doublonville = new Maison("sous terrain", 4, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Magasin boutiqueVelo_doublonville = new Magasin("Cycles a gogos", 4, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville);
    public static Maison maisonHabitant4_quartierBoutique_doublonville = new Maison("maison", 5, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison maisonHabitant5_quartierBoutique_doublonville = new Maison("maison", 6, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison maisonHabitant6_quartierBoutique_doublonville = new Maison("maison", 7, 4, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison maisonHabitant7_quartierBoutique_doublonville = new Maison("maison", 5, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison maisonHabitant8_quartierBoutique_doublonville = new Maison("maison", 6, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Maison maisonHabitant9_quartierBoutique_doublonville = new Maison("maison", 7, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_doublonville, true);
    public static Quartier quartierArene_doublonville = new Quartier("quartier arene Doublonville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Gare gare_doublonville = new Gare("Gare de doublonville", 6, 2, 1, 1, 0, Orientation.face, Endroits.quartierArene_doublonville);
    public static Batiment tour_radio = new Batiment("tour radio", 6, 1, 1, 1, 0, 0, Orientation.face, Endroits.quartierArene_doublonville, TypeBatiment.tour_radio);
    public static Maison sousTerrain_quartierArene_doublonville = new Maison("sous terrain", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_doublonville, true);
    public static Maison specialisteNom_quartierArene_doublonville = new Maison("spécialiste des noms", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_doublonville, true);
    public static ArenePkmn arene_blanche_doublonville = new ArenePkmn("arène de blanche", 3, 6, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_doublonville);
    public static Salle bas_arene_blanche_doublonville = new Salle("rez de chausse arène de Blanche", 0, 0, 10, 7, 
            Endroits.arene_blanche_doublonville, 0, Terrains.terrainNormal);
    public static Salle salle_champion_arene_blanche_doublonville = new Salle("salle champion arène de Blanche", 0, 0, 10, 7, 
            Endroits.arene_blanche_doublonville, 0, Terrains.terrainNormal);
    public static Maison fleuriste_quartierArene_doublonville = new Maison("fleuriste", 3, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_doublonville, true);
    public static Maison maisonHabitant_quartierArene_doublonville = new Maison("maison", 3, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_doublonville, true);
    
    public static Ville route35 = new Ville("Route 35", 10, 11, 1, 3);
    public static Quartier debut_route35 = new Quartier("debut route 35", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route35 = new Quartier("debut route 35", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route35 = new Quartier("fin route 35", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville parc_naturel = new Ville("Parc naturel", 10, 11, 1, 3);
    public static Quartier entree_parc_naturel = new Quartier("entree Parc naturel", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier parc_naturel1 = new Quartier("Parc naturel 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier parc_naturel2 = new Quartier("Parc naturel 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier parc_naturel3 = new Quartier("Parc naturel 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier parc_naturel4 = new Quartier("Parc naturel 4", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route36 = new Ville("Route 36", 10, 11, 1, 3);
    public static Quartier debut_route36 = new Quartier("debut route 36", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route36 = new Quartier("debut route 36", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route36 = new Quartier("fin route 36", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route37 = new Ville("Route 37", 10, 11, 1, 3);
    public static Quartier debut_route37 = new Quartier("debut route 37", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route37 = new Quartier("fin route 37", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville rosalia = new Ville("Rosalia", 10, 11, 1, 3);
    public static Quartier quartier_arene_rosalia = new Quartier("Quartier Arene Rosalia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static ArenePkmn arene_mortimer_rosalia = new ArenePkmn("arène de Mortimer", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_rosalia);
    public static Salle bas_arene_mortimer_rosalia = new Salle("rez de chausse arène de Mortimer", 0, 0, 10, 7, 
            Endroits.arene_mortimer_rosalia, 0, Terrains.terrainSpectre);
    public static Quartier quartier_boutique_rosalia = new Quartier("Quartier Boutique Rosalia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_rosalia = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_boutique_rosalia);
    public static Magasin shop_rosalia = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_boutique_rosalia);
    public static Quartier quartier_tourCendree_rosalia = new Quartier("Quartier Tour cendrée Rosalia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment tour_cendree = new Batiment("tour cendree", 2, 5, 1, 1, 0, 1, Orientation.face, 
            Endroits.quartier_tourCendree_rosalia, TypeBatiment.grand_batiment);
    public static Salle rc_tour_cendree = new Salle("rez de chausse tour cendree", 0, 0, 7, 10, Endroits.tour_cendree, 0);
    public static Salle etage1_tour_cendree = new Salle("etage 1 tour cendree", 0, 0, 7, 10, Endroits.tour_cendree, 1);
    
    public static Ville route38 = new Ville("Route 38", 10, 11, 1, 3);
    public static Quartier debut_route38 = new Quartier("debut route 38", 0, 0, 16, 15, Terrains.terrainNormal);
    public static Quartier fin_route38 = new Quartier("fin route 38", 0, 0, 16, 15, Terrains.terrainNormal);
    
    public static Ville route39 = new Ville("Route 39", 10, 11, 1, 3);
    public static Quartier debut_route39 = new Quartier("debut route 39", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route39 = new Quartier("debut route 39", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route39 = new Quartier("fin route 39", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville oliville = new Ville("Oliville", 10, 11, 1, 3);
    public static Quartier quartier_arene_oliville = new Quartier("Quartier Arene Oliville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static ArenePkmn arene_jasmine_oliville = new ArenePkmn("arène de Jasmine", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_oliville);
    public static Salle bas_arene_jasmine_oliville = new Salle("rez de chausse arène de Jasmine", 0, 0, 10, 7, 
            Endroits.arene_jasmine_oliville, 0, Terrains.terrainAcier);
    public static Quartier quartier_boutique_oliville = new Quartier("Quartier Boutique Oliville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_oliville = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_boutique_oliville);
    public static Magasin shop_oliville = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_boutique_oliville);
    public static Quartier quartier_phare_oliville = new Quartier("Quartier Phare Oliville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_port_oliville = new Quartier("Quartier Port Oliville", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville chenal40 = new Ville("Chenal 40", 10, 11, 1, 3);
    public static Quartier debut_chenal40 = new Quartier("debut Chenal 40", 0, 0, 16, 15, Terrains.terrainNormal);
    public static Quartier fin_chenal40 = new Quartier("fin Chenal 40", 0, 0, 16, 15, Terrains.terrainNormal);
    
    public static Ville chenal41 = new Ville("Chenal 41", 10, 11, 1, 3);
    public static Quartier debut_chenal41 = new Quartier("debut Chenal 41", 0, 0, 16, 15, Terrains.terrainNormal);
    public static Quartier milieu_chenal41_1 = new Quartier("debut Chenal 41", 0, 0, 16, 15, Terrains.terrainNormal);
    public static Quartier milieu_chenal41_2 = new Quartier("fin Chenal 41", 0, 0, 16, 15, Terrains.terrainNormal);
    public static Quartier fin_chenal41 = new Quartier("fin Chenal 41", 0, 0, 16, 15, Terrains.terrainNormal);
    
    public static Ville irisia = new Ville("Irisia", 10, 11, 1, 3);
    public static Quartier quartier_arene_irisia = new Quartier("Quartier Arene Irisia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_irisia = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_irisia);
    public static Magasin shop_irisia = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_irisia);
    public static ArenePkmn arene_chuck_irisia = new ArenePkmn("arène de Chuck", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_irisia);
    public static Salle bas_arene_chuck_irisia = new Salle("rez de chausse arène de Chuck", 0, 0, 10, 7, 
            Endroits.arene_chuck_irisia, 0, Terrains.terrainCombat);
    public static Quartier quartier_habitant_irisia = new Quartier("Quartier Boutique Irisia", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route42 = new Ville("Route 42", 10, 11, 1, 3);
    public static Quartier debut_route42 = new Quartier("debut route42", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte mont_creuset_debut_route42 = new Grotte("Mont creuset", 1, 8, 1, 1, 0, Orientation.face, Endroits.debut_route42);
    public static Quartier milieu_route42 = new Quartier("milieu route42", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte mont_creuset_milieu_route42 = new Grotte("Mont creuset", 1, 8, 1, 1, 0, Orientation.face, Endroits.milieu_route42);
    public static Quartier fin_route42 = new Quartier("debut route42", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte mont_creuset_fin_route42 = new Grotte("Mont creuset", 1, 8, 1, 1, 0, Orientation.face, Endroits.fin_route42);
    
    public static Ville acajou = new Ville("Acajou", 10, 11, 1, 3);
    public static Quartier quartier_arene_acajou = new Quartier("Quartier Arene Irisia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_acajou = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_acajou);
    public static Magasin shop_acajou = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_acajou);
    public static ArenePkmn arene_fredo_acajou = new ArenePkmn("arène de Fredo", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_acajou);
    public static Salle bas_arene_fredo_acajou = new Salle("rez de chausse arène de Fredo", 0, 0, 10, 7, 
            Endroits.arene_fredo_acajou, 0, Terrains.terrainGlace);
    
    public static Ville route43 = new Ville("Route 43", 10, 11, 1, 3);
    public static Quartier debut_route43 = new Quartier("debut route43", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route43 = new Quartier("milieu route43", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route43 = new Quartier("fin route43", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville lac_colere = new Ville("Lac colere", 10, 11, 1, 3);
    public static Quartier lac_colere1 = new Quartier("Lac colere 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier lac_colere2 = new Quartier("Lac colere 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier lac_colere3 = new Quartier("Lac colere 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier lac_colere4 = new Quartier("Lac colere 4", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route44 = new Ville("Route 44", 10, 11, 1, 3);
    public static Quartier debut_route44 = new Quartier("debut route44", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route44 = new Quartier("milieu route44", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route44 = new Quartier("fin route44", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte route_de_glace_route44 = new Grotte("Route de glace", 1, 8, 1, 1, 0, Orientation.face, Endroits.fin_route44);
    
    public static Ville ebenelle = new Ville("Ebenelle", 10, 11, 1, 3);
    public static Quartier quartier_arene_ebenelle = new Quartier("Quartier Arene Ebenelle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static ArenePkmn arene_sandra_ebenelle = new ArenePkmn("arène de Sandra", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ebenelle);
    public static Salle bas_arene_sandra_ebenelle = new Salle("rez de chausse arène de Sandra", 0, 0, 10, 7, 
            Endroits.arene_sandra_ebenelle, 0, Terrains.terrainDragon);
    public static Quartier quartierBoutique_ebenelle = new Quartier("quartier boutique Ebenelle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_ebenelle = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierBoutique_ebenelle);
    public static Magasin shop_ebenelle = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartierBoutique_ebenelle);
    public static Quartier quartierRouteGlace_ebenelle = new Quartier("quartier route de glace Ebenelle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte route_de_glace_ebenelle = new Grotte("Route de glace", 1, 8, 1, 1, 0, Orientation.face, Endroits.quartierRouteGlace_ebenelle);
    
    public static Ville route45 = new Ville("Route 45", 10, 11, 1, 3);
    public static Quartier debut_route45 = new Quartier("debut route45", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route45_1 = new Quartier("milieu route 45 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route45_2 = new Quartier("milieu route 45 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier milieu_route45_3 = new Quartier("milieu route 45 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route45 = new Quartier("fin route45", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route46 = new Ville("Route 46", 10, 11, 1, 3);
    public static Quartier debut_route46 = new Quartier("debut route 46", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route46 = new Quartier("fin route 46", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route26 = new Ville("Route 26", 10, 11, 1, 3);
    public static Quartier debut_route26 = new Quartier("debut route 26", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route26 = new Quartier("fin route 26", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route27 = new Ville("Route 27", 10, 11, 1, 3);
    public static Quartier debut_route27 = new Quartier("debut route 27", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier fin_route27 = new Quartier("fin route 27", 0, 0, 11, 8, Terrains.terrainNormal);
    
    
    
    public static Pays ile_orange = new Pays("Iles orange", 5, 3, 102, 100);
    
    public static Ville ile_de_valencia = new Ville("Ile de valencia", 10, 11, 1, 3);
    public static Quartier quartier_port_ile_de_valencia = new Quartier("Quartier port Ile de valencia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_habitant_ile_de_valencia = new Quartier("Quartier habitant Ile de valencia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_labo_ile_de_valencia = new Quartier("Quartier labo Ile de valencia", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route50 = new Ville("Route 50", 10, 11, 1, 3);
    public static Quartier debut_route50 = new Quartier("debut route 50", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier milieu_route50 = new Quartier("milieu route 50", 0, 0, 11, 8, Terrains.terrainEau);
    public static Quartier fin_route50 = new Quartier("fin route 50", 0, 0, 11, 8, Terrains.terrainEau);
    
    public static Ville ile_gelatine = new Ville("Ile Gelatine", 10, 11, 1, 3);
    public static Quartier quartier_plage_ile_gelatine = new Quartier("Quartier plage Ile Gelatine", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_centre_pokemon_ile_gelatine = new Quartier("Quartier centre pokemon Ile Gelatine", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route51 = new Ville("Route 51", 10, 11, 1, 3);
    
    public static Ville ile_dame_blanche = new Ville("Ile dame blanche", 10, 11, 1, 3);
    public static Quartier quartier_port_ile_dame_blanche = new Quartier("Quartier Arene Ile dame blanche", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_habitant_ile_dame_blanche = new Quartier("Quartier Arene Ile dame blanche", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_arene_ile_dame_blanche = new Quartier("Quartier Arene Ile dame blanche", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_ile_dame_blanche = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_ile_dame_blanche);
    public static ArenePkmn arene_cissy_ile_dame_blanche = new ArenePkmn("arène de Cisssy", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ile_dame_blanche);
    public static Salle bas_arene_cissy_ile_dame_blanche = new Salle("rez de chausse arène de Cisssy", 0, 0, 10, 7, 
            Endroits.arene_cissy_ile_dame_blanche, 0, Terrains.terrainEau);
    public static CentrePokemon centrepokemon_ile_dame_blanche = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ile_dame_blanche);
    
    public static Ville route52 = new Ville("Route 52", 10, 11, 1, 3);
    
    public static Ville ile_de_la_mandarine = new Ville("Ile de la mandarine", 10, 11, 1, 3);
    public static Quartier quartier_port_ile_de_la_mandarine = new Quartier("Quartier port Ile de la mandarine", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_habitant_ile_de_la_mandarine = new Quartier("Quartier habitant Ile de la mandarine", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_labo_ile_de_la_mandarine = new Quartier("Quartier tour Ile de la mandarine", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route53 = new Ville("Route 53", 10, 11, 1, 3);
    
    public static Ville ile_caramel = new Ville("Ile caramel", 10, 11, 1, 3);
    public static Quartier quartier_port_ile_caramel = new Quartier("Quartier port Ile de la mandarine", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_boutique_ile_caramel = new Quartier("Quartier habitant Ile de la mandarine", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_ile_ile_caramel = new Quartier("Quartier tour Ile de la mandarine", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte grotte_de_glace = new Grotte("grotte de glace", 1, 8, 1, 1, 0, Orientation.face, Endroits.quartier_ile_ile_caramel);
    
    public static Ville route54 = new Ville("Route 54", 10, 11, 1, 3);
    
    public static Ville ile_guimauve = new Ville("Ile guimauve", 10, 11, 1, 3);
    
    public static Ville ile_damlin = new Ville("Ile damlin", 10, 11, 1, 3);
    
    public static Ville ile_cachou = new Ville("Ile cachou", 10, 11, 1, 3);
    
    public static Ville ile_citrus = new Ville("Ile citrus", 10, 11, 1, 3);
    public static Quartier quartier_arene_ile_citrus = new Quartier("Quartier Arene Ile citrus", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_ile_citrus = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_ile_citrus);
    public static ArenePkmn arene_luana_ile_citrus = new ArenePkmn("arène de Luana", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ile_citrus);
    public static Salle bas_arene_luana_ile_citrus = new Salle("rez de chausse arène de Luana", 0, 0, 10, 7, 
            Endroits.arene_luana_ile_citrus, 0, Terrains.terrainEau);
    public static CentrePokemon centrepokemon_ile_citrus = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ile_citrus);
    
    public static Ville ile_banana_split = new Ville("Ile banana split", 10, 11, 1, 3);
    
    public static Ville ile_tartofou = new Ville("Ile tartofou", 10, 11, 1, 3);
    public static Quartier quartier_arene_ile_tartofou = new Quartier("Quartier Arene Ile tartofou", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_ile_tartofou = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_ile_tartofou);
    public static ArenePkmn arene_rudy_ile_tartofou = new ArenePkmn("arène de Rudy", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ile_tartofou);
    public static Salle bas_arene_rudy_ile_tartofou = new Salle("rez de chausse arène de Rudy", 0, 0, 10, 7, 
            Endroits.arene_rudy_ile_tartofou, 0, Terrains.terrainEau);
    public static CentrePokemon centrepokemon_ile_tartofou = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ile_tartofou);
    
    public static Ville ile_pomelo = new Ville("Ile pomelos", 10, 11, 1, 3);
    
    public static Ville ile_double_chantilly = new Ville("Ile double chantilly", 10, 11, 1, 3);
    public static Quartier quartier_arene_ile_double_chantilly = new Quartier("Quartier Arene Ile double chantilly", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_ile_double_chantilly = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_ile_double_chantilly);
    public static ArenePkmn arene_danny_ile_double_chantilly = new ArenePkmn("arène de Danny", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ile_double_chantilly);
    public static Salle bas_arene_danny_ile_double_chantilly = new Salle("rez de chausse arène de Danny", 0, 0, 10, 7, 
            Endroits.arene_danny_ile_double_chantilly, 0, Terrains.terrainEau);
    public static CentrePokemon centrepokemon_ile_double_chantilly = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_ile_double_chantilly);
    
    public static Ville ile_pamplemousses = new Ville("Ile pamplemousses", 10, 11, 1, 3);
    
    public static Ville ile_clementine = new Ville("Ile clementine", 10, 11, 1, 3);
    
    public static Ville ile_cleopatre = new Ville("Ile cleopatre", 10, 11, 1, 3);
    
    public static Ville ile_zesti = new Ville("Ile zesti", 10, 11, 1, 3);
    
    public static Ville ile_golden = new Ville("Ile golden", 10, 11, 1, 3);
    
    public static Ville ile_shamouti = new Ville("Ile shamouti", 10, 11, 1, 3);
    public static Quartier ile_monument_shamouti = new Quartier("Ile monument shamouti", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville ile_artikodin = new Ville("Ile Artikodin", 10, 11, 1, 3);
    public static Quartier montagne_ile_artikodin = new Quartier("montagne Ile Artikodin", 0, 0, 11, 8, Terrains.terrainGlace);
    public static Grotte grotte_artikodin = new Grotte("grotte Artikodin", 1, 8, 1, 1, 0, Orientation.face, Endroits.montagne_ile_artikodin);
    public static Salle hotel_grotte_artikodin = new Salle("hotel grotte Artikodin", 0, 0, 11, 8, Endroits.grotte_artikodin, 0, Terrains.terrainGlace);
    
    public static Ville ile_sulfura = new Ville("Ile Sulfura", 10, 11, 1, 3);
    public static Quartier montagne_ile_sulfura = new Quartier("montagne Ile Sulfura", 0, 0, 11, 8, Terrains.terrainFeu);
    public static Grotte grotte_sulfura = new Grotte("grotte Sulfura", 1, 8, 1, 1, 0, Orientation.face, Endroits.montagne_ile_sulfura);
    public static Salle hotel_grotte_sulfura = new Salle("hotel grotte Sulfura", 0, 0, 11, 8, Endroits.grotte_sulfura, 0, Terrains.terrainFeu);
    
    public static Ville ile_elekthor = new Ville("Ile Elekthor", 10, 11, 1, 3);
    public static Quartier montagne_ile_elekthor = new Quartier("montagne Ile Elekthor", 0, 0, 11, 8, Terrains.terrainElectrique);
    public static Grotte grotte_elekthor = new Grotte("grotte Elekthor", 1, 8, 1, 1, 0, Orientation.face, Endroits.montagne_ile_elekthor);
    public static Salle hotel_grotte_elekthor = new Salle("hotel grotte Elekthor", 0, 0, 11, 8, Endroits.grotte_elekthor, 0, Terrains.terrainElectrique);
    
    
    
    
    public static Pays Hoenn = new Pays("Hoenn", 5, 3, 102, 100);
    
    public static Ville bourg_en_vol = new Ville("Bourg en vol", 10, 11, 1, 3);
    public static Quartier quartier_habitant_bourg_en_vol = new Quartier("Quartier Habitant Bourg en vol", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonRival1_quartier_habitant_bourg_en_vol = new Maison("maison de Rival1", 5, 4, 1, 1, 1, Orientation.face, 
            Endroits.quartier_habitant_bourg_en_vol, false);
    public static Salle bas_maisonRival1_quartier_habitant_bourg_en_vol = new Salle("rez de chausse maison Rival1", 0, 0, 10, 7, 
            Endroits.maisonRival1_quartier_habitant_bourg_en_vol, 0);
    public static Salle chambreRival1_maisonRival1_quartier_habitant_bourg_en_vol = new Salle("chambre de Rival1", 0, 0, 10, 7, 
            Endroits.maisonRival1_quartier_habitant_bourg_en_vol, 1);
    public static Maison maisonRival2_quartier_habitant_bourg_en_vol = new Maison("maison de Rival2", 5, 6, 1, 1, 1, Orientation.face, 
            Endroits.quartier_habitant_bourg_en_vol, false);
    public static Salle bas_maisonRival2_quartier_habitant_bourg_en_vol = new Salle("rez de chausse maison Rival2", 0, 0, 10, 7, 
            Endroits.maisonRival2_quartier_habitant_bourg_en_vol, 0);
    public static Salle chambreRival2_maisonRival2_quartier_habitant_bourg_en_vol = new Salle("chambre de Rival2", 0, 0, 10, 7, 
            Endroits.maisonRival2_quartier_habitant_bourg_en_vol, 0);
    public static Maison maisonRival3_quartier_habitant_bourg_en_vol = new Maison("maison de Rival3", 5, 8, 1, 1, 1, Orientation.face, 
            Endroits.quartier_habitant_bourg_en_vol, false);
    public static Salle bas_maisonRival3_quartier_habitant_bourg_en_vol = new Salle("rez de chausse maison Rival3", 0, 0, 10, 7, 
            Endroits.maisonRival3_quartier_habitant_bourg_en_vol, 0);
    public static Salle chambreRival3_maisonRival3_quartier_habitant_bourg_en_vol = new Salle("chambre de Rival3", 0, 0, 10, 7, 
            Endroits.maisonRival3_quartier_habitant_bourg_en_vol, 0);
    public static CentrePokemon centrepokemon_bourg_en_vol = new CentrePokemon("centre pokemon", 1, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_bourg_en_vol);
    public static Magasin shop_bourg_en_vol = new Magasin("shop", 1, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_bourg_en_vol);
    public static Maison maisonProfSeko_quartier_habitant_bourg_en_vol = new Maison("maison prof Seko", 1, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_bourg_en_vol, true);
    public static Quartier quartier_labo_bourg_en_vol = new Quartier("Quartier labo Bourg en vol", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment laboProfSeko_quartier_labo_bourg_en_vol = new Batiment("Labo du prof Seko", 2, 2, 1, 1, 0, 1,Orientation.face, 
            Endroits.quartier_labo_bourg_en_vol, TypeBatiment.labo);
    public static Salle bas_laboProfSeko_quartier_labo_bourg_en_vol = new Salle("rez de chausse labo prof Seko", 0, 0, 7, 10, 
            Endroits.laboProfSeko_quartier_labo_bourg_en_vol, 0);
    
    public static Ville route101 = new Ville("Route 101", 10, 11, 1, 3);
    public static Quartier debut_route101 = new Quartier("debut route101", 0, 0, 10, 10, Terrains.terrainNormal);
    
    public static Ville rosyeres = new Ville("Rosyeres", 10, 11, 1, 3);
    public static Quartier quartier_habitant_rosyeres = new Quartier("Quartier Habitant Rosyeres", 0, 0, 10, 10, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_rosyeres = new CentrePokemon("centre pokemon", 7, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_rosyeres);
    public static Magasin shop_rosyeres = new Magasin("shop", 2, 7, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_rosyeres);
    public static Maison maisonHabitant1_quartier_habitant_rosyeres = new Maison("maison Habitant1 Rosyeres", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_rosyeres, true);
    public static Maison maisonHabitant2_quartier_habitant_rosyeres = new Maison("maison Habitant2 Rosyeres", 7, 8, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_rosyeres, true);
    
    public static Ville route102 = new Ville("Route 102", 10, 11, 1, 3);
    public static Quartier debut_route102 = new Quartier("debut route 102", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route102 = new Quartier("fin route 102", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville clementi_ville = new Ville("Clementi-ville", 10, 11, 1, 3);
    public static Quartier quartier_arene_clementi_ville = new Quartier("Quartier Arene Clementi-ville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_clementi_ville = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_clementi_ville);
    public static ArenePkmn arene_norman_clementi_ville = new ArenePkmn("arène de Norman", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_clementi_ville);
    public static Salle bas_arene_norman_clementi_ville = new Salle("rez de chausse arène de Norman", 0, 0, 10, 7, 
            Endroits.arene_norman_clementi_ville, 0, Terrains.terrainNormal);
    public static Quartier quartierHabitant_clementi_ville = new Quartier("quartier boutique Clementi-ville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_clementi_ville = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierHabitant_clementi_ville);
    
    public static Ville route104 = new Ville("Route 104", 10, 11, 1, 3);
    public static Quartier debut_route104 = new Quartier("debut route 104", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route104_1 = new Quartier("milieu route 104 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route104_2 = new Quartier("milieu route 104 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route104 = new Quartier("fin route 104", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville bois_clementi = new Ville("Bois clementi", 10, 11, 1, 3);
    public static Quartier bois_clementi1 = new Quartier("Bois clementi 1", 0, 0, 11, 8, Terrains.terrainInsecte);
    public static Quartier bois_clementi2 = new Quartier("Bois clementi 2", 0, 0, 11, 8, Terrains.terrainInsecte);
    public static Quartier bois_clementi3 = new Quartier("Bois clementi 3", 0, 0, 11, 8, Terrains.terrainInsecte);
    public static Quartier bois_clementi4 = new Quartier("Bois clementi 4", 0, 0, 11, 8, Terrains.terrainInsecte);
    
    public static Ville merouville = new Ville("Merouville", 10, 11, 1, 3);
    public static Quartier quartier_arene_merouville = new Quartier("Quartier Arene Ebenelle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static ArenePkmn arene_roxanne_merouville = new ArenePkmn("arène de Roxanne", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_merouville);
    public static Salle bas_arene_roxanne_merouville = new Salle("rez de chausse arène de Roxanne", 0, 0, 10, 7, 
            Endroits.arene_roxanne_merouville, 0, Terrains.terrainRoche);
    public static Quartier quartierBoutique_merouville = new Quartier("quartier boutique Ebenelle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_merouville = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartierBoutique_merouville);
    public static Quartier quartierGare_merouville = new Quartier("quartier gare Merouville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Gare gare_merouville = new Gare("Gare de Merouville", 2, 2, 1, 1, 0, Orientation.face, Endroits.quartierGare_merouville);
    public static CentrePokemon centrepokemon_merouville = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierGare_merouville);
    
    public static Ville route116 = new Ville("Route 116", 10, 11, 1, 3);
    public static Quartier debut_route116 = new Quartier("debut route 116", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route116 = new Quartier("milieu route 116", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route116 = new Quartier("fin route 116", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route105 = new Ville("Route 105", 10, 11, 1, 3);
    public static Quartier debut_route105 = new Quartier("debut route 105", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route105 = new Quartier("milieu route 105", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route105 = new Quartier("fin route 105", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville village_myokara = new Ville("Village myokara", 10, 11, 1, 3);
    public static Quartier quartier_arene_village_myokara = new Quartier("Quartier Arene Ebenelle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_village_myokara = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_village_myokara);
    public static ArenePkmn arene_bastien_village_myokara = new ArenePkmn("arène de Sandra", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_village_myokara);
    public static Salle bas_arene_bastien_village_myokara = new Salle("rez de chausse arène de Sandra", 0, 0, 10, 7, 
            Endroits.arene_bastien_village_myokara, 0, Terrains.terrainCombat);
    public static CentrePokemon centrepokemon_village_myokara = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_village_myokara);
    
    public static Ville route106 = new Ville("Route 106", 10, 11, 1, 3);
    public static Quartier debut_route106 = new Quartier("debut route 106", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route106 = new Quartier("fin route 106", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route107 = new Ville("Route 107", 10, 11, 1, 3);
    public static Quartier debut_route107 = new Quartier("debut route 107", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route107 = new Quartier("fin route 107", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville route108 = new Ville("Route 108", 10, 11, 1, 3);
    public static Quartier debut_route108 = new Quartier("debut route 108", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route108 = new Quartier("fin route 108", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville route109 = new Ville("Route 109", 10, 11, 1, 3);
    public static Quartier debut_route109 = new Quartier("debut route 109", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route109 = new Quartier("fin route 109", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville poivressel = new Ville("Poivressel", 10, 11, 1, 3);
    public static Quartier quartier_centre_poivressel = new Quartier("Quartier Centre Poivressel", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_poivressel = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_centre_poivressel);
    public static Quartier quartier_shop_poivressel = new Quartier("Quartier Shop Poivressel", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_poivressel = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_shop_poivressel);
    public static Quartier quartier_marche_poivressel = new Quartier("Quartier Marche Poivressel", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_port_poivressel = new Quartier("Quartier Port Poivressel", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route110 = new Ville("Route 110", 10, 11, 1, 3);
    public static Quartier debut_route110 = new Quartier("debut route 110", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route110_1 = new Quartier("milieu route 110 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route110_2 = new Quartier("milieu route 110 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route110_3 = new Quartier("milieu route 110 3", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route110_4 = new Quartier("milieu route 110 4", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route110 = new Quartier("fin route 110", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route103 = new Ville("Route 103", 10, 11, 1, 3);
    public static Quartier debut_route103 = new Quartier("debut route 103", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route103 = new Quartier("debut route 103", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route103 = new Quartier("fin route 103", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville lavandia = new Ville("Lavandia", 10, 11, 1, 3);
    public static Quartier quartier_arene_lavandia = new Quartier("Quartier Arene Lavandia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_lavandia = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_lavandia);
    public static ArenePkmn arene_voltere_lavandia = new ArenePkmn("arène de Voltere", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_lavandia);
    public static Salle bas_arene_voltere_lavandia = new Salle("rez de chausse arène de Voltere", 0, 0, 10, 7, 
            Endroits.arene_voltere_lavandia, 0, Terrains.terrainElectrique);
    public static CentrePokemon centrepokemon_lavandia = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_lavandia);
    
    public static Ville route117 = new Ville("Route 117", 10, 11, 1, 3);
    public static Quartier debut_route117 = new Quartier("debut route 117", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route117 = new Quartier("fin route 117", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville vergazon = new Ville("Vergazon", 10, 11, 1, 3);
    /* En faire un quartier arene avec Timmy comme champion ? */
    public static Quartier quartier_vergazon = new Quartier("Quartier Vergazon", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route111 = new Ville("Route 111", 10, 11, 1, 3);
    public static Quartier debut_route111 = new Quartier("debut route 111", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route111_1 = new Quartier("milieu route 111 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route111_2 = new Quartier("milieu route 111 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route111_3 = new Quartier("milieu route 111 3", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route111_4 = new Quartier("milieu route 111 4", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route111_5 = new Quartier("milieu route 111 5", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route111_6 = new Quartier("milieu route 111 6", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route111 = new Quartier("fin route 111", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route112 = new Ville("Route 112", 10, 11, 1, 3);
    public static Quartier debut_route112 = new Quartier("debut route 112", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route112_1 = new Quartier("milieu route 112 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route112_2 = new Quartier("milieu route 112 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route112_3 = new Quartier("milieu route 112 3", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route112 = new Quartier("fin route 112", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route113 = new Ville("Route 113", 10, 11, 1, 3);
    public static Quartier debut_route113 = new Quartier("debut route 113", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route113_1 = new Quartier("milieu route 113 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route113_2 = new Quartier("milieu route 113 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route113 = new Quartier("fin route 113", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville autequia = new Ville("Autequia", 10, 11, 1, 3);
    public static Quartier quartier_autequia = new Quartier("Quartier Autequia", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route114 = new Ville("Route 114", 10, 11, 1, 3);
    public static Quartier debut_route114 = new Quartier("debut route 114", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route114 = new Quartier("milieu route 114", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route114 = new Quartier("fin route 114", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route115 = new Ville("Route 115", 10, 11, 1, 3);
    public static Quartier debut_route115 = new Quartier("debut route 115", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route115_1 = new Quartier("milieu route 115 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route115_2 = new Quartier("milieu route 115 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route115_3 = new Quartier("milieu route 115 3", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route115 = new Quartier("fin route 115", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville vermilava = new Ville("Vermilava", 10, 11, 1, 3);
    public static Quartier quartier_arene_vermilava = new Quartier("Quartier Arene Vermilava", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_vermilava = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_vermilava);
    public static ArenePkmn arene_adriane_vermilava = new ArenePkmn("arène de Adriane", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_vermilava);
    public static Salle bas_arene_adriane_vermilava = new Salle("rez de chausse arène de Adriane", 0, 0, 10, 7, 
            Endroits.arene_adriane_vermilava, 0, Terrains.terrainFeu);
    public static CentrePokemon centrepokemon_vermilava = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_vermilava);
    
    public static Ville route118 = new Ville("Route 118", 10, 11, 1, 3);
    public static Quartier debut_route118 = new Quartier("debut route 118", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route118_1 = new Quartier("milieu route 118 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route118_2 = new Quartier("milieu route 118 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route118 = new Quartier("fin route 118", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route119 = new Ville("Route 119", 10, 11, 1, 3);
    public static Quartier debut_route119 = new Quartier("debut route 119", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route119_1 = new Quartier("milieu route 119 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route119_2 = new Quartier("milieu route 119 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route119_3 = new Quartier("milieu route 119 3", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route119_4 = new Quartier("milieu route 119 4", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route119_5 = new Quartier("milieu route 119 5", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route119_6 = new Quartier("milieu route 119 6", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route119_7 = new Quartier("milieu route 119 7", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route119_8 = new Quartier("milieu route 119 8", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route119_9 = new Quartier("milieu route 119 9", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route119_10 = new Quartier("milieu route 119 10", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route119_11 = new Quartier("milieu route 119 11", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route119_12 = new Quartier("milieu route 119 12", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route119_13 = new Quartier("milieu route 119 13", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route119_14 = new Quartier("milieu route 119 14", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route119 = new Quartier("fin route 119", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville cimetronelle = new Ville("Cimetronelle", 10, 11, 1, 3);
    public static Quartier quartier_arene_cimetronelle = new Quartier("Quartier Arene Cimetronelle", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_cimetronelle = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_cimetronelle);
    public static ArenePkmn arene_alizee_cimetronelle = new ArenePkmn("arène de Alizee", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_cimetronelle);
    public static Salle bas_arene_alizee_cimetronelle = new Salle("rez de chausse arène de Alizee", 0, 0, 10, 7, 
            Endroits.arene_alizee_cimetronelle, 0, Terrains.terrainVol);
    public static CentrePokemon centrepokemon_cimetronelle = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_cimetronelle);
    public static Quartier quartier_boutique_cimetronelle = new Quartier("Quartier Arene Cimetronelle", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route120 = new Ville("Route 120", 10, 11, 1, 3);
    public static Quartier debut_route120 = new Quartier("debut route 120", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route120_1 = new Quartier("milieu route 120 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route120_2 = new Quartier("milieu route 120 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route120_3 = new Quartier("milieu route 120 3", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route120_4 = new Quartier("milieu route 120 4", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route120_5 = new Quartier("milieu route 120 5", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route120_6 = new Quartier("milieu route 120 6", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route120_7 = new Quartier("milieu route 120 7", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route120_8 = new Quartier("milieu route 120 8", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route120_9 = new Quartier("milieu route 120 9", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route120_10 = new Quartier("milieu route 120 10", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route120_11 = new Quartier("milieu route 120 11", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route120_12 = new Quartier("milieu route 120 12", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route120_13 = new Quartier("milieu route 120 13", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route120_14 = new Quartier("milieu route 120 14", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route120 = new Quartier("fin route 120", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route121 = new Ville("Route 121", 10, 11, 1, 3);
    public static Quartier debut_route121 = new Quartier("debut route 121", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route121 = new Quartier("milieu route 121", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route121 = new Quartier("fin route 121", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville nenucrique = new Ville("Nenucrique", 10, 11, 1, 3);
    public static Quartier quartier_nenucrique1 = new Quartier("Quartier Nenucrique 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_nenucrique2 = new Quartier("Quartier Nenucrique 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_nenucrique3 = new Quartier("Quartier Nenucrique 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_nenucrique4 = new Quartier("Quartier Nenucrique 4", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_nenucrique5 = new Quartier("Quartier Nenucrique 5", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_nenucrique6 = new Quartier("Quartier Nenucrique 6", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_nenucrique7 = new Quartier("Quartier Nenucrique 7", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_nenucrique8 = new Quartier("Quartier Nenucrique 8", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route122 = new Ville("Route 122", 10, 11, 1, 3);
    public static Quartier debut_route122 = new Quartier("debut route 122", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route122_1 = new Quartier("milieu route 122 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route122_2 = new Quartier("milieu route 122 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route122 = new Quartier("fin route 122", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville route123 = new Ville("Route 123", 10, 11, 1, 3);
    public static Quartier debut_route123 = new Quartier("debut route 123", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route123_1 = new Quartier("milieu route 123 1", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route123_2 = new Quartier("milieu route 123 2", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier milieu_route123_3 = new Quartier("milieu route 123 3", 0, 0, 10, 13, Terrains.terrainNormal);
    public static Quartier fin_route123 = new Quartier("fin route 123", 0, 0, 10, 13, Terrains.terrainNormal);
    
    public static Ville chemin_ardent = new Ville("chemin ardent", 10, 11, 1, 3);
    public static Quartier entree_chemin_ardent = new Quartier("entree chemin ardent", 0, 0, 11, 8, Terrains.terrainFeu);
    
    public static Ville route124 = new Ville("Route 124", 10, 11, 1, 3);
    public static Quartier debut_route124 = new Quartier("debut route 124", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route124_1 = new Quartier("milieu route 124 1", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route124_2 = new Quartier("milieu route 124 2", 0, 0, 10, 13, Terrains.terrainEau);
    public static Quartier milieu_route124_3 = new Quartier("milieu route 124 3", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route124_4 = new Quartier("milieu route 124 4", 0, 0, 10, 13, Terrains.terrainEau);
    public static Quartier milieu_route124_5 = new Quartier("milieu route 124 5", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route124_6 = new Quartier("milieu route 124 6", 0, 0, 10, 13, Terrains.terrainEau);
    public static Quartier fin_route124 = new Quartier("fin route 124", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville algatia = new Ville("Algatia", 10, 11, 1, 3);
    public static Quartier quartier_arene_algatia = new Quartier("Quartier Arene Algatia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_algatia = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_algatia);
    public static ArenePkmn arene_levy_tatia_algatia = new ArenePkmn("arène de Levy & Tatia", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_algatia);
    public static Salle bas_arene_levy_tatia_algatia = new Salle("rez de chausse arène de Levy & Tatia", 0, 0, 10, 7, 
            Endroits.arene_levy_tatia_algatia, 0, Terrains.terrainPsy);
    public static CentrePokemon centrepokemon_algatia = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_algatia);
    public static Quartier quartier_usine_algatia = new Quartier("Quartier Usine Algatia", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_algatia1 = new Quartier("Quartier Algatia 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_algatia2 = new Quartier("Quartier Algatia 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_algatia3 = new Quartier("Quartier Algatia 3", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_algatia4 = new Quartier("Quartier Algatia 4", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_algatia5 = new Quartier("Quartier Algatia 5", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_algatia6 = new Quartier("Quartier Algatia 6", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_algatia7 = new Quartier("Quartier Algatia 7", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route125 = new Ville("Route 125", 10, 11, 1, 3);
    public static Quartier debut_route125 = new Quartier("debut route 125", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route125 = new Quartier("milieu route 125", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route125 = new Quartier("fin route 125", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville route127 = new Ville("Route 127", 10, 11, 1, 3);
    public static Quartier debut_route127 = new Quartier("debut route 127", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route127_1 = new Quartier("milieu route 127 1", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route127_2 = new Quartier("milieu route 127 2", 0, 0, 10, 13, Terrains.terrainEau);
    public static Quartier milieu_route127_3 = new Quartier("milieu route 127 3", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route127_4 = new Quartier("milieu route 127 4", 0, 0, 10, 13, Terrains.terrainEau);
    public static Quartier milieu_route127_5 = new Quartier("milieu route 127 5", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route127_6 = new Quartier("milieu route 127 6", 0, 0, 10, 13, Terrains.terrainEau);
    public static Quartier fin_route127 = new Quartier("fin route 127", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville route128 = new Ville("Route 128", 10, 11, 1, 3);
    public static Quartier debut_route128 = new Quartier("debut route 128", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route128 = new Quartier("milieu route 128", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route128 = new Quartier("fin route 128", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville route126 = new Ville("Route 126", 10, 11, 1, 3);
    public static Quartier debut_route126 = new Quartier("debut route 126", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route126 = new Quartier("milieu route 126", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route126 = new Quartier("fin route 126", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville route129 = new Ville("Route 129", 10, 11, 1, 3);
    public static Quartier debut_route129 = new Quartier("debut route 129", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route129 = new Quartier("fin route 129", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville route130 = new Ville("Route 130", 10, 11, 1, 3);
    public static Quartier debut_route130 = new Quartier("debut route 130", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route130 = new Quartier("fin route 130", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville route131 = new Ville("Route 131", 10, 11, 1, 3);
    public static Quartier debut_route131 = new Quartier("debut route 131", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route131 = new Quartier("fin route 131", 0, 0, 10, 13, Terrains.terrainEau);
    
    public static Ville atalanopolis = new Ville("Atalanopolis", 10, 11, 1, 3);
    public static Quartier quartier_arene_atalanopolis = new Quartier("Quartier Arene Atalanopolis", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_atalanopolis = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_atalanopolis);
    public static ArenePkmn arene_juan_atalanopolis = new ArenePkmn("arène de Juan", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_atalanopolis);
    public static Salle bas_arene_juan_atalanopolis = new Salle("rez de chausse arène de Juan", 0, 0, 10, 7, 
            Endroits.arene_juan_atalanopolis, 0, Terrains.terrainEau);
    public static CentrePokemon centrepokemon_atalanopolis = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_atalanopolis);
    public static Quartier quartier_atalanopolis1 = new Quartier("Quartier Atalanopolis1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_atalanopolis2 = new Quartier("Quartier Atalanopolis2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_atalanopolis3 = new Quartier("Quartier Atalanopolis3", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville eternara = new Ville("Eternara", 10, 11, 1, 3);
    
    
    
    
    public static Pays Sinnoh = new Pays("Sinnoh", 5, 3, 102, 100);
    
    public static Ville bonaugure = new Ville("Bonaugure", 10, 11, 1, 3);
    public static Quartier quartier_habitant_bonaugure = new Quartier("Quartier Habitant Bonaugure", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Maison maisonRival1_quartier_habitant_bonaugure = new Maison("maison de Rival1", 4, 7, 1, 1, 1, Orientation.face, 
            Endroits.quartier_habitant_bonaugure, false);
    public static Salle bas_maisonRival1_quartier_habitant_bonaugure = new Salle("rez de chausse maison Rival1", 0, 0, 10, 7, 
            Endroits.maisonRival1_quartier_habitant_bonaugure, 0);
    public static Salle chambreRival1_maisonRival1_quartier_habitant_bonaugure = new Salle("chambre de Rival1", 0, 0, 10, 7, 
            Endroits.maisonRival1_quartier_habitant_bonaugure, 1);
    public static Maison maisonRival2_quartier_habitant_bonaugure = new Maison("maison de Rival2", 2, 7, 1, 1, 1, Orientation.face, 
            Endroits.quartier_habitant_bonaugure, false);
    public static Salle bas_maisonRival2_quartier_habitant_bonaugure = new Salle("rez de chausse maison Rival2", 0, 0, 10, 7, 
            Endroits.maisonRival2_quartier_habitant_bonaugure, 0);
    public static Salle chambreRival2_maisonRival2_quartier_habitant_bonaugure = new Salle("chambre de Rival2", 0, 0, 10, 7, 
            Endroits.maisonRival2_quartier_habitant_bonaugure, 0);
    public static Maison maisonRival3_quartier_habitant_bonaugure = new Maison("maison de Rival3", 2, 3, 1, 1, 1, Orientation.face, 
            Endroits.quartier_habitant_bonaugure, false);
    public static Salle bas_maisonRival3_quartier_habitant_bonaugure = new Salle("rez de chausse maison Rival3", 0, 0, 10, 7, 
            Endroits.maisonRival3_quartier_habitant_bonaugure, 0);
    public static Salle chambreRival3_maisonRival3_quartier_habitant_bonaugure = new Salle("chambre de Rival3", 0, 0, 10, 7, 
            Endroits.maisonRival3_quartier_habitant_bonaugure, 0);
    public static Maison maisonProfSorbier_quartier_habitant_bonaugure = new Maison("maison prof Sorbier", 4, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_bonaugure, true);
    
    public static Ville route201 = new Ville("Route 201", 10, 11, 1, 3);
    public static Quartier debut_route201 = new Quartier("debut route 201", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route201_1 = new Quartier("milieu route 201", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route201_2 = new Quartier("milieu route 201", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route201 = new Quartier("fin route 201", 0, 0, 12, 12, Terrains.terrainNormal);
    
    public static Ville lac_verite = new Ville("lac verite", 10, 11, 1, 3);
    public static Quartier lac_verite1 = new Quartier("lac verite 1", 0, 0, 12, 12, Terrains.terrainNormal);
    public static Quartier lac_verite2 = new Quartier("lac verite 2", 0, 0, 12, 12, Terrains.terrainNormal);
    public static Quartier lac_verite3 = new Quartier("lac verite 3", 0, 0, 12, 12, Terrains.terrainNormal);
    public static Quartier lac_verite4 = new Quartier("lac verite 4", 0, 0, 12, 12, Terrains.terrainNormal);
    
    public static Ville littorella = new Ville("Littorella", 10, 11, 1, 3);
    public static Quartier quartier_habitant_littorella = new Quartier("Quartier Habitant Bonaugure", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_littorella = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_habitant_littorella);
    public static CentrePokemon centrepokemon_littorella = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_habitant_littorella);
    public static Quartier quartier_labo_littorella = new Quartier("Quartier Labo Bonaugure", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Batiment laboProfSorbier_quartier_labo_littorella = new Batiment("Labo du prof Sorbier", 2, 7, 1, 1, 0, 1,Orientation.face, 
            Endroits.quartier_labo_littorella, TypeBatiment.labo);
    public static Salle bas_laboProfSorbier_quartier_labo_littorella = new Salle("rez de chausse labo prof Sorbier", 0, 0, 7, 10, 
            Endroits.laboProfSorbier_quartier_labo_littorella, 0);
    
    public static Ville route219 = new Ville("Route 219", 10, 11, 1, 3);
    public static Quartier debut_route219 = new Quartier("debut route 219", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route219 = new Quartier("fin route 219", 0, 0, 12, 12, Terrains.terrainEau);
    
    public static Ville route220 = new Ville("Route 220", 10, 11, 1, 3);
    public static Quartier debut_route220 = new Quartier("debut route 220", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier milieu_route220 = new Quartier("milieu route 220", 0, 0, 10, 12, Terrains.terrainEau);
    public static Quartier fin_route220 = new Quartier("fin route 220", 0, 0, 12, 12, Terrains.terrainEau);
    
    public static Ville route221 = new Ville("Route 221", 10, 11, 1, 3);
    public static Quartier debut_route221 = new Quartier("debut route 221", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier milieu_route221 = new Quartier("milieu route 221", 0, 0, 10, 12, Terrains.terrainNormal);
    public static Quartier fin_route221 = new Quartier("fin route 221", 0, 0, 12, 12, Terrains.terrainNormal);
    
    public static Ville route202 = new Ville("Route 202", 10, 11, 1, 3);
    public static Quartier debut_route202 = new Quartier("debut route 202", 0, 0, 18, 11, Terrains.terrainNormal);
    public static Quartier fin_route202 = new Quartier("fin route 202", 0, 0, 18, 11, Terrains.terrainNormal);
    
    public static Ville feli_cite = new Ville("Feli-cite", 10, 11, 1, 3);
    public static Quartier quartierGare_feli_cite = new Quartier("quartier gare Feli-cite", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Gare gare_feli_cite = new Gare("Gare de Feli-cite", 2, 2, 1, 1, 0, Orientation.face, Endroits.quartierGare_feli_cite);
    public static Quartier quartier_feli_cite1 = new Quartier("quartier Feli-cite 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_feli_cite2 = new Quartier("quartier Feli-cite 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_feli_cite3 = new Quartier("quartier Feli-cite 3", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route203 = new Ville("Route 203", 10, 11, 1, 3);
    public static Quartier debut_route203 = new Quartier("debut route 203", 0, 0, 15, 14, Terrains.terrainNormal);
    public static Quartier fin_route203 = new Quartier("fin route 203", 0, 0, 15, 14, Terrains.terrainNormal);
    
    public static Grotte entree_charbourg_route203 = new Grotte("entree Charbourg", 1, 8, 1, 1, 0, Orientation.face, Endroits.fin_route203);
    public static Salle entree_charbourg_rc_partie1 = new Salle("entree Charbourg rdc partie 1", 0, 0, 11, 8, Endroits.entree_charbourg_route203, 0, 
            Terrains.terrainRoche);
    public static Salle entree_charbourg_rc_partie2 = new Salle("entree Charbourg rdc partie 2", 0, 0, 11, 8, Endroits.entree_charbourg_route203, 0, 
            Terrains.terrainRoche);
    public static Salle entree_charbourg_ss_partie1 = new Salle("entree Charbourg ss partie 1", 0, 0, 11, 8, Endroits.entree_charbourg_route203, 0, 
            Terrains.terrainRoche);
    
    public static Ville charbourg = new Ville("Charbourg", 10, 11, 1, 3);
    public static Quartier quartierArene_charbourg = new Quartier("quartier arene Charbourg", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_charbourg = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartierArene_charbourg);
    public static ArenePkmn arene_pierrick_charbourg = new ArenePkmn("arène de Pierrick", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_charbourg);
    public static Salle bas_arene_pierrick_charbourg = new Salle("rez de chausse arène de Pierrick", 0, 0, 10, 7, 
            Endroits.arene_pierrick_charbourg, 0, Terrains.terrainRoche);
    public static Grotte entree_charbourg_charbourg = new Grotte("entree Charbourg", 1, 8, 1, 1, 0, Orientation.face, Endroits.quartierArene_charbourg);
    public static Quartier quartierCentre_charbourg = new Quartier("quartier arene Charbourg", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_charbourg = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierCentre_charbourg);
    public static Quartier quartierMine_charbourg = new Quartier("quartier mine Charbourg", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Grotte mine_charbourg = new Grotte("mine Charbourg", 1, 8, 1, 1, 0, Orientation.face, Endroits.quartierMine_charbourg);
    public static Salle mine_charbourg_rc = new Salle("mine Charbourg rdc", 0, 0, 11, 8, Endroits.mine_charbourg, 0, 
            Terrains.terrainRoche);
    public static Salle mine_charbourg_ss_partie1 = new Salle("mine Charbourg ss partie 1", 0, 0, 11, 8, Endroits.mine_charbourg, 0, 
            Terrains.terrainRoche);
    public static Salle mine_charbourg_ss_partie2 = new Salle("mine Charbourg ss partie 2", 0, 0, 11, 8, Endroits.mine_charbourg, 0, 
            Terrains.terrainRoche);
    
    public static Ville route204 = new Ville("Route 204", 10, 11, 1, 3);
    public static Quartier debut_route204 = new Quartier("debut route 204", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route204 = new Quartier("milieu route 204", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier fin_route204 = new Quartier("fin route 204", 0, 0, 18, 12, Terrains.terrainNormal);
    
    public static Grotte chemin_rocheux = new Grotte("chemin rocheux", 1, 8, 1, 1, 0, Orientation.face, Endroits.milieu_route204);
    public static Salle chemin_rocheux_partie1 = new Salle("chemin rocheux partie 1", 0, 0, 11, 8, Endroits.chemin_rocheux, 0, 
            Terrains.terrainRoche);
    public static Salle chemin_rocheux_partie2 = new Salle("chemin rocheux partie 2", 0, 0, 11, 8, Endroits.chemin_rocheux, 0, 
            Terrains.terrainRoche);
    public static Salle chemin_rocheux_partie3 = new Salle("chemin rocheux partie 3", 0, 0, 11, 8, Endroits.chemin_rocheux, 0, 
            Terrains.terrainRoche);
    public static Grotte chemin_rocheux_fin = new Grotte("chemin rocheux", 1, 8, 1, 1, 0, Orientation.face, Endroits.milieu_route204);
    
    public static Ville floraville = new Ville("Floraville", 10, 11, 1, 3);
    public static Quartier quartier_floraville = new Quartier("quartier Floraville", 0, 0, 17, 17, Terrains.terrainNormal);
    
    public static Ville route205 = new Ville("Route 205", 10, 11, 1, 3);
    public static Quartier debut_route205 = new Quartier("debut route 205", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route205_1 = new Quartier("milieu route 205 1", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route205_2 = new Quartier("milieu route 205 2", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route205_3 = new Quartier("milieu route 205 3", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route205_4 = new Quartier("milieu route 205 4", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route205_5 = new Quartier("milieu route 205 5", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier fin_route205 = new Quartier("fin route 205", 0, 0, 18, 12, Terrains.terrainNormal);
    
    public static Ville eolienne = new Ville("Les eolienne", 10, 11, 1, 3);
    public static Quartier quartier_eolienne = new Quartier("quartier Les eolienne", 0, 0, 17, 17, Terrains.terrainNormal);
    
    public static Ville foret_vestigon = new Ville("foret vestigon", 10, 11, 1, 3);
    public static Quartier foret_vestigon1 = new Quartier("foret vestigon 1", 0, 0, 16, 16, Terrains.terrainInsecte);
    public static Quartier foret_vestigon2 = new Quartier("foret vestigon 1", 0, 0, 12, 9, Terrains.terrainInsecte);
    public static Quartier foret_vestigon3 = new Quartier("foret vestigon 1", 0, 0, 12, 9, Terrains.terrainInsecte);
    public static Quartier foret_vestigon4 = new Quartier("foret vestigon 1", 0, 0, 12, 9, Terrains.terrainInsecte);
    public static Quartier foret_vestigon5 = new Quartier("foret vestigon 1", 0, 0, 12, 9, Terrains.terrainInsecte);
    public static Quartier foret_vestigon6 = new Quartier("foret vestigon 1", 0, 0, 17, 12, Terrains.terrainInsecte);
    public static Quartier foret_vestigon7 = new Quartier("foret vestigon 1", 0, 0, 17, 12, Terrains.terrainInsecte);
    
    public static Ville vestigon = new Ville("Vestigon", 10, 11, 1, 3);
    public static Quartier quartierArene_vestigon = new Quartier("quartier arene Vestigon", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_vestigon = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartierArene_vestigon);
    public static ArenePkmn arene_flo_vestigon = new ArenePkmn("arène de Flo", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartierArene_vestigon);
    public static Salle bas_arene_flo_vestigon = new Salle("rez de chausse arène de Flo", 0, 0, 10, 7, 
            Endroits.arene_flo_vestigon, 0, Terrains.terrainPlante);
    public static Quartier quartierTeamGalaxie_vestigon = new Quartier("quartier arene Vestigon", 0, 0, 11, 8, Terrains.terrainNormal);
    public static CentrePokemon centrepokemon_vestigon = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartierTeamGalaxie_vestigon);
    public static Quartier quartierStatue_vestigon = new Quartier("quartier mine Vestigon", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route206 = new Ville("Route 206", 10, 11, 1, 3);
    public static Quartier debut_route206 = new Quartier("debut route 206", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route206_1 = new Quartier("milieu route 206 1", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route206_2 = new Quartier("milieu route 206 2", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier fin_route206 = new Quartier("fin route 206", 0, 0, 18, 12, Terrains.terrainNormal);
    
    public static Ville route207 = new Ville("Route 207", 10, 11, 1, 3);
    public static Quartier debut_route207 = new Quartier("debut route 207", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route207_1 = new Quartier("milieu route 207 1", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route207_2 = new Quartier("milieu route 207 2", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier fin_route207 = new Quartier("fin route 207", 0, 0, 18, 12, Terrains.terrainNormal);
    
    public static Ville route208 = new Ville("Route 208", 10, 11, 1, 3);
    public static Quartier debut_route208 = new Quartier("debut route 208", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route208 = new Quartier("milieu route 208", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier fin_route208 = new Quartier("fin route 208", 0, 0, 18, 12, Terrains.terrainNormal);
    
    public static Ville unionpolis = new Ville("Unionpolis", 10, 11, 1, 3);
    public static Quartier quartier_arene_unionpolis = new Quartier("Quartier Arene Unionpolis", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_unionpolis = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_unionpolis);
    public static ArenePkmn arene_kimera_unionpolis = new ArenePkmn("arène de Kimera", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_unionpolis);
    public static Salle bas_arene_kimera_unionpolis = new Salle("rez de chausse arène de Kimera", 0, 0, 10, 7, 
            Endroits.arene_kimera_unionpolis, 0, Terrains.terrainSpectre);
    public static CentrePokemon centrepokemon_unionpolis = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_unionpolis);
    public static Quartier quartier_unionpolis1 = new Quartier("Quartier Unionpolis 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_unionpolis2 = new Quartier("Quartier Unionpolis 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_unionpolis3 = new Quartier("Quartier Unionpolis 3", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville square_paisible = new Ville("square paisible", 10, 11, 1, 3);
    public static Quartier square_paisible1 = new Quartier("square paisible 1", 0, 0, 16, 16, Terrains.terrainInsecte);
    public static Quartier square_paisible2 = new Quartier("square paisible 1", 0, 0, 12, 9, Terrains.terrainInsecte);
    public static Quartier square_paisible3 = new Quartier("square paisible 1", 0, 0, 12, 9, Terrains.terrainInsecte);
    public static Quartier square_paisible4 = new Quartier("square paisible 1", 0, 0, 12, 9, Terrains.terrainInsecte);
    
    public static Ville route209 = new Ville("Route 209", 10, 11, 1, 3);
    public static Quartier debut_route209 = new Quartier("debut route 209", 0, 0, 17, 17, Terrains.terrainNormal);
    public static Quartier milieu_route209 = new Quartier("milieu route 209", 0, 0, 17, 17, Terrains.terrainNormal);
    public static Quartier fin_route209 = new Quartier("fin route 209", 0, 0, 17, 17, Terrains.terrainNormal);
    
    public static Ville bonville = new Ville("Bonville", 10, 11, 1, 3);
    public static Quartier quartier_ruine_bonville = new Quartier("quartier ruine Bonville", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_bonville1 = new Quartier("quartier Bonville 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_bonville2 = new Quartier("quartier Bonville 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_bonville3 = new Quartier("quartier Bonville 3", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Grotte ruine_bonville = new Grotte("ruine Bonville", 1, 8, 1, 1, 0, Orientation.face, Endroits.quartier_ruine_bonville);
    
    public static Ville route210 = new Ville("Route 210", 10, 11, 1, 3);
    public static Quartier debut_route210 = new Quartier("debut route 210", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route210_1 = new Quartier("milieu route 210 1", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route210_2 = new Quartier("milieu route 210 2", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route210_3 = new Quartier("milieu route 210 3", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier fin_route210 = new Quartier("fin route 210", 0, 0, 18, 12, Terrains.terrainNormal);
    
    public static Ville route215= new Ville("Route 215", 10, 11, 1, 3);
    public static Quartier debut_route215 = new Quartier("debut route 215", 0, 0, 17, 17, Terrains.terrainNormal);
    public static Quartier milieu_route215 = new Quartier("milieu route 215", 0, 0, 17, 17, Terrains.terrainNormal);
    public static Quartier fin_route215 = new Quartier("fin route 215", 0, 0, 17, 17, Terrains.terrainNormal);
    
    public static Ville voilaroc = new Ville("Voilaroc", 10, 11, 1, 3);
    public static Quartier quartier_arene_voilaroc = new Quartier("Quartier Arene Voilaroc", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_voilaroc = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_voilaroc);
    public static ArenePkmn arene_melina_voilaroc = new ArenePkmn("arène de Melina", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_voilaroc);
    public static Salle bas_arene_melina_voilaroc = new Salle("rez de chausse arène de Melina", 0, 0, 10, 7, 
            Endroits.arene_melina_voilaroc, 0, Terrains.terrainCombat);
    public static CentrePokemon centrepokemon_voilaroc = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_voilaroc);
    public static Quartier quartier_voilaroc1 = new Quartier("Quartier Voilaroc 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_voilaroc2 = new Quartier("Quartier Voilaroc 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_voilaroc3 = new Quartier("Quartier Voilaroc 3", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route212 = new Ville("Route 212", 10, 11, 1, 3);
    public static Quartier debut_route212 = new Quartier("debut route 212", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route212_1 = new Quartier("milieu route 212 1", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route212_2 = new Quartier("milieu route 212 2", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route212_3 = new Quartier("milieu route 212 3", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route212_4 = new Quartier("milieu route 212 4", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier fin_route212 = new Quartier("fin route 212", 0, 0, 18, 12, Terrains.terrainNormal);
    
    public static Ville verchamps = new Ville("Verchamps", 10, 11, 1, 3);
    public static Quartier quartier_arene_verchamps = new Quartier("Quartier Arene Verchamps", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_verchamps = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_verchamps);
    public static ArenePkmn arene_lovis_verchamps = new ArenePkmn("arène de Lovis", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_verchamps);
    public static Salle bas_arene_lovis_verchamps = new Salle("rez de chausse arène de Lovis", 0, 0, 10, 7, 
            Endroits.arene_lovis_verchamps, 0, Terrains.terrainEau);
    public static CentrePokemon centrepokemon_verchamps = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_verchamps);
    public static Quartier quartier_boutique_verchamps = new Quartier("Quartier boutique Verchamps", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_habitant_verchamps = new Quartier("Quartier habitant Verchamps", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route213 = new Ville("Route 213", 10, 11, 1, 3);
    public static Quartier debut_route213 = new Quartier("debut route 213", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route213_1 = new Quartier("milieu route 213 1", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route213_2 = new Quartier("milieu route 213 2", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route213_3 = new Quartier("milieu route 213 3", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route213_4 = new Quartier("milieu route 213 4", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier milieu_route213_5 = new Quartier("milieu route 213 5", 0, 0, 18, 12, Terrains.terrainNormal);
    public static Quartier fin_route213 = new Quartier("fin route 213", 0, 0, 18, 12, Terrains.terrainNormal);
    
    public static Ville celestia = new Ville("Celestia", 10, 11, 1, 3);
    public static Quartier quartier_celestia = new Quartier("Quartier Celestia", 0, 0, 11, 8, Terrains.terrainNormal);
    
    
    public static Ville route218 = new Ville("Route 218", 10, 11, 1, 3);
    public static Quartier debut_route218 = new Quartier("debut route 218", 0, 0, 17, 17, Terrains.terrainNormal);
    public static Quartier fin_route218 = new Quartier("fin route 218", 0, 0, 17, 17, Terrains.terrainNormal);
    
    public static Ville joliberges = new Ville("Joliberges", 10, 11, 1, 3);
    public static Quartier quartier_arene_joliberges = new Quartier("Quartier Arene Joliberges", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_joliberges = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_joliberges);
    public static ArenePkmn arene_charles_joliberges = new ArenePkmn("arène de Charles", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_joliberges);
    public static Salle bas_arene_charles_joliberges = new Salle("rez de chausse arène de Charles", 0, 0, 10, 7, 
            Endroits.arene_charles_joliberges, 0, Terrains.terrainAcier);
    public static CentrePokemon centrepokemon_joliberges = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_joliberges);
    public static Quartier quartierPort_joliberges = new Quartier("quartier gare Joliberges", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville route216= new Ville("Route 216", 10, 11, 1, 3);
    public static Quartier debut_route216 = new Quartier("debut route 216", 0, 0, 17, 17, Terrains.terrainGlace);
    public static Quartier milieu_route216 = new Quartier("milieu route 216", 0, 0, 17, 17, Terrains.terrainGlace);
    public static Quartier fin_route216 = new Quartier("fin route 216", 0, 0, 17, 17, Terrains.terrainGlace);
    
    public static Ville route217 = new Ville("Route 217", 10, 11, 1, 3);
    public static Quartier debut_route217 = new Quartier("debut route 217", 0, 0, 18, 12, Terrains.terrainGlace);
    public static Quartier milieu_route217_1 = new Quartier("milieu route 217 1", 0, 0, 18, 12, Terrains.terrainGlace);
    public static Quartier milieu_route217_2 = new Quartier("milieu route 217 2", 0, 0, 18, 12, Terrains.terrainGlace);
    public static Quartier milieu_route217_3 = new Quartier("milieu route 217 3", 0, 0, 18, 12, Terrains.terrainGlace);
    public static Quartier fin_route217 = new Quartier("fin route 217", 0, 0, 18, 12, Terrains.terrainGlace);
    
    public static Ville frimapic = new Ville("Frimapic", 10, 11, 1, 3);
    public static Quartier quartier_arene_frimapic = new Quartier("Quartier Arene Frimapic", 0, 0, 11, 8, Terrains.terrainGlace);
    public static Magasin shop_frimapic = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_frimapic);
    public static ArenePkmn arene_gladys_frimapic = new ArenePkmn("arène de Gladys", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_frimapic);
    public static Salle bas_arene_gladys_frimapic = new Salle("rez de chausse arène de Gladys", 0, 0, 10, 7, 
            Endroits.arene_gladys_frimapic, 0, Terrains.terrainGlace);
    public static CentrePokemon centrepokemon_frimapic = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_frimapic);
    public static Quartier quartier_monument_frimapic = new Quartier("Quartier monument Frimapic", 0, 0, 11, 8, Terrains.terrainGlace);
    
    public static Ville route222= new Ville("Route 222", 10, 11, 1, 3);
    public static Quartier debut_route222 = new Quartier("debut route 222", 0, 0, 17, 17, Terrains.terrainNormal);
    public static Quartier milieu_route222 = new Quartier("milieu route 222", 0, 0, 17, 17, Terrains.terrainNormal);
    public static Quartier fin_route222 = new Quartier("fin route 222", 0, 0, 17, 17, Terrains.terrainNormal);
    
    public static Ville rivamar = new Ville("Rivamar", 10, 11, 1, 3);
    public static Quartier quartier_arene_rivamar = new Quartier("Quartier Arene Rivamar", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Magasin shop_rivamar = new Magasin("shop", 3, 7, 1, 1, 0, Orientation.face, Endroits.quartier_arene_rivamar);
    public static ArenePkmn arene_tanguy_rivamar = new ArenePkmn("arène de Tanguy", 3, 3, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_rivamar);
    public static Salle bas_arene_tanguy_rivamar = new Salle("rez de chausse arène de Tanguy", 0, 0, 10, 7, 
            Endroits.arene_tanguy_rivamar, 0, Terrains.terrainElectrique);
    public static CentrePokemon centrepokemon_rivamar = new CentrePokemon("centre pokemon", 3, 2, 1, 1, 0, Orientation.face, 
            Endroits.quartier_arene_rivamar);
    public static Quartier quartier_rivamar1 = new Quartier("Quartier Rivamar 1", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_rivamar2 = new Quartier("Quartier Rivamar 2", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Quartier quartier_rivamar3 = new Quartier("Quartier Rivamar 3", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Ville ile_de_fer = new Ville("Ile de fer", 10, 11, 1, 3);
    
    public static Ville forge_fuego = new Ville("forge fuego", 10, 11, 1, 3);
    public static Quartier exterieur_forge_fuego = new Quartier("extérieur forge fuego", 0, 0, 11, 8, Terrains.terrainNormal);
    
    public static Grotte mont_couronne_route207 = new Grotte("Mont couronne", 1, 8, 1, 1, 0, Orientation.face, Endroits.debut_route207);
    
    public static Grotte mont_couronne_route208 = new Grotte("Mont couronne", 1, 8, 1, 1, 0, Orientation.face, Endroits.debut_route208);
    
    public static Ville route211 = new Ville("Route 211", 10, 11, 1, 3);
    public static Quartier debut_route211 = new Quartier("debut route211", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte mont_couronne_debut_route211 = new Grotte("Mont couronne", 1, 8, 1, 1, 0, Orientation.face, Endroits.debut_route211);
    public static Quartier fin_route211 = new Quartier("fin route211", 0, 0, 11, 8, Terrains.terrainNormal);
    public static Grotte mont_couronne_fin_route211 = new Grotte("Mont couronne", 1, 8, 1, 1, 0, Orientation.face, Endroits.fin_route211);
    
    public static Ville route214 = new Ville("Route 214", 10, 11, 1, 3);
    
    public static Ville route223 = new Ville("Route 222", 10, 11, 1, 3);
                    
    
}

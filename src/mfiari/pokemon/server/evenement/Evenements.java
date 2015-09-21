/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.server.objet.Objets;
import mfiari.pokemon.server.perso.Habitants;
import mfiari.pokemon.server.ville.Endroits;
import mfiari.pokemon.server.ville.Terrains;

/**
 *
 * @author mike
 */
public class Evenements {

    public static EvenementQuete jeu = new EvenementQuete(true, null, null, null, "jeu");
    public static EvenementQuete chapitre1 = new EvenementQuete(true, null, null, null, "chapitre1");
    public static EvenementQuete depart = new EvenementQuete(false, new Position(Endroits.bourgPalette), null, null, "le depart");
    public static EvenementDialogue debut;
    public static EvenementDeplacement arrive_labo;
    public static EvenementDialogue premierPokemon_1;
    public static EvenementChoixPokemon premierPokemon_2;
    public static EvenementSpecialAutre premierPokemon_3;
    public static EvenementDialogue premierPokemon_4;
    public static EvenementSpecial premierPokemon_5;
    public static EvenementDialogue premierPokemon_7;
    public static EvenementDialogue leDepart_1;
    public static EvenementSpecial leDepart_2;
    public static EvenementDialogue leDepart_3;
    
    public static EvenementQuete premierBadge = new EvenementQuete(true, new Position(Endroits.argenta), null, null, "1er badge");
    public static EvenementDialogue rencontreAvecteamrocket_1;
    public static EvenementSpecial soinAvantCombatTeamRocket_1;
    public static EvenementCombat combatAvecTeamRocket_1;
    public static EvenementQueteAnnexe rencontreAvecRival1_1;
    public static EvenementDialogue rencontreAvecRival1_1_1;
    public static EvenementCombat combatAvecRival1_1;
    public static EvenementDialogue rencontreAvecRival1_1_2;
    public static EvenementDialogue rencontreAvecteamrocket_2;
    public static EvenementCombat combatAvecTeamRocket_2;
    public static EvenementDialogue premierBadgeObtenu;
    public static EvenementQuete deuxiemeBadge = new EvenementQuete(true, new Position(Endroits.argenta), null, null, "2eme badge");
    public static EvenementDialogue rencontreAvecRival2_1_1 = new EvenementDialogue(new Position(Endroits.argenta), null, null, "2eme badge");
    public static EvenementCombat combatAvecRival2_1;
    public static EvenementDialogue rencontreAvecRival2_1_2 = new EvenementDialogue(new Position(Endroits.argenta), null, null, "2eme badge");
    
    
    public static EvenementQueteAnnexe pokemotos;
    public static EvenementDialogue dialogueProfOrme;
    public static EvenementSpecial pokematosProfOrme;
    public static EvenementDialogue dialogueExplicationPokematosProfOrme;
    
    public static EvenementQueteAnnexe cannePecheur = new EvenementQueteAnnexe(true, 
            new Position(Endroits.maisonPecheur_quartierHabitant_carmin_sur_mer.getSalle(0, 0)), Habitants.pecheurCarminSurMer, null, "canne");
    public static EvenementDialogue dialogue_pecheur = new EvenementDialogue(
            new Position(Endroits.maisonPecheur_quartierHabitant_carmin_sur_mer.getSalle(0, 0)), null, null, "canne_1");
    public static EvenementSpecial cannePecheur2 = new EvenementSpecial(
            new Position(Endroits.maisonPecheur_quartierHabitant_carmin_sur_mer.getSalle(0, 0)), null, null, "canne_2");
    
    public static EvenementQueteAnnexe annexe_choix_team_rocket_aquaria = new EvenementQueteAnnexe(true, new Position(Endroits.port_carmin_sur_mer), null, null, "team rocket aquaria");
    public static EvenementChoix choix_team_rocket_aquaria = new EvenementChoix(new Position(Endroits.port_carmin_sur_mer), 
            null, null, "choix team rocket aquaria");
    public static EvenementQueteAnnexe team_rocket_aquaria = new EvenementQueteAnnexe(true, new Position(Endroits.port_carmin_sur_mer), null, null, "team rocket aquaria");
    public static EvenementDeplacement entree_aquaria = new EvenementDeplacement(Endroits.port_carmin_sur_mer, null, null, "entree aquaria", 
                 new Position(3, 5, 0, Endroits.salle1_aquaria, Orientation.dos), true);
    public static EvenementDialogue dialogue_team_rocket_aquaria = new EvenementDialogue(new Position(Endroits.cabine_capitaine_aquaria), null, null, "dialogue aquaria");
    public static EvenementCombat combat_team_rocket_aquaria = new EvenementCombat(new Position(Endroits.cabine_capitaine_aquaria), null, null, "combat aquaria", Terrains.terrainNormal);
    
    public static EvenementQueteAnnexe team_rocket_sylph_sarl = new EvenementQueteAnnexe(true, new Position(Endroits.hotel_grotte_artikodin), null, Objets.orbe_glace, "combat avec Artikodin");
    
    public static EvenementQueteAnnexe team_rocket_repaire_celadopole = new EvenementQueteAnnexe(true, new Position(Endroits.hotel_grotte_artikodin), null, Objets.orbe_glace, "combat avec Artikodin");
    
    public static EvenementQueteAnnexe team_rocket_tour_radio = new EvenementQueteAnnexe(true, new Position(Endroits.hotel_grotte_artikodin), null, Objets.orbe_glace, "combat avec Artikodin");
    
    public static EvenementQueteAnnexe team_rocket_lac_colere = new EvenementQueteAnnexe(true, new Position(Endroits.hotel_grotte_artikodin), null, Objets.orbe_glace, "combat avec Artikodin");
    
    public static EvenementQueteAnnexe team_rocket_repaire_acajou = new EvenementQueteAnnexe(true, new Position(Endroits.hotel_grotte_artikodin), null, Objets.orbe_glace, "combat avec Artikodin");
    
    public static EvenementQueteAnnexe team_rocket_ile_mewtwo = new EvenementQueteAnnexe(true, new Position(Endroits.entree_ile_de_mewtwo), null, Objets.orbe_glace, "combat avec Artikodin");
    
    public static EvenementQueteAnnexe combat_avec_ptera = new EvenementQueteAnnexe(true, new Position(Endroits.canyon_p3), Habitants.ptera_canyon, null, "combat avec ptera");
    public static EvenementCombat combatAvecPtera = new EvenementCombat(new Position(Endroits.canyon_p3), null, null, "combat avec ptera", Terrains.terrainRoche);
    
    public static EvenementQueteAnnexe ligue_pokemon_kanto_participation = new EvenementQueteAnnexe(true, new Position(Endroits.quartierBoutique_ligue_pokemon_kanto), null, null, "ligue pokemon kanto participation");
    public static EvenementChoix ligue_pokemon_kanto_choixParticipation = new EvenementChoix(new Position(Endroits.centrepokemon_ligue_pokemon_kanto.getSalle(0, 0)), 
            null, null, "choix participation ligue pokemon kanto");
    public static EvenementQueteAnnexe ligue_pokemon_kanto = new EvenementQueteAnnexe(true, null, null, null, "ligue pokemon kanto");
    public static EvenementDialogue ligue_pokemon_kanto_dialogueDebut = new EvenementDialogue(new Position(Endroits.centrepokemon_ligue_pokemon_kanto.getSalle(0, 0)), null, 
            null, "ligue pokemon kanto_1");
    public static EvenementSpecial ligue_pokemon_kanto_modificationTailleEquipe = new EvenementSpecial(new Position(Endroits.centrepokemon_ligue_pokemon_kanto.getSalle(0, 0)), 
            null, null, "ligue pokemon kanto_2");
    public static EvenementChoix ligue_pokemon_kanto_choixPokemon = new EvenementChoix(new Position(Endroits.centrepokemon_ligue_pokemon_kanto.getSalle(0, 0)), 
            null, null, 6, "ligue pokemon kanto_3");
    
    public static EvenementQueteAnnexe combat_avec_artikodin = new EvenementQueteAnnexe(true, new Position(Endroits.hotel_grotte_artikodin), null, Objets.orbe_glace, "combat avec Artikodin");
    public static EvenementDialogue dialogue_avant_combat_artikodin = new EvenementDialogue(new Position(Endroits.hotel_grotte_artikodin), null, 
            Objets.orbe_glace, "dialogue avant combat Artikodin");
    public static EvenementCombat combatAvecArtikodin = new EvenementCombat(new Position(Endroits.hotel_grotte_artikodin), null, Objets.orbe_glace, "combat avec Artikodin", Terrains.terrainGlace);
    
    public static EvenementQueteAnnexe combat_avec_elekthor = new EvenementQueteAnnexe(true, new Position(Endroits.hotel_grotte_elekthor), null, Objets.orbe_foudre, "combat avec Elekthor");
    public static EvenementDialogue dialogue_avant_combat_elekthor = new EvenementDialogue(new Position(Endroits.hotel_grotte_elekthor), null, Objets.orbe_foudre, "dialogue avant combat Elekthor");
    public static EvenementCombat combatAvecElekthor = new EvenementCombat(new Position(Endroits.hotel_grotte_elekthor), null, Objets.orbe_foudre, "combat avec Elekthor", Terrains.terrainElectrique);
    
    public static EvenementQueteAnnexe combat_avec_sulfura = new EvenementQueteAnnexe(true, new Position(Endroits.hotel_grotte_sulfura), null, Objets.orbe_feu, "combat avec Sulfura");
    public static EvenementDialogue dialogue_avant_combat_sulfura = new EvenementDialogue(new Position(Endroits.hotel_grotte_sulfura), null, Objets.orbe_feu, "dialogue avant combat Sulfura");
    public static EvenementCombat combatAvecSulfura = new EvenementCombat(new Position(Endroits.hotel_grotte_sulfura), null, Objets.orbe_feu, "combat avec Sulfura", Terrains.terrainFeu);
    
    public static EvenementQueteAnnexe invitation_tournoi_mewtwo = new EvenementQueteAnnexe(true, new Position(Endroits.entree_ligue_pokemon_kanto), null, Objets.badge_ligue_kanto, "invitation tournoi mewtwo");
    public static EvenementDialogue lettre_invitation_tournoi_mewtwo = new EvenementDialogue(new Position(Endroits.entree_ligue_pokemon_kanto), null, Objets.badge_ligue_kanto, "dialogue invitation tournoi mewtwo");
    public static EvenementChoix choixParticipation_tournoi_mewtwo = new EvenementChoix(new Position(Endroits.entree_ligue_pokemon_kanto), null, Objets.badge_ligue_kanto, "choix participation tournoi mewtwo");
    
    public static EvenementQueteAnnexe tournoi_mewtwo = new EvenementQueteAnnexe(true, new Position(Endroits.entree_ile_de_mewtwo), null, null, "tournoi mewtwo");
    public static EvenementDeplacement arrive_tournoi_mewtwo = new EvenementDeplacement(Endroits.entree_ile_de_mewtwo, null, null, "arrive tournoi mewtwo", null, true);
    public static EvenementDialogue presentation_tournoi_mewtwo = new EvenementDialogue(new Position(Endroits.entree_ile_de_mewtwo), null, null, "presentation tournoi mewtwo");
    public static EvenementCombat combat1_tournoi_mewtwo = new EvenementCombat(new Position(Endroits.entree_ile_de_mewtwo), null, null, "combat 1 tournoi mewtwo", Terrains.terrainNormal);
    public static EvenementCombat combat2_tournoi_mewtwo = new EvenementCombat(new Position(Endroits.entree_ile_de_mewtwo), null, null, "combat 2 tournoi mewtwo", Terrains.terrainNormal);
    public static EvenementCombat combat3_tournoi_mewtwo = new EvenementCombat(new Position(Endroits.entree_ile_de_mewtwo), null, null, "combat 3 tournoi mewtwo", Terrains.terrainNormal);
    public static EvenementDialogue dialogueAvecMewtwo_tournoi_mewtwo = new EvenementDialogue(new Position(Endroits.entree_ile_de_mewtwo), null, null, "dialogue avec mewtwo");
    public static EvenementCombat combatContreMewtwo_tournoi_mewtwo = new EvenementCombat(new Position(Endroits.entree_ile_de_mewtwo), null, null, "combat contre mewtwo", Terrains.terrainNormal);
    
    public static EvenementQueteAnnexe fin_tournoi_mewtwo = new EvenementQueteAnnexe(true, new Position(Endroits.entree_ile_de_mewtwo), null, null, "fin tournoi mewtwo");
    public static EvenementChoix choixPartir_tournoi_mewtwo = new EvenementChoix(new Position(Endroits.entree_ile_de_mewtwo), Habitants.mewtwo_tournoi_mewtwo, null, "choix partir tournoi mewtwo");
    public static EvenementDeplacement retour_tournoi_mewtwo = new EvenementDeplacement(Endroits.entree_ile_de_mewtwo, null, null, "retour tournoi mewtwo", null, true);
    
    public static EvenementQueteAnnexe combat_avec_mew = new EvenementQueteAnnexe(true, new Position(Endroits.entree_ile_de_mewtwo), Habitants.mew_tournoi_mewtwo, null, "combat avec mew");
    public static EvenementCombat combatAvecMew = new EvenementCombat(new Position(Endroits.entree_ile_de_mewtwo), Habitants.mew_tournoi_mewtwo, null, "combat avec mew", Terrains.terrainNormal);
    
    public static EvenementQueteAnnexe combat_avec_mewtwo = new EvenementQueteAnnexe(true, new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo");
    public static EvenementCombat combatAvecMewtwo = new EvenementCombat(new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo", Terrains.terrainNormal);
    
    public static EvenementQueteAnnexe rencontre_entei = new EvenementQueteAnnexe(true, new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "invitation tournoi mewtwo");
    public static EvenementDialogue discussion_avec_professeur = new EvenementDialogue(new Position(Endroits.centrepokemon_ligue_pokemon_kanto.getSalle(0, 0)), null, 
            null, "ligue pokemon kanto_1");
    public static EvenementDeplacement arrive_chateau_entei = new EvenementDeplacement(Endroits.bas_laboProfChen_quartierLabo_bourgPalette, null, null, "arrive_labo", null, true);
    public static EvenementCombat combat1_entei = new EvenementCombat(new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo", Terrains.terrainNormal);
    public static EvenementCombat combat2_entei = new EvenementCombat(new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo", Terrains.terrainNormal);
    public static EvenementCombat combatContreEntei = new EvenementCombat(new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo", Terrains.terrainNormal);
    
    public static EvenementQueteAnnexe combat_avec_suicune = new EvenementQueteAnnexe(true, new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo");
    public static EvenementCombat combatAvecSuicune = new EvenementCombat(new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo", Terrains.terrainNormal);
    
    public static EvenementQueteAnnexe recuperation_plume_lugia = new EvenementQueteAnnexe(true, new Position(Endroits.ile_monument_shamouti), null, null, "recuperation plume lugia");
    public static EvenementDialogue dialogue_recuperation_plume_lugia = new EvenementDialogue(new Position(Endroits.ile_monument_shamouti), null, null, "dialogue recuperation plume lugia");
    public static EvenementSpecial recoit_plume_recuperation_plume_lugia = new EvenementSpecial(new Position(Endroits.ile_monument_shamouti), null, null, "recoit recuperation plume lugia");
    
    public static EvenementQueteAnnexe combat_avec_lugia = new EvenementQueteAnnexe(true, new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo");
    public static EvenementCombat combatAvecLugia = new EvenementCombat(new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo", Terrains.terrainNormal);
    
    public static EvenementQueteAnnexe recuperation_plume_ho_oh = new EvenementQueteAnnexe(true, new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "invitation tournoi mewtwo");
    public static EvenementDialogue dialogue_recuperation_plume_ho_oh = new EvenementDialogue(new Position(Endroits.centrepokemon_ligue_pokemon_kanto.getSalle(0, 0)), null, 
            null, "ligue pokemon kanto_1");
    public static EvenementSpecial recoit_plume_recuperation_plume_ho_oh = new EvenementSpecial(new Position(Endroits.centrepokemon_ligue_pokemon_kanto.getSalle(0, 0)), 
            null, null, "ligue pokemon kanto_2");
    
    public static EvenementQueteAnnexe combat_avec_ho_oh = new EvenementQueteAnnexe(true, new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo");
    public static EvenementCombat combatAvecho_oh = new EvenementCombat(new Position(Endroits.caverne_azuree_ss1), Habitants.mewtwo_caverne_azuree, Objets.mewtwo_ball, "combat avec mewtwo", Terrains.terrainNormal);
    
    public static EvenementQueteAnnexe rencontre_celebi = new EvenementQueteAnnexe(true, new Position(Endroits.bois_aux_chene2), null, Objets.gsball, "rencontre celebi");
    public static EvenementDialogue dialogue_celebi = new EvenementDialogue(new Position(Endroits.bois_aux_chene2), null, Objets.gsball, "dialogue celebi");
    public static EvenementCombat combatContreCelebi = new EvenementCombat(new Position(Endroits.bois_aux_chene2),  null, Objets.gsball, "combat avec celebi", Terrains.terrainInsecte);
    
    public static EvenementQueteAnnexe rencontre_latios_latias = new EvenementQueteAnnexe(true, new Position(Endroits.bois_aux_chene2), null, Objets.gsball, "rencontre latos latias");
    public static EvenementCombat combat_latios = new EvenementCombat(new Position(Endroits.bois_aux_chene2),  null, Objets.gsball, "combat avec latios", Terrains.terrainNormal);
    public static EvenementCombat combat_latias = new EvenementCombat(new Position(Endroits.bois_aux_chene2),  null, Objets.gsball, "combat avec latias", Terrains.terrainNormal);
}

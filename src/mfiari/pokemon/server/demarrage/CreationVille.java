/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.demarrage;

import mfiari.pokemon.core.objet.Objet_medicament;
import mfiari.pokemon.core.objet.Type_objet;
import mfiari.pokemon.core.objet.Objet_endroit_pc;
import mfiari.lib.game.liste.ListeDEndroit;
import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.objet.ObjetEndroitCoffre;
import mfiari.lib.game.objet.ObjetEndroitObservable;
import mfiari.lib.game.objet.ObjetEndroitPassage;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.perso.Dresseurs;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.objet.Objet_endroit_soin;
import mfiari.pokemon.server.ville.Endroits;
import mfiari.pokemon.core.ville.Environnement;
import mfiari.pokemon.core.ville.Sol;
import mfiari.pokemon.server.objet.Objets;

/**
 *
 * @author mike
 */
public class CreationVille {

    private final ListeDEndroit carte_pokemon;

    public CreationVille() {
        this.carte_pokemon = new ListeDEndroit();
        this.modificationSalle();
        this.modificationSalleGrotte();
        this.modificationBatiment();
        this.modificationQuartier();
        this.modificationQuartierRoute();
        this.modificationQuartierForet();
        this.modificationVille();
        this.modificationSousZone();
        this.modificationZone();
        this.modificationPays();
        this.carte_pokemon.ajouterEndroitAndChild(Endroits.Kanto);
        this.carte_pokemon.ajouterEndroitAndChild(Endroits.Jhoto);
    }

    private void modificationSalle() {
		/* Kanto */
        /* Bourg palette */
        /* Quartier Dresseur */
        /* Bas maison Rival1 */
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 5, Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette)));
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival1_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin bas maison Rival1 */
        /* chambre Rival1 */
        Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 5, Endroits.bas_maisonRival1_quartierDresseur_bourgPalette)));
        Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new Objet_endroit_soin(Type_objet.lit, 3, 9,
                "voulez vous vous reposez?"));
        Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new Objet_endroit_pc(Type_objet.table_pc, 0, 0));
        Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 2));
        Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 1, 0));
        Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin chambre Rival1 */
        /* Bas maison Rival2 */
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 1, Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette)));
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival2_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin bas maison Rival2 */
        /* chambre Rival2 */
        Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 3, Endroits.bas_maisonRival2_quartierDresseur_bourgPalette)));
        Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 1));
        Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table_pc, 0, 0));
        Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 1, 0));
        Endroits.chambreRival2_maisonRival2_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin chambre Rival2 */
        /* Bas maison Rival3 */
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 1, Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette)));
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival3_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin bas maison Rival3 */
        /* chambre Rival3 */
        Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 3, Endroits.bas_maisonRival3_quartierDresseur_bourgPalette)));
        Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 1));
        Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table_pc, 0, 0));
        Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 1, 0));
        Endroits.chambreRival3_maisonRival3_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin chambre Rival3 */
        /* Bas maison Sacha */
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 5, Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette)));
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonSacha_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin bas maison Sacha */
        /* chambre Sacha */
        Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 5, Endroits.bas_maisonSacha_quartierDresseur_bourgPalette)));
        Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new Objet_endroit_pc(Type_objet.table_pc, 0, 0));
        Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 2));
        Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 1, 0));
        Endroits.chambreSacha_maisonSacha_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin chambre Sacha */
        /* Bas maison Regis */
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 5, Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette)));
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRegis_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin bas maison Regis */
        /* chambre Regis */
        Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 5, Endroits.bas_maisonRegis_quartierDresseur_bourgPalette)));
        Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new Objet_endroit_pc(Type_objet.table_pc, 0, 0));
        Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 2));
        Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 1, 0));
        Endroits.chambreRegis_maisonRegis_quartierDresseur_bourgPalette.setSol(Sol.bois);
        /* Fin chambre Regis */
        /* Fin Quartier Dresseur */
        /* Quartier Habitant */
        /* Centre pokemon */
        /* Fin centre pokemon */
        /* maison habitant 1 */
        /* Fin maison habitant 1 */
        /* maison prof chen */
        /* Fin maison prof chen */
        /* shop */
        /* Fin shop */
        /* tournoi */
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur1_niveauGamin_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur2_niveauGamin_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur3_niveauGamin_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur4_niveauGamin_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur1_niveauDresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur2_niveauDresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur3_niveauDresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur4_niveauDresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur5_niveauDresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur6_niveauDresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur7_niveauDresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur1_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur2_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur3_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur4_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur5_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur6_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur7_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur8_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur9_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur10_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur11_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur12_niveauTopdresseur_tournoiBougPalette);
		Endroits.salleTournoiPokemonNormal_bourgPalette.ajouterParticipant(Dresseurs.dresseur13_niveauTopdresseur_tournoiBougPalette);
        /* Fin tournoi */
        /* Fin Quartier Habitant */
        /* Quartier Labo */
        /* Labo prof chen */
        Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.machine1, 0, 0));
        Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.machine2, 0, 1));
        Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table_pc, 0, 2));
        Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.grande_etagere, 0, 8));
        Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.grande_etagere, 0, 9));
        Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new Objet_endroit_soin(Type_objet.machine_soin, 2, 2,
                "voulez vous soignez vos pokemon ?"));
        Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table_pokemon, 2, 8));
        for (int j = 0 ; j < 4 ; j++) {
            Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.grande_etagere, 4, j));
        }
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.grande_etagere, 4, j));
        }
		Endroits.bas_laboProfChen_quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(7, 5, 0, Endroits.quartierParcLaboProfChen_bourgPalette, Orientation.dos)));
        Endroits.bas_laboProfChen_quartierLabo_bourgPalette.setSol(Sol.carrelage);
        /* Fin labo prof chen */
        /* Fin Quartier Labo */
        /* Fin Bour Palette */
        
        /* Jadielle */
        /* Centre Pokemon */
        /* Fin centre pokemon */
        /* Shop */
        /* Fin Shop */
        /* Maison habitant */
        /* Fin maison habitant */
        /* Maison habitant 2 */
        /* Fin Maison habitant 2 */
        /* Arene Jadielle */
        
        Endroits.salle1_arene_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle2_arene_jadielle, Orientation.dos)));
        
        Endroits.salle2_arene_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.salle1_arene_jadielle, Orientation.face)));
        Endroits.salle2_arene_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_jadielle, Orientation.dos)));
        
        Endroits.salle_champion_arene_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.salle2_arene_jadielle, Orientation.face)));
        /* Fin Arene Jadielle */
        /* Fin Jadielle */
		
        /* Argenta */
        /* Arene Argenta */
        Endroits.bas_arene_argenta.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_argenta, Orientation.dos)));
        
        Endroits.salle_champion_arene_argenta.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_argenta, Orientation.face)));
        /* Fin Arene Argenta */
        /* Fin Argenta */
		
        /* Azuria */
		Endroits.bas_arene_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_azuria, Orientation.dos)));
		for (int i = 1 ; i < 6 ; i++) {
			Endroits.bas_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 5));
		}
		Endroits.bas_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 2, 6));
		Endroits.bas_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 3, 4));
		Endroits.bas_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 4, 6));
		Endroits.bas_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 5, 4));
		for (int i = 0 ; i < 7 ; i++) {
            for (int j = 0 ; j < 5; j++) {
                Endroits.bas_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
		for (int i = 0 ; i < 7 ; i++) {
            for (int j = 6 ; j < 10; j++) {
                Endroits.bas_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
				
		
		for (int i = 0 ; i < 7 ; i++) {
            for (int j = 0 ; j < 3; j++) {
                Endroits.salle_champion_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
		for (int i = 0 ; i < 7 ; i++) {
            for (int j = 8 ; j < 10; j++) {
                Endroits.salle_champion_arene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }		
		Endroits.salle_champion_arene_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_azuria, Orientation.face)));
        /* Fin Azuria */
		/* Route 24 */
		Endroits.arene_areneAlbert.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 8,
                new Position(6, 5, 0, Endroits.salle_entrainement_areneAlbert, Orientation.dos)));
		Endroits.salle_entrainement_areneAlbert.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 8, 0, Endroits.arene_areneAlbert, Orientation.face)));
		/* Fin Route 24 */
		/* Route 25 */
		/*ecole pokemon */
		/*entree */
		Endroits.entree_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.cour_ecolePokemon, Orientation.dos)));
		Endroits.entree_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.salle_machine_ecolePokemon, Orientation.droite)));
		Endroits.entree_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.salle_classe_ecolePokemon, Orientation.gauche)));
		Endroits.entree_ecolePokemon.setSol(Sol.bois);
		/* fin entree */
		/*cour */
		Endroits.cour_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.entree_ecolePokemon, Orientation.face)));
		Endroits.cour_ecolePokemon.setSol(Sol.bitume);
		/* fin cour */
		/* salle machine */
		Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.entree_ecolePokemon, Orientation.gauche)));
        Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 1, 2));
        Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 1, 4));
        Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 1, 6));
        Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 1, 8));
        Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 4, 2));
        Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 4, 4));
        Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 4, 6));
        Endroits.salle_machine_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 4, 8));
		Endroits.salle_machine_ecolePokemon.setSol(Sol.bois);
		/* fin salle machine*/
		/* Salle de classe */
        //Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitVideo(Type_objet.tele, 0, 5, Videos.getVideos("pokerap_kanto")));
        Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 0));
        Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 2, 4));
        Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 2, 6));
        Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 4, 4));
        Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 4, 6));
		Endroits.salle_classe_ecolePokemon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.entree_ecolePokemon, Orientation.droite)));
        Endroits.salle_classe_ecolePokemon.setSol(Sol.bois);
		/* Fin salle de classe */
		/* fin ecole pokemon */
		/* phare de leo */
        Endroits.bas_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 0, new Position(0, 0, Endroits.salleKanto_maisonLeo)));
				
        Endroits.salleKanto_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 0, 0, new Position(0, 0, Endroits.bas_maisonLeo)));
		Endroits.salleKanto_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 9, new Position(0, 9, Endroits.salleJohto_maisonLeo)));
				
        Endroits.salleJohto_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 0, 9, new Position(0, 9, Endroits.salleKanto_maisonLeo)));
		Endroits.salleJohto_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 0, new Position(0, 0, Endroits.salleHoenn_maisonLeo)));
				
        Endroits.salleHoenn_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 0, 0, new Position(0, 0, Endroits.salleJohto_maisonLeo)));
		Endroits.salleHoenn_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 9, new Position(0, 9, Endroits.salleSinnoh_maisonLeo)));
				
        Endroits.salleSinnoh_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 0, 9, new Position(0, 9, Endroits.salleHoenn_maisonLeo)));
		Endroits.salleSinnoh_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 0, new Position(0, 0, Endroits.salleTravail_maisonLeo)));
				
        Endroits.salleTravail_maisonLeo.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 0, 0, new Position(0, 0, Endroits.salleSinnoh_maisonLeo)));
		/* fin phare de leo */
		/* Fin Route 25 */
		
		/* Safrania */
        /* Arene pokemon morgane */
        Endroits.bas_arene_morgane_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_morgane_safrania, Orientation.dos)));
        Endroits.bas_arene_morgane_safrania.setSol(Sol.carrelage);
        
        Endroits.salle_champion_arene_morgane_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_morgane_safrania, Orientation.face)));
        Endroits.salle_champion_arene_morgane_safrania.setSol(Sol.carrelage);
        /* Fin Arene pokemon morgane */
        /* Arene pokemon karateka */
        Endroits.bas_arene_combat_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_combat_safrania, Orientation.dos)));
        Endroits.bas_arene_combat_safrania.setSol(Sol.carrelage);
        
        Endroits.salle_champion_arene_combat_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_combat_safrania, Orientation.face)));
        Endroits.salle_champion_arene_combat_safrania.setSol(Sol.carrelage);
        /* Fin Arene pokemon karateka */
		/* Fin Safrania */
		
		/* carmin sur mer */
        /* Arene pokemon */
        Endroits.bas_arene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_carmin_sur_mer, Orientation.dos)));
        Endroits.bas_arene_carmin_sur_mer.setSol(Sol.carrelage);
        
        Endroits.salle_champion_arene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_carmin_sur_mer, Orientation.face)));
        Endroits.salle_champion_arene_carmin_sur_mer.setSol(Sol.carrelage);
        /* Fin Arene pokemon */
		Endroits.salle1_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.salle2_aquaria, Orientation.droite)));
		Endroits.salle1_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.cabine_joueur_aquaria, Orientation.dos)));
        Endroits.salle1_aquaria.setSol(Sol.carrelage);
		
		Endroits.cabine_joueur_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle1_aquaria, Orientation.dos)));
        Endroits.cabine_joueur_aquaria.setSol(Sol.carrelage);
		
		Endroits.salle2_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.salle1_aquaria, Orientation.gauche)));
		Endroits.salle2_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.salle3_aquaria, Orientation.droite)));
        Endroits.salle2_aquaria.setSol(Sol.carrelage);
		
		Endroits.salle3_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.salle2_aquaria, Orientation.gauche)));
		Endroits.salle3_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.salle4_aquaria, Orientation.droite)));
        Endroits.salle3_aquaria.setSol(Sol.carrelage);
		
		Endroits.salle4_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.salle3_aquaria, Orientation.gauche)));
		Endroits.salle4_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.salle5_aquaria, Orientation.droite)));
        Endroits.salle4_aquaria.setSol(Sol.carrelage);
		
		Endroits.salle5_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.salle4_aquaria, Orientation.gauche)));
		Endroits.salle5_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.salle6_aquaria, Orientation.droite)));
        Endroits.salle5_aquaria.setSol(Sol.carrelage);
		
		Endroits.salle6_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.salle5_aquaria, Orientation.gauche)));
		Endroits.salle6_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.cabine_capitaine_aquaria, Orientation.droite)));
        Endroits.salle6_aquaria.setSol(Sol.carrelage);
		
		Endroits.cabine_capitaine_aquaria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.salle6_aquaria, Orientation.gauche)));
        Endroits.cabine_capitaine_aquaria.setSol(Sol.carrelage);
		/* fin carmin sur mer */
		
		/* Celadopole */
        /* Arene pokemon */
        Endroits.bas_arene_erika_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_erika_celadopole, Orientation.dos)));
        Endroits.bas_arene_erika_celadopole.setSol(Sol.carrelage);
        
        Endroits.salle_champion_arene_erika_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_erika_celadopole, Orientation.face)));
        Endroits.salle_champion_arene_erika_celadopole.setSol(Sol.carrelage);
        /* Fin Arene pokemon */
		/* Fin Celadopole */
		
		/* Lavanville */
        Endroits.rdc_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 4, 11,
                new Position(4, 11, Endroits.etage1_tour_pokemon_lavanville)));
		Endroits.rdc_tour_pokemon_lavanville.setSol(Sol.carrelage);
		
        Endroits.etage1_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 4, 11,
                new Position(4, 11, Endroits.rdc_tour_pokemon_lavanville)));
        Endroits.etage1_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 4, 0,
                new Position(4, 0, Endroits.etage2_tour_pokemon_lavanville)));
		Endroits.etage1_tour_pokemon_lavanville.setSol(Sol.carrelage);
		
        Endroits.etage2_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 4, 0,
                new Position(4, 0, Endroits.etage1_tour_pokemon_lavanville)));
        Endroits.etage2_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 4, 11,
                new Position(4, 11, Endroits.etage3_tour_pokemon_lavanville)));
		Endroits.etage2_tour_pokemon_lavanville.setSol(Sol.carrelage);
		
        Endroits.etage3_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 4, 11,
                new Position(4, 11, Endroits.etage2_tour_pokemon_lavanville)));
        Endroits.etage3_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 4, 0,
                new Position(4, 0, Endroits.etage4_tour_pokemon_lavanville)));
		Endroits.etage3_tour_pokemon_lavanville.setSol(Sol.carrelage);
		
        Endroits.etage4_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 4, 0,
                new Position(4, 0, Endroits.etage3_tour_pokemon_lavanville)));
        Endroits.etage4_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 4, 11,
                new Position(4, 11, Endroits.etage5_tour_pokemon_lavanville)));
		Endroits.etage4_tour_pokemon_lavanville.setSol(Sol.carrelage);
		
        Endroits.etage5_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 4, 11,
                new Position(4, 11, Endroits.etage4_tour_pokemon_lavanville)));
        Endroits.etage5_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 8, 5,
                new Position(8, 5, Endroits.etage6_tour_pokemon_lavanville)));
		Endroits.etage5_tour_pokemon_lavanville.setSol(Sol.carrelage);
		
        Endroits.etage6_tour_pokemon_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 8, 5,
                new Position(8, 5, Endroits.etage5_tour_pokemon_lavanville)));
		Endroits.etage6_tour_pokemon_lavanville.setSol(Sol.carrelage);
		/* Fin Lavanville */
		
		/* Sombreville */
        /* Arene pokemon yas */
        Endroits.bas_arene_yas_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_yas_sombreville, Orientation.dos)));
        Endroits.bas_arene_yas_sombreville.setSol(Sol.carrelage);
        
        Endroits.salle_champion_arene_yas_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_yas_sombreville, Orientation.face)));
        Endroits.salle_champion_arene_yas_sombreville.setSol(Sol.carrelage);
        /* Fin Arene pokemon yas */
        /* Arene pokemon kas */
        Endroits.bas_arene_kas_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_kas_sombreville, Orientation.dos)));
        Endroits.bas_arene_kas_sombreville.setSol(Sol.carrelage);
        
        Endroits.salle_champion_arene_kas_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_kas_sombreville, Orientation.face)));
        Endroits.salle_champion_arene_kas_sombreville.setSol(Sol.carrelage);
        /* Fin Arene pokemon kas */
		/* Fin Sombreville */
		
		/* Rocheville */
		Endroits.entree_manoir_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 0,
                new Position(3, 9, 0, Endroits.salle_arene_evoli_manoir_rocheville, Orientation.gauche)));
		Endroits.entree_manoir_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(7, 5, 0, Endroits.jardin_manoir_rocheville, Orientation.dos)));
        Endroits.entree_manoir_rocheville.setSol(Sol.carrelage);
		
		Endroits.salle_arene_evoli_manoir_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_evoli_manoir_rocheville, Orientation.dos)));
		Endroits.salle_arene_evoli_manoir_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 3, 9,
                new Position(3, 0, 0, Endroits.entree_manoir_rocheville, Orientation.droite)));
        Endroits.salle_arene_evoli_manoir_rocheville.setSol(Sol.carrelage);
		
		Endroits.salle_champion_arene_evoli_manoir_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.salle_arene_evoli_manoir_rocheville, Orientation.face)));
        Endroits.salle_champion_arene_evoli_manoir_rocheville.setSol(Sol.carrelage);
		/* Fin rocheville */
		
		/* Parmanie */
        /* Arene pokemon */
        Endroits.bas_arene_koga_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_koga_parmanie, Orientation.dos)));
        Endroits.bas_arene_koga_parmanie.setSol(Sol.carrelage);
        
        Endroits.salle_champion_arene_koga_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_koga_parmanie, Orientation.face)));
        Endroits.salle_champion_arene_koga_parmanie.setSol(Sol.carrelage);
        /* Fin Arene pokemon */
		/* Fin Parmanie */
		
		/* Cramois'ile */
        /* Arene pokemon */
        Endroits.bas_arene_auguste_cramois_ile.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_auguste_cramois_ile, Orientation.dos)));
        Endroits.bas_arene_auguste_cramois_ile.setSol(Sol.carrelage);
        
        Endroits.salle_champion_arene_auguste_cramois_ile.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_auguste_cramois_ile, Orientation.face)));
        Endroits.salle_champion_arene_auguste_cramois_ile.setSol(Sol.carrelage);
        /* Fin Arene pokemon */
		/* Fin Cramois'ile */
		
		/* Fin Kanto */
        
        /* Johto */
        /* Bourg geon */
        /* Quartier Dresseur */
        /* Bas maison Rival1 */
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 5, Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon)));
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival1_quartierHabitant_bourg_geon.setSol(Sol.bois);
        /* Fin bas maison Rival1 */
        /* chambre Rival1 */
        Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 5, Endroits.bas_maisonRival1_quartierHabitant_bourg_geon)));
        Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new Objet_endroit_soin(Type_objet.lit, 3, 9,
                "voulez vous vous reposez?"));
        Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new Objet_endroit_pc(Type_objet.table_pc, 0, 0));
        Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 2));
        Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tabouret, 1, 0));
        Endroits.chambreRival1_maisonRival1_quartierHabitant_bourg_geon.setSol(Sol.bois);
        /* Fin chambre Rival1 */
        /* Bas maison Rival2 */
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 1, Endroits.chambreRival2_maisonRival2_quartierHabitant_bourg_geon)));
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival2_quartierHabitant_bourg_geon.setSol(Sol.bois);
        /* Fin bas maison Rival2 */
        /* chambre Rival2 */
        Endroits.chambreRival2_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 3, Endroits.bas_maisonRival2_quartierHabitant_bourg_geon)));
        Endroits.chambreRival2_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRival2_maisonRival2_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 0, 9));
        Endroits.chambreRival2_maisonRival2_quartierHabitant_bourg_geon.setSol(Sol.bois);
        /* Fin chambre Rival2 */
        /* Bas maison Rival3 */
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 1, Endroits.chambreRival3_maisonRival3_quartierHabitant_bourg_geon)));
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival3_quartierHabitant_bourg_geon.setSol(Sol.bois);
        /* Fin bas maison Rival2 */
        /* chambre Rival2 */
        Endroits.chambreRival3_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 3, Endroits.bas_maisonRival3_quartierHabitant_bourg_geon)));
        Endroits.chambreRival3_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRival3_maisonRival3_quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 0, 9));
        Endroits.chambreRival3_maisonRival3_quartierHabitant_bourg_geon.setSol(Sol.bois);
        /* Fin chambre Rival2 */
        /* Fin Quartier Dresseur */
		/* Quartier Labo */
        /* Labo prof orm */
        Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.machine1, 0, 0));
        Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.machine2, 0, 1));
        Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table_pc, 0, 2));
        Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.grande_etagere, 0, 8));
        Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.grande_etagere, 0, 9));
        Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new Objet_endroit_soin(Type_objet.machine_soin, 2, 2,
                "voulez vous soignez vos pokemon ?"));
        Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table_pokemon, 2, 8));
        for (int j = 0 ; j < 4 ; j++) {
            Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.grande_etagere, 4, j));
        }
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.grande_etagere, 4, j));
        }
		Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(7, 5, 0, Endroits.quartierParcLaboProfOrm_bourgGeon, Orientation.dos)));
        Endroits.bas_laboProfOrme_quartierLabo_bourg_geon.setSol(Sol.carrelage);
        /* Fin labo prof orm */
		/* Fin Quartier Labo*/
        /* Fin bourg geon */
		/* Tour chetiflor */
        Endroits.rc_tour_chetiflor.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 9,
                new Position(0, 9, Endroits.etage1_tour_chetiflor)));
        Endroits.rc_tour_chetiflor.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 2, 3,
                new Position(2, 3, Endroits.etage1_tour_chetiflor)));
        Endroits.rc_tour_chetiflor.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 3, 1,
                new Position(3, 1, Endroits.etage1_tour_chetiflor)));
		Endroits.rc_tour_chetiflor.setSol(Sol.bois);
		
        Endroits.etage1_tour_chetiflor.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 0, 9,
                new Position(0, 9, Endroits.rc_tour_chetiflor)));
        Endroits.etage1_tour_chetiflor.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 2, 3,
                new Position(2, 3, Endroits.rc_tour_chetiflor)));
        Endroits.etage1_tour_chetiflor.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 3, 1,
                new Position(3, 1, Endroits.rc_tour_chetiflor)));
        Endroits.etage1_tour_chetiflor.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 5, 5,
                new Position(6, 5, 0, Endroits.etage2_tour_chetiflor, Orientation.dos)));
		Endroits.etage1_tour_chetiflor.setSol(Sol.bois);
		
        Endroits.etage2_tour_chetiflor.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 6, 5,
                new Position(5, 5, Endroits.etage1_tour_chetiflor)));
		Endroits.etage2_tour_chetiflor.setSol(Sol.bois);
		/* Fin tour chetiflor */
        /* Arene Mauville */
        
        Endroits.bas_arene_albert_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, 5,
                new Position(6, 5, 0, Endroits.salle_champion_arene_albert_mauville, Orientation.dos)));
        
        Endroits.salle_champion_arene_albert_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 6, 5,
                new Position(0, 5, 0, Endroits.bas_arene_albert_mauville, Orientation.face)));
        /* Fin Arene Mauville */
        /* Fin Johto */
        
        /* Hoenn */
        /* Bourg en vol */
        /* Quartier Dresseur */
        /* Bas maison Rival1 */
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 5, Endroits.chambreRival1_maisonRival1_quartier_habitant_bourg_en_vol)));
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol.setSol(Sol.bois);
        /* Fin bas maison Rival1 */
        /* chambre Rival1 */
        Endroits.chambreRival1_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 5, Endroits.bas_maisonRival1_quartier_habitant_bourg_en_vol)));
        Endroits.chambreRival1_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new Objet_endroit_soin(Type_objet.lit, 3, 9,
                "voulez vous vous reposez?"));
        Endroits.chambreRival1_maisonRival1_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new Objet_endroit_pc(Type_objet.pc_leo, 0, 9));
        Endroits.chambreRival1_maisonRival1_quartier_habitant_bourg_en_vol.setSol(Sol.bois);
        /* Fin chambre Rival1 */
        /* Bas maison Rival2 */
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 1, Endroits.chambreRival2_maisonRival2_quartier_habitant_bourg_en_vol)));
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol.setSol(Sol.bois);
        /* Fin bas maison Rival2 */
        /* chambre Rival2 */
        Endroits.chambreRival2_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 3, Endroits.bas_maisonRival2_quartier_habitant_bourg_en_vol)));
        Endroits.chambreRival2_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRival2_maisonRival2_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 0, 9));
        Endroits.chambreRival2_maisonRival2_quartier_habitant_bourg_en_vol.setSol(Sol.bois);
        /* Fin chambre Rival2 */
        /* Bas maison Rival3 */
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 1, Endroits.chambreRival3_maisonRival3_quartier_habitant_bourg_en_vol)));
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol.setSol(Sol.bois);
        /* Fin bas maison Rival2 */
        /* chambre Rival2 */
        Endroits.chambreRival3_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 3, Endroits.bas_maisonRival3_quartier_habitant_bourg_en_vol)));
        Endroits.chambreRival3_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRival3_maisonRival3_quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 0, 9));
        Endroits.chambreRival3_maisonRival3_quartier_habitant_bourg_en_vol.setSol(Sol.bois);
        /* Fin chambre Rival2 */
        /* Fin Quartier Dresseur */
        /* Fin Bourg en vol */
        /* Fin Hoenn */
        
        /* Sinnoh */
        /* Bonaugure */
        /* Quartier Dresseur */
        /* Bas maison Rival1 */
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 5, Endroits.chambreRival1_maisonRival1_quartier_habitant_bonaugure)));
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival1_quartier_habitant_bonaugure.setSol(Sol.bois);
        /* Fin bas maison Rival1 */
        /* chambre Rival1 */
        Endroits.chambreRival1_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 5, Endroits.bas_maisonRival1_quartier_habitant_bonaugure)));
        Endroits.chambreRival1_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new Objet_endroit_soin(Type_objet.lit, 3, 9,
                "voulez vous vous reposez?"));
        Endroits.chambreRival1_maisonRival1_quartier_habitant_bonaugure.ajouterObjetEndroit(new Objet_endroit_pc(Type_objet.pc_leo, 0, 9));
        Endroits.chambreRival1_maisonRival1_quartier_habitant_bonaugure.setSol(Sol.bois);
        /* Fin chambre Rival1 */
        /* Bas maison Rival2 */
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 1, Endroits.chambreRival2_maisonRival2_quartier_habitant_bonaugure)));
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival2_quartier_habitant_bonaugure.setSol(Sol.bois);
        /* Fin bas maison Rival2 */
        /* chambre Rival2 */
        Endroits.chambreRival2_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 3, Endroits.bas_maisonRival2_quartier_habitant_bonaugure)));
        Endroits.chambreRival2_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRival2_maisonRival2_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 0, 9));
        Endroits.chambreRival2_maisonRival2_quartier_habitant_bonaugure.setSol(Sol.bois);
        /* Fin chambre Rival2 */
        /* Bas maison Rival3 */
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 5,
                new Position(0, 1, Endroits.chambreRival3_maisonRival3_quartier_habitant_bonaugure)));
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 3, 5));
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 0, 3));
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 0, 0));
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 0, 2));
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 0));
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 6, 9));
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 0, 9));
        Endroits.bas_maisonRival3_quartier_habitant_bonaugure.setSol(Sol.bois);
        /* Fin bas maison Rival2 */
        /* chambre Rival2 */
        Endroits.chambreRival3_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant,
                0, 4, new Position(0, 3, Endroits.bas_maisonRival3_quartier_habitant_bonaugure)));
        Endroits.chambreRival3_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.lit, 3, 9));
        Endroits.chambreRival3_maisonRival3_quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pc_leo, 0, 9));
        Endroits.chambreRival3_maisonRival3_quartier_habitant_bonaugure.setSol(Sol.bois);
        /* Fin chambre Rival2 */
        /* Fin Quartier Dresseur */
        /* Fin Bonaugure */
        /* Fin Sinnoh */
    }

    private void modificationSalleGrotte() {
        /* Mont selenite */
        /* Mont selenite rdc partie 1 */
        for (int j = 1 ; j < 9 ; j++) {
            Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 3));
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 4));
        }
        Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 7, 5,
                new Position(0, 9, 0, Endroits.fin_route4, Orientation.face)));
        Endroits.montSelenite_rdc_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 0, 9,
                new Position(7, 9, 0, Endroits.montSelenite_rdc_partie2, Orientation.dos)));
        /* Fin Mont selenite rdc partie 1 */
        /* Mont selenite rdc partie 2 */
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.montSelenite_rdc_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.montSelenite_rdc_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.montSelenite_rdc_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int j = 1 ; j < 9 ; j++) {
            Endroits.montSelenite_rdc_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.montSelenite_rdc_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 7, 9,
                new Position(0, 9, 0, Endroits.montSelenite_rdc_partie1, Orientation.face)));
        Endroits.montSelenite_rdc_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 2, 2,
                new Position(1, 1, 0, Endroits.montSelenite_ss1_partie1, Orientation.face)));
        Endroits.montSelenite_rdc_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 3, 6,
                new Position(3, 9, 0, Endroits.montSelenite_ss1_partie1, Orientation.gauche)));
        /* Fin Mont selenite rdc partie 2 */
        /* Mont selenite rdc partie 3 */
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.montSelenite_rdc_partie3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.montSelenite_rdc_partie3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.montSelenite_rdc_partie3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.montSelenite_rdc_partie3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.montSelenite_rdc_partie3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 5, 4,
                new Position(1, 10, 0, Endroits.montSelenite_ss1_partie2, Orientation.face)));
        /* Fin Mont selenite niveau 0 partie 3 */
        /* Mont selenite niveau 0 partie 4 */
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.montSelenite_rdc_partie4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.montSelenite_rdc_partie4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.montSelenite_rdc_partie4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.montSelenite_rdc_partie4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.montSelenite_rdc_partie4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.montSelenite_rdc_partie4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 1, 2,
                new Position(3, 7, 0, Endroits.montSelenite_ss1_partie2, Orientation.gauche)));
        Endroits.montSelenite_rdc_partie4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 7, 5,
                new Position(0, 1, 0, Endroits.debut_route4, Orientation.face)));
        /* Fin Mont selenite niveau 0 partie 4 */
        /* Mont selenite ss1 partie 1 */
        for (int j = 0 ; j < 12 ; j++) {
            Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 9, j));
        }
        for (int i = 0 ; i < 9 ; i++) {
            Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int j = 1 ; j < 3 ; j++) {
            Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 0 ; i < 6 ; i++) {
            Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 3));
        }
		for (int j = 3 ; j < 11 ; j++) {
            Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 6, j));
        }
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 4 ; j < 12; j++) {
                Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 4 ; i < 6 ; i++) {
            for (int j = 4 ; j < 12; j++) {
                Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 2 ; i < 4 ; i++) {
            for (int j = 10 ; j < 12; j++) {
                Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 6 ; i < 9 ; i++) {
            Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 11));
        }
        Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 1, 1,
                new Position(2, 2, 0, Endroits.montSelenite_rdc_partie2, Orientation.face)));
        Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 8, 10,
                new Position(2, 4, 0, Endroits.montSelenite_ss2_partie2, Orientation.droite)));
        Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 3, 9,
                new Position(3, 6, 0, Endroits.montSelenite_rdc_partie2, Orientation.dos)));
        Endroits.montSelenite_ss1_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 3, 4,
                new Position(4, 2, 0, Endroits.montSelenite_ss2_partie1, Orientation.droite)));
        /* Fin Mont selenite ss1 partie 1 */
        /* Mont selenite ss1 partie 2 */
        for (int j = 0 ; j < 12 ; j++) {
            Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 9, j));
        }
        for (int i = 0 ; i < 9 ; i++) {
            Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 11));
        }
		for (int j = 9 ; j < 11 ; j++) {
            Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 0 ; i < 6 ; i++) {
            Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 8));
        }
		for (int j = 1 ; j < 9 ; j++) {
            Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 6, j));
        }
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 8; j++) {
                Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 4 ; i < 6 ; i++) {
            for (int j = 0 ; j < 8; j++) {
                Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 2 ; i < 4 ; i++) {
            for (int j = 0 ; j < 2; j++) {
                Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 6 ; i < 9 ; i++) {
            Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 1, 10,
                new Position(5, 4, 0, Endroits.montSelenite_rdc_partie3, Orientation.face)));
        Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 8, 1,
                new Position(6, 1, 0, Endroits.montSelenite_ss2_partie3, Orientation.face)));
        Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 3, 7,
                new Position(1, 2, 0, Endroits.montSelenite_rdc_partie4, Orientation.droite)));
        Endroits.montSelenite_ss1_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 3, 3,
                new Position(2, 3, 0, Endroits.montSelenite_ss2_partie3, Orientation.face)));
        /* Fin Mont selenite ss1 partie 2 */
        /* Mont selenite ss2 partie 1 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.montSelenite_ss2_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int j = 0 ; j < 5 ; j++) {
            Endroits.montSelenite_ss2_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 7, j));
        }
		for (int j = 6 ; j < 11 ; j++) {
            Endroits.montSelenite_ss2_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 7, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.montSelenite_ss2_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.montSelenite_ss2_partie1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.montSelenite_ss2_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 4, 2,
                new Position(3, 4, 0, Endroits.montSelenite_ss1_partie1, Orientation.droite)));
        Endroits.montSelenite_ss2_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 7, 5,
                new Position(0, 1, 0, Endroits.montSelenite_ss2_partie2, Orientation.face)));
        /* Fin Mont selenite ss2 partie 1 */
        /* Mont selenite ss2 partie 2 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.montSelenite_ss2_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.montSelenite_ss2_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.montSelenite_ss2_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int j = 2 ; j < 9 ; j++) {
            Endroits.montSelenite_ss2_partie2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        Endroits.montSelenite_ss2_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 2, 4,
                new Position(8, 10, 0, Endroits.montSelenite_ss1_partie1, Orientation.droite)));
        Endroits.montSelenite_ss2_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 0, 1,
                new Position(7, 5, 0, Endroits.montSelenite_ss2_partie1, Orientation.dos)));
        Endroits.montSelenite_ss2_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 0, 9,
                new Position(7, 5, 0, Endroits.montSelenite_ss2_partie3, Orientation.dos)));
        /* Fin Mont selenite ss2 partie 2 */
        /* Mont selenite ss2 partie 3 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.montSelenite_ss2_partie3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.montSelenite_ss2_partie3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.montSelenite_ss2_partie3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.montSelenite_ss2_partie3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 2, 3,
                new Position(3, 3, 0, Endroits.montSelenite_ss1_partie2, Orientation.droite)));
        Endroits.montSelenite_ss2_partie3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 6, 1,
                new Position(8, 1, 0, Endroits.montSelenite_ss1_partie2, Orientation.droite)));
        Endroits.montSelenite_ss2_partie3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 7, 5,
                new Position(0, 9, 0, Endroits.montSelenite_ss2_partie2, Orientation.face)));
        /* Fin Mont selenite ss2 partie 3 */
        /* Fin Mont selenite */
		
		
		/* Caverne azuree */
        /* Caverne azuree rdc */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.caverne_azuree_rdc.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.caverne_azuree_rdc.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.caverne_azuree_rdc.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.caverne_azuree_rdc.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 3, 5,
                new Position(3, 3, 0, Endroits.caverne_azuree_e1, Orientation.droite)));
        Endroits.caverne_azuree_rdc.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 2, 2,
                new Position(3, 3, 0, Endroits.caverne_azuree_ss1, Orientation.droite)));
        /* Fin Caverne azuree rdc */
        /* Caverne azuree e1 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.caverne_azuree_e1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.caverne_azuree_e1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.caverne_azuree_e1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 1 ; j < 10 ; j++) {
            Endroits.caverne_azuree_e1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.caverne_azuree_e1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 3, 3,
                new Position(3, 5, 0, Endroits.caverne_azuree_rdc, Orientation.droite)));
        /* Fin Caverne azuree e1 */
        /* Caverne azuree ss1 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.caverne_azuree_ss1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.caverne_azuree_ss1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.caverne_azuree_ss1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 1 ; j < 10 ; j++) {
            Endroits.caverne_azuree_ss1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.caverne_azuree_ss1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 3, 3,
                new Position(2, 2, 0, Endroits.caverne_azuree_rdc, Orientation.droite)));
        /* Fin Caverne azuree ss1 */
        /* Fin Caverne azuree */
		
		
		/* Grotte */
        /* Grotte rdc p1 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.grotte_route10_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.grotte_route10_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.grotte_route10_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 1 ; j < 5 ; j++) {
            Endroits.grotte_route10_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
		for (int j = 6 ; j < 10 ; j++) {
            Endroits.grotte_route10_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.grotte_route10_rdc_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 1, 9,
                new Position(1, 6, 0, Endroits.grotte_route10_ss_p1, Orientation.gauche)));
        Endroits.grotte_route10_rdc_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 1, 2,
                new Position(1, 1, 0, Endroits.grotte_route10_ss_p1, Orientation.face)));
        Endroits.grotte_route10_rdc_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 5, 5,
                new Position(5, 5, 0, Endroits.grotte_route10_ss_p1, Orientation.gauche)));
        /* Fin Grotte rdc p1 */
        /* Grotte rdc p2 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.grotte_route10_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.grotte_route10_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.grotte_route10_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 1 ; j < 5 ; j++) {
            Endroits.grotte_route10_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
		for (int j = 6 ; j < 10 ; j++) {
            Endroits.grotte_route10_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.grotte_route10_rdc_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 2, 9,
                new Position(3, 7, 0, Endroits.grotte_route10_ss_p2, Orientation.face)));
        /* Fin Grotte rdc p2 */
        /* Grotte ss p1 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.grotte_route10_ss_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.grotte_route10_ss_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.grotte_route10_ss_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 1 ; j < 9 ; j++) {
            Endroits.grotte_route10_ss_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.grotte_route10_ss_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 1, 6,
                new Position(1, 9, 0, Endroits.grotte_route10_rdc_p1, Orientation.face)));
        Endroits.grotte_route10_ss_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 1, 1,
                new Position(1, 2, 0, Endroits.grotte_route10_rdc_p1, Orientation.face)));
        Endroits.grotte_route10_ss_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 5, 5,
                new Position(5, 5, 0, Endroits.grotte_route10_rdc_p1, Orientation.face)));
        Endroits.grotte_route10_ss_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 7, 9,
                new Position(0, 9, 0, Endroits.grotte_route10_ss_p2, Orientation.face)));
        /* Fin Grotte ss p1 */
        /* Grotte ss p2 */
		for (int j = 0 ; j < 9 ; j++) {
            Endroits.grotte_route10_ss_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.grotte_route10_ss_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 0 ; i < 8 ; i++) {
            Endroits.grotte_route10_ss_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 1 ; j < 10 ; j++) {
            Endroits.grotte_route10_ss_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.grotte_route10_ss_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 3, 7,
                new Position(2, 9, 0, Endroits.grotte_route10_rdc_p2, Orientation.gauche)));
        Endroits.grotte_route10_ss_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 0, 9,
                new Position(7, 9, 0, Endroits.grotte_route10_ss_p1, Orientation.dos)));
        /* Fin Grotte ss p2 */
        /* Fin Grotte */
		
		
		/* Cave taupiqueur */
        /* Cave taupiqueur p1 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.cave_taupiqueur_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.cave_taupiqueur_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
		for (int i = 1 ; i < 7 ; i++) {
            Endroits.cave_taupiqueur_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.cave_taupiqueur_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 10, 0, Endroits.cave_taupiqueur_p2, Orientation.gauche)));
        /* Fin Cave taupiqueur p1 */
        /* Cave taupiqueur p2 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.cave_taupiqueur_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.cave_taupiqueur_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.cave_taupiqueur_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 10, 0, Endroits.cave_taupiqueur_p3, Orientation.gauche)));
        Endroits.cave_taupiqueur_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(4, 0, 0, Endroits.cave_taupiqueur_p1, Orientation.droite)));
        /* Fin Cave taupiqueur p2 */
        /* Cave taupiqueur p3 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.cave_taupiqueur_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.cave_taupiqueur_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.cave_taupiqueur_p3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 10, 0, Endroits.cave_taupiqueur_p4, Orientation.gauche)));
        Endroits.cave_taupiqueur_p3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(4, 0, 0, Endroits.cave_taupiqueur_p2, Orientation.droite)));
        /* Fin Cave taupiqueur p3 */
        /* Cave taupiqueur p4 */
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.cave_taupiqueur_p4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.cave_taupiqueur_p4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
		for (int i = 1 ; i < 7 ; i++) {
            Endroits.cave_taupiqueur_p4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        Endroits.cave_taupiqueur_p4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(4, 0, 0, Endroits.cave_taupiqueur_p3, Orientation.droite)));
        /* Fin Cave taupiqueur p4 */
        /* Fin Cave taupiqueur */
		
        /* Canyon */
        /* Canyon p1 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.canyon_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.canyon_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.canyon_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.canyon_p2, Orientation.face)));
        /* Fin Canyon p1 */
        /* Canyon p2 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.canyon_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.canyon_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.canyon_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.canyon_p1, Orientation.dos)));
        Endroits.canyon_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.canyon_p3, Orientation.face)));
        /* Fin Canyon p2 */
        /* Canyon p3 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.canyon_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.canyon_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.canyon_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.canyon_p3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.canyon_p2, Orientation.dos)));
        /* Fin Canyon p3 */
        /* Fin Canyon */
		
		/* Johto */
		/* Caves jumelle */
		Endroits.caves_jumelle_rdc_p1.supprimeObjetEndroit(Endroits.caves_jumelle_rdc_p1.getObjetEndroit(0));
        Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 7, 8,
                new Position(2, 7, 0, Endroits.fin_route32, Orientation.face)));
		for (int i = 0 ; i < 8 ; i++) {
            Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int j = 1 ; j < 4 ; j++) {
            Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 0 ; i < 5 ; i++) {
            Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 4));
        }
		for (int j = 5 ; j < 11 ; j++) {
            Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, j));
        }
		for (int i = 5 ; i < 8 ; i++) {
            Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 1 ; j < 3 ; j++) {
            Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 7, j));
        }
		Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, 7, 7));
		Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, 9));
        Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 1, 1,
                new Position(7, 10, 0, Endroits.caves_jumelle_ss1_p2, Orientation.gauche)));
        Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 7, 3,
                new Position(0, 3, 0, Endroits.caves_jumelle_rdc_p2, Orientation.face)));
		for (int j = 4 ; j < 7 ; j++) {
            Endroits.caves_jumelle_rdc_p1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 7, j,
                new Position(0, j, 0, Endroits.caves_jumelle_rdc_p2, Orientation.face)));
        }
		
		
		for (int i = 0 ; i < 4 ; i++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 2 ; i < 8 ; i++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int j = 1 ; j < 3 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, j));
        }
		for (int j = 7 ; j < 11 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, j));
        }
		Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 2, 4));
        for (int i = 2 ; i < 4 ; i++) {
            for (int j = 0 ; j < 3; j++) {
                Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
		for (int i = 2 ; i < 4 ; i++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 3));
        }
		for (int j = 5 ; j < 9 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 3, j));
        }
		for (int j = 1 ; j < 3 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 4, j));
        }
		for (int j = 5 ; j < 9 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, j));
        }
		for (int j = 0 ; j < 6 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 5, j));
        }
		for (int j = 7 ; j < 10 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
		Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 0, 3,
                new Position(7, 3, 0, Endroits.caves_jumelle_rdc_p1, Orientation.dos)));
		for (int j = 4 ; j < 7 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 0, j,
                new Position(7, j, 0, Endroits.caves_jumelle_rdc_p1, Orientation.dos)));
        }
		for (int j = 0 ; j < 6 ; j++) {
            Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 7, j,
                new Position(0, j, 0, Endroits.caves_jumelle_rdc_p3, Orientation.face)));
        }
		Endroits.caves_jumelle_rdc_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 7, 6,
                new Position(0, 6, 0, Endroits.caves_jumelle_rdc_p3, Orientation.face)));
		
		
		Endroits.caves_jumelle_rdc_p3.supprimeObjetEndroit(Endroits.caves_jumelle_rdc_p3.getObjetEndroit(0));
        Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 7, 8,
                new Position(4, 9, 0, Endroits.debut_route33, Orientation.face)));
		for (int i = 0 ; i < 7 ; i++) {
            Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, 0, 7));
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 0 ; j < 4; j++) {
                Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
		Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, 2, 5));
		for (int j = 3 ; j < 6 ; j++) {
            Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 4, j));
        }
		for (int i = 4 ; i < 6 ; i++) {
            for (int j = 1 ; j < 3; j++) {
                Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
		for (int j = 1 ; j < 6 ; j++) {
            Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 0, j,
                new Position(7, j, 0, Endroits.caves_jumelle_rdc_p2, Orientation.dos)));
        }
		Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.roche, 0, 6,
                new Position(7, 6, 0, Endroits.caves_jumelle_rdc_p2, Orientation.dos)));
        Endroits.caves_jumelle_rdc_p3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 5, 3,
                new Position(3, 0, 0, Endroits.caves_jumelle_ss1_p3, Orientation.droite)));
		
				
        Endroits.caves_jumelle_ss1_p2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 7, 10,
                new Position(1, 1, 0, Endroits.caves_jumelle_rdc_p1, Orientation.gauche)));
		
		Endroits.caves_jumelle_ss1_p3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 3, 0,
                new Position(5, 3, 0, Endroits.caves_jumelle_rdc_p3, Orientation.gauche)));
		/* Fin Caves jumelle */
		/* Fin Johto */

    }

    private void modificationBatiment() {
        /* Bourg Palette */
        Endroits.shop_bourgPalette.ajouterObjet(Objets.antidote);
        Endroits.shop_bourgPalette.ajouterObjet(Objets.pokeball);
        Endroits.shop_bourgPalette.ajouterObjet(Objets.potion);
        /* Fin Bourg Palette */
        
        /* Jadielle */
        Endroits.shop_jadielle.ajouterObjet(Objets.antidote);
        Endroits.shop_jadielle.ajouterObjet(Objets.pokeball);
        Endroits.shop_jadielle.ajouterObjet(Objets.potion);
        /* Fin Jadielle */
        
        /* Argenta */
        Endroits.shop_argenta.ajouterObjet(Objets.antidote);
        Endroits.shop_argenta.ajouterObjet(Objets.pokeball);
        Endroits.shop_argenta.ajouterObjet(Objets.potion);
        /* Fin Argenta */
        
        /* Azuria */
        Endroits.shop_azuria.ajouterObjet(Objets.antidote);
        Endroits.shop_azuria.ajouterObjet(Objets.pokeball);
        Endroits.shop_azuria.ajouterObjet(Objets.potion);
        /* Fin Azuria */
        
        /* Safrania */
        /* quartier arene Safrania */
        Endroits.gare_safrania.ajouterDestination(Endroits.gare_doublonville);
        Endroits.gare_safrania.ajouterDestination(Endroits.gare_feli_cite);
        Endroits.gare_safrania.ajouterDestination(Endroits.gare_merouville);
        Endroits.gare_safrania.ajouterObjet(Objets.ticket);
        Endroits.gare_safrania.ajouterObjet(Objets.passe_train);
        /* fin quartier arene Safrania */
        /* Fin Safrania */
        
        /* Centrale */
        /* Centrale partie1 */
        Endroits.centrale_partie1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 11,
                new Position(4, 0, 0, Endroits.centrale_partie2, Orientation.droite)));
        Endroits.centrale_partie1.setSol(Sol.carrelage);
        /* fin Centrale partie1 */
        /* Centrale partie2 */
        Endroits.centrale_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 11, 0, Endroits.centrale_partie1, Orientation.gauche)));
        Endroits.centrale_partie2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 6,
                new Position(8, 6, 0, Endroits.centrale_partie3, Orientation.dos)));
        Endroits.centrale_partie2.setSol(Sol.carrelage);
        /* fin Centrale partie2 */
        /* Centrale partie3 */
        Endroits.centrale_partie3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 8, 6,
                new Position(0, 6, 0, Endroits.centrale_partie2, Orientation.face)));
        Endroits.centrale_partie3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 11, 0, Endroits.centrale_partie4, Orientation.gauche)));
        Endroits.centrale_partie3.setSol(Sol.carrelage);
        /* fin Centrale partie3 */
        /* Centrale partie4 */
        Endroits.centrale_partie4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 11,
                new Position(4, 0, 0, Endroits.centrale_partie3, Orientation.droite)));
        Endroits.centrale_partie4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 11, 0, Endroits.centrale_partie5, Orientation.gauche)));
        Endroits.centrale_partie4.setSol(Sol.carrelage);
        /* fin Centrale partie4 */
        /* Centrale partie5 */
        Endroits.centrale_partie5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 11,
                new Position(4, 0, 0, Endroits.centrale_partie4, Orientation.droite)));
        Endroits.centrale_partie5.setSol(Sol.carrelage);
        /* fin Centrale partie5 */
        /* Fin Centrale */
        
        /* Rocheville */
        Endroits.shop_manoir_rocheville.ajouterObjet(Objets.pierreFoudre);
        Endroits.shop_manoir_rocheville.ajouterObjet(Objets.pierreEau);
        Endroits.shop_manoir_rocheville.ajouterObjet(Objets.pierrePlante);
        Endroits.shop_manoir_rocheville.ajouterObjet(Objets.pierreFeu);
        Endroits.shop_manoir_rocheville.ajouterObjet(Objets.pierreLune);
        /* Fin Rocheville */
        
        /* Ligue pokemon kanto */
        /* quartier stade Ligue pokemon kanto */
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.agatha_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.albert_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.aldo_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.asunta_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.auguste_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.catherine_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.cyclo_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.damien_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dario_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress1_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress2_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress3_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress4_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress5_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress6_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress7_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress8_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress9_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress10_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress11_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress12_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress13_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress14_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress15_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress16_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress17_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress18_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress19_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress20_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress21_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress22_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress23_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress24_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress25_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress26_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress27_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress28_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress29_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress30_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress31_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress32_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress33_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress34_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress35_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress36_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress37_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress38_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress39_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress40_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress1Mewtwo_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress2Mewtwo_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.dress3Mewtwo_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.duplica_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.eric_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.erika_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.giovanie_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.giselle_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.janette_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.karateka_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.kas_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.koga_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.lara_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.maitreEvoli_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.majorBob_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.mark_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.melissa_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.morgane_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.olga_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.ondine_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.peter_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.pierre_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.regis_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.richis_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.rival1_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.rival2_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.sacha_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.samourai_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.stella_ligue_pokemon_kanto);
        Endroits.stade_ligue_pokemon_kanto.ajouterParticipant(Dresseurs.yas_ligue_pokemon_kanto);
        /* fin stade arene Ligue pokemon kanto */
        /* Fin Ligue pokemon kanto */
        
        /* Ville griotte */
        Endroits.shop_ville_griotte.ajouterObjet(Objets.antidote);
        Endroits.shop_ville_griotte.ajouterObjet(Objets.pokeball);
        Endroits.shop_ville_griotte.ajouterObjet(Objets.potion);
        /* Fin Ville griotte */
        
        /* Mauville */
        Endroits.shop_mauville.ajouterObjet(Objets.antidote);
        Endroits.shop_mauville.ajouterObjet(Objets.pokeball);
        Endroits.shop_mauville.ajouterObjet(Objets.potion);
        /* Fin Mauville */
        
        /* Doublonville */
        /* quartier gare Doublonville */
        Endroits.gare_doublonville.ajouterDestination(Endroits.gare_safrania);
        Endroits.gare_doublonville.ajouterDestination(Endroits.gare_feli_cite);
        Endroits.gare_doublonville.ajouterDestination(Endroits.gare_merouville);
        Endroits.gare_doublonville.ajouterObjet(Objets.ticket);
        Endroits.gare_doublonville.ajouterObjet(Objets.passe_train);
        /* fin quartier gare Doublonville */
        /* Fin Doublonville */
        
        /* Féli-cité */
        /* quartier gare Féli-cité */
        Endroits.gare_feli_cite.ajouterDestination(Endroits.gare_safrania);
        Endroits.gare_feli_cite.ajouterDestination(Endroits.gare_doublonville);
        Endroits.gare_feli_cite.ajouterDestination(Endroits.gare_merouville);
        Endroits.gare_feli_cite.ajouterObjet(Objets.ticket);
        Endroits.gare_feli_cite.ajouterObjet(Objets.passe_train);
        /* fin quartier gare Féli-cité */
        /* Fin Féli-cité */
        
        /* Merouville */
        /* quartier gare Merouville */
        Endroits.gare_merouville.ajouterDestination(Endroits.gare_safrania);
        Endroits.gare_merouville.ajouterDestination(Endroits.gare_doublonville);
        Endroits.gare_merouville.ajouterDestination(Endroits.gare_feli_cite);
        Endroits.gare_merouville.ajouterObjet(Objets.ticket);
        Endroits.gare_merouville.ajouterObjet(Objets.passe_train);
        /* fin quartier gare Merouville */
        /* Fin Merouville */
    }

    private void modificationQuartier() {
        /*Bourg Palette*/
        /* Quartier Dresseur*/
        for (int i = 0; i < 8; i++) {
            Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
            Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 0; j < 5; j++) {
            Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6; j < 11; j++) {
            Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 3; j < 9; j++) {
            Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
        for (int j = 1; j < 5; j++) {
            Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        for (int i = 1; i < 7; i++) {
            Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 2, 4, "maison de red"));
        Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 4, 2, "maison de yellow"));
        Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 2, 9, "maison de blue"));
        Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 4, 7, "maison de Sacha"));
        Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 4, 9, "maison de Regis"));
		for (int j = 1 ; j < 5 ; j++) {
			Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, j,
                new Position(0, j, Endroits.quartierHabitant_bourgPalette)));
			Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, j+5,
                new Position(0, j+5, Endroits.quartierHabitant_bourgPalette)));
		}
        Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, Endroits.quartierHabitant_bourgPalette)));
        Endroits.quartierDresseur_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.debut_route1, Orientation.dos)));
        Endroits.quartierDresseur_bourgPalette.setSol(Sol.herbe);
        /*Fin Quartier Dresseur*/
        /* Quartier Habitant */
        for (int i = 0; i < 8; i++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0; i < 3; i++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 4; i < 8; i++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 1));
        for (int j = 4; j < 10; j++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 3; j < 10; j++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
        for (int i = 1; i < 6; i++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        for (int j = 1; j < 5; j++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        for (int j = 5; j < 9; j++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, 7));
        Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 3, 2, "maison du prof chen"));
        for (int j = 1 ; j < 5 ; j++) {
			Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(7, j, 0, Endroits.quartierDresseur_bourgPalette, Orientation.dos)));
			Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j+5,
                new Position(7, j+5, 0, Endroits.quartierDresseur_bourgPalette, Orientation.dos)));
		}
		Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.quartierDresseur_bourgPalette, Orientation.dos)));
        Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(4, 0, 0, Endroits.quartierLabo_bourgPalette, Orientation.droite)));
        for (int j = 2; j < 4; j++) {
            Endroits.quartierHabitant_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.mer, 7, j,
                new Position(0, j, Endroits.debut_route21)));
        }
        Endroits.quartierHabitant_bourgPalette.setSol(Sol.herbe);
        /* Fin Quartier habitant */
        /* Quartier Labo */
        Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(3, 10, 0, Endroits.quartierHabitant_bourgPalette, Orientation.gauche)));
        for (int j = 1; j < 8; j++) {
            Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 8 ; j < 11; j++) {
                Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, 0));
        Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 0));
        Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, 0));
        Endroits.quartierLabo_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, 7));
        Endroits.quartierLabo_bourgPalette.setSol(Sol.herbe);
        /* Fin quartier Labo */
        /* Quartier parc Labo */
		for (int j = 0; j < 11; j++) {
            Endroits.quartierParcLaboProfChen_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1; i < 8; i++) {
            Endroits.quartierParcLaboProfChen_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 1; i < 8; i++) {
            Endroits.quartierParcLaboProfChen_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
		for (int j = 1; j < 5; j++) {
            Endroits.quartierParcLaboProfChen_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int j = 6; j < 10; j++) {
            Endroits.quartierParcLaboProfChen_bourgPalette.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		Endroits.quartierParcLaboProfChen_bourgPalette.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 7, 5,
                new Position(0, 5, 0, Endroits.bas_laboProfChen_quartierLabo_bourgPalette, Orientation.face)));
        Endroits.quartierParcLaboProfChen_bourgPalette.setSol(Sol.herbe);
        /* Fin quartier parc Labo */
        /* FIN Bourg Palette */
        
        /* Jadielle */
        /* Quartier Boutique */
        for (int i = 4 ; i < 8 ; i++) {
            Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 1));
        }
        Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 4, 0));
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, 5));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 2, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 3, j));
        }
        for (int j = 6 ; j < 8 ; j++) {
            Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 6, j));
        }
        Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.fin_route1, Orientation.face)));
        Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 0,
                new Position(3, 9, 0, Endroits.debut_route22, Orientation.gauche)));
        Endroits.quartierBoutique_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 5,
                new Position(7, 5, 0,Endroits.quartierArene_jadielle, Orientation.dos)));
        Endroits.quartierBoutique_jadielle.setSol(Sol.herbe);
        /* Fin Quartier Boutique */
        /* Quartier Arene */
		for (int j = 7 ; j < 10 ; j++) {
            Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, 5));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 1, j));
        }
        for (int i = 2 ; i < 4 ; i++) {
            Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, 9));
        }
        Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, 0));
        Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbuste, 4, 1));
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, j));
        }
        for (int i = 0 ; i < 4 ; i++) {
            Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 3));
        }
		Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 4));
        for (int i = 5 ; i < 8 ; i++) {
            Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 5, 6));
        Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau_arene, 2, 7, 
			"Arene de Jadielle. Champion Giovanni : Le maitre de la team rocket"));
        Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 5,
                new Position(7, 4, 0, Endroits.debut_route2, Orientation.dos)));
        Endroits.quartierArene_jadielle.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 5,
                new Position(0, 5, 0, Endroits.quartierBoutique_jadielle, Orientation.face)));
        Endroits.quartierArene_jadielle.setSol(Sol.herbe);
        /* Fin Quartier Arene */
        /* Fin Jadielle */
        
        /* Argenta */
        /* Quartier Boutique Argenta */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 6, 5));
        for (int i = 1 ; i < 6 ; i++) {
            Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, 5));
        }
        for (int j = 2 ; j < 5 ; j++) {
            Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 5, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 4, j));
        }
        for (int i = 2 ; i < 4 ; i++) {
            for (int j = 2 ; j < 5 ; j++) {
                Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, j));
            }
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 0, j));
        }
        Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau_pokemon, 3, 9, "Tournoi de pokemon roche"));
        Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.fin_route2, Orientation.face)));
        Endroits.quartierBoutique_argenta.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 5,
                new Position(7, 5, 0, Endroits.quartierArene_argenta, Orientation.dos)));
        Endroits.quartierBoutique_argenta.setSol(Sol.herbe);
        /* Fin quartier boutique Argenta */
        /* quartier arene Argenta */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 6 ; i++) {
            Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 6 ; i < 8 ; i++) {
            for (int j = 6 ; j < 10 ; j++) {
                Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, j));
            }
        }
        for (int i = 2 ; i < 7 ; i++) {
            Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, 5));
        }
        Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 5, 6));
        for (int j = 1 ; j < 9 ; j++) {
            Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 2, j));
        }
        Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 1, 4));
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, 1));
        }
        Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 4, 2));
        Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau_arene, 3, 3, "Arene de d'Argenta. Champion Pierre : Le champion de la roche"));
        Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 5,
                new Position(0, 5, 0, Endroits.quartierBoutique_argenta, Orientation.face)));
        Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 6, 10,
                new Position(3, 0, 0, Endroits.debut_route3, Orientation.droite)));
        Endroits.quartierArene_argenta.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 10,
                new Position(4, 0, 0, Endroits.debut_route3, Orientation.droite)));
        Endroits.quartierArene_argenta.setSol(Sol.herbe);
        /* Fin quartier arene Argenta */
        /* Fin argenta */
        
        /* Azuria */
        /* quartier arene azuria */
        for (int j = 1 ; j < 7 ; j++) {
            Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 4));
        for (int i = 2 ; i < 4 ; i++) {
            Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 1));
        }
        for (int j = 1 ; j < 7 ; j++) {
            Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        for (int i = 2 ; i < 8 ; i++) {
            Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1 ; j < 8 ; j++) {
            Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 7));
        }
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 1));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 3));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 7));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 9));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 0, 0));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau_arene, 0, 6, "Arene de d'Azuria. Champion Ondine : Le reine des oceans"));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
                new Position(3, 10, 0, Endroits.fin_route4, Orientation.gauche)));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 1,
                new Position(7, 1, 0, Endroits.quartierHabitant_azuria, Orientation.dos)));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 9,
                new Position(7, 9, 0, Endroits.quartierHabitant_azuria, Orientation.dos)));
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 2,
                new Position(0, 2, 0, Endroits.debut_route5, Orientation.face)));
        for (int j = 4 ; j < 7 ; j++) {
            Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, j,
                new Position(0, j, 0, Endroits.debut_route5, Orientation.face)));
        }
        Endroits.quartierArene_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 8,
                new Position(0, 8, 0, Endroits.debut_route5, Orientation.face)));
        /* fin quartier arene azuria */
        /* quartier habitant azuria */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, 0));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 0, j));
        }
        for (int j = 8 ; j < 11 ; j++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 0, j));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 1));
        }
        for (int j = 2 ; j < 8 ; j++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 1));
        for (int j = 2 ; j < 9 ; j++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 1 ; i < 4 ; i++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 4));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 8));
        }
        Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 3, 0, Endroits.debut_route24, Orientation.dos)));
        Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 6,
                new Position(7, 4, 0, Endroits.debut_route24, Orientation.dos)));
        Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 7,
                new Position(7, 6, 0, Endroits.debut_route24, Orientation.dos)));
        Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 1,
                new Position(0, 1, 0, Endroits.quartierArene_azuria, Orientation.face)));
        Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 9,
                new Position(0, 9, 0, Endroits.quartierArene_azuria, Orientation.face)));
        Endroits.quartierHabitant_azuria.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 10,
                new Position(3, 0, 0, Endroits.debut_route9, Orientation.droite)));
        /* fin quartier habitant azuria */
        /* fin azuria */
        
        /* Safrania */
        /* quartier arene Safrania */
        for (int i = 3 ; i < 8 ; i++) {
            Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 3 ; i < 8 ; i++) {
            Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 6 ; j < 11 ; j++) {
                Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.rail, 2, j));
        }
        for (int j = 3 ; j < 11 ; j++) {
            Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.rail, 2, j));
        }
        for (int j = 2 ; j < 5 ; j++) {
            Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, j));
        }
        Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 7, 5));
        Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, 6));
        for (int j = 7 ; j < 9 ; j++) {
            Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, j));
        }
        Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.fin_route5, Orientation.dos)));
        Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 1,
                new Position(0, 1, 0, Endroits.quartierBoutique_safrania, Orientation.face)));
        Endroits.quartierArene_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 9,
                new Position(0, 9, 0, Endroits.quartierBoutique_safrania, Orientation.face)));
        Endroits.quartierArene_safrania.setSol(Sol.bitume);
        /* fin quartier arene Safrania */
        /* quartier boutique Safrania */
        for (int i = 0 ; i < 3 ; i++) {
            Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 4 ; i < 8 ; i++) {
            Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 3 ; i++) {
            Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 4 ; i < 8 ; i++) {
            Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 0, 5));
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, 2));
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, 3));
        for (int j = 4 ; j < 9 ; j++) {
            Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, j));
        }
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 1,
                new Position(7, 1, 0, Endroits.quartierArene_safrania, Orientation.dos)));
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 9,
                new Position(7, 9, 0, Endroits.quartierArene_safrania, Orientation.dos)));
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 1,
                new Position(0, 1, 0, Endroits.quartierHabitant_safrania, Orientation.face)));
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 9,
                new Position(0, 9, 0, Endroits.quartierHabitant_safrania, Orientation.face)));
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.debut_route7, Orientation.gauche)));
        Endroits.quartierBoutique_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.debut_route8, Orientation.droite)));
        Endroits.quartierBoutique_safrania.setSol(Sol.bitume);
        /* fin quartier boutique Safrania */
        /* quartier arene Safrania */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierHabitant_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierHabitant_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.quartierHabitant_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierHabitant_safrania.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.quartierHabitant_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 1,
                new Position(7, 1, 0, Endroits.quartierBoutique_safrania, Orientation.dos)));
        Endroits.quartierHabitant_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 9,
                new Position(7, 9, 0, Endroits.quartierBoutique_safrania, Orientation.dos)));
        Endroits.quartierHabitant_safrania.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.debut_route6, Orientation.face)));
        Endroits.quartierHabitant_safrania.setSol(Sol.bitume);
        /* fin quartier arene Safrania */
        /* Fin Safrania */
        
        /* Carmin sur mer */
        /* quartier habitant Carmin sur mer */
        for (int i = 0 ; i < 6 ; i++) {
            Endroits.quartierHabitant_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 0));
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.quartierHabitant_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 0, j));
        }
        Endroits.quartierHabitant_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 5));
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 6 ; j < 9 ; j++) {
                Endroits.quartierHabitant_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.quartierHabitant_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 6 ; i < 8 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                Endroits.quartierHabitant_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
        Endroits.quartierHabitant_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 4,
                new Position(7, 5, 0, Endroits.fin_route6, Orientation.dos)));
        Endroits.quartierHabitant_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 4,
                new Position(0, 4, 0, Endroits.quartierArene_carmin_sur_mer, Orientation.face)));
        /* fin quartier habitant Carmin sur mer */
        /* quartier arene Carmin sur mer */
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 0));
        }
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 4));
        }
        for (int j = 5 ; j < 8 ; j++) {
            Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 5, j));
        }
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 7));
        }
        for (int i = 5 ; i < 8 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 7, j));
        }
        for (int i = 3 ; i < 7 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
        for (int i = 4 ; i < 6 ; i++) {
            Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 8));
        }
        for (int j = 5 ; j < 9 ; j++) {
            Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 6, j));
        }
        Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 4,
                new Position(7, 4, 0, Endroits.quartierHabitant_carmin_sur_mer, Orientation.dos)));
        Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 1, 10,
                new Position(3, 0, 0, Endroits.debut_route11, Orientation.droite)));
        Endroits.quartierArene_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 5,
                new Position(0, 5, 0, Endroits.port_carmin_sur_mer, Orientation.face)));
        /* fin quartier arene Carmin sur mer */
        /* port Carmin sur mer */
        for (int j = 3 ; j < 6 ; j++) {
            Endroits.port_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 1, j));
        }
        for (int i = 2 ; i < 5 ; i++) {
            Endroits.port_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 3));
        }
		Endroits.port_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.aquaria, 5, 3));
        Endroits.port_carmin_sur_mer.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 5,
                new Position(7, 5, 0, Endroits.quartierArene_carmin_sur_mer, Orientation.dos)));
        /* fin port Carmin sur mer */
        /* Fin Carmin sur mer */
        
        /* Lavanville */
        /* quartier boutique Lavanville */
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, j));
        }
        Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, 0, 2));
        Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 1, 0));
        Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, 1, 1));
        Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, 2, 0));
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 5));
        }
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 7));
        }
        for (int j = 0 ; j < 4 ; j++) {
            Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 5 ; j < 8 ; j++) {
            Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(3, 10, 0, Endroits.fin_route8, Orientation.gauche)));
        for (int j = 3 ; j < 5 ; j++) {
            Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(7, 5, 0, Endroits.fin_route10, Orientation.dos)));
        }
        Endroits.quartierBoutique_lavanville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 4,
                new Position(0, 5, 0, Endroits.debut_route12, Orientation.face)));
        /* fin quartier boutique Lavanville */
        /* Fin Lavanville */
        
        /* Celadopole */
        /* quartier habitant Celadopole */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 8 ; j++) {
            Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        for (int i = 1 ; i < 5 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 7));
        }
        Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, 8));
        for (int i = 5 ; i < 7 ; i++) {
            for (int j = 1 ; j < 10 ; j++) {
                Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, j));
            }
        }
        for (int j = 8 ; j < 11 ; j++) {
            Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, j));
        }
        for (int j = 6 ; j < 8 ; j++) {
            Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, j));
        }
        Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 4, 0, "Batiment"));
        Endroits.quartierHabitant_celadopole.setSol(Sol.herbe);
        Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 5, 10,
                new Position(1, 0, 0, Endroits.debut_route7, Orientation.droite)));
        Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 6, 10,
                new Position(2, 0, 0, Endroits.debut_route7, Orientation.droite)));
        Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 5, 0,
                new Position(5, 10, 0, Endroits.quartierBoutique_celadopole, Orientation.gauche)));
        Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 6, 0,
                new Position(6, 10, 0, Endroits.quartierBoutique_celadopole, Orientation.gauche)));
        Endroits.quartierHabitant_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 5,
                new Position(0, 5, 0, Endroits.quartierCasino_celadopole, Orientation.face)));
        /* fin quartier habitant Celadopole */
        /* quartier boutique Celadopole */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierBoutique_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1 ; i < 8 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                Endroits.quartierBoutique_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 5 ; i < 7 ; i++) {
            for (int j = 1 ; j < 10 ; j++) {
                Endroits.quartierBoutique_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, j));
            }
        }
        Endroits.quartierBoutique_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 5, 10,
                new Position(5, 0, 0, Endroits.quartierHabitant_celadopole, Orientation.droite)));
        Endroits.quartierBoutique_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 6, 10,
                new Position(6, 0, 0, Endroits.quartierHabitant_celadopole, Orientation.droite)));
        for (int j = 1 ; j < 11 ; j++) {
            Endroits.quartierBoutique_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, j,
                new Position(0, j, 0, Endroits.quartierArene_celadopole, Orientation.face)));
        }
        Endroits.quartierBoutique_celadopole.setSol(Sol.herbe);
        /* fin quartier boutique Celadopole */
        /* quartier arene Celadopole */
        Endroits.quartierArene_celadopole.setSol(Sol.herbe);
        for (int i = 2 ; i < 8 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 5 ; j < 11 ; j++) {
            Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 1, j));
        }
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, j,
                new Position(7, j, 0, Endroits.quartierBoutique_celadopole, Orientation.dos)));
        }
        Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 10,
                new Position(2, 0, 0, Endroits.quartierCasino_celadopole, Orientation.droite)));
        Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 1, 10,
                new Position(3, 0, 0, Endroits.quartierCasino_celadopole, Orientation.droite)));
        Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 10,
                new Position(6, 0, 0, Endroits.quartierCasino_celadopole, Orientation.droite)));
        Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 0,
                new Position(5, 10, 0, Endroits.debut_route16, Orientation.gauche)));
        Endroits.quartierArene_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 1, 0,
                new Position(5, 10, 0, Endroits.debut_route16, Orientation.gauche)));
        /* fin quartier arene Celadopole */
        /* quartier casino Celadopole */
        Endroits.quartierCasino_celadopole.setSol(Sol.herbe);
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 9));
        Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, 6));
        Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 1, 1));
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 1 ; j < 8 ; j++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 2, j));
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 3, j));
        }
        for (int j = 1 ; j < 8 ; j++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 4, j));
        }
        for (int j = 0 ; j < 4 ; j++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int j = 5 ; j < 8 ; j++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int i = 0 ; i < 4 ; i++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 8));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
        Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 5,
                new Position(7, 5, 0, Endroits.quartierHabitant_celadopole, Orientation.dos)));
        Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 2, 0,
                new Position(0, 10, 0, Endroits.quartierArene_celadopole, Orientation.gauche)));
        Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 3, 0,
                new Position(1, 10, 0, Endroits.quartierArene_celadopole, Orientation.gauche)));
        Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 4, 0,
                new Position(1, 10, 0, Endroits.quartierArene_celadopole, Orientation.gauche)));
        Endroits.quartierCasino_celadopole.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 0,
                new Position(6, 10, 0, Endroits.quartierArene_celadopole, Orientation.gauche)));
        /* fin quartier casino Celadopole */
        /* Fin Celadopole */
        
        /* Sombreville */
        /* quartier habitant Sombreville */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 10));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 9));
        }
        Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 0));
        for (int i = 3 ; i < 8 ; i++) {
            Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 6 ; j < 9 ; j++) {
            Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 4 ; j < 6 ; j++) {
            Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 3, j));
        }
        for (int j = 4 ; j < 6 ; j++) {
            Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 6, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 1 ; j < 9 ; j++) {
                Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, j));
            }
        }
        for (int i = 4 ; i < 6 ; i++) {
            for (int j = 1 ; j < 9 ; j++) {
                Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, j));
            }
        }
        Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 1, 0,
                new Position(3, 10, 0, Endroits.milieu_route12_5, Orientation.gauche)));
        Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 2, 0,
                new Position(3, 10, 0, Endroits.milieu_route12_5, Orientation.gauche)));
        Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 4,
                new Position(7, 4, 0, Endroits.quartierArene_sombreville, Orientation.dos)));
        Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, 5,
                new Position(7, 5, 0, Endroits.quartierArene_sombreville, Orientation.dos)));
        Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 4,
                new Position(0, 5, 0, Endroits.debut_route13, Orientation.face)));
        Endroits.quartierHabitant_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 5,
                new Position(0, 5, 0, Endroits.debut_route13, Orientation.face)));
        /* fin quartier habitant Sombreville */
        /* quartier arene Sombreville */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 0, j));
        }
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, j));
        }
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 10));
        }
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 9));
        }
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 4 ; i < 7 ; i++) {
            for (int j = 4 ; j < 6 ; j++) {
                Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, i, j));
            }
        }
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 6, j));
        }
        for (int j = 6 ; j < 8 ; j++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 6, j));
        }
        Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 4, 3));
        Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 4, 6));
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, j));
        }
        for (int j = 6 ; j < 9 ; j++) {
            Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.dos_maison, 7, j));
        }
        Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 4,
                new Position(0, 4, 0, Endroits.quartierHabitant_sombreville, Orientation.face)));
        Endroits.quartierArene_sombreville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 5,
                new Position(0, 5, 0, Endroits.quartierHabitant_sombreville, Orientation.face)));
        /* fin quartier arene Sombreville */
        /* Fin Sombreville */
        
        /* Rocheville */
        /* quartier habitant Rocheville */
        Endroits.quartierHabitant_rocheville.setSol(Sol.bitume);
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierHabitant_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierHabitant_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 7, j));
        }
        Endroits.quartierHabitant_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 3, 0,
                new Position(3, 10, 0, Endroits.fin_route15, Orientation.gauche)));
        Endroits.quartierHabitant_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 4, 0,
                new Position(3, 10, 0, Endroits.fin_route15, Orientation.gauche)));
        Endroits.quartierHabitant_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 3, 10,
                new Position(5, 0, 0, Endroits.quartierManoir_rocheville, Orientation.droite)));
        Endroits.quartierHabitant_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 4, 10,
                new Position(5, 0, 0, Endroits.quartierManoir_rocheville, Orientation.droite)));
        /* fin quartier habitant Rocheville */
        /* quartier manoir Rocheville */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 0, j));
        }
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, j));
        }
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 10));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 9));
        }
        for (int i = 1 ; i < 5 ; i++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 2 ; i < 5 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 5));
        }
        for (int i = 2 ; i < 5 ; i++) {
            for (int j = 6 ; j < 9 ; j++) {
                Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int j = 1 ; j < 6 ; j++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bitume, 5, j));
        }
        for (int j = 0 ; j < 9 ; j++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 7, j));
        }
        Endroits.quartierManoir_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 5, 0,
                new Position(3, 10, 0, Endroits.quartierHabitant_rocheville, Orientation.gauche)));
        /* fin quartier manoir Rocheville */
		/* Jardin manoir Rocheville */
        for (int i = 2; i < 6; i++) {
            for (int j = 3; j < 8; j++) {
                Endroits.jardin_manoir_rocheville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.jardin_manoir_rocheville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0,Endroits.entree_manoir_rocheville, Orientation.face)));
		/* Fin jardin manoir Rocheville */
        /* Fin Rocheville */
        
        /* Parmanie */
        /* quartier arene Parmanie */
        Endroits.quartierArene_parmanie.setSol(Sol.herbe);
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 3 ; j < 11 ; j++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 0, j));
        }
        for (int j = 2 ; j < 10 ; j++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        for (int j = 2 ; j < 11 ; j++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 2, j));
        }
        for (int i = 3 ; i < 6 ; i++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, i, 2));
        }
        Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 5, 3));
        Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau_arene, 3, 3, "Arene de Parmanie. Champion Koga : Le maitre des ninja"));
        for (int j = 2 ; j < 10 ; j++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, 4));
        Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, 10));
        for (int j = 5 ; j < 7 ; j++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 5, j));
        }
        for (int i = 6 ; i < 8 ; i++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 5));
        }
        for (int i = 6 ; i < 8 ; i++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 6));
        }
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 5, j));
        }
        Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 10,
                new Position(1, 0, 0, Endroits.quartierHabitant_parmanie, Orientation.droite)));
        Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(4, 0, 0, Endroits.quartierHabitant_parmanie, Orientation.droite)));
        Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 10,
                new Position(6, 0, 0, Endroits.quartierHabitant_parmanie, Orientation.droite)));
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, j,
                new Position(7, j, 0, Endroits.quartierBoutique_parmanie, Orientation.dos)));
        }
        Endroits.quartierArene_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 10,
                new Position(0, 5, 0, Endroits.debut_route19, Orientation.face)));
        /* fin quartier arene Parmanie */
        /* quartier habitant Parmanie */
        Endroits.quartierHabitant_parmanie.setSol(Sol.herbe);
        for (int j = 3 ; j < 10 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 0, j));
        }
        for (int j = 3 ; j < 8 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, j));
        }
        for (int j = 5 ; j < 7 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 2, j));
        }
        Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 2, 0));
        Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, 2, 1));
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 5, j));
        }
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, i, 1));
        }
        for (int j = 4 ; j < 8 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, j));
        }
        for (int i = 2 ; i < 5 ; i++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, i, 4));
        }
        for (int i = 2 ; i < 5 ; i++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, i, 7));
        }
        for (int j = 2 ; j < 10 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 6, j));
        }
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 5 ; j < 11 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 0, j,
                new Position(7, j, 0, Endroits.quartierParcSafari_parmanie, Orientation.dos)));
        }
        Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
                new Position(1, 10, 0, Endroits.quartierArene_parmanie, Orientation.gauche)));
        Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 10, 0, Endroits.quartierArene_parmanie, Orientation.gauche)));
        Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 0,
                new Position(6, 10, 0, Endroits.quartierArene_parmanie, Orientation.gauche)));
        Endroits.quartierHabitant_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 0,
                new Position(0, 5, 0, Endroits.debut_route19, Orientation.face)));
        /* fin quartier habitant Parmanie */
        /* quartier boutique Parmanie */
        Endroits.quartierBoutique_parmanie.setSol(Sol.herbe);
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, 2));
        for (int j = 3 ; j < 5 ; j++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 1, j));
        }
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 2, 3));
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 2, 4, "Pokemon"));
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, 5));
        for (int j = 6 ; j < 8 ; j++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 2, 6));
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 2, 7, "Pokemon"));
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, 8));
        for (int j = 0 ; j < 6 ; j++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 6, j));
        }
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 6, 7, "Pokemon"));
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 7, 3));
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 7, 6));
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 0 ; i < 6 ; i++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int j = 4 ; j < 6 ; j++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 7, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, j));
        }
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, i, 10,
                new Position(i, 0, 0, Endroits.quartierParcSafari_parmanie, Orientation.droite)));
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, j,
                new Position(0, j, 0, Endroits.quartierArene_parmanie, Orientation.face)));
        }
        Endroits.quartierBoutique_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 0,
                new Position(5, 10, 0, Endroits.fin_route18, Orientation.gauche)));
        /* fin quartier boutique Parmanie */
        /* quartier parc safari Parmanie */
        Endroits.quartierParcSafari_parmanie.setSol(Sol.herbe);
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, 2));
        for (int j = 3 ; j < 5 ; j++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 2, 3));
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 2, 4, "Pokemon"));
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, 5));
        for (int j = 6 ; j < 8 ; j++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 2, 6));
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 2, 7, "Pokemon"));
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 1, 8));
        for (int j = 3 ; j < 8 ; j++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 4, j));
        }
        for (int j = 4 ; j < 7 ; j++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        for (int j = 3 ; j < 6 ; j++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 6, j));
        }
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 6, 6, "Pokemon"));
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 5, 3));
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 5, 7));
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 6, 7));
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, 10,
                new Position(3, 0, 0, Endroits.debut_route15, Orientation.droite)));
        Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(14, 7, 0, Endroits.parc_safari1, Orientation.dos)));
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, i, 0,
                new Position(i, 10, 0, Endroits.quartierBoutique_parmanie, Orientation.gauche)));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.quartierParcSafari_parmanie.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.bitume, 7, j,
                new Position(0, j, 0, Endroits.quartierHabitant_parmanie, Orientation.face)));
        }
        /* fin quartier parc safari Parmanie */
        /* Fin Parmanie */
        
        /* Cramois'ile */
        /* quartier arene Cramois'ile */
        Endroits.quartierArene_cramois_ile.setSol(Sol.herbe);
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, i, 0));
        }
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 1));
        }
        for (int j = 1 ; j < 11 ; j++) {
            Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 7, j));
        }
        for (int j = 2 ; j < 11 ; j++) {
            Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 6, j));
        }
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 10));
        }
        Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau_arene, 0, 9, "Arene de Cramois'ile. Champion Auguste : Le maitre du volcan"));
        Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau_pokemon, 2, 3, "Tournoi pokemon feu"));
		Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.fin_route20, Orientation.droite)));
		Endroits.quartierArene_cramois_ile.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 1,
                new Position(7, 5, 0, Endroits.fin_route21, Orientation.droite)));
        /* fin quartier arene Cramois'ile */
        /* Fin Cramois'ile */
        
        /* Ligue pokemon Kanto */
        /* quartier boutique Ligue pokemon Kanto */
        Endroits.quartierBoutique_ligue_pokemon_kanto.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, Endroits.quartierStade_ligue_pokemon_kanto)));
        /* fin quartier boutique Ligue pokemon Kanto */
        /* quartier stade Ligue pokemon Kanto */
        Endroits.quartierStade_ligue_pokemon_kanto.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, Endroits.quartierBoutique_ligue_pokemon_kanto)));
        /* fin quartier stade Ligue pokemon Kanto */
        /* Fin Ligue pokemon Kanto */
		
		
		/* Ile de valencia */
        /* quartier port Ile de valencia */
		Endroits.quartier_port_ile_de_valencia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.debut_route50, Orientation.gauche)));
		Endroits.quartier_port_ile_de_valencia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.quartier_habitant_ile_de_valencia, Orientation.droite)));
        /* fin quartier port Ile de valencia */
        /* quartier habitant Ile de valencia */
		Endroits.quartier_habitant_ile_de_valencia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.quartier_port_ile_de_valencia, Orientation.gauche)));
		Endroits.quartier_habitant_ile_de_valencia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.quartier_labo_ile_de_valencia, Orientation.droite)));
        /* fin quartier habitant Ile de valencia */
        /* quartier labo Ile de valencia */
		Endroits.quartier_labo_ile_de_valencia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.quartier_habitant_ile_de_valencia, Orientation.gauche)));
        /* fin quartier labo Ile de valencia */
        /* Fin Ile de valencia */
        
        
        /* Bourg geon */
        /* Quartier habitant Bourg geon */
        for (int j = 0; j < 11; j++) {
            Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 0; j < 5; j++) {
            Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6; j < 11; j++) {
            Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3; i < 5; i++) {
            for (int j = 2; j < 9; j++) {
                Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, 3));
        Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, 7));
        Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, 8));
        Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, 3));
        Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, 5));
        Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, 7));
        for (int j = 3; j < 9; j++) {
            Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 6, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.mer, i, 10,
                new Position(i, 0, 0, Endroits.debut_route26, Orientation.droite)));
        }
        Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.quartierLabo_bourg_geon, Orientation.dos)));
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartierHabitant_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 0,
                new Position(7, 16, 0, Endroits.debut_route29, Orientation.gauche)));
        }
        /* Fin quartier habitant Bourg geon */
        /* Quartier Labo Bourg geon */
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                Endroits.quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 8 ; j < 11; j++) {
                Endroits.quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 11; j++) {
                Endroits.quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        Endroits.quartierLabo_bourg_geon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.quartierHabitant_bourg_geon, Orientation.face)));
        /* Fin quartier Labo Bourg geon */
        /* Quartier parc Labo */
		for (int j = 0; j < 11; j++) {
            Endroits.quartierParcLaboProfOrm_bourgGeon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1; i < 8; i++) {
            Endroits.quartierParcLaboProfOrm_bourgGeon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 1; i < 8; i++) {
            Endroits.quartierParcLaboProfOrm_bourgGeon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
		for (int j = 1; j < 5; j++) {
            Endroits.quartierParcLaboProfOrm_bourgGeon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int j = 6; j < 10; j++) {
            Endroits.quartierParcLaboProfOrm_bourgGeon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		Endroits.quartierParcLaboProfOrm_bourgGeon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 7, 5,
                new Position(0, 5, 0, Endroits.bas_laboProfOrme_quartierLabo_bourg_geon, Orientation.face)));
        Endroits.quartierParcLaboProfOrm_bourgGeon.setSol(Sol.herbe);
        /* Fin quartier parc Labo */
        /* FIN Bourg geon */
        
        
        /* Ville griotte */
        /* Quartier habitant Ville griotte */
        for (int j = 0; j < 11; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 2; j < 6; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 2));
        Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 4));
        Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 6));
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int j = 6; j < 9; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 0, j));
        }
        for (int j = 7; j < 9; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 1, j));
        }
        for (int j = 6; j < 9; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 6; j < 9; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        for (int i = 2 ; i < 7 ; i++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 6, 6));
        for (int j = 1; j < 5; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, j));
        }
        for (int j = 1; j < 5; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, 2));
        Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, 1));
        for (int j = 7; j < 11; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
        for (int j = 9; j < 11; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int j = 0; j < 2; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
        for (int j = 9; j < 11; j++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 0,
                new Position(i, 10, 0, Endroits.quartierEau_ville_griotte, Orientation.gauche)));
        }
        Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(6, 0, 0, Endroits.fin_route29, Orientation.droite)));
        Endroits.quartierHabitant_ville_griotte.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 1,
                new Position(11, 4, 0, Endroits.debut_route30, Orientation.dos)));
        /* Fin Quartier habitant Ville griotte */
        /* Quartier eau Ville griotte */
        for (int j = 0; j < 11; j++) {
            Endroits.quartierEau_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0; j < 11; j++) {
            Endroits.quartierEau_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, j));
        }
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Endroits.quartierEau_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
        for (int i = 6 ; i < 8 ; i++) {
            Endroits.quartierEau_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 8; j < 10; j++) {
            Endroits.quartierEau_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 6, j));
        }
        for (int j = 8; j < 10; j++) {
            Endroits.quartierEau_ville_griotte.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 7, j));
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.quartierEau_ville_griotte.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 10,
                new Position(i, 0, 0, Endroits.quartierHabitant_ville_griotte, Orientation.droite)));
        }
        /* Fin Quartier eau Ville griotte */
        /* FIN Ville griotte */
		
		/* Mauville */
		/* Quartier habitant Mauville */
		Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 0));
		Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 3));
        for (int j = 0; j < 11; j++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int j = 5; j < 10; j++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 8));
        }
		for (int j = 5; j < 10; j++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
		Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 1));
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
		for (int j = 6; j < 8; j++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 5; j++) {
                Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 3; i < 7; i++) {
            for (int j = 3; j < 5; j++) {
                Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 5; i < 7; i++) {
            for (int j = 1; j < 3; j++) {
                Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 4; i < 6; i++) {
            for (int j = 5; j < 10; j++) {
                Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
		for (int j = 8; j < 10; j++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
		for (int j = 5; j < 7; j++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, j));
        }
		Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
            new Position(5, 0, 0, Endroits.fin_route31, Orientation.droite)));
		for (int j = 1; j < 3; j++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, j,
				new Position(7, 5, 0, Endroits.quartier_tour_chetiflor_mauville, Orientation.dos)));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.quartier_habitant_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, i, 0,
				new Position(4, 10, 0, Endroits.quartier_arene_mauville, Orientation.gauche)));
        }
		/* Fin Quartier habitant Mauville */
		
		/* Quartier tour chetiflor Mauville */
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 11; j++) {
                Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2; i < 8; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 5));
        }
		for (int j = 3; j < 6; j++) {
            Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
		Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 6, 5));
        for (int i = 3; i < 7; i++) {
            for (int j = 6; j < 9; j++) {
                Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 3; i < 5; i++) {
            for (int j = 2; j < 5; j++) {
                Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
		Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 5, 2));
        for (int j = 2; j < 5; j++) {
            Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 6, j));
        }
		for (int j = 2; j < 5; j++) {
            Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int j = 6; j < 9; j++) {
            Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int j = 2; j < 5; j++) {
            Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
		for (int j = 6; j < 9; j++) {
            Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
		Endroits.quartier_tour_chetiflor_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 5,
			new Position(0, 1, 0, Endroits.quartier_habitant_mauville, Orientation.face)));
		/* Fin Quartier tour chetiflor Mauville */
		
		/* Quartier arène Mauville */
		for (int j = 0; j < 8; j++) {
            Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 7));
		for (int j = 7; j < 11; j++) {
            Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 7; j < 11; j++) {
                Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 2; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 5; i < 8; i++) {
            for (int j = 6; j < 11; j++) {
                Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 5; i < 8; i++) {
            for (int j = 2; j < 4; j++) {
                Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 1; j < 7; j++) {
            Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
		for (int j = 2; j < 10; j++) {
            Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        for (int i = 2; i < 4; i++) {
            for (int j = 3; j < 7; j++) {
                Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
		Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, 2));
		Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, 5));
		Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 4));
		Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
			new Position(4, 10, 0, Endroits.fin_route36, Orientation.gauche)));
		Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
			new Position(1, 0, 0, Endroits.quartier_habitant_mauville, Orientation.droite)));
		Endroits.quartier_arene_mauville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 5,
			new Position(0, 12, 0, Endroits.debut_route32, Orientation.face)));
		/* Fin Quartier arène Mauville */
		/* Fin Mauville */
		
		/* Ecorcia */
		/* Quartier puit */
		for (int j = 0; j < 11; j++) {
            Endroits.quartier_puit_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		Endroits.quartier_puit_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 0));
        for (int i = 1; i < 4; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.quartier_puit_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 4; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.quartier_puit_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 11; j++) {
                Endroits.quartier_puit_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 4 ; i < 6 ; i++) {
            Endroits.quartier_puit_ecorcia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, i, 10,
				new Position(i+2, 0, 0, Endroits.debut_route33, Orientation.droite)));
        }
		for (int i = 2 ; i < 4 ; i++) {
            Endroits.quartier_puit_ecorcia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, i, 0,
				new Position(i+1, 10, 0, Endroits.quartier_arene_ecorcia, Orientation.gauche)));
        }
		/* Fin quartier puit */
		/* Quartier arene */
		for (int j = 0; j < 11; j++) {
            Endroits.quartier_arene_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int j = 0; j < 11; j++) {
            Endroits.quartier_arene_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int i = 0 ; i < 3 ; i++) {
            Endroits.quartier_arene_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
		for (int i = 5 ; i < 8 ; i++) {
            Endroits.quartier_arene_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
		for (int i = 0 ; i < 3 ; i++) {
            Endroits.quartier_arene_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
		for (int i = 5 ; i < 8 ; i++) {
            Endroits.quartier_arene_ecorcia.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
		for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartier_arene_ecorcia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, i, 10,
				new Position(i-1, 0, 0, Endroits.quartier_puit_ecorcia, Orientation.droite)));
        }
		for (int i = 3 ; i < 5 ; i++) {
            Endroits.quartier_arene_ecorcia.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, i, 0,
				new Position(i+13, 5, 0, Endroits.bois_aux_chene2, Orientation.gauche)));
        }
		/* Fin quartier arene */
		/* Fin Ecorcia */
        
        /* Doublonville */
        /* quartier arene Doublonville */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 7, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 7, j));
        }
        Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 2, 0, Endroits.debut_route35, Orientation.dos)));
        Endroits.quartierArene_doublonville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, Endroits.quartierBoutique_doublonville)));
        Endroits.quartierArene_doublonville.setSol(Sol.bitume);
        /* fin quartier arene Doublonville */
        /* quartier boutique Doublonville */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierBoutique_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.quartierBoutique_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartierBoutique_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        Endroits.quartierBoutique_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, 4));
        Endroits.quartierBoutique_doublonville.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, 6));
        Endroits.quartierBoutique_doublonville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, Endroits.quartierArene_doublonville)));
        Endroits.quartierBoutique_doublonville.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 1, Endroits.debut_route34)));
        Endroits.quartierBoutique_doublonville.setSol(Sol.bitume);
        /* fin quartier boutique Doublonville */
        /* Fin Doublonville */
        
        
        /* Bourg en vol */
        /* Quartier habitant Bourg en vol */
        for (int j = 0; j < 5; j++) {
            Endroits.quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 6; j < 11; j++) {
            Endroits.quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 0; j < 5; j++) {
            Endroits.quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6; j < 11; j++) {
            Endroits.quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        
        Endroits.quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 5,
                new Position(0, 5, 0, Endroits.quartier_labo_bourg_en_vol, Orientation.face)));
        Endroits.quartier_habitant_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 5,
                new Position(9, 5, 0, Endroits.debut_route101, Orientation.dos)));
        /* Fin quartier habitant Bourg en vol */
        /* Quartier Labo Bourg en vol */
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                Endroits.quartier_labo_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 11; j++) {
                Endroits.quartier_labo_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2; i < 7; i++) {
            for (int j = 0 ; j < 2; j++) {
                Endroits.quartier_labo_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2; i < 6; i++) {
            for (int j = 3 ; j < 5; j++) {
                Endroits.quartier_labo_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 4; i < 6; i++) {
            for (int j = 5 ; j < 9; j++) {
                Endroits.quartier_labo_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.quartier_labo_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 0; j < 11; j++) {
            Endroits.quartier_labo_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.quartier_labo_bourg_en_vol.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.quartier_habitant_bourg_en_vol, Orientation.face)));
        /* Fin quartier Labo Bourg en vol */
        /* FIN Bourg en vol */
        
        /* Rosyeres */
        /* Quartier habitant Rosyeres */
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 6 ; i < 10 ; i++) {
            Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 4 ; i++) {
            Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 9));
        }
        for (int i = 6 ; i < 10 ; i++) {
            Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 9));
        }
        for (int i = 8 ; i < 10 ; i++) {
            Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 1));
        }
        for (int j = 1; j < 4; j++) {
            Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6; j < 9; j++) {
            Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 1));
        Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 8));
        Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, 8));
        Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 9, 4,
                new Position(0, 4, 0, Endroits.debut_route101, Orientation.face)));
        Endroits.quartier_habitant_rosyeres.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(5, 11, 0, Endroits.debut_route102, Orientation.gauche)));
        /* Fin Quartier habitant Rosyeres */
        /* Fin Rosyeres */
        
        
        /* Bonaugure */
        /* Quartier habitant Bonaugure */
        for (int j = 0; j < 4; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
        for (int j = 4; j < 7; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 6, j));
        }
        for (int j = 7; j < 11; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
        for (int j = 0; j < 11; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 6; j < 11; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0; j < 5; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        for (int j = 3; j < 5; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
        for (int j = 6; j < 8; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
        for (int j = 3; j < 5; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        for (int j = 6; j < 8; j++) {
            Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        Endroits.quartier_habitant_bonaugure.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(11, 7, 0, Endroits.milieu_route201_1, Orientation.dos)));
        /* Fin quartier habitant Bonaugure */
        /* FIN Bonaugure */
        
        /* Littorella */
        /* Quartier habitant */
        Endroits.quartier_habitant_littorella.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 0,
                new Position(2, 11, 0, Endroits.fin_route201, Orientation.gauche)));
        Endroits.quartier_habitant_littorella.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 10,
                new Position(4, 0, 0, Endroits.quartier_labo_littorella, Orientation.gauche)));
        /* Fin quartier habitant */
        /* Quartier Labo */
        Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(3, 10, 0, Endroits.quartier_habitant_littorella, Orientation.gauche)));
        for (int j = 1; j < 8; j++) {
            Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 8 ; j < 11; j++) {
                Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, 0));
        Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 0));
        Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, 0));
        Endroits.quartier_labo_littorella.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, 7));
        Endroits.quartier_labo_littorella.setSol(Sol.herbe);
        /* Fin quartier Labo */
        /* FIN littorella */
    }

    private void modificationQuartierRoute() {
        /* Route 1 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1; j < 5; j++) {
            Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 6; j < 10; j++) {
            Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6; j < 10; j++) {
            Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 4));
        }
        for (int j = 1; j < 4; j++) {
            Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 0, j));
        }
        for (int j = 1; j < 4; j++) {
            Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 4, j));
        }
        Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitCoffre (Type_objet.coffre, 1, 2, "", new Objet_medicament(Objets.potion)));
        Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitObservable(Type_objet.panneau, 5, 3, "Route 1"));
        for (int i = 1; i < 7; i++) {
            for (int j = 5; j < 10; j++) {
                Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route1, Orientation.dos)));
        Endroits.debut_route1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, Endroits.quartierDresseur_bourgPalette)));
        Endroits.debut_route1.setSol(Sol.herbe);
        /*Fin debut route 1*/
        /* milieu route 1 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1; j < 8; j++) {
            Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 0, j));
        }
        for (int j = 1; j < 4; j++) {
            Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 7, j));
        }
		Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 4));
        for (int j = 6; j < 11; j++) {
            Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 5; j++) {
                Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 8,
                new Position(7, 8, 0, Endroits.fin_route1, Orientation.dos)));
        Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 9,
                new Position(7, 9, 0, Endroits.fin_route1, Orientation.dos)));
        Endroits.milieu_route1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, Endroits.debut_route1)));
        Endroits.milieu_route1.setSol(Sol.herbe);
        /* Fin milieu route 1*/
        /* fin route 1 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1; j < 8; j++) {
            Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 7, j));
        }
        for (int j = 1; j < 5; j++) {
            Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 0, j));
        }
        for (int j = 6; j < 11; j++) {
            Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 0, j));
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 3; j < 8; j++) {
                Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.quartierBoutique_jadielle, Orientation.dos)));
        Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 8,
                new Position(0, 8, Endroits.milieu_route1)));
        Endroits.fin_route1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 9,
                new Position(0, 9, Endroits.milieu_route1)));
        Endroits.fin_route1.setSol(Sol.herbe);
        /* Fin Route 1 */
        
        /* Route 2 */
        /* debut route 2 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 4 ; i++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
		Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbuste, 4, 6));
        for (int i = 5 ; i < 8 ; i++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 3 ; j < 7 ; j++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 6 ; i < 8 ; i++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 1));
        }
        for (int i = 2 ; i < 7 ; i++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 4));
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, j));
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 5));
        Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 4,
                new Position(0, 5, 0, Endroits.quartierArene_jadielle, Orientation.face)));
        Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 1,
                new Position(7, 1, 0, Endroits.milieu_route2, Orientation.dos)));
        Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 2,
                new Position(7, 2, 0, Endroits.milieu_route2, Orientation.dos)));
        Endroits.debut_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 8,
                new Position(7, 8, 0, Endroits.milieu_route2, Orientation.dos)));
        Endroits.debut_route2.setSol(Sol.herbe);
        /* fin debut route 2 */
        /* milieu route 2 */
		Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 1));
        for (int j = 3 ; j < 6 ; j++) {
            Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 3 ; j < 6 ; j++) {
            Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 2 ; i < 5; i++) {
            for (int j = 2; j < 5; j++) {
                Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 1 ; i < 7 ; i++) {
            Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 1));
        }
        Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, 2));
        Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 1,
                new Position(0, 1, 0, Endroits.debut_route2, Orientation.face)));
        Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 2,
                new Position(0, 2, 0, Endroits.debut_route2, Orientation.face)));
        Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 2,
                new Position(7, 7, 0, Endroits.foretDeJade1, Orientation.dos)));
        Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 8,
                new Position(7, 8, 0, Endroits.fin_route2, Orientation.dos)));
        Endroits.milieu_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 8,
                new Position(0, 8, 0, Endroits.debut_route2, Orientation.face)));
        Endroits.milieu_route2.setSol(Sol.herbe);
        /* fin milieu route 2 */
        /* fin route 2 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 2 ; j < 6 ; j++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 1 ; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 5 ; i < 7 ; i++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 1));
        }
        for (int j = 2 ; j < 6 ; j++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        for (int i = 1 ; i < 5 ; i++) {
            Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 1,
                new Position(0, 1, 0, Endroits.foretDeJade4, Orientation.face)));
        Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 8,
                new Position(0, 8, 0, Endroits.milieu_route2, Orientation.face)));
        Endroits.fin_route2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.quartierBoutique_argenta, Orientation.dos)));
        Endroits.fin_route2.setSol(Sol.herbe);
        /* fin fin route 2 */
        /* Fin route 2 */
        
        /* Route 3*/
        /* debut route 3*/
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 5 ; i < 7 ; i++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 5));
        }
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 6));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 6, j));
        }
        Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(6, 10, 0, Endroits.quartierArene_argenta, Orientation.gauche)));
        Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 0,
                new Position(7, 10, 0, Endroits.quartierArene_argenta, Orientation.gauche)));
        Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 10,
                new Position(1, 0, 0, Endroits.milieu_route3_1, Orientation.droite)));
        Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 10,
                new Position(2, 0, 0, Endroits.milieu_route3_1, Orientation.droite)));
        Endroits.debut_route3.ajouterObjetEndroit(new ObjetEndroitCoffre (Type_objet.coffre, 4, 9, "", Objets.potion));
        /* fin debut route 3*/
        /* milieu route 3 1*/
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, 1, 4));
        Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, 1, 5));
        for (int j = 4 ; j < 6 ; j++) {
            Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 2, j));
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        for (int i = 4 ; i < 7 ; i++) {
            for (int j = 1 ; j < 9; j++) {
                Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
                new Position(1, 10, 0, Endroits.debut_route3, Orientation.gauche)));
        Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 0,
                new Position(2, 10, 0, Endroits.debut_route3, Orientation.gauche)));
        Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 10,
                new Position(1, 0, 0, Endroits.milieu_route3_2, Orientation.droite)));
        Endroits.milieu_route3_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 10,
                new Position(2, 0, 0, Endroits.milieu_route3_2, Orientation.droite)));
        /* fin milieu route 3 1*/
        /* milieu route 3 2*/
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 5));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 6));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 7));
        }
        for (int j = 5 ; j < 8 ; j++) {
            Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 2, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 1 ; j < 5; j++) {
                Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 4 ; i < 7 ; i++) {
            for (int j = 6 ; j < 10; j++) {
                Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
                new Position(1, 10, 0, Endroits.milieu_route3_1, Orientation.gauche)));
        Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 0,
                new Position(2, 10, 0, Endroits.milieu_route3_1, Orientation.gauche)));
        Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 8,
                new Position(7, 4, 0, Endroits.fin_route3, Orientation.dos)));
        Endroits.milieu_route3_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 9,
                new Position(7, 5, 0, Endroits.fin_route3, Orientation.dos)));
        /* fin milieu route 3 2*/
        /* Fin route 3 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, j));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, j));
        }
        for (int j = 6 ; j < 9 ; j++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, j));
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 1, 10));
        Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 6, 10));
        Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, 6, 9));
        for (int j = 9 ; j < 11 ; j++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 7, j));
        }
        for (int j = 6 ; j < 9 ; j++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 6, 0));
        Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, 6, 1));
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 7, j));
        }
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 4,
                new Position(0, 8, 0, Endroits.milieu_route3_2, Orientation.face)));
        Endroits.fin_route3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 9, 0, Endroits.milieu_route3_2, Orientation.face)));
        Endroits.fin_route3.setSol(Sol.terre);
        /* Fin Fin route 3 */
        /* Fin route 3 */
        
        /* route 4 */
        /* debut route 4 */
        for (int j = 1 ; j < 11 ; j++) {
            Endroits.debut_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 1 ; j < 11 ; j++) {
            Endroits.debut_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        Endroits.debut_route4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(4, 0, 0, Endroits.milieu_route4, Orientation.droite)));
        /* Fin debut route 4 */
        /* milieu route 4 */
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 5 ; i < 7 ; i++) {
            Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 9));
        }
        for (int i = 2 ; i < 4 ; i++) {
            Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 9));
        }
        Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 10, 0, Endroits.debut_route4, Orientation.gauche)));
        Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 1, 10,
                new Position(2, 0, 0, Endroits.fin_route4, Orientation.droite)));
        Endroits.milieu_route4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 10,
                new Position(2, 0, 0, Endroits.fin_route4, Orientation.droite)));
        /* Fin milieu route 4 */
        /* fin route 4 */ 
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int j = 7 ; j < 11 ; j++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 1, j));
        }
		for (int j = 1 ; j < 7 ; j++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, j));
        }
		for (int j = 6 ; j < 10 ; j++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
		Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 6));
		for (int j = 7 ; j < 11 ; j++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
		for (int i = 4 ; i < 7 ; i++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 3 ; i < 7 ; i++) {
            for (int j = 1 ; j < 6; j++) {
                Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 0 ; j < 8 ; j++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 9 ; j < 11 ; j++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 0,
                new Position(2, 10, 0, Endroits.milieu_route4, Orientation.gauche)));
        Endroits.fin_route4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(1, 0, 0, Endroits.quartierArene_azuria, Orientation.droite)));
        /* Fin fin route 4 */
        /* Fin route 4 */
        /* Route 5 */
        /* debut Route 5 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 3));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 7));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 1 ; j < 3 ; j++) {
                Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 8 ; j < 10 ; j++) {
                Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 2 ; i < 4 ; i++) {
            for (int j = 4 ; j < 7 ; j++) {
                Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 4 ; j < 7 ; j++) {
           Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 6, j), Environnement.haute_herbe);
        }
        Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 1,
                new Position(7, 2, 0, Endroits.quartierArene_azuria, Orientation.dos)));
        Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 2,
                new Position(7, 2, 0, Endroits.quartierArene_azuria, Orientation.dos)));
        for (int j = 4 ; j < 7 ; j++) {
            Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(7, j, 0, Endroits.quartierArene_azuria, Orientation.dos)));
        }
        Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 8,
                new Position(7, 8, 0, Endroits.quartierArene_azuria, Orientation.dos)));
        Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 9,
                new Position(7, 8, 0, Endroits.quartierArene_azuria, Orientation.dos)));
        Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 1,
                new Position(0, 1, 0, Endroits.fin_route5, Orientation.face)));
        Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 2,
                new Position(0, 2, 0, Endroits.fin_route5, Orientation.face)));
        for (int j = 4 ; j < 7 ; j++) {
            Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 7, j,
                new Position(0, j, 0, Endroits.fin_route5, Orientation.face)));
        }
        Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 8,
                new Position(0, 8, 0, Endroits.fin_route5, Orientation.face)));
        Endroits.debut_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 9,
                new Position(0, 9, 0, Endroits.fin_route5, Orientation.face)));
        /* Fin debut Route 5 */
        /* fin Route 5 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 3));
        }
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 7));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 1 ; i < 5 ; i++) {
            for (int j = 1 ; j < 3 ; j++) {
                Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1 ; i < 5 ; i++) {
            for (int j = 8 ; j < 10 ; j++) {
                Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 4 ; j < 7 ; j++) {
                Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int j = 3 ; j < 8 ; j++) {
            Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 5, j));
        }
		for (int j = 1 ; j < 5 ; j++) {
            Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int j = 6 ; j < 10 ; j++) {
            Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 1,
                new Position(7, 1, 0, Endroits.debut_route5, Orientation.dos)));
        Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 2,
                new Position(7, 2, 0, Endroits.debut_route5, Orientation.dos)));
        for (int j = 4 ; j < 7 ; j++) {
            Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(7, j, 0, Endroits.debut_route5, Orientation.dos)));
        }
        Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 8,
                new Position(7, 8, 0, Endroits.debut_route5, Orientation.dos)));
        Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 9,
                new Position(7, 9, 0, Endroits.debut_route5, Orientation.dos)));
        Endroits.fin_route5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.quartierArene_safrania, Orientation.face)));
        /* Fin fin Route 5 */
        /* Fin Route 5 */
        /* Route 6 */
        /* debut Route 6 */
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, j));
        }
        for (int i = 3 ; i < 7 ; i++) {
            for (int j = 1 ; j < 3 ; j++) {
                Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 3 ; i < 6 ; i++) {
            for (int j = 4 ; j < 10 ; j++) {
                Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 3 ; i < 6 ; i++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 3));
        }
        for (int j = 3 ; j < 9 ; j++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 6, j));
        }
        Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 6, 9), Environnement.haute_herbe);
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 7, j,
                new Position(0, j, 0, Endroits.fin_route6, Orientation.face)), Environnement.haute_herbe);
        }
        for (int j = 3 ; j < 9 ; j++) {
            Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, j,
                new Position(0, j, 0, Endroits.fin_route6, Orientation.face)));
        }
        Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 7, 9,
            new Position(0, 9, 0, Endroits.fin_route6, Orientation.face)), Environnement.haute_herbe);
        Endroits.debut_route6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.quartierHabitant_safrania, Orientation.dos)));
        /* Fin debut Route 6 */
        /* fin Route 6 */
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 1 ; j < 7 ; j++) {
                Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 7), Environnement.haute_herbe);
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 8));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 9));
        }
        for (int j = 5 ; j < 9 ; j++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        for (int i = 4 ; i < 6 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 1 ; j < 8 ; j++) {
            Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, j,
                new Position(7, j, 0, Endroits.debut_route6, Orientation.dos)), Environnement.haute_herbe);
        }
        Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 8,
                new Position(7, 8, 0, Endroits.debut_route6, Orientation.dos)));
        Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, 9,
                new Position(7, 9, 0, Endroits.debut_route6, Orientation.dos)), Environnement.haute_herbe);
        Endroits.fin_route6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 4, 0, Endroits.quartierHabitant_carmin_sur_mer, Orientation.face)));
        /* Fin fin Route 6 */
        /* Fin Route 6 */
        /* Route 7 */
        /* debut Route 7 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.debut_route7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.debut_route7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 6 ; j < 9 ; j++) {
                Endroits.debut_route7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.debut_route7.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.quartierBoutique_safrania, Orientation.droite)));
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route7.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, i, 0,
                new Position(i+4, 10, 0, Endroits.quartierHabitant_celadopole, Orientation.gauche)));
        }
        /* Fin debut Route 7 */
        /* fin Route 7 */
        /* Route 8 */
        /* debut Route 8 */
        for (int j = 2 ; j < 11 ; j++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, j));
        }
        Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 1, 0));
        Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, 1));
        Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 2, 0));
        for (int j = 2 ; j < 11 ; j++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 4, j));
        }
        for (int i = 5 ; i < 8 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, 3));
        for (int j = 3 ; j < 6 ; j++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 4));
        }
        for (int i = 1 ; i < 4 ; i++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        for (int i = 2 ; i < 5 ; i++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 5));
        }
        Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 5, 5));
        Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, 1));
        for (int i = 2 ; i < 7 ; i++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 2));
        }
        for (int j = 3 ; j < 8 ; j++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 6, j));
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 7));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 2, j));
        }
        for (int j = 8 ; j < 11 ; j++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 3, j));
        }
        for (int i = 5 ; i < 7 ; i++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 8));
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 9), Environnement.haute_herbe);
        }
        Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.quartierBoutique_safrania, Orientation.gauche)));
        Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 10,
                new Position(2, 0, 0, Endroits.fin_route8, Orientation.droite)));
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.debut_route8.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, i, 10,
                new Position(i, 0, 0, Endroits.fin_route8, Orientation.droite)), Environnement.haute_herbe);
        }
        /* Fin debut Route 8 */
        /* fin Route 8 */
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 10));
        }
        Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 2, 10));
        Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 4, 10));
        Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 5, 10));
        for (int i = 6 ; i < 8 ; i++) {
            Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 10));
        }
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 6 ; j < 10 ; j++) {
                Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3 ; i < 5 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0 ; j < 3 ; j++) {
            Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 3, j));
        }
        for (int i = 4 ; i < 7 ; i++) {
            for (int j = 1 ; j < 3 ; j++) {
                Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 0,
                new Position(2, 10, 0, Endroits.debut_route8, Orientation.gauche)));
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, i, 0,
                new Position(i, 10, 0, Endroits.debut_route8, Orientation.gauche)), Environnement.haute_herbe);
        }
        Endroits.fin_route8.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.quartierBoutique_lavanville, Orientation.droite)));
        /* Fin fin Route 8 */
        /* Fin Route 8 */
        /* Route 9 */
        /* debut Route 9 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 4 ; j < 11 ; j++) {
            Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 5 ; i < 7 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 3 ; j < 7 ; j++) {
                Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 2 ; j < 6 ; j++) {
            Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 3, j));
        }
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 5, j));
        }
        for (int i = 6 ; i < 8 ; i++) {
            for (int j = 2 ; j < 4 ; j++) {
                Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
		for (int i = 5 ; i < 7 ; i++) {
            Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int i = 2 ; i < 4 ; i++) {
            for (int j = 7 ; j < 11 ; j++) {
                Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(7, 10, 0, Endroits.quartierHabitant_azuria, Orientation.gauche)));
        Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(7, 10, 0, Endroits.quartierHabitant_azuria, Orientation.gauche)));
        Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(5, 0, 0, Endroits.milieu_route9, Orientation.droite)));
        Endroits.debut_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 10,
                new Position(1, 0, 0, Endroits.milieu_route9, Orientation.droite)));
        /* Fin debut Route 9 */
        /* milieu Route 9 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
		for (int i = 2 ; i < 5 ; i++) {
            Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 2, j));
        }
        for (int i = 5 ; i < 7 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 4 ; j < 7 ; j++) {
                Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 7 ; j < 10 ; j++) {
                Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 1 ; i < 4 ; i++) {
            Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
                new Position(1, 10, 0, Endroits.debut_route9, Orientation.gauche)));
        Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(4, 10, 0, Endroits.debut_route9, Orientation.gauche)));
        Endroits.milieu_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 10,
                new Position(5, 0, 0, Endroits.fin_route9, Orientation.droite)));
        /* Fin milieu Route 9 */
        /* fin Route 9 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
		for (int i = 1 ; i < 4 ; i++) {
            Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 4 ; i < 6 ; i++) {
            for (int j = 4 ; j < 6 ; j++) {
                Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 2 ; i < 4 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 3, j));
        }
		for (int i = 1 ; i < 4 ; i++) {
            Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int i = 5 ; i < 7 ; i++) {
            Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(5, 10, 0, Endroits.milieu_route9, Orientation.gauche)));
        Endroits.fin_route9.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(5, 0, 0, Endroits.debut_route10, Orientation.droite)));
        /* Fin fin Route 9 */
        /* Fin Route 9 */
        /* Route 10 */
        /* debut Route 10 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 5 ; i++) {
            Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int j = 1 ; j < 10 ; j++) {
            Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 1, j));
        }
		for (int i = 2 ; i < 8 ; i++) {
            Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, 9));
        }
		Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, 6, 0));
		for (int j = 0 ; j < 6 ; j++) {
            Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 3 ; i < 5 ; i++) {
            for (int j = 3 ; j < 8 ; j++) {
                Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 7, 8));
        Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(4, 10, 0, Endroits.fin_route9, Orientation.gauche)));
        Endroits.debut_route10.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 6,
                new Position(0, 6, 0, Endroits.milieu_route10, Orientation.face)));
        /* Fin debut Route 10 */
        /* milieu Route 10 */
		for (int j = 0 ; j < 6 ; j++) {
            Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, j));
        }
		for (int j = 1 ; j < 4 ; j++) {
            Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, j));
        }
		for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 2 ; i < 5 ; i++) {
            Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
		for (int i = 0 ; i < 7 ; i++) {
            Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, i, 8));
        }
		for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, 9));
        }
		for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int j = 0 ; j < 9 ; j++) {
            Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.barriere, 7, j));
        }
        Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 6,
                new Position(7, 6, 0, Endroits.debut_route10, Orientation.dos)));
        Endroits.milieu_route10.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 9,
                new Position(0, 9, 0, Endroits.centrale_route10, Orientation.face)));
        /* Fin milieu Route 10 */
        /* centrale Route 10 */
        for (int j = 0 ; j < 7 ; j++) {
            Endroits.centrale_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.centrale_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
		for (int i = 1 ; i < 7 ; i++) {
            Endroits.centrale_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        Endroits.centrale_route10.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 9,
                new Position(7, 9, 0, Endroits.milieu_route10, Orientation.dos)));
        /* Fin centrale Route 10 */
        /* fin Route 10 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int i = 1 ; i < 7 ; i++) {
            Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 7 ; i++) {
            Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 7 ; j < 11 ; j++) {
            Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 3 ; i < 5 ; i++) {
            for (int j = 3 ; j < 8 ; j++) {
                Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 4, j));
        }
        Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 3, 0, Endroits.quartierBoutique_lavanville, Orientation.face)));
        Endroits.fin_route10.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 6,
                new Position(0, 4, 0, Endroits.quartierBoutique_lavanville, Orientation.face)));
        /* Fin fin Route 10 */
        /* Fin Route 10 */
        /* Route 11 */
        /* debut Route 11 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 0 ; j < 6 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, j));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        for (int j = 3 ; j < 6 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        for (int j = 0 ; j < 6 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 4, j));
        }
        for (int i = 5 ; i < 8 ; i++) {
            for (int j = 0 ; j < 6 ; j++) {
                Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 5 ; j < 8 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
        for (int i = 1 ; i < 5 ; i++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 8));
        }
        for (int i = 2 ; i < 4 ; i++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 9), Environnement.haute_herbe);
        }
        Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, 9));
        Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 4, 9));
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 5, j), Environnement.haute_herbe);
        }
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 6, j));
        }
        Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(1, 10, Endroits.quartierArene_carmin_sur_mer)));
        Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 10,
                new Position(1, 0, 0, Endroits.milieu_route11, Orientation.droite)));
        for (int i = 2 ; i < 4 ; i++) {
            Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, i, 10,
                new Position(i, 0, 0, Endroits.milieu_route11, Orientation.droite)), Environnement.haute_herbe);
        }
        Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(4, 0, 0, Endroits.milieu_route11, Orientation.droite)));
        Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 5, 10,
                new Position(5, 0, 0, Endroits.milieu_route11, Orientation.droite)));
        Endroits.debut_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 10,
                new Position(6, 0, 0, Endroits.milieu_route11, Orientation.droite)));
        /* Fin debut Route 11 */
        /* milieu Route 11 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 2, j), Environnement.haute_herbe);
        }
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 2, 9), Environnement.haute_herbe);

        for (int j = 1 ; j < 3 ; j++) {
            Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 4, j), Environnement.haute_herbe);
        }
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 4, 9), Environnement.haute_herbe);
        for (int j = 1 ; j < 6 ; j++) {
            Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 5, j), Environnement.haute_herbe);
        }
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 6, 9), Environnement.haute_herbe);
        for (int i = 1 ; i < 4 ; i++) {
            for (int j = 5 ; j < 7 ; j++) {
                Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
                new Position(1, 10, 0, Endroits.debut_route11, Orientation.gauche)));
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 2, 0,
                new Position(2, 10, 0, Endroits.debut_route11, Orientation.gauche)), Environnement.haute_herbe);
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.debut_route11, Orientation.gauche)), Environnement.haute_herbe);
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 10, 0, Endroits.debut_route11, Orientation.gauche)));
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 5, 0,
                new Position(5, 10, 0, Endroits.debut_route11, Orientation.gauche)));
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 0,
                new Position(6, 10, 0, Endroits.debut_route11, Orientation.gauche)));
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 10,
                new Position(1, 0, 0, Endroits.fin_route11, Orientation.droite)));
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 2, 10,
                new Position(2, 0, 0, Endroits.fin_route11, Orientation.droite)), Environnement.haute_herbe);
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.fin_route11, Orientation.droite)), Environnement.haute_herbe);
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 4, 10,
                new Position(4, 0, 0, Endroits.fin_route11, Orientation.droite)));
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 10,
                new Position(5, 0, 0, Endroits.fin_route11, Orientation.droite)));
        Endroits.milieu_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 6, 10,
                new Position(6, 0, 0, Endroits.fin_route11, Orientation.droite)));
        Endroits.milieu_route11.setSol(Sol.terre);
        /* Fin milieu Route 11 */
        /* fin Route 11 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
                new Position(1, 10, 0, Endroits.milieu_route11, Orientation.gauche)));
        Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 2, 0,
                new Position(2, 10, 0, Endroits.milieu_route11, Orientation.gauche)), Environnement.haute_herbe);
        Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route11, Orientation.gauche)), Environnement.haute_herbe);
        Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 4, 0,
                new Position(4, 10, 0, Endroits.milieu_route11, Orientation.gauche)));
        Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(5, 10, 0, Endroits.milieu_route11, Orientation.gauche)));
        Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 6, 0,
                new Position(6, 10, 0, Endroits.milieu_route11, Orientation.gauche)));
        Endroits.fin_route11.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 10,
                new Position(7, 0, 0, Endroits.milieu_route12_2, Orientation.droite)));
        /* Fin fin Route 11 */
        /* Fin Route 11 */
        /* Route 12 */
        /* debut Route 12 */
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 5));
        }
        for (int j = 2 ; j < 7 ; j++) {
            Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 3, j));
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 2));
        }
		for (int i = 4 ; i < 7 ; i++) {
            for (int j = 5 ; j < 7 ; j++) {
                Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 1 ; i < 8 ; i++) {
            for (int j = 7 ; j < 11 ; j++) {
                Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 6), Environnement.canne);
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 1 ; j < 5 ; j++) {
                Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 4 ; i < 8 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
        for (int i = 3 ; i < 8 ; i++) {
            Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 1), Environnement.canne);
        }
		Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 7, 2), Environnement.canne);
        Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 4, 0, Endroits.quartierBoutique_lavanville, Orientation.dos)));
        Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route12_1, Orientation.face)));
        Endroits.debut_route12.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 6,
                new Position(0, 6, 0, Endroits.milieu_route12_1, Orientation.face)));
        /* Fin debut Route 12 */
        /* milieu Route 12 1 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 5 ; j < 8 ; j++) {
                Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 1 ; i < 7 ; i++) {
            for (int j = 8 ; j < 10 ; j++) {
                Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 5 ; i < 7 ; i++) {
            for (int j = 2 ; j < 8 ; j++) {
                Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 1));
        }
		for (int i = 0 ; i < 3 ; i++) {
            for (int j = 1 ; j < 5 ; j++) {
                Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 3 ; i < 5 ; i++) {
            for (int j = 2 ; j < 8 ; j++) {
                Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
        for (int j = 7 ; j < 11 ; j++) {
            Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 0, j), Environnement.canne);
        }
        for (int j = 2 ; j < 11 ; j++) {
            Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 7, j), Environnement.canne);
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 10), Environnement.canne);
        }
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 10), Environnement.canne);
        }
        Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 5,
                new Position(7, 5, 0, Endroits.debut_route12, Orientation.dos)));
        Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 6,
                new Position(7, 6, 0, Endroits.debut_route12, Orientation.dos)));
        Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route12_3, Orientation.droite)));
        Endroits.milieu_route12_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 1,
                new Position(0, 1, 0, Endroits.milieu_route12_2, Orientation.face)));
        /* Fin milieu Route 12 1 */
        /* milieu Route 12 2 */
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 1 ; i < 4 ; i++) {
            Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 1));
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 2 ; j < 7 ; j++) {
                Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 7 ; j < 9 ; j++) {
                Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 4 ; i < 6 ; i++) {
            for (int j = 5 ; j < 7 ; j++) {
                Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
        Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 6, 5));
		for (int i = 0 ; i < 8 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 4 ; i < 7 ; i++) {
            for (int j = 1 ; j < 5 ; j++) {
                Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 6 ; i < 8 ; i++) {
            for (int j = 6 ; j < 9 ; j++) {
                Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
        for (int j = 2 ; j < 9 ; j++) {
            Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 0, j), Environnement.canne);
        }
        for (int j = 2 ; j < 7 ; j++) {
            Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 3, j), Environnement.canne);
        }
        Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 1,
                new Position(7, 1, 0, Endroits.milieu_route12_1, Orientation.dos)));
        Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route12_6, Orientation.face)));
        Endroits.milieu_route12_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 0,
                new Position(5, 10, 0, Endroits.fin_route11, Orientation.gauche)));
        /* Fin milieu Route 12 2 */
        /* milieu Route 12 3 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route12_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route12_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.milieu_route12_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route12_1, Orientation.gauche)));
        Endroits.milieu_route12_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route12_4, Orientation.droite)));
        /* Fin milieu Route 12 3 */
        /* milieu Route 12 4 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route12_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route12_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.milieu_route12_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route12_3, Orientation.gauche)));
        Endroits.milieu_route12_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route12_5, Orientation.droite)));
        /* Fin milieu Route 12 4 */
        /* milieu Route 12 5 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route12_5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route12_5.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.milieu_route12_5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route12_4, Orientation.gauche)));
        Endroits.milieu_route12_5.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(1, 0, 0, Endroits.quartierHabitant_sombreville, Orientation.droite)));
        /* Fin milieu Route 12 5 */
        /* milieu Route 12 6 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
		Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 1, 5));
		for (int i = 2 ; i < 4 ; i++) {
            for (int j = 5 ; j < 7 ; j++) {
                Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 2 ; i < 5 ; i++) {
            for (int j = 7 ; j < 9 ; j++) {
                Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 5 ; i < 7 ; i++) {
            for (int j = 2 ; j < 9 ; j++) {
                Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.herbe, i, j));
            }
        }
        for (int i = 5 ; i < 7 ; i++) {
            Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 1));
        }
		for (int i = 0 ; i < 5 ; i++) {
            for (int j = 1 ; j < 5 ; j++) {
                Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 0 ; i < 2 ; i++) {
            for (int j = 6 ; j < 11 ; j++) {
                Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 2 ; i < 8 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
        for (int j = 5 ; j < 7 ; j++) {
            Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 4, j), Environnement.canne);
        }
        for (int j = 2 ; j < 9 ; j++) {
            Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 7, j), Environnement.canne);
        }
        Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route12_2, Orientation.dos)));
        Endroits.milieu_route12_6.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 1,
                new Position(0, 1, 0, Endroits.milieu_route12_7, Orientation.face)));
        /* Fin milieu Route 12 6 */
        /* milieu Route 12 7 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, 1));
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 2 ; j < 9 ; j++) {
                Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 3 ; i < 7 ; i++) {
            for (int j = 5 ; j < 7 ; j++) {
                Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 4 ; i < 6 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 3 ; i < 8 ; i++) {
            for (int j = 7 ; j < 11 ; j++) {
                Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 6 ; i < 8 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
        for (int j = 2 ; j < 11 ; j++) {
            Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 0, j), Environnement.canne);
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 3, j), Environnement.canne);
        }
        Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 1,
                new Position(7, 1, 0, Endroits.milieu_route12_6, Orientation.dos)));
        Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 5,
                new Position(0, 5, 0, Endroits.fin_route12, Orientation.face)));
        Endroits.milieu_route12_7.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 6,
                new Position(0, 6, 0, Endroits.fin_route12, Orientation.face)));
        /* Fin milieu Route 12 7 */
        /* fin Route 12 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 5 ; j < 7 ; j++) {
            Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 1, j));
        }
		for (int i = 1 ; i < 4 ; i++) {
            for (int j = 7 ; j < 8 ; j++) {
                Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 4 ; i < 6 ; i++) {
            for (int j = 2 ; j < 9 ; j++) {
                Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 0 ; i < 4 ; i++) {
            for (int j = 2 ; j < 5 ; j++) {
                Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 2 ; i < 4 ; i++) {
            for (int j = 5 ; j < 7 ; j++) {
                Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 1 ; i < 4 ; i++) {
            for (int j = 8 ; j < 11 ; j++) {
                Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 4 ; i < 6 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
		for (int i = 6 ; i < 8 ; i++) {
            for (int j = 6 ; j < 11 ; j++) {
                Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j), Environnement.canne);
            }
        }
        for (int j = 7 ; j < 11 ; j++) {
            Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 0, j), Environnement.canne);
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 6, j), Environnement.canne);
        }
        for (int i = 0 ; i < 7 ; i++) {
            Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 1), Environnement.canne);
        }
		Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, 6, 5));
        Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route12_7, Orientation.dos)));
        Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 6,
                new Position(7, 6, 0, Endroits.milieu_route12_7, Orientation.dos)));
        Endroits.fin_route12.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 5,
                new Position(0, 9, 0, Endroits.debut_route14, Orientation.face)));
        /* Fin fin Route 12 */
        /* Fin Route 12 */
        /* Route 13 */
        /* debut Route 13 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route13.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route13.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.debut_route13.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 4, 0, Endroits.quartierHabitant_sombreville, Orientation.dos)));
        Endroits.debut_route13.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route13_1, Orientation.face)));
        /* Fin debut Route 13 */
        /* milieu Route 13 1 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route13_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route13_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.milieu_route13_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.debut_route13, Orientation.dos)));
        Endroits.milieu_route13_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route13_2, Orientation.face)));
        /* Fin milieu Route 13 1 */
        /* milieu Route 13 2 */
        for (int i = 0 ; i < 6 ; i++) {
            Endroits.milieu_route13_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route13_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.milieu_route13_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route13_1, Orientation.dos)));
        Endroits.milieu_route13_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 0,
                new Position(3, 10, 0, Endroits.milieu_route13_3, Orientation.gauche)));
        /* Fin milieu Route 13 2 */
        /* milieu Route 13 3 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route13_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route13_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.milieu_route13_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(6, 0, 0, Endroits.milieu_route13_2, Orientation.droite)));
        Endroits.milieu_route13_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route13_4, Orientation.gauche)));
        /* Fin milieu Route 13 3 */
        /* milieu Route 13 4 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route13_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route13_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.milieu_route13_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(1, 10, 0, Endroits.fin_route13, Orientation.gauche)));
        Endroits.milieu_route13_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route13_3, Orientation.droite)));
        /* Fin milieu Route 13 4 */
        /* fin Route 13 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route13.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 2 ; i < 8 ; i++) {
            Endroits.fin_route13.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.fin_route13.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 10,
                new Position(3, 0, 0, Endroits.milieu_route13_4, Orientation.droite)));
        Endroits.fin_route13.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 7, 0, Endroits.milieu_route15_3, Orientation.face)));
        /* Fin fin Route 13 */
        /* Fin Route 13 */
        /* Route 14 */
        /* debut Route 14 */
        for (int j = 0 ; j < 9 ; j++) {
            Endroits.debut_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.debut_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.debut_route14.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 9,
                new Position(7, 5, 0, Endroits.fin_route12, Orientation.dos)));
        Endroits.debut_route14.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route14_1, Orientation.gauche)));
        /* Fin debut Route 14 */
        /* milieu Route 14 1 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route14_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route14_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.milieu_route14_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.debut_route14, Orientation.droite)));
        Endroits.milieu_route14_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route14_2, Orientation.gauche)));
        /* Fin milieu Route 14 1 */
        /* milieu Route 14 2 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route14_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.milieu_route14_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        Endroits.milieu_route14_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route14_1, Orientation.droite)));
        Endroits.milieu_route14_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 3,
                new Position(0, 7, 0, Endroits.milieu_route14_3, Orientation.face)));
        /* Fin milieu Route 14 2 */
        /* milieu Route 14 3 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 6 ; i++) {
            Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 5));
        }
		Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 5));
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int i = 1 ; i < 4 ; i++) {
            for (int j = 1 ; j < 5 ; j++) {
                Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 1 ; i < 7 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
		for (int i = 4 ; i < 7 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 6,
                new Position(7, 3, 0, Endroits.milieu_route14_2, Orientation.dos)));
        Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 7,
                new Position(7, 3, 0, Endroits.milieu_route14_2, Orientation.dos)));
        Endroits.milieu_route14_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 7,
                new Position(0, 7, 0, Endroits.fin_route14, Orientation.face)));
        /* Fin milieu Route 14 3 */
        /* fin Route 14 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 5));
        }
        for (int j = 1 ; j < 6 ; j++) {
            Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int i = 1 ; i < 7 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
		for (int i = 1 ; i < 7 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 6,
                new Position(7, 6, 0, Endroits.milieu_route14_3, Orientation.dos)));
        Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 7,
                new Position(7, 7, 0, Endroits.milieu_route14_3, Orientation.dos)));
        Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 6,
                new Position(0, 5, 0, Endroits.milieu_route15_2, Orientation.face)));
        Endroits.fin_route14.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 7,
                new Position(0, 5, 0, Endroits.milieu_route15_2, Orientation.face)));
        /* Fin fin Route 14 */
        /* Fin Route 14 */
        /* Route 15 */
        /* debut Route 15 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route15.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route15.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 3 ; j < 8 ; j++) {
                Endroits.debut_route15.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.debut_route15.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(7, 10, 0, Endroits.quartierParcSafari_parmanie, Orientation.gauche)));
        Endroits.debut_route15.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route15_1, Orientation.droite)));
        /* Fin debut Route 15 */
        /* milieu Route 15 1 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route15_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route15_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 3 ; j < 8 ; j++) {
                Endroits.milieu_route15_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.milieu_route15_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.debut_route15, Orientation.gauche)));
        Endroits.milieu_route15_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route15_2, Orientation.droite)));
        /* Fin milieu Route 15 1 */
        /* milieu Route 15 2 */
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.milieu_route15_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.milieu_route15_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route15_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 2 ; j < 4 ; j++) {
                Endroits.milieu_route15_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.milieu_route15_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.milieu_route15_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route15_1, Orientation.gauche)));
        Endroits.milieu_route15_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route15_3, Orientation.droite)));
        Endroits.milieu_route15_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 7, 0, Endroits.fin_route14, Orientation.dos)));
        /* Fin milieu Route 15 2 */
        /* milieu Route 15 3 */
        for (int j = 0 ; j < 7 ; j++) {
            Endroits.milieu_route15_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 8 ; j < 11 ; j++) {
            Endroits.milieu_route15_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route15_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 3 ; j < 6 ; j++) {
                Endroits.milieu_route15_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.milieu_route15_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route15_2, Orientation.gauche)));
        Endroits.milieu_route15_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.fin_route15, Orientation.droite)));
        Endroits.milieu_route15_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 7,
                new Position(7, 5, 0, Endroits.fin_route13, Orientation.dos)));
        /* Fin milieu Route 15 3 */
        /* fin Route 15 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route15.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route15.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 3 ; j < 8 ; j++) {
                Endroits.fin_route15.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.fin_route15.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route15_3, Orientation.gauche)));
        Endroits.fin_route15.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.quartierHabitant_rocheville, Orientation.droite)));
        /* Fin fin Route 15 */
        /* Fin Route 15 */
        /* Route 16 */
        /* debut Route 16 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route16.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route16.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.debut_route16.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 10,
                new Position(0, 0, 0, Endroits.quartierArene_celadopole, Orientation.droite)));
        Endroits.debut_route16.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(5, 10, 0, Endroits.fin_route16, Orientation.gauche)));
        /* Fin debut Route 16 */
        /* fin Route 16 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route16.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        Endroits.fin_route16.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 10,
                new Position(5, 0, 0, Endroits.debut_route16, Orientation.droite)));
        Endroits.fin_route16.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.debut_piste_cyclable, Orientation.face)));
        /* Fin fin Route 16 */
        /* Fin Route 16 */
        /* Route 17 */
        /* debut Route 17 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.debut_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.fin_route16, Orientation.dos)));
        Endroits.debut_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_piste_cyclable, Orientation.face)));
        /* Fin debut Route 17 */
        /* milieu Route 17 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.milieu_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.debut_piste_cyclable, Orientation.dos)));
        Endroits.milieu_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.fin_piste_cyclable, Orientation.face)));
        /* Fin milieu Route 17 */
        /* fin Route 17 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.fin_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_piste_cyclable, Orientation.dos)));
        Endroits.fin_piste_cyclable.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.debut_route18, Orientation.face)));
        /* Fin fin Route 17 */
        /* Fin Route 17 */
        /* Route 18 */
        /* debut Route 18 */
        Endroits.debut_route18.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 10,
                new Position(5, 0, 0, Endroits.fin_route18, Orientation.droite)));
        Endroits.debut_route18.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.fin_piste_cyclable, Orientation.dos)));
        /* Fin debut Route 18 */
        /* fin Route 18 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route18.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        Endroits.fin_route18.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 10,
                new Position(7, 0, 0, Endroits.quartierBoutique_parmanie, Orientation.droite)));
        Endroits.fin_route18.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(5, 10, 0, Endroits.debut_route18, Orientation.gauche)));
        /* Fin fin Route 18 */
        /* Fin Route 18 */
        /* Route 19 */
        /* debut Route 19 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route19.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route19.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
        Endroits.debut_route19.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 4, 0, Endroits.quartierHabitant_parmanie, Orientation.dos)));
        Endroits.debut_route19.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route19, Orientation.face)));
        /* Fin debut Route 19 */
        /* milieu Route 19 */
        Endroits.milieu_route19.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.debut_route19, Orientation.dos)));
        Endroits.milieu_route19.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.fin_route19, Orientation.face)));
        /* Fin milieu Route 19 */
        /* fin Route 19 */
        Endroits.fin_route19.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route19, Orientation.dos)));
        Endroits.fin_route19.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.debut_route20, Orientation.gauche)));
        /* Fin fin Route 19 */
        /* Fin Route 19 */
        /* Route 20 */
        /* debut Route 20 */
        Endroits.debut_route20.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route20, Orientation.gauche)));
        Endroits.debut_route20.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.fin_route19, Orientation.droite)));
        /* Fin debut Route 20 */
        /* milieu Route 20 */
        Endroits.milieu_route20.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.debut_route20, Orientation.droite)));
        Endroits.milieu_route20.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.fin_route20, Orientation.gauche)));
        /* Fin milieu Route 20 */
        /* fin Route 20 */
        Endroits.fin_route20.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route20, Orientation.droite)));
        Endroits.fin_route20.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.quartierArene_cramois_ile, Orientation.gauche)));
        /* Fin fin Route 20 */
        /* Fin Route 20 */
        /* Route 21 */
        /* debut Route 21 */
        Endroits.debut_route21.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 2, Endroits.quartierHabitant_bourgPalette)));
        Endroits.debut_route21.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, Endroits.milieu_route21)));
        /* Fin debut Route 21 */
        /* milieu Route 21 */
        Endroits.milieu_route21.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, Endroits.debut_route21)));
        Endroits.milieu_route21.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, Endroits.fin_route21)));
        /* Fin milieu Route 21 */
        /* fin Route 21 */
        Endroits.fin_route21.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, Endroits.milieu_route21)));
        Endroits.fin_route21.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 1, Endroits.quartierArene_cramois_ile)));
        /* Fin fin Route 21 */
        /* Fin Route 21 */
    
        /* Route 22 */
        /* Debut route 22 */
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        for (int i = 4 ; i < 10 ; i++) {
            Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 9));
        }
        for (int j = 0; j < 10; j++) {
            Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 10, j));
        }
        for (int j = 0; j < 7; j++) {
            Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 7; j < 10; j++) {
                Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int j = 7; j < 10; j++) {
            Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 2, j));
        }
        Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 3, 0));
        Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 6, 0));
        for (int i = 4 ; i < 6 ; i++) {
            Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 0));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 1));
        }
        for (int i = 3; i < 7; i++) {
            for (int j = 2; j < 6; j++) {
                Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 0; j < 2; j++) {
            Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 7, j));
        }
        for (int i = 8; i < 10 ; i++) {
            for (int j = 1; j < 9; j++) {
                Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 0,
                new Position(1, 7, 0, Endroits.milieu_route22,Orientation.gauche)));
        Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 8, 0,
                new Position(9, 7, 0, Endroits.milieu_route22,Orientation.gauche)));
        Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 9, 0,
                new Position(10, 7, 0, Endroits.milieu_route22,Orientation.gauche)));
        Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 9,
                new Position(2, 0, 0, Endroits.quartierBoutique_jadielle, Orientation.droite)));
        Endroits.debut_route22.ajouterObjetEndroit(new ObjetEndroitCoffre (Type_objet.coffre, 1, 5, "", Objets.potion));
        Endroits.debut_route22.setSol(Sol.herbe);
        /* Fin debut route 22 */
        /* Milieu route 22 */
        for (int i = 3; i < 7; i++) {
            for (int j = 1; j < 5; j++) {
                Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 2; i < 5 ; i++) {
            for (int j = 5; j < 7; j++) {
                Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int j = 0; j < 8; j++) {
            Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int i = 2 ; i < 8 ; i++) {
            Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 7));
        }
        for (int j = 0; j < 8; j++) {
            Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 8, j));
        }
        for (int i = 9; i < 11 ; i++) {
            for (int j = 1; j < 7; j++) {
                Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 1, 7,
                new Position(1, 0, 0, Endroits.debut_route22, Orientation.droite)));
        Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 9, 7,
                new Position(7, 0, 0, Endroits.debut_route22, Orientation.droite)));
        Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 10, 7,
                new Position(8, 0, 0, Endroits.debut_route22, Orientation.droite)));
        Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 0,
                new Position(5, 6, 0, Endroits.fin_route22, Orientation.gauche)));
        Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 9, 0,
                new Position(5, 0, 0, Endroits.fin_route22, Orientation.gauche)));
        Endroits.milieu_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 10, 0,
                new Position(5, 0, 0, Endroits.fin_route22, Orientation.gauche)));
        Endroits.milieu_route22.setSol(Sol.herbe);
        /* Fin Milieu route 22 */
        /* Fin route 22 */
        for (int j = 0; j < 2; j++) {
            Endroits.fin_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 3; j < 7; j++) {
            Endroits.fin_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int i = 1 ; i < 11 ; i++) {
            Endroits.fin_route22.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 0));
        }
        Endroits.fin_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 6,
                new Position(7, 0, 0, Endroits.milieu_route22, Orientation.droite)));
        Endroits.fin_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 9, 6,
                new Position(9, 0, 0, Endroits.milieu_route22, Orientation.droite)));
        Endroits.fin_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 10, 6,
                new Position(10, 0, 0, Endroits.milieu_route22, Orientation.droite)));
        Endroits.fin_route22.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 2,
                new Position(7, 5, 0, Endroits.debut_route23, Orientation.dos)));
        Endroits.fin_route22.setSol(Sol.herbe);
        /* Fin Fin route 22 */
        /* Fin route 22 */
    
        /* Route 23 */
        /* Debut route 23 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route23.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route23.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.debut_route23.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 2, 0, Endroits.fin_route22,Orientation.face)));
        Endroits.debut_route23.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route23_1, Orientation.dos)));
        /* Fin debut route 23 */
        /* milieu route 23 1 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route23_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route23_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.milieu_route23_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.debut_route23,Orientation.face)));
        Endroits.milieu_route23_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route23_2, Orientation.dos)));
        /* Fin milieu route 23 1 */
        /* milieu route 23 2 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route23_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route23_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.milieu_route23_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route23_1,Orientation.face)));
        Endroits.milieu_route23_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route23_3, Orientation.dos)));
        /* Fin milieu route 23 2 */
        /* milieu route 23 3 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route23_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route23_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.milieu_route23_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route23_2,Orientation.face)));
        Endroits.milieu_route23_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.milieu_route23_4, Orientation.dos)));
        /* Fin milieu route 23 3 */
        /* milieu route 23 4 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route23_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route23_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.milieu_route23_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route23_3,Orientation.face)));
        Endroits.milieu_route23_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.fin_route23, Orientation.dos)));
        /* Fin milieu route 23 4 */
        /* fin route 23 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route23.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route23.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.fin_route23.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(0, 5, 0, Endroits.milieu_route23_4,Orientation.face)));
        Endroits.fin_route23.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 5,
                new Position(7, 5, 0, Endroits.entree_ligue_pokemon_kanto, Orientation.dos)));
        /* Fin fin route 23 */
        /* Fin route 23 */
        
        /* Route 24 */
        /* debut Route 24 */
        for (int i = 1 ; i < 8 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 5));
        }
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 8 ; j < 11 ; j++) {
                Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 0, 0,
                new Position(7, 0, 0, Endroits.milieu_route24, Orientation.dos)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 0, 1,
                new Position(7, 1, 0, Endroits.milieu_route24, Orientation.dos)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 0, 2,
                new Position(7, 2, 0, Endroits.milieu_route24, Orientation.dos)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 3,
                new Position(7, 3, 0, Endroits.milieu_route24, Orientation.dos)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 4,
                new Position(7, 4, 0, Endroits.milieu_route24, Orientation.dos)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 6,
                new Position(7, 6, 0, Endroits.milieu_route24, Orientation.dos)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 7,
                new Position(7, 7, 0, Endroits.milieu_route24, Orientation.dos)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 3,
                new Position(0, 5, 0, Endroits.quartierHabitant_azuria, Orientation.face)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 4,
                new Position(0, 6, 0, Endroits.quartierHabitant_azuria, Orientation.face)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 6,
                new Position(0, 7, 0, Endroits.quartierHabitant_azuria, Orientation.face)));
        Endroits.debut_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 7,
                new Position(0, 7, 0, Endroits.quartierHabitant_azuria, Orientation.face)));
        /* Fin debut Route 24 */
        /* milieu Route 24 */
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 2 ; j < 3 ; j++) {
                Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 5));
        }
        for (int i = 6 ; i < 8 ; i++) {
            for (int j = 8 ; j < 11 ; j++) {
                Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
        for (int i = 0 ; i < 6 ; i++) {
            Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 8));
        }
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 0,
                new Position(7, 0, 0, Endroits.fin_route24, Orientation.dos)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 1,
                new Position(7, 1, 0, Endroits.fin_route24, Orientation.dos)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 0, 2,
                new Position(7, 2, 0, Endroits.fin_route24, Orientation.face)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 3,
                new Position(7, 3, 0, Endroits.fin_route24, Orientation.dos)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 0, 4,
                new Position(7, 4, 0, Endroits.fin_route24, Orientation.dos)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 6,
                new Position(7, 6, 0, Endroits.fin_route24, Orientation.dos)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 7,
                new Position(7, 7, 0, Endroits.fin_route24, Orientation.dos)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 7, 0,
                new Position(0, 0, 0, Endroits.debut_route24, Orientation.face)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 7, 1,
                new Position(0, 1, 0, Endroits.debut_route24, Orientation.face)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 7, 2,
                new Position(0, 2, 0, Endroits.debut_route24, Orientation.face)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 3,
                new Position(0, 3, 0, Endroits.debut_route24, Orientation.face)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 7, 4,
                new Position(0, 4, 0, Endroits.debut_route24, Orientation.face)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 6,
                new Position(0, 6, 0, Endroits.debut_route24, Orientation.face)));
        Endroits.milieu_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 7,
                new Position(0, 7, 0, Endroits.debut_route24, Orientation.face)));
        /* Fin milieu Route 24 */
        /* fin Route 24 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 8 ; j < 11 ; j++) {
            Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int i = 5 ; i < 8 ; i++) {
            Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 5));
        }
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int i = 3 ; i < 7 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 3 ; i < 5 ; i++) {
            for (int j = 3 ; j < 10 ; j++) {
                Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(3, 0, 0, Endroits.debut_route25, Orientation.droite)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 10,
                new Position(4, 0, 0, Endroits.debut_route25, Orientation.droite)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 10,
                new Position(6, 0, 0, Endroits.debut_route25, Orientation.droite)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 0,
                new Position(0, 0, 0, Endroits.milieu_route24, Orientation.face)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 1,
                new Position(0, 1, 0, Endroits.milieu_route24, Orientation.face)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 7, 2,
                new Position(0, 2, 0, Endroits.milieu_route24, Orientation.face)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 3,
                new Position(0, 3, 0, Endroits.milieu_route24, Orientation.face)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 4,
                new Position(0, 4, 0, Endroits.milieu_route24, Orientation.face)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 6,
                new Position(0, 6, 0, Endroits.milieu_route24, Orientation.face)));
        Endroits.fin_route24.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 7,
                new Position(0, 7, 0, Endroits.milieu_route24, Orientation.face)));
        /* Fin fin Route 24 */
        /* Fin Route 24 */
        /* Route 25 */
        /* debut Route 25 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 1 ; j < 4 ; j++) {
                Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 3 ; i < 5 ; i++) {
            for (int j = 1 ; j < 4 ; j++) {
                Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 0,
                new Position(3, 10, 0, Endroits.fin_route24, Orientation.gauche)));
        Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(4, 10, 0, Endroits.fin_route24, Orientation.gauche)));
        Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 0,
                new Position(6, 10, 0, Endroits.fin_route24, Orientation.gauche)));
        Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route25_1, Orientation.droite)));
        Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 10,
                new Position(4, 0, 0, Endroits.milieu_route25_1, Orientation.droite)));
        Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 10,
                new Position(6, 0, 0, Endroits.milieu_route25_1, Orientation.droite)));
        /* Fin debut Route 25 */
        /* milieu Route 25 1 */
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 4));
        Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 6));
        Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(3, 10, 0, Endroits.debut_route25, Orientation.gauche)));
        Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 0,
                new Position(4, 10, 0, Endroits.debut_route25, Orientation.gauche)));
        Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 0,
                new Position(6, 10, 0, Endroits.debut_route25, Orientation.gauche)));
        Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 10,
                new Position(3, 0, 0, Endroits.milieu_route25_2, Orientation.droite)));
        Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 10,
                new Position(4, 0, 0, Endroits.milieu_route25_2, Orientation.droite)));
        Endroits.milieu_route25_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 10,
                new Position(6, 0, 0, Endroits.milieu_route25_2, Orientation.droite)));
        /* Fin milieu Route 25 1 */
        /* milieu Route 25 2 */
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
		for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route25_1, Orientation.gauche)));
        Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 0,
                new Position(4, 10, 0, Endroits.milieu_route25_1, Orientation.gauche)));
        Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 0,
                new Position(6, 10, 0, Endroits.milieu_route25_1, Orientation.gauche)));
        Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 10,
                new Position(3, 0, 0, Endroits.fin_route25, Orientation.droite)));
        Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 10,
                new Position(4, 0, 0, Endroits.fin_route25, Orientation.droite)));
        Endroits.milieu_route25_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 10,
                new Position(6, 0, 0, Endroits.fin_route25, Orientation.droite)));
        /* Fin milieu Route 25 2 */
        /* fin Route 25 */
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, j));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int j = 5 ; j < 9 ; j++) {
            Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 5));
        Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 7));
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 9 ; j < 11 ; j++) {
                Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
        for (int j = 5 ; j < 9 ; j++) {
            Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 7, j));
        }
        Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 5, 5));
        Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 5, 7));
        for (int i = 2 ; i < 7 ; i++) {
            Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 6));
        }
        Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(3, 10, 0, Endroits.milieu_route25_2, Orientation.gauche)));
        Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 0,
                new Position(4, 10, 0, Endroits.milieu_route25_2, Orientation.gauche)));
        Endroits.fin_route25.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 0,
                new Position(6, 10, 0, Endroits.milieu_route25_2, Orientation.gauche)));
        /* Fin fin Route 25 */
        /* Fin Route 25 */
        
        /* Route 29 */
        /* Debut route 29 */
        for (int j = 0 ; j < 17 ; j++) {
            Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 14; i < 16; i++) {
            for (int j = 0; j < 17; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 9; j < 17; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 10; i < 15; i++) {
            for (int j = 13; j < 17; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 12; i < 15; i++) {
            for (int j = 9; j < 13; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 10; i < 12; i++) {
            for (int j = 6; j < 13; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 13 ; j < 17 ; j++) {
            Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int i = 5; i < 9; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3; i < 7; i++) {
            for (int j = 4; j < 8; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 4; j < 7; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 7; i < 11; i++) {
            for (int j = 2; j < 4; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 8; i < 10; i++) {
            for (int j = 7; j < 10; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 12; i < 14; i++) {
            for (int j = 5; j < 9; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 8; i < 10; i++) {
            for (int j = 12; j < 15; j++) {
                Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 8));
        }
        for (int j = 1 ; j < 6 ; j++) {
            Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 12, j));
        }
        for (int i = 7 ; i < 12 ; i++) {
            Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, i, 5));
        }
        Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, 9));
        for (int i = 10 ; i < 13 ; i++) {
            Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 0));
        for (int i = 6 ; i < 10 ; i++) {
            Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 16,
                new Position(4, 0, 0, Endroits.quartierHabitant_bourg_geon, Orientation.droite)));
        }
        for (int i = 2 ; i < 5 ; i++) {
            Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, i, 0,
                new Position(i, 16, 0, Endroits.milieu_route29, Orientation.gauche)));
        }
        Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 9, 0,
                new Position(9, 16, 0, Endroits.milieu_route29, Orientation.gauche)));
        Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 13, 0,
                new Position(13, 16, 0, Endroits.milieu_route29, Orientation.gauche)));
        Endroits.debut_route29.ajouterObjetEndroit(new ObjetEndroitCoffre (Type_objet.coffre, 1, 8, "", Objets.potion));
        /* Fin debut route 29 */
        /* Milieu route 29 */
        for (int i = 14; i < 16; i++) {
            for (int j = 0; j < 17; j++) {
                Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 12; j < 16; j++) {
                Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 0 ; i < 2 ; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 16));
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 12; j < 14; j++) {
                Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3; i < 5; i++) {
            for (int j = 5; j < 7; j++) {
                Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 4));
        for (int i = 10 ; i < 13 ; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 16));
        }
        Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, 10));
        for (int j = 12 ; j < 15 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, j));
        }
        for (int j = 1 ; j < 6 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, j));
        }
        for (int j = 5 ; j < 9 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, j));
        }
        Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, 4));
        for (int j = 7 ; j < 9 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, j));
        }
        Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 10, 7));
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 10, j));
        }
        for (int j = 2 ; j < 6 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, j));
        }
        for (int j = 14 ; j < 16 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 12, j));
        }
        for (int j = 11 ; j < 13 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 12, j));
        }
        for (int j = 13 ; j < 16 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 13, j));
        }
        Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 12, 13));
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 10, j));
        }
        for (int i = 10 ; i < 13 ; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, i, 10));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 11, j));
        }
        for (int i = 6; i < 8; i++) {
            for (int j = 12; j < 16; j++) {
                Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 5 ; i < 9 ; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 16));
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 14; j < 16; j++) {
                Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 4; i < 7; i++) {
            for (int j = 1; j < 3; j++) {
                Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 8; i < 10; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 15), Environnement.haute_herbe);
        }
        for (int i = 12; i < 14; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 2 ; i < 5 ; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 16,
                new Position(i, 0, 0, Endroits.debut_route29, Orientation.droite)));
        }
        Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 9, 16,
                new Position(9, 0, 0, Endroits.debut_route29, Orientation.droite)));
        Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 13, 16,
                new Position(13, 0, 0, Endroits.debut_route29, Orientation.droite)));
		for (int j = 9 ; j < 12 ; j++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, j,
                new Position(7, 8, 0, Endroits.fin_route46, Orientation.dos)));
        }
		Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(3, 15, 0, Endroits.fin_route29, Orientation.gauche)));
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, i, 0,
                new Position(i, 15, 0, Endroits.fin_route29, Orientation.gauche)), Environnement.haute_herbe);
        }
		Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 0,
                new Position(7, 15, 0, Endroits.fin_route29, Orientation.gauche)));
        for (int i = 9 ; i < 11 ; i++) {
            Endroits.milieu_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 0,
                new Position(9, 15, 0, Endroits.fin_route29, Orientation.gauche)));
        }
        /* Fin Milieu route 29 */
        /* Fin route 29 */
        for (int i = 14; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 16; j++) {
                Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 9; i < 14; i++) {
            for (int j = 0; j < 4; j++) {
                Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 10; i < 14; i++) {
            for (int j = 7; j < 16; j++) {
                Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 10; i < 14; i++) {
            for (int j = 4; j < 7; j++) {
                Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 9, 4), Environnement.haute_herbe);
        for (int j = 5 ; j < 14 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 9, j));
        }
        for (int j = 2 ; j < 6 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 8, j));
        }
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 8, j));
        }
        for (int j = 12 ; j < 16 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 8, j));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        for (int j = 12 ; j < 15 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        for (int j = 8 ; j < 16 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 7, j), Environnement.haute_herbe);
        }
        for (int i = 3; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
        for (int j = 0 ; j < 3 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        for (int j = 5 ; j < 8 ; j++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
        Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, 7));
        Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 15,
            new Position(3, 0, 0, Endroits.milieu_route29, Orientation.droite)));
		for (int i = 4 ; i < 7 ; i++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, i, 15,
                new Position(i, 0, 0, Endroits.milieu_route29, Orientation.droite)), Environnement.haute_herbe);
        }
        Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 9, 15,
            new Position(9, 0, 0, Endroits.milieu_route29, Orientation.droite)));
        for (int i = 6 ; i < 9 ; i++) {
            Endroits.fin_route29.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 0,
                new Position(4, 10, 0, Endroits.quartierHabitant_ville_griotte, Orientation.gauche)));
        }
        /* Fin Fin route 29 */
        /* Fin route 29 */
        
        /* Route 30 */
        /* debut Route 30 */
        for (int i = 0 ; i < 12 ; i++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 12 ; i++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 1));
        }
        for (int i = 5 ; i < 12 ; i++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 2));
        }
        for (int i = 0 ; i < 4 ; i++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
        for (int i = 9; i < 12; i++) {
            for (int j = 6; j < 13; j++) {
                Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 8; i < 11; i++) {
            for (int j = 13; j < 17; j++) {
                Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 5 ; i < 12 ; i++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 17));
        }
        for (int i = 7 ; i < 9 ; i++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 11));
        }
        for (int i = 5; i < 8; i++) {
            for (int j = 13; j < 17; j++) {
                Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2; i < 4; i++) {
            for (int j = 11; j < 18; j++) {
                Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 14; j < 18; j++) {
                Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 11 ; j < 14 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 1, j));
        }
        for (int i = 7; i < 9; i++) {
            for (int j = 6; j < 11; j++) {
                Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 5; i < 7; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, 2));
        for (int j = 3 ; j < 5 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.escalier_montant, 4, j));
        }
        for (int j = 5 ; j < 9 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, j));
        }
        for (int j = 9 ; j < 11 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.escalier_montant, 4, j));
        }
        for (int j = 11 ; j < 18 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, j));
        }
        for (int j = 3 ; j < 5 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        for (int i = 7; i < 11; i++) {
            for (int j = 3; j < 5; j++) {
                Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int j = 3 ; j < 9 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 3, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 8));
        }
        for (int j = 3 ; j < 9 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        for (int j = 3 ; j < 5 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 11, j,
                new Position(0, 1, 0, Endroits.quartierHabitant_ville_griotte, Orientation.face)));
        }
		Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 11, 5,
            new Position(0, 1, 0, Endroits.quartierHabitant_ville_griotte, Orientation.face)));
        for (int j = 13 ; j < 17 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 11, j,
                new Position(0, 7, 0, Endroits.quartierHabitant_ville_griotte, Orientation.face)));
        }
        for (int j = 3 ; j < 8 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(9, j, 0, Endroits.milieu_route30_1, Orientation.dos)));
        }
        Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 8,
                new Position(9, 8, 0, Endroits.milieu_route30_1, Orientation.dos)));
        for (int j = 9 ; j < 11 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(9, j, 0, Endroits.milieu_route30_1, Orientation.dos)));
        }
        for (int j = 11 ; j < 14 ; j++) {
            Endroits.debut_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 0, j,
                new Position(9, j, 0, Endroits.milieu_route30_1, Orientation.dos)));
        }
        /* fin debut Route 30 */
        /* milieu 1 Route 30 */
        for (int i = 0 ; i < 10 ; i++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 10 ; i++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 1));
        }
        for (int i = 0 ; i < 10 ; i++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
        for (int i = 4; i < 10; i++) {
            for (int j = 14; j < 18; j++) {
                Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2; i < 6; i++) {
            for (int j = 5; j < 9; j++) {
                Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 4; i < 9; i++) {
            for (int j = 11; j < 14; j++) {
                Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 13; j < 17; j++) {
                Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 4 ; i++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 17));
        }
        for (int j = 14 ; j < 17 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 5));
        }
        for (int i = 1 ; i < 5 ; i++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 3));
        }
        for (int i = 6 ; i < 8 ; i++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 3));
        }
        for (int j = 4 ; j < 9 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 7, j));
        }
        for (int i = 1; i < 6; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 11; j < 13; j++) {
                Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 7 ; j < 9 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 1, j), Environnement.haute_herbe);
        }
        Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 8, 8));
        for (int j = 3 ; j < 5 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 5, j));
        }
        for (int j = 3 ; j < 8 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 9, j,
                new Position(0, j, 0, Endroits.debut_route30, Orientation.face)));
        }
        Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 9, 8,
                new Position(0, 8, 0, Endroits.debut_route30, Orientation.face)));
        for (int j = 9 ; j < 11 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 9, j,
                new Position(0, j, 0, Endroits.debut_route30, Orientation.face)));
        }
        for (int j = 11 ; j < 14 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.riviere, 9, j,
                new Position(0, j, 0, Endroits.debut_route30, Orientation.face)));
        }
        for (int j = 11 ; j < 14 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, j,
                new Position(12, j, 0, Endroits.milieu_route30_2, Orientation.dos)), Environnement.haute_herbe);
        }
        Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 3,
            new Position(12, 3, 0, Endroits.milieu_route30_2, Orientation.dos)));
        Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 4,
            new Position(12, 4, 0, Endroits.milieu_route30_2, Orientation.dos)));
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.milieu_route30_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(12, j, 0, Endroits.milieu_route30_2, Orientation.dos)));
        }
        /* fin milieu 1 Route 30 */
        /* milieu 2 Route 30 */
        for (int i = 0 ; i < 13 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 9 ; i < 13 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 1));
        }
        for (int i = 9 ; i < 13 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
        for (int i = 3 ; i < 13 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 15));
        }
        for (int i = 0 ; i < 13 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 16));
        }
        for (int i = 0 ; i < 13 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 17));
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 3; j++) {
                Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 8, j));
        }
        for (int i = 5 ; i < 8 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 3));
        }
        Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, 3));
        for (int j = 4 ; j < 6 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.escalier_montant, 4, j));
        }
        for (int j = 6 ; j < 8 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, j));
        }
        for (int i = 0 ; i < 4 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 7));
        }
        for (int j = 3 ; j < 7 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 0, j));
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 10; j < 12; j++) {
                Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, 12));
        for (int i = 5; i < 7; i++) {
            for (int j = 6; j < 10; j++) {
                Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 10 ; j < 12 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
        for (int j = 7 ; j < 9 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, 8));
        Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, 8));
        for (int i = 11 ; i < 13 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 14));
        }
        for (int i = 7 ; i < 9 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 6), Environnement.haute_herbe);
        }
        Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 8, 7), Environnement.haute_herbe);
        for (int i = 4; i < 6; i++) {
            for (int j = 10; j < 15; j++) {
                Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 8; j < 10; j++) {
                Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 10 ; j < 14 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 11, j), Environnement.haute_herbe);
        }
        for (int j = 3 ; j < 10 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 11, j));
        }
        for (int i = 5; i < 11; i++) {
            for (int j = 4; j < 6; j++) {
                Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 4; j < 6; j++) {
                Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int j = 10 ; j < 14 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 10, j));
        }
        for (int i = 8 ; i < 10 ; i++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, 13));
        }
        Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 12, 3,
            new Position(0, 3, 0, Endroits.milieu_route30_1, Orientation.face)));
        Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 12, 4,
            new Position(0, 4, 0, Endroits.milieu_route30_1, Orientation.face)));
        for (int j = 6 ; j < 11 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 12, j,
                new Position(0, j, 0, Endroits.milieu_route30_1, Orientation.face)));
        }
        for (int j = 10 ; j < 14 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 12, j,
                new Position(0, j, 0, Endroits.milieu_route30_1, Orientation.face)), Environnement.haute_herbe);
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, j,
                new Position(12, j, 0, Endroits.fin_route30, Orientation.dos)), Environnement.haute_herbe);
        }
        for (int j = 13 ; j < 16 ; j++) {
            Endroits.milieu_route30_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(12, j, 0, Endroits.fin_route30, Orientation.dos)));
        }
        /* fin milieu 2 Route 30 */
        /* fin Route 30 */
        for (int i = 0 ; i < 13 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 1 ; i < 13 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 1));
        }
        for (int i = 1 ; i < 5 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
        for (int i = 11 ; i < 13 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
        for (int i = 1 ; i < 4 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 3));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        for (int i = 5 ; i < 13 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        for (int i = 2; i < 4; i++) {
            for (int j = 8; j < 10; j++) {
                Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 6 ; i < 10 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 8));
        }
        Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, 9));
        Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, 10));
        for (int i = 9; i < 13; i++) {
            for (int j = 11; j < 13; j++) {
                Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 10 ; i < 12 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 13));
        }
        Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, 14));
        for (int i = 2 ; i < 8 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 15));
        }
        for (int i = 0 ; i < 13 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 16));
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 6 ; j < 16 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
        for (int j = 8 ; j < 16 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, j));
        }
        for (int i = 1 ; i < 4 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 7));
        }
        for (int i = 6 ; i < 13 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 7));
        }
        for (int i = 8; i < 10; i++) {
            for (int j = 13; j < 16; j++) {
                Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 14 ; j < 16 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 10, j), Environnement.haute_herbe);
        }
        Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 11, 15), Environnement.haute_herbe);
        for (int j = 9 ; j < 12 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 9, j), Environnement.haute_herbe);
        }
        for (int i = 5 ; i < 11 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 2), Environnement.haute_herbe);
        }
        for (int i = 4 ; i < 6 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 3), Environnement.haute_herbe);
        }
        for (int i = 9 ; i < 11 ; i++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 3), Environnement.haute_herbe);
        }
        for (int j = 3 ; j < 6 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 8, j));
        }
        for (int j = 3 ; j < 6 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 12, j,
                new Position(1, j, 0, Endroits.milieu_route30_2, Orientation.face)));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 12, j,
                new Position(0, j, 0, Endroits.milieu_route30_2, Orientation.face)), Environnement.haute_herbe);
        }
		Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 12, 10,
                new Position(0, 9, 0, Endroits.milieu_route30_2, Orientation.face)), Environnement.haute_herbe);
        for (int j = 13 ; j < 16 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 12, j,
                new Position(0, j, 0, Endroits.milieu_route30_2, Orientation.face)), Environnement.haute_herbe);
        }
        for (int j = 4 ; j < 6 ; j++) {
            Endroits.fin_route30.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, j,
                new Position(12, 1, 0, Endroits.debut_route31, Orientation.dos)));
        }
        /* fin fin Route 30 */
        /* fin Route 30 */
        /* Route 31 */
        /* début route 31 */
        for (int i = 5; i < 13; i++) {
            for (int j = 10; j < 14; j++) {
                Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 4; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0; j < 4; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 7 ; i < 13 ; i++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 10 ; i < 13 ; i++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 9));
        }
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 1));
        for (int i = 7; i < 9; i++) {
            for (int j = 3; j < 8; j++) {
                Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 4; j < 8; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, j));
        }
        for (int j = 9; j < 14; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, j));
        }
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 4, 7));
        for (int j = 7; j < 14; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 3, j));
        }
        for (int j = 9; j < 14; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 2, j));
        }
        for (int j = 10; j < 14; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, j));
        }
        for (int j = 11; j < 14; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, j));
        }
        for (int i = 1 ; i < 5 ; i++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 6));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 7));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 9));
        }
        for (int i = 0 ; i < 3 ; i++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 8));
        }
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, 0, 10));
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, 0, 4));
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, 0, 5));
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, 8));
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, 6));
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, 7));
        for (int i = 10; i < 12; i++) {
            for (int j = 4; j < 9; j++) {
                Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 5; j < 10; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 12, j), Environnement.haute_herbe);
        }
        for (int j = 8; j < 10; j++) {
            Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 9, j), Environnement.haute_herbe);
        }
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 11, 1));
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 12, 1,
                new Position(0, 4, 0, Endroits.fin_route30, Orientation.face)));
        Endroits.debut_route31.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 0,
                new Position(6, 13, 0, Endroits.fin_route31, Orientation.gauche)));
        /* fin debut route 31 */
        /* fin route 31 */
        for (int j = 0; j < 14; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 7; j < 10; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, j));
        }
        for (int i = 11; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0; j < 11; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 10, j));
        }
        for (int j = 0; j < 5; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, j));
        }
        for (int j = 0; j < 3; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, j));
        }
        for (int i = 6 ; i < 8 ; i++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 8));
        for (int i = 0 ; i < 6 ; i++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 13));
        }
        for (int i = 7 ; i < 13 ; i++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 13));
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 10; j < 13; j++) {
                Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j), Environnement.canne);
            }
        }
        Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 5, 12), Environnement.canne);
        for (int j = 1; j < 8; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 7, j), Environnement.haute_herbe);
        }
        for (int j = 3; j < 8; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 8, j), Environnement.haute_herbe);
        }
        for (int j = 5; j < 7; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 9, j), Environnement.haute_herbe);
        }
        for (int j = 9; j < 11; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 8, j), Environnement.haute_herbe);
        }
        for (int j = 8; j < 13; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 9, j), Environnement.haute_herbe);
        }
        for (int j = 11; j < 13; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 10, j), Environnement.haute_herbe);
        }
        for (int j = 1; j < 7; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, 8));
        for (int j = 8; j < 13; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 6, j));
        }
        Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 5, 7));
        Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, 1));
        for (int j = 3; j < 8; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 7, 9));
        for (int j = 11; j < 13; j++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 7, j));
        }
        Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 6, 13,
                new Position(6, 0, 0, Endroits.debut_route31, Orientation.droite)));
        for (int i = 4 ; i < 6 ; i++) {
            Endroits.fin_route31.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 0,
                new Position(3, 10, 0, Endroits.quartier_habitant_mauville, Orientation.gauche)));
        }
        /* fin fin route 31 */
        /* fin Route 31 */
		
		/* Route 32 */
		/* Debut route 32 */
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 13; j < 17; j++) {
                Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 0; j < 8; j++) {
            Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3; i < 12; i++) {
            for (int j = 15; j < 17; j++) {
                Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 7; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 3; i < 9; i++) {
            for (int j = 13; j < 15; j++) {
                Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 9 ; i < 11 ; i++) {
            Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 14), Environnement.haute_herbe);
        }
		for (int j = 8; j < 12; j++) {
            Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 11, j));
        }
		Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, 12));
		Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 12,
                new Position(7, 5, 0, Endroits.quartier_arene_mauville, Orientation.dos)));
		Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 0,
                new Position(6, 11, 0, Endroits.milieu_ruine_alpha, Orientation.droite)));
		for (int j = 13; j < 15; j++) {
            Endroits.debut_route32.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 11, j,
                new Position(0, j, 0, Endroits.milieu_route32_1, Orientation.face)));
        }
		/* Fin debut route 32 */
		/* Milieu route 32 */
		for (int j = 0; j < 4; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 0, j));
        }
		for (int j = 4; j < 7; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int j = 7; j < 13; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, j));
        }
		for (int j = 9; j < 13; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 1, j));
        }
		for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
		for (int j = 0; j < 4; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 3, j));
        }
		for (int i = 4; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 0; i < 11; i++) {
            for (int j = 15; j < 17; j++) {
                Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2 ; i < 5 ; i++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, i, 12));
        }
		Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 4, 11));
		for (int j = 13; j < 15; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 4, j), Environnement.haute_herbe);
        }
		for (int i = 4; i < 10; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
		Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbuste, 7, 8));
		for (int i = 5; i < 7; i++) {
            for (int j = 11; j < 15; j++) {
                Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int j = 13; j < 15; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 7, j), Environnement.haute_herbe);
        }
		for (int i = 8; i < 10; i++) {
            for (int j = 11; j < 15; j++) {
                Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int j = 8; j < 10; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, j));
        }
		Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, 14));
		Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 11, 15));
		Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, 16));
		for (int j = 13; j < 15; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(11, j, 0, Endroits.debut_route32, Orientation.dos)));
        }
		for (int j = 10; j < 14; j++) {
            Endroits.milieu_route32_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 11, j,
                new Position(0, j, 0, Endroits.milieu_route32_2, Orientation.face)), Environnement.haute_herbe);
        }
		/* fin milieu route 32 */
		/* fin route 32 */
		for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 11 ; i++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 16));
        }
		for (int j = 14; j < 17; j++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 0, j));
        }
		for (int j = 4; j < 10; j++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int j = 4; j < 6; j++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, j));
        }
		Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, 4));
		for (int i = 1; i < 11; i++) {
            for (int j = 14; j < 17; j++) {
                Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 6), Environnement.haute_herbe);
        }
		Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 2, 5), Environnement.haute_herbe);
		for (int i = 3; i < 9; i++) {
            for (int j = 4; j < 7; j++) {
                Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 7 ; i < 9 ; i++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 7), Environnement.haute_herbe);
        }
		for (int i = 3; i < 7; i++) {
            for (int j = 7; j < 10; j++) {
                Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
        for (int i = 3 ; i < 6 ; i++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 10));
        }
		Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 4, 11));
		for (int j = 10; j < 14; j++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 9, j));
        }
		for (int j = 5; j < 14; j++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 10, j));
        }
		for (int j = 5; j < 17; j++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 11, j));
        }
		for (int j = 10; j < 14; j++) {
            Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, j,
                new Position(11, j, 0, Endroits.milieu_route32_1, Orientation.dos)), Environnement.haute_herbe);
        }
		Endroits.milieu_route32_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 11, 4,
            new Position(0, 4, 0, Endroits.milieu_route32_3, Orientation.face)));
		/* fin fin route 32 */
		/* Fin route 32 */
		
		/* route 33 */
		/* debut route 33 */
		for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 1 ; i < 12 ; i++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 16));
        }
		for (int j = 2; j < 4; j++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int j = 5; j < 17; j++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.escalier_descendant, 1, 5));
		for (int i = 1; i < 3; i++) {
            for (int j = 6; j < 12; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 2 ; i < 8 ; i++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 5));
        }
		for (int i = 3; i < 8; i++) {
            for (int j = 10; j < 12; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 5; i < 7; i++) {
            for (int j = 8; j < 10; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		for (int i = 7; i < 11; i++) {
            for (int j = 12; j < 14; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.pont, i, j));
            }
        }
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 4, 2), Environnement.haute_herbe);
		for (int i = 5; i < 8; i++) {
            for (int j = 2; j < 4; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 8, 3), Environnement.haute_herbe);
		for (int i = 4 ; i < 9 ; i++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 4));
        }
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 10, 3), Environnement.haute_herbe);
		for (int i = 9 ; i < 11 ; i++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 4), Environnement.haute_herbe);
        }
		for (int i = 8; i < 11; i++) {
            for (int j = 5; j < 7; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 7, 6));
		for (int i = 7 ; i < 12 ; i++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_gauche, i, 7));
        }
		for (int i = 3; i < 5; i++) {
            for (int j = 6; j < 10; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
		for (int i = 5; i < 7; i++) {
            for (int j = 6; j < 8; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
		for (int i = 1; i < 7; i++) {
            for (int j = 12; j < 16; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
		for (int j = 8; j < 10; j++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, 7, j));
        }
		for (int i = 8; i < 11; i++) {
            for (int j = 8; j < 12; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
		for (int i = 7; i < 11; i++) {
            for (int j = 14; j < 16; j++) {
                Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 11, 3));
		for (int j = 5; j < 7; j++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 11, j));
        }
		for (int j = 8; j < 12; j++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, j));
        }
		for (int j = 14; j < 16; j++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, j));
        }
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 11, 2,
                new Position(0, 2, 0, Endroits.milieu_route32_4, Orientation.face)), Environnement.haute_herbe);
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_descendant, 11, 4,
                new Position(0, 4, 0, Endroits.milieu_route32_4, Orientation.face)));
		for (int j = 12; j < 14; j++) {
            Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.pont, 11, j,
                new Position(0, j, 0, Endroits.milieu_route32_4, Orientation.face)));
        }
		Endroits.milieu_route32_3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 4,
            new Position(11, 4, 0, Endroits.milieu_route32_2, Orientation.dos)));
		/* fin debut route 33 */
		/* milieu route 33 1 */
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 5; j < 9; j++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 0, j));
        }
		for (int j = 9; j < 12; j++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int i = 1; i < 3; i++) {
            for (int j = 7; j < 10; j++) {
                Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 1 ; i < 4 ; i++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 2), Environnement.haute_herbe);
        }
		for (int i = 5 ; i < 8 ; i++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
		for (int i = 0 ; i < 9 ; i++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 3));
        }
		for (int i = 6 ; i < 11 ; i++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 4));
        }
		for (int i = 0 ; i < 12 ; i++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 14));
        }
		for (int i = 0; i < 12; i++) {
            for (int j = 15; j < 17; j++) {
                Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
		for (int j = 0; j < 3; j++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 8, j));
        }
		for (int i = 9; i < 11; i++) {
            for (int j = 0; j < 4; j++) {
                Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 0; j < 8; j++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 11, j));
        }
		for (int j = 8; j < 10; j++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, j));
        }
		for (int i = 1; i < 6; i++) {
            for (int j = 4; j < 7; j++) {
                Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 5; i < 8; i++) {
            for (int j = 10; j < 14; j++) {
                Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 6; i < 9; i++) {
            for (int j = 8; j < 10; j++) {
                Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 8 ; i < 10 ; i++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
		Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, 12));
		for (int i = 9 ; i < 12 ; i++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 13));
        }
		Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, 2,
                new Position(11, 2, 0, Endroits.milieu_route32_3, Orientation.dos)), Environnement.haute_herbe);
		Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 0, 4,
                new Position(11, 4, 0, Endroits.milieu_route32_3, Orientation.dos)));
		for (int j = 12; j < 14; j++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, j,
                new Position(11, j, 0, Endroits.milieu_route32_3, Orientation.dos)));
        }
		for (int j = 10; j < 14; j++) {
            Endroits.milieu_route32_4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 11, j,
                new Position(0, j, 0, Endroits.fin_route32, Orientation.face)));
        }
		/* fin milieu route 33 1 */
		/* milieu route 33 2 */
		for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 5; j++) {
                Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
		for (int j = 5; j < 9; j++) {
            Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, 0, j));
        }
		for (int i = 2 ; i < 10 ; i++) {
            Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 12));
        }
		for (int i = 0; i < 10; i++) {
            for (int j = 13; j < 15; j++) {
                Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 0; i < 12; i++) {
            for (int j = 15; j < 17; j++) {
                Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, j));
            }
        }
		Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 10, 14));
		for (int j = 5; j < 11; j++) {
            Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_bas, 11, j));
        }
		for (int j = 11; j < 15; j++) {
            Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, j));
        }
		for (int j = 10; j < 14; j++) {
            Endroits.fin_route32.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, j,
                new Position(11, j, 0, Endroits.milieu_route32_4, Orientation.dos)));
        }
		/* fin fin route 32 */
		/* Fin route 32 */
		
		/* Route 33 */
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 0; i < 3; i++) {
            for (int j = 4; j < 13; j++) {
                Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
		for (int i = 0 ; i < 4 ; i++) {
            Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 13));
        }
		for (int j = 4; j < 9; j++) {
            Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 3, j));
        }
		for (int j = 10; j < 13; j++) {
            Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 3, j));
        }
		for (int i = 4 ; i < 8 ; i++) {
            Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 11));
        }
		for (int i = 4; i < 8; i++) {
            for (int j = 12; j < 14; j++) {
                Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, j));
            }
        }
		for (int i = 8 ; i < 10 ; i++) {
            Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 12));
        }
		for (int i = 8 ; i < 10 ; i++) {
            Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne, i, 13));
        }
		for (int i = 8; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 7; i < 10; i++) {
            for (int j = 2; j < 9; j++) {
                Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int j = 12; j < 14; j++) {
            Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_haut, 9, j));
        }
		for (int i = 10; i < 12; i++) {
            for (int j = 0; j < 14; j++) {
                Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.debut_route33.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(5, 10, 0, Endroits.quartier_puit_ecorcia, Orientation.gauche)));
		/* fin route 33 */
		
		/* route 34 */
		/* debut route 34 */
		for (int j = 2 ; j < 9 ; j++) {
			Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
		}
		for (int i = 0 ; i < 5 ; i++) {
            Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
		for (int i = 0 ; i < 8 ; i++) {
            for (int j = 8 ; j < 11 ; j++) {
                Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 1 ; i < 4 ; i++) {
            for (int j = 4 ; j < 8 ; j++) {
                Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 3, 3), Environnement.haute_herbe);
		for (int i = 4 ; i < 8 ; i++) {
            for (int j = 5 ; j < 8 ; j++) {
                Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 3 ; j < 5 ; j++) {
			Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, j));
		}
		for (int i = 5 ; i < 7 ; i++) {
            Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 0));
        }
		Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 1,
                new Position(7, 5, 0, Endroits.quartierBoutique_doublonville, Orientation.dos)));
		for (int j = 0 ; j < 2 ; j++) {
            Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.mer, 7, j,
                new Position(0, j, 0, Endroits.milieu_route34, Orientation.face)));
        }
		for (int j = 2 ; j < 4 ; j++) {
            Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 7, j,
                new Position(0, j, 0, Endroits.milieu_route34, Orientation.face)), Environnement.haute_herbe);
        }
		Endroits.debut_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 4,
                new Position(0, 4, 0, Endroits.milieu_route34, Orientation.face)));
		/* fin debut route 34 */	
		/* milieu route 34 */
		for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
		for (int i = 1 ; i < 7 ; i++) {
            Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 0));
        }
		for (int i = 1 ; i < 7 ; i++) {
            Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 1));
        }
		for (int i = 0 ; i < 2 ; i++) {
            for (int j = 5 ; j < 10 ; j++) {
                Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 1 ; i < 3 ; i++) {
            for (int j = 2 ; j < 4 ; j++) {
                Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 2 ; i < 4 ; i++) {
            for (int j = 8 ; j < 10 ; j++) {
                Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 3 ; i < 5 ; i++) {
            for (int j = 3 ; j < 7 ; j++) {
                Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 5, 6), Environnement.haute_herbe);
		for (int j = 3 ; j < 7 ; j++) {
			Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 6, j), Environnement.haute_herbe);
		}
		for (int j = 0 ; j < 2 ; j++) {
            Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.mer, 0, j,
                new Position(7, j, 0, Endroits.debut_route34, Orientation.dos)));
        }
		for (int j = 2 ; j < 4 ; j++) {
            Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, j,
                new Position(7, j, 0, Endroits.debut_route34, Orientation.dos)), Environnement.haute_herbe);
        }
		Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 4,
                new Position(7, 4, 0, Endroits.debut_route34, Orientation.dos)));
		Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.mer, 7, 0,
                new Position(0, 0, 0, Endroits.fin_route34, Orientation.face)));
		for (int j = 1 ; j < 3 ; j++) {
            Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, j,
                new Position(0, j, 0, Endroits.fin_route34, Orientation.face)));
        }
		for (int j = 3 ; j < 7 ; j++) {
            Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 7, j,
                new Position(0, j, 0, Endroits.fin_route34, Orientation.face)), Environnement.haute_herbe);
        }
		for (int j = 7 ; j < 9 ; j++) {
            Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, j,
                new Position(0, j, 0, Endroits.fin_route34, Orientation.face)));
        }
		Endroits.milieu_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 9,
                new Position(0, 9, 0, Endroits.fin_route34, Orientation.face)));
		/* fin milieu route 34 */
		
		
		/* fin route 34 */
		for (int i = 1 ; i < 8 ; i++) {
            Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mer, i, 0));
        }
		for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 1 ; i < 4 ; i++) {
            for (int j = 3 ; j < 7 ; j++) {
                Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 4 ; i < 6 ; i++) {
            for (int j = 1 ; j < 3 ; j++) {
                Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 4 ; i < 6 ; i++) {
            for (int j = 3 ; j < 5 ; j++) {
                Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 4 ; i < 6 ; i++) {
            for (int j = 8 ; j < 10 ; j++) {
                Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
		for (int i = 6 ; i < 8 ; i++) {
            for (int j = 1 ; j < 5 ; j++) {
                Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 6 ; i < 8 ; i++) {
            for (int j = 6 ; j < 10 ; j++) {
                Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.mer, 0, 0,
                new Position(7, 0, 0, Endroits.milieu_route34, Orientation.dos)));
		for (int j = 1 ; j < 3 ; j++) {
            Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(7, j, 0, Endroits.milieu_route34, Orientation.dos)));
        }
		for (int j = 3 ; j < 7 ; j++) {
            Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, j,
                new Position(7, j, 0, Endroits.milieu_route34, Orientation.dos)), Environnement.haute_herbe);
        }
		for (int j = 7 ; j < 9 ; j++) {
            Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, j,
                new Position(7, j, 0, Endroits.milieu_route34, Orientation.dos)));
        }
		Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 9,
                new Position(7, 9, 0, Endroits.milieu_route34, Orientation.dos)));
		Endroits.fin_route34.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 5,
                new Position(2, 2, Endroits.bois_aux_chene1)));
		/* fin fin route 34 */
		/* fin route 34 */
        
        /* Route 35 */
        /* debut Route 35 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 5 ; j < 9 ; j++) {
            Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, j));
        }
        for (int j = 1 ; j < 5 ; j++) {
            Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, 0, j));
        }
        for (int i = 6 ; i < 8 ; i++) {
            for (int j = 4 ; j < 7 ; j++) {
                Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1 ; i < 4 ; i++) {
            for (int j = 8 ; j < 10 ; j++) {
                Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 1 ; j < 3 ; j++) {
                Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1 ; i < 2 ; i++) {
            for (int j = 3 ; j < 7 ; j++) {
                Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, j,
                new Position(0, 5, Endroits.quartierArene_doublonville)));
        }
        for (int j = 5 ; j < 7 ; j++) {
            Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, j,
                new Position(7, j+1, 0, Endroits.milieu_route35, Orientation.dos)));
        }
		for (int j = 8 ; j < 10 ; j++) {
            Endroits.debut_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, j,
                new Position(7, j, 0, Endroits.milieu_route35, Orientation.dos)), Environnement.haute_herbe);
        }
        /* Fin debut Route 35 */
        /* milieu Route 35 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 2 ; i < 8 ; i++) {
            for (int j = 1 ; j < 6 ; j++) {
                Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
        for (int i = 0 ; i < 7 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 8 ; j < 10 ; j++) {
                Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 4 ; j < 6 ; j++) {
                Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 1, j));
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, j,
                new Position(7, j, 0, Endroits.fin_route35, Orientation.dos)));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 0, j,
                new Position(7, j, 0, Endroits.fin_route35, Orientation.dos)), Environnement.haute_herbe);
        }
        for (int j = 6 ; j < 8 ; j++) {
            Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, j,
                new Position(0, j-1, Endroits.debut_route35)));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.milieu_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 7, j,
                new Position(0, j, Endroits.debut_route35)), Environnement.haute_herbe);
        }
        /* Fin milieu Route 35 */
        /* fin Route 35 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 4 ; j < 9 ; j++) {
            Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 5 ; j < 8 ; j++) {
            Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
        for (int i = 4 ; i < 6 ; i++) {
            Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 7));
        }
        for (int j = 5 ; j < 8 ; j++) {
            Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 1 ; j < 4 ; j++) {
                Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1 ; i < 7 ; i++) {
            for (int j = 8 ; j < 10 ; j++) {
                Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 5 ; j < 8 ; j++) {
                Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 1 ; j < 4 ; j++) {
            Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, j,
                new Position(0, j, Endroits.milieu_route35)));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 7, j,
                new Position(0, j, Endroits.milieu_route35)), Environnement.haute_herbe);
        }
        Endroits.fin_route35.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 9,
                new Position(7, 3, 0, Endroits.debut_route36, Orientation.dos)));
        /* Fin fin Route 35 */
        /* Fin Route 35 */
		/* Route 36 */
		/* début route 36 */
		for (int j = 0 ; j < 7 ; j++) {
            Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1 ; i < 5 ; i++) {
            Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 7));
        }
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 8));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 9));
        }
        for (int i = 0 ; i < 2 ; i++) {
            Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
		for (int j = 9 ; j < 11 ; j++) {
            Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
        for (int i = 2 ; i < 5 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 5 ; i < 8 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 6 ; i < 8 ; i++) {
            for (int j = 4 ; j < 11 ; j++) {
                Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 3,
                new Position(0, 9, 0, Endroits.fin_route35, Orientation.face)));
		Endroits.debut_route36.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 5, 10,
                new Position(5, 0, 0, Endroits.milieu_route36, Orientation.droite)));
		/* fin début route 36 */
		/* milieu route 36 */
        for (int i = 0 ; i < 4 ; i++) {
            Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
		for (int i = 0 ; i < 2 ; i++) {
            for (int j = 2 ; j < 5 ; j++) {
                Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 0 ; i < 2 ; i++) {
            for (int j = 6 ; j < 10 ; j++) {
                Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
		for (int j = 8 ; j < 10 ; j++) {
            Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
		for (int j = 1 ; j < 7 ; j++) {
            Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
		for (int j = 8 ; j < 10 ; j++) {
            Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
		for (int j = 0 ; j < 7 ; j++) {
            Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, j));
        }
		for (int j = 1 ; j < 5 ; j++) {
			Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 5, j), Environnement.haute_herbe);
		}
		for (int j = 5 ; j < 9 ; j++) {
            Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
		for (int j = 0 ; j < 11 ; j++) {
            Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
		Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, 10));
		Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 5, 0,
                new Position(5, 10, 0, Endroits.debut_route36, Orientation.gauche)));
		Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 5, 10,
                new Position(2, 0, 0, Endroits.fin_route36, Orientation.droite)), Environnement.haute_herbe);
		Endroits.milieu_route36.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 6, 10,
                new Position(3, 0, 0, Endroits.fin_route36, Orientation.droite)));
		/* fin milieu route 36*/
		/* fin route 36 */
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 11 ; j++) {
                Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, 0));
		Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, 10));
        for (int i = 4 ; i < 6 ; i++) {
            Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
		Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, 1));
		for (int j = 6 ; j < 11 ; j++) {
            Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
		for (int i = 6 ; i < 8 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 6 ; i < 8 ; i++) {
            for (int j = 5 ; j < 11 ; j++) {
                Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(4, 10, 0, Endroits.milieu_route36, Orientation.gauche)));
		Endroits.fin_route36.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 10,
                new Position(1, 0, 0, Endroits.quartier_arene_mauville, Orientation.droite)));
		/* Fin Route 36 */
		/* Route 46*/
		for (int j = 2 ; j < 10 ; j++) {
            Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 0, j));
        }
		for (int i = 0 ; i < 2 ; i++) {
            Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur_montagne_droite, i, 10));
        }
		for (int i = 2 ; i < 8 ; i++) {
            Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int i = 6 ; i < 8 ; i++) {
            for (int j = 0 ; j < 8 ; j++) {
                Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 3 ; i < 6 ; i++) {
            Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
		Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, 3));
        for (int j = 2 ; j < 10 ; j++) {
            Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 1, j), Environnement.haute_herbe);
        }
        for (int j = 2 ; j < 8 ; j++) {
            Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 2, j), Environnement.haute_herbe);
        }
        for (int i = 3 ; i < 5 ; i++) {
            for (int j = 3 ; j < 7 ; j++) {
                Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 4 ; j < 6 ; j++) {
            Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 5, j), Environnement.haute_herbe);
        }
		Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 8,
            new Position(0, 9, 0, Endroits.milieu_route29, Orientation.face)));
		Endroits.fin_route46.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 9,
            new Position(0, 10, 0, Endroits.milieu_route29, Orientation.face)));
		/* Fin Route 46 */
        
        /* Route 101 */
        for (int i = 8 ; i < 10 ; i++) {
            for (int j = 6 ; j < 10 ; j++) {
                Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 9));
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 6));
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, j));
        }
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, 0));
        for (int j = 0 ; j < 4 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 0));
        for (int j = 6 ; j < 10 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, j));
        }
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, 9));
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 5 ; i < 7 ; i++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 1));
        }
        for (int i = 3 ; i < 5 ; i++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 7));
        for (int j = 4 ; j < 6 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        for (int j = 1 ; j < 6 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 3, j));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 7, j), Environnement.haute_herbe);
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 8, j), Environnement.haute_herbe);
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 2, j), Environnement.haute_herbe);
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 1, j), Environnement.haute_herbe);
        }
        for (int i = 5 ; i < 7 ; i++) {
            for (int j = 6 ; j < 9 ; j++) {
                Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 4, 7), Environnement.haute_herbe);
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 7, 7), Environnement.haute_herbe);
        for (int i = 1 ; i < 3 ; i++) {
            for (int j = 6 ; j < 8 ; j++) {
                Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 9, 5,
                new Position(0, 5, Endroits.quartier_habitant_bourg_en_vol)));
        Endroits.debut_route101.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 4,
                new Position(9, 4, Endroits.quartier_habitant_rosyeres)));
        /* Fin Route 101 */
        
        
        
        /* Route 201 */
        /* debut route 201 */
        for (int i = 8 ; i < 12 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 3 ; j < 10 ; j++) {
                Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0 ; j < 3 ; j++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 1));
        }
        for (int i = 1 ; i < 8 ; i++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int j = 1 ; j < 3 ; j++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, 1));
        Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, 7));
        for (int j = 7 ; j < 9 ; j++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        for (int j = 4 ; j < 7 ; j++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        for (int i = 3 ; i < 6 ; i++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, i, 4));
        }
        for (int i = 3 ; i < 6 ; i++) {
            Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 9,
                new Position(i, 0, Endroits.milieu_route201_1)));
        }
        Endroits.debut_route201.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 9,
                new Position(7, 0, Endroits.milieu_route201_1)));
        /* fin debut route 201 */
        /* milieu route 201 */
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 9 ; i < 12 ; i++) {
            for (int j = 0 ; j < 7 ; j++) {
                Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0 ; j < 4 ; j++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, j));
        }
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
        for (int j = 2 ; j < 4 ; j++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 6, j));
        }
        for (int j = 5 ; j < 7 ; j++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, j));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        for (int j = 4 ; j < 10 ; j++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 9));
        for (int i = 9 ; i < 12 ; i++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 9));
        }
        for (int i = 4 ; i < 6 ; i++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 9,
                new Position(i, 0, Endroits.milieu_route201_2)));
        }
        for (int i = 7 ; i < 9 ; i++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 9,
                new Position(7, 0, Endroits.milieu_route201_2)));
        }
        for (int j = 7 ; j < 9 ; j++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 11, j,
                new Position(0, 5, Endroits.quartier_habitant_bonaugure)));
        }
        for (int i = 3 ; i < 6 ; i++) {
            Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 0,
                new Position(i, 9, Endroits.debut_route201)));
        }
        Endroits.milieu_route201_1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 0,
                new Position(7, 9, Endroits.debut_route201)));
        /* fin milieu route 201 */
        /* milieu route 201 */
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 9 ; i < 12 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, j));
        }
        for (int j = 0 ; j < 2 ; j++) {
            Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
        Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 3));
        Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 6));
        for (int j = 8 ; j < 10 ; j++) {
            Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
        for (int j = 0 ; j < 6 ; j++) {
            Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 6, j));
        }
        for (int i = 7 ; i < 8 ; i++) {
            for (int j = 1 ; j < 6 ; j++) {
                Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 4 ; i < 6 ; i++) {
            for (int j = 5 ; j < 9 ; j++) {
                Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int j = 6 ; j < 9 ; j++) {
            Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 7, j));
        }
        for (int i = 4 ; i < 8 ; i++) {
            Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, i, 9,
                new Position(i, 0, Endroits.fin_route201)));
        }
        Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.haute_herbe, 7, 0,
                new Position(7, 9, Endroits.milieu_route201_1)));
        for (int i = 4 ; i < 6 ; i++) {
            Endroits.milieu_route201_2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 0,
                new Position(i, 9, Endroits.milieu_route201_1)));
        }
        /* fin milieu route 201 */
        /* fin route 201 */
        for (int j = 0 ; j < 12 ; j++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 10 ; i < 12 ; i++) {
            for (int j = 0 ; j < 12 ; j++) {
                Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 4 ; i < 10 ; i++) {
            for (int j = 9 ; j < 12 ; j++) {
                Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int j = 0 ; j < 3 ; j++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, j));
        }
        for (int j = 3 ; j < 9 ; j++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, 9, j), Environnement.haute_herbe);
        }
        for (int i = 1 ; i < 6 ; i++) {
            for (int j = 1 ; j < 6 ; j++) {
                Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int j = 1 ; j < 9 ; j++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 7, j));
        }
        Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 7, 8));
        for (int i = 3 ; i < 6 ; i++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 6));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int j = 7 ; j < 9 ; j++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.bordure, 4, j));
        }
        for (int j = 7 ; j < 9 ; j++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, 5, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 6), Environnement.haute_herbe);
        }
        for (int i = 2 ; i < 4 ; i++) {
            for (int j = 7 ; j < 11 ; j++) {
                Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.chemin, i, j));
            }
        }
        for (int i = 1 ; i < 4 ; i++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 11,
                new Position(2, 0, Endroits.quartier_habitant_littorella)));
        }
        Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 0,
                new Position(7, 9, Endroits.milieu_route201_2)));
        for (int i = 4 ; i < 7 ; i++) {
            Endroits.fin_route201.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, i, 0,
                new Position(i, 9, Endroits.milieu_route201_2)));
        }
        /* fin fin route 201 */
        /* Fin Route 201 */
    }

    private void modificationQuartierForet() {
        /* Foret de jade */
        /* foret de jade 1 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 0 ; j < 7 ; j++) {
            Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 8 ; j < 11 ; j++) {
            Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1 ; i < 5; i++) {
            for (int j = 1; j < 3; j++) {
                Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 2 ; i < 4; i++) {
            for (int j = 3; j < 5; j++) {
                Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1 ; i < 3; i++) {
            for (int j = 7; j < 10; j++) {
                Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 3 ; i < 5; i++) {
            for (int j = 5; j < 7; j++) {
                Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 7,
                new Position(0, 2, 0, Endroits.milieu_route2, Orientation.face)));
        Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 10,
                new Position(5, 0, 0, Endroits.foretDeJade2, Orientation.droite)));
        Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 10,
                new Position(6, 0, 0, Endroits.foretDeJade2, Orientation.droite)));
        Endroits.foretDeJade1.ajouterObjetEndroit(new ObjetEndroitCoffre (Type_objet.coffre, 1, 1, "", Objets.antidote));
        Endroits.foretDeJade1.setSol(Sol.herbe);
        /* fin foret de jade 1 */
        /* foret de jade 2 */
        for (int i = 0 ; i < 5 ; i++) {
            Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int i = 2 ; i < 5; i++) {
            for (int j = 5; j < 7; j++) {
                Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1 ; i < 6; i++) {
            for (int j = 7; j < 10; j++) {
                Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        for (int i = 1 ; i < 4; i++) {
            for (int j = 1; j < 3; j++) {
                Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 5, 0,
                new Position(5, 10, 0, Endroits.foretDeJade1, Orientation.gauche)));
        Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 0,
                new Position(6, 10, 0, Endroits.foretDeJade1, Orientation.gauche)));
        Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 5,
                new Position(7, 5, 0, Endroits.foretDeJade3, Orientation.dos)));
        Endroits.foretDeJade2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 0, 6,
                new Position(7, 6, 0, Endroits.foretDeJade3, Orientation.dos)));
        Endroits.foretDeJade2.setSol(Sol.herbe);
        /* fin foret de jade 2 */
        /* foret de jade 3 */
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        for (int j = 0 ; j < 5 ; j++) {
            Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 7 ; j < 10 ; j++) {
            Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 0 ; j < 10 ; j++) {
            Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 1 ; i < 3 ; i++) {
            Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 5 ; i < 7 ; i++) {
            Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 2 ; i < 7; i++) {
            for (int j = 7; j < 9; j++) {
                Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 1 ; i < 7; i++) {
            for (int j = 1; j < 4; j++) {
                Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitCoffre (Type_objet.coffre, 6, 9, "", Objets.pokeball));
        Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 5,
                new Position(0, 5, 0, Endroits.foretDeJade2, Orientation.face)));
        Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 7, 6,
                new Position(0, 6, 0, Endroits.foretDeJade2, Orientation.face)));
        Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 3, 0,
                new Position(2, 10, 0, Endroits.foretDeJade4, Orientation.gauche)));
        Endroits.foretDeJade3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.herbe, 4, 0,
                new Position(3, 10, 0, Endroits.foretDeJade4, Orientation.gauche)));
        Endroits.foretDeJade3.setSol(Sol.herbe);
        /* fin foret de jade 3 */
        /* foret de jade 4 */
        for (int j = 0 ; j < 3 ; j++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 5 ; j < 10 ; j++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, j));
        }
        for (int j = 2 ; j < 11; j++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
        for (int i = 0 ; i < 8 ; i++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
        for (int i = 4 ; i < 8 ; i++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 10));
        }
        Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 10));
        Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 7, 4));
        for (int i = 1 ; i < 6 ; i++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 8));
        }
        for (int i = 3 ; i < 7 ; i++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 5));
        }
        for (int i = 1 ; i < 6 ; i++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
        for (int i = 2 ; i < 6 ; i++) {
            Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, 1), Environnement.haute_herbe);
        }
        for (int i = 1 ; i < 5 ; i++) {
            for (int j = 5 ; j < 8; j++) {
                Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.haute_herbe, i, j), Environnement.haute_herbe);
            }
        }
        Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 3, 10,
                new Position(4, 0, 0, Endroits.foretDeJade3, Orientation.droite)));
        Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 2, 10,
                new Position(3, 0, 0, Endroits.foretDeJade3, Orientation.droite)));
        Endroits.foretDeJade4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 1,
                new Position(7, 1, 0, Endroits.fin_route2, Orientation.dos)));
        Endroits.foretDeJade4.setSol(Sol.herbe);
        /* fin foret de jade 4 */
        /* Fin foret de jade */
		
        /* Parc safari */
        /* Parc safari 1 */
        for (int i = 0 ; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 2; i++) {
            for (int j = 8; j < 15; j++) {
                Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2 ; i < 6; i++) {
            for (int j = 13; j < 15; j++) {
                Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 7 ; i < 15; i++) {
            for (int j = 13; j < 15; j++) {
                Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 13 ; i < 15; i++) {
            for (int j = 9; j < 13; j++) {
                Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 13 ; i < 15; i++) {
            for (int j = 0; j < 6; j++) {
                Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 8 ; i < 13; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2 ; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 7,
                new Position(17, 8, 0, Endroits.parc_safari3, Orientation.dos)));
        Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 6, 14,
                new Position(12, 0, 0, Endroits.parc_safari2, Orientation.droite)));
        Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 14, 7,
                new Position(0, 5, 0, Endroits.quartierParcSafari_parmanie, Orientation.face)));
        Endroits.parc_safari1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 7, 0,
                new Position(12, 14, 0, Endroits.parc_safari4, Orientation.gauche)));
        Endroits.parc_safari1.setSol(Sol.herbe);
        /* fin Parc safari 1 */
        /* Parc safari 2 */
        for (int i = 0 ; i < 2; i++) {
            for (int j = 0; j < 16; j++) {
                Endroits.parc_safari2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2 ; i < 16; i++) {
            for (int j = 14; j < 16; j++) {
                Endroits.parc_safari2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 14 ; i < 16; i++) {
            for (int j = 0; j < 14; j++) {
                Endroits.parc_safari2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 6 ; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                Endroits.parc_safari2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.parc_safari2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 4, 0,
                new Position(14, 15, 0, Endroits.parc_safari3, Orientation.gauche)));
        Endroits.parc_safari2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 12, 0,
                new Position(6, 14, 0, Endroits.parc_safari1, Orientation.gauche)));
        Endroits.parc_safari2.setSol(Sol.herbe);
        /* fin Parc safari 2 */
        /* Parc safari 3 */
        for (int i = 0 ; i < 2; i++) {
            for (int j = 0; j < 16; j++) {
                Endroits.parc_safari3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2 ; i < 18; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.parc_safari3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 2 ; i < 14; i++) {
            for (int j = 14; j < 16; j++) {
                Endroits.parc_safari3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 16 ; i < 18; i++) {
            for (int j = 10; j < 14; j++) {
                Endroits.parc_safari3.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.parc_safari3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 17, 2,
                new Position(0, 10, 0, Endroits.parc_safari4, Orientation.face)));
        Endroits.parc_safari3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 17, 5,
                new Position(0, 12, 0, Endroits.parc_safari4, Orientation.face)));
        Endroits.parc_safari3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 17, 8,
                new Position(0, 7, 0, Endroits.parc_safari1, Orientation.face)));
        Endroits.parc_safari3.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 14, 15,
                new Position(4, 0, 0, Endroits.parc_safari2, Orientation.droite)));
        Endroits.parc_safari3.setSol(Sol.herbe);
        /* fin Parc safari 3 */
        /* Parc safari 4 */
        for (int i = 0 ; i < 17; i++) {
            for (int j = 0; j < 2; j++) {
                Endroits.parc_safari4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 15 ; i < 17; i++) {
            for (int j = 2; j < 15; j++) {
                Endroits.parc_safari4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 2; i++) {
            for (int j = 2; j < 10; j++) {
                Endroits.parc_safari4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        for (int i = 0 ; i < 10; i++) {
            for (int j = 13; j < 15; j++) {
                Endroits.parc_safari4.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
        Endroits.parc_safari4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 10,
                new Position(17, 2, 0, Endroits.parc_safari3, Orientation.dos)));
        Endroits.parc_safari4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, 12,
                new Position(17, 5, 0, Endroits.parc_safari3, Orientation.dos)));
        Endroits.parc_safari4.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 12, 14,
                new Position(7, 0, 0, Endroits.parc_safari1, Orientation.droite)));
        Endroits.parc_safari4.setSol(Sol.herbe);
        /* fin Parc safari 4 */
        /* Fin Parc safari */
		
		/* Bois aux chene */
		/* Bois aux chene p1 */
		for (int i = 0 ; i < 19 ; i++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
		for (int j = 1 ; j < 23; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		for (int i = 0 ; i < 19 ; i++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 23));
        }
		for (int j = 1 ; j < 12; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, j));
        }
		Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 17));
		for (int i = 1 ; i < 4; i++) {
            for (int j = 18; j < 20; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 1 ; i < 7; i++) {
            for (int j = 20; j < 23; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 2 ; i < 7; i++) {
            for (int j = 4; j < 8; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 2 ; i < 4; i++) {
            for (int j = 8; j < 11; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, 13));
		Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, 16));
		for (int j = 8 ; j < 10; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 5, j));
        }
		for (int i = 6 ; i < 9; i++) {
            for (int j = 11; j < 15; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 9 ; j < 11; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, j));
        }
		for (int i = 8 ; i < 11; i++) {
            for (int j = 16; j < 21; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 9 ; i < 15; i++) {
            for (int j = 3; j < 6; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
		for (int i = 9 ; i < 11; i++) {
            for (int j = 6; j < 8; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.riviere, i, j));
            }
        }
		for (int j = 8 ; j < 10; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, j));
        }
		for (int j = 12 ; j < 14; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 9, j));
        }
		for (int i = 9 ; i < 11 ; i++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 21));
        }
		for (int i = 10 ; i < 12; i++) {
            for (int j = 1; j < 3; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 10, 8));
		for (int j = 12 ; j < 15; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 10, j));
        }
		for (int i = 11 ; i < 14; i++) {
            for (int j = 17; j < 21; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 6 ; j < 8; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 12, j));
        }
		Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 13, 6));
		for (int i = 13 ; i < 16; i++) {
            for (int j = 1; j < 3; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 13 ; i < 17; i++) {
            for (int j = 9; j < 11; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 12 ; j < 17; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 13, j));
        }
		for (int i = 13 ; i < 16; i++) {
            for (int j = 17; j < 19; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 13 ; i < 15; i++) {
            for (int j = 19; j < 21; j++) {
                Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 15, 8));
		for (int i = 16 ; i < 18 ; i++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 1));
        }
		Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 16, 5));
		for (int j = 7 ; j < 9; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 16, j));
        }
		for (int j = 4 ; j < 6; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 17, j));
        }
		for (int j = 10 ; j < 14; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 17, j));
        }
		for (int j = 4 ; j < 23; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 18, j));
        }
		for (int j = 1 ; j < 4; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, 2, j,
				new Position(7, 5, 0, Endroits.fin_route34, Orientation.dos)));
        }
		for (int j = 1 ; j < 4; j++) {
            Endroits.bois_aux_chene1.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 18, j,
				new Position(0, j, 0, Endroits.bois_aux_chene2, Orientation.face)));
        }
		/* Fin bois aux chene 1 */
		/* Bois aux chene 2 */
		for (int i = 0 ; i < 19 ; i++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 0));
        }
		for (int i = 0 ; i < 19 ; i++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 26));
        }
		for (int i = 0 ; i < 2; i++) {
            for (int j = 4; j < 20; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 20 ; j < 26; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 0, j));
        }
		Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 1, 3));
        for (int j = 2 ; j < 19; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 2, j));
        }
		for (int i = 3 ; i < 6 ; i++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 2));
        }
		for (int i = 3 ; i < 11; i++) {
            for (int j = 6; j < 9; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 3 ; i < 10; i++) {
            for (int j = 14; j < 18; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 22 ; j < 24; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 3, j));
        }
		for (int j = 10 ; j < 12; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, j));
        }
		Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 4, 23));
		for (int i = 5 ; i < 8; i++) {
            for (int j = 10; j < 13; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 5 ; i < 9; i++) {
            for (int j = 19; j < 21; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 5 ; i < 9 ; i++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, 22));
        }
		for (int i = 7 ; i < 14; i++) {
            for (int j = 24; j < 26; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 1 ; j < 4; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, j));
        }
		Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 8, 5));
		for (int j = 16 ; j < 18; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 10, j));
        }
		for (int i = 11 ; i < 15; i++) {
            for (int j = 2; j < 4; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 10 ; j < 13; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, j));
        }
		Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 11, 23));
		for (int j = 9 ; j < 15; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 12, j));
        }
		Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 12, 20));
		for (int i = 12 ; i < 15; i++) {
            for (int j = 21; j < 24; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int i = 13 ; i < 16; i++) {
            for (int j = 4; j < 15; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 15, 3));
		for (int i = 14 ; i < 19; i++) {
            for (int j = 7; j < 27; j++) {
                Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, i, j));
            }
        }
		for (int j = 1 ; j < 7; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.arbre, 18, j));
        }
		for (int i = 16 ; i < 18 ; i++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.escalier_montant, i, 5,
				new Position(i-13, 0, 0, Endroits.quartier_arene_ecorcia, Orientation.droite)));
        }
		for (int j = 1 ; j < 4; j++) {
            Endroits.bois_aux_chene2.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.chemin, 0, j,
				new Position(18, j, 0, Endroits.bois_aux_chene1, Orientation.dos)));
        }
		/* Fin bois aux chene 2 */
		/* Fin bois aux chene */
    }

    private void modificationVille() {
        Endroits.bourgPalette.ajouterQuartier(Endroits.quartierDresseur_bourgPalette);
        Endroits.bourgPalette.ajouterQuartier(Endroits.quartierHabitant_bourgPalette);
        Endroits.bourgPalette.ajouterQuartier(Endroits.quartierLabo_bourgPalette);
        Endroits.route1.ajouterQuartier(Endroits.debut_route1);
        Endroits.route1.ajouterQuartier(Endroits.milieu_route1);
        Endroits.route1.ajouterQuartier(Endroits.fin_route1);
        Endroits.jadielle.ajouterQuartier(Endroits.quartierBoutique_jadielle);
        Endroits.jadielle.ajouterQuartier(Endroits.quartierArene_jadielle);
        Endroits.route22.ajouterQuartier(Endroits.debut_route22);
        Endroits.route22.ajouterQuartier(Endroits.milieu_route22);
        Endroits.route22.ajouterQuartier(Endroits.fin_route22);
        Endroits.route2.ajouterQuartier(Endroits.debut_route2);
        Endroits.route2.ajouterQuartier(Endroits.milieu_route2);
        Endroits.route2.ajouterQuartier(Endroits.fin_route2);
        Endroits.foretDeJade.ajouterQuartier(Endroits.foretDeJade1);
        Endroits.foretDeJade.ajouterQuartier(Endroits.foretDeJade2);
        Endroits.foretDeJade.ajouterQuartier(Endroits.foretDeJade3);
        Endroits.foretDeJade.ajouterQuartier(Endroits.foretDeJade4);
        Endroits.argenta.ajouterQuartier(Endroits.quartierBoutique_argenta);
        Endroits.argenta.ajouterQuartier(Endroits.quartierArene_argenta);
        Endroits.route3.ajouterQuartier(Endroits.debut_route3);
        Endroits.route3.ajouterQuartier(Endroits.milieu_route3_1);
        Endroits.route3.ajouterQuartier(Endroits.milieu_route3_2);
        Endroits.route3.ajouterQuartier(Endroits.fin_route3);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_rdc_partie1, 0);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_rdc_partie2, 0);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_rdc_partie3, 0);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_rdc_partie4, 0);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_ss1_partie1, 0);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_ss1_partie2, 0);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_ss2_partie1, 0);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_ss2_partie2, 0);
		Endroits.mont_selenite_route3.ajouterSalle(Endroits.montSelenite_ss2_partie3, 0);
        Endroits.route4.ajouterQuartier(Endroits.debut_route4);
        Endroits.route4.ajouterQuartier(Endroits.milieu_route4);
        Endroits.route4.ajouterQuartier(Endroits.fin_route4);
        Endroits.azuria.ajouterQuartier(Endroits.quartierHabitant_azuria);
        Endroits.azuria.ajouterQuartier(Endroits.quartierArene_azuria);
        Endroits.route24.ajouterQuartier(Endroits.debut_route24);
        Endroits.route24.ajouterQuartier(Endroits.milieu_route24);
        Endroits.route24.ajouterQuartier(Endroits.fin_route24);
        Endroits.route25.ajouterQuartier(Endroits.debut_route25);
        Endroits.route25.ajouterQuartier(Endroits.milieu_route25_1);
        Endroits.route25.ajouterQuartier(Endroits.milieu_route25_2);
        Endroits.route25.ajouterQuartier(Endroits.fin_route25);
        Endroits.route5.ajouterQuartier(Endroits.debut_route5);
        Endroits.route5.ajouterQuartier(Endroits.fin_route5);
        Endroits.safrania.ajouterQuartier(Endroits.quartierArene_safrania);
        Endroits.safrania.ajouterQuartier(Endroits.quartierBoutique_safrania);
        Endroits.safrania.ajouterQuartier(Endroits.quartierHabitant_safrania);
        Endroits.route6.ajouterQuartier(Endroits.debut_route6);
        Endroits.route6.ajouterQuartier(Endroits.fin_route6);
        Endroits.carmin_sur_mer.ajouterQuartier(Endroits.quartierHabitant_carmin_sur_mer);
        Endroits.carmin_sur_mer.ajouterQuartier(Endroits.quartierArene_carmin_sur_mer);
        Endroits.carmin_sur_mer.ajouterQuartier(Endroits.port_carmin_sur_mer);
        Endroits.route8.ajouterQuartier(Endroits.debut_route8);
        Endroits.route8.ajouterQuartier(Endroits.fin_route8);
        Endroits.route9.ajouterQuartier(Endroits.debut_route9);
        Endroits.route9.ajouterQuartier(Endroits.milieu_route9);
        Endroits.route9.ajouterQuartier(Endroits.fin_route9);
        Endroits.route10.ajouterQuartier(Endroits.debut_route10);
        Endroits.route10.ajouterQuartier(Endroits.milieu_route10);
        Endroits.route10.ajouterQuartier(Endroits.centrale_route10);
        Endroits.route10.ajouterQuartier(Endroits.fin_route10);
        Endroits.lavanville.ajouterQuartier(Endroits.quartierBoutique_lavanville);
        Endroits.route11.ajouterQuartier(Endroits.debut_route11);
        Endroits.route11.ajouterQuartier(Endroits.milieu_route11);
        Endroits.route11.ajouterQuartier(Endroits.fin_route11);
        Endroits.route12.ajouterQuartier(Endroits.debut_route12);
        Endroits.route12.ajouterQuartier(Endroits.milieu_route12_1);
        Endroits.route12.ajouterQuartier(Endroits.milieu_route12_2);
        Endroits.route12.ajouterQuartier(Endroits.milieu_route12_3);
        Endroits.route12.ajouterQuartier(Endroits.milieu_route12_4);
        Endroits.route12.ajouterQuartier(Endroits.milieu_route12_5);
        Endroits.route12.ajouterQuartier(Endroits.milieu_route12_6);
        Endroits.route12.ajouterQuartier(Endroits.milieu_route12_7);
        Endroits.route12.ajouterQuartier(Endroits.fin_route12);
        Endroits.sombreville.ajouterQuartier(Endroits.quartierHabitant_sombreville);
        Endroits.sombreville.ajouterQuartier(Endroits.quartierArene_sombreville);
        Endroits.route13.ajouterQuartier(Endroits.debut_route13);
        Endroits.route13.ajouterQuartier(Endroits.milieu_route13_1);
        Endroits.route13.ajouterQuartier(Endroits.milieu_route13_2);
		Endroits.canyon.ajouterSalle(Endroits.canyon_p1, 0);
		Endroits.canyon.ajouterSalle(Endroits.canyon_p2, 0);
		Endroits.canyon.ajouterSalle(Endroits.canyon_p3, 0);
        Endroits.route13.ajouterQuartier(Endroits.milieu_route13_3);
        Endroits.route13.ajouterQuartier(Endroits.milieu_route13_4);
        Endroits.route13.ajouterQuartier(Endroits.fin_route13);
        Endroits.route14.ajouterQuartier(Endroits.debut_route14);
        Endroits.route14.ajouterQuartier(Endroits.milieu_route14_1);
        Endroits.route14.ajouterQuartier(Endroits.milieu_route14_2);
        Endroits.route14.ajouterQuartier(Endroits.milieu_route14_3);
        Endroits.route14.ajouterQuartier(Endroits.fin_route14);
        Endroits.route15.ajouterQuartier(Endroits.debut_route15);
        Endroits.route15.ajouterQuartier(Endroits.milieu_route15_1);
        Endroits.route15.ajouterQuartier(Endroits.milieu_route15_2);
        Endroits.route15.ajouterQuartier(Endroits.milieu_route15_3);
        Endroits.route15.ajouterQuartier(Endroits.fin_route15);
        Endroits.rocheville.ajouterQuartier(Endroits.quartierHabitant_rocheville);
        Endroits.rocheville.ajouterQuartier(Endroits.quartierManoir_rocheville);
        Endroits.parmanie.ajouterQuartier(Endroits.quartierArene_parmanie);
        Endroits.parmanie.ajouterQuartier(Endroits.quartierHabitant_parmanie);
        Endroits.parmanie.ajouterQuartier(Endroits.quartierBoutique_parmanie);
        Endroits.parmanie.ajouterQuartier(Endroits.quartierParcSafari_parmanie);
		
		
        Endroits.bourg_geon.ajouterQuartier(Endroits.quartierHabitant_bourg_geon);
        Endroits.bourg_geon.ajouterQuartier(Endroits.quartierLabo_bourg_geon);
        Endroits.bourg_geon.ajouterQuartier(Endroits.quartierParcLaboProfOrm_bourgGeon);
        Endroits.route29.ajouterQuartier(Endroits.debut_route29);
        Endroits.route29.ajouterQuartier(Endroits.milieu_route29);
        Endroits.route29.ajouterQuartier(Endroits.fin_route29);
        Endroits.ville_griotte.ajouterQuartier(Endroits.quartierHabitant_ville_griotte);
        Endroits.ville_griotte.ajouterQuartier(Endroits.quartierEau_ville_griotte);
        Endroits.route30.ajouterQuartier(Endroits.debut_route30);
        Endroits.route30.ajouterQuartier(Endroits.milieu_route30_1);
        Endroits.route30.ajouterQuartier(Endroits.milieu_route30_2);
        Endroits.route30.ajouterQuartier(Endroits.fin_route30);
        Endroits.route31.ajouterQuartier(Endroits.debut_route31);
        Endroits.route31.ajouterQuartier(Endroits.fin_route31);
        Endroits.mauville.ajouterQuartier(Endroits.quartier_arene_mauville);
        Endroits.mauville.ajouterQuartier(Endroits.quartier_tour_chetiflor_mauville);
        Endroits.mauville.ajouterQuartier(Endroits.quartier_habitant_mauville);
        Endroits.route32.ajouterQuartier(Endroits.debut_route32);
        Endroits.route32.ajouterQuartier(Endroits.milieu_route32_1);
        Endroits.route32.ajouterQuartier(Endroits.milieu_route32_2);
        Endroits.route32.ajouterQuartier(Endroits.milieu_route32_3);
        Endroits.route32.ajouterQuartier(Endroits.milieu_route32_4);
        Endroits.route32.ajouterQuartier(Endroits.fin_route32);
        Endroits.route33.ajouterQuartier(Endroits.debut_route33);
        Endroits.doublonville.ajouterQuartier(Endroits.quartierArene_doublonville);
        Endroits.doublonville.ajouterQuartier(Endroits.quartierBoutique_doublonville);
        Endroits.route46.ajouterQuartier(Endroits.debut_route46);
        Endroits.route46.ajouterQuartier(Endroits.fin_route46);
    }

    private void modificationSousZone() {
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.bourgPalette);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route1);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.jadielle);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route22);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route2);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.foretDeJade);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.argenta);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route3);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route4);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.azuria);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route24);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route25);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route5);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.safrania);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route6);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.carmin_sur_mer);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route7);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.celadopole);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route8);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route9);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route10);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.lavanville);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route11);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route12);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.sombreville);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route13);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route14);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.route15);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.rocheville);
        Endroits.zoneBourgPalette_zoneDebut_kanto.ajouterVille(Endroits.parmanie);
		
		
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.bourg_geon);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.route29);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.ville_griotte);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.route30);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.route31);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.mauville);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.route32);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.route33);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.doublonville);
        Endroits.zoneBourgGeon_zoneDebut_jhoto.ajouterVille(Endroits.route46);
    }

    private void modificationZone() {
        Endroits.zoneDebut_kanto.ajouterSousZone(Endroits.zoneBourgPalette_zoneDebut_kanto);
        Endroits.zoneDebut_jhoto.ajouterSousZone(Endroits.zoneBourgGeon_zoneDebut_jhoto);
    }

    private void modificationPays() {
        Endroits.Kanto.ajouterZone(Endroits.zoneDebut_kanto);
        Endroits.Jhoto.ajouterZone(Endroits.zoneDebut_jhoto);
    }

    public ListeDEndroit getEndroit() {
        return this.carte_pokemon;
    }
}

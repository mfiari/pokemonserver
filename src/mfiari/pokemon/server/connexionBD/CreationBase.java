/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.connexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import mfiari.lib.game.connexionBD.Methode;

/**
 *
 * @author etudiant
 */
public class CreationBase extends Methode {
    
    private Connection connection;
    
    public CreationBase () {
        super(null);
    }
    
    public CreationBase (Connection connection) {
        super(connection);
        this.connection = connection;
        if (this.estConnecter()) {
            if (!this.tableExist() || (this.getDateTableMiseAJour().before(this.getDateDerniereMiseAJour()))) {
                System.out.println("reconstruction de la base");
                this.dropAllTable();
                this.creationTablePartie();
                this.creationTableFolioEndroitVisite();
                this.creationTableEndroitVisite();
                this.creationTableRivaux();
                this.creationTableJoueur();
                this.creationTableObjet();
                this.creationTableBadgeGagne();
                this.creationTablePokemonPokedex();
                this.creationTableFolioPokemonJoueur();
                this.creationTablePokemonJoueur();
                this.creationTablePokemonStat();
                this.creationTablePokemonCapacite();
                this.creationTablePokemonStatAttribut();
                this.creationTablePokemonStatType();
                this.creationTableDresseurVaincu();
                this.creationTableEvenementsChapitre();
                this.creationTableEvenementsQuete();
                this.creationTableQuetes();
                this.creationTableQuetesAnnexe();
                this.creationTableMiseAJour();
                this.insertionDonneeTablePartie();
                this.insertionDonneeTableEndroitVisite();
                this.insertionDonneeTableRivaux();
                this.insertionDonneeTableJoueur();
                this.insertionDonneeTableObjet();
                this.insertionDonneeTablePokemonPokedex();
                this.insertionDonneeTablePokemonJoueur();
                this.insertionDonneeTablePokemonStat();
                this.insertionDonneeTablePokemonCapacite();
                this.insertionDonneeTablePokemonStatAttribut();
                this.insertionDonneeTablePokemonStatType();
                this.insertionDonneeTableEvenementsChapitre();
                this.insertionDonneeTableEvenementsQuete();
                this.insertionDonneeTableQuetes();
            }
        }
    }
    
    private void dropAllTable () {
        this.exexuteUpdate("DROP TABLE IF EXISTS mise_a_jour CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS quetes_annexe CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS quetes CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS evenements_quete CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS evenements_chapitre CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS dresseur_vaincu CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS pokemon_stat_type CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS pokemon_stat_attribut CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS pokemon_capacite CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS pokemon_stat CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS pokemon_joueur CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS folio_pokemon_joueur CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS pokemon_pokedex CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS badge_gagne CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS objet CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS joueur CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS rivaux CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS endroit_visite CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS folio_endroit_visite CASCADE");
        this.exexuteUpdate("DROP TABLE IF EXISTS partie CASCADE");
    }
    
    private boolean tableExist () {
        boolean exist = true;
        try {
            Statement statement = this.connection.createStatement() ;
            statement.executeQuery("SELECT * FROM partie");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            exist = false;
        }
        return exist;
    }
    
    private Date getDateTableMiseAJour () {
        Calendar dateMiseAJour = Calendar.getInstance();
        dateMiseAJour.set(2013, Calendar.MARCH, 05, 20, 00);
        return dateMiseAJour.getTime();
    }
    
    private Date getDateDerniereMiseAJour () {
        Calendar dateMiseAJour = Calendar.getInstance();
        dateMiseAJour.set(2013, Calendar.MARCH, 05, 19, 34);
        return dateMiseAJour.getTime();
    }
    
    private void creationTablePartie () {
        String requete = "CREATE TABLE partie ("
                + "id INT PRIMARY KEY,"
                + "temps_heure INT,"
                + "temps_min INT,"
                + "temps_seconde INT"
                + ")";
        if (this.exexuteUpdate(requete)) {
            this.insertionDonneePartie();
        }
    }
    
    private void insertionDonneePartie () {
        this.exexuteUpdate("INSERT INTO partie (id) VALUES (1)");
        this.exexuteUpdate("INSERT INTO partie (id) VALUES (2)");
        this.exexuteUpdate("INSERT INTO partie (id) VALUES (3)");
        this.exexuteUpdate("INSERT INTO partie (id) VALUES (4)");
        this.exexuteUpdate("INSERT INTO partie (id) VALUES (5)");
    }
    
    private void insertionDonneeTablePartie () {
        this.exexuteUpdate("UPDATE partie SET temps_heure = 0, temps_min = 0, temps_seconde = 0 WHERE id=5");
    }
    
    private void creationTableFolioEndroitVisite() {
        String requete = "CREATE TABLE folio_endroit_visite ("
                + "id INT,"
                + "folio_endroit_visite INT,"
                + "PRIMARY KEY (id),"
                + "FOREIGN KEY (id) REFERENCES partie(id)"
                + ")";
        if (this.exexuteUpdate(requete)) {
            this.insertionDonneeFolioEndroitVisite();
        }
    }
    
    private void insertionDonneeFolioEndroitVisite () {
        this.exexuteUpdate("INSERT INTO folio_endroit_visite (id, folio_endroit_visite) VALUES "
                + "(1, 0),"
                + "(2, 0),"
                + "(3, 0),"
                + "(4, 0),"
                + "(5, 2)");
    }
    
    private void creationTableEndroitVisite() {
        String requete = "CREATE TABLE endroit_visite ("
                + "id INT,"
                + "id_partie INT,"
                + "libelle_endroit VARCHAR(100),"
                + "PRIMARY KEY (id, id_partie),"
                + "FOREIGN KEY (id_partie) REFERENCES partie(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTableEndroitVisite () {
        this.exexuteUpdate("INSERT INTO endroit_visite (id, id_partie, libelle_endroit) VALUES "
                + "(1, 5, 'kanto'),"
                + "(2, 5, 'chambre de Rival1')");
    }
    
    private void creationTableRivaux () {
        String requete = "CREATE TABLE rivaux ("
                + "id INT,"
                + "id_partie INT,"
                + "nom varchar(32),"
                + "pokemon INT,"
                + "PRIMARY KEY (id, id_partie),"
                + "FOREIGN KEY (id_partie) REFERENCES partie(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTableRivaux () {
        this.exexuteUpdate("INSERT INTO rivaux (id, id_partie, nom, pokemon) VALUES "
                + "(1, 5, 'yellow', 1),"
                + "(2, 5, 'blue', 4)");
    }
    
    private void creationTableJoueur () {
        String requete = "CREATE TABLE joueur ("
                + "id INT,"
                + "nom varchar(32),"
                + "numero_id VARCHAR(10),"
                + "sexe VARCHAR(10),"
                + "argent INT,"
                + "positionx INT,"
                + "positiony INT,"
                + "orientation VARCHAR(10),"
                + "id_endroit INT,"
                + "id_pays_depart INT,"
                + "PRIMARY KEY (id),"
                + "FOREIGN KEY (id) REFERENCES partie(id),"
                + "FOREIGN KEY (id_endroit, id) REFERENCES endroit_visite(id, id_partie),"
                + "FOREIGN KEY (id_pays_depart, id) REFERENCES endroit_visite(id, id_partie)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTableJoueur () {
        this.exexuteUpdate("INSERT INTO joueur "
                + "(id, nom, numero_id, sexe, argent, positionx, positiony, orientation, id_endroit, id_pays_depart) "
                + "VALUES (5, 'Mike', '345865133', 'garcon', 2, 4, 0, 'face', 2, 1)");
    }
    
    private void creationTableObjet() {
        String requete = "CREATE TABLE objet ("
                + "id_joueur INT,"
                + "libelle_objet VARCHAR(100),"
                + "type_objet VARCHAR(50),"
                + "quantite INT,"
                + "PRIMARY KEY (id_joueur, libelle_objet, type_objet),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTableObjet () {
        this.exexuteUpdate("INSERT INTO objet (id_joueur, libelle_objet, type_objet, quantite) VALUES "
                + "(5, 'pokeball', 'ball', 5),"
                + "(5, 'potion', 'medicament', 2)");
    }
    
    private void creationTableBadgeGagne() {
        String requete = "CREATE TABLE badge_gagne ("
                + "id_joueur INT,"
                + "libelle_badge VARCHAR(32),"
                + "PRIMARY KEY (id_joueur, libelle_badge),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void creationTablePokemonPokedex() {
        String requete = "CREATE TABLE pokemon_pokedex ("
                + "id_joueur INT,"
                + "id_pokemon INT,"
                + "vue BOOLEAN,"
                + "pokedex BOOLEAN,"
                + "attraper BOOLEAN,"
                + "PRIMARY KEY (id_joueur, id_pokemon),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTablePokemonPokedex () {
        this.exexuteUpdate("INSERT INTO pokemon_pokedex (id_joueur, id_pokemon, vue, pokedex, attraper) VALUES "
                + "(5, 3, true, true, true),"
                + "(5, 6, true, true, true),"
                + "(5, 9, true, true, true),"
                + "(5, 18, true, true, true),"
                + "(5, 26, true, true, true),"
                + "(5, 34, true, true, true),"
                + "(5, 57, true, true, true),"
                + "(5, 59, true, true, true),"
                + "(5, 65, true, true, true),"
                + "(5, 76, true, true, true),"
                + "(5, 82, true, true, true),"
                + "(5, 94, true, true, true),"
                + "(5, 112, true, true, true),"
                + "(5, 130, true, true, true),"
                + "(5, 133, true, true, true),"
                + "(5, 141, true, true, true),"
                + "(5, 149, true, true, true)");
    }
    
    private void creationTablePokemonJoueur() {
        String requete = "CREATE TABLE pokemon_joueur ("
                + "id INT,"
                + "id_joueur INT,"
                + "id_pokemon INT,"
                + "place INT,"
                + "stocker BOOLEAN,"
                + "boite INT,"
                + "PRIMARY KEY (id, id_joueur),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTablePokemonJoueur () {
        this.exexuteUpdate("INSERT INTO pokemon_joueur (id, id_joueur, id_pokemon, place, stocker, boite) VALUES "
                + "(1, 5, 3, 1, false, 0),"
                + "(2, 5, 6, 2, false, 0),"
                + "(3, 5, 9, 3, false, 0),"
                + "(4, 5, 18, 4, false, 0),"
                + "(5, 5, 26, 5, false, 0),"
                + "(6, 5, 34, 6, false, 0),"
                + "(7, 5, 57, 1, false, 1),"
                + "(8, 5, 59, 2, false, 1),"
                + "(9, 5, 65, 3, false, 1),"
                + "(10, 5, 76, 4, false, 1),"
                + "(11, 5, 82, 5, false, 1),"
                + "(12, 5, 94, 6, false, 1),"
                + "(13, 5, 112, 7, false, 1),"
                + "(14, 5, 130, 8, false, 1),"
                + "(15, 5, 133, 9, false, 1),"
                + "(16, 5, 141, 10, false, 1),"
                + "(17, 5, 149, 11, false, 1)");
    }
    
    private void creationTableFolioPokemonJoueur() {
        String requete = "CREATE TABLE folio_pokemon_joueur ("
                + "id INT,"
                + "folio_pokemon_joueur INT,"
                + "PRIMARY KEY (id),"
                + "FOREIGN KEY (id) REFERENCES partie(id)"
                + ")";
        if (this.exexuteUpdate(requete)) {
            this.insertionDonneeFolioPokemonJoueur();
        }
    }
    
    private void insertionDonneeFolioPokemonJoueur () {
        this.exexuteUpdate("INSERT INTO folio_pokemon_joueur (id, folio_pokemon_joueur) VALUES "
                + "(1, 0),"
                + "(2, 0),"
                + "(3, 0),"
                + "(4, 0),"
                + "(5, 0)");
    }
    
    private void creationTablePokemonStat() {
        String requete = "CREATE TABLE pokemon_stat ("
                + "id_pokemon_joueur INT,"
                + "id_joueur INT,"
                + "surnom VARCHAR(32),"
                + "sexe VARCHAR(10),"
                + "brillant BOOLEAN,"
                + "statut VARCHAR(15),"
                + "niv INT,"
                + "pv DOUBLE,"
                + "amour INT,"
                + "exp INT,"
                + "PRIMARY KEY (id_pokemon_joueur, id_joueur),"
                + "FOREIGN KEY (id_pokemon_joueur, id_joueur) REFERENCES pokemon_joueur(id, id_joueur),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTablePokemonStat () {
        this.exexuteUpdate("INSERT INTO pokemon_stat "
                + "(id_pokemon_joueur, id_joueur, sexe, brillant, statut, niv, pv, amour, exp) VALUES "
                + "(1, 5, 'male', false, 'aucun', 48, 134, 200, 80000),"
                + "(2, 5, 'male', false, 'aucun', 49, 135, 220, 85000),"
                + "(3, 5, 'male', false, 'aucun', 61, 167, 460, 200000),"
                + "(4, 5, 'male', false, 'aucun', 50, 143, 240, 70000),"
                + "(5, 5, 'male', false, 'aucun', 47, 113, 180, 60000),"
                + "(6, 5, 'male', true, 'aucun', 46, 130, 160, 60000),"
                + "(7, 5, 'male', false, 'aucun', 51, 127, 260, 80000),"
                + "(8, 5, 'male', false, 'aucun', 60, 160, 440, 1740),"
                + "(9, 5, 'male', false, 'aucun', 55, 120, 340, 1640),"
                + "(10, 5, 'male', false, 'aucun', 52, 168, 280, 1580),"
                + "(11, 5, 'male', false, 'aucun', 53, 142, 300, 1600),"
                + "(12, 5, 'male', false, 'aucun', 45, 110, 140, 4400),"
                + "(13, 5, 'male', false, 'aucun', 54, 180, 320, 1620),"
                + "(14, 5, 'male', false, 'aucun', 56, 170, 360, 1660),"
                + "(15, 5, 'male', false, 'aucun', 59, 133, 420, 1720),"
                + "(16, 5, 'male', false, 'aucun', 57, 144, 380, 1680),"
                + "(17, 5, 'male', false, 'aucun', 58, 200, 400, 1700)");
    }
    
    private void creationTablePokemonCapacite() {
        String requete = "CREATE TABLE pokemon_capacite ("
                + "id_pokemon_joueur INT,"
                + "id_joueur INT,"
                + "libelle_capacite VARCHAR(32),"
                + "place INT,"
                + "nb_utilise INT,"
                + "niv INT,"
                + "pp INT,"
                + "stocker BOOLEAN,"
                + "PRIMARY KEY (id_pokemon_joueur, id_joueur, libelle_capacite),"
                + "FOREIGN KEY (id_pokemon_joueur, id_joueur) REFERENCES pokemon_joueur(id, id_joueur),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTablePokemonCapacite () {
        PreparedStatement prepare = this.prepareStatement("INSERT INTO pokemon_capacite "
                + "(id_pokemon_joueur, id_joueur, libelle_capacite, place, nb_utilise, niv, pp, stocker) VALUES "
                + "(1, 5, 'fouet lianes', 1, 50, 2, 10, false),"
                + "(1, 5, 'lance soleil', 2, 50, 2, 10, false),"
                + "(1, 5, ?, 3, 80, 3, 25, false),"
                + "(1, 5, 'belier', 4, 50, 2, 20, false),"
                + "(1, 5, 'ecrasement', 5, 50, 2, 20, false),"
                + "(1, 5, 'poudre toxik', 6, 50, 2, 35, false),"
                + "(2, 5, 'lance flamme', 1, 80, 3, 15, false),"
                + "(2, 5, 'vol', 2, 50, 2, 15, false),"
                + "(2, 5, 'frappe atlas', 3, 50, 2, 20, false),"
                + "(2, 5, 'deflagration', 4, 50, 2, 5, false),"
                + "(2, 5, 'ecrasement', 5, 50, 2, 20, false),"
                + "(2, 5, 'ultralaser', 6, 50, 2, 5, false),"
                + "(3, 5, 'hydrocanon', 1, 50, 2, 5, false),"
                + "(3, 5, 'laser glace', 2, 80, 3, 10, false),"
                + "(3, 5, ?, 3, 80, 3, 20, false),"
                + "(3, 5, 'plaquage', 4, 80, 3, 15, false),"
                + "(3, 5, 'repli', 5, 80, 3, 40, false),"
                + "(3, 5, 'danse pluie', 6, 50, 2, 5, false),"
                + "(4, 5, 'cru-aile', 1, 80, 3, 35, false),"
                + "(4, 5, 'vol', 2, 50, 2, 15, false),"
                + "(4, 5, 'aeropique', 3, 50, 2, 20, false),"
                + "(4, 5, 'bec vrille', 4, 50, 2, 20, false),"
                + "(4, 5, 'mimique', 5, 50, 2, 20, false),"
                + "(4, 5, 'vive attaque', 6, 80, 3, 30, false),"
                + "(5, 5, 'tonnerre', 1, 80, 3, 15, false),"
                + "(5, 5, 'cage eclair', 2, 50, 2, 20, false),"
                + "(5, 5, 'queue de fer', 3, 50, 2, 15, false),"
                + "(5, 5, 'ultimapoing', 4, 50, 2, 20, false),"
                + "(5, 5, 'fatal-foudre', 5, 50, 2, 10, false),"
                + "(5, 5, 'plaquage', 6, 50, 2, 15, false),"
                + "(6, 5, 'seisme', 1, 50, 2, 10, false),"
                + "(6, 5, 'ultimapoing', 2, 50, 2, 20, false),"
                + "(6, 5, 'megacorne', 3, 50, 2, 10, false),"
                + "(6, 5, 'direct_toxik', 4, 80, 3, 20, false),"
                + "(6, 5, 'ecrasement', 5, 50, 2, 20, false),"
                + "(6, 5, ?, 6, 20, 1, 5, false),"
                + "(7, 5, 'mania', 1, 80, 3, 20, false),"
                + "(7, 5, 'coup croix', 2, 50, 2, 5, false),"
                + "(7, 5, 'balayage', 3, 50, 2, 30, false),"
                + "(7, 5, 'poinglace', 4, 50, 2, 15, false),"
                + "(7, 5, 'dynamopoing', 5, 50, 2, 5, false),"
                + "(7, 5, ?, 6, 80, 3, 30, false),"
                + "(8, 5, 'lance flamme', 1, 80, 3, 15, false),"
                + "(8, 5, 'Vit.Extreme', 2, 80, 3, 5, false),"
                + "(8, 5, 'deflagration', 3, 50, 2, 5, false),"
                + "(8, 5, 'Roue De Feu', 4, 50, 2, 25, false),"
                + "(8, 5, 'Crocs Eclair', 5, 50, 2, 15, false),"
                + "(8, 5, 'morsure', 6, 50, 2, 25, false),"
                + "(9, 5, 'psyko', 1, 80, 3, 10, false),"
                + "(9, 5, ?, 2, 50, 2, 15, false),"
                + "(9, 5, 'mur lumiere', 3, 50, 2, 30, false),"
                + "(9, 5, 'soin', 4, 50, 2, 10, false),"
                + "(9, 5, 'rafale psy', 5, 50, 2, 20, false),"
                + "(10, 5, 'seisme', 1, 50, 2, 10, false),"
                + "(10, 5, 'eboulement', 2, 50, 2, 10, false),"
                + "(10, 5, 'roulade', 3, 50, 2, 20, false),"
                + "(10, 5, 'explosion', 4, 50, 2, 5, false),"
                + "(10, 5, ?, 5, 50, 2, 40, false),"
                + "(10, 5, 'boule roc', 6, 50, 2, 10, false),"
                + "(11, 5, 'tonnerre', 1, 80, 3, 15, false),"
                + "(11, 5, 'ultrason', 2, 50, 2, 20, false),"
                + "(12, 5, ?, 1, 80, 3, 15, false),"
                + "(12, 5, 'psyko', 2, 50, 2, 10, false),"
                + "(12, 5, 'hypnose', 3, 50, 2, 20, false),"
                + "(12, 5, 'poing ombre', 4, 50, 2, 20, false),"
                + "(13, 5, 'seisme', 1, 50, 2, 10, false),"
                + "(13, 5, 'boule roc', 2, 50, 2, 10, false),"
                + "(13, 5, 'eboulement', 3, 50, 2, 10, false),"
                + "(13, 5, 'megacorne', 4, 50, 2, 10, false),"
                + "(13, 5, 'queue de fer', 5, 50, 2, 15, false),"
                + "(13, 5, ?, 6, 50, 2, 25, false),"
                + "(14, 5, 'ultralaser', 1, 80, 3, 5, false),"
                + "(14, 5, 'morsure', 2, 50, 2, 25, false),"
                + "(14, 5, 'surf', 3, 50, 2, 15, false),"
                + "(14, 5, 'croc givre', 4, 50, 2, 15, false),"
                + "(14, 5, 'danse pluie', 5, 50, 2, 5, false),"
                + "(14, 5, 'hydrocanon', 6, 80, 3, 5, false),"
                + "(15, 5, 'vive attaque', 1, 50, 2, 30, false),"
                + "(15, 5, 'morsure', 2, 50, 2, 25, false),"
                + "(15, 5, 'belier', 3, 50, 2, 20, false),"
                + "(15, 5, ?, 4, 50, 2, 40, false),"
                + "(16, 5, 'boule roc', 1, 50, 2, 10, false),"
                + "(16, 5, 'eboulement', 2, 50, 2, 10, false),"
                + "(16, 5, ?, 3, 80, 3, 20, false),"
                + "(16, 5, 'tranche', 4, 50, 2, 20, false),"
                + "(16, 5, 'mega sangsue', 5, 50, 2, 20, false),"
                + "(17, 5, 'lance flamme', 1, 50, 2, 15, false),"
                + "(17, 5, 'tonnerre', 2, 50, 2, 15, false),"
                + "(17, 5, 'laser glace', 3, 50, 2, 15, false),"
                + "(17, 5, 'cru-aile', 4, 50, 2, 35, false),"
                + "(17, 5, 'draco-rage', 5, 50, 2, 10, false),"
                + "(17, 5, 'souplesse', 6, 50, 2, 20, false)"
                );
        this.setParameterString(prepare, "tranch'herbe", 1);
        this.setParameterString(prepare, "bulles D'O", 2);
        this.setParameterString(prepare, "empal'korne", 3);
        this.setParameterString(prepare, "groz'yeux", 4);
        this.setParameterString(prepare, "ball'ombre", 5);
        this.setParameterString(prepare, "boul'armure", 6);
        this.setParameterString(prepare, "ball'ombre", 7);
        this.setParameterString(prepare, "koud'korne", 8);
        this.setParameterString(prepare, "boul'armure", 9);
        this.setParameterString(prepare, "bulles D'O", 10);
        this.executeUpdatePreparedStatement(prepare);
    }
    
    private void creationTablePokemonStatAttribut() {
        String requete = "CREATE TABLE pokemon_stat_attribut ("
                + "id_pokemon_joueur INT,"
                + "id_joueur INT,"
                + "libelle_attribut VARCHAR(10),"
                + "niveau INT,"
                + "exp INT,"
                + "PRIMARY KEY (id_pokemon_joueur, id_joueur, libelle_attribut),"
                + "FOREIGN KEY (id_pokemon_joueur, id_joueur) REFERENCES pokemon_joueur(id, id_joueur),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTablePokemonStatAttribut () {
        this.exexuteUpdate("INSERT INTO pokemon_stat_attribut "
                + "(id_pokemon_joueur, id_joueur, libelle_attribut, niveau, exp) "
                + "VALUES (1, 5, 'att', 1, 0),"
                + "(1, 5, 'def', 2, 0),"
                + "(1, 5, 'attSpe', 2, 0),"
                + "(1, 5, 'defSpe', 2, 0),"
                + "(1, 5, 'vit', 1, 0),"
                + "(1, 5, 'esq', 1, 0),"
                + "(1, 5, 'prec', 1, 0),"
                + "(1, 5, 'amour', 1, 0),"
                + "(2, 5, 'att', 1, 0),"
                + "(2, 5, 'def', 1, 0),"
                + "(2, 5, 'attSpe', 2, 0),"
                + "(2, 5, 'defSpe', 1, 0),"
                + "(2, 5, 'vit', 2, 0),"
                + "(2, 5, 'esq', 2, 0),"
                + "(2, 5, 'prec', 1, 0),"
                + "(2, 5, 'amour', 1, 0),"
                + "(3, 5, 'att', 1, 0),"
                + "(3, 5, 'def', 2, 0),"
                + "(3, 5, 'attSpe', 2, 0),"
                + "(3, 5, 'defSpe', 2, 0),"
                + "(3, 5, 'vit', 1, 0),"
                + "(3, 5, 'esq', 2, 0),"
                + "(3, 5, 'prec', 1, 0),"
                + "(3, 5, 'amour', 2, 0),"
                + "(4, 5, 'att', 1, 0),"
                + "(4, 5, 'def', 1, 0),"
                + "(4, 5, 'attSpe', 1, 0),"
                + "(4, 5, 'defSpe', 1, 0),"
                + "(4, 5, 'vit', 2, 0),"
                + "(4, 5, 'esq', 2, 0),"
                + "(4, 5, 'prec', 2, 0),"
                + "(4, 5, 'amour', 1, 0),"
                + "(5, 5, 'att', 1, 0),"
                + "(5, 5, 'def', 1, 0),"
                + "(5, 5, 'attSpe', 2, 0),"
                + "(5, 5, 'defSpe', 1, 0),"
                + "(5, 5, 'vit', 1, 0),"
                + "(5, 5, 'esq', 1, 0),"
                + "(5, 5, 'prec', 2, 0),"
                + "(5, 5, 'amour', 2, 0),"
                + "(6, 5, 'att', 2, 0),"
                + "(6, 5, 'def', 2, 0),"
                + "(6, 5, 'attSpe', 1, 0),"
                + "(6, 5, 'defSpe', 1, 0),"
                + "(6, 5, 'vit', 1, 0),"
                + "(6, 5, 'esq', 1, 0),"
                + "(6, 5, 'prec', 2, 0),"
                + "(6, 5, 'amour', 1, 0),"
                + "(7, 5, 'att', 2, 0),"
                + "(7, 5, 'def', 2, 0),"
                + "(7, 5, 'attSpe', 1, 0),"
                + "(7, 5, 'defSpe', 1, 0),"
                + "(7, 5, 'vit', 1, 0),"
                + "(7, 5, 'esq', 2, 0),"
                + "(7, 5, 'prec', 1, 0),"
                + "(7, 5, 'amour', 1, 0),"
                + "(8, 5, 'att', 1, 0),"
                + "(8, 5, 'def', 1, 0),"
                + "(8, 5, 'attSpe', 2, 0),"
                + "(8, 5, 'defSpe', 1, 0),"
                + "(8, 5, 'vit', 2, 0),"
                + "(8, 5, 'esq', 1, 0),"
                + "(8, 5, 'prec', 2, 0),"
                + "(8, 5, 'amour', 2, 0),"
                + "(9, 5, 'att', 1, 0),"
                + "(9, 5, 'def', 1, 0),"
                + "(9, 5, 'attSpe', 2, 0),"
                + "(9, 5, 'defSpe', 2, 0),"
                + "(9, 5, 'vit', 1, 0),"
                + "(9, 5, 'esq', 1, 0),"
                + "(9, 5, 'prec', 2, 0),"
                + "(9, 5, 'amour', 1, 0),"
                + "(10, 5, 'att', 2, 0),"
                + "(10, 5, 'def', 2, 0),"
                + "(10, 5, 'attSpe', 1, 0),"
                + "(10, 5, 'defSpe', 1, 0),"
                + "(10, 5, 'vit', 1, 0),"
                + "(10, 5, 'esq', 1, 0),"
                + "(10, 5, 'prec', 1, 0),"
                + "(10, 5, 'amour', 1, 0),"
                + "(11, 5, 'att', 1, 0),"
                + "(11, 5, 'def', 2, 0),"
                + "(11, 5, 'attSpe', 2, 0),"
                + "(11, 5, 'defSpe', 1, 0),"
                + "(11, 5, 'vit', 1, 0),"
                + "(11, 5, 'esq', 1, 0),"
                + "(11, 5, 'prec', 2, 0),"
                + "(11, 5, 'amour', 1, 0),"
                + "(12, 5, 'att', 1, 0),"
                + "(12, 5, 'def', 1, 0),"
                + "(12, 5, 'attSpe', 2, 0),"
                + "(12, 5, 'defSpe', 2, 0),"
                + "(12, 5, 'vit', 1, 0),"
                + "(12, 5, 'esq', 2, 0),"
                + "(12, 5, 'prec', 1, 0),"
                + "(12, 5, 'amour', 1, 0),"
                + "(13, 5, 'att', 2, 0),"
                + "(13, 5, 'def', 2, 0),"
                + "(13, 5, 'attSpe', 1, 0),"
                + "(13, 5, 'defSpe', 1, 0),"
                + "(13, 5, 'vit', 1, 0),"
                + "(13, 5, 'esq', 1, 0),"
                + "(13, 5, 'prec', 1, 0),"
                + "(13, 5, 'amour', 2, 0),"
                + "(14, 5, 'att', 2, 0),"
                + "(14, 5, 'def', 2, 0),"
                + "(14, 5, 'attSpe', 1, 0),"
                + "(14, 5, 'defSpe', 2, 0),"
                + "(14, 5, 'vit', 1, 0),"
                + "(14, 5, 'esq', 1, 0),"
                + "(14, 5, 'prec', 1, 0),"
                + "(14, 5, 'amour', 1, 0),"
                + "(15, 5, 'att', 1, 0),"
                + "(15, 5, 'def', 1, 0),"
                + "(15, 5, 'attSpe', 1, 0),"
                + "(15, 5, 'defSpe', 1, 0),"
                + "(15, 5, 'vit', 2, 0),"
                + "(15, 5, 'esq', 2, 0),"
                + "(15, 5, 'prec', 2, 0),"
                + "(15, 5, 'amour', 2, 0),"
                + "(16, 5, 'att', 2, 0),"
                + "(16, 5, 'def', 1, 0),"
                + "(16, 5, 'attSpe', 2, 0),"
                + "(16, 5, 'defSpe', 1, 0),"
                + "(16, 5, 'vit', 2, 0),"
                + "(16, 5, 'esq', 1, 0),"
                + "(16, 5, 'prec', 1, 0),"
                + "(16, 5, 'amour', 1, 0),"
                + "(17, 5, 'att', 2, 0),"
                + "(17, 5, 'def', 2, 0),"
                + "(17, 5, 'attSpe', 2, 0),"
                + "(17, 5, 'defSpe', 2, 0),"
                + "(17, 5, 'vit', 2, 0),"
                + "(17, 5, 'esq', 2, 0),"
                + "(17, 5, 'prec', 2, 0),"
                + "(17, 5, 'amour', 1, 0)");
    }
    
    private void creationTablePokemonStatType() {
        String requete = "CREATE TABLE pokemon_stat_type ("
                + "id_pokemon_joueur INT,"
                + "id_joueur INT,"
                + "libelle_type VARCHAR(10),"
                + "niveau_att INT,"
                + "exp_att INT,"
                + "niveau_def INT,"
                + "exp_def INT,"
                + "PRIMARY KEY (id_pokemon_joueur, id_joueur, libelle_type),"
                + "FOREIGN KEY (id_pokemon_joueur, id_joueur) REFERENCES pokemon_joueur(id, id_joueur),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTablePokemonStatType () {
        this.exexuteUpdate("INSERT INTO pokemon_stat_type "
                + "(id_pokemon_joueur, id_joueur, libelle_type, niveau_att, exp_att, niveau_def, exp_def) "
                + "VALUES (1, 5, 'plante', 2, 0, 1, 0),"
                + "(1, 5, 'eau', 1, 0, 2, 0),"
                + "(1, 5, 'feu', 1, 0, 1, 0),"
                + "(1, 5, 'roche', 1, 0, 1, 0),"
                + "(1, 5, 'glace', 1, 0, 1, 0),"
                + "(1, 5, 'sol', 1, 0, 1, 0),"
                + "(1, 5, 'psy', 1, 0, 1, 0),"
                + "(1, 5, 'acier', 1, 0, 1, 0),"
                + "(1, 5, 'vol', 1, 0, 1, 0),"
                + "(1, 5, 'insecte', 1, 0, 1, 0),"
                + "(1, 5, 'poison', 2, 0, 1, 0),"
                + "(1, 5, 'dragon', 1, 0, 1, 0),"
                + "(1, 5, 'tenebres', 1, 0, 1, 0),"
                + "(1, 5, 'electrique', 1, 0, 1, 0),"
                + "(1, 5, 'combat', 1, 0, 1, 0),"
                + "(1, 5, 'spectre', 1, 0, 1, 0),"
                + "(1, 5, 'normal', 1, 0, 1, 0),"
                + "(2, 5, 'plante', 1, 0, 2, 0),"
                + "(2, 5, 'eau', 1, 0, 1, 0),"
                + "(2, 5, 'feu', 2, 0, 1, 0),"
                + "(2, 5, 'roche', 1, 0, 1, 0),"
                + "(2, 5, 'glace', 1, 0, 2, 0),"
                + "(2, 5, 'sol', 1, 0, 1, 0),"
                + "(2, 5, 'psy', 1, 0, 1, 0),"
                + "(2, 5, 'acier', 1, 0, 1, 0),"
                + "(2, 5, 'vol', 2, 0, 1, 0),"
                + "(2, 5, 'insecte', 1, 0, 2, 0),"
                + "(2, 5, 'poison', 1, 0, 1, 0),"
                + "(2, 5, 'dragon', 1, 0, 1, 0),"
                + "(2, 5, 'tenebres', 1, 0, 1, 0),"
                + "(2, 5, 'electrique', 1, 0, 1, 0),"
                + "(2, 5, 'combat', 1, 0, 1, 0),"
                + "(2, 5, 'spectre', 1, 0, 1, 0),"
                + "(2, 5, 'normal', 1, 0, 1, 0),"
                + "(3, 5, 'plante', 1, 0, 1, 0),"
                + "(3, 5, 'eau', 2, 0, 1, 0),"
                + "(3, 5, 'feu', 1, 0, 2, 0),"
                + "(3, 5, 'roche', 1, 0, 2, 0),"
                + "(3, 5, 'glace', 2, 0, 1, 0),"
                + "(3, 5, 'sol', 1, 0, 1, 0),"
                + "(3, 5, 'psy', 1, 0, 1, 0),"
                + "(3, 5, 'acier', 1, 0, 1, 0),"
                + "(3, 5, 'vol', 1, 0, 1, 0),"
                + "(3, 5, 'insecte', 1, 0, 1, 0),"
                + "(3, 5, 'poison', 1, 0, 1, 0),"
                + "(3, 5, 'dragon', 1, 0, 1, 0),"
                + "(3, 5, 'tenebres', 1, 0, 1, 0),"
                + "(3, 5, 'electrique', 1, 0, 1, 0),"
                + "(3, 5, 'combat', 1, 0, 1, 0),"
                + "(3, 5, 'spectre', 1, 0, 1, 0),"
                + "(3, 5, 'normal', 1, 0, 1, 0),"
                + "(4, 5, 'plante', 1, 0, 1, 0),"
                + "(4, 5, 'eau', 1, 0, 1, 0),"
                + "(4, 5, 'feu', 1, 0, 1, 0),"
                + "(4, 5, 'roche', 1, 0, 1, 0),"
                + "(4, 5, 'glace', 1, 0, 1, 0),"
                + "(4, 5, 'sol', 1, 0, 1, 0),"
                + "(4, 5, 'psy', 1, 0, 1, 0),"
                + "(4, 5, 'acier', 1, 0, 1, 0),"
                + "(4, 5, 'vol', 2, 0, 1, 0),"
                + "(4, 5, 'insecte', 1, 0, 2, 0),"
                + "(4, 5, 'poison', 1, 0, 1, 0),"
                + "(4, 5, 'dragon', 1, 0, 1, 0),"
                + "(4, 5, 'tenebres', 1, 0, 1, 0),"
                + "(4, 5, 'electrique', 1, 0, 1, 0),"
                + "(4, 5, 'combat', 1, 0, 2, 0),"
                + "(4, 5, 'spectre', 1, 0, 1, 0),"
                + "(4, 5, 'normal', 2, 0, 1, 0),"
                + "(5, 5, 'plante', 1, 0, 1, 0),"
                + "(5, 5, 'eau', 1, 0, 2, 0),"
                + "(5, 5, 'feu', 1, 0, 1, 0),"
                + "(5, 5, 'roche', 1, 0, 1, 0),"
                + "(5, 5, 'glace', 1, 0, 1, 0),"
                + "(5, 5, 'sol', 1, 0, 1, 0),"
                + "(5, 5, 'psy', 1, 0, 1, 0),"
                + "(5, 5, 'acier', 1, 0, 1, 0),"
                + "(5, 5, 'vol', 1, 0, 2, 0),"
                + "(5, 5, 'insecte', 1, 0, 1, 0),"
                + "(5, 5, 'poison', 1, 0, 1, 0),"
                + "(5, 5, 'dragon', 1, 0, 1, 0),"
                + "(5, 5, 'tenebres', 1, 0, 1, 0),"
                + "(5, 5, 'electrique', 2, 0, 1, 0),"
                + "(5, 5, 'combat', 1, 0, 1, 0),"
                + "(5, 5, 'spectre', 1, 0, 1, 0),"
                + "(5, 5, 'normal', 1, 0, 1, 0),"
                + "(6, 5, 'plante', 1, 0, 1, 0),"
                + "(6, 5, 'eau', 1, 0, 1, 0),"
                + "(6, 5, 'feu', 1, 0, 1, 0),"
                + "(6, 5, 'roche', 1, 0, 2, 0),"
                + "(6, 5, 'glace', 1, 0, 1, 0),"
                + "(6, 5, 'sol', 2, 0, 1, 0),"
                + "(6, 5, 'psy', 1, 0, 1, 0),"
                + "(6, 5, 'acier', 1, 0, 1, 0),"
                + "(6, 5, 'vol', 1, 0, 1, 0),"
                + "(6, 5, 'insecte', 1, 0, 1, 0),"
                + "(6, 5, 'poison', 2, 0, 1, 0),"
                + "(6, 5, 'dragon', 1, 0, 1, 0),"
                + "(6, 5, 'tenebres', 1, 0, 1, 0),"
                + "(6, 5, 'electrique', 1, 0, 1, 0),"
                + "(6, 5, 'combat', 1, 0, 1, 0),"
                + "(6, 5, 'spectre', 1, 0, 1, 0),"
                + "(6, 5, 'normal', 1, 0, 1, 0),"
                + "(7, 5, 'plante', 1, 0, 1, 0),"
                + "(7, 5, 'eau', 1, 0, 1, 0),"
                + "(7, 5, 'feu', 1, 0, 1, 0),"
                + "(7, 5, 'roche', 1, 0, 2, 0),"
                + "(7, 5, 'glace', 1, 0, 1, 0),"
                + "(7, 5, 'sol', 1, 0, 1, 0),"
                + "(7, 5, 'psy', 1, 0, 1, 0),"
                + "(7, 5, 'acier', 1, 0, 2, 0),"
                + "(7, 5, 'vol', 1, 0, 1, 0),"
                + "(7, 5, 'insecte', 1, 0, 1, 0),"
                + "(7, 5, 'poison', 1, 0, 1, 0),"
                + "(7, 5, 'dragon', 1, 0, 1, 0),"
                + "(7, 5, 'tenebres', 1, 0, 2, 0),"
                + "(7, 5, 'electrique', 1, 0, 1, 0),"
                + "(7, 5, 'combat', 2, 0, 1, 0),"
                + "(7, 5, 'spectre', 1, 0, 1, 0),"
                + "(7, 5, 'normal', 1, 0, 2, 0),"
                + "(8, 5, 'plante', 1, 0, 2, 0),"
                + "(8, 5, 'eau', 1, 0, 1, 0),"
                + "(8, 5, 'feu', 2, 0, 1, 0),"
                + "(8, 5, 'roche', 1, 0, 1, 0),"
                + "(8, 5, 'glace', 1, 0, 2, 0),"
                + "(8, 5, 'sol', 1, 0, 1, 0),"
                + "(8, 5, 'psy', 1, 0, 1, 0),"
                + "(8, 5, 'acier', 1, 0, 2, 0),"
                + "(8, 5, 'vol', 1, 0, 1, 0),"
                + "(8, 5, 'insecte', 1, 0, 2, 0),"
                + "(8, 5, 'poison', 1, 0, 1, 0),"
                + "(8, 5, 'dragon', 1, 0, 1, 0),"
                + "(8, 5, 'tenebres', 1, 0, 1, 0),"
                + "(8, 5, 'electrique', 1, 0, 1, 0),"
                + "(8, 5, 'combat', 1, 0, 1, 0),"
                + "(8, 5, 'spectre', 1, 0, 1, 0),"
                + "(8, 5, 'normal', 1, 0, 1, 0),"
                + "(9, 5, 'plante', 1, 0, 1, 0),"
                + "(9, 5, 'eau', 1, 0, 1, 0),"
                + "(9, 5, 'feu', 1, 0, 1, 0),"
                + "(9, 5, 'roche', 1, 0, 1, 0),"
                + "(9, 5, 'glace', 1, 0, 1, 0),"
                + "(9, 5, 'sol', 1, 0, 1, 0),"
                + "(9, 5, 'psy', 2, 0, 1, 0),"
                + "(9, 5, 'acier', 1, 0, 1, 0),"
                + "(9, 5, 'vol', 1, 0, 1, 0),"
                + "(9, 5, 'insecte', 1, 0, 1, 0),"
                + "(9, 5, 'poison', 1, 0, 2, 0),"
                + "(9, 5, 'dragon', 1, 0, 1, 0),"
                + "(9, 5, 'tenebres', 1, 0, 1, 0),"
                + "(9, 5, 'electrique', 1, 0, 1, 0),"
                + "(9, 5, 'combat', 1, 0, 2, 0),"
                + "(9, 5, 'spectre', 1, 0, 2, 0),"
                + "(9, 5, 'normal', 1, 0, 1, 0),"
                + "(10, 5, 'plante', 1, 0, 1, 0),"
                + "(10, 5, 'eau', 1, 0, 1, 0),"
                + "(10, 5, 'feu', 1, 0, 2, 0),"
                + "(10, 5, 'roche', 2, 0, 2, 0),"
                + "(10, 5, 'glace', 1, 0, 1, 0),"
                + "(10, 5, 'sol', 2, 0, 1, 0),"
                + "(10, 5, 'psy', 1, 0, 1, 0),"
                + "(10, 5, 'acier', 1, 0, 1, 0),"
                + "(10, 5, 'vol', 1, 0, 2, 0),"
                + "(10, 5, 'insecte', 1, 0, 1, 0),"
                + "(10, 5, 'poison', 1, 0, 2, 0),"
                + "(10, 5, 'dragon', 1, 0, 1, 0),"
                + "(10, 5, 'tenebres', 1, 0, 1, 0),"
                + "(10, 5, 'electrique', 1, 0, 1, 0),"
                + "(10, 5, 'combat', 1, 0, 1, 0),"
                + "(10, 5, 'spectre', 1, 0, 1, 0),"
                + "(10, 5, 'normal', 1, 0, 2, 0),"
                + "(11, 5, 'plante', 1, 0, 2, 0),"
                + "(11, 5, 'eau', 1, 0, 2, 0),"
                + "(11, 5, 'feu', 1, 0, 1, 0),"
                + "(11, 5, 'roche', 1, 0, 2, 0),"
                + "(11, 5, 'glace', 1, 0, 2, 0),"
                + "(11, 5, 'sol', 1, 0, 1, 0),"
                + "(11, 5, 'psy', 1, 0, 2, 0),"
                + "(11, 5, 'acier', 2, 0, 1, 0),"
                + "(11, 5, 'vol', 1, 0, 2, 0),"
                + "(11, 5, 'insecte', 1, 0, 2, 0),"
                + "(11, 5, 'poison', 1, 0, 1, 0),"
                + "(11, 5, 'dragon', 1, 0, 2, 0),"
                + "(11, 5, 'tenebres', 1, 0, 2, 0),"
                + "(11, 5, 'electrique', 2, 0, 1, 0),"
                + "(11, 5, 'combat', 1, 0, 1, 0),"
                + "(11, 5, 'spectre', 1, 0, 1, 0),"
                + "(11, 5, 'normal', 1, 0, 2, 0),"
                + "(12, 5, 'plante', 1, 0, 1, 0),"
                + "(12, 5, 'eau', 1, 0, 1, 0),"
                + "(12, 5, 'feu', 1, 0, 1, 0),"
                + "(12, 5, 'roche', 1, 0, 1, 0),"
                + "(12, 5, 'glace', 1, 0, 1, 0),"
                + "(12, 5, 'sol', 1, 0, 1, 0),"
                + "(12, 5, 'psy', 1, 0, 2, 0),"
                + "(12, 5, 'acier', 1, 0, 1, 0),"
                + "(12, 5, 'vol', 1, 0, 1, 0),"
                + "(12, 5, 'insecte', 1, 0, 1, 0),"
                + "(12, 5, 'poison', 1, 0, 1, 0),"
                + "(12, 5, 'dragon', 1, 0, 1, 0),"
                + "(12, 5, 'tenebres', 1, 0, 1, 0),"
                + "(12, 5, 'electrique', 1, 0, 1, 0),"
                + "(12, 5, 'combat', 1, 0, 1, 0),"
                + "(12, 5, 'spectre', 2, 0, 1, 0),"
                + "(12, 5, 'normal', 1, 0, 1, 0),"
                + "(13, 5, 'plante', 1, 0, 1, 0),"
                + "(13, 5, 'eau', 1, 0, 1, 0),"
                + "(13, 5, 'feu', 1, 0, 2, 0),"
                + "(13, 5, 'roche', 2, 0, 2, 0),"
                + "(13, 5, 'glace', 1, 0, 1, 0),"
                + "(13, 5, 'sol', 2, 0, 1, 0),"
                + "(13, 5, 'psy', 1, 0, 1, 0),"
                + "(13, 5, 'acier', 1, 0, 1, 0),"
                + "(13, 5, 'vol', 1, 0, 2, 0),"
                + "(13, 5, 'insecte', 1, 0, 1, 0),"
                + "(13, 5, 'poison', 1, 0, 2, 0),"
                + "(13, 5, 'dragon', 1, 0, 1, 0),"
                + "(13, 5, 'tenebres', 1, 0, 1, 0),"
                + "(13, 5, 'electrique', 1, 0, 1, 0),"
                + "(13, 5, 'combat', 1, 0, 1, 0),"
                + "(13, 5, 'spectre', 1, 0, 1, 0),"
                + "(13, 5, 'normal', 1, 0, 2, 0),"
                + "(14, 5, 'plante', 1, 0, 1, 0),"
                + "(14, 5, 'eau', 2, 0, 1, 0),"
                + "(14, 5, 'feu', 1, 0, 2, 0),"
                + "(14, 5, 'roche', 1, 0, 2, 0),"
                + "(14, 5, 'glace', 1, 0, 1, 0),"
                + "(14, 5, 'sol', 1, 0, 1, 0),"
                + "(14, 5, 'psy', 1, 0, 1, 0),"
                + "(14, 5, 'acier', 1, 0, 1, 0),"
                + "(14, 5, 'vol', 1, 0, 1, 0),"
                + "(14, 5, 'insecte', 1, 0, 1, 0),"
                + "(14, 5, 'poison', 1, 0, 1, 0),"
                + "(14, 5, 'dragon', 1, 0, 1, 0),"
                + "(14, 5, 'tenebres', 1, 0, 1, 0),"
                + "(14, 5, 'electrique', 1, 0, 1, 0),"
                + "(14, 5, 'combat', 1, 0, 2, 0),"
                + "(14, 5, 'spectre', 1, 0, 1, 0),"
                + "(14, 5, 'normal', 1, 0, 1, 0),"
                + "(15, 5, 'plante', 1, 0, 1, 0),"
                + "(15, 5, 'eau', 1, 0, 1, 0),"
                + "(15, 5, 'feu', 1, 0, 1, 0),"
                + "(15, 5, 'roche', 1, 0, 1, 0),"
                + "(15, 5, 'glace', 1, 0, 1, 0),"
                + "(15, 5, 'sol', 1, 0, 1, 0),"
                + "(15, 5, 'psy', 1, 0, 1, 0),"
                + "(15, 5, 'acier', 1, 0, 1, 0),"
                + "(15, 5, 'vol', 1, 0, 1, 0),"
                + "(15, 5, 'insecte', 1, 0, 1, 0),"
                + "(15, 5, 'poison', 1, 0, 1, 0),"
                + "(15, 5, 'dragon', 1, 0, 1, 0),"
                + "(15, 5, 'tenebres', 1, 0, 1, 0),"
                + "(15, 5, 'electrique', 1, 0, 1, 0),"
                + "(15, 5, 'combat', 1, 0, 1, 0),"
                + "(15, 5, 'spectre', 1, 0, 1, 0),"
                + "(15, 5, 'normal', 2, 0, 1, 0),"
                + "(16, 5, 'plante', 1, 0, 1, 0),"
                + "(16, 5, 'eau', 2, 0, 1, 0),"
                + "(16, 5, 'feu', 1, 0, 2, 0),"
                + "(16, 5, 'roche', 2, 0, 2, 0),"
                + "(16, 5, 'glace', 1, 0, 1, 0),"
                + "(16, 5, 'sol', 1, 0, 1, 0),"
                + "(16, 5, 'psy', 1, 0, 1, 0),"
                + "(16, 5, 'acier', 1, 0, 1, 0),"
                + "(16, 5, 'vol', 1, 0, 1, 0),"
                + "(16, 5, 'insecte', 1, 0, 1, 0),"
                + "(16, 5, 'poison', 1, 0, 1, 0),"
                + "(16, 5, 'dragon', 1, 0, 1, 0),"
                + "(16, 5, 'tenebres', 1, 0, 1, 0),"
                + "(16, 5, 'electrique', 1, 0, 1, 0),"
                + "(16, 5, 'combat', 1, 0, 1, 0),"
                + "(16, 5, 'spectre', 1, 0, 1, 0),"
                + "(16, 5, 'normal', 1, 0, 1, 0),"
                + "(17, 5, 'plante', 1, 0, 2, 0),"
                + "(17, 5, 'eau', 1, 0, 2, 0),"
                + "(17, 5, 'feu', 1, 0, 2, 0),"
                + "(17, 5, 'roche', 1, 0, 1, 0),"
                + "(17, 5, 'glace', 1, 0, 1, 0),"
                + "(17, 5, 'sol', 1, 0, 1, 0),"
                + "(17, 5, 'psy', 1, 0, 1, 0),"
                + "(17, 5, 'acier', 1, 0, 1, 0),"
                + "(17, 5, 'vol', 2, 0, 1, 0),"
                + "(17, 5, 'insecte', 1, 0, 1, 0),"
                + "(17, 5, 'poison', 1, 0, 1, 0),"
                + "(17, 5, 'dragon', 2, 0, 1, 0),"
                + "(17, 5, 'tenebres', 1, 0, 1, 0),"
                + "(17, 5, 'electrique', 1, 0, 1, 0),"
                + "(17, 5, 'combat', 1, 0, 2, 0),"
                + "(17, 5, 'spectre', 1, 0, 1, 0),"
                + "(17, 5, 'normal', 1, 0, 1, 0)");
    }
    
    private void creationTableDresseurVaincu() {
        String requete = "CREATE TABLE dresseur_vaincu ("
                + "id_joueur INT,"
                + "libelle_dresseur VARCHAR(32),"
                + "id_endroit INT,"
                + "PRIMARY KEY (id_joueur, libelle_dresseur),"
                + "FOREIGN KEY (id_joueur) REFERENCES joueur(id),"
                + "FOREIGN KEY (id_endroit, id_joueur) REFERENCES endroit_visite(id, id_partie)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void creationTableEvenementsChapitre() {
        String requete = "CREATE TABLE evenements_chapitre ("
                + "id_evenement INT,"
                + "nom VARCHAR(32),"
                + "fini BOOLEAN,"
                + "id_partie INT,"
                + "PRIMARY KEY (id_evenement, id_partie),"
                + "FOREIGN KEY (id_partie) REFERENCES partie(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTableEvenementsChapitre () {
        this.exexuteUpdate("INSERT INTO evenements_chapitre "
                + "(id_evenement, nom, fini, id_partie) "
                + "VALUES (1, 'chapitre1', false, 5)");
    }
    
    private void creationTableEvenementsQuete() {
        String requete = "CREATE TABLE evenements_quete ("
                + "id_evenement INT,"
                + "nom VARCHAR(32),"
                + "fini BOOLEAN,"
                + "id_evenement_chapitre INT,"
                + "id_partie INT,"
                + "PRIMARY KEY (id_evenement, id_evenement_chapitre, id_partie),"
                + "FOREIGN KEY (id_partie) REFERENCES partie(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTableEvenementsQuete () {
        this.exexuteUpdate("INSERT INTO evenements_quete "
                + "(id_evenement, nom, fini, id_evenement_chapitre, id_partie) "
                + "VALUES (1, 'le depart', true, 1, 5),"
                + "(2, '1er badge', false, 1, 5)");
    }
    
    private void creationTableQuetes() {
        String requete = "CREATE TABLE quetes ("
                + "id_evenement INT,"
                + "nom VARCHAR(32),"
                + "fini BOOLEAN,"
                + "id_evenement_quete INT,"
                + "id_evenement_chapitre INT,"
                + "id_partie INT,"
                + "PRIMARY KEY (id_evenement, id_evenement_quete, id_evenement_chapitre, id_partie),"
                + "FOREIGN KEY (id_partie) REFERENCES partie(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void insertionDonneeTableQuetes () {
        this.exexuteUpdate("INSERT INTO quetes "
                + "(id_evenement, nom, fini, id_evenement_quete, id_evenement_chapitre, id_partie) "
                + "VALUES (1, 'le depart_1', true, 1, 1, 5),"
                + "(2, 'le depart_2', true, 1, 1, 5),"
                + "(3, 'le depart_3', true, 1, 1, 5),"
                + "(4, 'le depart_4', true, 1, 1, 5),"
                + "(5, 'le depart_5', true, 1, 1, 5),"
                + "(6, 'le depart_6', true, 1, 1, 5),"
                + "(7, 'le depart_7', true, 1, 1, 5),"
                + "(8, 'le depart_8', true, 1, 1, 5),"
                + "(9, 'le depart_9', true, 1, 1, 5),"
                + "(10, 'le depart_10', true, 1, 1, 5),"
                + "(11, 'le depart_11', true, 1, 1, 5)");
    }
    
    private void creationTableQuetesAnnexe() {
        String requete = "CREATE TABLE quetes_annexe ("
                + "id_evenement INT,"
                + "nom VARCHAR(32),"
                + "actif BOOLEAN,"
                + "fini BOOLEAN,"
                + "id_evenement_chapitre INT,"
                + "id_partie INT,"
                + "PRIMARY KEY (id_evenement, id_evenement_chapitre, id_partie),"
                + "FOREIGN KEY (id_partie) REFERENCES partie(id)"
                + ")";
        this.exexuteUpdate(requete);
    }
    
    private void creationTableMiseAJour() {
        String requete = "CREATE TABLE mise_a_jour ("
                + "date_mise_a_jour TIMESTAMP"
                + ")";
        if (this.exexuteUpdate(requete)) {
            this.insertionDonneeTableMiseAJour();
        }
    }
    
    private void insertionDonneeTableMiseAJour () {
        this.exexuteUpdate("INSERT INTO mise_a_jour (date_mise_a_jour) VALUES ('2013-12-21 00:00:00')");
    }
    
}

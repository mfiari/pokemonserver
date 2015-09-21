/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.connexionBD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import mfiari.lib.game.connexionBD.Methode;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.CharacterSet;
import org.restlet.data.Form;
import org.restlet.ext.xml.DomRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;
import mfiari.pokemon.server.Global;

/**
 *
 * @author etudiant
 */
public class TransfertDonnee extends Methode {
    
    private int partie;
    private int idJoueur;
    private String BASE_URL = "http://local-jeu.webservices.pokemon.com/";
    
    public TransfertDonnee (Connection connectionHSQL, Connection connectionMySQL) {
        super(connectionHSQL);
        //super(connectionHSQL, connectionMySQL);
    }
    
    public void transfertDonnees () {
        this.parties();
        this.transfertDonneesJoueur();
        this.transfertDonneesObjet();
        this.transfertDonneesBadge();
        this.transfertDonneesPokedex();
        this.transfertDonneesPokemon();
    }
    
    private void sendPostData (String url, Form form) {
        ClientResource resource = new ClientResource(url);
        try {
            form.encode(CharacterSet.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(TransfertDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }
        Representation rep = form.getWebRepresentation();
        ChallengeResponse authentication = new ChallengeResponse(ChallengeScheme.HTTP_BASIC,Global.webserviceLogin, Global.webserviceMdp);
        resource.setChallengeResponse(authentication);
        // Test du POST
        Representation result = resource.post(rep);
        try {
            System.out.println(result.getText());
        } catch (IOException ex) {
            Logger.getLogger(TransfertDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Verifier que la ressource est mise a jour
        DomRepresentation representation = new DomRepresentation(resource.get());
        try {
            System.out.println(representation.getText());
        } catch (IOException ex) {
            Logger.getLogger(TransfertDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void sendPutData (String url, Form form) {
        ClientResource resource = new ClientResource(url);
        try {
            form.encode(CharacterSet.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(TransfertDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }
        Representation rep = form.getWebRepresentation();
        ChallengeResponse authentication = new ChallengeResponse(ChallengeScheme.HTTP_BASIC,Global.webserviceLogin, Global.webserviceMdp);
        resource.setChallengeResponse(authentication);
        // Test du PUT
        resource.put(rep);
    }

    private void parties() {
        String query = "SELECT p.id AS partie, j.nom AS nom, p.temps_heure AS temps_heure, p.temps_min AS temps_minute "
                + "FROM partie p "
                + "LEFT JOIN joueur j ON j.id = p.id "
                + "ORDER BY partie";
        ResultSet result = this.executeQuery(query);
        this.resultSet = result;
        this.pcsControlleurVue.firePropertyChange("afficherParties", null, null);
        this.partie = this.choix;
        this.idJoueur = this.partie;
        this.closeResultSet(result);
    }
    
    private void transfertDonneesJoueur () {
        String url = BASE_URL + "joueur.php";
        Form form = new Form();
        PreparedStatement prepare = this.prepareStatement("SELECT nom, numero_id, sexe, argent FROM joueur where id = ?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            form.add("nom", this.getStringResultByString(result, "nom"));
            form.add("numero_id", this.getStringResultByString(result, "numero_id"));
            form.add("sexe", this.getStringResultByString(result, "sexe"));
            form.add("argent", this.getStringResultByString(result, "argent"));
        }
        this.closeResultSet(result);
        this.sendPostData(url, form);
    }
    
    private void transfertDonneesObjet () {
        String url = BASE_URL + "objet.php";
        PreparedStatement prepare = this.prepareStatement("SELECT libelle_objet, type_objet, quantite FROM objet where id_joueur = ?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            Form form = new Form();
            form.add("libelle_objet", this.getStringResultByString(result, "libelle_objet"));
            form.add("type_objet", this.getStringResultByString(result, "type_objet"));
            form.add("quantite", this.getStringResultByString(result, "quantite"));
            this.sendPostData(url, form);
        }
        this.closeResultSet(result);
    }
    
    private void transfertDonneesBadge () {
        String url = BASE_URL + "badge.php";
        PreparedStatement prepare = this.prepareStatement("SELECT libelle_badge FROM badge_gagne where id_joueur = ?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            Form form = new Form();
            form.add("libelle_badge", this.getStringResultByString(result, "libelle_badge"));
            this.sendPostData(url, form);
        }
        this.closeResultSet(result);
    }
    
    private void transfertDonneesPokedex () {
        String url = BASE_URL + "pokedex.php";
        PreparedStatement prepare = this.prepareStatement("SELECT id_pokemon, vue, pokedex, attraper FROM pokemon_pokedex where id_joueur = ?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            Form form = new Form();
            form.add("id_pokemon", this.getStringResultByString(result, "id_pokemon"));
            form.add("vue", this.getStringResultByString(result, "vue"));
            form.add("pokedex", this.getStringResultByString(result, "pokedex"));
            form.add("attraper", this.getStringResultByString(result, "attraper"));
            this.sendPostData(url, form);
        }
        this.closeResultSet(result);
    }
    
    private void transfertDonneesPokemon () {
        String url = BASE_URL + "pokemon.php";
        PreparedStatement prepare = this.prepareStatement("SELECT pj.id, pj.id_pokemon, pj.place, pj.stocker, pj.boite, ps.surnom, ps.sexe, "
                + "ps.brillant, ps.statut, ps.niv, ps.pv, ps.amour, ps.exp FROM pokemon_joueur pj "
                + "JOIN pokemon_stat ps ON ps.id_pokemon_joueur = pj.id AND ps.id_joueur = pj.id_joueur WHERE id_joueur = ?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            Form form = new Form();
            form.add("id", this.getStringResultByString(result, "id"));
            form.add("id_pokemon", this.getStringResultByString(result, "id_pokemon"));
            form.add("place", this.getStringResultByString(result, "place"));
            form.add("stocker", this.getStringResultByString(result, "stocker"));
            form.add("boite", this.getStringResultByString(result, "boite"));
            form.add("surnom", this.getStringResultByString(result, "surnom"));
            form.add("sexe", this.getStringResultByString(result, "sexe"));
            form.add("brillant", this.getStringResultByString(result, "brillant"));
            form.add("statut", this.getStringResultByString(result, "statut"));
            form.add("niv", this.getStringResultByString(result, "niv"));
            form.add("pv", this.getStringResultByString(result, "pv"));
            form.add("amour", this.getStringResultByString(result, "amour"));
            form.add("exp", this.getStringResultByString(result, "exp"));
            this.sendPostData(url, form);
        }
        this.closeResultSet(result);
    }
    
    public void tansfertDonnee () {
        if (this.estConnecter()) {
            this.pcsControlleurVue.firePropertyChange("transfertEnCours", null, null);
            this.executeDelete();
            this.transfertPartie();
            this.transfertFolioEndroitVisite();
            this.transfertEndroitVisite();
            this.transfertRivaux();
            this.transfertJoueur();
            this.transfertObjet();
            this.transfertBadgeGagne();
            this.transfertPokemonPokedex();
            this.transfertPokemonJoueur();
            this.transfertFolioPokemonJoueur();
            this.transfertPokemonStat();
            this.transfertPokemonCapacite();
            this.transfertPokemonStatAttribut();
            this.transfertPokemonStatType();
            this.transfertDresseurVaincu();
            this.transfertEvenementChapitre();
            this.transfertEvenementQuete();
            this.transfertQuetes();
            this.transfertQuetesAnnexe();
            this.pcsControlleurVue.firePropertyChange("transfertTerminer", null, null);
        } else {
            this.pcsControlleurVue.firePropertyChange("problemeConnexion", null, null);
        }
    }
    
    private void executeDelete () {
        this.exexuteUpdateMYSQL("DELETE FROM jeu_quetes_annexe");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_quetes");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_evenements_quete");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_evenements_chapitre");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_dresseur_vaincu");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_pokemon_stat_type");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_pokemon_stat_attribut");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_pokemon_capacite");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_pokemon_stat");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_folio_pokemon_joueur");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_pokemon_joueur");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_pokemon_pokedex");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_badge_gagne");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_objet");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_joueur");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_rivaux");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_endroit_visite");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_folio_endroit_visite");
        this.exexuteUpdateMYSQL("DELETE FROM jeu_partie");
    }
    
    private void transfertPartie () {
        String query = "SELECT * FROM partie";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_partie VALUES(?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "temps_heure"), 2);
            this.setParameterInt(prepare, this.getIntResultByString(result, "temps_min"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "temps_seconde"), 4);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertFolioEndroitVisite () {
        String query = "SELECT * FROM folio_endroit_visite";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_folio_endroit_visite VALUES(?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_folio_endroit_visite_partie1"), 2);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_folio_endroit_visite_partie2"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_folio_endroit_visite_partie3"), 4);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertEndroitVisite () {
        String query = "SELECT * FROM endroit_visite";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_endroit_visite VALUES(?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_partie"), 2);
            this.setParameterString(prepare, this.getStringResultByString(result, "libelle_endroit"), 3);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertRivaux () {
        String query = "SELECT * FROM rivaux";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_rivaux VALUES(?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_partie"), 2);
            this.setParameterString(prepare, this.getStringResultByString(result, "nom"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "pokemon"), 4);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertJoueur () {
        String query = "SELECT * FROM joueur";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_joueur VALUES(?,?,?,?,?,?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_partie"), 2);
            this.setParameterString(prepare, this.getStringResultByString(result, "nom"), 3);
            this.setParameterString(prepare, this.getStringResultByString(result, "numero_id"), 4);
            this.setParameterInt(prepare, this.getIntResultByString(result, "argent"), 5);
            this.setParameterInt(prepare, this.getIntResultByString(result, "positionx"), 6);
            this.setParameterInt(prepare, this.getIntResultByString(result, "positiony"), 7);
            this.setParameterString(prepare, this.getStringResultByString(result, "orientation"), 8);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_endroit"), 9);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_pays_depart"), 10);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertObjet () {
        String query = "SELECT * FROM objet";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_objet VALUES(?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 1);
            this.setParameterString(prepare, this.getStringResultByString(result, "libelle_objet"), 2);
            this.setParameterString(prepare, this.getStringResultByString(result, "type_objet"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "quantite"), 4);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertBadgeGagne () {
        String query = "SELECT * FROM badge_gagne";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_badge_gagne VALUES(?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 1);
            this.setParameterString(prepare, this.getStringResultByString(result, "libelle_badge"), 2);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertPokemonPokedex () {
        String query = "SELECT * FROM pokemon_pokedex";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_pokemon_pokedex VALUES(?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_pokemon"), 2);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "vue"), 3);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "pokedex"), 4);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "attraper"), 5);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertPokemonJoueur () {
        String query = "SELECT * FROM pokemon_joueur";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_pokemon_joueur VALUES(?,?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 2);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_pokemon"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "place"), 4);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "stocker"), 5);
            this.setParameterInt(prepare, this.getIntResultByString(result, "boite"), 6);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertFolioPokemonJoueur () {
        String query = "SELECT * FROM folio_pokemon_joueur";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_folio_pokemon_joueur VALUES(?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_folio_pokemon_joueur_partie1"), 2);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_folio_pokemon_joueur_partie2"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_folio_pokemon_joueur_partie3"), 4);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertPokemonStat () {
        String query = "SELECT * FROM pokemon_stat";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_pokemon_stat VALUES(?,?,?,?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_pokemon_joueur"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 2);
            this.setParameterString(prepare, this.getStringResultByString(result, "surnom"), 3);
            this.setParameterString(prepare, this.getStringResultByString(result, "sexe"), 4);
            this.setParameterInt(prepare, this.getIntResultByString(result, "niv"), 5);
            this.setParameterDouble(prepare, this.getDoubleResultByString(result, "pv"), 6);
            this.setParameterInt(prepare, this.getIntResultByString(result, "amour"), 7);
            this.setParameterInt(prepare, this.getIntResultByString(result, "exp"), 8);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertPokemonCapacite () {
        String query = "SELECT * FROM pokemon_capacite";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_pokemon_capacite VALUES(?,?,?,?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_pokemon_joueur"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 2);
            this.setParameterString(prepare, this.getStringResultByString(result, "libelle_capacite"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "place"), 4);
            this.setParameterInt(prepare, this.getIntResultByString(result, "nb_utilise"), 5);
            this.setParameterInt(prepare, this.getIntResultByString(result, "niv"), 6);
            this.setParameterInt(prepare, this.getIntResultByString(result, "pp"), 7);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "stocker"), 8);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertPokemonStatAttribut () {
        String query = "SELECT * FROM pokemon_stat_attribut";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_pokemon_stat_attribut VALUES(?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_pokemon_joueur"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 2);
            this.setParameterString(prepare, this.getStringResultByString(result, "libelle_attribut"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "niveau"), 4);
            this.setParameterInt(prepare, this.getIntResultByString(result, "exp"), 5);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertPokemonStatType () {
        String query = "SELECT * FROM pokemon_stat_type";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_pokemon_stat_type VALUES(?,?,?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_pokemon_joueur"), 1);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 2);
            this.setParameterString(prepare, this.getStringResultByString(result, "libelle_type"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "niveau_att"), 4);
            this.setParameterInt(prepare, this.getIntResultByString(result, "exp_att"), 5);
            this.setParameterInt(prepare, this.getIntResultByString(result, "niveau_def"), 6);
            this.setParameterInt(prepare, this.getIntResultByString(result, "exp_def"), 7);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertDresseurVaincu () {
        String query = "SELECT * FROM dresseur_vaincu";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_dresseur_vaincu VALUES(?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_joueur"), 1);
            this.setParameterString(prepare, this.getStringResultByString(result, "libelle_dresseur"), 2);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_endroit"), 3);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertEvenementChapitre () {
        String query = "SELECT * FROM evenements_chapitre";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_evenements_chapitre VALUES(?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_evenement"), 1);
            this.setParameterString(prepare, this.getStringResultByString(result, "nom"), 2);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "fini"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_partie"), 4);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertEvenementQuete () {
        String query = "SELECT * FROM evenements_quete";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_evenements_quete VALUES(?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_evenement"), 1);
            this.setParameterString(prepare, this.getStringResultByString(result, "nom"), 2);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "fini"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_evenement_chapitre"), 4);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_partie"), 5);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertQuetes () {
        String query = "SELECT * FROM quetes";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_quetes VALUES(?,?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_evenement"), 1);
            this.setParameterString(prepare, this.getStringResultByString(result, "nom"), 2);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "fini"), 3);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_evenement_quete"), 4);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_evenement_chapitre"), 5);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_partie"), 6);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    private void transfertQuetesAnnexe () {
        String query = "SELECT * FROM quetes_annexe";
        ResultSet result = this.executeQueryHSQL(query);
        while (this.aResult(result)) {
            PreparedStatement prepare = this.prepareStatementMYSQL("INSERT INTO jeu_quetes_annexe VALUES(?,?,?,?,?,?)");
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_evenement"), 1);
            this.setParameterString(prepare, this.getStringResultByString(result, "nom"), 2);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "actif"), 3);
            this.setParameterBoolean(prepare, this.getBooleanResultByString(result, "fini"), 4);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_evenement_chapitre"), 5);
            this.setParameterInt(prepare, this.getIntResultByString(result, "id_partie"), 6);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
}

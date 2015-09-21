/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.connexionBD;

import mfiari.pokemon.server.liste.ListeDeBadge;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.liste.ListeDeCapacite;
import mfiari.pokemon.core.objet.Objet_lettre;
import mfiari.pokemon.core.objet.Objet_baie;
import mfiari.pokemon.core.objet.Objet_combat;
import mfiari.pokemon.core.objet.Objet_ball;
import mfiari.pokemon.core.objet.Objet_medicament;
import mfiari.pokemon.core.objet.Objet_rare;
import mfiari.pokemon.core.objet.Objet_divers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mfiari.lib.game.connexionBD.Methode;
import mfiari.lib.game.liste.ListeDEndroit;
import mfiari.lib.game.liste.ListeObjet;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Sexe;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.Global;
import mfiari.pokemon.core.capacite.Attributs;
import mfiari.pokemon.server.capacite.AttributsExp;
import mfiari.pokemon.server.capacite.Capacite;
import mfiari.pokemon.core.capacite.Etat;
import mfiari.pokemon.server.evenement.Evenement;
import mfiari.pokemon.server.evenement.EvenementQuete;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.DresseurClassique;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.objet.Badge;
import mfiari.pokemon.server.objet.Objet_capacite;
import mfiari.pokemon.server.objet.PC;
import mfiari.pokemon.server.objet.Pokedex;
import mfiari.pokemon.server.objet.Sac;
import mfiari.pokemon.server.type.TypeExp;
import mfiari.pokemon.server.ville.Endroit;

/**
 *
 * @author mike
 */
public class Connexion extends Methode {
    
    private int partie;
    private int idJoueur;

    public Connexion() {
        super(null);
    }

    public Connexion(Connection conn) {
        super(conn);
    }
    
    public boolean isConnected () {
        return this.estConnecter();
    }
    
    public boolean partieChoisit () {
        return this.partie != 0;
    }
    
    public int getPartie () {
        return this.partie;
    }
    
    public boolean connexionSucced (mfiari.lib.game.reseau.Connexion connexion) {
        if ("mfiari".equals(connexion.getLogin()) && "mfiari".equals(connexion.getPassword())) {
            this.partie = 1;
            return true;
        }
        if ("test".equals(connexion.getLogin()) && "test".equals(connexion.getPassword())) {
            this.partie = 2;
            return true;
        }
        return false;
    }

    public void parties() {
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

    public void CreerPartie() {
        PreparedStatement prepare = this.prepareStatement("SELECT COUNT(*) AS rowcount "
                + "FROM partie p "
                + "JOIN joueur j ON j.id = p.id "
                + "WHERE p.id = ?");
        this.setParameterInt(prepare, this.partie, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            if (this.getIntResultByString(result, "rowcount") > 0) {
                System.out.println("suppression de la partie cree");

                this.deleteAllEvenement();

                PreparedStatement prepare7 = this.prepareStatement("DELETE FROM dresseur_vaincu where id_joueur=?");
                this.setParameterInt(prepare7, this.idJoueur, 1);
                this.executeUpdatePreparedStatement(prepare7);

                this.deleteAllPokemonJoueurEquipe();
                this.deleteAllPokemonJoueurBoite();
                this.initFolioPokemonJoueur();

                PreparedStatement prepare14 = this.prepareStatement("DELETE FROM pokemon_pokedex where id_joueur=?");
                this.setParameterInt(prepare14, this.idJoueur, 1);
                this.executeUpdatePreparedStatement(prepare14);

                this.deleteAllBadge();

                this.deleteAllObjet();

                PreparedStatement prepare17 = this.prepareStatement("DELETE FROM joueur where id=?");
                this.setParameterInt(prepare17, this.partie, 1);
                this.executeUpdatePreparedStatement(prepare17);

                PreparedStatement prepare18 = this.prepareStatement("DELETE FROM rivaux where id_partie=?");
                this.setParameterInt(prepare18, this.partie, 1);
                this.executeUpdatePreparedStatement(prepare18);

                PreparedStatement prepare19 = this.prepareStatement("DELETE FROM endroit_visite where id_partie=?");
                this.setParameterInt(prepare19, this.partie, 1);
                this.executeUpdatePreparedStatement(prepare19);

                this.initFolioEndroitVisite();

                PreparedStatement prepare20 = this.prepareStatement("DELETE FROM partie where id=?");
                this.setParameterInt(prepare20, this.partie, 1);
                this.executeUpdatePreparedStatement(prepare20);

                PreparedStatement prepare21 = this.prepareStatement("insert into partie values(?,?,?,?)");
                this.setParameterInt(prepare21, this.partie, 1);
                this.setParameterInt(prepare21, 0, 2);
                this.setParameterInt(prepare21, 0, 3);
                this.setParameterInt(prepare21, 0, 4);
                this.executeUpdatePreparedStatement(prepare21);
            } else {
                this.sauvegarderPartie(0, 0, 0);
            }
        } else {
            this.sauvegarderPartie(0, 0, 0);
        }
        this.closeResultSet(result);
    }

    public void sauvegarderPartie(int temps_jeu_heure, int temps_jeu_minute, int temps_jeu_seconde) {
        this.pcsControlleurVue.firePropertyChange("sauvegarderPartie", null, null);
        PreparedStatement prepare = this.prepareStatement("UPDATE partie SET temps_heure = ?, temps_min = ?, temps_seconde = ? WHERE id=?");
        this.setParameterInt(prepare, temps_jeu_heure, 1);
        this.setParameterInt(prepare, temps_jeu_minute, 2);
        this.setParameterInt(prepare, temps_jeu_seconde, 3);
        this.setParameterInt(prepare, this.partie, 4);
        this.executeUpdatePreparedStatement(prepare);
    }

    public void finSauvegarderPartie() {
        this.pcsControlleurVue.firePropertyChange("sauvegarderPartieTerminer", null, null);
    }
    
    public int[] chargerPartie () {
        int[] time = new int[3];
        PreparedStatement prepare = this.prepareStatement("SELECT temps_heure, temps_min, temps_seconde FROM partie where id=?");
        this.setParameterInt(prepare, this.partie, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            time[0] = this.getIntResultByString(result, "temps_heure");
            time[1] = this.getIntResultByString(result, "temps_min");
            time[2] = this.getIntResultByString(result, "temps_seconde");
        }
        this.closeResultSet(result);
        return time;
    }

    private void initFolioEndroitVisite() {
        PreparedStatement prepare = this.prepareStatement("UPDATE folio_endroit_visite SET folio_endroit_visite = 0 WHERE id = ?");
        this.setParameterInt(prepare, this.partie, 1);
        this.executeUpdatePreparedStatement(prepare);
    }

    private int getFolioEndroitVisite() {
        int folio = 0;
        PreparedStatement prepare = this.prepareStatement("Select folio_endroit_visite AS folio FROM folio_endroit_visite where id=?");
        this.setParameterInt(prepare, this.partie, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            folio = this.getIntResultByString(result, "folio");
        }
        this.closeResultSet(result);
        folio++;
        PreparedStatement prepare2 = this.prepareStatement("UPDATE folio_endroit_visite SET folio_endroit_visite = ? WHERE id = ?");
        this.setParameterInt(prepare2, folio, 1);
        this.setParameterInt(prepare2, this.partie, 2);
        this.executeUpdatePreparedStatement(prepare2);
        return folio;
    }

    private void enregistrerEndroit(Endroit e) {
        /*on enregistre les villes déja visité*/
        PreparedStatement prepare = this.prepareStatement("INSERT INTO endroit_visite values(?,?,?)");
        this.setParameterInt(prepare, this.getFolioEndroitVisite(), 1);
        this.setParameterInt(prepare, this.partie, 2);
        this.setParameterString(prepare, e.getNom(), 3);
        this.executeUpdatePreparedStatement(prepare);
    }

    public void sauvegarderEndroit(ListeDEndroit carte_pokemon) {
        /*on sauvegarde les villes déja visité*/
        for (int i = 0; i < carte_pokemon.size(); i++) {
            if (carte_pokemon.getEndroit(i) != null) {
                System.out.println((i+1) + " : " + carte_pokemon.getEndroit(i));
                System.out.println("nom : " + carte_pokemon.getEndroit(i).getNom());
                System.out.println("getIdEndroit : " + this.getIdEndroit(carte_pokemon.getEndroit(i).getNom()));
                if (this.getIdEndroit(carte_pokemon.getEndroit(i).getNom()) == 0) {
                    this.enregistrerEndroit((Endroit)carte_pokemon.getEndroit(i));
                }
            }
        }
    }

    private int getIdEndroit (String nom) {
        int idEndroit = 0;
        PreparedStatement prepare = this.prepareStatement("SELECT * FROM endroit_visite where libelle_endroit=? and id_partie=?");
        this.setParameterString(prepare, nom, 1);
        this.setParameterInt(prepare, this.partie, 2);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            idEndroit = this.getIntResultByString(result, "id");
        }
        this.closeResultSet(result);
        return idEndroit;
    }
    
    private Endroit getEndroit (int id, ListeDEndroit villes) {
        Endroit e = null;
        PreparedStatement prepare = this.prepareStatement("SELECT libelle_endroit FROM endroit_visite where id_partie=? AND id=?");
        this.setParameterInt(prepare, this.partie, 1);
        this.setParameterInt(prepare, id, 2);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            e = (Endroit) villes.getEndroit(this.getStringResultByString(result, "libelle_endroit"));
        }
        System.out.println(e);
        this.closeResultSet(result);
        return e;
    }

    public ListeDEndroit chargerEndroits(ListeDEndroit villes) {
        for (int i = 0 ; i  < villes.size() ; i++) {
            System.out.println(villes.getEndroit(i).getNom());
        }
        ListeDEndroit endroits = new ListeDEndroit();
        PreparedStatement prepare = this.prepareStatement("SELECT libelle_endroit FROM endroit_visite where id_partie=?");
        this.setParameterInt(prepare, this.partie, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            System.out.println("chargerEndroits -> nom : " + this.getStringResultByString(result, "libelle_endroit"));
            endroits.ajouterEndroit(villes.getEndroit(this.getStringResultByString(result, "libelle_endroit")));
            System.out.println("chargerEndroits -> endroit : " + endroits.getEndroit(endroits.size()-1));
        }
        this.closeResultSet(result);
        return endroits;
    }

    public void enregistrerRivaux(String nom, int id) {
        PreparedStatement prepare = this.prepareStatement("insert into rivaux values(?,?,?,?)");
        this.setParameterInt(prepare, id, 1);
        this.setParameterInt(prepare, this.partie, 2);
        this.setParameterString(prepare, nom, 3);
        this.setParameterInt(prepare, 0, 4);
        this.executeUpdatePreparedStatement(prepare);
    }

    public void sauvegarderRivaux(Pokemon pk, int id) {
        if (pk != null) {
            PreparedStatement prepare = this.prepareStatement("update rivaux set pokemon = ? where id = ? AND id_partie = ?");
            this.setParameterInt(prepare, pk.getNumero(), 1);
            this.setParameterInt(prepare, id, 2);
            this.setParameterInt(prepare, this.partie, 3);
            this.executeUpdatePreparedStatement(prepare);
        }
    }

    public void enregistrerDresseur(Dresseur perso) {
        PreparedStatement prepare = this.prepareStatement("insert into joueur values(?,?,?,?,?,?,?,?,?,?)");
        this.setParameterInt(prepare, this.idJoueur, 1);
        this.setParameterString(prepare, perso.getNom(), 2);
        this.setParameterString(prepare, Integer.toString(perso.getNumeroID()), 3);
        this.setParameterString(prepare, perso.getSexe().name(), 4);
        this.setParameterInt(prepare, perso.getArgent(), 5);
        this.setParameterInt(prepare, perso.getPosition().getPositionX(), 6);
        this.setParameterInt(prepare, perso.getPosition().getPositionY(), 7);
        this.setParameterString(prepare, perso.getPosition().getOrientation().name(), 8);
        this.setParameterInt(prepare, this.getIdEndroit(perso.getPosition().getEndroit().getNom()), 9);
        this.setParameterInt(prepare, this.getIdEndroit(Global.paysDepart.getNom()), 10);
        this.executeUpdatePreparedStatement(prepare);
    }

    public void sauvegarderDresseur(Dresseur perso) {
        PreparedStatement prepare = this.prepareStatement("UPDATE joueur set argent=?, positionx=?, positiony=?, orientation=?, id_endroit=? "
                    + "where id=?");
        this.setParameterInt(prepare, perso.getArgent(), 1);
        this.setParameterInt(prepare, perso.getPosition().getPositionX(), 2);
        this.setParameterInt(prepare, perso.getPosition().getPositionY(), 3);
        this.setParameterString(prepare, perso.getPosition().getOrientation().name(), 4);
        this.setParameterInt(prepare, this.getIdEndroit(perso.getPosition().getEndroit().getNom()), 5);
        this.setParameterInt(prepare, this.idJoueur, 6);
        this.executeUpdatePreparedStatement(prepare);
    }
    
    public Dresseur chargerDresseur(ListeDEndroit villes) {
        Dresseur d = null;
        PreparedStatement prepare = this.prepareStatement("SELECT * FROM joueur where id=?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        System.out.println("id joueur : " + this.idJoueur);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            d = new DresseurClassique(this.getStringResultByString(result, "nom"), this.getIntResultByString(result, "numero_id"), 
                    this.getIntResultByString(result, "positionx"), this.getIntResultByString(result, "positiony"),
                    this.getEndroit(this.getIntResultByString(result, "id_endroit"), villes), Titre.DresseurPokemon, 
                    Orientation.valueOf(this.getStringResultByString(result, "orientation")), 
                    Sexe.valueOf(this.getStringResultByString(result, "sexe")));
            d.setArgent(this.getIntResultByString(result, "argent"));
        }
        this.closeResultSet(result);
        System.out.println(d);
        return d;
    }
    
    private void deleteAllObjet () {
        PreparedStatement prepare = this.prepareStatement("DELETE FROM objet where id_joueur=?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        this.executeUpdatePreparedStatement(prepare);
    }

    public void sauvegarderObjet(Sac sac) {
        this.deleteAllObjet();
        ListeObjet<Objet_baie> objet_baie = sac.getObjets_baie();
        for (int i = 0; i < objet_baie.size(); i++) {
            this.sauvegarderObjet(objet_baie.getObjet(i), "baie");
        }
        ListeObjet<Objet_ball> objet_ball = sac.getObjets_ball();
        for (int i = 0; i < objet_ball.size(); i++) {
            this.sauvegarderObjet(objet_ball.getObjet(i), "ball");
        }
        ListeObjet<Objet_capacite> objet_capacite = sac.getObjets_capacite();
        for (int i = 0; i < objet_capacite.size(); i++) {
            this.sauvegarderObjet(objet_capacite.getObjet(i), "ct_cs");
        }
        ListeObjet<Objet_combat> objet_combat = sac.getObjets_combat();
        for (int i = 0; i < objet_combat.size(); i++) {
            this.sauvegarderObjet(objet_combat.getObjet(i), "combat");
        }
        ListeObjet<Objet_divers> objet_divers = sac.getObjets_divers();
        for (int i = 0; i < objet_divers.size(); i++) {
            this.sauvegarderObjet(objet_divers.getObjet(i), "divers");
        }
        ListeObjet<Objet_lettre> objet_lettre = sac.getObjets_lettre();
        for (int i = 0; i < objet_lettre.size(); i++) {
            this.sauvegarderObjet(objet_lettre.getObjet(i), "lettre");
        }
        ListeObjet<Objet_medicament> objet_medicament = sac.getObjets_medicament();
        for (int i = 0; i < objet_medicament.size(); i++) {
            this.sauvegarderObjet(objet_medicament.getObjet(i), "medicament");
        }
        ListeObjet<Objet_rare> objet_rare = sac.getObjets_rare();
        for (int i = 0; i < objet_rare.size(); i++) {
            this.sauvegarderObjet(objet_rare.getObjet(i), "rare");
        }
    }
    
    private void sauvegarderObjet(Objet obj, String type) {
        PreparedStatement prepare = this.prepareStatement("insert into objet values(?,?,?,?)");
        this.setParameterInt(prepare, this.partie, 1);
        this.setParameterString(prepare, obj.getNom(), 2);
        this.setParameterString(prepare, type, 3);
        this.setParameterInt(prepare, obj.getQuantite(), 4);
        this.executeUpdatePreparedStatement(prepare);
    }

    public Sac chargerObjet(ListeObjet objets) {
        Sac sac = new Sac();
        PreparedStatement prepare = this.prepareStatement("SELECT libelle_objet, quantite FROM objet where id_joueur=?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            sac.acheter(objets.getObjet(this.getStringResultByString(result, "libelle_objet")), this.getIntResultByString(result, "quantite"));
        }
        return sac;
    }
    
    private void deleteAllBadge () {
        PreparedStatement prepare = this.prepareStatement("DELETE FROM badge_gagne where id_joueur=?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        this.executeUpdatePreparedStatement(prepare);
    }

    private int getNbBadge() {
        return 0;
    }

    public void sauvegarderBadge(ListeDeBadge badges) {
        if (badges.getNbBadge() != this.getNbBadge()) {
            this.deleteAllBadge();
            for (int i = 0; i < badges.getSizeBadgeKanto(); i++) {
                this.sauvegarderBadge(badges.getBadgeKanto(i));
            }
            for (int i = 0; i < badges.getSizeBadgeLigueOrange(); i++) {
                this.sauvegarderBadge(badges.getBadgeLigueOrange(i));
            }
            for (int i = 0; i < badges.getSizeBadgeJohto(); i++) {
                this.sauvegarderBadge(badges.getBadgeJohto(i));
            }
            for (int i = 0; i < badges.getSizeBadgeHoenn(); i++) {
                this.sauvegarderBadge(badges.getBadgeHoenn(i));
            }
            for (int i = 0; i < badges.getSizeBadgeSinnoh(); i++) {
                this.sauvegarderBadge(badges.getBadgeSinnoh(i));
            }
        }
    }

    private void sauvegarderBadge(Badge badge) {
        if (badge != null) {
            PreparedStatement prepare = this.prepareStatement("insert into badge_gagne values(?,?)");
            this.setParameterInt(prepare, this.partie, 1);
            this.setParameterString(prepare, badge.getNom(), 2);
            this.executeUpdatePreparedStatement(prepare);
        }
    }
    
    public ListeDeBadge chargerBadge() {
        ListeDeBadge badges = new ListeDeBadge();
        return badges;
    }
    
    private boolean pokemonPokedexSauvegarder(int idPokemon) {
        PreparedStatement prepare = this.prepareStatement("SELECT id_pokemon FROM pokemon_pokedex where id_pokemon=? and id_joueur=?");
        this.setParameterInt(prepare, idPokemon, 1);
        this.setParameterInt(prepare, this.partie, 2);
        ResultSet result = this.executePreparedStatement(prepare);
        return this.aResult(result);
    }
    
    public void sauvegarderPokemonPokedex(Pokedex pokedex) {
        if (pokedex != null) {
            for (int i = 0 ; i < pokedex.size() ; i++) {
                if (pokedex.aPokemon(i) && !this.pokemonPokedexSauvegarder(i+1)) {
                    PreparedStatement prepare = this.prepareStatement("insert into pokemon_pokedex values(?,?,?,?,?)");
                    this.setParameterInt(prepare, this.partie, 1);
                    this.setParameterInt(prepare, i+1, 2);
                    this.setParameterBoolean(prepare, pokedex.aPokemon(i), 3);
                    this.setParameterBoolean(prepare, pokedex.estPokedex(i), 4);
                    this.setParameterBoolean(prepare, pokedex.estCapture(i), 5);
                    this.executeUpdatePreparedStatement(prepare);
                }
            }
        }
    }
    
    public Pokedex chargerPokedex(ListeDePokemon pokemons) {
        Pokedex pokedex = new Pokedex();
        PreparedStatement prepare = this.prepareStatement("SELECT id_pokemon, vue, pokedex, attraper FROM pokemon_pokedex where id_joueur=?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        System.out.println("charger pokedex");
        while (this.aResult(result)) {
            System.out.println("charger pokedex : "+this.getIntResultByString(result, "id_pokemon"));
            if (this.getBooleanResultByString(result, "attraper")) {
                pokedex.capturePokemon(pokemons.getPokemonByNumero(this.getIntResultByString(result, "id_pokemon")));
            } else if (this.getBooleanResultByString(result, "pokedex")) {
                pokedex.pokedexPokemon(pokemons.getPokemonByNumero(this.getIntResultByString(result, "id_pokemon")));
            } else if (this.getBooleanResultByString(result, "vue")) {
                pokedex.VoirPokemon(pokemons.getPokemonByNumero(this.getIntResultByString(result, "id_pokemon")));
            }
        }
        return pokedex.getNbPokemonVue() == 0 ? null : pokedex;
    }

    private void initFolioPokemonJoueur() {
        PreparedStatement prepare = this.prepareStatement("UPDATE folio_pokemon_joueur SET folio_pokemon_joueur = 0 WHERE id = ?");
        this.setParameterInt(prepare, this.partie, 1);
        this.executeUpdatePreparedStatement(prepare);
    }

    private int getFolioPokemonJoueur() {
        int folio = 0;
        PreparedStatement prepare = this.prepareStatement("Select folio_pokemon_joueur AS folio FROM folio_pokemon_joueur where id=?");
        this.setParameterInt(prepare, this.partie, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            folio = this.getIntResultByString(result, "folio");
        }
        this.closeResultSet(result);
        folio++;
        PreparedStatement prepare2 = this.prepareStatement("UPDATE folio_pokemon_joueur SET folio_pokemon_joueur = ? WHERE id = ?");
        this.setParameterInt(prepare2, folio, 1);
        this.setParameterInt(prepare2, this.partie, 2);
        this.executeUpdatePreparedStatement(prepare2);
        return folio;
    }
    
    private void deleteAllPokemonJoueurEquipe () {
        PreparedStatement prepare = this.prepareStatement("SELECT id FROM pokemon_joueur where id_joueur=? and boite=0");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            int idPokemonJoueur = this.getIntResultByString(result, "id");
            PreparedStatement prepare2 = this.prepareStatement("DELETE FROM pokemon_stat where id_pokemon_joueur=? and id_joueur=?");
            this.setParameterInt(prepare2, idPokemonJoueur, 1);
            this.setParameterInt(prepare2, this.idJoueur, 2);
            this.executeUpdatePreparedStatement(prepare2);
            
            PreparedStatement prepare3 = this.prepareStatement("DELETE FROM pokemon_capacite where id_pokemon_joueur=? and id_joueur=?");
            this.setParameterInt(prepare3, idPokemonJoueur, 1);
            this.setParameterInt(prepare3, this.idJoueur, 2);
            this.executeUpdatePreparedStatement(prepare3);
            
            PreparedStatement prepare4 = this.prepareStatement("DELETE FROM pokemon_stat_attribut where id_pokemon_joueur=? and id_joueur=?");
            this.setParameterInt(prepare4, idPokemonJoueur, 1);
            this.setParameterInt(prepare4, this.idJoueur, 2);
            this.executeUpdatePreparedStatement(prepare4);
            
            PreparedStatement prepare5 = this.prepareStatement("DELETE FROM pokemon_stat_type where id_pokemon_joueur=? and id_joueur=?");
            this.setParameterInt(prepare5, idPokemonJoueur, 1);
            this.setParameterInt(prepare5, this.idJoueur, 2);
            this.executeUpdatePreparedStatement(prepare5);
        }
        this.closeResultSet(result);
        PreparedStatement prepare6 = this.prepareStatement("DELETE FROM pokemon_joueur where id_joueur=? and boite=0");
        this.setParameterInt(prepare6, this.idJoueur, 1);
        this.executeUpdatePreparedStatement(prepare6);
    }
    
    private void deleteAllPokemonJoueurBoite () {
        PreparedStatement prepare = this.prepareStatement("SELECT id FROM pokemon_joueur where id_joueur=? and boite!=0");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            int idPokemonJoueur = this.getIntResultByString(result, "id");
            PreparedStatement prepare2 = this.prepareStatement("DELETE FROM pokemon_stat where id_pokemon_joueur=? and id_joueur=?");
            this.setParameterInt(prepare2, idPokemonJoueur, 1);
            this.setParameterInt(prepare2, this.idJoueur, 2);
            this.executeUpdatePreparedStatement(prepare2);
            
            PreparedStatement prepare3 = this.prepareStatement("DELETE FROM pokemon_capacite where id_pokemon_joueur=? and id_joueur=?");
            this.setParameterInt(prepare3, idPokemonJoueur, 1);
            this.setParameterInt(prepare3, this.idJoueur, 2);
            this.executeUpdatePreparedStatement(prepare3);
            
            PreparedStatement prepare4 = this.prepareStatement("DELETE FROM pokemon_stat_attribut where id_pokemon_joueur=? and id_joueur=?");
            this.setParameterInt(prepare4, idPokemonJoueur, 1);
            this.setParameterInt(prepare4, this.idJoueur, 2);
            this.executeUpdatePreparedStatement(prepare4);
            
            PreparedStatement prepare5 = this.prepareStatement("DELETE FROM pokemon_stat_type where id_pokemon_joueur=? and id_joueur=?");
            this.setParameterInt(prepare5, idPokemonJoueur, 1);
            this.setParameterInt(prepare5, this.idJoueur, 2);
            this.executeUpdatePreparedStatement(prepare5);
        }
        this.closeResultSet(result);
        PreparedStatement prepare6 = this.prepareStatement("DELETE FROM pokemon_joueur where id_joueur=? and boite!=0");
        this.setParameterInt(prepare6, this.idJoueur, 1);
        this.executeUpdatePreparedStatement(prepare6);
    }
    
    public void sauvegarderPokemonJoueur(Dresseur dresseur) {
        EquipePokemon equipe = dresseur.getEquipe();
        this.deleteAllPokemonJoueurEquipe();
        this.deleteAllPokemonJoueurBoite();
        for (int i= 0 ; i < equipe.lenght(); i++) {
            int folioIdPokemonJoueur = this.getFolioPokemonJoueur();
            if (equipe.getPokemon(i) != null) {
                this.enregistrerPokemon(equipe.getPokemon(i), folioIdPokemonJoueur, 0, i+1, false);
            }
        }
        for (int i= 0 ; i < equipe.size(); i++) {
            if (equipe.aPokemonStocker(i)) {
                int folioIdPokemonJoueur = this.getFolioPokemonJoueur();
                this.enregistrerPokemon(equipe.getPokemonStocke(i), folioIdPokemonJoueur, 0, i+1, true);
            }
        }
        for (int i= 0 ; i < dresseur.getPC().getNbBoite(); i++) {
            for (int j = 0 ; j < dresseur.getPC().getBoite(i).getListePokemon().size() ; j++) {
                if (dresseur.getPC().getBoite(i).getListePokemon().aPokemon(j)) {
                    int folioIdPokemonJoueur = this.getFolioPokemonJoueur();
                    this.enregistrerPokemon(dresseur.getPC().getBoite(i).getListePokemon().getPokemon(j), folioIdPokemonJoueur, i+1, j+1, false);
                }
            }
        }
        
    }
    
    public boolean capaciteEnregistrer (int idPokemonJoueur, String nom) {
        PreparedStatement prepare = this.prepareStatement("SELECT count(id_pokemon_joueur) AS rowcount FROM pokemon_capacite where "
                + "id_pokemon_joueur=? AND id_joueur=? AND libelle_capacite=? AND stocker=?");
        this.setParameterInt(prepare, idPokemonJoueur, 1);
        this.setParameterInt(prepare, this.idJoueur, 2);
        this.setParameterString(prepare, nom, 3);
        this.setParameterBoolean(prepare, false, 4);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            return this.getIntResultByString(result, "rowcount") > 0;
        }
        return false;
    }
    
    private void enregistrerPokemon(Pokemon pk, int idPokemonJoueur, int boite, int place, boolean stocker) {
        PreparedStatement prepare = this.prepareStatement("insert into pokemon_joueur values(?,?,?,?,?,?)");
        this.setParameterInt(prepare, idPokemonJoueur, 1);
        this.setParameterInt(prepare, this.idJoueur, 2);
        this.setParameterInt(prepare, pk.getNumero(), 3);
        this.setParameterInt(prepare, place, 4);
        this.setParameterBoolean(prepare, stocker, 5);
        this.setParameterInt(prepare, boite, 6);
        this.executeUpdatePreparedStatement(prepare);
        
        PreparedStatement prepare2 = this.prepareStatement("insert into pokemon_stat values(?,?,?,?,?,?,?,?,?,?)");
        this.setParameterInt(prepare2, idPokemonJoueur, 1);
        this.setParameterInt(prepare2, this.idJoueur, 2);
        this.setParameterString(prepare2, pk.getSurnom(), 3);
        this.setParameterString(prepare2, pk.getSexe().name(), 4);
        this.setParameterBoolean(prepare2, pk.isShiney(), 5);
        this.setParameterString(prepare2, pk.getEtat().name(), 6);
        this.setParameterInt(prepare2, pk.getNiveau(), 7);
        this.setParameterDouble(prepare2, pk.getPv(), 8);
        System.out.println(pk.getNom() + " Amour : "+pk.getAmour());
        this.setParameterInt(prepare2, pk.getAmour(), 9);
        this.setParameterInt(prepare2, pk.getExp(), 10);
        this.executeUpdatePreparedStatement(prepare2);
        
        int nbCapacite = pk.getCap().nbCapacite();
        for (int i = 0 ; i < nbCapacite ; i++) {
            Capacite cap = pk.getCap().getCapacite(i);
            PreparedStatement prepare3 = this.prepareStatement("insert into pokemon_capacite values(?,?,?,?,?,?,?,?)");
            this.setParameterInt(prepare3, idPokemonJoueur, 1);
            this.setParameterInt(prepare3, this.idJoueur, 2);
            this.setParameterString(prepare3, cap.getNom(), 3);
            this.setParameterInt(prepare3, i+1, 4);
            this.setParameterInt(prepare3, cap.getNbUtilise(), 5);
            this.setParameterInt(prepare3, cap.getNiv(), 6);
            this.setParameterInt(prepare3, cap.getPp(), 7);
            this.setParameterBoolean(prepare3, false, 8);
            this.executeUpdatePreparedStatement(prepare3);
        }
        
        for (int i = 0 ; i < pk.getCap().size() ; i++) {
            Capacite cap = pk.getCap().getListeDeCapacite(i);
            if (!this.capaciteEnregistrer(idPokemonJoueur, cap.getNom())) {
                PreparedStatement prepare4 = this.prepareStatement("insert into pokemon_capacite values(?,?,?,?,?,?,?,?)");
                this.setParameterInt(prepare4, idPokemonJoueur, 1);
                this.setParameterInt(prepare4, this.idJoueur, 2);
                this.setParameterString(prepare4, cap.getNom(), 3);
                this.setParameterInt(prepare4, i+1, 4);
                this.setParameterInt(prepare4, cap.getNbUtilise(), 5);
                this.setParameterInt(prepare4, cap.getNiv(), 6);
                this.setParameterInt(prepare4, cap.getPp(), 7);
                this.setParameterBoolean(prepare4, true, 8);
                this.executeUpdatePreparedStatement(prepare4);
            }
        }
        
        AttributsExp attributExp = pk.getAttributsExp();
        for (int i = 0 ; i < attributExp.size() ; i++) {
            Attributs attribut = attributExp.getAttribut(i);
            PreparedStatement prepare5 = this.prepareStatement("insert into pokemon_stat_attribut values(?,?,?,?,?)");
            this.setParameterInt(prepare5, idPokemonJoueur, 1);
            this.setParameterInt(prepare5, this.idJoueur, 2);
            this.setParameterString(prepare5, attribut.name(), 3);
            this.setParameterInt(prepare5, attributExp.getNivAttribut(attribut), 4);
            this.setParameterInt(prepare5, attributExp.getExpAttribut(attribut), 5);
            this.executeUpdatePreparedStatement(prepare5);
        }
        
        TypeExp typeExp = pk.getTypeExp();
        for (int i = 0 ; i < typeExp.size() ; i++) {
            Type type = typeExp.getType(i);
            PreparedStatement prepare6 = this.prepareStatement("insert into pokemon_stat_type values(?,?,?,?,?,?,?)");
            this.setParameterInt(prepare6, idPokemonJoueur, 1);
            this.setParameterInt(prepare6, this.idJoueur, 2);
            this.setParameterString(prepare6, type.name(), 3);
            this.setParameterInt(prepare6, typeExp.getNiveauAttParType(type), 4);
            this.setParameterInt(prepare6, typeExp.getExpAttParType(type), 5);
            this.setParameterInt(prepare6, typeExp.getNiveauDefParType(type), 6);
            this.setParameterInt(prepare6, typeExp.getExpDefParType(type), 7);
            this.executeUpdatePreparedStatement(prepare6);
        }
    }
    
    public EquipePokemon chargerEquipePokemonJoueur(ListeDePokemon pokemons, ListeDeCapacite capacites) {
        EquipePokemon equipe = new EquipePokemon();
        PreparedStatement prepare = this.prepareStatement("SELECT id, id_pokemon, stocker FROM pokemon_joueur where id_joueur=? AND boite = 0 "
                + "ORDER BY place ASC");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            if (this.getBooleanResultByString(result, "stocker")) {
                equipe.setPokemonStocker(this.chargerPokemon(
                        pokemons, capacites, this.getIntResultByString(result, "id"), this.getIntResultByString(result, "id_pokemon")));
            } else {
                equipe.ajouterPokemon(this.chargerPokemon(
                        pokemons, capacites, this.getIntResultByString(result, "id"), this.getIntResultByString(result, "id_pokemon")));
            }
        }
        this.closeResultSet(result);
        return equipe;
    }
    
    public PC chargerPCPokemonJoueur(ListeDePokemon pokemons, ListeDeCapacite capacites) {
        PC pc = new PC();
        PreparedStatement prepare = this.prepareStatement("SELECT id, id_pokemon, boite FROM pokemon_joueur where id_joueur=? AND boite != 0 "
                + "ORDER BY place ASC");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            pc.getBoite(this.getIntResultByString(result, "boite")-1).ajouterPokemon(
                    this.chargerPokemon(pokemons, capacites, this.getIntResultByString(result, "id"), this.getIntResultByString(result, "id_pokemon")));
        }
        this.closeResultSet(result);
        return pc;
    }
    
    private Pokemon chargerPokemon (ListeDePokemon pokemons, ListeDeCapacite capacites, int idPokemonJoueur, int idPokemon) {
        Pokemon pk = Pokemon.getInstance(pokemons.getPokemonByNumero(idPokemon));
        pk.getCap().enleverTousCapacite();
        PreparedStatement prepare = this.prepareStatement("SELECT surnom, sexe, brillant, statut, niv, pv, amour, exp "
                + "FROM pokemon_stat where id_joueur=? AND id_pokemon_joueur = ? ");
        this.setParameterInt(prepare, this.idJoueur, 1);
        this.setParameterInt(prepare, idPokemonJoueur, 2);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            pk.setSurnom(this.getStringResultByString(result, "surnom"));
            pk.setSexe(Sexe.valueOf(this.getStringResultByString(result, "sexe")));
            //pk.setShiney(this.getBooleanResultByString(result, "brillant"));
            pk.setEtat(Etat.valueOf(this.getStringResultByString(result, "statut")));
            pk.setNiveau(this.getIntResultByString(result, "niv"));
            pk.recoitDegat(pk.getPvMax() - this.getDoubleResultByString(result, "pv"));
            System.out.println(pk.getNom() + " Amour : "+this.getIntResultByString(result, "amour"));
            pk.setAmour(this.getIntResultByString(result, "amour"));
            pk.setExp(this.getIntResultByString(result, "exp"));
        }
        this.closeResultSet(result);
        PreparedStatement prepare1 = this.prepareStatement("SELECT libelle_capacite, nb_utilise, niv, pp, stocker FROM pokemon_capacite "
                + "where id_joueur=? AND id_pokemon_joueur = ? ORDER BY place");
        this.setParameterInt(prepare1, this.idJoueur, 1);
        this.setParameterInt(prepare1, idPokemonJoueur, 2);
        ResultSet result1 = this.executePreparedStatement(prepare1);
        while (this.aResult(result1)) {
            System.out.println("idPok : "+idPokemonJoueur+" cap : "+this.getStringResultByString(result1, "libelle_capacite")+" stocker : "+this.getBooleanResultByString(result1, "stocker"));
            Capacite cap = Capacite.getInstance(capacites.getListeDeCapacite(this.getStringResultByString(result1, "libelle_capacite")));
            cap.setNbUtilise(this.getIntResultByString(result1, "nb_utilise"));
            cap.setPp(this.getIntResultByString(result1, "pp"));
            cap.setNiv(this.getIntResultByString(result1, "niv"));
            if (this.getBooleanResultByString(result1, "stocker")) {
                pk.getCap().ajoutListeCapacite(cap);
            } else {
                pk.getCap().ajoutCapacite(cap);
            }
        }
        this.closeResultSet(result1);
        PreparedStatement prepare2 = this.prepareStatement("SELECT libelle_attribut, niveau, exp FROM pokemon_stat_attribut "
                + "where id_joueur=? AND id_pokemon_joueur = ?");
        this.setParameterInt(prepare2, this.idJoueur, 1);
        this.setParameterInt(prepare2, idPokemonJoueur, 2);
        ResultSet result2 = this.executePreparedStatement(prepare2);
        while (this.aResult(result2)) {
            pk.getAttributsExp().setExpByAttribut(this.getIntResultByString(result2, "exp"), 
                    Attributs.valueOf(this.getStringResultByString(result2, "libelle_attribut")));
            pk.getAttributsExp().setNiveauByAttribut(this.getIntResultByString(result2, "niveau"), 
                    Attributs.valueOf(this.getStringResultByString(result2, "libelle_attribut")));
        }
        this.closeResultSet(result2);
        PreparedStatement prepare3 = this.prepareStatement("SELECT libelle_type, niveau_att, exp_att, niveau_def, exp_def FROM pokemon_stat_type "
                + "where id_joueur=? AND id_pokemon_joueur = ?");
        this.setParameterInt(prepare3, this.idJoueur, 1);
        this.setParameterInt(prepare3, idPokemonJoueur, 2);
        ResultSet result3 = this.executePreparedStatement(prepare3);
        while (this.aResult(result3)) {
            Type type = Type.valueOf(this.getStringResultByString(result3, "libelle_type"));
            pk.getTypeExp().setExpAttByType(this.getIntResultByString(result3, "exp_att"), type);
            pk.getTypeExp().setNiveauAttByType(this.getIntResultByString(result3, "niveau_att"), type);
            pk.getTypeExp().setExpDefByType(this.getIntResultByString(result3, "exp_def"), type);
            pk.getTypeExp().setNiveauDefByType(this.getIntResultByString(result3, "niveau_def"), type);
        }
        this.closeResultSet(result3);
        return pk;
    }
    
    public void sauvegarderDresseur_vaincu(ListeDeDresseur dresseurs) {
        for (int i = 0 ; i < dresseurs.size() ; i++) {
            Dresseur dresseur = dresseurs.getDresseur(i);
            if (!dresseur.aPokemon()) {
                PreparedStatement prepare = this.prepareStatement("insert into dresseur_vaincu values(?,?,?)");
                this.setParameterInt(prepare, this.idJoueur, 1);
                this.setParameterString(prepare, dresseur.getNom(), 2);
                this.setParameterInt(prepare, this.getIdEndroit(dresseur.getPosition().getEndroit().getNom()), 3);
                this.executeUpdatePreparedStatement(prepare);
            }
        }
    }
    
    public ListeDeDresseur chargerDresseurVaincu(ListeDeDresseur dresseurs, ListeDEndroit villes) {
        ListeDeDresseur dresseurs_vaincu = new ListeDeDresseur();
        PreparedStatement prepare = this.prepareStatement("SELECT libelle_dresseur, id_endroit FROM dresseur_vaincu where id_joueur=?");
        this.setParameterInt(prepare, this.idJoueur, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            Dresseur d = dresseurs.getDresseur(this.getStringResultByString(result, "libelle_dresseur"), 
                    this.getEndroit(this.getIntResultByString(result, "id_endroit"), villes));
            if (d != null) {
                d.setEquipeKO();
            }
        }
        this.closeResultSet(result);
        return dresseurs_vaincu;
    }
    
    private void deleteAllEvenement () {
        PreparedStatement prepare = this.prepareStatement("SELECT * FROM evenements_chapitre where id_partie=?");
        this.setParameterInt(prepare, this.partie, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        while (this.aResult(result)) {
            PreparedStatement prepare1 = this.prepareStatement("DELETE FROM quetes_annexe where id_evenement_chapitre=?");
            this.setParameterInt(prepare1, this.getIntResultByString(result, "id_evenement"), 1);
            this.executeUpdatePreparedStatement(prepare1);

            PreparedStatement prepare2 = this.prepareStatement("SELECT * FROM evenements_quete where id_evenement_chapitre=?");
            this.setParameterInt(prepare2, this.getIntResultByString(result, "id_evenement"), 1);
            ResultSet result1 = this.executePreparedStatement(prepare2);
            while (this.aResult(result1)) {
                PreparedStatement prepare3 = this.prepareStatement("DELETE FROM quetes where id_evenement_quete=?");
                this.setParameterInt(prepare3, this.getIntResultByString(result1, "id_evenement"), 1);
                this.executeUpdatePreparedStatement(prepare3);
            }
            this.closeResultSet(result1);
            PreparedStatement prepare4 = this.prepareStatement("DELETE FROM evenements_quete where id_evenement_chapitre=?");
            this.setParameterInt(prepare4, this.getIntResultByString(result, "id_evenement"), 1);
            this.executeUpdatePreparedStatement(prepare4);
        }
        this.closeResultSet(result);

        PreparedStatement prepare5 = this.prepareStatement("DELETE FROM evenements_chapitre where id_partie=?");
        this.setParameterInt(prepare5, this.partie, 1);
        this.executeUpdatePreparedStatement(prepare5);
    }

    public void sauvegarderEvenement(EvenementQuete e) {
        int nbEvenement_chapitre;
        int i=0;
        int j=0;
        EvenementQuete even_chapitre = null;
        EvenementQuete even_quetes;
        PreparedStatement prepare = this.prepareStatement("SELECT count(*) as rowcount, id_evenement  "
                    + "FROM evenements_chapitre where id_partie=? group by id_evenement");
        this.setParameterInt(prepare, this.partie, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            nbEvenement_chapitre = this.getIntResultByString(result, "rowcount") -1;
        } else {
            PreparedStatement prepare1 = this.prepareStatement("insert into evenements_chapitre values(?,?,?,?)");
            this.setParameterInt(prepare1, 1, 1);
            this.setParameterString(prepare1, e.getEvenement(0).toString(), 2);
            this.setParameterBoolean(prepare1, e.estFini(), 3);
            this.setParameterInt(prepare1, this.partie, 4);
            this.executeUpdatePreparedStatement(prepare1);
            nbEvenement_chapitre = 0;
        }
        this.closeResultSet(result);
        System.out.println("nbEvenement_chapitre : " + nbEvenement_chapitre);
        System.out.println("even1 : " + e.getEvenement(nbEvenement_chapitre).toString() + " ; " + e.getEvenement(nbEvenement_chapitre).estFini());
        while (e.getEvenement(nbEvenement_chapitre).estFini()) { /* evenement chapitre 1 */
            System.out.println("even2 : " + e.getEvenement(nbEvenement_chapitre).toString() + " ; " + e.getEvenement(nbEvenement_chapitre).estFini());
            this.sauvegarderEvenementChapitre(nbEvenement_chapitre +1, e);
            even_chapitre = (EvenementQuete ) e.getEvenement(nbEvenement_chapitre);
            while (even_chapitre.getEvenement(i) != null) {
                System.out.println("even3 : " + even_chapitre.toString() + " ; " + even_chapitre.estFini());
                this.sauvegarderEvenementQuete(i+1, nbEvenement_chapitre +1, even_chapitre);
                if (even_chapitre.getQueteAnnexe().estFini()) {
                    this.sauvegarderQueteAnnexe(i+1, nbEvenement_chapitre +1, even_chapitre);
                }
                even_quetes = (EvenementQuete) even_chapitre.getEvenement(i);
                while (even_quetes.getEvenement(j) != null) {
                    System.out.println("even4 : " + even_quetes.toString() + " ; " + even_quetes.estFini());
                    this.sauvegarderQuetes(j+1, i+1, nbEvenement_chapitre +1, even_quetes.getEvenement(j));
                    j++;
                }
                i++;
            }
            nbEvenement_chapitre++;
        }
        this.sauvegarderEvenementChapitre(nbEvenement_chapitre +1, e);
        if (even_chapitre == null) {
            even_chapitre = (EvenementQuete ) e.getEvenement(nbEvenement_chapitre);
            System.out.println("even5 : " + even_chapitre.toString() + " ; " + even_chapitre.estFini());
            while (even_chapitre.getEvenement(i).estFini()) {
                System.out.println("even6 : " + even_chapitre.getEvenement(i).toString() + " ; " + even_chapitre.getEvenement(i).estFini());
                this.sauvegarderEvenementQuete(i+1, nbEvenement_chapitre +1, even_chapitre);
                even_quetes = (EvenementQuete ) even_chapitre.getEvenement(i);
                if (even_quetes.aQueteAnexe() && even_quetes.getQueteAnnexe().estFini()) {
                    this.sauvegarderQueteAnnexe(i+1, nbEvenement_chapitre +1, even_quetes);
                }
                while (even_quetes.getEvenement(j) != null) {
                    System.out.println("even7 : " + even_quetes.toString() + " ; " + even_quetes.estFini());
                    this.sauvegarderQuetes(j+1, i+1, nbEvenement_chapitre +1, even_quetes.getEvenement(j));
                    j++;
                }
                i++;
            }
            this.sauvegarderEvenementQuete(i+1, nbEvenement_chapitre +1, even_chapitre);
            even_quetes = (EvenementQuete ) even_chapitre.getEvenement(i);
            System.out.println("even8 : " + even_quetes.toString() + " ; " + even_quetes.estFini());
            j=0;
            while (even_quetes.getEvenement(j).estFini()) {
                System.out.println("even9 : " + even_quetes.toString() + " ; " + even_quetes.estFini());
                this.sauvegarderQuetes(j+1, i+1, nbEvenement_chapitre +1, even_quetes.getEvenement(j));
                j++;
            }
            this.sauvegarderQuetes(j+1, i+1, nbEvenement_chapitre +1, even_quetes.getEvenement(j));
        }
    }

    private void sauvegarderEvenementChapitre (int id, EvenementQuete e) {
        System.out.println("sauvegarde even chapitre : " + e.getEvenement(id-1).toString() + " ; " + e.getEvenement(id-1).estFini());
        PreparedStatement prepare = this.prepareStatement("SELECT * FROM evenements_chapitre where id_evenement=?");
        this.setParameterInt(prepare, id, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        if (!this.aResult(result)) {
            PreparedStatement prepare1 = this.prepareStatement("insert into evenements_chapitre values(?,?,?,?)");
            this.setParameterInt(prepare1, id, 1);
            this.setParameterString(prepare1, e.getEvenement(id-1).toString(), 2);
            this.setParameterBoolean(prepare1, e.estFini(), 3);
            this.setParameterInt(prepare1, this.partie, 4);
            this.executeUpdatePreparedStatement(prepare1);
        } else {
            if (!this.getBooleanResultByString(result, "fini") && e.estFini()) {
                PreparedStatement prepare1 = this.prepareStatement("update evenements_chapitre set fini=? where id_evenement=?");
                this.setParameterBoolean(prepare1, true, 1);
                this.setParameterInt(prepare1, id, 2);
                this.executeUpdatePreparedStatement(prepare1);
            }
        }
        this.closeResultSet(result);
    }

    private void sauvegarderEvenementQuete (int id, int id_chapitre, EvenementQuete e) {
        System.out.println("sauvegarde even quete : " + e.getEvenement(id-1).toString() + " ; " + e.getEvenement(id-1).estFini());
        PreparedStatement prepare = this.prepareStatement("SELECT * FROM evenements_quete where id_evenement=? and id_evenement_chapitre=? "
                + "and id_partie=?");
        this.setParameterInt(prepare, id, 1);
        this.setParameterInt(prepare, id_chapitre, 2);
        this.setParameterInt(prepare, this.partie, 3);
        ResultSet result = this.executePreparedStatement(prepare);
        if (!this.aResult(result)) {
            PreparedStatement prepare1 = this.prepareStatement("insert into evenements_quete values(?,?,?,?,?)");
            this.setParameterInt(prepare1, id, 1);
            this.setParameterString(prepare1, e.getEvenement(id-1).toString(), 2);
            this.setParameterBoolean(prepare1, e.getEvenement(id-1).estFini(), 3);
            this.setParameterInt(prepare1, id_chapitre, 4);
            this.setParameterInt(prepare1, this.partie, 5);
            this.executeUpdatePreparedStatement(prepare1);
        } else {
            if (!this.getBooleanResultByString(result, "fini") && e.getEvenement(id-1).estFini()) {
                PreparedStatement prepare1 = this.prepareStatement("update evenements_quete set fini=? where id_evenement=? "
                            + "and id_evenement_chapitre=? and id_partie=?");
                this.setParameterBoolean(prepare1, true, 1);
                this.setParameterInt(prepare1, id, 2);
                this.setParameterInt(prepare1, id_chapitre, 3);
                this.setParameterInt(prepare1, this.partie, 4);
                this.executeUpdatePreparedStatement(prepare1);
            }
        }
        this.closeResultSet(result);
    }

    private void sauvegarderQueteAnnexe (int id, int id_chapitre, EvenementQuete e) {
        System.out.println("sauvegarde even quete annexe : " + e.getEvenement(id-1).toString() + " ; " + e.getEvenement(id-1).estFini());
        PreparedStatement prepare = this.prepareStatement("SELECT * FROM quetes_annexe where id_evenement=? and id_chapitre=? and"
                    + " id_partie=?");
        this.setParameterInt(prepare, id, 1);
        this.setParameterInt(prepare, id_chapitre, 2);
        this.setParameterInt(prepare, this.partie, 3);
        ResultSet result = this.executePreparedStatement(prepare);
        if (!this.aResult(result)) {
            PreparedStatement prepare1 = this.prepareStatement("insert into quetes_annexe values(?,?,?,?,?,?)");
            this.setParameterInt(prepare1, id, 1);
            this.setParameterString(prepare1, e.getQueteAnnexe().toString(), 2);
            this.setParameterBoolean(prepare1, e.estActiver(), 3);
            this.setParameterBoolean(prepare1, e.estFini(), 4);
            this.setParameterInt(prepare1, id_chapitre, 5);
            this.setParameterInt(prepare1, this.partie, 6);
            this.executeUpdatePreparedStatement(prepare1);
        } else {
            if ((!this.getBooleanResultByString(result, "fini") && e.estFini()) || (!this.getBooleanResultByString(result, "actif") 
                    && e.estActiver())) {
                PreparedStatement prepare1 = this.prepareStatement("update quetes_annexe set fini=?, actif=? where id_evenement=? and "
                        + "id_chapitre=? and id_partie=?");
                this.setParameterBoolean(prepare1, e.estFini(), 1);
                this.setParameterBoolean(prepare1, e.estActiver(), 2);
                this.setParameterInt(prepare1, id, 3);
                this.setParameterInt(prepare1, id_chapitre, 4);
                this.setParameterInt(prepare1, this.partie, 5);
                this.executeUpdatePreparedStatement(prepare1);
            }
        }
        this.closeResultSet(result);
    }

    private void sauvegarderQuetes (int id, int id_quete, int id_chapitre, Evenement e) {
        System.out.println("sauvegarde quete : " + e.toString() + " ; " + e.estFini());
        PreparedStatement prepare = this.prepareStatement("SELECT * FROM quetes where id_evenement=? and id_evenement_quete=? and "
                    + "id_evenement_chapitre=? and id_partie=?");
        this.setParameterInt(prepare, id, 1);
        this.setParameterInt(prepare, id_quete, 2);
        this.setParameterInt(prepare, id_chapitre, 3);
        this.setParameterInt(prepare, this.partie, 4);
        ResultSet result = this.executePreparedStatement(prepare);
        if (!this.aResult(result)) {
            PreparedStatement prepare1 = this.prepareStatement("insert into quetes values(?,?,?,?,?,?)");
            this.setParameterInt(prepare1, id, 1);
            this.setParameterString(prepare1, e.toString(), 2);
            this.setParameterBoolean(prepare1, e.estFini(), 3);
            this.setParameterInt(prepare1, id_quete, 4);
            this.setParameterInt(prepare1, id_chapitre, 5);
            this.setParameterInt(prepare1, this.partie, 6);
            this.executeUpdatePreparedStatement(prepare1);
        } else {
            if ((!this.getBooleanResultByString(result, "fini") && e.estFini())) {
                PreparedStatement prepare1 = this.prepareStatement("update quetes set fini=? where id_evenement=? and "
                            + "id_evenement_quete=? and id_evenement_chapitre=? and id_partie=?");
                this.setParameterBoolean(prepare1, e.estFini(), 1);
                this.setParameterInt(prepare1, id, 2);
                this.setParameterInt(prepare1, id_quete, 3);
                this.setParameterInt(prepare1, id_chapitre, 4);
                this.setParameterInt(prepare1, this.partie, 5);
                this.executeUpdatePreparedStatement(prepare1);
            }
        }
        this.closeResultSet(result);
    }

    public int chargerEvenementChapitre() {
        PreparedStatement prepare = this.prepareStatement("select * from evenements_chapitre where id_partie=? and fini=?");
        this.setParameterInt(prepare, this.partie, 1);
        this.setParameterBoolean(prepare, false, 2);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            System.out.println("charger even chapitre : " + this.getIntResultByString(result, "id_evenement"));
            return this.getIntResultByString(result, "id_evenement");
        }
        this.closeResultSet(result);
        return 0;
    }

    public int chargerEvenementQuete(int id_chapitre) {
        PreparedStatement prepare = this.prepareStatement("select * from evenements_quete where id_evenement_chapitre=? and id_partie=? "
                    + "and fini=?");
        this.setParameterInt(prepare, id_chapitre, 1);
        this.setParameterInt(prepare, this.partie, 2);
        this.setParameterBoolean(prepare, false, 3);
        ResultSet result = this.executePreparedStatement(prepare);
        
        if (this.aResult(result)) {
            System.out.println("charger even quete : " + this.getStringResultByString(result, "nom"));
            return this.getIntResultByString(result, "id_evenement");
        }
        this.closeResultSet(result);
        return 0;
    }

    public int chargerQuete(int id_quete, int id_chapitre) {
        PreparedStatement prepare = this.prepareStatement("select * from quetes where id_evenement_quete =? and id_evenement_chapitre=? "
                    + "and id_partie=? and fini=?");
        this.setParameterInt(prepare, id_quete, 1);
        this.setParameterInt(prepare, id_chapitre, 2);
        this.setParameterInt(prepare, this.partie, 3);
        this.setParameterBoolean(prepare, false, 4);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            System.out.println("charger quete : " + this.getIntResultByString(result, "id_evenement") + " = "+ this.getStringResultByString(result, "nom"));
            return this.getIntResultByString(result, "id_evenement");
        }
        this.closeResultSet(result);
        return 0;
    }

    public int chargerQueteAnnexe(int id_chapitre) {
        PreparedStatement prepare = this.prepareStatement("select * from quetes_annexe where id_evenement_chapitre =? and id_partie=? "
                    + "and fini=? and actif=?");
        this.setParameterInt(prepare, id_chapitre, 1);
        this.setParameterInt(prepare, this.partie, 2);
        this.setParameterBoolean(prepare, false, 3);
        this.setParameterBoolean(prepare, true, 4);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            System.out.println("charger quete annexe : " + result);
            return this.getIntResultByString(result, "id_evenement");
        }
        this.closeResultSet(result);
        return 0;
    }
    
}

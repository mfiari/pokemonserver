/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.combat;

import mfiari.pokemon.core.capacite.Etat;
import mfiari.pokemon.core.capacite.PokemonVise;
import mfiari.lib.game.condition.Condition;
import mfiari.lib.game.condition.ConditionDegat;
import mfiari.lib.game.condition.ConditionObjet;
import mfiari.lib.game.condition.ConditionDefense;
import mfiari.lib.game.condition.ConditionAttaque;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.server.perso.pokemon.PokemonClassique;
import mfiari.pokemon.server.perso.pokemon.PokemonLegendaire;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.controlleur.Vues;
import mfiari.lib.game.media.Musique;
import mfiari.lib.game.objet.Objet;
import mfiari.pokemon.server.Global;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.pokemon.server.evenement.EvenementCombat;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.liste.ListeDeCapacite;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.core.objet.Objet_ball;
import mfiari.pokemon.core.objet.Type_objet;
import mfiari.pokemon.server.texte.TexteVueCombat;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.server.capacite.AttributsExp;
import mfiari.pokemon.server.capacite.Capacite;
import mfiari.pokemon.server.capacite.CapaciteContreCoup;
import mfiari.pokemon.server.capacite.CapaciteEtat;
import mfiari.pokemon.server.capacite.CapaciteFixe;
import mfiari.pokemon.server.capacite.CapaciteMort;
import mfiari.pokemon.server.capacite.CapaciteMultiple;
import mfiari.pokemon.server.capacite.CapaciteSimple;
import mfiari.pokemon.server.capacite.CapaciteSoin;
import mfiari.pokemon.server.capacite.CapaciteStat;
import mfiari.pokemon.server.perso.ChampionArene;
import mfiari.pokemon.server.perso.Conseil4;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.DresseurClassique;
import mfiari.pokemon.server.perso.Maitre;
import mfiari.pokemon.server.perso.Rival;
import mfiari.pokemon.server.perso.Topdresseur;
import mfiari.pokemon.server.type.TypeExp;
import mfiari.pokemon.server.ville.Terrain;

/**
 *
 * @author mike
 */
public class Combat extends ControlleurVue {
    
    public enum TypeCombat {
        SIMPLE, DOUBLE, SIMPLEEXTRA;
    }

    private PokemonJeu jeu;
    protected Terrain terrain;
    protected int choixMenu;
    protected int choixCapacite;
    protected int choixMenuEnnemie;
    protected int choixCapaciteEnnemie;
    protected int choixPokemonAChanger;
    protected boolean capture;
    private EvenementCombat evenementCombat;
    protected TexteVueCombat textes;
    private boolean aFuit;
    private int pageVuePokemon;
    private ArrayList<Pokemon> pokemonAyantParticiperAuCombat;
    
    protected ListeDeDresseur alies;
    protected EquipePokemon pokemonAlies;
    protected ListeDeDresseur adversaires;
    protected EquipePokemon pokemonAdversaires;
    private TypeCombat typeCombat;
    
    private Map<Pokemon, Map<String, Integer>> actions;

    public Combat() {
        super(true);
        this.textes = TexteVueCombat.getInstance();
        this.choixCapacite = 0;
        this.choixMenu = 0;
        this.pageVuePokemon = 1;
        this.pokemonAyantParticiperAuCombat = new ArrayList<>();
        this.actions = new HashMap<>();
    }
    
    public Combat(Terrain t) {
        this();
        this.terrain = t;
    }

    public Combat(PokemonJeu jeu, Terrain t) {
        this(t);
        this.jeu = jeu;
        if (this.jeu.getEvenement() != null) {
            if (this.jeu.getEvenement().estActiver(this.jeu) && this.jeu.getEvenement() instanceof EvenementCombat) {
                this.evenementCombat = (EvenementCombat) this.jeu.getEvenement();
            } else if (this.jeu.getEvenementAnnexe() != null && this.jeu.getEvenementAnnexe().estActiver(this.jeu) && this.jeu.getEvenementAnnexe() instanceof EvenementCombat) {
                this.evenementCombat = (EvenementCombat) this.jeu.getEvenementAnnexe();
            } else {
                this.evenementCombat = null;
            }
        } else {
            this.evenementCombat = null;
        }
    }
    
    public int getPageVuePokemon() {
        return this.pageVuePokemon;
    }

    public void setPageVuePokemon(int page) {
        if (page < 1) {
            this.pageVuePokemon = 4;
        } else if (page > 4) {
            this.pageVuePokemon = 1;
        } else {
            this.pageVuePokemon = page;
        }
    }

    public PokemonJeu getJeu() {
        return this.jeu;
    }

    @Override
    public void afficheTexte(String texte) {
        this.texte = texte;
        this.pcsControlleurVue.firePropertyChange("affichage", null, null);
    }

    public String getTexte() {
        return this.texte;
    }
    
    public ListeDeDresseur getAlies () {
        return this.alies;
    }
    
    public ListeDeDresseur getAdversaires () {
        return this.adversaires;
    }
    
    public EquipePokemon getPokemonAlies () {
        return this.pokemonAlies;
    }
    
    public EquipePokemon getPokemonAdversaires () {
        return this.pokemonAdversaires;
    }

    public Terrain getTerrain() {
        return this.terrain;
    }
    
    public void commencerCombat (ListeDeDresseur alie, ListeDeDresseur adv, TypeCombat typeCombat) {
        this.alies = alie;
        this.adversaires = adv;
        this.typeCombat = typeCombat;
        System.out.println("combat : " + this.alies.getDresseur(0).getNom() + " VS " + this.adversaires.getDresseur(0).getNom());
    }
    
    public void commencerCombat (ListeDeDresseur alie, EquipePokemon adv, TypeCombat typeCombat) {
        this.alies = alie;
        this.adversaires = null;
        this.pokemonAdversaires = adv;
        this.typeCombat = typeCombat;
        switch (this.typeCombat) {
            case SIMPLE :
                this.prepareCombatSimpleSauvage();
                break;
            case DOUBLE :
                this.prepareCombatDouble();
                break;
        }
        for (int i = 0 ; i < this.pokemonAdversaires.lenght() ; i++) {
            this.TerrainAffectePokemon(this.pokemonAdversaires.getPokemon(i));
        }
        for (int i = 0 ; i < this.pokemonAlies.lenght() ; i++) {
            this.TerrainAffectePokemon(this.pokemonAlies.getPokemon(i));
        }
        switch (this.typeCombat) {
            case SIMPLE :
                this.deroulementCombatSauvage();
                this.finCombatSauvage();
                break;
            case DOUBLE :
                this.deroulementCombatSimple();
                break;
        }
    }
    
    private void prepareCombatSimple () {
        Dresseur perso = this.alies.getDresseur(0);
        Dresseur adv = this.adversaires.getDresseur(0);
        System.out.println("combat : " + perso.getNom() + " VS " + adv.getNom());
        this.pokemonAlies = new EquipePokemon(1);
        this.pokemonAdversaires = new EquipePokemon(1);
        this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
        this.afficheTexte(adv.getNom() + " " + adv.getTitre().toString() + " veut se battre");
        Pokemon pk1 = perso.getEquipe().getPokemon();
        Pokemon pk2 = adv.getEquipe().getPokemon();
        this.pokemonAlies.ajouterPokemon(pk1);
        this.pokemonAdversaires.ajouterPokemon(pk2);
        this.afficheTexte(adv.getNom() + " envoi " + pk2.getNom());
        this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pk2, null);
        this.afficheTexte("go " + pk1.getNom());
        this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk1, null);
        this.pokemonAyantParticiperAuCombat.add(pk1);
    }
    
    private void prepareCombatSimpleSauvage () {
        this.aFuit = false;
        this.capture = false;
        Pokemon pk1 = this.alies.getDresseur(0).getEquipe().getPokemon();
        this.pokemonAlies = new EquipePokemon(1);
        Pokemon pk = this.pokemonAdversaires.getPokemon();
        this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
        this.afficheTexte("un " + pk.getNom() + " sauvage apparait");
        this.afficheTexte("go " + pk1.getNom());
        this.pokemonAlies.ajouterPokemon(pk1);
        this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk1, null);
        this.pokemonAyantParticiperAuCombat.add(pk1);
    }
    
    private void deroulementCombatSimple () {
        Dresseur perso = this.alies.getDresseur(0);
        Dresseur adv = this.adversaires.getDresseur(0);
        Pokemon pk1 = this.pokemonAlies.getPokemon();
        Pokemon pk2 = this.pokemonAdversaires.getPokemon();
        while (perso.aPokemon() && adv.aPokemon()) {
            if (perso.getPokedex() != null) {
                perso.getPokedex().VoirPokemon(pk2);
            }
            pk1 = this.pokemonAlies.getPokemon();
            pk2 = this.pokemonAdversaires.getPokemon();
            this.actions.put(pk1, new HashMap<String, Integer>());
            this.choixPerso(perso, pk1, pk2, adv);
            this.actions.put(pk2, new HashMap<String, Integer>());
            this.choixMenuEnnemie = this.choixEnnemie(adv, pk2);
            System.out.println("choix cap adv : " + this.choixCapaciteEnnemie);
            this.combat(pk2, pk1, false);
            if (this.verifieKO(pk1)) {
                this.KO(pk1);
                this.pokemonAlies.enleverPokemon(0);
                pk1 = this.choixPokemonPerso(perso);
                this.persoChangePokemonKO(pk1);
                if (!this.pokemonAyantParticiperAuCombat.contains(pk1)) {
                    this.pokemonAyantParticiperAuCombat.add(pk1);
                }
            }
            if (this.verifieKO(pk2)) {
                this.pokemonAdversaires.enleverPokemon(0);
                this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", null, null);
                this.Exp(this.pokemonAlies, pk2, adv);
                this.amour(pk1, pk2, adv);
                this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", pk1, null);
                pk2 = this.choixPokemonEnnemie(adv);
                if (pk2 != null) {
                    this.afficheTexte(adv.getNom() + " va utiliser " + pk2.getNom() + ".");
                    if (this.jeu.confirmation("Voulez-vous changer de pokémon?")) {
                        pk1 = this.choixPokemonPerso(perso);
                        if (!this.pokemonAlies.getPokemon(0).equals(pk1)) {
                            this.pokemonAyantParticiperAuCombat.remove(this.pokemonAlies.getPokemon(0));
                            this.pokemonAlies.enleverPokemon(0);
                            this.persoChangePokemonKO(pk1);
                            if (!this.pokemonAyantParticiperAuCombat.contains(pk1)) {
                                this.pokemonAyantParticiperAuCombat.add(pk1);
                            }
                        }
                    }
                    this.pokemonAdversaires.ajouterPokemon(pk2);
                    this.afficheTexte(adv.getNom() + " envoi " + pk2.getNom());
                    this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pk2, null);
                    this.TerrainAffectePokemon(pk2);
                }
            }
            pk1 = this.pokemonAlies.getPokemon();
            pk2 = this.pokemonAdversaires.getPokemon();
            if (perso.aPokemon() && adv.aPokemon()) {
                this.finTour(pk1, pk2);
            }
            this.choixMenu = 0;
            this.choixCapacite = 0;
            this.choixMenuEnnemie = 0;
            this.choixCapaciteEnnemie = 0;
        }
    }
    
    private void deroulementCombatSimpleExtra () {
        Dresseur perso = this.alies.getDresseur(0);
        Dresseur adv = this.adversaires.getDresseur(0);
        Pokemon pk1 = this.pokemonAlies.getPokemon();
        Pokemon pk2 = this.pokemonAdversaires.getPokemon();
        while (perso.aPokemon() && adv.aPokemon()) {
            if (perso.getPokedex() != null) {
                perso.getPokedex().VoirPokemon(pk2);
            }
            pk1 = this.pokemonAlies.getPokemon();
            pk2 = this.pokemonAdversaires.getPokemon();
            this.actions.put(pk1, new HashMap<String, Integer>());
            this.choixPerso(perso, pk1, pk2, adv);
            this.actions.put(pk2, new HashMap<String, Integer>());
            this.choixMenuEnnemie = this.choixEnnemie(adv, pk2);
            System.out.println("choix cap adv : " + this.choixCapaciteEnnemie);
            this.combat(pk2, pk1, false);
            if (this.verifieKO(pk1)) {
                this.KO(pk1);
                this.pokemonAlies.enleverPokemon(0);
                pk1 = this.choixPokemonPerso(perso);
                this.persoChangePokemonKO(pk1);
                if (!this.pokemonAyantParticiperAuCombat.contains(pk1)) {
                    this.pokemonAyantParticiperAuCombat.add(pk1);
                }
            }
            if (this.verifieKO(pk2)) {
                this.pokemonAdversaires.enleverPokemon(0);
                this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", null, null);
                this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", pk1, null);
                pk2 = this.choixPokemonEnnemie(adv);
                if (pk2 != null) {
                    this.pokemonAdversaires.ajouterPokemon(pk2);
                    this.afficheTexte(adv.getNom() + " envoi " + pk2.getNom());
                    this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pk2, null);
                    this.TerrainAffectePokemon(pk2);
                }
            }
            pk1 = this.pokemonAlies.getPokemon();
            pk2 = this.pokemonAdversaires.getPokemon();
            if (perso.aPokemon() && adv.aPokemon()) {
                this.finTour(pk1, pk2);
            }
            this.choixMenu = 0;
            this.choixCapacite = 0;
            this.choixMenuEnnemie = 0;
            this.choixCapaciteEnnemie = 0;
        }
    }
    
    private void deroulementCombatSauvage () {
        Dresseur perso = this.alies.getDresseur(0);
        Pokemon pk1 = this.pokemonAlies.getPokemon();
        Pokemon pk = this.pokemonAdversaires.getPokemon();
        while (perso.aPokemon() && pk.getPv() > 0 && !this.aFuit && !this.capture) {
            pk1 = this.pokemonAlies.getPokemon();
            this.actions.put(pk1, new HashMap<String, Integer>());
            this.choixPerso(perso, pk1, pk, null);
            if (!this.capture) {
                this.actions.put(pk, new HashMap<String, Integer>());
                this.choixMenuEnnemie = this.choixEnnemie(null, pk);
                this.combat(pk, pk1, true);
                if (this.verifieKO(pk1)) {
                    this.KO(pk1);
                    pk1 = this.choixPokemonPerso(perso);
                    if (!this.pokemonAyantParticiperAuCombat.contains(pk1)) {
                        this.pokemonAyantParticiperAuCombat.add(pk1);
                    }
                    this.persoChangePokemonKO(pk1);
                }
                if (this.verifieKO(pk)) {
                    this.pokemonAdversaires.enleverPokemon(0);
                    this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", null, null);
                    this.Exp(this.pokemonAlies, pk, null);
                    this.amour(pk1, pk, null);
                } else {
                    this.finTour(pk1, pk);
                }
            }
            this.choixMenu = 0;
            this.choixCapacite = 0;
            this.choixMenuEnnemie = 0;
            this.choixCapaciteEnnemie = 0;
        }
    }
    
    private void finCombatSimple () {
        if (this.alies.getDresseur(0).aPokemon()) {
            this.discoursFinCombat(this.adversaires.getDresseur(0));
            this.argent(this.alies.getDresseur(0), this.adversaires.getDresseur(0));
            this.soinPokemon(this.alies.getDresseur(0));
            this.evolution(this.alies.getDresseur(0));
        } else {
            this.defaite();
        }
        if (this.evenementCombat != null) {
            this.evenementCombat.conditionReussi();
        }
    } 
    
    private void finCombatSimpleExtra () {
    }
    
    private void finCombatSauvage () {
        if (this.alies.getDresseur(0).aPokemon()) {
            this.soinPokemon(this.alies.getDresseur(0));
            this.evolution(this.alies.getDresseur(0));
        } else {
            this.defaite();
        }
        if (this.evenementCombat != null) {
            this.evenementCombat.conditionReussi();
        }
    }
    
    private void prepareCombatDouble () {
        this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
        if (this.adversaires.size() == 1) {
            Dresseur adv = this.adversaires.getDresseur(0);
            this.afficheTexte(adv.getNom() + " " + adv.getTitre().toString() + " veut se battre");
            if (adv.getEquipe().getNbPokemonApte() >= 2) {
                this.pokemonAdversaires = new EquipePokemon(2);
                Pokemon pk1 = adv.getEquipe().getPokemon();
                Pokemon pk2 = null;
                for (int i = 0 ; i < adv.getEquipe().getNbPokemon() ; i++) {
                    if (!adv.getEquipe().getPokemon(i).equals(pk1)) {
                        pk2 = adv.getEquipe().getPokemon(i);
                        break;
                    }
                }
                this.afficheTexte(adv.getNom() + " " + adv.getTitre().toString() + " envoi " + pk1.getNom() + " et " + pk2.getNom());
                this.pokemonAdversaires.ajouterPokemon(pk1);
                this.pokemonAdversaires.ajouterPokemon(pk2);
            } else {
                this.pokemonAdversaires = new EquipePokemon(1);
                Pokemon pk1 = adv.getEquipe().getPokemon();
                this.afficheTexte(adv.getNom() + " " + adv.getTitre().toString() + " envoi " + pk1.getNom());
                this.pokemonAdversaires.ajouterPokemon(pk1);
            }
        } else {
            Dresseur adv1 = this.adversaires.getDresseur(0);
            Dresseur adv2 = this.adversaires.getDresseur(1);
            this.afficheTexte(adv1.getNom() + " " + adv1.getTitre().toString() + " et " + adv2.getNom() + " " + adv2.getTitre().toString() + " veulent se battre");
             this.pokemonAdversaires = new EquipePokemon(2);
            Pokemon pk1 = adv1.getEquipe().getPokemon();
            Pokemon pk2 = adv2.getEquipe().getPokemon();
            this.afficheTexte(adv1.getNom() + " " + adv1.getTitre().toString() + " envoi " + pk1.getNom());
            this.pokemonAdversaires.ajouterPokemon(pk1);
            this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pk1, null);
            this.afficheTexte(adv2.getNom() + " " + adv2.getTitre().toString() + " envoi " + pk2.getNom());
            this.pokemonAdversaires.ajouterPokemon(pk2);
            this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pk2, null);
        }
        if (this.alies.size() == 1) {
            Dresseur perso = this.alies.getDresseur(0);
            if (perso.getEquipe().getNbPokemonApte() >= 2) {
                this.pokemonAlies = new EquipePokemon(2);
                Pokemon pk1 = perso.getEquipe().getPokemon();
                Pokemon pk2 = null;
                for (int i = 0 ; i < perso.getEquipe().getNbPokemon() ; i++) {
                    if (!perso.getEquipe().getPokemon(i).equals(pk1)) {
                        pk2 = perso.getEquipe().getPokemon(i);
                        break;
                    }
                }
                this.afficheTexte("Go " + pk1.getNom() + " et " + pk2.getNom());
                this.pokemonAlies.ajouterPokemon(pk1);
                this.pokemonAlies.ajouterPokemon(pk2);
                this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk1, null);
                this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk2, null);
                this.pokemonAyantParticiperAuCombat.add(pk1);
                this.pokemonAyantParticiperAuCombat.add(pk2);
            } else {
                this.pokemonAlies = new EquipePokemon(1);
                Pokemon pk1 = perso.getEquipe().getPokemon();
                this.afficheTexte("Go " + pk1.getNom());
                this.pokemonAlies.ajouterPokemon(pk1);
                this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk1, null);
                this.pokemonAyantParticiperAuCombat.add(pk1);
            }
        } else {
            Dresseur perso = this.alies.getDresseur(0);
            Dresseur alie = this.alies.getDresseur(1);
             this.pokemonAlies = new EquipePokemon(2);
            Pokemon pk1 = perso.getEquipe().getPokemon();
            Pokemon pk2 = alie.getEquipe().getPokemon();
            this.afficheTexte(alie.getNom() + " " + alie.getTitre().toString() + " envoi " + pk2.getNom());
            this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk2, null);
            this.afficheTexte("Go " + pk1.getNom());
            this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk1, null);
            this.pokemonAlies.ajouterPokemon(pk1);
            this.pokemonAlies.ajouterPokemon(pk2);
            this.pokemonAyantParticiperAuCombat.add(pk1);
        }
    }
    
    private void deroulementCombatDouble () {
        Dresseur perso = this.alies.getDresseur(0);
        Dresseur adv = this.adversaires.getDresseur(0);
        while (this.pokemonAlies.getNbPokemonApte() > 0 && this.pokemonAdversaires.getNbPokemonApte() > 0) {
            if (perso.getPokedex() != null) {
                for (int i = 0 ; i < this.pokemonAdversaires.lenght() ; i++) {
                    if (this.pokemonAdversaires.getPokemon(i) != null) {
                        perso.getPokedex().VoirPokemon(this.pokemonAdversaires.getPokemon(i));
                    }
                }
            }
            if (this.alies.size() == 1) {
                for (int i = 0 ; i < this.pokemonAlies.lenght() ; i++) {
                    if (this.pokemonAlies.getPokemon(i) != null) {
                        this.choixMenu = 0;
                        this.choixCapacite = 0;
                        this.actions.put(this.pokemonAlies.getPokemon(i), new HashMap<String, Integer>());
                        this.choixPerso(perso, this.pokemonAlies.getPokemon(i), null, adv);
                    }
                }
            }
            for (int i = 0 ; i < this.pokemonAdversaires.lenght() ; i++) {
                if (this.pokemonAdversaires.getPokemon(i) != null) {
                    this.actions.put(this.pokemonAdversaires.getPokemon(i), new HashMap<String, Integer>());
                    this.choixMenuEnnemie = this.choixEnnemie(adv, this.pokemonAdversaires.getPokemon(i));
                    System.out.println("choix cap adv : " + this.choixCapaciteEnnemie);
                }
            }
            this.combat(this.alies, this.pokemonAlies, this.adversaires, this.pokemonAdversaires, false);
            if (this.alies.size() == 1) {
                for (int i = 0 ; i < this.pokemonAlies.lenght() ; i++) {
                    Pokemon pk = this.pokemonAlies.getPokemon(i);
                    if (pk != null) {
                        if (this.verifieKO(pk)) {
                            this.KO(pk);
                            this.pokemonAlies.enleverPokemon(i);
                            pk = this.choixPokemonPerso(perso);
                            this.persoChangePokemonKO(pk);
                            if (!this.pokemonAyantParticiperAuCombat.contains(pk)) {
                                this.pokemonAyantParticiperAuCombat.add(pk);
                            }
                        }
                    }
                }
            }
            for (int i = 0 ; i < this.pokemonAdversaires.lenght() ; i++) {
                if (this.pokemonAdversaires.getPokemon(i) != null) {
                    if (this.verifieKO(this.pokemonAdversaires.getPokemon(i))) {
                        this.pokemonAdversaires.enleverPokemon(i);
                        this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", this.pokemonAdversaires.getPokemon(i), null);
                        this.Exp(this.pokemonAlies, this.pokemonAdversaires.getPokemon(i), adv);
                        for (int j = 0 ; j < this.pokemonAlies.lenght() ; j++) {
                            this.amour(this.pokemonAlies.getPokemon(j), this.pokemonAdversaires.getPokemon(i), adv);
                            this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", this.pokemonAlies.getPokemon(j), null);
                        }
                        this.choixPokemonEnnemie(adv);
                    }
                }
            }
            if (this.pokemonAlies.getNbPokemonApte() > 0 && this.pokemonAdversaires.getNbPokemonApte() > 0) {
                this.finTour(this.pokemonAlies);
                this.finTour(this.pokemonAdversaires);
            }
            this.choixMenu = 0;
            this.choixCapacite = 0;
            this.choixMenuEnnemie = 0;
            this.choixCapaciteEnnemie = 0;
        }
    }
    
    private void combat (Pokemon pk, Pokemon pk1, boolean fuite) {
        if (this.choixMenu == 1 && this.choixMenuEnnemie == 1) {
            if (pk.getCap().getCapacite(this.choixCapaciteEnnemie).getPriorite() == pk1.getCap().getCapacite(this.choixCapacite).getPriorite()) {
                if (pk1.getVit() > pk.getVit()) {
                    choixAttaquePerso(pk, pk1);
                    if (!pk.estKo()) {
                        choixAttaqueEnnemie(pk, pk1);
                    }
                } else {
                    choixAttaqueEnnemie(pk, pk1);
                    if (!pk1.estKo()) {
                        choixAttaquePerso(pk, pk1);
                    }
                }
            } else if (pk.getCap().getCapacite(this.choixCapaciteEnnemie).getPriorite() > pk1.getCap().getCapacite(this.choixCapacite).getPriorite()) {
                choixAttaqueEnnemie(pk, pk1);
                if (!pk1.estKo()) {
                    choixAttaquePerso(pk, pk1);
                }
            } else {
                choixAttaquePerso(pk, pk1);
                if (!pk.estKo()) {
                    choixAttaqueEnnemie(pk, pk1);
                }
            }
        } else if (this.choixMenu == 1) {
            if (pk1.getCap().getCapacite(this.choixCapacite).getPriorite() == 7) {
                choixAttaquePerso(pk, pk1);
                if (!pk.estKo()) {
                    if (this.choixMenuEnnemie == 2) {
                        
                    } else if (this.choixMenuEnnemie == 3) {
                        
                    } else {
                        this.verifFuite(pk, fuite);
                    }
                }
            } else {
                if (this.choixMenuEnnemie == 2) {
                        
                } else if (this.choixMenuEnnemie == 3) {

                } else {
                    if (!(pk instanceof PokemonLegendaire)) {
                        this.verifFuite(pk, fuite);
                    }
                }
                if (!this.aFuit) {
                    choixAttaquePerso(pk, pk1);
                    if (this.choixMenuEnnemie == 4 && pk instanceof PokemonLegendaire) {
                        this.verifFuite(pk, fuite);
                    }
                }
            }
        } else if (this.choixMenuEnnemie == 1) {
            if (pk.getCap().getCapacite(this.choixCapaciteEnnemie).getPriorite() == 7) {
                choixAttaqueEnnemie(pk, pk1);
                if (!pk1.estKo()) {
                    if (this.choixMenu == 2) {
                        this.afficheTexte(pk1.getNom() + " revien");
                        this.pokemonAlies.ajouterPokemon(this.alies.getDresseur(0).getEquipe().getPokemon(this.choixPokemonAChanger));
                        pk1 = this.pokemonAlies.getPokemon(0);
                        this.afficheTexte(pk1.getNom() + " go");
                        this.persoChangePokemon(pk1);
                        if (!this.pokemonAyantParticiperAuCombat.contains(pk1)) {
                            this.pokemonAyantParticiperAuCombat.add(pk1);
                        }
                    } else if (this.choixMenu == 3) {
                        
                    } else {
                        this.verifFuite(pk1, fuite);
                    }
                }
            } else {
                if (this.choixMenu == 2) {
                    this.afficheTexte(pk1.getNom() + " revien");
                    this.pokemonAlies.enleverPokemon(0);
                    this.pokemonAlies.ajouterPokemon(this.alies.getDresseur(0).getEquipe().getPokemon(this.choixPokemonAChanger));
                    pk1 = this.pokemonAlies.getPokemon(0);
                    this.afficheTexte(pk1.getNom() + " go");
                    this.persoChangePokemon(pk1);
                    if (!this.pokemonAyantParticiperAuCombat.contains(pk1)) {
                        this.pokemonAyantParticiperAuCombat.add(pk1);
                    }
                } else if (this.choixMenu == 3) {

                } else {
                    this.verifFuite(pk1, fuite);
                }
                if (!this.aFuit) {
                    choixAttaqueEnnemie(pk, pk1);
                }
            }
        } else {
            if (pk1.getVit() >= pk.getVit()) {
                if (this.choixMenuEnnemie == 2) {

                } else if (this.choixMenuEnnemie == 3) {

                } else {
                    this.verifFuite(pk, fuite);
                }
                if (!this.aFuit) {
                    if (this.choixMenu == 2) {
                        this.afficheTexte(pk1.getNom() + " revien");
                        this.pokemonAlies.ajouterPokemon(this.alies.getDresseur(0).getEquipe().getPokemon(this.choixPokemonAChanger));
                        pk1 = this.pokemonAlies.getPokemon(0);
                        this.afficheTexte(pk1.getNom() + " go");
                        this.persoChangePokemon(pk1);
                        if (!this.pokemonAyantParticiperAuCombat.contains(pk1)) {
                            this.pokemonAyantParticiperAuCombat.add(pk1);
                        }
                    } else if (this.choixMenu == 3) {

                    } else {
                        this.verifFuite(pk1, fuite);
                    }
                }
            } else {
                if (this.choixMenu == 2) {
                    this.afficheTexte(pk1.getNom() + " revien");
                    this.pokemonAlies.ajouterPokemon(this.alies.getDresseur(0).getEquipe().getPokemon(this.choixPokemonAChanger));
                    pk1 = this.pokemonAlies.getPokemon(0);
                    this.afficheTexte(pk1.getNom() + " go");
                    this.persoChangePokemon(pk1);
                    if (!this.pokemonAyantParticiperAuCombat.contains(pk1)) {
                        this.pokemonAyantParticiperAuCombat.add(pk1);
                    }
                } else if (this.choixMenu == 3) {

                } else {
                    this.verifFuite(pk1, fuite);
                }
                if (!this.aFuit) {
                    if (this.choixMenuEnnemie == 2) {

                    } else if (this.choixMenuEnnemie == 3) {

                    } else {
                        this.verifFuite(pk, fuite);
                    }
                }
            }
        }
    }
    
    private void combat (ListeDeDresseur alies, EquipePokemon pokemonAlies, ListeDeDresseur adversaires, EquipePokemon pokemonAdverse, boolean fuite) {
        ListeDePokemon pokemons = this.orderedPokemonBattle(pokemonAlies, pokemonAdverse);
        for (int i = 0 ; i < pokemons.size() ; i++) {
            Pokemon pk = pokemons.getPokemon(i);
            if (!pk.estKo()) {
                int action = this.actions.get(pokemons.getPokemon(i)).get("action");
                if (pokemonAlies.aPokemon(pk)) {
                    if (pokemonAdverse.getNbPokemonApte() > 0) {
                        if (action == 1) {
                            Pokemon pkAdverse = pokemonAdverse.getPokemon(this.actions.get(pk).get("choixPokemon"));
                            if (pkAdverse == null || pkAdverse.estKo()) {
                                for (int j = 0 ; j < pokemonAdverse.lenght() ; j++) {
                                    if (pokemonAdverse.getPokemon(j) != null && !pokemonAdverse.getPokemon(j).estKo()) {
                                        pkAdverse = pokemonAdverse.getPokemon(j);
                                        break;
                                    }
                                }
                            }
                            if (pkAdverse != null && !pkAdverse.estKo()) {
                                choixAttaquePerso(pkAdverse, pk);
                                if (this.verifieKO(pkAdverse)) {
                                    this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pkAdverse, null);
                                    this.Exp(this.pokemonAlies, pkAdverse, this.adversaires.getDresseur(0));
                                    for (int j = 0 ; j < this.pokemonAlies.lenght() ; j++) {
                                        if (this.pokemonAlies.getPokemon(j) != null) {
                                            this.amour(this.pokemonAlies.getPokemon(j), pkAdverse, this.adversaires.getDresseur(0));
                                            this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", this.pokemonAlies.getPokemon(j), null);
                                        }
                                    }
                                    for (int j = 0 ; j < this.adversaires.size() ;  j++) {
                                        if (this.adversaires.getDresseur(j).getEquipe().aPokemon(pkAdverse)) {
                                            pkAdverse = this.choixPokemonEnnemie(this.adversaires.getDresseur(j));
                                            if (pkAdverse != null) {
                                                this.afficheTexte(this.adversaires.getDresseur(j).getNom() + " " + this.adversaires.getDresseur(j).getTitre().toString() + " envoi " + pkAdverse.getNom());
                                                this.advChangePokemon(pkAdverse);
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        } else if (action == 2) {
                            this.afficheTexte(pk.getNom() + " revien");
                            this.pokemonAlies.ajouterPokemon(this.alies.getDresseur(0).getEquipe().getPokemon(this.choixPokemonAChanger));
                            pk = this.pokemonAlies.getPokemon(0);
                            this.afficheTexte(pk.getNom() + " go");
                            this.persoChangePokemon(pk);
                            if (!this.pokemonAyantParticiperAuCombat.contains(pk)) {
                                this.pokemonAyantParticiperAuCombat.add(pk);
                            }
                        } else if (action == 3) {

                        } else if (action == 4) {
                            this.verifFuite(pk, fuite);
                        }
                    }
                } else {
                    if (pokemonAlies.getNbPokemonApte() > 0) {
                        if (action == 1) {
                            Pokemon pkPerso = pokemonAlies.getPokemon(this.actions.get(pk).get("choixPokemon"));
                            if (pkPerso == null || pkPerso.estKo()) {
                                for (int j = 0 ; j < pokemonAlies.lenght() ; j++) {
                                    if (pokemonAlies.getPokemon(j) != null && !pokemonAlies.getPokemon(j).estKo()) {
                                        pkPerso = pokemonAlies.getPokemon(j);
                                        break;
                                    }
                                }
                            }
                            choixAttaqueEnnemie(pk, pkPerso);
                            if (this.verifieKO(pkPerso)) {
                                this.KO(pkPerso);
                                this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pkPerso, null);
                                pkPerso = this.choixPokemonPerso(this.alies.getDresseur(0));
                                this.persoChangePokemonKO(pkPerso);
                                if (!this.pokemonAyantParticiperAuCombat.contains(pkPerso)) {
                                    this.pokemonAyantParticiperAuCombat.add(pkPerso);
                                }
                            }
                        } else if (action == 2) {

                        } else if (action == 3) {

                        } else if (action == 4) {
                            this.verifFuite(pk, fuite);
                        }
                    }
                }
            }
        }
    }
    
    private ListeDePokemon orderedPokemonBattle (EquipePokemon pokemonAlies, EquipePokemon pokemonAdverse) {
        ListeDePokemon pokemons = new ListeDePokemon(pokemonAlies.getNbPokemonApte() + pokemonAdverse.getNbPokemonApte());
        for (int i = 0 ; i < pokemonAlies.lenght() ; i++) {
            if (pokemonAlies.getPokemon(i) != null) {
                pokemons.ajouterPokemon(pokemonAlies.getPokemon(i));
            }
        }
        for (int i = 0 ; i < pokemonAdverse.lenght() ; i++) {
            if (pokemonAdverse.getPokemon(i) != null) {
                pokemons.ajouterPokemon(pokemonAdverse.getPokemon(i));
            }
        }
        return pokemons;
    }
    
    private void choixAttaquePerso (Pokemon pk, Pokemon pk1) {
        if (!this.EtatEmpecheAttaque(pk1)) {
            if (persoAttaqueAdv(pk1)) {
                this.AttaquePerso(pk1, pk);
            } else if (persoAttaqueLui(pk1)) {
                this.AttaquePerso(pk1, pk1);
            } else if (persoAttaqueTous(pk1)) {
                this.AttaquePerso(pk1, pk);
                this.AttaquePerso(pk1, pk1);
            }
        }
    }
    
    private void choixAttaqueEnnemie (Pokemon pk, Pokemon pk1) {
        if (!this.EtatEmpecheAttaque(pk)) {
            if (ennemieAttaqueAdv(pk)) {
                this.AttaqueEnnemi(pk, pk1);
            } else if (ennemieAttaqueLui(pk)) {
                this.AttaqueEnnemi(pk, pk);
            } else if (ennemieAttaqueTous(pk)) {
                this.AttaqueEnnemi(pk, pk1);
                this.AttaqueEnnemi(pk, pk);
            }
        }
    }
    
    private boolean ennemieAttaqueAdv (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapaciteEnnemie);
        return cap.getPokemonVise().equals(PokemonVise.adversaire) || cap.getPokemonVise().equals(PokemonVise.adversaires);
    }
    
    private boolean ennemieAttaqueLui (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapaciteEnnemie);
        return cap.getPokemonVise().equals(PokemonVise.alie) || cap.getPokemonVise().equals(PokemonVise.equipe) || 
                cap.getPokemonVise().equals(PokemonVise.moi);
    }
    
    private boolean ennemieAttaqueTous (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapaciteEnnemie);
        return cap.getPokemonVise().equals(PokemonVise.tous);
    }
    
    private boolean persoAttaqueAdv (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapacite);
        return cap.getPokemonVise().equals(PokemonVise.adversaire) || cap.getPokemonVise().equals(PokemonVise.adversaires);
    }
    
    private boolean persoAttaqueLui (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapacite);
        return cap.getPokemonVise().equals(PokemonVise.alie) || cap.getPokemonVise().equals(PokemonVise.equipe) || 
                cap.getPokemonVise().equals(PokemonVise.moi);
    }
    
    private boolean persoAttaqueTous (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapacite);
        return cap.getPokemonVise().equals(PokemonVise.tous);
    }
    
    private void verifFuite (Pokemon pk, boolean fuite) {
        if (!this.EtatEmpecheAttaque(pk)) {
            if (fuite){ 
                this.afficheTexte(pk.getNom() + " prend la fuite");
                this.aFuit = true;
            } else {
                this.afficheTexte("fuite impossible");
            }
        }
    }
    
    private void choixPersoCombat (Dresseur dress, Pokemon pk, Pokemon pk1, Dresseur dress1) {
        while (this.choixCapacite == 0 && this.choixMenu == 0) {
            this.pcsControlleurVue.firePropertyChange("afficherMenuJoueur", null, null);
            this.choixMenu = this.getChoix();
            if (this.choixMenu == 1) {
                this.pcsControlleurVue.firePropertyChange("afficherTechniques", pk, null);
                if (this.getChoix() == 0) {
                    this.choixMenu = this.getChoix();
                } else {
                    this.choixCapacite = this.getChoix() - 1;
                    Capacite cap = pk.getCap().getCapacite(this.choixCapacite);
                    if (cap.getPp() <= 0) {
                        this.choixCapacite = 0;
                        this.choixMenu = 0;
                        this.afficheTexte("Vous ne pouvez pas utiliser cette capacite");
                    }
                    if (this.typeCombat == TypeCombat.DOUBLE) {
                        if (cap.getPokemonVise() == PokemonVise.adversaire) {
                            this.pcsControlleurVue.firePropertyChange("choixPokemonViseAdv", null, null);
                        } else if (cap.getPokemonVise() == PokemonVise.alie) {
                            this.pcsControlleurVue.firePropertyChange("choixPokemonViseAlie", null, null);
                        }
                    }
                }
            } else if (this.choixMenu == 2) {
                do {
                    this.pcsControlleurVue.firePropertyChange("changerPokemon", null, null);
                    if (this.getChoix() == 0) {
                        this.choixPokemonAChanger = 0;
                        this.choixMenu = this.getChoix();
                    } else if (this.getChoix() < 0 || this.getChoix() > dress.getEquipe().getNbPokemon()) {
                        this.choixPokemonAChanger = -1;
                    } else {
                        int choixPokemon = this.getChoix() -1;
                        do {
                            this.pcsControlleurVue.firePropertyChange("afficherAction", null, null);
                            if (this.choix == 1) {
                                this.choixPokemonAChanger = -1;
                                Pokemon pkStock = this.pokemonAlies.enleverPokemon(0);
                                this.pokemonAlies.ajouterPokemon(dress.getEquipe().getPokemon(choixPokemon));
                                do {
                                    this.pcsControlleurVue.firePropertyChange("afficherPokemon", null, null);
                                } while (this.choix == -1);
                                this.pokemonAlies.ajouterPokemon(pkStock);
                            } else if (this.choix == 2) {
                                if (dress.getEquipe().getPokemon(choixPokemon).equals(pk)) {
                                    this.afficheTexte("ce pokemon est déja au combat");
                                    this.choixPokemonAChanger = -1;
                                } else if (dress.getEquipe().getPokemon(choixPokemon).estKo()) {
                                    this.afficheTexte("ce pokemon ne peut plus combattre");
                                    this.choixPokemonAChanger = -1;
                                } else {
                                    if (this.typeCombat == TypeCombat.DOUBLE) {
                                        this.pcsControlleurVue.firePropertyChange("choixPokemonARemplacer", null, null);
                                    }
                                    this.choixPokemonAChanger = choixPokemon;
                                }
                            } else {
                                this.choixPokemonAChanger = -1;
                            }
                        } while (this.getChoix() == 1);
                    }
                } while (this.choixPokemonAChanger == -1);
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
            } else if (this.choixMenu == 3) {
                Vues.createVue(dress.getSac());
                dress.getSac().afficheSac();
                Objet obj = dress.getSac().getObjetFromSac();
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
                if (obj != null) {
                    if (this.typeCombat == TypeCombat.DOUBLE) {
                        this.pcsControlleurVue.firePropertyChange("choixPokemonObjetAUtiliser", null, null);
                    }
                    this.utiliseObjet(dress, obj, pk1, dress1);
                } else {
                    this.choixMenu = 0;
                }
            } else if (this.choixMenu == 5) {
                if (this.typeCombat == TypeCombat.DOUBLE) {
                    this.pcsControlleurVue.firePropertyChange("choixPokemonAPokedex", null, null);
                }
                Vues.createVue(dress.getPokedex());
                dress.getPokedex().pokedexCombat(pk1);
                this.choixMenu = 0;
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
            } 
        }
    }

    private void choixPerso(Dresseur dress, Pokemon pk, Pokemon pk1, Dresseur dress1) {
        while (this.choixCapacite == 0 && this.choixMenu == 0) {
            this.pcsControlleurVue.firePropertyChange("afficherMenuJoueur", null, null);
            this.choixMenu = this.getChoix();
            if (this.choixMenu == 1) {
                this.pcsControlleurVue.firePropertyChange("afficherTechniques", pk, null);
                if (this.getChoix() == 0) {
                    this.choixMenu = this.getChoix();
                } else {
                    this.choixCapacite = this.getChoix() - 1;
                    Capacite cap = pk.getCap().getCapacite(this.choixCapacite);
                    if (cap.getPp() <= 0) {
                        this.choixCapacite = 0;
                        this.choixMenu = 0;
                        this.afficheTexte("Vous ne pouvez pas utiliser cette capacite");
                    } else {
                        if (this.pokemonAdversaires.lenght() > 1) {
                            this.pcsControlleurVue.firePropertyChange("afficherPokemonAdv", null, null);
                            if (this.choix == 0) {
                                this.choixCapacite = 0;
                                this.choixMenu = 0;
                            } else {
                                this.actions.get(pk).put("action", this.choixMenu);
                                this.actions.get(pk).put("capacite", this.choixCapacite);
                                this.actions.get(pk).put("choixPokemon", this.choix-1);
                            }
                        } else {
                            this.actions.get(pk).put("action", this.choixMenu);
                            this.actions.get(pk).put("capacite", this.choixCapacite);
                            this.actions.get(pk).put("choixPokemon", 0);
                        }
                        
                    }
                }
            } else if (this.choixMenu == 2) {
                do {
                    this.pcsControlleurVue.firePropertyChange("changerPokemon", null, null);
                    if (this.getChoix() == 0) {
                        this.choixPokemonAChanger = 0;
                        this.choixMenu = this.getChoix();
                    } else if (this.getChoix() < 0 || this.getChoix() > dress.getEquipe().getNbPokemon()) {
                        this.choixPokemonAChanger = -1;
                    } else {
                        int choixPokemon = this.getChoix() -1;
                        do {
                            this.pcsControlleurVue.firePropertyChange("afficherAction", null, null);
                            if (this.choix == 1) {
                                this.choixPokemonAChanger = -1;
                                Pokemon pkStock = this.pokemonAlies.enleverPokemon(0);
                                this.pokemonAlies.ajouterPokemon(dress.getEquipe().getPokemon(choixPokemon));
                                do {
                                    this.pcsControlleurVue.firePropertyChange("afficherPokemon", null, null);
                                } while (this.choix == -1);
                                this.pokemonAlies.ajouterPokemon(pkStock);
                            } else if (this.choix == 2) {
                                if (dress.getEquipe().getPokemon(choixPokemon).equals(pk)) {
                                    this.afficheTexte("ce pokemon est déja au combat");
                                    this.choixPokemonAChanger = -1;
                                } else if (dress.getEquipe().getPokemon(choixPokemon).estKo()) {
                                    this.afficheTexte("ce pokemon ne peut plus combattre");
                                    this.choixPokemonAChanger = -1;
                                } else {
                                    this.choixPokemonAChanger = choixPokemon;
                                    this.actions.get(pk).put("action", this.choixMenu);
                                    this.actions.get(pk).put("pokemon", this.choixPokemonAChanger);
                                }
                            } else {
                                this.choixPokemonAChanger = -1;
                            }
                        } while (this.getChoix() == 1);
                    }
                } while (this.choixPokemonAChanger == -1);
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
            } else if (this.choixMenu == 3) {
                Vues.createVue(dress.getSac());
                dress.getSac().afficheSac();
                Objet obj = dress.getSac().getObjetFromSac();
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
                if (obj != null) {
                    this.actions.get(pk).put("action", this.choixMenu);
                    this.utiliseObjet(dress, obj, pk1, dress1);
                } else {
                    this.choixMenu = 0;
                }
            } else if (this.choixMenu == 4) {
                this.actions.get(pk).put("action", this.choixMenu);
            } else if (this.choixMenu == 5) {
                Vues.createVue(dress.getPokedex());
                dress.getPokedex().pokedexCombat(pk1);
                this.choixMenu = 0;
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
            } 
        }
    }

    private int choixEnnemie(Dresseur dress, Pokemon pk) {
        int choixEnnemi = 0;
        this.actions.get(pk).put("action", 1);
        if (dress == null) {
            do {
                choixEnnemi = (int) (Math.random() * 4 + 1);
            } while (choixEnnemi == 2 || choixEnnemi == 3 || choixEnnemi == 4);
            if (choixEnnemi == 1) {
                /*this.choixCapaciteEnnemie = ((int) (Math.random()* (pk.getCap().nbCapacite() - 1)));*/
                this.choixCapaciteEnnemie = (int)Math.round(Math.random()* (pk.getCap().nbCapacite() - 1));
            }
            this.actions.get(pk).put("capacite", this.choixCapaciteEnnemie);
            int choixPokemonAdv = (int) (Math.random() * this.pokemonAlies.lenght());
            this.actions.get(pk).put("choixPokemon", choixPokemonAdv);
            return choixEnnemi;
        } else if (dress instanceof DresseurClassique) {
            this.choixCapaciteEnnemie = ((int) (Math.random() * (pk.getCap().nbCapacite() - 1)));
            this.actions.get(pk).put("capacite", this.choixCapaciteEnnemie);
            int choixPokemonAdv = (int) (Math.random() * this.pokemonAlies.lenght());
            this.actions.get(pk).put("choixPokemon", choixPokemonAdv);
            return 1;
        } else if (dress instanceof Topdresseur) {
            this.choixCapaciteEnnemie = ((int) (Math.random() * (pk.getCap().nbCapacite() - 1)));
            this.actions.get(pk).put("capacite", this.choixCapaciteEnnemie);
            int choixPokemonAdv = (int) (Math.random() * this.pokemonAlies.lenght());
            this.actions.get(pk).put("choixPokemon", choixPokemonAdv);
            return 1;
        } else if (dress instanceof ChampionArene) {
            this.choixCapaciteEnnemie = ((int) (Math.random() * (pk.getCap().nbCapacite() - 1)));
            this.actions.get(pk).put("capacite", this.choixCapaciteEnnemie);
            int choixPokemonAdv = (int) (Math.random() * this.pokemonAlies.lenght());
            this.actions.get(pk).put("choixPokemon", choixPokemonAdv);
            return 1;
        } else if (dress instanceof Conseil4) {
            this.choixCapaciteEnnemie = ((int) (Math.random() * (pk.getCap().nbCapacite() - 1)));
            this.actions.get(pk).put("capacite", this.choixCapaciteEnnemie);
            int choixPokemonAdv = (int) (Math.random() * this.pokemonAlies.lenght());
            this.actions.get(pk).put("choixPokemon", choixPokemonAdv);
            return 1;
        } else  if (dress instanceof Rival) {
            this.choixCapaciteEnnemie = ((int) (Math.random() * (pk.getCap().nbCapacite() - 1)));
            this.actions.get(pk).put("capacite", this.choixCapaciteEnnemie);
            int choixPokemonAdv = (int) (Math.random() * this.pokemonAlies.lenght());
            this.actions.get(pk).put("choixPokemon", choixPokemonAdv);
            return 1;
        } else if (dress instanceof Maitre) {
            this.choixCapaciteEnnemie = ((int) (Math.random() * (pk.getCap().nbCapacite() - 1)));
            this.actions.get(pk).put("capacite", this.choixCapaciteEnnemie);
            int choixPokemonAdv = (int) (Math.random() * this.pokemonAlies.lenght());
            this.actions.get(pk).put("choixPokemon", choixPokemonAdv);
            return 1;
        }
        return 0;
    }
    
    private void finTour (Pokemon pk, Pokemon pk1) {
        /* Les bonus accordés par Protection / Mur Lumière / Anti-Soin ainsi que Distorsion prennent fin.*/
        /* La capacité Mue a une chance sur trois de s'activer.*/
        /* Voeu s'active */
        /* Les climats se résolvent et prennent fin. Les capacités spéciales qui dépendent du climat s'activent. */
        /* Vampigraine draine les PV ennemis.*/
        /* Les Restes et Boue Noire s'activent. */
        /* Soin Poison s'active. */
        /* Ligotage / Siphon ainsi que toutes les attaques qui piègent et blessent les Pokémon se résolvent. */
        /* Les objets tels que l'Orbe Flamme s'activent. */
        /* Brulure, poison, Cauchemar et Malédiction infligent des dégâts. */
        this.EtatEnlevePv(pk);
        this.EtatEnlevePv(pk1);
        /* Anneau Hydro, Racines s'activent */
        /* Encore et Provoc se terminent */
    }
    
    private void finTour (EquipePokemon pokemons) {
        for (int i = 0 ; i < pokemons.lenght() ; i++) {
            if (pokemons.getPokemon(i) != null) {
                this.EtatEnlevePv(pokemons.getPokemon(i));
            }
        }
    }

    private void TerrainAffectePokemon(Pokemon pk) {
        if (pk != null) {
            if (this.terrain.affaibliPokemon(pk)) {
                this.afficheTexte(pk.getNom() + " est affaibli par le terrain");
                pk.estDiminuerParTerrain();
            } else {
                if (this.terrain.renforcePokemon(pk)) {
                    this.afficheTexte("le terrain renforce " + pk.getNom());
                    pk.estAugmenterParTerrain();
                }
            }
        }
    }

    private void utiliseObjet(Dresseur dress, Objet obj, Pokemon pk, Dresseur dress1) {
        if (obj != null) {
            this.afficheTexte(dress.getNom() + " utilise " + obj.getNom());
            if (obj.getType() == Type_objet.ball) {
                if (dress1 == null) {
                    this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdvBall", pk, null);
                    if (this.capturePokemon(pk, (Objet_ball)obj)) {
                        this.afficheTexte("vous avez capturer " + pk.getNom());
                        if (dress.getEquipe().getNbPokemon() == dress.getEquipe().lenght()) {
                            this.afficheTexte("Votre equipe est pleine, " + pk.getNom() + " a été envoyer au PC de " + dress.getPC().getNom());
                        }
                        dress.capturerPokemon(pk);
                        this.capture = true;
                    } else {
                        this.afficheTexte("oh non! " + pk.getNom() + " s'est ibérer.");
                        this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pk, null);
                    }
                } else {
                    this.afficheTexte("vous ne pouvez pas capturer le pokemon d'un autre dresseur");
                }
                dress.getSac().getObjet(obj).utilObjet();
            } else {
                dress.getEquipe().getPokemon().utilObjet(obj);
            }
        } else {
            this.choixMenu = 0;
        }
    }

    private Pokemon choixPokemonPerso(Dresseur dress) {
        if (dress.aPokemon()) {
            if (dress.getEquipe().getNbPokemonApte() == 1) {
                if (!this.pokemonAlies.aPokemon(dress.getEquipe().getPokemon())) {
                    return dress.getEquipe().getPokemon();
                }
            } else {
                do {
                    this.pcsControlleurVue.firePropertyChange("changerPokemon", null, null);
                    if (!(this.getChoix() <= 0 || this.getChoix() > dress.getEquipe().getNbPokemon())) {
                        if (dress.getEquipe().getPokemon(this.getChoix() -1).estKo()) {
                            this.afficheTexte("ce pokemon ne peut plus combattre");
                            this.choix = 0;
                        } else if (this.pokemonAlies.aPokemon(dress.getEquipe().getPokemon(this.getChoix() -1))) {
                            this.afficheTexte("ce pokemon est déjà au combat");
                            this.choix = 0;
                        }
                    }
                } while (this.getChoix() <= 0 || this.getChoix() > dress.getEquipe().getNbPokemon());
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
                return dress.getEquipe().getPokemon(this.getChoix() -1);
            }
        }
        return null;
    }

    private Pokemon choixPokemonEnnemie(Dresseur dress) {
        if (dress.aPokemon()) {
            return dress.getEquipe().getPokemon();
        }
        return null;
    }

    private double arrondiDegat(Pokemon pk, double degat, Attribut attribut) {
        if (degat < 1) {
            if (attribut.equals(Attribut.physique)) {
                if (degat <= (-pk.getDef())) {
                    degat = 0;
                } else {
                    degat = 1;
                }
            } else if (attribut.equals(Attribut.spéciale)) {
                if (degat <= (-pk.getDefSpe())) {
                    degat = 0;
                } else {
                    degat = 1;
                }
            } else {
                if (degat <= (-pk.getDef())) {
                    degat = 0;
                } else {
                    degat = 1;
                }
            }
        }
        return degat;
    }

    private int attaqueReussiPerso(Pokemon attaquant, Pokemon attaquer, Capacite cap) {
        this.afficheTexte(attaquant.getNom() + " utilise " + cap.getNom() + " sur " + attaquer.getNom() + " ennemie");
        cap.setNbUtilise(cap.getNbUtilise() + 1);
        cap.setPp(cap.getPp() - 1);
        return this.attaqueReussi(attaquant, attaquer, cap);
    }

    private int attaqueReussiEnnemie(Pokemon attaquant, Pokemon attaquer, Capacite cap) {
        if (this.ennemieAttaqueLui(attaquant)) {
            this.afficheTexte(attaquant.getNom() + " enemie utilise " + cap.getNom());
        } else {
            this.afficheTexte(attaquant.getNom() + " enemie utilise " + cap.getNom() + " sur " + attaquer.getNom());
        }
        cap.setPp(cap.getPp() - 1);
        return this.attaqueReussi(attaquant, attaquer, cap);
    }

    private int attaqueReussi(Pokemon attaquant, Pokemon attaquer, Capacite cap) {
        // cette fonction permet a l'ennemi d'attaquer un de vos perso
        if (cap.getPrec() == 0) {
            return 0;
        }
        int aleaRate;
        int aleaEsq;
        double prec = (cap.getPrec() * (attaquant.getPrec() / 100));
        aleaRate = (int) (Math.random() * 100 + 1);
        if (prec < aleaRate) {
            this.afficheTexte(this.textes.rateAttaque(attaquant.getNom()));
            return -1;
        }
        aleaEsq = (int) (Math.random() * attaquer.getEsq() + 1);
        if (aleaEsq > prec) {
            this.afficheTexte(this.textes.esquiveAttaque(attaquer.getNom()));
            return -1;
        }
        return 0;
    }

    private boolean verifieKO(Pokemon pk) {
        if (pk.estKo()) {
            this.afficheTexte(this.textes.estKO(pk.getNom()));
            return true;
        }
        return false;
    }
    
    private boolean capturePokemon (Pokemon pk, Objet_ball ball) {
        double pourcentage = ((((3 * pk.getPvMax()) - (2 * pk.getPv())) * pk.getTauxCapture() * ball.getBonus())/(3 * pk.getPvMax()))*pk.getEtat().getBonus();
        double alea = (Math.random() * 100 + 1);
        return alea <= pourcentage;
    }
    
    private void affichePv (Pokemon pk) {
        this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", pk, null);
    }
    
    private void affichePvAdv (Pokemon pk) {
        this.pcsControlleurVue.firePropertyChange("afficherPvPokemonAdv", pk, null);
    }
    
    public double degatAtt(Pokemon attaquant, Pokemon attaquer, Capacite cap) {
        double degat;
        double forceCap = this.getForceCapTerrain(cap);
        int pourcentageAtt = this.getForceTypeCap(attaquant, cap);
        int pourcentageDef = this.getDefTypeCap(attaquer, cap);
        if (cap.getClasse() == Attribut.physique) {
            /*degat = (((attaquant.getAtt() + (attaquant.getAtt() * ((forceCap  + ((forceCap * pourcentageAtt) / 100 ))/ 100))) * 
                    this.getForceEtFaiblesse(attaquer, cap)) - (attaquer.getDef() + ((attaquer.getDef() * pourcentageDef)/100)));*/
            degat = (((((attaquant.getNiveau() * 0.4) +2) * attaquant.getAtt() * forceCap) / (attaquer.getDef() * 50)) +2) * 
                    this.getForceEtFaiblesse(attaquer, cap);
            degat = this.arrondiDegat(attaquer, degat, Attribut.physique);
        } else if (cap.getClasse() == Attribut.spéciale) {
                System.out.println("attSpe : "+attaquant.getAttSpe());
                System.out.println("force cap : "+forceCap);
                System.out.println("pourcentage att : "+pourcentageAtt);
                System.out.println("augmentation att : "+(attaquant.getAttSpe() * ((forceCap  + ((forceCap * pourcentageAtt) / 100 ))/ 100)));
                System.out.println("defSpe : "+attaquer.getDefSpe());
                System.out.println("total defSpe : "+(attaquer.getDefSpe() + ((attaquer.getDefSpe() * pourcentageDef)/100)));
                /*degat = (((attaquant.getAttSpe() + (attaquant.getAttSpe() * ((forceCap  + ((forceCap * pourcentageAtt) / 100 ))/ 100))) * 
                        this.getForceEtFaiblesse(attaquer, cap)) - (attaquer.getDefSpe() + ((attaquer.getDefSpe() * pourcentageDef)/100)));*/
                degat = (((((attaquant.getNiveau() * 0.4) +2) * attaquant.getAttSpe() * forceCap) / (attaquer.getDefSpe() * 50)) +2) * 
                    this.getForceEtFaiblesse(attaquer, cap);
                degat = this.arrondiDegat(attaquer, degat, Attribut.spéciale);
                System.out.println("degat : "+degat);
        } else {
            degat = -attaquer.getDef();
            degat = this.arrondiDegat(attaquer, degat, Attribut.physique);
        }
        return degat;
    }
    
    private double getForceCapTerrain (Capacite cap) {
        double forceCap;
        if (this.terrain.affaibliAttaque(cap)) {
            this.afficheTexte(cap.getNom() + " est affaiblie par le terrain");
            forceCap = cap.getForce() - 5;
        } else {
            if (this.terrain.renforceAttque(cap)) {
                this.afficheTexte(cap.getNom() + " est renforcer par le terrain");
                forceCap = cap.getForce() + 5;
            } else {
                forceCap = cap.getForce();
            }
        }
        return forceCap;
    }
    
    private int getForceTypeCap (Pokemon pk, Capacite cap) {
        int pourcentage = 0; 
        if (pk.getType2() == null) {
            if (pk.getType1().equals(cap.getType())) {
                pourcentage = 5;
            }
        } else {
            if (pk.getType1().equals(cap.getType()) || pk.getType2().equals(cap.getType())) {
                pourcentage = 5;
            }
        }
        pourcentage = pourcentage + (((pk.getTypeExp().getNiveauAttParType(cap.getType())) -1) * 5);
        return pourcentage;
    }
    
    private int getDefTypeCap (Pokemon pk, Capacite cap) {
        return (((pk.getTypeExp().getNiveauDefParType(cap.getType())) -1) * 5);
    }
    
    private void verifAttaqueEnnemie (Pokemon attaquant, Pokemon attaquer, Capacite cap, PokemonVise pkmnVise) {
        if (this.attaqueReussiEnnemie(attaquant, attaquer, cap) == 0) {
            this.verifAttaque(attaquant, attaquer, cap, pkmnVise, true, false);
        }
    }
    
    private void verifAttaquePerso (Pokemon attaquant, Pokemon attaquer, Capacite cap, PokemonVise pkmnVise) {
        if (this.attaqueReussiPerso(attaquant, attaquer, cap) == 0) {
            this.verifAttaque(attaquant, attaquer, cap, pkmnVise, false, true);
        }
    }
    
    private void verifAttaque(Pokemon attaquant, Pokemon attaquer, Capacite cap, PokemonVise pkmnVise, boolean attaquantEnnemie, boolean attaquerEnnemie) {
        double degat;
        String libelleAttaquant;
        String libelleAttaquer;
        if (attaquantEnnemie) {
            libelleAttaquant = "ennemie";
        } else {
            libelleAttaquant = "";
        }
        if (attaquerEnnemie) {
            libelleAttaquer = "ennemie";
        } else {
            libelleAttaquer = "";
        }
        if (cap instanceof CapaciteContreCoup) {
            CapaciteContreCoup capaciteContreCoup = (CapaciteContreCoup) cap;
            attaquant.utiliseCap(capaciteContreCoup);
            degat = this.degatAtt(attaquant, attaquer, capaciteContreCoup);
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteContreCoup);
            }
            if (attaquantEnnemie) {
                this.affichePv(attaquer);
            } else {
                this.affichePvAdv(attaquer);
            }
            this.afficheTexte(attaquant.getNom() + " " + libelleAttaquant + " se blesse en frappant");
            attaquant.recoitDegat(capaciteContreCoup.degatContreCoup(attaquant));
            if (attaquantEnnemie) {
                this.affichePvAdv(attaquant);
            } else {
                this.affichePv(attaquant);
            }
        } else if (cap instanceof CapaciteEtat) {
            CapaciteEtat capaciteEtat = (CapaciteEtat) cap;
            attaquant.utiliseCap(capaciteEtat);
            degat = this.degatAtt(attaquant, attaquer, capaciteEtat);
            attaquer.recoitDegat(degat);
            if (attaquantEnnemie) {
                this.affichePv(attaquer);
            } else {
                this.affichePvAdv(attaquer);
            }
            attaquer.recoitCap(cap);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteEtat);
            }
            if (!attaquer.estKo() && capaciteEtat.affecte()) {
                attaquer.setEtat(capaciteEtat.getEtat());
                this.afficheTexte(attaquer.getNom() + " " + libelleAttaquer + " " + capaciteEtat.getEtat().toString());
                if (attaquantEnnemie) {
                    this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", attaquer, null);
                } else {
                    this.pcsControlleurVue.firePropertyChange("afficherPvPokemonAdv", attaquer, null);
                }
            }
        } else if (cap instanceof CapaciteFixe) {
            CapaciteFixe capaciteFixe = (CapaciteFixe) cap;
            attaquant.utiliseCap(capaciteFixe);
            degat = capaciteFixe.getForce();
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteFixe);
            }
            if (attaquantEnnemie) {
                this.affichePv(attaquer);
            } else {
                this.affichePvAdv(attaquer);
            }
        } else if (cap instanceof CapaciteMort) {
            CapaciteMort capaciteMort = (CapaciteMort) cap;
            attaquant.utiliseCap(capaciteMort);
            degat = capaciteMort.getDegat(attaquer);
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteMort);
            }
            if (attaquantEnnemie) {
                this.affichePv(attaquer);
            } else {
                this.affichePvAdv(attaquer);
            }
        } else if (cap instanceof CapaciteMultiple) {
            CapaciteMultiple capaciteMultiple = (CapaciteMultiple) cap;
            attaquant.utiliseCap(capaciteMultiple);
            if (capaciteMultiple.parTour()) {

            } else {
                int nbCoup = capaciteMultiple.getNbCoup();
                int indice = 0;
                while (indice < nbCoup && !attaquer.estKo()) {
                    degat = this.degatAtt(attaquant, attaquer, capaciteMultiple);
                    attaquer.recoitDegat(degat);
                    this.afficheTexte("touché " + (indice+1) + " fois");
                    if (attaquantEnnemie) {
                        this.affichePv(attaquer);
                    } else {
                        this.affichePvAdv(attaquer);
                    }
                    indice++;
                }
            }
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteMultiple);
            }
        } else if (cap instanceof CapaciteSimple) {
            attaquant.utiliseCap(cap);
            degat = this.degatAtt(attaquant, attaquer, cap);
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(cap);
            }
            if (attaquantEnnemie) {
                this.affichePv(attaquer);
            } else {
                this.affichePvAdv(attaquer);
            }
        } else if (cap instanceof CapaciteSoin) {
            CapaciteSoin capaciteSoin = (CapaciteSoin) cap;
            attaquant.utiliseCap(capaciteSoin);
            attaquer.soin(capaciteSoin);
            attaquer.recoitCap(capaciteSoin);
            if (attaquantEnnemie) {
                this.affichePv(attaquer);
            } else {
                this.affichePvAdv(attaquer);
            }
        } else if (cap instanceof CapaciteStat) {
            CapaciteStat capaciteStat = (CapaciteStat) cap;
            attaquant.utiliseCap(capaciteStat);
            degat = this.degatAtt(attaquant, attaquer, capaciteStat);
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteStat);
            }
            if (attaquantEnnemie) {
                if (this.ennemieAttaqueLui(attaquant)) {
                    this.affichePvAdv(attaquant);
                } else {
                    this.affichePv(attaquer);
                }
            } else {
                if (this.persoAttaqueLui(attaquant)) {
                    this.affichePv(attaquant);
                } else {
                    this.affichePvAdv(attaquer);
                }
            }
            int nb = capaciteStat.lenght();
            if (capaciteStat.reussi()) {
                for (int i = 0 ; i<nb ; i++) {
                    if (capaciteStat.aAttribut(i)) {
                        int pourcentage = capaciteStat.getPourCent(i);
                        if (capaciteStat.getAugmente(i)) {
                            if (capaciteStat.getSurSoi(i)) {
                                if (attaquant.augmenteStat(capaciteStat.getAttribut(i), pourcentage)) {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquant.getNom() + " " + 
                                            libelleAttaquant + " augmente");
                                } else {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquant.getNom() + " " + 
                                            libelleAttaquant + " n'iras pas plus haut");
                                }
                            } else {
                                if (attaquer.augmenteStat(capaciteStat.getAttribut(i), pourcentage)) {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquer.getNom() + " " + 
                                            libelleAttaquer + " augmente");
                                } else {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquer.getNom() + " " + 
                                            libelleAttaquer + " n'iras pas plus haut");
                                }
                            }
                        } else {
                            if (capaciteStat.getSurSoi(i)) {
                                if (attaquant.diminueStat(capaciteStat.getAttribut(i), pourcentage)) {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquant.getNom() + " " + 
                                            libelleAttaquant + " diminue");
                                } else {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquant.getNom() + " " + 
                                            libelleAttaquant + " n'iras pas plus bas");
                                }
                            } else {
                                if (attaquer.diminueStat(capaciteStat.getAttribut(i), pourcentage)) {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquer.getNom() + " " + 
                                            libelleAttaquer + " diminue");
                                } else {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquer.getNom() + " " + 
                                            libelleAttaquer + " n'iras pas plus bas");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void persoChangePokemonKO (Pokemon pk) {
        if (pk != null) {
            this.afficheTexte("Vous envoyez " + pk.getNom());
            this.persoChangePokemon(pk);
        }
    }
    
    private void persoChangePokemon (Pokemon pk) {
        if (pk != null) {
            this.pokemonAlies.ajouterPokemon(pk);
            this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk, null);
            this.TerrainAffectePokemon(pk);
        }
    }
    
    private void advChangePokemon (Pokemon pk) {
        if (pk != null) {
            this.pokemonAdversaires.ajouterPokemon(pk);
            this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pk, null);
            this.TerrainAffectePokemon(pk);
        }
    }
    
    private void utilseSur (Pokemon attaquant, Pokemon attaquer, Capacite cap, PokemonVise pkmnVise) {
        this.afficheTexte(attaquant.getNom() + " utilise " + cap.getNom() + " sur " + attaquer.getNom());
        switch(pkmnVise) {
            case adversaire:
                break;
        }
        
    }
    
    private boolean EtatEmpecheAttaque (Pokemon pk) {
        int alea;
        switch (pk.getEtat()) {
            case folie :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.folie.name());
                    pk.setEtat(Etat.aucun);
                    return false;
                } else {
                    alea = (int) (Math.random() * 100 + 1);
                    if (alea > 50) {
                        return false;
                    } else {
                        this.afficheTexte("sa folie lui inflige des dégât");
                        pk.recoitDegat((pk.getPvMax() * 5) / 100);
                        if (this.pokemonAlies.aPokemon(pk)) {
                            this.affichePv(pk);
                        } else {
                            this.affichePvAdv(pk);
                        }
                        return true;
                    }
                }
            case gel :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.gel.name());
                    pk.setEtat(Etat.aucun);
                    if (this.pokemonAlies.aPokemon(pk)) {
                        this.affichePv(pk);
                    } else {
                        this.affichePvAdv(pk);
                    }
                    return false;
                } else {
                    this.afficheTexte(pk.getNom() + " est gelé");
                    return true;
                }
            case paralise :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.paralise.name());
                    pk.setEtat(Etat.aucun);
                    if (this.pokemonAlies.aPokemon(pk)) {
                        this.affichePv(pk);
                    } else {
                        this.affichePvAdv(pk);
                    }
                    return false;
                } else {
                    this.afficheTexte(pk.getNom() + " est paralisé");
                    return true;
                }
            case peur :
                this.afficheTexte(pk.getNom() + " est appeuré");
                return true;
            case someil :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.someil.name());
                    pk.setEtat(Etat.aucun);
                    if (this.pokemonAlies.aPokemon(pk)) {
                        this.affichePv(pk);
                    } else {
                        this.affichePvAdv(pk);
                    }
                    return false;
                } else {
                    this.afficheTexte(pk.getNom() + " dort");
                    return true;
                }
            default :
                break;
        }
        return false;
    }
    
    private void EtatEnlevePv (Pokemon pk) {
        if (pk != null) {
            int alea;
            switch (pk.getEtat()) {
                case brulure :
                    alea = (int) (Math.random() * 100 + 1);
                    if (alea > 50) {
                        this.afficheTexte(pk.getNom() + " est soigne de " + Etat.brulure.name());
                        if (this.pokemonAlies.aPokemon(pk)) {
                            this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", pk, null);
                        } else {
                            this.pcsControlleurVue.firePropertyChange("afficherPvPokemonAdv", pk, null);
                        }
                        pk.setEtat(Etat.aucun);
                    } else {
                        this.afficheTexte(pk.getNom() + " est brulé");
                        pk.recoitDegat((pk.getPvMax() * 5) / 100);
                        if (this.pokemonAlies.aPokemon(pk)) {
                            this.affichePv(pk);
                        } else {
                            this.affichePvAdv(pk);
                        }
                    }
                    break;
                case poison :
                    alea = (int) (Math.random() * 100 + 1);
                    if (alea > 50) {
                        this.afficheTexte(pk.getNom() + " est soigne de " + Etat.poison.name());
                        if (this.pokemonAlies.aPokemon(pk)) {
                            this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", pk, null);
                        } else {
                            this.pcsControlleurVue.firePropertyChange("afficherPvPokemonAdv", pk, null);
                        }
                        pk.setEtat(Etat.aucun);
                    } else {
                        this.afficheTexte(pk.getNom() + " souffre du poison");
                        pk.recoitDegat((pk.getPvMax() * 5) / 100);
                        if (this.pokemonAlies.aPokemon(pk)) {
                            this.affichePv(pk);
                        } else {
                            this.affichePvAdv(pk);
                        }
                    }
                    break;
                case peur :
                    pk.setEtat(Etat.aucun);
                    break;
                default :
                    break;
            }
        }
    }
    
    // cette fonction permet de savoir lequel de vos personnage l'ennemi va attaquer

    private void AttaqueEnnemi(Pokemon attaquant, Pokemon attaquer) {
        Capacite cap = attaquant.getCap().getCapacite(this.choixCapaciteEnnemie);
        this.verifAttaqueEnnemie(attaquant, attaquer, cap, cap.getPokemonVise());
    }

    private void AttaquePerso(Pokemon attaquant, Pokemon attaquer) {
        Capacite cap = attaquant.getCap().getCapacite(this.choixCapacite);
        this.verifAttaquePerso(attaquant, attaquer, cap, cap.getPokemonVise());
    }
    
    public int expGagne (Pokemon pk2, Dresseur dress) {
        int exp;
        if (dress == null) {
            exp = (int) (pk2.getExpDonner() * 0.8);
        } else if (dress instanceof Maitre) {
            exp = (int) (pk2.getExpDonner() * 2);
        } else if (dress instanceof Rival) {
            exp = (int) (pk2.getExpDonner() * 1.8);
        } else if (dress instanceof Conseil4) {
            exp = (int) (pk2.getExpDonner() * 1.6);
        } else if (dress instanceof ChampionArene) {
            exp = (int) (pk2.getExpDonner() * 1.4);
        } else if (dress instanceof Topdresseur) {
            exp = (int) (pk2.getExpDonner() * 1.2);
        } else {
            exp = (int) (pk2.getExpDonner() * 1);
        }
        return exp;
    }

    private void Exp(EquipePokemon pkmns, Pokemon pk2, Dresseur dress) {
        int exp = this.expGagne(pk2, dress);
        int nbPokemonExp = pkmns.getNbPokemonApte();
        for (int i = 0 ; i < this.pokemonAyantParticiperAuCombat.size() ; i++) {
            if (this.pokemonAyantParticiperAuCombat.get(i) != null && !this.pokemonAyantParticiperAuCombat.get(i).estKo() && !pkmns.aPokemon(this.pokemonAyantParticiperAuCombat.get(i))) {
                nbPokemonExp++;
            }
        }
        int expAGagner = exp / nbPokemonExp;
        for (int i = 0 ; i < nbPokemonExp ; i++) {
            if (!this.pokemonAyantParticiperAuCombat.get(i).estKo()) {
                Pokemon pkmn = this.pokemonAyantParticiperAuCombat.get(i);
                exp = expAGagner;
                this.afficheTexte(pkmn.getNom() + " gagne " + exp + " points d'exp");
                pkmn.setExp(pkmn.getExp() + exp);
                while (pkmn.getExp() >= pkmn.getExpNivSuiv()) {
                    if (pkmns.aPokemon(pkmn)) {
                        this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", pkmn, null);
                    }
                    exp = pkmn.getExp() - pkmn.getExpNivSuiv();
                    this.afficheTexte(pkmn.getNom() + " monte de niveau");
                    pkmn.nivSuiv();
                    if (pkmns.aPokemon(pkmn)) {
                        this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", pkmn, null);
                    }
                    if (pkmn.apprendCapacite(pkmn.getNiveau())) {
                        if (pkmn.getCap().estRempli()) {
                            boolean finiCapacite = false;
                            do {
                                this.afficheTexte(pkmn.getNom() + " tente d'apprendre "+ pkmn.getCapacite().get(pkmn.getNiveau()).getNom());
                                this.afficheTexte("Mais "+pkmn.getNom() + " possède déjà 6 capacites ");
                                if (this.jeu.confirmation("Voulez vous oublier une capacite pour apprendre "+ pkmn.getCapacite().get(pkmn.getNiveau()).getNom())) {
                                    Pokemon pokemon1Trans = this.pokemonAlies.getPokemon();
                                    this.pokemonAlies.ajouterPokemon(pkmn);
                                    this.pcsControlleurVue.firePropertyChange("afficherTechniques", pkmn, null);
                                    if (this.getChoix() != 0) {
                                        this.choixCapacite = this.getChoix() - 1;
                                        this.afficheTexte("1..2... et tadaa.");
                                        this.afficheTexte(pkmn.getNom() + " oubli "+ pkmn.getCap().getCapacite(this.choixCapacite).getNom());
                                        this.afficheTexte("et "+pkmn.getNom() + " apprend "+ pkmn.getCapacite().get(pkmn.getNiveau()).getNom());
                                        pkmn.getCap().remplaceCapacite(pkmn.getCapacite().get(pkmn.getNiveau()), this.choixCapacite);
                                        finiCapacite = true;
                                    }
                                    this.pokemonAlies.ajouterPokemon(pokemon1Trans);
                                } else {
                                    if (this.jeu.confirmation("Voulez vous abandonner "+ pkmn.getCapacite().get(pkmn.getNiveau()).getNom())) {
                                        this.afficheTexte(pkmn.getNom() + " n'a pas appris "+ pkmn.getCapacite().get(pkmn.getNiveau()).getNom());
                                        finiCapacite = true;
                                    }
                                }
                            } while (!finiCapacite);
                        } else {
                            pkmn.getCap().ajoutCapacite(pkmn.getCapacite().get(pkmn.getNiveau()));
                            this.afficheTexte(pkmn.getNom() + " apprend "+ pkmn.getCapacite().get(pkmn.getNiveau()).getNom());
                        }
                    }
                    pkmn.setExp(pkmn.getExp() + exp);
                }
            } else {
                this.pokemonAyantParticiperAuCombat.remove(i);
                i--;
            }
        }
        for (int i = 0 ; i < pkmns.lenght() ; i++) {
            if (pkmns.getPokemon(i) != null) {
                this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", pkmns.getPokemon(i), null);
            }
        }
        for (int i = 0 ; i < this.pokemonAyantParticiperAuCombat.size() ; i++) {
            if (!pkmns.aPokemon(this.pokemonAyantParticiperAuCombat.get(i))) {
                this.pokemonAyantParticiperAuCombat.remove(i);
            }
        }
    }

    private void amour(Pokemon pk, Pokemon pk1, Dresseur dress) {
        if (dress instanceof Maitre) {
            if (pk1.getNom().equals("Mewtwo")) {
                pk.setAmour(pk.getAmour() + 7);
            } else {
                pk.setAmour(pk.getAmour() + 5);
            }
        } else {
            if (dress instanceof Rival) {
                if (pk1.getNom().equals("Mewtwo")) {
                    pk.setAmour(pk.getAmour() + 6);
                } else {
                    pk.setAmour(pk.getAmour() + 4);
                }
            } else {
                if (dress instanceof Conseil4) {
                    if (pk1.getNom().equals("Mewtwo")) {
                        pk.setAmour(pk.getAmour() + 5);
                    } else {
                        pk.setAmour(pk.getAmour() + 3);
                    }
                } else {
                    if (dress instanceof ChampionArene) {
                        if (pk1.getNom().equals("Mewtwo")) {
                            pk.setAmour(pk.getAmour() + 4);
                        } else {
                            pk.setAmour(pk.getAmour() + 2);
                        }
                    } else {
                        if (dress instanceof Topdresseur) {
                            if (pk1.getNom().equals("Mewtwo")) {
                                pk.setAmour(pk.getAmour() + 3);
                            } else {
                                pk.setAmour(pk.getAmour() + 1);
                            }
                        } else {
                            pk.setAmour(pk.getAmour() + 1);
                        }
                    }
                }
            }
        }
    }

    private void KO(Pokemon pk) {
        pk.setAmour(pk.getAmour() - 1);
    }
    
    private void discoursFinCombat (Dresseur dress) {
        String str = dress.ParlerFinCombat();
        while (!str.isEmpty()) {
            this.afficheTexte(str);
            str = dress.ParlerFinCombat();
        }
    }
    
    private void argent (Dresseur dress1, Dresseur dress2) {
        int monai = dress2.getArgent();
        this.afficheTexte("vous gagnez " + monai + "$.");
        dress1.setArgent(dress1.getArgent() + monai);
    }

    private void evolution(Dresseur dress) {
        EquipePokemon equipe = dress.getEquipe();
        for (int i = 0 ; i < equipe.getNbPokemon() ; i++) {
            if (equipe.aPokemon(i)) {
                if (equipe.getPokemon(i) instanceof PokemonClassique) {
                    PokemonClassique pkClassique = (PokemonClassique) equipe.getPokemon(i);
                    if (pkClassique.evolue()) {
                        this.afficheTexte("Hein! " + pkClassique.getNom() + " evolue.");
                        Pokemon pk = pkClassique.getPokemonEvolution();
                        pk.setNiveau(pkClassique.getNiveau());
                        pk.setAmour(pkClassique.getAmour());
                        pk.setDoNomDresseur(pkClassique.getDoNomDresseur());
                        pk.setEtat(pkClassique.getEtat());
                        pk.setExp(pkClassique.getExp());
                        pk.setNbRuban(pkClassique.getNbRuban());
                        pk.setNumeroID(pkClassique.getNumeroID());
                        pk.setObjetEquipe(pkClassique.getObjetEquipe());
                        pk.setSexe(pkClassique.getSexe());
                        pk.setSurnom(pk.getSurnom());
                        pk.getCap().enleverTousCapacite();
                        ListeDeCapacite capacites = pkClassique.getCap();
                        for (int j = 0 ; j < capacites.nbCapacite() ; j++) {
                            if (capacites.getCapacite(j) != null) {
                                pk.getCap().ajoutCapacite(capacites.getCapacite(j));
                            }
                        }
                        for (int j = 0 ; j < capacites.size() ; j++) {
                            if (capacites.getListeDeCapacite(j) != null) {
                                pk.getCap().ajoutListeCapacite(capacites.getListeDeCapacite(j));
                            }
                        }
                        AttributsExp attributsExp = pkClassique.getAttributsExp();
                        for (int j = 0 ; j < attributsExp.size() ; j++) {
                            pk.getAttributsExp().setExpByAttribut(attributsExp.getExpAttribut(attributsExp.getAttribut(i)), attributsExp.getAttribut(i));
                            pk.getAttributsExp().setNiveauByAttribut(attributsExp.getNivAttribut(attributsExp.getAttribut(i)), attributsExp.getAttribut(i));
                        }
                        TypeExp typeExp = pkClassique.getTypeExp();
                        for (int j = 0 ; j < typeExp.size() ; j++) {
                            pk.getTypeExp().setExpAttByType(typeExp.getExpAttParType(typeExp.getType(i)), typeExp.getType(i));
                            pk.getTypeExp().setExpDefByType(typeExp.getExpDefParType(typeExp.getType(i)), typeExp.getType(i));
                            pk.getTypeExp().setNiveauAttByType(typeExp.getNiveauAttParType(typeExp.getType(i)), typeExp.getType(i));
                            pk.getTypeExp().setNiveauDefByType(typeExp.getNiveauDefParType(typeExp.getType(i)), typeExp.getType(i));
                        }
                        equipe.enleverPokemon(i);
                        equipe.ajouterPokemon(pk, i);
                        this.afficheTexte("Felicitation votre " + pkClassique.getNom() + " evolue en " + pk.getNom());
                        if (this.alies.getDresseur(0).getPokedex() != null) {
                            this.alies.getDresseur(0).getPokedex().capturePokemon(pk);
                        }
                        if (pk.getCapEvolution() != null) {
                            Capacite cap = pk.getCapEvolution();
                            if (pk.getCap().estRempli()) {
                                boolean finiCapacite = false;
                                do {
                                    this.afficheTexte(pk.getNom() + " tente d'apprendre "+ cap.getNom());
                                    this.afficheTexte("Mais "+pk.getNom() + " possède déjà 6 capacites ");
                                    if (this.jeu.confirmation("Voulez vous oublier une capacite pour apprendre "+ cap.getNom())) {
                                        Pokemon pokemon1Trans = this.pokemonAlies.getPokemon();
                                        this.pokemonAlies.ajouterPokemon(pk);
                                        this.pcsControlleurVue.firePropertyChange("afficherTechniques", pk, null);
                                        if (this.getChoix() != 0) {
                                            this.choixCapacite = this.getChoix() - 1;
                                            this.afficheTexte("1..2... et tadaa.");
                                            this.afficheTexte(pk.getNom() + " oubli "+ pk.getCap().getCapacite(this.choixCapacite).getNom());
                                            this.afficheTexte("et "+pk.getNom() + " apprend "+ cap.getNom());
                                            pk.getCap().remplaceCapacite(cap, this.choixCapacite);
                                            finiCapacite = true;
                                        }
                                        this.pokemonAlies.ajouterPokemon(pokemon1Trans);
                                    } else {
                                        if (this.jeu.confirmation("Voulez vous abandonner "+ cap.getNom())) {
                                            this.afficheTexte(pk.getNom() + " n'a pas appris "+ cap.getNom());
                                            finiCapacite = true;
                                        }
                                    }
                                } while (!finiCapacite);
                            } else {
                                pk.getCap().ajoutCapacite(cap);
                                this.afficheTexte(pk.getNom() + " apprend "+ cap.getNom());
                            }
                        }
                        if (pk.apprendCapacite(pk.getNiveau())) {
                            if (pk.getCap().estRempli()) {
                                boolean finiCapacite = false;
                                do {
                                    this.afficheTexte(pk.getNom() + " tente d'apprendre "+ pk.getCapacite().get(pk.getNiveau()).getNom());
                                    this.afficheTexte("Mais "+pk.getNom() + " possède déjà 6 capacites ");
                                    if (this.jeu.confirmation("Voulez vous oublier une capacite pour apprendre "+ pk.getCapacite().get(pk.getNiveau()).getNom())) {
                                        Pokemon pokemon1Trans = this.pokemonAlies.getPokemon();
                                        this.pokemonAlies.ajouterPokemon(pk);
                                        this.pcsControlleurVue.firePropertyChange("afficherTechniques", pk, null);
                                        if (this.getChoix() != 0) {
                                            this.choixCapacite = this.getChoix() - 1;
                                            this.afficheTexte("1..2... et tadaa.");
                                            this.afficheTexte(pk.getNom() + " oubli "+ pk.getCap().getCapacite(this.choixCapacite).getNom());
                                            this.afficheTexte("et "+pk.getNom() + " apprend "+ pk.getCapacite().get(pk.getNiveau()).getNom());
                                            pk.getCap().remplaceCapacite(pk.getCapacite().get(pk.getNiveau()), this.choixCapacite);
                                            finiCapacite = true;
                                        }
                                        this.pokemonAlies.ajouterPokemon(pokemon1Trans);
                                    } else {
                                        if (this.jeu.confirmation("Voulez vous abandonner "+ pk.getCapacite().get(pk.getNiveau()).getNom())) {
                                            this.afficheTexte(pk.getNom() + " n'a pas appris "+ pk.getCapacite().get(pk.getNiveau()).getNom());
                                            finiCapacite = true;
                                        }
                                    }
                                } while (!finiCapacite);
                            } else {
                                pk.getCap().ajoutCapacite(pk.getCapacite().get(pk.getNiveau()));
                                this.afficheTexte(pk.getNom() + " apprend "+ pk.getCapacite().get(pk.getNiveau()).getNom());
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void soinPokemon (Dresseur dress) {
        EquipePokemon equipe = dress.getEquipe();
        for (int i = 0 ; i < equipe.getNbPokemon() ; i++) {
            equipe.getPokemon(i).soinFinCombat();
        }
    }

    private double getForceEtFaiblesse(Pokemon pk, Capacite cap) {
        if (pk.estInefficace(cap.getType())) {
            this.afficheTexte("ça n'affecte pas " + pk.getNom());
            return 0;
        } else if (pk.estTresFort(cap.getType())) {
            this.afficheTexte("ce n'est pas très efficace");
            return 0.25;
        } else if (pk.estTresFaible(cap.getType())) {
            this.afficheTexte("c'est super efficace");
            return 4;
        } else if (pk.estFort(cap.getType())) {
            this.afficheTexte("ce n'est pas très efficace");
            return 0.5;
        } else  if (pk.estFaible(cap.getType())) {
            this.afficheTexte("c'est super efficace");
            return 2;
        } else {
            return 1;
        }
    }
    
    private void defaite () {
        for (int i = 0 ; i < this.alies.getDresseur(0).getEquipe().lenght() ; i++) {
            if (this.alies.getDresseur(0).getEquipe().aPokemon(i)) {
                this.alies.getDresseur(0).getEquipe().getPokemon(i).setAmour(this.alies.getDresseur(0).getEquipe().getPokemon(i).getAmour() - 5);
            }
        }
        //this.jeu.perdreCombat();
    }

    private Condition getConditionAction(int action) {
        switch (action) {
            case (1):
                return new ConditionAttaque();
            case (2):
                return new ConditionDegat();
            case (3):
                return new ConditionDegat();
            case (4):
                return new ConditionObjet();
            case (5):
                return new ConditionDefense();
            case (6):
                return new ConditionDegat();
        }
        return null;
    }
}

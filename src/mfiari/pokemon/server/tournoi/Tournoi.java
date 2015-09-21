/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.tournoi;

import mfiari.pokemon.server.perso.pokemon.Pokemon;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.liste.ListeDeGroupe;
import mfiari.pokemon.server.combat.Combat;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.perso.ChampionArene;
import mfiari.pokemon.server.perso.Conseil4;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.DresseurClassique;
import mfiari.pokemon.server.perso.Maitre;
import mfiari.pokemon.server.perso.Rival;
import mfiari.pokemon.server.perso.Topdresseur;
import mfiari.pokemon.server.ville.Terrain;
import mfiari.pokemon.server.ville.Terrains;

/**
 *
 * @author mike
 */
public class Tournoi extends ControlleurVue {
    
    private ListeDeGroupe poule;
    private ListeDeGroupe huitieme;
    private ListeDeGroupe quart;
    private ListeDeGroupe demi;
    private Groupe finale;
    private Groupe groupeEnCour;
    private Terrain terrain;
    private Terrain terrainDuCombat;
    private String nom;
    private ListeDeDresseur participants;
    private ListeDeDresseur vosDresseurs;
    private int nbParticipant;
    private String texte;
    private boolean aventure = false;
    private Dresseur dress1;
    private Dresseur dress2;
    
    public Tournoi () {
        this.terrain = Terrains.tousTerrain;
        this.nom = "Ligue Pokemon";
        this.nbParticipant = 16;
        this.participants = new ListeDeDresseur();
    }
    
    public Tournoi (int nbParticipant) {
        this.terrain = Terrains.tousTerrain;
        this.nom = "Ligue Pokemon";
        this.nbParticipant = nbParticipant;
        this.participants = new ListeDeDresseur();
    }
    
    public Tournoi (ListeDeDresseur participants) {
        this.terrain = Terrains.tousTerrain;
        this.nom = "Ligue Pokemon";
        this.nbParticipant = participants.size();
        this.participants = participants;
    }
    
    public Tournoi (ListeDeDresseur participants, ListeDeDresseur persos) {
        this.terrain = Terrains.tousTerrain;
        this.nom = "Ligue Pokemon";
        this.nbParticipant = participants.size();
        this.participants = participants;
        this.vosDresseurs = persos;
    }
    
    public Tournoi (ListeDeDresseur participants, ListeDeDresseur persos, Terrain t) {
        this(participants, persos);
        this.terrain = t;
    }
    
    public Tournoi (int nbParticipant, Terrain t, String nom) {
        this.terrain = t;
        this.nom = nom;
        this.nbParticipant = nbParticipant;
        this.participants = new ListeDeDresseur();
    }
    
    public int getNbParticipant () {
        return this.nbParticipant;
    }
    
    public Terrain getTerrain () {
        return this.terrainDuCombat;
    }
    
    public ListeDeGroupe getGroupePoule () {
        return this.poule;
    }
    
    public ListeDeGroupe getGroupeHuitieme () {
        return this.huitieme;
    }
    
    public ListeDeGroupe getGroupeQuart () {
        return this.quart;
    }
    
    public ListeDeGroupe getGroupeDemi () {
        return this.demi;
    }
    
    public Groupe getGroupeFinal () {
        return this.finale;
    }
    
    public Groupe getGroupe() {
        return this.groupeEnCour;
    }
    
    public Dresseur getDress1() {
        return this.dress1;
    }
    
    public Dresseur getDress2() {
        return this.dress2;
    }
    
    public void afficheTexte(String texte) {
        this.texte = texte;
        this.pcsControlleurVue.firePropertyChange("affichage", null, null);
    }

    public String getTexte() {
        return this.texte;
    }
    
    public void commencerTournoi () {
        switch (this.nbParticipant) {
            case 8:
                this.quart = new ListeDeGroupe();
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.demi = new ListeDeGroupe();
                this.demi.ajouterGroupe(new Groupe(2,6));
                this.demi.ajouterGroupe(new Groupe(2,6));
                this.finale = new Groupe(2,6);
                this.repartirParticipantAleatoirement(this.quart);
                this.quartFinal();
                break;
            case 16:
                this.huitieme = new ListeDeGroupe();
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.quart = new ListeDeGroupe();
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.demi = new ListeDeGroupe();
                this.demi.ajouterGroupe(new Groupe(2,6));
                this.demi.ajouterGroupe(new Groupe(2,6));
                this.finale = new Groupe(2,6);
                this.repartirParticipantAleatoirement(this.huitieme);
                this.huitiemeFinal();
                break;
            case 32 :
                this.poule = new ListeDeGroupe();
                this.poule.ajouterGroupe(new Groupe());
                this.poule.ajouterGroupe(new Groupe());
                this.poule.ajouterGroupe(new Groupe());
                this.poule.ajouterGroupe(new Groupe());
                this.poule.ajouterGroupe(new Groupe());
                this.poule.ajouterGroupe(new Groupe());
                this.poule.ajouterGroupe(new Groupe());
                this.poule.ajouterGroupe(new Groupe());
                this.huitieme = new ListeDeGroupe();
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.huitieme.ajouterGroupe(new Groupe(2,4));
                this.quart = new ListeDeGroupe();
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.demi = new ListeDeGroupe();
                this.demi.ajouterGroupe(new Groupe(2,6));
                this.demi.ajouterGroupe(new Groupe(2,6));
                this.finale = new Groupe(2,6);
                this.repartirParticipantAleatoirement(this.poule);
                this.poule();
                break;
        }
    }
    
    public void continuer () {
        
    }
    
    private void choixTerrain () {
        if (this.terrain.equals(Terrains.tousTerrain)) {
            int alea = (int) (Math.random() * Type.values().length - 1);
            this.terrainDuCombat = Terrains.getTerrain(alea);
        } else {
            this.terrainDuCombat = this.terrain;
        }
    }
    
    private void tour (Groupe groupe) {
        this.groupeEnCour = groupe;
        this.pcsControlleurVue.firePropertyChange("afficherTableauTournoi", null, null);
        this.dress1 = (Dresseur) groupe.getDresseur1();
        this.dress2 = (Dresseur) groupe.getDresseur2();
        this.choixTerrain();
        this.afficheTexte(this.dress1.getNom() + " VS " + this.dress2.getNom());
        this.afficheTexte("terrain : " + this.terrainDuCombat.toString());
        if (this.vosDresseurs.contains(this.dress1)) {
            this.menuAvantCombat();
        } else if (this.vosDresseurs.contains(this.dress2)) {
            Dresseur dresseur = this.dress1;
            this.dress1 = this.dress2;
            this.dress2 = dresseur;
            this.menuAvantCombat();
        } else {
            this.simulerCombat();
        }
        this.repartirPoint(groupe);
    }
    
    private void modifierTailleEquipe (ListeDeGroupe list) {
        for (int i = 0 ; i < list.size() ; i++) {
            this.modifierTailleEquipe((Groupe)list.getGroupe(i));
        }
    }
    
    private void modifierTailleEquipe (Groupe groupe) {
        for (int j = 0 ; j < groupe.lenght() ; j++) {
            Dresseur d = (Dresseur) groupe.getDresseur(j);
            System.out.println("j : " + j);
            System.out.println("groupe : " + groupe);
            System.out.println("dresseur : " + groupe.getDresseur(j));
            System.out.println("equipe : " + d.getEquipe());
            d.getEquipe().modifieTailleListePokemon(groupe.getNbPokemon());
        }
    }
    
    private void poule () {
        this.modifierTailleEquipe(this.poule);
        while (!this.poule.estFini()) {
            for (int i = 0 ; i < this.poule.size() ; i++) {
                this.tour((Groupe)this.poule.getGroupe(i));
                this.dress1.soignerEquipe();
                this.dress2.soignerEquipe();
            }
        }
        for (int i = 0 ; i < this.poule.size() ; i++) {
            this.huitieme.ajouterPersonnage(this.poule.getGroupe(i).getVainqueur());
            this.huitieme.ajouterPersonnage(this.poule.getGroupe(this.poule.size() - i - 1).getVainqueur2());
        }
        this.pcsControlleurVue.firePropertyChange("afficherTableauTournoi", null, null);
        this.huitiemeFinal();
    }
    
    private void huitiemeFinal () {
        this.modifierTailleEquipe(this.huitieme);
        for (int i = 0 ; i < this.huitieme.size() ; i++) {
            this.tour((Groupe)this.huitieme.getGroupe(i));
            this.quart.ajouterPersonnage(this.huitieme.getGroupe(i).getVainqueur());
            this.dress1.soignerEquipe();
            this.dress2.soignerEquipe();
        }
        this.quartFinal();
    }
    
    private void quartFinal () {
        this.modifierTailleEquipe(this.quart);
        for (int i = 0 ; i < this.quart.size() ; i++) {
            this.tour((Groupe)this.quart.getGroupe(i));
            this.demi.ajouterPersonnage(this.quart.getGroupe(i).getVainqueur());
            this.dress1.soignerEquipe();
            this.dress2.soignerEquipe();
        }
        this.demiFinal();
    }
    
    public void demiFinal () {
        this.modifierTailleEquipe(this.demi);
        for (int i = 0 ; i < this.demi.size() ; i++) {
            this.tour((Groupe)this.demi.getGroupe(i));
            this.finale.ajouteParticipant(this.demi.getGroupe(i).getVainqueur());
            this.dress1.soignerEquipe();
            this.dress2.soignerEquipe();
        }
        this.finale();
    }
    
    public void finale () {
        this.modifierTailleEquipe(this.finale);
        this.groupeEnCour = this.finale;
        this.pcsControlleurVue.firePropertyChange("afficherTableauTournoi", null, null);
        this.dress1 = (Dresseur)this.finale.getDresseur1();
        this.dress2 = (Dresseur)this.finale.getDresseur2();
        if (this.terrain.equals(Terrains.tousTerrain)) {
            this.terrainDuCombat = Terrains.terrainNormal;
        } else {
            this.terrainDuCombat = this.terrain;
        }
        if (this.vosDresseurs.contains(this.dress1)) {
            this.menuAvantCombat();
        } else if (this.vosDresseurs.contains(this.dress2)) {
            Dresseur dresseur = this.dress1;
            this.dress1 = this.dress2;
            this.dress2 = dresseur;
            this.menuAvantCombat();
        } else {
            this.simulerCombat();
        }
        this.repartirPoint(this.finale);
        this.dress1 = (Dresseur)this.finale.getVainqueur();
        this.afficheTexte("Le vainqueur du tournoi " + this.nom + " est " + this.dress1.getNom());
        this.afficheTexte("Avec comme pokemon : ");
        EquipePokemon equipe = this.dress1.getEquipe();
        for (int i = 0 ; i < equipe.getNbPokemon() ; i++) {
            this.afficheTexte(equipe.getPokemon(i).getNom());
        }
        for (int i = 0 ; i < equipe.size() ; i++) {
            if (equipe.aPokemonStocker(i)) {
                this.afficheTexte(equipe.getPokemonStocke(i).getNom());
            }
        }
    }
    
    private void repartirPoint (Groupe groupe) {
        groupe.repartirPoint(this.dress1, this.dress2);
        this.groupeEnCour = groupe;
        this.pcsControlleurVue.firePropertyChange("afficherPointGroupe", null, null);
    }
    
    private void menuAvantCombat () {
        EquipePokemon equipe = this.dress1.getEquipe();
        do {
            this.pcsControlleurVue.firePropertyChange("menu", null, null);
            if (this.choix == 1) {
                this.pcsControlleurVue.firePropertyChange("afficherDresseur", null, null);
            } else if (this.choix == 2) {
                if (equipe.getNbPokemon() != this.groupeEnCour.getNbPokemon()) {
                    this.afficheTexte("Vous n'avez pas assez de pokemon");
                }
            } else if (this.choix == 3) {
                do {
                    this.pcsControlleurVue.firePropertyChange("afficherPokemonDesseur", null, null);
                    if (this.choix > 0 && this.choix <= equipe.size()) {
                        int choixPokemon = this.choix - 1;
                        if (equipe.getNbPokemon() == equipe.lenght()) {
                            this.pcsControlleurVue.firePropertyChange("afficherPokemonDesseur2", null, null);
                            if (this.choix > 0 && this.choix <= equipe.size()) {
                                int choixPokemonAremplacer = this.choix - 1;
                                Pokemon pk = equipe.getPokemon(choixPokemonAremplacer);
                                equipe.ajouterPokemon(equipe.enleverPokemonStocker(choixPokemon), choixPokemonAremplacer);
                                equipe.setPokemonStocker(pk);
                            }
                        } else {
                            equipe.ajouterPokemon(equipe.enleverPokemonStocker(choixPokemon));
                        }
                    }
                } while (this.choix != 500);
            } else if (this.choix == 4) {
                this.dress1.soignerEquipe();
                this.pcsControlleurVue.firePropertyChange("soignerEquipe", null, null);
            }
        } while (this.choix != 2 || (equipe.getNbPokemon() != this.groupeEnCour.getNbPokemon()));
        this.choixPokemonAdversaire(this.dress2);
        this.combat(dress1, dress2);
    }
    
    private void choixPokemonAdversaire (Dresseur dress) {
        EquipePokemon equipe = dress.getEquipe();
        equipe.enleverTousPokemon();
        int tour = 0;
        int indice = 0;
        while (equipe.getNbPokemon() != this.groupeEnCour.getNbPokemon()) {
            if (equipe.aPokemonStocker(indice)) {
                switch (tour) {
                    case 0 :
                        if (this.terrainDuCombat.renforcePokemon(equipe.getPokemonStocke(indice))) {
                            equipe.ajouterPokemon(equipe.enleverPokemonStocker(indice));
                        }
                        break;
                    case 1 :
                        if (!this.terrainDuCombat.affaibliPokemon(equipe.getPokemonStocke(indice))) {
                            equipe.ajouterPokemon(equipe.enleverPokemonStocker(indice));
                        }
                        break;
                    case 2 :
                        equipe.ajouterPokemon(equipe.enleverPokemonStocker(indice));
                        break;
                }
            }
            indice++;
            if (indice == equipe.size()) {
                indice = 0;
                tour++;
            }
        }
        dress.soignerEquipe();
    }
    
    private void combat (Dresseur d1, Dresseur d2) {
        Combat c = new Combat (this.terrainDuCombat);
        /*if (this.aventure) {
            c.combatSimple(d1, d2);
        } else {
            c.combatSimpleExtra(d1, d2);
        }*/
    }
    
    private void simulerCombat() {
        int point;
        EquipePokemon pokemons;
        this.choixPokemonAdversaire(this.dress1);
        this.choixPokemonAdversaire(this.dress2);
        point = this.simulerCombat2(this.dress1, this.dress2);
        if (point == 0) {
            this.afficheTexte(this.dress2.getNom() + " remporte le match");
            pokemons = this.dress1.getEquipe();
            for (int i = 0 ; i < pokemons.getNbPokemon() ; i++) {
                pokemons.getPokemon(i).mettreKO();
            }
        } else if (point == 2 ) {
            this.afficheTexte(this.dress1.getNom() + " remporte le match");
             pokemons = this.dress2.getEquipe();
             for (int i = 0 ; i < pokemons.getNbPokemon() ; i++) {
                pokemons.getPokemon(i).mettreKO();
             }
        } else {
            this.afficheTexte("egalite");
            pokemons = this.dress1.getEquipe();
            for (int i = 0 ; i < pokemons.getNbPokemon() ; i++) {
                pokemons.getPokemon(i).mettreKO();
            }
            pokemons = this.dress2.getEquipe();
            for (int i = 0 ; i < pokemons.getNbPokemon() ; i++) {
               pokemons.getPokemon(i).mettreKO();
            }
        }
    }
    
    protected int simulerCombat2(Dresseur d1, Dresseur d2) {
        if (d1.equals(d2)) {
            return 1;
        }
        if (d1.getClass().equals(d2.getClass())) {
            return this.testTerrainPokemon(d1, d2);
        }
        if (d1 instanceof Maitre) {
            return 2;
        }
        if (d1 instanceof Rival) {
            if (d2 instanceof Maitre) {
                return 0;
            }
            return 2;
        }
        if (d1 instanceof Conseil4) {
            if (d2 instanceof Maitre) {
                return 0;
            }
            if (d2 instanceof Rival) {
                return 0;
            }
            return 2;
        }
        if (d1 instanceof ChampionArene) {
            if (d2 instanceof Topdresseur) {
                return 2;
            }
            if (d2 instanceof DresseurClassique) {
                return 2;
            }
            return 0;
        }
        if (d1 instanceof Topdresseur) {
            if (d2 instanceof DresseurClassique) {
                return 2;
            }
            return 0;
        }
        if (d1 instanceof DresseurClassique) {
            return 0;
        }
        return 0;
    }
    
    private int testTerrainPokemon (Dresseur d1, Dresseur d2) {
        int point;
        int nbPokemonRenforcerDress1 = 0;
        int nbPokemonAffaiblitDress1 = 0;
        int nbPokemonRenforcerDress2 = 0;
        int nbPokemonAffaiblitDress2 = 0;
        EquipePokemon pokemons = d1.getEquipe();
        for (int i = 0 ; i < pokemons.getNbPokemon() ; i++) {
            if (this.terrainDuCombat.renforcePokemon(pokemons.getPokemon(i))) {
                nbPokemonRenforcerDress1++;
            }
        }
        if (nbPokemonRenforcerDress1 == nbPokemonRenforcerDress2) {
            if (nbPokemonAffaiblitDress1 == nbPokemonAffaiblitDress2) {
                point = 1;
            } else if (nbPokemonAffaiblitDress1 < nbPokemonAffaiblitDress2) {
                point = 2;
            } else {
                point = 0;
            }
        } else if (nbPokemonRenforcerDress1 > nbPokemonRenforcerDress2) {
            if (nbPokemonAffaiblitDress1 == nbPokemonAffaiblitDress2) {
                point = 2;
            } else if (nbPokemonAffaiblitDress1 < nbPokemonAffaiblitDress2) {
                if (nbPokemonRenforcerDress1 - nbPokemonAffaiblitDress1 == nbPokemonRenforcerDress2 - nbPokemonAffaiblitDress2) {
                    point = 1;
                } else if (nbPokemonRenforcerDress1 - nbPokemonAffaiblitDress1 > nbPokemonRenforcerDress2 - nbPokemonAffaiblitDress2) {
                    point = 2;
                } else {
                    point = 0;
                }
            } else {
                if (nbPokemonRenforcerDress1 - nbPokemonAffaiblitDress1 == nbPokemonRenforcerDress2 - nbPokemonAffaiblitDress2) {
                    point = 1;
                } else if (nbPokemonRenforcerDress1 - nbPokemonAffaiblitDress1 > nbPokemonRenforcerDress2 - nbPokemonAffaiblitDress2) {
                    point = 2;
                } else {
                    point = 0;
                }
            }
        } else {
            if (nbPokemonAffaiblitDress1 == nbPokemonAffaiblitDress2) {
                point = 0;
            } else if (nbPokemonAffaiblitDress1 < nbPokemonAffaiblitDress2) {
                if (nbPokemonRenforcerDress1 - nbPokemonAffaiblitDress1 == nbPokemonRenforcerDress2 - nbPokemonAffaiblitDress2) {
                    point = 1;
                } else if (nbPokemonRenforcerDress1 - nbPokemonAffaiblitDress1 > nbPokemonRenforcerDress2 - nbPokemonAffaiblitDress2) {
                    point = 2;
                } else {
                    point = 0;
                }
            } else {
                if (nbPokemonRenforcerDress1 - nbPokemonAffaiblitDress1 == nbPokemonRenforcerDress2 - nbPokemonAffaiblitDress2) {
                    point = 1;
                } else if (nbPokemonRenforcerDress1 - nbPokemonAffaiblitDress1 > nbPokemonRenforcerDress2 - nbPokemonAffaiblitDress2) {
                    point = 2;
                } else {
                    point = 0;
                }
            }
        }
        return point;
    }
    
    private void repartirParticipantAleatoirement (ListeDeGroupe groupes) {
        int alea;
        int indice = 0;
        Dresseur d;
        while (!this.participants.isEmpty()) {
            alea = (int) (Math.random() * this.participants.size() - 1);
            d = this.participants.removeDresseur(alea);
            while (indice < groupes.size() && !groupes.getGroupe(indice).ajouteParticipant(d)) {
                indice++;
            }
        }
    }
    
    private void repartirParticipantManuellement (ListeDeGroupe groupes) {
        int alea = 0;
        int indice = 0;
        Dresseur d;
        while (!this.participants.isEmpty()) {
            d = this.participants.removeDresseur(alea);
            while (indice < groupes.size() && !groupes.getGroupe(indice).ajouteParticipant(d)) {
                indice++;
            }
        }
    }
    
}

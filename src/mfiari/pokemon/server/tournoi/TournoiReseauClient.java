/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.tournoi;

import mfiari.pokemon.server.perso.pokemon.Pokemon;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.net.Socket;
import mfiari.lib.game.liste.ListeDeGroupe;
import mfiari.lib.game.reseau.EnvoiObjet;
import mfiari.lib.game.reseau.ReceveurObjet;
import mfiari.pokemon.server.combat.Combat;
import mfiari.pokemon.server.combat.CombatReseau;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.ville.Terrain;
import mfiari.pokemon.server.ville.Terrains;

/**
 *
 * @author mike
 */
public class TournoiReseauClient extends Tournoi {
    
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
    private ListeDeDresseur dresseurReseau;
    private int nbParticipant;
    private int choix;
    private String texte;
    private boolean aventure = false;
    private Dresseur dress1;
    private Dresseur dress2;
    private Socket socket;
    private EnvoiObjet envoi;
    private ReceveurObjet receveur;
    private PropertyChangeSupport pcsDeroulementTournoi = new PropertyChangeSupport(this);
    
    public TournoiReseauClient () {
        this.terrain = Terrains.tousTerrain;
        this.nom = "Ligue Pokemon";
        this.nbParticipant = 16;
        this.participants = new ListeDeDresseur();
    }
    
    public TournoiReseauClient (ListeDeDresseur participants) {
        this.terrain = Terrains.tousTerrain;
        this.nom = "Ligue Pokemon";
        this.nbParticipant = participants.size();
        this.participants = participants;
    }
    
    public TournoiReseauClient (ListeDeDresseur participants, ListeDeDresseur persos, ListeDeDresseur persosReseaux, Socket socket, 
            EnvoiObjet envoi, ReceveurObjet receveur) {
        this.terrain = Terrains.tousTerrain;
        this.nom = "Ligue Pokemon";
        this.nbParticipant = participants.size();
        this.participants = participants;
        this.vosDresseurs = persos;
        this.dresseurReseau = persosReseaux;
        this.socket = socket;
        this.envoi = envoi;
        this.receveur = receveur;
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
    
    public void setChoix (int choix) {
        this.choix = choix;
    }
    
    public Dresseur getDress1() {
        return this.dress1;
    }
    
    public Dresseur getDress2() {
        return this.dress2;
    }
    
    public void afficheTexte(String texte) {
        this.texte = texte;
        this.pcsDeroulementTournoi.firePropertyChange("affichage", null, null);
    }

    public String getTexte() {
        return this.texte;
    }
    
    public void commencerTournoi () {
        System.out.println(this.nbParticipant);
        switch (this.nbParticipant) {
            case 8:
                this.quart = new ListeDeGroupe();
                /*this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.quart.ajouterGroupe(new Groupe(2,4));
                this.demi = new ListeDeGroupe();
                this.demi.ajouterGroupe(new Groupe(2,6));
                this.demi.ajouterGroupe(new Groupe(2,6));*/
                this.finale = new Groupe(2,6);
                //this.quart = (ListeDeGroupe)this.receveur.readObject();
                this.quartFinal();
                break;
            case 16:
                this.huitieme = new ListeDeGroupe();
                /*this.huitieme.ajouterGroupe(new Groupe(2,4));
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
                this.demi.ajouterGroupe(new Groupe(2,6));*/
                this.finale = new Groupe(2,6);
                //this.huitieme = (ListeDeGroupe)this.receveur.readObject();
                this.huitiemeFinal();
                break;
            case 32 :
                this.poule = new ListeDeGroupe();
                /*this.poule.ajouterGroupe(new Groupe());
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
                this.demi.ajouterGroupe(new Groupe(2,6));*/
                this.finale = new Groupe(2,6);
                this.finale = new Groupe(2,6);
                //this.poule = (ListeDeGroupe)this.receveur.readObject();
                this.poule();
                break;
        }
    }
    
    private void tour (Groupe groupe) {
        /*this.groupeEnCour = groupe;
        this.pcsDeroulementTournoi.firePropertyChange("afficherTableauTournoi", null, null);
        this.dress1 = (Dresseur) groupe.getDresseur1();
        this.dress2 = (Dresseur) groupe.getDresseur2();
        this.terrainDuCombat = (Terrain)this.receveur.readObject();
        this.afficheTexte(this.dress1.getNom() + " VS " + this.dress2.getNom());
        this.afficheTexte("terrain : " + this.terrainDuCombat.toString());
        if (this.vosDresseurs.contains(this.dress1)) {
            if (this.dresseurReseau.contains(this.dress2)) {
                this.dress2 = (Dresseur)receveur.readObject();
                this.envoi.writeObject(this.dress1);
                System.out.println("1." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
                System.out.println("2." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
                this.menuAvantCombatReseau();
            } else {
                this.menuAvantCombat();
                System.out.println("3." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
                System.out.println("4." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
                Dresseur d1 = Dresseur.getDresseur(this.dress1);
                this.envoi.writeObject(d1);
                //this.envoi.writeObject(this.dress1.getEquipe());
                Dresseur d2 = Dresseur.getDresseur(this.dress2);
                this.envoi.writeObject(d2);
                //this.envoi.writeObject(this.dress2.getEquipe());
            }
        } else if (this.vosDresseurs.contains(this.dress2)) {
            if (this.dresseurReseau.contains(this.dress1)) {
                this.dress1 = this.dress2;
                this.dress2 = (Dresseur)receveur.readObject();
                this.envoi.writeObject(this.dress1);
                System.out.println("5." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
                System.out.println("6." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
                this.menuAvantCombatReseau();
            } else {
                Dresseur dresseur = this.dress1;
                this.dress1 = this.dress2;
                this.dress2 = dresseur;
                this.menuAvantCombat();
                System.out.println("7." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
                System.out.println("8." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
                Dresseur d1 = Dresseur.getDresseur(this.dress1);
                this.envoi.writeObject(d1);
                //this.envoi.writeObject(this.dress1.getEquipe());
                Dresseur d2 = Dresseur.getDresseur(this.dress2);
                this.envoi.writeObject(d2);
                //this.envoi.writeObject(this.dress2.getEquipe());
            }
        } else {
            this.dress1 = (Dresseur)receveur.readObject();
            //EquipePokemon equipeDress1 = (EquipePokemon)receveur.readObject();
            //this.dress1.setEquipe(equipeDress1);
            this.dress2 = (Dresseur)receveur.readObject();
            //EquipePokemon equipeDress2 = (EquipePokemon)receveur.readObject();
            //this.dress2.setEquipe(equipeDress2);
            System.out.println("9." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
            System.out.println("10." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
            this.simulerCombat();
        }
        this.repartirPoint(groupe);*/
    }
    
    private void modifierTailleEquipe (ListeDeGroupe list) {
        for (int i = 0 ; i < list.size() ; i++) {
            //this.modifierTailleEquipe(list.getGroupe(i));
        }
    }
    
    private void modifierTailleEquipe (Groupe groupe) {
        for (int j = 0 ; j < groupe.lenght() ; j++) {
            Dresseur d = (Dresseur) groupe.getDresseur(j);
            d.getEquipe().modifieTailleListePokemon(groupe.getNbPokemon());
        }
    }
    
    private void poule () {
        this.modifierTailleEquipe(this.poule);
        while (!this.poule.estFini()) {
            for (int i = 0 ; i < this.poule.size() ; i++) {
                //this.tour(this.poule.getGroupe(i));
                this.dress1.soignerEquipe();
                this.dress2.soignerEquipe();
            }
        }
        for (int i = 0 ; i < this.poule.size() ; i++) {
            /*this.huitieme.ajouterDresseur(this.poule.getGroupe(i).getVainqueur());
            this.huitieme.ajouterDresseur(this.poule.getGroupe(this.poule.size() - i - 1).getVainqueur2());*/
        }
        this.pcsDeroulementTournoi.firePropertyChange("afficherTableauTournoi", null, null);
        this.huitiemeFinal();
    }
    
    private void huitiemeFinal () {
        this.modifierTailleEquipe(this.huitieme);
        for (int i = 0 ; i < this.huitieme.size() ; i++) {
            /*this.tour(this.huitieme.getGroupe(i));
            this.quart.ajouterDresseur(this.huitieme.getGroupe(i).getVainqueur());*/
            this.dress1.soignerEquipe();
            this.dress2.soignerEquipe();
        }
        this.quartFinal();
    }
    
    private void quartFinal () {
        this.modifierTailleEquipe(this.quart);
        for (int i = 0 ; i < this.quart.size() ; i++) {
            /*this.tour(this.quart.getGroupe(i));
            this.demi.ajouterDresseur(this.quart.getGroupe(i).getVainqueur());*/
            this.dress1.soignerEquipe();
            this.dress2.soignerEquipe();
        }
        this.demiFinal();
    }
    
    public void demiFinal () {
        this.modifierTailleEquipe(this.demi);
        for (int i = 0 ; i < this.demi.size() ; i++) {
            /*this.tour(this.demi.getGroupe(i));
            this.finale.ajouteParticipant(this.demi.getGroupe(i).getVainqueur());*/
            this.dress1.soignerEquipe();
            this.dress2.soignerEquipe();
        }
        this.finale();
    }
    
    public void finale () {
        /*this.modifierTailleEquipe(this.finale);
        this.groupeEnCour = this.finale;
        this.pcsDeroulementTournoi.firePropertyChange("afficherTableauTournoi", null, null);
        this.dress1 = (Dresseur) this.finale.getDresseur1();
        this.dress2 = (Dresseur) this.finale.getDresseur2();
        if (this.vosDresseurs.contains(this.dress1)) {
            if (this.dresseurReseau.contains(this.dress2)) {
                this.dress2 = (Dresseur)receveur.readObject();
                this.envoi.writeObject(this.dress1);
                this.menuAvantCombatReseau();
            } else {
                this.menuAvantCombat();
                this.envoi.writeObject(this.dress1);
                this.envoi.writeObject(this.dress2);
            }
        } else if (this.vosDresseurs.contains(this.dress2)) {
            if (this.dresseurReseau.contains(this.dress1)) {
                this.dress1 = this.dress2;
                this.dress2 = (Dresseur)receveur.readObject();
                this.envoi.writeObject(this.dress1);
                this.menuAvantCombatReseau();
            } else {
                Dresseur dresseur = this.dress1;
                this.dress1 = this.dress2;
                this.dress2 = dresseur;
                this.menuAvantCombat();
                this.envoi.writeObject(this.dress1);
                this.envoi.writeObject(this.dress2);
            }
        } else {
            this.dress1 = (Dresseur)receveur.readObject();
            this.dress2 = (Dresseur)receveur.readObject();
            this.simulerCombat();
        }
        this.repartirPoint(this.finale);
        this.dress1 = (Dresseur) this.finale.getVainqueur();
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
        }*/
    }
    
    private void repartirPoint (Groupe groupe) {
        groupe.repartirPoint(this.dress1, this.dress2);
        this.groupeEnCour = groupe;
        this.pcsDeroulementTournoi.firePropertyChange("afficherPointGroupe", null, null);
    }
    
    private void menuAvantCombat () {
        EquipePokemon equipe = this.dress1.getEquipe();
        System.out.println("11." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
        System.out.println("12." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
        do {
            this.pcsDeroulementTournoi.firePropertyChange("menu", null, null);
            if (this.choix == 1) {
                this.pcsDeroulementTournoi.firePropertyChange("afficherDresseur", null, null);
            } else if (this.choix == 2) {
                if (equipe.getNbPokemon() != this.groupeEnCour.getNbPokemon()) {
                    this.afficheTexte("Vous n'avez pas assez de pokemon");
                }
            } else if (this.choix == 3) {
                do {
                    this.pcsDeroulementTournoi.firePropertyChange("afficherPokemonDesseur", null, null);
                    if (this.choix > 0 && this.choix <= equipe.size()) {
                        int choixPokemon = this.choix - 1;
                        if (equipe.getNbPokemon() == equipe.lenght()) {
                            this.pcsDeroulementTournoi.firePropertyChange("afficherPokemonDesseur2", null, null);
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
            }
        } while (this.choix != 2 || (equipe.getNbPokemon() != this.groupeEnCour.getNbPokemon()));
        this.choixPokemonAdversaire(this.dress2);
        System.out.println("13." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
        System.out.println("14." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
        this.combat(dress1, dress2);
    }
    
    private void menuAvantCombatReseau () {
        EquipePokemon equipe = this.dress1.getEquipe();
        System.out.println("15." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
        System.out.println("16." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
        do {
            this.pcsDeroulementTournoi.firePropertyChange("menu", null, null);
            if (this.choix == 1) {
                this.pcsDeroulementTournoi.firePropertyChange("afficherDresseur", null, null);
            } else if (this.choix == 2) {
                if (equipe.getNbPokemon() != this.groupeEnCour.getNbPokemon()) {
                    this.afficheTexte("Vous n'avez pas assez de pokemon");
                }
            } else if (this.choix == 3) {
                do {
                    this.pcsDeroulementTournoi.firePropertyChange("afficherPokemonDesseur", null, null);
                    if (this.choix > 0 && this.choix <= equipe.size()) {
                        int choixPokemon = this.choix - 1;
                        if (equipe.getNbPokemon() == equipe.lenght()) {
                            this.pcsDeroulementTournoi.firePropertyChange("afficherPokemonDesseur2", null, null);
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
            }
        } while (this.choix != 2 || (equipe.getNbPokemon() != this.groupeEnCour.getNbPokemon()));
        this.dress1.setEquipe(equipe);
        //this.dress2 = (Dresseur)receveur.readObject();
        //EquipePokemon equipeDress2 = (EquipePokemon)receveur.readObject();
        //this.dress2.setEquipe(equipeDress2);
        Dresseur d1 = Dresseur.getDresseur(this.dress1);
        //this.envoi.writeObject(d1);
        //this.envoi.writeObject(this.dress1.getEquipe());
        System.out.println("17." + this.dress1.getNom() + " : " + this.dress1.getEquipe().getNbPokemon() + ", " + this.dress1.getEquipe().lenght());
        System.out.println("18." + this.dress2.getNom() + " : " + this.dress2.getEquipe().getNbPokemon() + ", " + this.dress2.getEquipe().lenght());
        this.combatResau(dress1, dress2);
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
        dress.setEquipe(equipe);
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
    
    private void combatResau (Dresseur d1, Dresseur d2) {
        CombatReseau c = new CombatReseau (this.terrainDuCombat, this.socket);
        //c.combatSimpleReseau(d1, d2);
    }
    
    private void simulerCombat() {
        int point;
        EquipePokemon pokemons;
        point = this.simulerCombat2(this.dress1, this.dress2);
        if (point == 0) {
            this.afficheTexte(this.dress2.getNom() + " remporte le match");
        } else if (point == 2 ) {
            this.afficheTexte(this.dress1.getNom() + " remporte le match");
        } else {
            this.afficheTexte("egalite");
        }
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
    
    public void ajouterEcouteurTournoi(PropertyChangeListener ecouteur) {
        this.pcsDeroulementTournoi.addPropertyChangeListener(ecouteur);
    }
    
}

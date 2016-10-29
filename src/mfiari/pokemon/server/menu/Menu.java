/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.menu;

import mfiari.lib.game.connexionBD.ConnexionBD;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.controlleur.Vues;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.core.perso.pokemon.Pokemon;
import mfiari.pokemon.server.Global;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.pokemon.server.connexionBD.Connexion;

/**
 *
 * @author mike
 */
public class Menu extends ControlleurVue {
    
    private Dresseur dresseur;
    private PokemonJeu jeu;
    private int choixSac;
    private int page;

    public Menu(Dresseur dress, PokemonJeu jeu) {
        this.dresseur = dress;
        this.jeu = jeu;
        this.choixSac = 1;
        this.page = 1;
    }
    
    public void setChoixSac (int choix) {
        this.choixSac = choix;
    }
    
    public int getChoixSac () {
        return this.choixSac;
    }
    
    public int getPage () {
        return this.page;
    }

    public void setPageMenu(int page) {
        if (page < 1) {
            this.page = 4;
        } else if (page > 4) {
            this.page = 1;
        } else {
            this.page = page;
        }
    }
    
    public Dresseur getPerso () {
        return this.dresseur;
    }
    
    public PokemonJeu getJeu () {
        return this.jeu;
    }
    
    public void Menu() {
        do {
            this.pcsControlleurVue.firePropertyChange("afficherMenu", null, null);
            switch (this.choix) {
                case (1):
                    Vues.createVue(this.dresseur.getPokedex());
                    this.dresseur.getPokedex().pokedex();
                    break;
                case (2):
                    this.menuPokemon();
                    break;
                case (3):
                    this.menuObjet();
                    break;
                case (4):
                    Vues.createVue(this.dresseur.getPokematos());
                    this.dresseur.getPokematos().ouvrirPokematos();
                    break;
                case (5):
                    this.menuCarteDresseur();
                    break;
                case (6):
                    this.menuConfiguration();
                    break;
                case (7):
                    this.menuSauvegarder();
                    break;
                default:
                    break;
            }
        } while (this.choix != -1);
        this.pcsControlleurVue.firePropertyChange("finMenu", null, null);
        this.supprimerTousEcouteur();
    }
    
    private void menuPokemon () {
        do {
            this.pcsControlleurVue.firePropertyChange("afficherPokemons", null, null);
        } while (this.choix < 0 && this.choix > this.dresseur.getEquipe().lenght() && this.choix != 7);
        if (this.choix != 0) {
            int choixPokemon = this.choix;
            do {
                this.pcsControlleurVue.firePropertyChange("afficherMenuChoixPokemon", null, null);
                switch (this.choix) {
                    case (1):
                        do {
                            this.choix = choixPokemon;
                            this.pcsControlleurVue.firePropertyChange("affichePokemon", null, null);
                            if (this.choix == -1) {
                                this.setPageMenu(this.page + 1);
                            } else if (this.choix == -2) {
                                this.setPageMenu(this.page - 1);
                            }
                        } while (this.choix != -3);
                        break;
                    case (2):
                        this.pcsControlleurVue.firePropertyChange("afficherPokemons2", null, null);
                        if (this.choix != 0) {
                            Pokemon pk = this.dresseur.getEquipe().getPokemon(choixPokemon -1);
                            this.dresseur.getEquipe().ajouterPokemon(this.dresseur.getEquipe().getPokemon(this.choix -1), choixPokemon -1);
                            this.dresseur.getEquipe().ajouterPokemon(pk, this.choix -1);
                        }
                        break;
                    case (3):
                        if (this.dresseur.getEquipe().getNbPokemon() > 1) {
                            Pokemon pk = this.dresseur.getEquipe().enleverPokemon(choixPokemon-1);
                            System.out.println(pk.getNom()+" à été relacher");
                            System.out.println("Au revoir "+pk.getNom());
                        }
                        break;
                    default:
                        break;
                }
            } while (this.choix != 0 && this.choix != 2 && this.choix != 3);
            this.menuPokemon();
        }
    }

    //ce programme affiche ce qu'il y a dans le menu objet
    private void menuObjet() {
        Vues.createVue(this.dresseur.getSac());
        this.dresseur.getSac().afficheSac();
    }
    
    //ce programme affiche la carte de dresseur
    private void menuCarteDresseur() {
        this.pcsControlleurVue.firePropertyChange("afficheCarteDresseur", null, null);
    }

    //ce programme permet de modifier la configuration du jeu
    private void menuConfiguration() {
        this.pcsControlleurVue.firePropertyChange("configuration", null, null);
    }

    private void menuSauvegarder () {
        ConnexionBD connexionBD = new ConnexionBD();
        Connexion c = new Connexion(connexionBD.getConnexionHSQL(Global.hsqlLocation, Global.hsqlUser, Global.hsqlMdp));
        c.parties();
        System.out.println("sauvegarde en cour, ne pas eteindre");
        c.sauvegarderPartie(this.jeu.getHeureTempsJeu(), this.jeu.getMinuteTempsJeu(), this.jeu.getSecondeTempsJeu());
        c.sauvegarderEndroit(this.jeu.getCarte_Pokemon());
        c.sauvegarderRivaux(Global.pokemonRival2, 1);
        c.sauvegarderRivaux(Global.pokemonRival3, 1);
        c.sauvegarderDresseur(this.dresseur);
        c.sauvegarderObjet(this.dresseur.getSac());
        c.sauvegarderBadge(this.dresseur.getBadges());
        c.sauvegarderPokemonPokedex(this.dresseur.getPokedex());
        c.sauvegarderPokemonJoueur(this.dresseur);
        c.sauvegarderDresseur_vaincu(this.jeu.getDresseurVaincu());
        c.sauvegarderEvenement(this.jeu.getEvenementJeu());
        c.finSauvegarderPartie();
        connexionBD.fermerConnexionHSQL();
        System.out.println("sauvegarde reussi");
    }
    
}

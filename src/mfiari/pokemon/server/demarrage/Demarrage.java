/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.demarrage;

import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.server.extra.MenuExtra;
import mfiari.pokemon.server.perso.Dresseurs;

/**
 *
 * @author mike
 */
public class Demarrage extends ControlleurVue {
    
    private Dresseur perso;
    private CreationPerso creationPerso;
    private CreationPokemon creationPokemon;
    private CreationCapacite creationCapacite;
    private CreationEvenement creationEvenement;
    private CreationObjet creationObjet;
    private CreationVille creationVille;
    private String nomPersoPrincipale;
    
    public final String SAISIE_NOM_PERSO = "saisieNomPerso";
    public final String NOUVELLE_PARTIE = "nouvellePartie";
    public final String NOUVELLE_PARTIE3 = "nouvellePartie3";
    public final String CHOIX_LANGUE = "choixLangue";
    public final String CHOIX_MENU = "choixMenu";
    public final String DEBUT_JEU = "debutJeu";
    public final String VIDEO_INTRO = "videoIntro";
    public final String CHOIX_DRESSEUR = "choixDresseur";

    public Demarrage() {
        super(true);
    }
    
    public void setNomPersoPrincipal (String nom) {
        this.nomPersoPrincipale = nom;
    }
    
    public String getNomPersoPrincipal () {
        return this.nomPersoPrincipale;
    }
    
    private void debutJeu() {
    }
    
    private void choixDresseur() {
        do {
            this.pcsControlleurVue.firePropertyChange(CHOIX_DRESSEUR, null, null);
        } while (this.choix < 1 && this.choix > 4);
        switch (this.choix) {
            case 1:
                this.perso = Dresseurs.rival1Kanto;
                break;
            case 2:
                this.perso = Dresseurs.rival2Kanto;
                break;
            case 3:
                this.perso = Dresseurs.rival3Kanto;
                break;
        }
        this.nomPersoPrincipale = this.perso.getNom();
    }

    private void nouvellePartie() {
    }

    private void continuer() {
    }

    private void extra() {
        MenuExtra m = new MenuExtra ();
        m.menu();
    }
    
    private void initialisePartie () {
        this.creationPokemon = new CreationPokemon();
        this.creationPerso = new CreationPerso(this);
        this.creationCapacite = new CreationCapacite();
        this.creationEvenement = new CreationEvenement(this);
        this.creationObjet = new CreationObjet();
    }

    public void jeu() {
    }
    
}

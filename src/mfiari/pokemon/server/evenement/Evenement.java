/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import java.io.Serializable;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.lib.game.position.Position;

/**
 *
 * @author mike
 */
public abstract class Evenement extends mfiari.lib.game.evenements.Evenement implements Serializable {
    
    private final int tailleEquipe;

    public Evenement(Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre, int tailleEquipe) {
        super(endroitDeLevenement, personneAquiParler, objet, titre);
        this.tailleEquipe = tailleEquipe;
    }

    public int getTailleEquipe() {
        return this.tailleEquipe;
    }

    public abstract void activeEvenement (PokemonJeu jeu);

    public boolean estActiver(PokemonJeu jeu) {
        if (this.getEndroitDeLevenement() != null) {
            if (this.getEndroitDeLevenement().getPositionX() == -1 && this.getEndroitDeLevenement().getPositionY() == -1) {
                if (!this.getEndroitDeLevenement().getEndroit().equals(jeu.getPerso().getPosition().getEndroit())) {
                    this.active = false;
                    return false;
                }
            } else if (this.getEndroitDeLevenement().getPositionX() == -1) {
                if (!(this.getEndroitDeLevenement().getEndroit().equals(jeu.getPerso().getPosition().getEndroit())
                        && this.getEndroitDeLevenement().getPositionY() == jeu.getPerso().getPosition().getPositionY())) {
                    this.active = false;
                    return false;
                }
            } else if (this.getEndroitDeLevenement().getPositionY() == -1) {
                if (!(this.getEndroitDeLevenement().getEndroit().equals(jeu.getPerso().getPosition().getEndroit())
                        && this.getEndroitDeLevenement().getPositionX() == jeu.getPerso().getPosition().getPositionX())) {
                    this.active = false;
                    return false;
                }
            } else {
                if (!this.getEndroitDeLevenement().equals(jeu.getPerso().getPosition())) {
                    return false;
                }
            }
            if (this.getObjetAavoir() != null) {
                if (!jeu.getSac().contains(this.getObjetAavoir())) {
                    this.active = false;
                    return false;
                }
            }
            this.active = true;
            return true;
        }
        if (this.getPersonneAquiParler() != null) {
            if (this.objetAavoir != null) {
                if (!jeu.getSac().contains(this.objetAavoir)) {
                    this.active = false;
                    return false;
                }
            }
            this.active = true;
            return true;
        }
        this.active = false;
        return false;
    }
    
    
}

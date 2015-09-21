/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import java.util.logging.Level;
import java.util.logging.Logger;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.interfaces.evenements.IEvenementDeplacement;
import mfiari.lib.game.jeu.Jeu;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.lib.game.position.Position;
import mfiari.lib.game.ville.Endroit;
import mfiari.pokemon.server.PokemonJeu;

/**
 *
 * @author mike
 */
public class EvenementDeplacement extends Evenement implements IEvenementDeplacement {

    private Position positionArrive;
    private boolean deplacementAuto;

    public EvenementDeplacement(Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre, Position positionArrive, 
            boolean deplacementAuto) {
        super(endroitDeLevenement, personneAquiParler, objet, titre, 0);
        this.positionArrive = positionArrive;
        this.deplacementAuto = deplacementAuto;
    }

    public EvenementDeplacement(Endroit endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre, Position positionArrive, 
            boolean deplacementAuto) {
        super(new Position(endroitDeLevenement), personneAquiParler, objet, titre, 0);
        this.positionArrive = positionArrive;
        this.deplacementAuto = deplacementAuto;
    }

    @Override
    public void activeEvenement(Jeu jeu) {
        jeu.getPerso().setPosition(this.positionArrive);
    }

    @Override
    public void activeEvenement(PokemonJeu jeu) {
        if (this.deplacementAuto) {
            jeu.afficherEndroit((mfiari.pokemon.server.ville.Endroit)this.positionArrive.getEndroit());
            int positionXDepart = jeu.getPerso().getPosition().getPositionX();
            int positionXArrive = this.positionArrive.getPositionX();
            for (int i = positionXDepart ; i >= positionXArrive ; i--) {
                Position positionPrecedente = new Position(jeu.getPerso().getPosition());
                jeu.getPerso().getPosition().setPositionX(i);
                jeu.refreshAtPosition(positionPrecedente);
                jeu.refreshAtPosition(jeu.getPerso().getPosition());
                this.attendre(400);
            }
        } else {
            jeu.getPerso().setPosition(this.positionArrive);
            jeu.afficherEndroit((mfiari.pokemon.server.ville.Endroit)this.positionArrive.getEndroit());
        }
    }
    
    protected void attendre (int milliseconde) {
        try {
            Thread.sleep(milliseconde);
        } catch (InterruptedException ex) {
            Logger.getLogger(EvenementDeplacement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

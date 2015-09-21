/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.lib.game.position.Position;

/**
 *
 * @author mike
 */
public class EvenementQueteAnnexe extends EvenementQuete {
    
    private boolean commence;
    public EvenementQueteAnnexe(boolean sortir, Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre) {
        super(sortir, endroitDeLevenement, personneAquiParler, objet, titre);
        this.commence=false;
    }

    public void commence () {
        this.commence=true;
    }

    @Override
    public boolean estActiver (PokemonJeu jeu) {
        if (this.commence) {
            this.ajouterGens();
            return this.commence;
        } else {
            return super.estActiver(jeu);
        }
    }
    
}

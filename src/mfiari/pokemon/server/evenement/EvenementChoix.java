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
public class EvenementChoix extends EvenementDialogue {
    
    private EvenementQueteAnnexe e;

    public EvenementChoix (Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre) {
        super(endroitDeLevenement, personneAquiParler, objet, titre);
    }

    public EvenementChoix (Position endroitDeLevenement, Gens personneAquiParler, Objet objet, int tailleEquipe, String titre) {
        super(endroitDeLevenement, personneAquiParler, objet, titre, tailleEquipe);
    }

    public void ajouterEvenementQueteAnnexe (EvenementQueteAnnexe e) {
        this.e = e;
    }

    public EvenementQueteAnnexe getE () {
        return this.e;
    }



    public void choix (boolean choix) {
        if (choix) {
            this.e.commence();
        }
    }

    @Override
    public void activeEvenement(PokemonJeu jeu) {
        for (int i = 0; i < this.gens.size(); i++) {
            String str = this.gens.getPerso(i).Parler();
            while (!str.isEmpty()) {
                jeu.setParole(str);
                str = this.gens.getPerso(i).Parler();
            }
        }
        if (jeu.confirmation("Que faire ?")) {
            this.e.commence();
        }
    }
    
}

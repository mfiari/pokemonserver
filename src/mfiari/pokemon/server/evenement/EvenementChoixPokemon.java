/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import mfiari.lib.game.jeu.Jeu;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.list.ListeDePokemon;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.pokemon.core.perso.pokemon.Pokemon;
import mfiari.pokemon.core.ville.Endroit;

/**
 *
 * @author mike
 */
public class EvenementChoixPokemon extends Evenement{

    private final ListeDePokemon pokemonAChoisir;

    public EvenementChoixPokemon (Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre) {
        super(endroitDeLevenement, personneAquiParler, objet, titre, 0);
        this.pokemonAChoisir = new ListeDePokemon ();
    }

    public void ajouterPokemonAChoisir (Pokemon p) {
        this.pokemonAChoisir.ajouterPokemon(p);
    }

    @Override
    public void activeEvenement (PokemonJeu jeu) {
        boolean confirmation = false;
        do {
            jeu.afficherPokemonAchoisir(this.pokemonAChoisir);
            if (jeu.getChoix() > 0 && jeu.getChoix() <= this.pokemonAChoisir.size()) {
                Pokemon pk = this.pokemonAChoisir.getPokemon(jeu.getChoix()-1);
                jeu.afficherPokemonAchoisir(pk);
                jeu.afficherEndroit((Endroit)jeu.getEndroit());
                confirmation = jeu.confirmation("Voulez-vous prendre " + pk.getNom() + " le pokémon " + pk.getType1().name());
            }
        } while (!confirmation);
        Pokemon pk = this.pokemonAChoisir.enleverPokemon(jeu.getChoix()-1);
        jeu.getPerso().capturerPokemon(pk);
        jeu.setAffichage(pk.getNom() + " a rejoin le groupe");
        if (Evenements.premierPokemon_2.equals(this)) {
            Evenements.premierPokemon_3.ajouterPersoAajouter(this.pokemonAChoisir.getPokemon(0), 0);
            Evenements.premierPokemon_3.ajouterPersoAajouter(this.pokemonAChoisir.getPokemon(1), 1);
        }
    }

    @Override
    public void activeEvenement(Jeu jeu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

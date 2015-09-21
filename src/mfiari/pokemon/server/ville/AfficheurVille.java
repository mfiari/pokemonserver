/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import java.util.logging.Level;
import java.util.logging.Logger;
import mfiari.lib.game.liste.ListeDEndroit;
import mfiari.lib.game.position.Position;
import mfiari.lib.game.swing.Ecran;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.pokemon.server.demarrage.CreationEvenement;
import mfiari.pokemon.server.demarrage.CreationPokemon;
import mfiari.pokemon.server.demarrage.CreationVille;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.Dresseurs;
import mfiari.pokemon.server.perso.Habitants;

/**
 *
 * @author mike
 */
public class AfficheurVille {
    
    public static void main(String args[]) {
        AfficheurVille afficheurVille = new AfficheurVille();
        afficheurVille.testAffichageEndroit();
        //afficheurVille.testEndroit();
    }
    
    public void testAffichageEndroit() {
        Ecran ecran = new Ecran();
        CreationVille creationVille = new CreationVille();
        Habitants habitants = new Habitants();
        Dresseurs dresseurs = new Dresseurs();
        Endroit endroit = Endroits.milieu_route3_2;
        PokemonJeu pokemonJeu = new PokemonJeu();
        Dresseur perso = Dresseurs.rival1Kanto;
        perso.setPosition(new Position(0, 0, endroit));
        pokemonJeu.setPerso(perso);
        pokemonJeu.afficherEndroit(endroit);
        this.attendre();
    }
    
    public void testEndroit() {
        Ecran ecran = new Ecran();
        CreationVille creationVille = new CreationVille();
        CreationPokemon creationPokemon = new CreationPokemon();
        CreationEvenement creationEvenement = new CreationEvenement();
        Habitants habitants = new Habitants();
        Dresseurs dresseurs = new Dresseurs();
        Endroit endroit = Endroits.quartierHabitant_parmanie;
        PokemonJeu pokemonJeu = new PokemonJeu();
        Dresseur perso = Dresseurs.rival1Kanto;
        perso.setPosition(new Position(0, 0, endroit));
        pokemonJeu.jouer(creationEvenement.getEvenement(), perso, new ListeDEndroit(), new ListeDeDresseur());
        this.attendre();
    }
    
    public synchronized void attendre () {
        try {
            this.wait(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(AfficheurVille.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

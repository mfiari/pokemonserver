/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import mfiari.lib.game.jeu.Jeu;
import mfiari.lib.game.liste.ListeObjet;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.list.ListeDePokemon;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.pokemon.core.objet.Pokedex;
import mfiari.pokemon.core.objet.Pokematos;
import mfiari.pokemon.core.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class EvenementSpecial extends Evenement{

    private ListeObjet<Objet> objets;
    private ListeDePokemon persosAajouter;
    private ListeDePokemon persosAenlever;
    private Pokedex pokedex;
    private Pokematos pokematos;
    private boolean soin;
    private int tailleEquipe;

    public EvenementSpecial (Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre) {
        super(endroitDeLevenement, personneAquiParler, objet, titre, 0);
        this.objets = new ListeObjet <>();
        this.persosAajouter = new ListeDePokemon ();
        this.persosAenlever = new ListeDePokemon();
        this.soin = false;
        this.pokedex = null;
        this.pokematos = null;
        this.tailleEquipe = -1;
    }

    public void ajouterPersoAajouter (Pokemon p) {
        this.persosAajouter.ajouterPokemon(p);
    }

    public void ajouterPersoAenlever (Pokemon p) {
        this.persosAenlever.ajouterPokemon(p);
    }

    public void ajouterObjet (Objet o) {
        this.objets.ajoutObjet(o);
    }
    
    public void ajouterObjet (Objet o, int quantite) {
        this.objets.acheter(o, quantite);
    }
    
    public void ajouterPokedex (Pokedex p) {
        this.pokedex = p;
    }
    
    public void ajouterPokematos (Pokematos p) {
        this.pokematos = p;
    }

    public void soignerEquipe () {
        this.soin = true;
    }

    public void changerTailleEquipe (int taille) {
        this.tailleEquipe = taille;
    }

    @Override
    public void activeEvenement (PokemonJeu jeu) {
        for (int i=0 ; i< this.objets.size() ; i++) {
            jeu.getPerso().getSac().acheter(this.objets.getObjet(i), 0);
            jeu.setAffichage("vous recevez " + this.objets.getObjet(i).getQuantite() + " " + this.objets.getObjet(i).getNom());
        }
        if (this.soin) {
            jeu.getPerso().soignerEquipe();
            jeu.setAffichage("Tous vos pokemon ont ete soigne");
        }
        if (this.pokedex != null) {
            jeu.getPerso().setPokedex(this.pokedex);
            jeu.setAffichage("Vous recevez le " + this.pokedex.toString());
        }
        if (this.pokematos != null) {
            jeu.getPerso().setPokematos(this.pokematos);
            jeu.setAffichage("Vous recevez le pokematos");
        }
        for (int i=0 ; i< this.persosAajouter.size() ; i++) {
            jeu.getPerso().capturerPokemon(this.persosAajouter.getPokemon(i));
            jeu.setAffichage(this.persosAajouter.getPokemon(i).getNom() + " a rejoin le groupe");
        }
        for (int i=0 ; i<this.persosAenlever.size() ; i++) {
            
        }
        if (this.tailleEquipe != -1) {
            jeu.getPerso().getEquipe().modifieTailleListePokemon(this.tailleEquipe);
            for (int i = 0 ; i < jeu.getPerso().getEquipe().size() ; i++) {
                if (jeu.getPerso().getEquipe().aPokemonStocker(i)) {
                    jeu.getPerso().getEquipe().ajouterPokemon(jeu.getPerso().getEquipe().enleverPokemonStocker(i));
                }
            }
            jeu.setAffichage("La taille de votre equipe à changer. Vous pouvez maintenant porter "+this.tailleEquipe+ " pokemon.");
        }

    }

    @Override
    public void activeEvenement(Jeu jeu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

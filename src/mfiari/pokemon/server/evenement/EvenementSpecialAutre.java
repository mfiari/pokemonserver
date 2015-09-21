/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import mfiari.pokemon.server.perso.pokemon.Pokemon;
import java.util.ArrayList;
import mfiari.lib.game.jeu.Jeu;
import mfiari.lib.game.liste.ListeObjet;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.server.Global;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.server.objet.Pokedex;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.Dresseurs;

/**
 *
 * @author mike
 */
public class EvenementSpecialAutre extends Evenement{

    private ArrayList<ListeObjet<Objet>> objets;
    private ArrayList<ListeDePokemon> persosAajouter;
    private ArrayList<ListeDePokemon> persosAenlever;
    private ListeDeDresseur DresseurEvenement;
    private ArrayList<Pokedex> pokedex;
    private boolean soin;

    public EvenementSpecialAutre (Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre) {
        super(endroitDeLevenement, personneAquiParler, objet, titre, 0);
        this.objets = new ArrayList<>();
        this.persosAajouter = new ArrayList<>();
        this.persosAenlever = new ArrayList<>();
        this.DresseurEvenement = new ListeDeDresseur();
        this.pokedex = new ArrayList<>();
        this.soin = false;
    }

    public void ajouterDresseur (Dresseur d) {
        this.DresseurEvenement.ajouterDresseur(d);
        this.objets.add(new ListeObjet<>());
        this.persosAajouter.add(new ListeDePokemon());
        this.persosAenlever.add(new ListeDePokemon());
    }

    public void ajouterPersoAajouter (Pokemon p, int i) {
        this.persosAajouter.get(i).ajouterPokemon(p);
    }

    public void ajouterPersoAenlever (Pokemon p, int i) {
        this.persosAenlever.get(i).ajouterPokemon(p);
    }

    public void ajouterObjet (Objet o, int i) {
        this.objets.get(i).ajoutObjet(o);
    }
    
    public void ajouterObjet (Objet o, int quantite, int i) {
        this.objets.get(i).acheter(o, quantite);
    }
    
    public void ajouterPokedex (Pokedex p, int i) {
        this.pokedex.add(i, p);
    }

    public void soignerEquipe () {
        this.soin = true;
    }

    @Override
    public void activeEvenement (PokemonJeu jeu) {
        for (int i=0 ; i < this.DresseurEvenement.size() ; i++) {
            Dresseur d = this.DresseurEvenement.getDresseur(i);
            for (int j=0 ; j< this.objets.get(i).size() ; j++) {
                d.getSac().acheter(this.objets.get(i).getObjet(j), 1);
                jeu.setAffichage(d.getNom() + " reçoit " + this.objets.get(i).getObjet(j).getQuantite() + " " + this.objets.get(i).getObjet(j).getNom());
            }
            if (this.soin) {
                d.soignerEquipe();
                jeu.setAffichage("Les pokemons de " + d.getNom() + " ont été soigné.");
            }
            if (this.pokedex.size() > i && this.pokedex.get(i) != null) {
                jeu.getPerso().setPokedex(this.pokedex.get(i));
                jeu.setAffichage(d.getNom() + " reçoit le " + this.pokedex.get(i).toString());
            }
            if (this.persosAajouter.size() > i ) {
                for (int j=0 ; j< this.persosAajouter.get(i).size() ; j++) {
                    d.capturerPokemon(this.persosAajouter.get(i).getPokemon(j));
                    jeu.setAffichage(d.getNom() + " a reçu " + this.persosAajouter.get(i).getPokemon(j).getNom());
                    if (d.equals(Dresseurs.rival1Kanto)) {
                        Global.pokemonRival1 = this.persosAajouter.get(i).getPokemon(j);
                    } else if (d.equals(Dresseurs.rival2Kanto)) {
                        Global.pokemonRival2 = this.persosAajouter.get(i).getPokemon(j);
                    } else if (d.equals(Dresseurs.rival3Kanto)) {
                        Global.pokemonRival3 = this.persosAajouter.get(i).getPokemon(j);
                    }
                }
            }
            if (this.persosAenlever.size() > i ) {
                for (int j=0 ; j<this.persosAenlever.get(i).size() ; j++) {

                }
            }
        }
    }

    @Override
    public void activeEvenement(Jeu jeu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Environnement;
import mfiari.pokemon.core.ville.Sol;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.server.perso.pokemon.PokemonClassique;
import mfiari.pokemon.server.perso.pokemon.PokemonFinal;
import mfiari.pokemon.server.perso.pokemon.PokemonLegendaire;
import mfiari.pokemon.server.perso.pokemon.PokemonMultiEvolution;
import mfiari.lib.game.interfaces.ISol;
import mfiari.lib.game.interfaces.ville.IQuartier;
import mfiari.lib.game.liste.ListeDeBatiment;
import mfiari.lib.game.liste.ListeDeGens;
import mfiari.lib.game.personnage.Gens;
import mfiari.lib.game.personnage.Personnage;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.server.perso.Dresseur;

/**
 *
 * @author mike
 */
public class Quartier extends Endroit implements IQuartier {
    
    private static final long serialVersionUID = 354054054056L;
    
    private ListeDeBatiment batiments;
    private ListeDeGens personnages;
    private ListeDePokemon pokemons;
    private Terrain terrain;
    private Sol sol;

    public Quartier () {
    }

    public Quartier (String nom, int positionX, int positionY,int longueur, int largeur, Terrain terrain) {
        super(nom, positionX, positionY, longueur, largeur);
        this.batiments = new ListeDeBatiment ();
        this.personnages = new ListeDeGens ();
        this.pokemons = new ListeDePokemon ();
        this.terrain = terrain;
        this.sol = Sol.defaut;
    }
    
    @Override
    public ListeDeGens getGens () {
        return this.personnages;
    }

    @Override
    public void ajouterGens (Gens g) {
        this.personnages.ajouterPerso(g);
    }

    @Override
    public void enleverGens (Gens g) {
        this.personnages.enleverPerso(g);
    }
    
    @Override
    public void supprimeTous () {
        this.personnages.supprimeTous();
    }

    //@Override
    public void ajouterBatiment (Batiments b) {
        this.batiments.ajouterBatiment(b);
    }

    @Override
    public ListeDeBatiment getBatiments() {
        return this.batiments;
    }

    @Override
    public Endroit aEndroit (Position p) {
        return (Endroit)this.batiments.aBatiment(p);
    }

    @Override
    public Gens aGens (Position p) {
        return this.personnages.aPerso(p);
    }

    @Override
    public void entrer (Dresseur equipe) {
        
    }
    
    @Override
    public void ajouterPokemon (Pokemon pk, Environnement environnement, int pourcentage) {
        this.pokemons.ajouterPokemon(pk, environnement, pourcentage);
    }
    
    public boolean aPokemon () {
        return this.pokemons.size() > 0;
    }
    
    public boolean aPokemon (Environnement environnement) {
        return this.pokemons.getNbPokemonByEnvironnement(environnement) > 0;
    }
    
    public Pokemon getPokemonSauvage (Environnement environnement) {
        int pourcentage = (int) (Math.random() * 100);
        Pokemon pk = this.pokemons.getPokemonByEnvironnementAndPourcentage(environnement, pourcentage);
        if (pk != null) {
            return Pokemon.getInstance(pk);
        }
        return null;
    }
    
    @Override
    public Terrain getTerrain () {
        return this.terrain;
    }
    
    @Override
    public void setSol (ISol sol) {
        this.sol = (Sol)sol;
    }
    
    @Override
    public Sol getSol () {
        return this.sol;
    }

    @Override
    public Dresseur aDresseur(int i, int j) {
        Position p = new Position(i, j);
        if (this.personnages.aPerso(p) instanceof Dresseur) {
            Dresseur d = (Dresseur) this.personnages.aPerso(p);
            if (d.aPokemon()) {
                return d;
            }
        }
        return null;
    }

    @Override
    public Dresseur aDresseur(int i, int j, Orientation orientation) {
        Position p = new Position(i, j, orientation);
        if (this.personnages.aPerso(p) instanceof Dresseur) {
            Dresseur d = (Dresseur) this.personnages.aPerso(p);
            if (d.aPokemon() && d.getPosition().getOrientation().equals(p.getOrientation())) {
                return d;
            }
        }
        return null;
    }

    @Override
    public Personnage aPersonnage(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personnage aPersonnage(int i, int j, Orientation orientation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entrer(Personnage equipe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

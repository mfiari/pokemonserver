/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Environnement;
import mfiari.pokemon.core.ville.Sol;
import mfiari.lib.game.interfaces.ISol;
import mfiari.lib.game.interfaces.ville.ISalle;
import mfiari.lib.game.liste.ListeDeGens;
import mfiari.lib.game.personnage.Gens;
import mfiari.lib.game.personnage.Personnage;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.server.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class Salle extends Endroit implements ISalle {
    
    private static final long serialVersionUID = 354054054058L;

    private ListeDeGens personnages;
    private ListeDePokemon pokemons;
    private Sol sol;

    public Salle () {   
    }

    public Salle (String nom, int positionX, int positionY,int longueur, int largeur, Batiments batiment, int etage) {
        super(nom, positionX, positionY, longueur, largeur, Terrains.terrainNormal);
        this.personnages = new ListeDeGens ();
        this.pokemons = new ListeDePokemon ();
        this.sol = Sol.defaut;
        this.ajouterAuBatiment(batiment, etage);
    }

    public Salle (String nom, int positionX, int positionY,int longueur, int largeur, Batiments batiment, int etage, Terrain terrain) {
        super(nom, positionX, positionY, longueur, largeur, terrain);
        this.personnages = new ListeDeGens ();
        this.pokemons = new ListeDePokemon ();
        this.sol = Sol.defaut;
        this.ajouterAuBatiment(batiment, etage);
    }
    
    private void ajouterAuBatiment (Batiments batiment, int etage) {
        batiment.ajouterSalle(this, etage);
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

    @Override
    public Gens aGens (Position p) {
        return this.personnages.aPerso(p);
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
    public void setSol (ISol sol) {
        this.sol = (Sol)sol;
    }
    
    @Override
    public Sol getSol () {
        return this.sol;
    }

    @Override
    public Endroit aEndroit(Position p) {
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
    public void entrer(Dresseur equipe) {
        throw new UnsupportedOperationException("Not supported yet.");
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

    @Override
    public void ajouterPokemon(Pokemon pk, Environnement environnement, int pourcentage) {
        this.pokemons.ajouterPokemon(pk, environnement, pourcentage);
    }

}

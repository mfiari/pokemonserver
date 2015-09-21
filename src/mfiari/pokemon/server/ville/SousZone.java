/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Environnement;
import java.util.ArrayList;
import mfiari.lib.game.interfaces.ville.ISousZone;
import mfiari.lib.game.interfaces.ville.IVille;
import mfiari.lib.game.liste.ListeDeGens;
import mfiari.lib.game.personnage.Gens;
import mfiari.lib.game.personnage.Personnage;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.server.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class SousZone extends Endroit implements ISousZone {
    
    private final ArrayList<IVille> villes;

    public SousZone (String nom, int positionX, int positionY, int longueur, int largeur) {

        super(nom, positionX, positionY, longueur, largeur);
        this.villes = new ArrayList<>();
    }

    @Override
    public void ajouterVille (IVille v) {
        this.villes.add(v);
    }

    @Override
    public ArrayList<IVille> getVilles () {
        return this.villes;
    }

    @Override
    public Endroit aEndroit (Position p) {
        for (int k=0 ; k<this.villes.size(); k++) {
            if (this.villes.get(k).getPosition().equalsXY(p)) {
                return (Endroit)this.villes.get(k);
            }
        }
        return null;
    }

    @Override
    public Gens aGens (Position p) {
        return null;
    }

    @Override
    public void entrer (Dresseur equipe) {

    }

    @Override
    public Dresseur aDresseur(int i, int j) {
        return null;
    }

    @Override
    public Dresseur aDresseur(int i, int j, Orientation orientation) {
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ajouterPokemon(Pokemon pk, Environnement environnement, int pourcentage) {
        for (int i = 0 ; i < this.villes.size() ; i++) {
            ((Ville)this.villes.get(i)).ajouterPokemon(pk, environnement, pourcentage);
        }
    }

    @Override
    public ListeDeGens getGens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

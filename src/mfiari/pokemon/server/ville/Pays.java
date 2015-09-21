/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Environnement;
import java.util.ArrayList;
import mfiari.lib.game.interfaces.ville.IPays;
import mfiari.lib.game.interfaces.ville.IZone;
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
public class Pays extends Endroit implements IPays {

    private final ArrayList<IZone> zones;

    public Pays (String nom, int positionX, int positionY, int longueur, int largeur) {
        super(nom, positionX, positionY, longueur, largeur);
        this.zones = new ArrayList<>();
    }

    @Override
    public ArrayList<IZone> getZones () {
        return this.zones;
    }

    @Override
    public void ajouterZone (IZone z) {
        this.zones.add(z);
    }

    @Override
    public Endroit aEndroit (Position p) {
        return null;
    }

    @Override
    public Gens aGens (Position p) {
        return null;
    }

    @Override
    public void entrer(Dresseur equipe) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ajouterPokemon(Pokemon pk, Environnement environnement, int pourcentage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListeDeGens getGens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

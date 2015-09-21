/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Environnement;
import java.util.ArrayList;
import mfiari.lib.game.interfaces.ville.IQuartier;
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
public class Ville extends Endroit implements IVille {
    
    private final ArrayList<IQuartier> quartiers;
    

    public Ville (String nom, int positionX, int positionY, int longueur, int largeur) {

        super (nom, positionX, positionY, longueur, largeur);
        this.quartiers = new ArrayList<>();
    }

    @Override
    public void ajouterQuartier (IQuartier q) {
        this.quartiers.add(q);
    }

    @Override
    public ArrayList<IQuartier> getQuartiers () {
        return this.quartiers;
    }

    

    @Override
    public void entrer(Dresseur equipe) {
        Quartier quartier = (Quartier)this.quartiers.get(0);
        Position p = new Position (quartier.getObjetEndroit(0).getPosition());
        p.setEndroit(quartier);
        if (quartier.getObjetEndroit(0).getPosition().getPositionX() == 0) {
            p.reculer();
        } else if (quartier.getObjetEndroit(0).getPosition().getPositionY() == 0) {
            p.droite();
        } else if (quartier.getObjetEndroit(0).getPosition().getPositionX() == this.quartiers.get(0).getLongueur()) {
            p.avancer();
        } else {
            p.gauche();
        }
        equipe.setPosition(p);
    }

    @Override
    public void sortir () {
        /*this.remove(this.ville);
        this.ville.removeAll();
        this.ville.setVisible(false);*/
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
        for (int i = 0 ; i < this.quartiers.size() ; i++) {
            ((Quartier)this.quartiers.get(i)).ajouterPokemon(pk, environnement, pourcentage);
        }
    }

    @Override
    public ListeDeGens getGens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

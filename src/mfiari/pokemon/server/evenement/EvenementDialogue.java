/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import java.util.ArrayList;
import mfiari.lib.game.interfaces.evenements.IEvenementDialogue;
import mfiari.lib.game.jeu.Jeu;
import mfiari.lib.game.liste.ListeDeGens;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.pokemon.core.objet.Badge;
import mfiari.lib.game.position.Position;
import mfiari.lib.game.texte.Parole;

/**
 *
 * @author mike
 */
public class EvenementDialogue extends Evenement implements IEvenementDialogue {

    ListeDeGens<Gens> gens;
    ArrayList<Position> positionsEvenement;
    ArrayList<Position> positionsGens;
    private int longueurDialogue;
    private ListeDeGens<Gens> gensPresent;

    public EvenementDialogue(Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre) {
        super(endroitDeLevenement, personneAquiParler, objet, titre, 0);
        this.gens = new ListeDeGens<>();
        this.gensPresent = new ListeDeGens<>();
        this.longueurDialogue = 0;
        this.positionsEvenement = new ArrayList<>();
        this.positionsGens = new ArrayList<>();
    }

    public EvenementDialogue(Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre, int tailleEquipe) {
        super(endroitDeLevenement, personneAquiParler, objet, titre, tailleEquipe);
        this.gens = new ListeDeGens<>();
        this.gensPresent = new ListeDeGens<>();
        this.longueurDialogue = 0;
        this.positionsEvenement = new ArrayList<>();
        this.positionsGens = new ArrayList<>();
    }
    
    @Override
    public void ajouteDialogue () {
        this.longueurDialogue++;
    }

    @Override
    public void ajouterGens(Gens g) {
        this.gens.ajouterPerso(g);
        this.positionsEvenement.add(null);
        /*this.getEndroitDeLevenement().getEndroit().enleverGens(g);*/
    }

    @Override
    public void ajouterGens(Gens g, Position p) {
        p.setEndroit(this.getEndroitDeLevenement().getEndroit());
        this.gens.ajouterPerso(g);
        this.positionsEvenement.add(p);
        /*this.getEndroitDeLevenement().getEndroit().enleverGens(g);*/
    }

    @Override
    public ListeDeGens<Gens> getGens() {
        return this.gens;
    }

    @Override
    public void enleverGens () {
        for (int i = 0; i < this.gens.size(); i++) {
            if (!this.positionsGens.isEmpty()) {
                this.gens.getPerso(i).setPosition(this.positionsGens.get(i));
            }
            this.getEndroitDeLevenement().getEndroit().enleverGens(this.gens.getPerso(i));
        }
        for (int i = 0; i < this.gensPresent.size(); i++) {
            this.getEndroitDeLevenement().getEndroit().ajouterGens(this.gensPresent.getPerso(i));
        }
        //this.getEndroitDeLevenement().getEndroit().supprimeTous();
    }
    
    @Override
    public boolean estActiver(PokemonJeu jeu) {
        if (this.getEndroitDeLevenement() != null) {
            if(this.getEndroitDeLevenement().getPositionX() == -1 && this.getEndroitDeLevenement().getPositionY() == -1) {
                if(!this.getEndroitDeLevenement().getEndroit().equals(jeu.getPerso().getPosition().getEndroit())) {
                    return false;
                }
            } else if(this.getEndroitDeLevenement().getPositionX() == -1) {
                if(!(this.getEndroitDeLevenement().getEndroit().equals(jeu.getPerso().getPosition().getEndroit()) && 
                        this.getEndroitDeLevenement().getPositionY() == jeu.getPerso().getPosition().getPositionY())) {
                    return false;
                }
            } else if(this.getEndroitDeLevenement().getPositionY() == -1) {
                if(!(this.getEndroitDeLevenement().getEndroit().equals(jeu.getPerso().getPosition().getEndroit()) && 
                        this.getEndroitDeLevenement().getPositionX() == jeu.getPerso().getPosition().getPositionX())) {
                    return false;
                }
            } else {
                if(!this.getEndroitDeLevenement().equals(jeu.getPerso().getPosition())) {
                    return false;
                }
            }
            if (this.getObjetAavoir() != null) {
                if (!jeu.getPerso().getSac().contains(this.getObjetAavoir())) {
                    if (!(this.getObjetAavoir() instanceof Badge) || !jeu.getPerso().getBadges().possedeBadge((Badge)this.getObjetAavoir())) {
                        return false;
                    }
                }
            }
            if (this.getTailleEquipe() != -1) {
                if (jeu.getPerso().getEquipe().getNbPokemon() < this.getTailleEquipe()) {
                    return false;
                }
            }
            this.gensPresent = new ListeDeGens<>(this.getEndroitDeLevenement().getEndroit().getGens());
            this.getEndroitDeLevenement().getEndroit().supprimeTous();
            for (int i = 0; i < this.gens.size(); i++) {
                this.positionsGens.add(this.gens.getPerso(i).getPosition());
                if (this.positionsEvenement.get(i) != null) {
                    this.gens.getPerso(i).setPosition(this.positionsEvenement.get(i));
                }
                this.getEndroitDeLevenement().getEndroit().ajouterGens(this.gens.getPerso(i));
            }
            return true;
        }
        if (this.getPersonneAquiParler() != null) {
            if (this.getObjetAavoir() != null) {
                if (!jeu.getPerso().getSac().contains(this.getObjetAavoir())) {
                    return false;
                }
            }
            this.gensPresent = new ListeDeGens<>(this.getEndroitDeLevenement().getEndroit().getGens());
            this.getEndroitDeLevenement().getEndroit().supprimeTous();
            for (int i = 0; i < this.gens.size(); i++) {
                this.getEndroitDeLevenement().getEndroit().ajouterGens(this.gens.getPerso(i));
            }
            return true;
        }
        return false;
    }

    @Override
    public void activeEvenement(PokemonJeu jeu) {
        for (int i = 0; i < this.gens.size(); i++) {
            if (this.positionsEvenement.get(i) != null) {
                jeu.refreshAtPosition(this.positionsEvenement.get(i));
            }
        }
        int jetonPerso;
        Parole p;
        for (int i = 1; i <= this.longueurDialogue; i++) {
            jetonPerso = 0;
            p = null;
            while(p == null && jetonPerso < this.gens.size()) {
                p = this.gens.getPerso(jetonPerso).Parler(this, i);
                jetonPerso++;
            }
            jeu.setParole(p.toString());
        }
        this.enleverGens();
        for (int i = 0; i < this.gens.size(); i++) {
            if (this.positionsEvenement.get(i) != null) {
                jeu.refreshAtPosition(this.positionsEvenement.get(i));
            }
        }
    }

    @Override
    public void activeEvenement(Jeu jeu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

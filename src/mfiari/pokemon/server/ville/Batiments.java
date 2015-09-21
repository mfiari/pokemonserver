/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import java.util.ArrayList;
import mfiari.lib.game.interfaces.ville.IBatiment;
import mfiari.lib.game.interfaces.ville.ISalle;
import mfiari.lib.game.objet.ObjetEndroit;
import mfiari.lib.game.objet.ObjetEndroitPassage;
import mfiari.lib.game.personnage.Personnage;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.core.objet.Type_objet;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.lib.game.position.Position;

/**
 *
 * @author mike
 */
abstract public class Batiments extends Quartier implements IBatiment {
    
    private static final long serialVersionUID = 354054054057L;

    private int etage;
    private int etageMin;
    private int etageMax;
    private ArrayList<ArrayList<Salle>> salles;
    private int[] largeurs;
    private int[] longueur;
    private Orientation orientation;
    private Quartier endroitBatiment;

    public Batiments() {
    }

    public Batiments(String nom, int positionX, int positionY, int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {

        super(nom, positionX, positionY, longueur, largeur, Terrains.terrainNormal);

        this.salles = new ArrayList();
        for (int i = 0; i < etageMax - (etageMin - 1); i++) {
            this.salles.add(new ArrayList());
        }
        this.largeurs = new int[etageMax - etageMin + 1];
        this.longueur = new int[etageMax - etageMin + 1];
        this.largeurs[0] = largeur;
        this.longueur[0] = longueur;
        this.etage = 0;
        this.etageMin = etageMin;
        this.etageMax = etageMax;
        this.orientation = orientation;
        this.endroitBatiment = endroitBatiment;
        this.ajouterAuQuartier();
    }
    
    @Override
    public int getNbEtage () {
        return this.etageMax - this.etageMin + 1;
    }
    
    @Override
    public int getEtageMin () {
        return this.etageMin;
    }
    
    @Override
    public int getEtageMax () {
        return this.etageMax;
    }
    
    @Override
    public int getNbSalleParEtage (int etage) {
        return this.salles.get(etage - this.etageMin).size();
    }
    
    private void ajouterAuQuartier () {
        this.endroitBatiment.ajouterBatiment(this);
    }

    @Override
    public void ajouterSalle(ISalle s1, int etage) {
        Salle s = (Salle) s1;
        if (etage < this.salles.size()) {
            if (etage == 0 && this.salles.get(0).isEmpty()) {
                Position p = new Position (this.getPosition());
                p.setEndroit(this.endroitBatiment);
                switch (this.orientation) {
                    case face : 
                        p.reculer();
                        s.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, (s.getLargeur() -1 ), (s.getLongueur() / 2), new Position (p)));
                        break;
                    case dos : 
                        p.avancer();
                        s.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 0, (s.getLongueur() / 2), new Position (p)));
                        break;
                    case droite : 
                        p.droite();
                        s.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, (s.getLargeur() /2 ), (s.getLongueur() -1), new Position (p)));
                        break;
                    case gauche : 
                        p.gauche();
                        s.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, (s.getLargeur() /2 ), 0, new Position (p)));
                        break;
                }
            }
            this.salles.get(etage).add(s);
        }
    }
    
    @Override
    public Salle getSalle (int i, int etage) {
        return this.salles.get(etage - this.etageMin).get(i);
    }

    @Override
    public void setNbSalle(int etage, int longueur, int largeur) {
        this.largeurs[etage] = largeur;
        this.longueur[etage] = longueur;
    }

    @Override
    public void entrer(Dresseur equipe) {
        Salle salle = this.salles.get(0).get(0);
        ObjetEndroit objet_endroit = salle.getObjetEndroit(0);
        Position p = new Position(objet_endroit.getPosition().getPositionX(), objet_endroit.getPosition().getPositionY(), salle);
        if (objet_endroit.getPosition().getPositionX() == 0) {
            p.reculer();
        } else if (objet_endroit.getPosition().getPositionY() == 0) {
            p.droite();
        } else if (objet_endroit.getPosition().getPositionX() == salle.getLargeur() -1) {
            p.avancer();
        } else {
            p.gauche();
        }
        equipe.setPosition(p);
    }

    @Override
    public void entrer(Personnage equipe) {
        this.entrer((Dresseur)equipe);
    }

    @Override
    public void sortir() {
    }

    @Override
    public void monter() {
        if (this.etage < this.etageMax) {
            this.etage++;
            this.sortir();
            //this.entrer();
        }
    }

    @Override
    public void descendre() {
        if (this.etage > this.etageMin) {
            this.etage--;
            this.sortir();
            //this.entrer();
        }
    }
}

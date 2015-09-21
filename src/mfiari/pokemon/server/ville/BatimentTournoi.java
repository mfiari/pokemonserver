/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.ville.Sol;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.server.objet.ObjetEndroitTournoi;
import mfiari.pokemon.core.objet.Type_objet;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.core.tournoi.NiveauTournoi;
import mfiari.pokemon.server.type.TypeTournoi;

/**
 *
 * @author etudiant
 */
public class BatimentTournoi extends Batiments {
    
    private static final long serialVersionUID = 1L;
    
    private ObjetEndroitTournoi objetEndroitTournoi;
    
    public BatimentTournoi (String nom, int positionX, int positionY,int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment, TypeTournoi typeTournoi, NiveauTournoi niveau) {
        super(nom, positionX, positionY, longueur, largeur, etageMin, etageMax, orientation, endroitBatiment);
        this.objetEndroitTournoi = new ObjetEndroitTournoi(Type_objet.vendeur_shop, 0, 0, typeTournoi, niveau);
        Salle basTournoi = new Salle("rez de chausse tournoi", 0, 0, 10, 7, this, 0);
        basTournoi.ajouterObjetEndroit(this.objetEndroitTournoi);
        basTournoi.setSol(Sol.carrelage);
    }
    
    public BatimentTournoi (String nom, int positionX, int positionY,int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment, TypeTournoi typeTournoi, NiveauTournoi niveauMin, NiveauTournoi niveauMax) {
        super(nom, positionX, positionY, longueur, largeur, etageMin, etageMax, orientation, endroitBatiment);
        this.objetEndroitTournoi = new ObjetEndroitTournoi(Type_objet.vendeur_shop, 0, 0, typeTournoi, niveauMin, niveauMax);
        Salle basTournoi = new Salle("rez de chausse tournoi", 0, 0, 10, 7, this, 0);
        basTournoi.ajouterObjetEndroit(this.objetEndroitTournoi);
        basTournoi.setSol(Sol.carrelage);
    }
    
    public void ajouterParticipant (Dresseur participant) {
        this.objetEndroitTournoi.ajouterParticipant(participant);
    }
    
    /*@Override
    public void entrer(Dresseur equipe) {
        if (this.tournoi == null) {
            this.vosDresseurs.ajouterDresseur(equipe);
            ListeDeDresseur participantsTournois = new ListeDeDresseur();
            participantsTournois.ajouterDresseur(equipe);
            while (participantsTournois.size() < this.typeTournoi.getNbParticiapntByTournoiAndNiveau(this.niveau)) {
                int alea = (int) (Math.random() * this.participants.size() - 1);
                participantsTournois.ajouterDresseur(this.participants.removeDresseur(alea));

            }
            this.tournoi = new Tournoi (participantsTournois, this.vosDresseurs, Terrains.getTerrain(this.typeTournoi));
            Vues.createVue(this.tournoi);
            this.tournoi.commencerTournoi();
        } else {
            this.tournoi.continuer();
        }
    }*/
    
}

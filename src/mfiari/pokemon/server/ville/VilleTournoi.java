/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.core.tournoi.NiveauTournoi;
import mfiari.pokemon.server.tournoi.Tournoi;
import mfiari.pokemon.server.type.TypeTournoi;

/**
 *
 * @author etudiant
 */
public class VilleTournoi extends Ville {
    
    private Tournoi tournoi;
    private ListeDeDresseur participants;
    private ListeDeDresseur vosDresseurs;
    private TypeTournoi typeTournoi;
    private NiveauTournoi niveau;
    
    public VilleTournoi (String nom, int positionX, int positionY,int longueur, int largeur, TypeTournoi typeTournoi, NiveauTournoi niveau) {
        super(nom, positionX, positionY, longueur, largeur);
        this.participants = new ListeDeDresseur();
        this.vosDresseurs = new ListeDeDresseur();
        this.tournoi = null;
        this.typeTournoi = typeTournoi;
        this.niveau = niveau;
    }
    
    public void ajouterParticipant (Dresseur participant) {
        this.participants.ajouterDresseur(participant);
    }
    
    @Override
    public void entrer(Dresseur equipe) {
        if (this.tournoi == null) {
            this.vosDresseurs.ajouterDresseur(equipe);
            ListeDeDresseur participantsTournois = new ListeDeDresseur();
            participantsTournois.ajouterDresseur(equipe);
            while (participantsTournois.size() < this.typeTournoi.getNbParticiapntByTournoiAndNiveau(this.niveau)) {
                int alea = (int) (Math.random() * this.participants.size() - 1);
                participantsTournois.ajouterDresseur(this.participants.removeDresseur(alea));

            }
            this.tournoi = new Tournoi (this.participants, this.vosDresseurs, Terrains.getTerrain(this.typeTournoi));
            this.tournoi.commencerTournoi();
        } else {
            this.tournoi.continuer();
        }
    }
}

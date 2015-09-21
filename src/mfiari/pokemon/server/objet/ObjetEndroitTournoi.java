/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import mfiari.pokemon.core.objet.Type_objet;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import mfiari.lib.game.objet.ObjetEndroit;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.core.tournoi.NiveauTournoi;
import mfiari.pokemon.server.tournoi.Tournoi;
import mfiari.pokemon.server.type.TypeTournoi;
import mfiari.pokemon.server.ville.Terrains;

/**
 *
 * @author mike
 */
public class ObjetEndroitTournoi extends ObjetEndroit {
    
    private static final long serialVersionUID = 354054054062L;
    
    protected int choix;
    protected PropertyChangeSupport pcsDeroulement = new PropertyChangeSupport(this);
    private Tournoi tournoi;
    private ListeDeDresseur participants;
    private ListeDeDresseur vosDresseurs;
    private TypeTournoi typeTournoi;
    private NiveauTournoi niveauMin;
    private NiveauTournoi niveauMax;
    private NiveauTournoi niveau;
    private Dresseur perso;
    private Pokemon pkImcomp;
    
    public ObjetEndroitTournoi (Type_objet nom, int positionX, int positionY, TypeTournoi typeTournoi, NiveauTournoi niveau) {
        super(nom, positionX, positionY);
        this.participants = new ListeDeDresseur();
        this.vosDresseurs = new ListeDeDresseur();
        this.typeTournoi = typeTournoi;
        this.niveau = niveau;
    }
    
    public ObjetEndroitTournoi (Type_objet nom, int positionX, int positionY, TypeTournoi typeTournoi, NiveauTournoi niveauMin, NiveauTournoi niveauMax) {
        super(nom, positionX, positionY);
        this.participants = new ListeDeDresseur();
        this.vosDresseurs = new ListeDeDresseur();
        this.typeTournoi = typeTournoi;
        this.niveauMin = niveauMin;
        this.niveauMax = niveauMax;
        this.niveau = null;
    }

    public void setChoix(int choix) {
        this.choix = choix;
    }
    
    public void ajouterPerso (Dresseur perso) {
        this.perso = perso;
    }
    
    public void ajouterParticipant (Dresseur participant) {
        this.participants.ajouterDresseur(participant);
    }

    public Tournoi getTournoi() {
        return this.tournoi;
    }

    public NiveauTournoi getNiveauMin() {
        return this.niveauMin;
    }

    public NiveauTournoi getNiveauMax() {
        return this.niveauMax;
    }

    public NiveauTournoi getNiveau() {
        return this.niveau;
    }

    public TypeTournoi getTypeTournoi() {
        return this.typeTournoi;
    }

    public Pokemon getPkImcomp() {
        return this.pkImcomp;
    }
    
    public void menu () {
        this.pcsDeroulement.firePropertyChange("debut", null, null);
        do {
            this.pcsDeroulement.firePropertyChange("menu", null, null);
            switch (this.choix) {
                case 1:
                    int participe = verifPokemonsCompatible();
                    if (participe == -1) {
                        this.pcsDeroulement.firePropertyChange("pokemonInsufisant", null, null);
                    } else if (participe > 0) {
                        this.pkImcomp = this.perso.getEquipe().getPokemon(participe -1);
                        this.pcsDeroulement.firePropertyChange("pokemonIncompatible", null, null);
                    } else if (participe == 0) {
                        while (this.niveau == null && this.choix != -1) {
                            this.pcsDeroulement.firePropertyChange("choixNiveauTournoi", null, null);
                            if (this.choix > 0 && this.choix < NiveauTournoi.values().length) {
                                this.niveau = NiveauTournoi.values()[this.choix-1];
                            }
                        }
                        if (this.choix != -1) {
                            this.entrer();
                        }
                    }
                    break;
                case 2:
                    this.pcsDeroulement.firePropertyChange("regles", null, null);
                    break;
                case 3:
                    this.pcsDeroulement.firePropertyChange("palmares", null, null);
                    break;
            }
        } while (this.choix != 0);
        this.supprimerTousEcouteur();
    }
    
    private int verifPokemonsCompatible() {
        EquipePokemon equipe = this.perso.getEquipe();
        if (equipe.getNbPokemon() >= 3) {
            for (int i = 0 ; i < equipe.getNbPokemon() ; i++) {
                if (!this.typeTournoi.acceptePokemon(equipe.getPokemon(i))) {
                    return i+1;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
    
    public void entrer() {
        if (this.tournoi == null) {
            this.vosDresseurs.ajouterDresseur(this.perso);
            ListeDeDresseur participantsTournois = new ListeDeDresseur();
            participantsTournois.ajouterDresseur(this.perso);
            while (participantsTournois.size() < this.typeTournoi.getNbParticiapntByTournoiAndNiveau(this.niveau)) {
                int alea = (int) (Math.random() * this.participants.size() - 1);
                participantsTournois.ajouterDresseur(this.participants.removeDresseur(alea));

            }
            for (int i = 0 ; i < participantsTournois.size() ; i++) {
                for (int j = 0 ; j < participantsTournois.getDresseur(i).getEquipe().getNbPokemon() ; j++) {
                    participantsTournois.getDresseur(i).getEquipe().getPokemon(j).changeNiveau(this.niveau.getNiveauPokemon());
                }
            }
            this.tournoi = new Tournoi (participantsTournois, this.vosDresseurs, Terrains.getTerrain(this.typeTournoi));
            this.tournoi.commencerTournoi();
        } else {
            this.tournoi.continuer();
        }
    }
    
    public void supprimerTousEcouteur() {
        PropertyChangeListener[] ecouteurs = this.pcsDeroulement.getPropertyChangeListeners();
        for (int i = 0 ; i < ecouteurs.length ; i++) {
            this.pcsDeroulement.removePropertyChangeListener(ecouteurs[i]);
        }
    }

    public void ajouterEcouteur(PropertyChangeListener ecouteur) {
        this.pcsDeroulement.addPropertyChangeListener(ecouteur);
    }
    
}

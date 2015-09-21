/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import java.util.ArrayList;
import mfiari.lib.game.jeu.Jeu;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.lib.game.position.Position;

/**
 *
 * @author mike
 */
public class EvenementQuete extends Evenement {
    
     private ArrayList<Evenement> quetes;
     private ArrayList<Evenement> quetesAnnexe;
     private int compteur;
     private boolean sortir;

     public EvenementQuete (boolean sortir, Position endroitDeLevenement, Gens personneAquiParler, Objet objet,
             String titre) {
         super(endroitDeLevenement, personneAquiParler, objet, titre, 0);
         this.quetes= new ArrayList<> ();
         this.quetesAnnexe = new ArrayList<> ();
         this.compteur=0;
         this.sortir=sortir;
     }

     public void ajouterQuete (Evenement e) {
         for (int i=0 ; i< this.endroitNonAccessible.size() ; i++) {
             //e.ajouterEndroitNonAccessible(this.endroitNonAccessible.get(i));
         }
         this.quetes.add(e);
     }

     public void ajouterQueteAnnexe (Evenement e) {
         this.quetesAnnexe.add(e);
     }

     public boolean peutSortir () {
         return this.sortir;
     }

     public Evenement getEvenement () {
         return this.quetes.get(this.compteur);
     }

     public Evenement getEvenement (int i) {
         if (i < this.quetes.size()) {
            return this.quetes.get(i);
         }
         return null;
     }
     
     public boolean aQueteAnexe () {
         return !this.quetesAnnexe.isEmpty();
     }
     
     public boolean aQueteAnexeActive (PokemonJeu jeu) {
         if (this.quetesAnnexe.isEmpty()) {
             return false;
         }
         for (int i = 0 ; i < this.quetesAnnexe.size() ; i++) {
             if (this.quetesAnnexe.get(i).estActiver(jeu) && !this.quetesAnnexe.get(i).estFini()) {
                 return true;
             }
         }
         return false;
     }

     public Evenement getQueteAnnexe() {
         return this.quetesAnnexe.get(0);
     }

     public Evenement getQueteAnnexeActive(PokemonJeu jeu) {
         for (int i = 0 ; i < this.quetesAnnexe.size() ; i++) {
             if (this.quetesAnnexe.get(i).estActiver(jeu) && !this.quetesAnnexe.get(i).estFini()) {
                 return this.quetesAnnexe.get(i);
             }
         }
         return null;
     }

     public void evenementSuivant () {
         this.compteur++;
         if (this.compteur == this.quetes.size()) {
             this.FinirEvenement();
         }
     }

     public int getCompteur () {
         return this.compteur;
     }

    @Override
    public void activeEvenement(PokemonJeu jeu) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void activeEvenement(Jeu jeu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

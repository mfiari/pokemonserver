/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.demarrage;

import mfiari.pokemon.server.evenement.EvenementQuete;
import mfiari.pokemon.server.evenement.Evenements;
import mfiari.pokemon.server.texte.Texte;

/**
 *
 * @author mike
 */
public class CreationEvenement {
    
    private final String nomPersoPrincipal;
    
    public CreationEvenement() {
        this.nomPersoPrincipal = Texte.nomPersoPrincipalDefaut;
    }

    public CreationEvenement(Demarrage demarrage) {
        this.nomPersoPrincipal = demarrage.getNomPersoPrincipal();
    }

    public EvenementQuete getEvenement() {
        return Evenements.jeu;
    }
    
}

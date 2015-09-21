/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.interfaces;

import mfiari.pokemon.server.perso.Dresseur;

/**
 *
 * @author etudiant
 */
public interface Vendeur extends mfiari.lib.game.interfaces.Vendeur {
    
    
    public void ajouterDresseur(Dresseur dresseur);
    
    public Dresseur getDresseur();
    
}

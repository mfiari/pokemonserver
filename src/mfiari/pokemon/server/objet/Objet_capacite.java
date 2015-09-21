/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import mfiari.lib.game.objet.Objet;
import mfiari.pokemon.server.capacite.Capacite;

/**
 *
 * @author mike
 */
public class Objet_capacite extends Objet {
    
    private String nom;
    private Capacite capacite;
    
    public Objet_capacite() {
        this.nom = null;
        this.capacite = null;
    }
    
    public Objet_capacite(String nom, Capacite capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }
    
    @Override
    public String getNom() {
        return this.nom;
    }
    
    public Capacite getCapacite () {
        return this.capacite;
    }
    
}

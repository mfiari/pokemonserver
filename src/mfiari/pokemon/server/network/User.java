/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.network;

import java.io.Serializable;
import mfiari.pokemon.server.perso.Dresseur;

/**
 *
 * @author mike
 */
public class User extends mfiari.lib.game.reseau.User implements Serializable {
    
    private Dresseur dresseur;
    
    public User (int id) {
        super(id);
    }

    public Dresseur getDresseur() {
        return dresseur;
    }

    public void setDresseur(Dresseur dresseur) {
        this.dresseur = dresseur;
    }
    
}

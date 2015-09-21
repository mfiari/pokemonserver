/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.liste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.ville.Endroit;

/**
 *
 * @author mike
 */
public class ListeDeDresseur implements Serializable {
    
    private static final long serialVersionUID = 354054054063L;
    
    private final ArrayList<Dresseur> list;
    
    public ListeDeDresseur () {
        this.list = new ArrayList<>();
    }
    
    public ListeDeDresseur (Dresseur... dresseurs) {
        this.list = new ArrayList<>();
        this.list.addAll(Arrays.asList(dresseurs));
    }
    
    public void ajouterDresseur(Dresseur dresseur) {
        this.list.add(dresseur);
    }
    
    public Dresseur getDresseur (int i) {
        if (i >=0 && i < this.list.size()) {
            return this.list.get(i);
        }
        return null;
    }
    
    public Dresseur getDresseur (String nom) {
        for (Dresseur dress : this.list) {
            if (dress.getNom().equals(nom)) {
                return dress;
            }
        }
        return null;
    }
    
    public Dresseur getDresseur (String nom, Endroit e) {
        for (Dresseur dress : this.list) {
            if (dress.getNom().equals(nom) && dress.getPosition().getEndroit().equals(e)) {
                return dress;
            }
        }
        return null;
    }
    
    public Dresseur removeDresseur (int i) {
        if (i >=0 && i < this.list.size()) {
            return this.list.remove(i);
        }
        return null;
    }
    
    public int size() {
        return this.list.size();
    }
    
    public boolean isEmpty () {
        return this.list.isEmpty();
    }
    
    public boolean contains (Dresseur dresseur) {
        return this.list.contains(dresseur);
    }
    
}

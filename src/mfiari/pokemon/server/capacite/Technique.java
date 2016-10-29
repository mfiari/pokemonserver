/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.capacite;

import java.io.Serializable;
import mfiari.pokemon.core.capacite.Capacite;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author etudiant
 */
public class Technique implements Serializable {
    private String nom;
    private Type type;
    private int niv;
    private int nbUtilise;
    private Capacite cap;
    
    public Technique () {
        
    }
    
    public Technique (String nom, Type type) {
        this.nom=nom;
        this.type=type;
        this.niv = 1;
        this.nbUtilise = 0;
        this.cap = null;
    }
    
    public Technique (String nom, Type type, Capacite cap) {
        this.nom=nom;
        this.type=type;
        this.niv = 1;
        this.nbUtilise = 0;
        this.cap = cap;
    }

    public Technique (Technique tec) {
        this.nom=tec.nom;
        this.type=tec.type;
        this.niv = tec.niv;
        this.nbUtilise = tec.nbUtilise;
        this.cap = tec.cap;
    }

    public int getNbUtilise() {
        return nbUtilise;
    }

    public void setNbUtilise(int nbUtilise) {
        this.nbUtilise = nbUtilise;
    }

    public int getNiv() {
        return niv;
    }

    public void setNiv(int niv) {
        this.niv = niv;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    public Capacite getCapacite () {
        return this.cap;
    }
    
    @Override
    public String toString () {
        return this.nom;
    }
}

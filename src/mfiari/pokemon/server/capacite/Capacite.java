/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.capacite;

import mfiari.pokemon.core.capacite.PokemonVise;
import java.io.Serializable;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public abstract class Capacite implements Serializable {
    private String nom;
    private Type type;
    private int force;
    private int prec;
    private int pp;
    private int ppi;
    private Attribut classe;
    private int niv;
    private int nbUtilise;
    private PokemonVise pokemonVise;
    private int priorite;
    
    public Capacite () {
        
    }
    
    public Capacite (String nom, Type type, int force, int prec, int pp, Attribut classe) {
        this.nom=nom;
        this.type=type;
        this.force=force;
        this.prec=prec;
        this.pp=pp;
        this.ppi = pp;
        this.classe=classe;
        this.niv = 1;
        this.nbUtilise = 0;
        this.priorite = 0;
        this.pokemonVise = PokemonVise.adversaire;
    }

    public Capacite (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise) {
        this.nom=nom;
        this.type=type;
        this.force=force;
        this.prec=prec;
        this.pp=pp;
        this.ppi = pp;
        this.classe=classe;
        this.niv = 1;
        this.nbUtilise = 0;
        this.priorite = 0;
        this.pokemonVise = pokemonVise;
    }

    public Capacite (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, int priorite) {
        this.nom=nom;
        this.type=type;
        this.force=force;
        this.prec=prec;
        this.pp=pp;
        this.ppi = pp;
        this.classe=classe;
        this.niv = 1;
        this.nbUtilise = 0;
        this.priorite = priorite;
        this.pokemonVise = pokemonVise;
    }

    public Capacite (Capacite c) {
        this.nom=c.nom;
        this.type=c.type;
        this.force=c.force;
        this.prec=c.prec;
        this.pp=c.pp;
        this.ppi=c.ppi;
        this.classe=c.classe;
        this.niv = c.niv;
        this.nbUtilise = c.nbUtilise;
        this.priorite = c.priorite;
        this.pokemonVise = c.pokemonVise;
    }

    public Attribut getClasse() {
        return classe;
    }

    public void setClasse(Attribut classe) {
        this.classe = classe;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
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

    public int getPp() {
        return pp;
    }
    
    public int getPpi() {
        return ppi;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPrec() {
        return prec;
    }

    public void setPrec(int prec) {
        this.prec = prec;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPriorite() {
        return priorite;
    }

    public void setPriorite(int priorite) {
        this.priorite = priorite;
    }
    
    @Override
    public String toString () {
        return this.nom;
    }
    
    public PokemonVise getPokemonVise () {
        return this.pokemonVise;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Capacite other = (Capacite) obj;
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (this.nom != null ? this.nom.hashCode() : 0);
        hash = 53 * hash + (this.type != null ? this.type.hashCode() : 0);
        return hash;
    }
    
    public static Capacite getInstance(Capacite cap) {
        if (cap instanceof CapaciteContreCoup) {
            return new CapaciteContreCoup((CapaciteContreCoup)cap);
        } else if (cap instanceof CapaciteEtat) {
            return new CapaciteEtat((CapaciteEtat)cap);
        } else if (cap instanceof CapaciteFixe) {
            return new CapaciteFixe((CapaciteFixe)cap);
        } else if (cap instanceof CapaciteMort) {
            return new CapaciteMort((CapaciteMort)cap);
        } else if (cap instanceof CapaciteMultiple) {
            return new CapaciteMultiple((CapaciteMultiple)cap);
        } else if (cap instanceof CapaciteSimple) {
            return new CapaciteSimple((CapaciteSimple)cap);
        } else if (cap instanceof CapaciteSoin) {
            return new CapaciteSoin((CapaciteSoin)cap);
        } else if (cap instanceof CapaciteStat) {
            return new CapaciteStat((CapaciteStat)cap);
        }
        return null;
    }
    
}

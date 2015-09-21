/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.capacite;

import mfiari.pokemon.core.capacite.Attributs;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author mike
 */
public class AttributsExp implements Serializable {
    
    private Map<Attributs, Integer> attribut_niv;
    private Map<Attributs, Integer> attribut_exp;
    private int tableauExpParNiveau[];
    
    public AttributsExp () {
        this.attribut_niv = new EnumMap<>(Attributs.class);
        for (int i = 0; i<Attributs.values().length ; i++) {
            this.attribut_niv.put(Attributs.values()[i], 1);
        }
        this.attribut_exp = new EnumMap<>(Attributs.class);
        for (int i = 0; i<Attributs.values().length ; i++) {
            this.attribut_exp.put(Attributs.values()[i], 0);
        }
        this.tableauExpParNiveau = new int[5];
        this.tableauExpParNiveau[0] = 100;
        this.tableauExpParNiveau[1] = 300;
        this.tableauExpParNiveau[2] = 500;
        this.tableauExpParNiveau[3] = 1000;
        this.tableauExpParNiveau[4] = 3000;
    }
    
    public AttributsExp (AttributsExp attributsExp) {
        this.attribut_niv = new EnumMap<>(Attributs.class);
        for (int i = 0; i<Attributs.values().length ; i++) {
            this.attribut_niv.put(Attributs.values()[i], attributsExp.attribut_niv.get(Attributs.values()[i]));
        }
        this.attribut_exp = new EnumMap<>(Attributs.class);
        for (int i = 0; i<Attributs.values().length ; i++) {
            this.attribut_exp.put(Attributs.values()[i], attributsExp.attribut_exp.get(Attributs.values()[i]));
        }
        this.tableauExpParNiveau = new int[5];
        this.tableauExpParNiveau[0] = 100;
        this.tableauExpParNiveau[1] = 300;
        this.tableauExpParNiveau[2] = 500;
        this.tableauExpParNiveau[3] = 1000;
        this.tableauExpParNiveau[4] = 3000;
    }
    
    public void utiliseCap (Capacite cap) {
        Integer exp;
        switch (cap.getClasse()) {
            case physique :
                exp = this.attribut_exp.get(Attributs.att);
                exp += 1;
                this.attribut_exp.put(Attributs.att, exp);
                this.verifieAttributMonteDeNiveau(Attributs.att);
                break;
            case spéciale :
                exp = this.attribut_exp.get(Attributs.attSpe);
                exp += 1;
                this.attribut_exp.put(Attributs.attSpe, exp);
                this.verifieAttributMonteDeNiveau(Attributs.attSpe);
                break;
        }
        if (cap instanceof CapaciteContreCoup) {
            CapaciteContreCoup capaciteContreCoup = (CapaciteContreCoup) cap;
        } else if (cap instanceof CapaciteEtat) {
            CapaciteEtat capaciteEtat = (CapaciteEtat) cap;
        } else if (cap instanceof CapaciteFixe) {
            CapaciteFixe capaciteFixe = (CapaciteFixe) cap;
        } else if (cap instanceof CapaciteMort) {
            CapaciteMort capaciteMort = (CapaciteMort) cap;
        } else if (cap instanceof CapaciteMultiple) {
            CapaciteMultiple capaciteMultiple = (CapaciteMultiple) cap;
        } else if (cap instanceof CapaciteSimple) {
        } else if (cap instanceof CapaciteSoin) {
        } else if (cap instanceof CapaciteStat) {
            CapaciteStat capaciteStat = (CapaciteStat) cap;
            int nb = capaciteStat.lenght();
            if (capaciteStat.getPourcentageReussi() == 100) {
                Attributs att;
                for (int i = 0 ; i<nb ; i++) {
                    if (capaciteStat.aAttribut(i)) {
                        if (capaciteStat.getAugmente(i)) {
                            if (capaciteStat.getSurSoi(i)) {
                                att = capaciteStat.getAttribut(i);
                                exp = this.attribut_exp.get(att);
                                exp += 1;
                                this.attribut_exp.put(att, exp);
                                this.verifieAttributMonteDeNiveau(att);
                            }
                        } else {
                            if (capaciteStat.getSurSoi(i)) {
                                att = capaciteStat.getAttribut(i);
                                exp = this.attribut_exp.get(att);
                                if (exp != 0) {
                                    exp -= 1;
                                    this.attribut_exp.put(att, exp);
                                } else {
                                    Integer niv = this.attribut_niv.get(att);
                                    if (niv != 1) {
                                        niv -= 1;
                                        this.attribut_niv.put(att, niv);
                                        this.attribut_exp.put(att, this.tableauExpParNiveau[niv -1] -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void recoitCap (Capacite cap) {
        Integer exp;
        switch (cap.getClasse()) {
            case physique :
                exp = this.attribut_exp.get(Attributs.def);
                exp += 1;
                this.attribut_exp.put(Attributs.def, exp);
                this.verifieAttributMonteDeNiveau(Attributs.def);
                break;
            case spéciale :
                exp = this.attribut_exp.get(Attributs.defSpe);
                exp += 1;
                this.attribut_exp.put(Attributs.defSpe, exp);
                this.verifieAttributMonteDeNiveau(Attributs.defSpe);
                break;
        }
    }
    
    private void verifieAttributMonteDeNiveau (Attributs at) {
        if (this.attribut_niv.get(at) < this.tableauExpParNiveau.length) {
            if (this.tableauExpParNiveau[this.attribut_niv.get(at) -1] == this.attribut_exp.get(at)) {
                Integer niv = this.attribut_niv.get(at);
                niv += 1;
                this.attribut_niv.put(at, niv);
                this.attribut_exp.put(at, 0);
            }
        }
    }
    
    public void setNiveauByAttribut (int niv, Attributs at) {
        this.attribut_niv.put(at, niv);
    }
    
    public void setExpByAttribut (int exp, Attributs at) {
        this.attribut_exp.put(at, exp);
    }
    
    public void setAllNiveau (int niv) {
        for (int i = 0; i<Attributs.values().length ; i++) {
            this.attribut_niv.put(Attributs.values()[i], niv);
        }
    }
    
    public Attributs getAttribut (int i) {
        return Attributs.values()[i];
    }
    
    public int getExpAttribut (Attributs attribut) {
        return this.attribut_exp.get(attribut);
    }
    
    public int getNivAttribut (Attributs attribut) {
        return this.attribut_niv.get(attribut);
    }
    
    public int size () {
        return this.attribut_exp.size();
    }
    
}

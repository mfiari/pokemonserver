/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.stat;

import mfiari.pokemon.core.stat.IndividualValue;
import mfiari.pokemon.core.stat.EffortValue;
import mfiari.pokemon.core.capacite.Attributs;
import mfiari.pokemon.core.capacite.AttributsExp;
import mfiari.pokemon.core.perso.Nature;

/**
 *
 * @author mike
 */
public class Stat {
    
    private int niveau;
    
    private double pv;
    private double att;
    private double def;
    private double attSpe;
    private double defSpe;
    private double vit;
    private double esq;
    private double prec;
    private int amour;
    private int exp;
    private final double pvBase;
    private final double attBase;
    private final double defBase;
    private final double attSpeBase;
    private final double defSpeBase;
    private final double vitBase;
    private final double esqBase;
    private final double precBase;
    
    private final AttributsExp attributsExp;
    private final IndividualValue individualValue;
    private final EffortValue effortValue;
    private Nature nature;
    
    public Stat (int pvBase, int attBase, int defBase, int attSpeBase, int defSpeBase, int vitBase, int esqBase, int precBase) {
        this.pvBase = pvBase;
        this.attBase = attBase;
        this.defBase = defBase;
        this.attSpeBase = attSpeBase;
        this.defSpeBase = defSpeBase;
        this.vitBase = vitBase;
        this.esqBase = esqBase;
        this.precBase = precBase;
        this.individualValue = new IndividualValue();
        this.effortValue = new EffortValue();
        this.attributsExp = new AttributsExp();
    }

    public double getPvMax() {
        return Math.ceil((this.individualValue.getPv() + 2 * this.pvBase + Math.ceil((float)this.effortValue.getPv()/4)) * ((float)this.niveau/100) + 10 + this.niveau);
    }
    
    public int getAmour() {
        return amour;
    }

    public void setAmour(int amour) {
        if (amour < 0) {
            amour = 0;
        }
        if (amour > 1000) {
            amour = 1000;
        }
        if (this.amour == 0) {
            this.alterStat(-20);
        } else if (this.amour > 0 && this.amour < 50) {
            this.alterStat(-10);
        } else if (this.amour >= 50 && this.amour < 100) {
            this.alterStat(-5);
        } else if (this.amour >= 100 && this.amour < 150) {
            this.alterStat(0);
        } else if (this.amour >= 150 && this.amour < 300) {
            this.alterStat(5);
        } else if (this.amour >= 300 && this.amour < 500) {
            this.alterStat(10);
        } else if (this.amour >= 500 && this.amour < 800) {
            this.alterStat(15);
        } else {
            this.alterStat(20);
        }
        this.amour = amour;
    }
    
    private void alterStat (int pourcentage) {
        this.att = this.att + (this.att * (pourcentage / 100));
        this.def = this.def + (this.def * (pourcentage / 100));
        this.attSpe = this.attSpe + (this.attSpe * (pourcentage / 100));
        this.defSpe = this.defSpe + (this.defSpe * (pourcentage / 100));
        this.vit = this.vit + (this.vit * (pourcentage / 100));
        this.esq = this.esq + (this.esq * (pourcentage / 100));
        this.prec = this.prec + (this.prec * (pourcentage / 100));
    }
    
    private double getBonusAttribut (double valeur, Attributs att) {
        double value = Math.ceil(Math.ceil((this.individualValue.get(att) + 2 * valeur + Math.ceil((float)this.effortValue.get(att)/4)) * ((float)this.niveau/100) +5) * 
                (1+((float)this.nature.getBonus(att)/100)-((float)this.nature.getMalus(att)/100)));
        return value * (1 + ((float)(((this.attributsExp.getNivAttribut(att) -1 ) * 5))/100));
    }

    public double getAtt() {
        return this.att;
    }

    public void setAtt(double att) {
        this.att = att;
    }

    public double getAttInitial() {
        return this.getBonusAttribut(this.attBase, Attributs.att);
    }

    public double getAttSpe() {
        return this.attSpe;
    }

    public void setAttSpe(double attSpe) {
        this.attSpe = attSpe;
    }

    public double getAttSpeInitial() {
        return this.getBonusAttribut(this.attSpeBase, Attributs.attSpe);
    }

    public double getDef() {
        return this.def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getDefInitial() {
        return this.getBonusAttribut(this.defBase, Attributs.def);
    }

    public double getDefSpe() {
        return this.defSpe;
    }

    public void setDefSpe(double defSpe) {
        this.defSpe = defSpe;
    }

    public double getDefSpeInitial() {
        return this.getBonusAttribut(this.defSpeBase, Attributs.defSpe);
    }

    public double getEsq() {
        return this.esq;
    }

    public void setEsq(double esq) {
        this.esq = esq;
    }

    public double getEsqInitial() {
        return this.getBonusAttribut(this.esqBase, Attributs.esq);
    }

    public double getPrec() {
        return this.prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public double getPrecInitial() {
        return this.getBonusAttribut(this.precBase, Attributs.prec);
    }

    public double getVit() {
        return this.vit;
    }

    public void setVit(double vit) {
        this.vit = vit;
    }

    public double getVitInitial() {
        return this.getBonusAttribut(this.vitBase, Attributs.vit);
    }
    
}

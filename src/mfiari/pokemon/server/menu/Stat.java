/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.menu;

import java.io.Serializable;
import mfiari.pokemon.core.perso.pokemon.Pokemon;



/**
 *
 * @author mike
 */
public class Stat extends mfiari.lib.game.personnage.Stat implements Serializable {
    
    private static final long serialVersionUID = -7729956010918411261L;
    
    public Stat () {
        
    }
    
    public Stat (Pokemon pokNiv1, Pokemon pokNiv120) {
        this(pokNiv1, pokNiv120, 120, 11, 800000, 5, 100000);
    }
    
    public Stat (Pokemon pokNiv1, Pokemon pokNiv120, int nivMax, int expMin, int expMax, int expDonnerMin, int expDonnerMax) {
        this.stat=new double[nivMax][11];
        this.stat[0][0]=pokNiv1.getNiveau();
        this.stat[0][1]=pokNiv1.getPv();
        this.stat[0][2]=pokNiv1.getAtt();
        this.stat[0][3]=pokNiv1.getDef();
        this.stat[0][4]=pokNiv1.getAttSpe();
        this.stat[0][5]=pokNiv1.getDefSpe();
        this.stat[0][6]=pokNiv1.getVit();
        this.stat[0][7]=pokNiv1.getEsq();
        this.stat[0][8]=pokNiv1.getPrec();
        this.stat[0][9]=pokNiv1.getExpNivSuiv();
        this.stat[0][10]=expDonnerMin;
        int niv = pokNiv1.getNiveau();
        int niveauEcart = pokNiv120.getNiveau() - pokNiv1.getNiveau();
        double pv = (pokNiv120.getPv() - pokNiv1.getPv()) / niveauEcart;
        double att = (pokNiv120.getAtt() - pokNiv1.getAtt()) / niveauEcart;
        double def = (pokNiv120.getDef() - pokNiv1.getDef()) / niveauEcart;
        double attSpe = (pokNiv120.getAttSpe() - pokNiv1.getAttSpe()) / niveauEcart;
        double defSpe = (pokNiv120.getDefSpe() - pokNiv1.getDefSpe()) / niveauEcart;
        double vit = (pokNiv120.getVit() - pokNiv1.getVit()) / niveauEcart;
        double esq = (pokNiv120.getEsq() - pokNiv1.getEsq()) / niveauEcart;
        double prec = (pokNiv120.getPrec() - pokNiv1.getPrec()) / niveauEcart;
        for (int i=niv ; i<nivMax ; i++) {
            this.stat[i][0]= i+1;
            this.stat[i][1]= this.stat[i-1][1] + pv;
            this.stat[i][2]= this.stat[i-1][2] + att;
            this.stat[i][3]= this.stat[i-1][3] + def;
            this.stat[i][4]= this.stat[i-1][4] + attSpe;
            this.stat[i][5]= this.stat[i-1][5] + defSpe;
            this.stat[i][6]= this.stat[i-1][6] + vit;
            this.stat[i][7]= this.stat[i-1][7] + esq;
            this.stat[i][8]= this.stat[i-1][8] + prec;
            this.stat[i][9]= calculeExp(expMin, expMax, i+1);
            this.stat[i][10]= calculeExp(expDonnerMin, expDonnerMax, i+2);
        }
    }
    
    public Stat (Pokemon pokNiv1, Pokemon pokNiv120, int nivMax, CourbeExperience courbeExperience) {
        this.stat=new double[nivMax][11];
        this.stat[0][0] = pokNiv1.getNiveau();
        this.stat[0][1] = pokNiv1.getPv();
        this.stat[0][2] = pokNiv1.getAtt();
        this.stat[0][3] = pokNiv1.getDef();
        this.stat[0][4] = pokNiv1.getAttSpe();
        this.stat[0][5] = pokNiv1.getDefSpe();
        this.stat[0][6] = pokNiv1.getVit();
        this.stat[0][7] = pokNiv1.getEsq();
        this.stat[0][8] = pokNiv1.getPrec();
        this.stat[0][9] = courbeExperience.calcule(1);
        this.stat[0][10] = pokNiv1.getExpBase() * (pokNiv1.getNiveau() / 7);
        int niv = pokNiv1.getNiveau();
        int niveauEcart = pokNiv120.getNiveau() - pokNiv1.getNiveau();
        double pv = (pokNiv120.getPv() - pokNiv1.getPv()) / niveauEcart;
        double att = (pokNiv120.getAtt() - pokNiv1.getAtt()) / niveauEcart;
        double def = (pokNiv120.getDef() - pokNiv1.getDef()) / niveauEcart;
        double attSpe = (pokNiv120.getAttSpe() - pokNiv1.getAttSpe()) / niveauEcart;
        double defSpe = (pokNiv120.getDefSpe() - pokNiv1.getDefSpe()) / niveauEcart;
        double vit = (pokNiv120.getVit() - pokNiv1.getVit()) / niveauEcart;
        double esq = (pokNiv120.getEsq() - pokNiv1.getEsq()) / niveauEcart;
        double prec = (pokNiv120.getPrec() - pokNiv1.getPrec()) / niveauEcart;
        for (int i=niv ; i<nivMax ; i++) {
            this.stat[i][0]= i+1;
            this.stat[i][1]= this.stat[i-1][1] + pv;
            this.stat[i][2]= this.stat[i-1][2] + att;
            this.stat[i][3]= this.stat[i-1][3] + def;
            this.stat[i][4]= this.stat[i-1][4] + attSpe;
            this.stat[i][5]= this.stat[i-1][5] + defSpe;
            this.stat[i][6]= this.stat[i-1][6] + vit;
            this.stat[i][7]= this.stat[i-1][7] + esq;
            this.stat[i][8]= this.stat[i-1][8] + prec;
            this.stat[i][9] = courbeExperience.calcule(i);
            this.stat[i][10] = pokNiv1.getExpBase() * (i / 7);
        }
    }
    
    public double getNiv(int i) {
        return this.stat[i][0];
    }
    
    public double getPv(int i) {
        return this.stat[i][1];
    }
    
    public double getAtt(int i) {
        return this.stat[i][2];
    }
    
    public double getDef(int i) {
        return this.stat[i][3];
    }
    
    public double getAttSpe(int i) {
        return this.stat[i][4];
    }
    
    public double getDefSpe(int i) {
        return this.stat[i][5];
    }
    
    public double getVit(int i) {
        return this.stat[i][6];
    }
    
    public double getEsq(int i) {
        return this.stat[i][7];
    }
    
    public double getPrec(int i) {
        return this.stat[i][8];
    }
    
    public double getExp(int i) {
        return this.stat[i][9];
    }
    
    public double getExpDonner(int i) {
        return this.stat[i][10];
    }
    
    public class CourbeRapide implements CourbeExperience {
        
        @Override
        public int calcule (int niv) {
            return (int)(0.8 * (Math.pow(niv, 3)));
        }
        
    }
    
    public class CourbeMoyenne implements CourbeExperience {
        
        @Override
        public int calcule (int niv) {
            return (int)(Math.pow(niv, 3));
        }
        
    }
    
    public class CourbeParabolique implements CourbeExperience {
        
        @Override
        public int calcule (int niv) {
            return (int)(1.2 * Math.pow(niv, 3) - 15 * Math.pow(niv, 2) + 100 * niv - 140);
        }
        
    }
    
    public class CourbeLente implements CourbeExperience {
        
        @Override
        public int calcule (int niv) {
            return (int)(1.25 * (Math.pow(niv, 3)));
        }
        
    }
    
}

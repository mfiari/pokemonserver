/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.type;

/**
 *
 * @author mike
 */
public class EffortValue {
    
    private int pv;
    private int att;
    private int def;
    private int attSpe;
    private int defSpe;
    private int vit;
    private final static int EV_MAX = 510;
    private final static int EV_MAX_STAT = 255;

    public EffortValue() {
        this.pv = 0;
        this.att = 0;
        this.def = 0;
        this.attSpe = 0;
        this.defSpe = 0;
        this.vit = 0;
    }
    
    private boolean evMaxAtteint () {
        return EV_MAX == this.pv + this.att + this.def + this.attSpe + this.defSpe + this.vit;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.pv)) {
            this.pv += pv;
        }
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.att)) {
            this.att += att;
        }
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.def)) {
            this.def += def;
        }
    }

    public int getAttSpe() {
        return attSpe;
    }

    public void setAttSpe(int attSpe) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.attSpe)) {
            this.attSpe += attSpe;
        }
    }

    public int getDefSpe() {
        return defSpe;
    }

    public void setDefSpe(int defSpe) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.defSpe)) {
            this.defSpe += defSpe;
        }
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.vit)) {
            this.vit += vit;
        }
    }
    
}

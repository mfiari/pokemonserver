/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.type;

/**
 *
 * @author mike
 */
public class IndividualValue {
    
    private int pv;
    private int att;
    private int def;
    private int attSpe;
    private int defSpe;
    private int vit;

    public IndividualValue() {
        this.pv = (int) (Math.random() * 31 +1);
        this.att = (int) (Math.random() * 31 +1);
        this.def = (int) (Math.random() * 31 +1);
        this.attSpe = (int) (Math.random() * 31 +1);
        this.defSpe = (int) (Math.random() * 31 +1);
        this.vit = (int) (Math.random() * 31 +1);
    }

    public IndividualValue(int pv, int att, int def, int attSpe, int defSpe, int vit) {
        this.pv = pv;
        this.att = att;
        this.def = def;
        this.attSpe = attSpe;
        this.defSpe = defSpe;
        this.vit = vit;
    }

    public int getPv() {
        return pv;
    }

    public int getAtt() {
        return att;
    }

    public int getDef() {
        return def;
    }

    public int getAttSpe() {
        return attSpe;
    }

    public int getDefSpe() {
        return defSpe;
    }

    public int getVit() {
        return vit;
    }
    
}

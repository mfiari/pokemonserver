/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.texte;

/**
 *
 * @author mike
 */
abstract public class Texte extends mfiari.lib.game.texte.Texte {
    
    public static String nomPersoPrincipalDefaut = "Sacha";
    public static String nomKanto = "Kanto";
    public static String nomJhoto = "Jhoto";
    public static String nomHoenn = "Hoenn";
    public static String nomSinnoh = "Sinnoh";
    
    public static String getEmpoisonne () {
        switch (langue) {
            case fr:
                return "est empoisonné";
            case en:
                return "is poisonned";
            default :
                return "";
        }
    }
    
    public static String getParalise () {
        switch (langue) {
            case fr:
                return "est paralisé";
            case en:
                return "is paralized";
            default :
                return "";
        }
    }
    
    public static String getSommeil () {
        switch (langue) {
            case fr:
                return "s'endore";
            case en:
                return "fall asleep";
            default :
                return "";
        }
    }
    
    public static String getFolie () {
        switch (langue) {
            case fr:
                return "est confus";
            case en:
                return "is mad";
            default :
                return "";
        }
    }
    
    public static String getBrulure() {
        switch (langue) {
            case fr:
                return "brule";
            case en:
                return "burn";
            default :
                return "";
        }
    }
    
    public static String getGel() {
        switch (langue) {
            case fr:
                return "est gelé";
            case en:
                return "is freeze";
            default :
                return "";
        }
    }
    
    public static String getPeur() {
        switch (langue) {
            case fr:
                return "est appeuré";
            case en:
                return "is affraid";
            default :
                return "";
        }
    }
    
    public static String getAucun() {
        return "";
    }
}

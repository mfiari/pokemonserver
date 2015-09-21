/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.ville;

import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.type.TypeTournoi;

/**
 *
 * @author mike
 */
public class Terrains {
    
    public static Terrain terrainAcier = new Terrain (Type.acier);
    public static Terrain terrainCombat = new Terrain (Type.combat);
    public static Terrain terrainDragon = new Terrain (Type.dragon);
    public static Terrain terrainEau = new Terrain (Type.eau);
    public static Terrain terrainElectrique = new Terrain (Type.electrique);
    public static Terrain terrainFeu = new Terrain (Type.feu);
    public static Terrain terrainGlace = new Terrain (Type.glace);
    public static Terrain terrainInsecte = new Terrain (Type.insecte);
    public static Terrain terrainNormal = new Terrain (Type.normal);
    public static Terrain terrainPlante = new Terrain (Type.plante);
    public static Terrain terrainPoison = new Terrain (Type.poison);
    public static Terrain terrainPsy = new Terrain (Type.psy);
    public static Terrain terrainRoche = new Terrain (Type.roche);
    public static Terrain terrainSol = new Terrain (Type.sol);
    public static Terrain terrainSpectre = new Terrain (Type.spectre);
    public static Terrain terrainTenebres = new Terrain (Type.tenebres);
    public static Terrain terrainVol = new Terrain (Type.vol);
    public static Terrain tousTerrain = new Terrain (Type.tous);
    
    public static Terrain getTerrain (int i) {
        switch (i) {
            case 1 :
                return terrainPlante;
            case 2 :
                return terrainEau;
            case 3 :
                return terrainFeu;
            case 4 :
                return terrainRoche;
            case 5 :
                return terrainGlace;
            case 6 :
                return terrainSol;
            case 7 :
                return terrainPsy;
            case 8 :
                return terrainAcier;
            case 9 :
                return terrainVol;
            case 10 :
                return terrainInsecte;
            case 11 :
                return terrainPoison;
            case 12 :
                return terrainDragon;
            case 13 :
                return terrainTenebres;
            case 14 :
                return terrainElectrique;
            case 15 :
                return terrainCombat;
            case 16 :
                return terrainSpectre;
            case 17 :
                return terrainNormal;
            default :
                 return terrainNormal;
        }
    }
    
    public static Terrain getTerrain (TypeTournoi typeTournoi) {
        switch (typeTournoi) {
            case acier :
                return terrainAcier;
            case combat :
                return terrainCombat;
            case dragon :
                return terrainDragon;
            case eau :
                return terrainEau;
            case electrique :
                return terrainElectrique;
            case feu :
                return terrainFeu;
            case glace :
                return terrainGlace;
            case insecte :
                return terrainInsecte;
            case normal :
                return terrainNormal;
            case plante :
                return terrainPlante;
            case poison :
                return terrainPoison;
            case psy :
                return terrainPsy;
            case roche :
                return terrainRoche;
            case sol :
                return terrainSol;
            case spectre :
                return terrainSpectre;
            case tenebres :
                return terrainTenebres;
            case vol :
                return terrainVol;
            default :
                 return tousTerrain;
        }
    }
}

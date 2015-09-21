/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import java.io.Serializable;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.liste.ListeDEndroit;
import mfiari.lib.game.liste.ListeDeuxDimension;
import mfiari.pokemon.server.ville.Endroit;
import mfiari.pokemon.server.ville.Endroits;

/**
 *
 * @author etudiant
 */
public class Carte extends ControlleurVue implements Serializable {
    
    private ListeDEndroit kanto;
    private ListeDEndroit johto;
    private ListeDEndroit hoenn;
    private ListeDEndroit sinnoh;
    private ListeDEndroit ile_orange;
    private ListeDeuxDimension<Endroit, Boolean> endroits_visite;
    
    
    public Carte () {
        super(false);
        this.kanto = new ListeDEndroit();
        this.johto = new ListeDEndroit();
        this.hoenn = new ListeDEndroit();
        this.sinnoh = new ListeDEndroit();
        this.ile_orange = new ListeDEndroit();
        this.endroits_visite = new ListeDeuxDimension<>();
        this.initCarte();
    }
    
    private void initCarte () {
        /* carte kanto */
        this.kanto.ajouterEndroit(Endroits.bourgPalette);
        this.endroits_visite.add(Endroits.bourgPalette, Boolean.FALSE);
        
        /* carte johto */
        this.johto.ajouterEndroit(Endroits.bourg_geon);
        this.endroits_visite.add(Endroits.bourg_geon, Boolean.FALSE);
        
        /* carte hoenn */
        this.hoenn.ajouterEndroit(Endroits.bourg_en_vol);
        this.endroits_visite.add(Endroits.bourg_en_vol, Boolean.FALSE);
        
        /* carte sinnoh */
        this.sinnoh.ajouterEndroit(Endroits.bonaugure);
        this.endroits_visite.add(Endroits.bonaugure, Boolean.FALSE);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.tournoi;

import java.io.Serializable;
import mfiari.pokemon.server.type.TypeTournoi;

/**
 *
 * @author mike
 */
public class StatTournoi implements Serializable {
    
    public StatTournoi () {
        
    }
    
    public int getNbParticipation (TypeTournoi type) {
        return 0;
    }
    
    public int getNbVictoire (TypeTournoi type) {
        return 0;
    }
    
    public String meilleurPlace (TypeTournoi type) {
        return "NA";
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.type;

import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import mfiari.pokemon.server.perso.pokemon.PokemonLegendaire;
import mfiari.pokemon.server.perso.pokemon.Pokemons;
import mfiari.pokemon.core.tournoi.NiveauTournoi;

/**
 *
 * @author mike
 */
public enum TypeTournoi {
    
    liguePokemon, superLiguePokemon, combat, plante, eau, feu, roche, glace, sol, psy, acier, vol, insecte, poison, dragon, tenebres, electrique, 
    spectre, normal, tous;
    
    public boolean acceptePokemon (Pokemon pkmn) {
        switch (this) {
            case liguePokemon:
                return (!(pkmn instanceof PokemonLegendaire));
            case superLiguePokemon:
                return true;
            case combat:
                if (pkmn.getType1().equals(Type.combat) || (pkmn.getType2() != null && pkmn.getType2().equals(Type.combat))) {
                    return true;
                }
                return false;
            case plante:
                if (pkmn.getType1().equals(Type.plante) || (pkmn.getType2() != null && pkmn.getType2().equals(Type.plante))) {
                    return true;
                }
            default :
                if (pkmn.getType1().equals(Type.valueOf(this.name())) || (pkmn.getType2() != null && pkmn.getType2().equals(Type.valueOf(this.name())))) {
                    return true;
                }
                return false;
        }
    }
    
    public int getNbParticiapntByTournoiAndNiveau (NiveauTournoi niveau) {
        switch (this) {
            case liguePokemon :
                switch (niveau) {
                    case gamin :
                        return 16;
                    case dresseurPkmn :
                        return 32;
                    case topDresseur :
                        return 32;
                    case champion :
                        return 64;
                    case maitre :
                        return 80;
                }
            case superLiguePokemon :
                switch (niveau) {
                    case gamin :
                        return 16;
                    case dresseurPkmn :
                        return 32;
                    case topDresseur :
                        return 32;
                    case champion :
                        return 64;
                    case maitre :
                        return 80;
                }
            default :
                switch (niveau) {
                    case gamin :
                        return 4;
                    case dresseurPkmn :
                        return 8;
                    case topDresseur :
                        return 16;
                    case champion :
                        return 32;
                    case maitre :
                        return 64;
                }
        }
        return 0;
    }
    
}

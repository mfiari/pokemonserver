/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso;

import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import java.util.ArrayList;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.texte.Parole;
import mfiari.pokemon.server.objet.Badge;
import mfiari.pokemon.server.objet.Objet_CT;
import mfiari.pokemon.server.ville.Endroit;

/**
 *
 * @author mike
 */
public class ChampionArene extends Dresseur {
    
    private Badge badge;
    private Objet_CT ct;
    private ArrayList<Parole> parolesApresCombat;
    
    public ChampionArene () {
        super();
        this.badge = null;
        this.ct = null;
    }
    
    public ChampionArene (String nom, int numeroID, int positionX, int positionY, Endroit ville, Badge b, Orientation orientation, Objet_CT ct) {
        super(nom, numeroID, positionX, positionY, ville, Titre.champion, orientation);
        this.badge = b;
        this.ct = ct;
        this.parolesApresCombat = new ArrayList<>();
    }
    
    public ChampionArene (ChampionArene champion) {
        super(champion);
        this.badge = champion.badge;
        this.parolesApresCombat = new ArrayList<>();
    }
    
    public ChampionArene (ChampionArene champion, boolean changeNumId) {
        super(champion, changeNumId);
        this.badge = champion.badge;
        this.parolesApresCombat = new ArrayList<>();
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(200);
        pk.getAttributsExp().setAllNiveau(2);
        pk.getTypeExp().setAllNiveau(2);
        this.getEquipe().ajouterPokemon(pk);
    }

    public Badge getBadge() {
        return this.badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    
    public Objet_CT getCT () {
        return this.ct;
    }

    public void ajouterParoleApresCombat(String p) {
        this.parolesApresCombat.add(new Parole(p));
    }

    public void ajouterParoleApresCombat(Parole p) {
        this.parolesApresCombat.add(p);
    }

    public void supprimerParoleApresCombat() {
        for (int j = 0; j < this.parolesApresCombat.size(); j++) {
            this.parolesApresCombat.remove(j);
        }
    }

    public String ParlerApresCombat() {
        String parole = "";
        if (!this.parolesApresCombat.isEmpty() && this.indiceParole < this.parolesApresCombat.size()) {
            parole = this.getNom() + ": " + this.parolesApresCombat.get(this.indiceParole).toString();
            this.indiceParole++;
        } else {
            this.indiceParole = 0;
        }
        return parole;
    }
    
}

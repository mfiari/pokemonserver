/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.evenement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mfiari.lib.game.condition.Condition;
import mfiari.lib.game.jeu.Jeu;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Gens;
import mfiari.pokemon.server.PokemonJeu;
import mfiari.pokemon.server.combat.Combat;
import mfiari.pokemon.core.perso.pokemon.Pokemon;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.list.ListeDeDresseur;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.core.perso.pokemon.EquipePokemon;
import mfiari.pokemon.core.ville.Terrain;

/**
 *
 * @author mike
 */
public class EvenementCombat extends Evenement {
    
    private ArrayList<EvenementDialogue> evenDialogue;
    private ArrayList<Condition> conditions;
    private ArrayList<EvenementDialogue> warning;
    private int pointeur;
    private Map<Dresseur, EquipePokemon> adversaires;
    private Terrain terrain;
    private Pokemon pk;
    private Combat.TypeCombat typeCombat;

    public EvenementCombat (Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre, Terrain t) {
        this(endroitDeLevenement, personneAquiParler, objet, titre, t, Combat.TypeCombat.SIMPLE);
    }

    public EvenementCombat (Position endroitDeLevenement, Gens personneAquiParler, Objet objet, String titre, Terrain t, Combat.TypeCombat typeCombat) {
        super(endroitDeLevenement, personneAquiParler, objet, titre, 0);
        this.evenDialogue = new ArrayList<> ();
        this.conditions = new ArrayList<> ();
        this.warning = new ArrayList<> ();
        this.pointeur=0;
        this.terrain = t;
        this.typeCombat = typeCombat;
        this.adversaires = new HashMap<>();
    }

    public void ajouterEvenementDialogue (EvenementDialogue e, Condition c, EvenementDialogue w) {
        this.evenDialogue.add(e);
        this.warning.add(w);
        this.conditions.add(c);
    }
    
    public void ajouterAdversaire (Dresseur d) {
        this.adversaires.put(d, new EquipePokemon());
    }
    
    public void ajouterAdversaire (Pokemon pk) {
        this.pk = pk;
    }
    
    public void ajouterPokemonAdversaire (Pokemon pk) {
        for (Map.Entry<Dresseur, EquipePokemon> entry : this.adversaires.entrySet()) {
            this.ajouterPokemonAdversaire(pk, entry.getKey());
            break;
        }
    }
    
    public void ajouterPokemonAdversaire (Pokemon pk, Dresseur d) {
        this.adversaires.get(d).ajouterPokemon(pk);
    }

    public Condition getCondition () {
        return this.conditions.get(this.pointeur);
    }

    public EvenementDialogue getDialogue () {
        return this.evenDialogue.get(this.pointeur);
    }

    public EvenementDialogue getWarning () {
        return this.warning.get(this.pointeur);
    }

    public void conditionReussi () {
        this.pointeur++;
    }

    @Override
    public boolean estFini () {
        return super.estFini() || this.pointeur == this.conditions.size();
    }

    @Override
    public void activeEvenement(PokemonJeu jeu) {
        if (!this.adversaires.isEmpty()) {
            ListeDeDresseur advs = new ListeDeDresseur();
            for (Map.Entry<Dresseur, EquipePokemon> entry : this.adversaires.entrySet()) {
                EquipePokemon tmp = entry.getValue();
                this.adversaires.put(entry.getKey(), entry.getKey().getEquipe());
                entry.getKey().setEquipe(tmp);
                advs.ajouterDresseur(entry.getKey());
            }
            Combat c = new Combat (jeu, this.terrain);
            c.commencerCombat(new ListeDeDresseur(jeu.getPerso()), advs, this.typeCombat);
        } else if (this.pk != null) {
            Combat c = new Combat (jeu, this.terrain);
            c.commencerCombat(new ListeDeDresseur(jeu.getPerso()), new EquipePokemon(this.pk), this.typeCombat);
        }
    }

    @Override
    public void activeEvenement(Jeu jeu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.capacite;

import mfiari.pokemon.core.capacite.Attributs;
import mfiari.pokemon.core.capacite.PokemonVise;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class CapaciteStat extends Capacite {
    
    private static final long serialVersionUID = 1L;
    
    private final Attributs[] attributs;
    private final int[] pourcentages;
    private final int pourcentagesReussite;
    private final boolean[] augmente;
    private final boolean[] surSoi;
    
    public CapaciteStat () {
        super();
        this.attributs = Attributs.values();
        this.pourcentages = new int[Attributs.values().length];
        this.augmente = new boolean[Attributs.values().length];
        this.surSoi = new boolean[Attributs.values().length];
        for (int i = 0 ; i < this.pourcentages.length ; i++) {
            this.pourcentages[i] = -1;
        }
        this.pourcentagesReussite = 100;
    }
    
    public CapaciteStat (String nom, Type type, int force, int prec, int pp, Attribut classe) {
        super(nom, type, force, prec, pp, classe);
        this.attributs = Attributs.values();
        this.pourcentages = new int[Attributs.values().length];
        this.augmente = new boolean[Attributs.values().length];
        this.surSoi = new boolean[Attributs.values().length];
        for (int i = 0 ; i < this.pourcentages.length ; i++) {
            this.pourcentages[i] = -1;
        }
        this.pourcentagesReussite = 100;
    }
    
    public CapaciteStat (String nom, Type type, int force, int prec, int pp, Attribut classe, int pourcentageReussi) {
        super(nom, type, force, prec, pp, classe);
        this.attributs = Attributs.values();
        this.pourcentages = new int[Attributs.values().length];
        this.augmente = new boolean[Attributs.values().length];
        this.surSoi = new boolean[Attributs.values().length];
        for (int i = 0 ; i < this.pourcentages.length ; i++) {
            this.pourcentages[i] = -1;
        }
        this.pourcentagesReussite = pourcentageReussi;
    }

    public CapaciteStat (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.attributs = Attributs.values();
        this.pourcentages = new int[Attributs.values().length];
        this.augmente = new boolean[Attributs.values().length];
        this.surSoi = new boolean[Attributs.values().length];
        for (int i = 0 ; i < this.pourcentages.length ; i++) {
            this.pourcentages[i] = -1;
        }
        this.pourcentagesReussite = 100;
    }

    public CapaciteStat (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, int pourcentageReussi) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.attributs = Attributs.values();
        this.pourcentages = new int[Attributs.values().length];
        this.augmente = new boolean[Attributs.values().length];
        this.surSoi = new boolean[Attributs.values().length];
        for (int i = 0 ; i < this.pourcentages.length ; i++) {
            this.pourcentages[i] = -1;
        }
        this.pourcentagesReussite = pourcentageReussi;
    }

    public CapaciteStat (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, int pourcentageReussi, 
            int priorite) {
        super(nom, type, force, prec, pp, classe, pokemonVise, priorite);
        this.attributs = Attributs.values();
        this.pourcentages = new int[Attributs.values().length];
        this.augmente = new boolean[Attributs.values().length];
        this.surSoi = new boolean[Attributs.values().length];
        for (int i = 0 ; i < this.pourcentages.length ; i++) {
            this.pourcentages[i] = -1;
        }
        this.pourcentagesReussite = pourcentageReussi;
    }

    public CapaciteStat (CapaciteStat c) {
        super(c);
        this.attributs = c.attributs;
        this.pourcentages = c.pourcentages;
        this.pourcentagesReussite = c.pourcentagesReussite;
        this.augmente = c.augmente;
        this.surSoi = c.surSoi;
    }
    
    private int getIndiceByAttribut (Attributs a) {
        int indice = 0;
        while (indice < this.attributs.length && !this.attributs[indice].equals(a)) {
            indice++;
        }
        if (indice >= this.attributs.length) {
            indice = -1;
        }
        return indice;
    }
    
    public void ajouterAttribut(Attributs a, int pourCent, boolean augmente, boolean surSoi) {
        int indice = this.getIndiceByAttribut(a);
        if (indice != -1) {
            this.pourcentages[indice] = pourCent;
            this.augmente[indice] = augmente;
            this.surSoi[indice] = surSoi;
        }
    }
    
    public int lenght () {
        return this.attributs.length;
    }
    
    public boolean aAttribut (int i) {
        return this.pourcentages[i] != -1;
    }
    
    public Attributs getAttribut (int i) {
        return this.attributs[i];
    }
    
    public int getPourCent (int i) {
        return this.pourcentages[i];
    }
    
    public boolean reussi () {
        return ((int) (Math.random() * 100 + 1)) <= this.pourcentagesReussite;
    }
    
    public int getPourcentageReussi () {
        return this.pourcentagesReussite;
    }
    
    public boolean getAugmente (int i) {
        return this.augmente[i];
    }
    
    public boolean getSurSoi (int i) {
        return this.surSoi[i];
    }
}

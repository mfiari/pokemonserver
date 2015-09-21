/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.perso;

import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import java.util.ArrayList;
import mfiari.lib.game.personnage.Personnage;
import mfiari.lib.game.personnage.Sexe;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.texte.Parole;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.liste.ListeDeBadge;
import mfiari.pokemon.server.objet.PC;
import mfiari.pokemon.server.objet.Pokedex;
import mfiari.pokemon.server.objet.Pokematos;
import mfiari.pokemon.server.objet.Sac;
import mfiari.pokemon.server.tournoi.StatTournoi;
import mfiari.pokemon.server.ville.Endroit;

/**
 *
 * @author mike
 */
public abstract class Dresseur extends Personnage {
    
    private static final long serialVersionUID = 354054054054L;
    
    private int numeroID;
    private Titre titre;
    private EquipePokemon equipe;
    private ListeDeBadge badges;
    private PC pc;
    private Pokedex pokedex;
    private Pokematos pokematos;
    private int argent;
    private Sac sac;
    private ArrayList<Parole> parolesAvantCombat;
    private ArrayList<Parole> parolesFinCombat;
    protected int indiceParole;
    protected boolean mobile;
    private StatTournoi statTournoi;
    
    public Dresseur () {
        super("Sacha", 1, 1, null, Orientation.face);
        this.numeroID = 0;
        this.titre = Titre.DresseurPokemon;
        this.equipe = new EquipePokemon();
        this.badges = new ListeDeBadge();
        this.pc = new PC();
        this.pokedex = null;
        this.sac = new Sac();
        this.argent = 0;
        this.statTournoi = new StatTournoi();
    }
    
    public Dresseur (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, Orientation orientation) {
        this(nom, numeroID, positionX, positionY, ville, titre, orientation, Sexe.garcon);
    }
    
    public Dresseur (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, Orientation orientation, Sexe sexe) {
        super(nom, positionX, positionY, ville, orientation, sexe);
        this.numeroID = numeroID;
        this.titre = titre;
        this.equipe = new EquipePokemon();
        this.badges = new ListeDeBadge();
        this.pc = new PC();
        this.pokedex = null;
        this.sac = new Sac();
        this.argent = 0;
        this.parolesAvantCombat = new ArrayList<>();
        this.parolesFinCombat = new ArrayList<>();
        this.indiceParole = 0;
        this.pokematos = null;
        this.statTournoi = new StatTournoi();
        this.mobile = true;
    }
    
    public Dresseur (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, Orientation orientation, int nbPokemon) {
        this(nom, numeroID, positionX, positionY, ville, titre, orientation);
        this.equipe = new EquipePokemon(nbPokemon);
        this.badges = new ListeDeBadge();
    }
    
    public Dresseur (Dresseur d) {
        super(d.getNom(), d.getPosition());
        this.numeroID = d.numeroID;
        this.titre = d.titre;
        this.equipe = new EquipePokemon(d.equipe);
        this.badges = d.badges;
        this.pc = d.pc;
        this.pokedex = d.pokedex;
        this.sac = d.sac;
        this.argent = d.argent;
        this.parolesAvantCombat = d.parolesAvantCombat;
        this.parolesFinCombat = d.parolesFinCombat;
        this.indiceParole = d.indiceParole;
        this.statTournoi = d.statTournoi;
        this.mobile = d.mobile;
    }
    
    public Dresseur (Dresseur d, boolean changeNumId) {
        this(d);
        int numID;
        if (changeNumId) {
            numID = d.numeroID + 1;
        } else {
            numID = d.numeroID;
        }
        this.numeroID = numID;
        d.setNumeroID(numID);
    }
    
    public static Dresseur getDresseur (Dresseur d) {
        if (d instanceof DresseurClassique) {
            return new DresseurClassique((DresseurClassique)d);
        } else if (d instanceof ChampionArene) {
            return new ChampionArene((ChampionArene)d);
        } else if (d instanceof Conseil4) {
            return new Conseil4((Conseil4)d);
        } else if (d instanceof Maitre) {
            return new Maitre((Maitre)d);
        } else if (d instanceof Rival) {
            return new Rival((Rival)d);
        } else if (d instanceof Topdresseur) {
            return new Topdresseur((Topdresseur)d);
        }
        return null;
    }
    
    public static Dresseur getDresseur (Dresseur d, boolean changeNumId) {
        if (d instanceof DresseurClassique) {
            return new DresseurClassique((DresseurClassique)d, changeNumId);
        } else if (d instanceof ChampionArene) {
            return new ChampionArene((ChampionArene)d, changeNumId);
        } else if (d instanceof Conseil4) {
            return new Conseil4((Conseil4)d, changeNumId);
        } else if (d instanceof Maitre) {
            return new Maitre((Maitre)d, changeNumId);
        } else if (d instanceof Rival) {
            return new Rival((Rival)d, changeNumId);
        } else if (d instanceof Topdresseur) {
            return new Topdresseur((Topdresseur)d, changeNumId);
        }
        return null;
    }

    public Titre getTitre() {
        return this.titre;
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public ListeDeBadge getBadges() {
        return badges;
    }

    public void setBadges(ListeDeBadge badges) {
        this.badges = badges;
    }

    public PC getPC() {
        return this.pc;
    }

    public void setPC(PC pc) {
        this.pc = pc;
    }

    public EquipePokemon getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipePokemon equipe) {
        this.equipe = equipe;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }

    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
        if (this.pokedex != null) {
            for (int i = 0 ; i < this.equipe.getNbPokemon() ; i++) {
                this.pokedex.capturePokemon(this.equipe.getPokemon(i));
            }
        }
    }

    public Pokematos getPokematos() {
        return pokematos;
    }

    public void setPokematos(Pokematos pokematos) {
        this.pokematos = pokematos;
    }

    public Sac getSac() {
        return this.sac;
    }

    public void setSac(Sac sac) {
        this.sac = sac;
    }
    
    public StatTournoi getStatTournoi () {
        return this.statTournoi;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean estMobile) {
        this.mobile = estMobile;
    }
    
    public void capturerPokemon(Pokemon pk) {
        pk.setDoNomDresseur(this.getNom());
        if (this.pokedex != null) {
            this.pokedex.capturePokemon(pk);
        }
        this.ajouterPokemon(pk);
    }
    
    public boolean aPokemon () {
        for (int i=0 ; i< this.equipe.lenght() ; i++) {
            if (this.equipe.getPokemon(i) != null && this.equipe.getPokemon(i).getPv() > 0) {
                return true;
            }
        }
        return false;
    }
    
    public void setEquipeKO () {
        for (int i=0 ; i< this.equipe.lenght() ; i++) {
            if (this.equipe.aPokemon(i)) {
                this.equipe.getPokemon(i).mettreKO();
            }
        }
    }
    
    public void soignerEquipe () {
        for (int i=0 ; i< this.equipe.lenght() ; i++) {
            if (this.equipe.aPokemon(i)) {
                this.equipe.getPokemon(i).soin();
            }
        }
    }
    
    abstract public void ajouterPokemon(Pokemon pk);
    
    @Override
    public boolean equals (Object o) {
        if (o instanceof Dresseur) {
            Dresseur d = (Dresseur) o;
            /*System.out.println(this.getNom() + " " + this.titre + " " + this.numeroID);
            System.out.println(d.getNom() + " " + d.titre + " " + d.numeroID);
            System.out.println(this.getNom().equals(d.getNom()) + " " + this.titre.equals(d.titre) + " " + (this.numeroID == d.numeroID));*/
            return this.getNom().equals(d.getNom()) && this.titre.equals(d.titre) && this.numeroID == d.numeroID;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.numeroID;
        hash = 71 * hash + (this.titre != null ? this.titre.hashCode() : 0);
        return hash;
    }

    public void ajouterParoleAvantCombat(String x) {
        this.parolesAvantCombat.add(new Parole(x));
    }

    public void ajouterParoleAvantCombat(Parole p) {
        this.parolesAvantCombat.add(p);
    }

    public void supprimerParoleAvantCombat() {
        for (int j = 0; j < this.parolesAvantCombat.size(); j++) {
            this.parolesAvantCombat.remove(j);
        }
    }

    public String ParlerAvantCombat() {
        String parole = "";
        if (!this.parolesAvantCombat.isEmpty() && this.indiceParole < this.parolesAvantCombat.size()) {
            parole = this.getNom() + ": " + this.parolesAvantCombat.get(this.indiceParole).toString();
            this.indiceParole++;
        } else {
            this.indiceParole = 0;
        }
        return parole;
    }

    public void ajouterParoleFinCombat(String p) {
        this.parolesFinCombat.add(new Parole(p));
    }

    public void ajouterParoleFinCombat(Parole p) {
        this.parolesFinCombat.add(p);
    }

    public void supprimerParoleFinCombat() {
        for (int j = 0; j < this.parolesFinCombat.size(); j++) {
            this.parolesFinCombat.remove(j);
        }
    }

    public String ParlerFinCombat() {
        String parole = "";
        if (!this.parolesFinCombat.isEmpty() && this.indiceParole < this.parolesFinCombat.size()) {
            parole = this.getNom() + ": " + this.parolesFinCombat.get(this.indiceParole).toString();
            this.indiceParole++;
        } else {
            this.indiceParole = 0;
        }
        return parole;
    }
    
}

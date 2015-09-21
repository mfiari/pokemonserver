/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.objet;

import mfiari.pokemon.core.objet.Objet_lettre;
import mfiari.pokemon.core.objet.Objet_baie;
import mfiari.pokemon.core.objet.Objet_combat;
import mfiari.pokemon.core.objet.Objet_ball;
import mfiari.pokemon.core.objet.Objet_medicament;
import mfiari.pokemon.core.objet.Objet_rare;
import mfiari.pokemon.core.objet.Objet_divers;
import java.io.Serializable;
import mfiari.lib.game.liste.ListeObjet;
import mfiari.lib.game.objet.Objet;

/**
 *
 * @author mike
 */
public class Sac extends mfiari.lib.game.objet.Sac implements Serializable {
    
    private int choixSac;
    private ListeObjet<Objet_divers> objets_divers;
    private ListeObjet<Objet_medicament> objets_medicament;
    private ListeObjet<Objet_ball> objets_ball;
    private ListeObjet<Objet_capacite> objets_capacite;
    private ListeObjet<Objet_baie> objets_baie;
    private ListeObjet<Objet_lettre> objets_lettre;
    private ListeObjet<Objet_combat> objets_combat;
    private ListeObjet<Objet_rare> objets_rare;

    public Sac() {
        this.objets_divers = new ListeObjet<>();
        this.objets_medicament = new ListeObjet<>();
        this.objets_ball = new ListeObjet<>();
        this.objets_capacite = new ListeObjet<>();
        this.objets_baie = new ListeObjet<>();
        this.objets_lettre = new ListeObjet<>();
        this.objets_combat = new ListeObjet<>();
        this.objets_rare = new ListeObjet<>();
        this.choixSac = 1;
    }
    
    @Override
    public int getChoixSac() {
        return this.choixSac;
    }

    @Override
    public void setChoixSac(int choixSac) {
        this.choixSac = choixSac;
    }
    
    @Override
    public void afficheSac () {
        do {
            this.pcsControlleurVue.firePropertyChange("afficherObjets", null, null);
            if (this.choix == -1) {
                if (this.choixSac == 8) {
                    this.choixSac = 1;
                } else {
                    this.choixSac++;
                }
            } else if (this.choix == -2) {
                if (this.choixSac == 1) {
                    this.choixSac = 8;
                } else {
                    this.choixSac--;
                }
            }
        } while (this.choix == -1 || this.choix == -2);
        this.supprimerTousEcouteur();
    }

    @Override
    public void ajouterObjet(Objet o) {
        if (o instanceof Objet_divers) {
            this.objets_divers.ajoutObjet((Objet_divers) o);
        } else if (o instanceof Objet_medicament) {
            this.objets_medicament.ajoutObjet((Objet_medicament) o);
        } else if (o instanceof Objet_ball) {
            this.objets_ball.ajoutObjet((Objet_ball) o);
        } else if (o instanceof Objet_capacite) {
            this.objets_capacite.ajoutObjet((Objet_capacite) o);
        } else if (o instanceof Objet_baie) {
            this.objets_baie.ajoutObjet((Objet_baie) o);
        } else if (o instanceof Objet_lettre) {
            this.objets_lettre.ajoutObjet((Objet_lettre) o);
        } else if (o instanceof Objet_combat) {
            this.objets_combat.ajoutObjet((Objet_combat) o);
        } else if (o instanceof Objet_rare) {
            this.objets_rare.ajoutObjet((Objet_rare) o);
        }
    }
    
    @Override
    public void acheter(Objet o, int quantite) {
        if (o instanceof Objet_divers) {
            this.objets_divers.acheter((Objet_divers) o, quantite);
        } else if (o instanceof Objet_medicament) {
            this.objets_medicament.acheter((Objet_medicament) o, quantite);
        } else if (o instanceof Objet_ball) {
            this.objets_ball.acheter((Objet_ball) o, quantite);
        } else if (o instanceof Objet_capacite) {
            this.objets_capacite.acheter((Objet_capacite) o, quantite);
        } else if (o instanceof Objet_baie) {
            this.objets_baie.acheter((Objet_baie) o, quantite);
        } else if (o instanceof Objet_lettre) {
            this.objets_lettre.acheter((Objet_lettre) o, quantite);
        } else if (o instanceof Objet_combat) {
            this.objets_combat.acheter((Objet_combat) o, quantite);
        } else if (o instanceof Objet_rare) {
            this.objets_rare.acheter((Objet_rare) o, quantite);
        }
    }
    
    public void vendre(Objet o, int quantite) {
        if (o instanceof Objet_divers) {
            this.objets_divers.vendre((Objet_divers) o, quantite);
        } else if (o instanceof Objet_medicament) {
            this.objets_medicament.vendre((Objet_medicament) o, quantite);
        } else if (o instanceof Objet_ball) {
            this.objets_ball.vendre((Objet_ball) o, quantite);
        } else if (o instanceof Objet_capacite) {
            this.objets_capacite.vendre((Objet_capacite) o, quantite);
        } else if (o instanceof Objet_baie) {
            this.objets_baie.vendre((Objet_baie) o, quantite);
        } else if (o instanceof Objet_lettre) {
            this.objets_lettre.vendre((Objet_lettre) o, quantite);
        } else if (o instanceof Objet_combat) {
            this.objets_combat.vendre((Objet_combat) o, quantite);
        } else if (o instanceof Objet_rare) {
            this.objets_rare.vendre((Objet_rare) o, quantite);
        }
    }
    
    @Override
    public Objet getObjet(Objet o) {
        if (o instanceof Objet_divers) {
            return this.objets_divers.getObjet(o.getNom());
        } else if (o instanceof Objet_medicament) {
            return this.objets_medicament.getObjet(o.getNom());
        } else if (o instanceof Objet_ball) {
            return this.objets_ball.getObjet(o.getNom());
        } else if (o instanceof Objet_capacite) {
            return this.objets_capacite.getObjet(o.getNom());
        } else if (o instanceof Objet_baie) {
            return this.objets_baie.getObjet(o.getNom());
        } else if (o instanceof Objet_lettre) {
            return this.objets_lettre.getObjet(o.getNom());
        } else if (o instanceof Objet_combat) {
            return this.objets_combat.getObjet(o.getNom());
        } else if (o instanceof Objet_rare) {
            return this.objets_rare.getObjet(o.getNom());
        }
        return null;
    }
    
    @Override
    public boolean contains(Objet o) {
        if (o instanceof Objet_divers) {
            return this.objets_divers.contains((Objet_divers) o);
        } else if (o instanceof Objet_medicament) {
            return this.objets_medicament.contains((Objet_medicament) o);
        } else if (o instanceof Objet_ball) {
            return this.objets_ball.contains((Objet_ball) o);
        } else if (o instanceof Objet_capacite) {
            return this.objets_capacite.contains((Objet_capacite) o);
        } else if (o instanceof Objet_baie) {
            return this.objets_baie.contains((Objet_baie) o);
        } else if (o instanceof Objet_lettre) {
            return this.objets_lettre.contains((Objet_lettre) o);
        } else if (o instanceof Objet_combat) {
            return this.objets_combat.contains((Objet_combat) o);
        } else if (o instanceof Objet_rare) {
            return this.objets_rare.contains((Objet_rare) o);
        }
        return false;
    }
    
    @Override
    public Objet getObjetFromSac () {
        if (this.choix != 0) {
            int choixObjet = this.choix - 1;
            switch (this.choixSac) {
                case (1):
                    return this.getObjets_divers().getObjet(choixObjet);
                case (2):
                    return this.getObjets_medicament().getObjet(choixObjet);
                case (3):
                    return this.getObjets_ball().getObjet(choixObjet);
                case (4):
                    return this.getObjets_capacite().getObjet(choixObjet);
                case (5):
                    return this.getObjets_baie().getObjet(choixObjet);
                case (6):
                    return this.getObjets_lettre().getObjet(choixObjet);
                case (7):
                    return this.getObjets_combat().getObjet(choixObjet);
                case (8):
                    return this.getObjets_rare().getObjet(choixObjet);
            }
        }
        return null;
    }

    public ListeObjet<Objet_baie> getObjets_baie() {
        return this.objets_baie;
    }

    public ListeObjet<Objet_ball> getObjets_ball() {
        return this.objets_ball;
    }

    public ListeObjet<Objet_capacite> getObjets_capacite() {
        return this.objets_capacite;
    }

    public ListeObjet<Objet_combat> getObjets_combat() {
        return this.objets_combat;
    }

    public ListeObjet<Objet_divers> getObjets_divers() {
        return this.objets_divers;
    }

    public ListeObjet<Objet_lettre> getObjets_lettre() {
        return this.objets_lettre;
    }

    public ListeObjet<Objet_medicament> getObjets_medicament() {
        return this.objets_medicament;
    }

    public ListeObjet<Objet_rare> getObjets_rare() {
        return this.objets_rare;
    }
}

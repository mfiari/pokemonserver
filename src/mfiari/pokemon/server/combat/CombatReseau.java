/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.combat;

import mfiari.pokemon.server.perso.pokemon.Pokemon;
import java.net.Socket;
import mfiari.lib.game.controlleur.Vues;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.reseau.EnvoiObjet;
import mfiari.lib.game.reseau.NetworkObjectTranmetter;
import mfiari.lib.game.reseau.ReceveurObjet;
import mfiari.pokemon.server.Global;
import mfiari.pokemon.server.liste.EquipePokemon;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.objet.Sac;
import mfiari.pokemon.core.objet.Type_objet;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.ville.Terrain;

/**
 *
 * @author mike
 */
public class CombatReseau extends Combat {

    private Socket socket;
    private ReceveurObjet receveur;
    private EnvoiObjet envoi;
    
    private Dresseur dresseur1;
    private Dresseur dresseur2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public CombatReseau() {
        super();
    }
    
    public CombatReseau(Terrain t, Socket socket) {
        super(t);
        this.terrain = t;
        this.socket = socket;
        this.envoi = new EnvoiObjet(socket);
        this.receveur = new ReceveurObjet(socket);
    }
    
    public CombatReseau(Terrain t, Socket socket, EnvoiObjet envoi, ReceveurObjet receveur) {
        super(t);
        this.terrain = t;
        this.socket = socket;
        this.envoi = envoi;
        this.receveur = receveur;
    }
    
    /*public void combatSimpleReseau(Dresseur dress1, Dresseur dress2) {
        this.alies = new ListeDeDresseur(dress1);
        this.adversaires = new ListeDeDresseur(dress2);
        this.pokemonAlies = new EquipePokemon(1);
        this.pokemonAdversaires = new EquipePokemon(1);
        this.envoi.writeObject(new NetworkObjectTranmetter("debut", null));
        this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
        this.afficheTexte(dress2.getNom() + " " + dress2.getTitre().toString() + " veut se battre");
        Pokemon pk1 = dress1.getEquipe().getPokemon();
        Pokemon pk2 = dress2.getEquipe().getPokemon();
        this.pokemonAlies.ajouterPokemon(pk1);
        this.pokemonAdversaires.ajouterPokemon(pk2);
        this.afficheTexte(dress2.getNom() + " envoi " + pk2.getNom());
        this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", pk2, null);
        this.afficheTexte("go " + pk1.getNom());
        this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", pk1, null);
        this.TerrainAffectePokemon(pk2);
        this.TerrainAffectePokemon(pk1);
        while (dress1.aPokemon() && dress2.aPokemon()) {
            pk1 = this.pokemon1;
            pk2 = this.pokemon2;
            this.choixPerso(dress1, pk1, pk2, dress2);
            this.combat(pk2, pk1, false);
            if (this.verifieKO(pk1)) {
                this.KO(pk1);
                pk1 = this.choixPokemonPerso(dress1);
                this.persoChangePokemonKO(pk1);
                this.envoi.writeObject(pk1);
            } else {
                this.EtatEnlevePv(pk1);
            }
            if (this.verifieKO(pk2)) {
                pk2 = (Pokemon)this.receveur.readObject();
                if (pk2 != null) {
                    this.pokemon2 = pk2;
                    this.afficheTexte(dress2.getNom() + " envoi " + pk2.getNom());
                    this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", null, null);
                    this.TerrainAffectePokemon(pk2);
                }
            } else {
                this.EtatEnlevePv(pk2);
            }
            this.choixMenu = 0;
            this.choixCapacite = 0;
            this.choixMenuEnnemie = 0;
            this.choixCapaciteEnnemie = 0;
        }
        this.envoi.close();
        this.receveur.close();
    }
    
    private void combat (Pokemon pk, Pokemon pk1, boolean fuite) {
        this.pcsControlleurVue.firePropertyChange("attenteAdv", null, null);
        this.choixMenuEnnemie = (Integer)this.receveur.readObject();
        if (this.choixMenu == 2 || this.choixMenu == 3) {
            if (this.choixMenu == 2) {
                this.afficheTexte(pk1.getNom() + " revien");
                this.pokemon1 = this.dresseur1.getEquipe().getPokemon(this.choixPokemonAChanger);
                pk1 = this.pokemon1;
                this.afficheTexte(pk1.getNom() + " go");
                this.persoChangePokemon(pk1);
            }
            if (this.choixMenuEnnemie == 2 || this.choixMenuEnnemie == 3) {
                if (this.choixMenuEnnemie == 2) {
                    int choixPokemon = (Integer)this.receveur.readObject();
                    this.afficheTexte(this.dresseur2.getNom() + " retire " + pk.getNom());
                    this.pokemon2 = this.dresseur2.getEquipe().getPokemon(choixPokemon);
                    pk = this.pokemon2;
                    this.afficheTexte(this.dresseur2.getNom() + " envoi " + pk.getNom());
                    this.advChangePokemon(pk);
                }
            } else {
                if (this.choixMenuEnnemie == 1) {
                    this.choixCapaciteEnnemie = (Integer)this.receveur.readObject();
                    choixAttaqueEnnemie(pk, pk1);
                }
                if (this.choixMenuEnnemie == 4) {
                    this.verifFuite(pk, fuite);
                }
            }
        } else if (this.choixMenuEnnemie == 2 || this.choixMenuEnnemie == 3) {
                if (this.choixMenuEnnemie == 2) {
                    int choixPokemon = (Integer)this.receveur.readObject();
                    this.afficheTexte(this.dresseur2.getNom() + " retire " + pk.getNom());
                    this.pokemon2 = this.dresseur2.getEquipe().getPokemon(choixPokemon);
                    pk = this.pokemon2;
                    this.afficheTexte(this.dresseur2.getNom() + " envoi " + pk.getNom());
                    this.advChangePokemon(pk);
                }
                if (this.choixMenu == 1) {
                    choixAttaquePerso(pk, pk1);
                } else {
                    this.verifFuite(pk1, fuite);
                }
        } else if (this.choixMenu == 1) {
            if (this.choixMenuEnnemie == 1) {
                this.choixCapaciteEnnemie = (Integer)this.receveur.readObject();
                if (pk1.getVit() > pk.getVit()) {
                    choixAttaquePerso(pk, pk1);
                    if (pk.getPv() > 0) {
                        choixAttaqueEnnemie(pk, pk1);
                    }
                } else {
                    choixAttaqueEnnemie(pk, pk1);
                    if (pk1.getPv() > 0) {
                        choixAttaquePerso(pk, pk1);
                    }
                }
            } else {
                if (pk1.getVit() > pk.getVit()) {
                    choixAttaquePerso(pk, pk1);
                    if (!pk.estKo()) {
                        this.verifFuite(pk, fuite);
                    }
                } else {
                    this.verifFuite(pk, fuite);
                    if (!pk1.estKo()) {
                        choixAttaquePerso(pk, pk1);
                    }
                }
            }
        } else {
            this.choixCapaciteEnnemie = (Integer)this.receveur.readObject();
            if (pk1.getVit() > pk.getVit()) {
                this.verifFuite(pk1, fuite);
                if (!pk.estKo()) {
                    choixAttaqueEnnemie(pk, pk1);
                }
            } else {
                choixAttaqueEnnemie(pk, pk1);
                if (!pk1.estKo()) {
                    this.verifFuite(pk1, fuite);
                }
            }
        }
    }
    
    private void choixAttaquePerso (Pokemon pk, Pokemon pk1) {
        if (!this.EtatEmpecheAttaque(pk1)) {
            if (persoAttaqueAdv(pk1)) {
                this.AttaquePerso(pk1, pk);
            } else if (persoAttaqueLui(pk1)) {
                this.AttaquePerso(pk1, pk1);
            } else if (persoAttaqueTous(pk1)) {
                this.AttaquePerso(pk1, pk);
                this.AttaquePerso(pk1, pk1);
            }
        }
    }
    
    private void choixAttaqueEnnemie (Pokemon pk, Pokemon pk1) {
        if (!this.EtatEmpecheAttaque(pk)) {
            if (ennemieAttaqueAdv(pk)) {
                this.AttaqueEnnemi(pk, pk1);
            } else if (ennemieAttaqueLui(pk)) {
                this.AttaqueEnnemi(pk, pk);
            } else if (ennemieAttaqueTous(pk)) {
                this.AttaqueEnnemi(pk, pk1);
                this.AttaqueEnnemi(pk, pk);
            }
        }
    }
    
    private boolean ennemieAttaqueAdv (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapaciteEnnemie);
        return cap.getPokemonVise().equals(PokemonVise.adversaire) || cap.getPokemonVise().equals(PokemonVise.adversaires);
    }
    
    private boolean ennemieAttaqueLui (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapaciteEnnemie);
        return cap.getPokemonVise().equals(PokemonVise.alie) || cap.getPokemonVise().equals(PokemonVise.equipe) || 
                cap.getPokemonVise().equals(PokemonVise.moi);
    }
    
    private boolean ennemieAttaqueTous (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapaciteEnnemie);
        return cap.getPokemonVise().equals(PokemonVise.tous);
    }
    
    private boolean persoAttaqueAdv (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapacite);
        return cap.getPokemonVise().equals(PokemonVise.adversaire) || cap.getPokemonVise().equals(PokemonVise.adversaires);
    }
    
    private boolean persoAttaqueLui (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapacite);
        return cap.getPokemonVise().equals(PokemonVise.alie) || cap.getPokemonVise().equals(PokemonVise.equipe) || 
                cap.getPokemonVise().equals(PokemonVise.moi);
    }
    
    private boolean persoAttaqueTous (Pokemon pk) {
        Capacite cap = pk.getCap().getCapacite(this.choixCapacite);
        return cap.getPokemonVise().equals(PokemonVise.tous);
    }
    
    private void verifFuite (Pokemon pk, boolean fuite) {
        if (!this.EtatEmpecheAttaque(pk)) {
            if (fuite){ 
                this.afficheTexte(pk.getNom() + " prend la fuite");
            } else {
                this.afficheTexte("fuite impossible");
            }
        }
    }

    private void choixPerso(Dresseur dress, Pokemon pk, Pokemon pk1, Dresseur dress1) {
        while (this.choixCapacite == 0 && this.choixMenu == 0) {
            this.pcsControlleurVue.firePropertyChange("afficherMenuJoueur", null, null);
            this.choixMenu = this.getChoix();
            if (this.choixMenu == 1) {
                this.pcsControlleurVue.firePropertyChange("afficherTechniques", null, null);
                if (this.getChoix() == 0) {
                    this.choixMenu = this.getChoix();
                } else {
                    this.choixCapacite = this.getChoix() - 1;
                    this.envoi.writeObject(new Integer(this.choixMenu));
                    this.envoi.writeObject(new Integer(this.choixCapacite));
                }
            }
            if (this.choixMenu == 2) {
                do {
                    this.pcsControlleurVue.firePropertyChange("changerPokemon", null, null);
                    if (this.getChoix() == 0) {
                        this.choixPokemonAChanger = 0;
                        this.choixMenu = this.getChoix();
                    } else if (this.getChoix() < 0 || this.getChoix() > dress.getEquipe().getNbPokemon()) {
                        this.choixPokemonAChanger = -1;
                    } else {
                        int choixPokemon = this.getChoix() -1;
                        do {
                            this.pcsControlleurVue.firePropertyChange("afficherAction", null, null);
                            if (this.choix == 1) {
                                this.choixPokemonAChanger = -1;
                                Pokemon pkStock = this.pokemon1;
                                this.pokemon1 = dress.getEquipe().getPokemon(choixPokemon);
                                do {
                                    this.pcsControlleurVue.firePropertyChange("afficherPokemon", null, null);
                                } while (this.choix == -1);
                                this.pokemon1 = pkStock;
                            } else if (this.choix == 2) {
                                if (dress.getEquipe().getPokemon(choixPokemon).equals(pk)) {
                                    this.afficheTexte("ce pokemon est déja au combat");
                                    this.choixPokemonAChanger = -1;
                                } else if (dress.getEquipe().getPokemon(choixPokemon).estKo()) {
                                    this.afficheTexte("ce pokemon ne peut plus combattre");
                                    this.choixPokemonAChanger = -1;
                                } else {
                                    this.choixPokemonAChanger = choixPokemon;
                                    this.envoi.writeObject(new Integer(this.choixMenu));
                                    this.envoi.writeObject(new Integer(this.choixPokemonAChanger));
                                }
                            }
                        } while (this.getChoix() == 1);
                    }
                } while (this.choixPokemonAChanger == -1);
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
            }
            if (this.choixMenu == 3) {
                Vues.createVue(dress.getSac());
                dress.getSac().afficheSac();
                Objet obj = dress.getSac().getObjetFromSac();
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
                if (obj != null) {
                    this.utiliseObjet(dress, obj, pk1, dress1);
                } else {
                    this.choixMenu = 0;
                }
            }
            if (this.choixMenu == 4) {
                this.envoi.writeObject(new Integer(this.choixMenu));
            }
            if (this.choixMenu == 5) {
                Vues.createVue(dress.getPokedex());
                dress.getPokedex().pokedexCombat(pk1);
                this.choixMenu = 0;
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
            } 
        }
    }

    private void TerrainAffectePokemon(Pokemon pk) {
        if (this.terrain.affaibliPokemon(pk)) {
            this.afficheTexte(pk.getNom() + " est affaibli par le terrain");
            pk.estDiminuerParTerrain();
        } else {
            if (this.terrain.renforcePokemon(pk)) {
                this.afficheTexte("le terrain renforce " + pk.getNom());
                pk.estAugmenterParTerrain();
            }
        }
    }

    private void utiliseObjet(Dresseur dress, Objet obj, Pokemon pk, Dresseur dress1) {
        if (obj != null) {
            this.afficheTexte(dress.getNom() + " utilise " + obj.getNom());
            if (obj.getType() == Type_objet.ball) {
                if (dress1 == null) {
                    this.afficheTexte("vous avez capturer " + pk.getNom());
                    dress.capturerPokemon(pk);
                    this.capture = true;
                } else {
                    this.afficheTexte("vous ne pouvez pas capturer le pokemon d'un autre dresseur");
                }
                dress.getSac().getObjet(obj).utilObjet();
            }
            dress.getEquipe().getPokemon().utilObjet(obj);
        } else {
            this.choixMenu = 0;
        }
    }

    private Pokemon choixPokemonPerso(Dresseur dress) {
        if (dress.aPokemon()) {
            if (dress.getEquipe().getNbPokemonApte() == 1) {
                return dress.getEquipe().getPokemon();
            } else {
                do {
                    this.pcsControlleurVue.firePropertyChange("changerPokemon", null, null);
                    if (!(this.getChoix() <= 0 || this.getChoix() > dress.getEquipe().getNbPokemon())) {
                        if (dress.getEquipe().getPokemon(this.getChoix() -1).estKo()) {
                            this.afficheTexte("ce pokemon ne peut plus combattre");
                            this.choix = 0;
                        }
                    }
                } while (this.getChoix() <= 0 || this.getChoix() > dress.getEquipe().getNbPokemon());
                this.pcsControlleurVue.firePropertyChange("afficherTerrainCombat", null, null);
                return dress.getEquipe().getPokemon(this.getChoix() -1);
            }
        }
        return null;
    }

    private double arrondiDegat(Pokemon pk, double degat, Attribut attribut) {
        if (degat < 1) {
            if (attribut.equals(Attribut.physique)) {
                if (degat <= (-pk.getDef())) {
                    degat = 0;
                } else {
                    degat = 1;
                }
            } else if (attribut.equals(Attribut.spéciale)) {
                if (degat <= (-pk.getDefSpe())) {
                    degat = 0;
                } else {
                    degat = 1;
                }
            } else {
                if (degat <= (-pk.getDef())) {
                    degat = 0;
                } else {
                    degat = 1;
                }
            }
        }
        return degat;
    }

    private int attaqueReussiPerso(Pokemon attaquant, Pokemon attaquer, Capacite cap) {
        this.afficheTexte(attaquant.getNom() + " utilise " + cap.getNom() + " sur " + attaquer.getNom() + " ennemie");
        cap.setNbUtilise(cap.getNbUtilise() + 1);
        cap.setPp(cap.getPp() - 1);
        return this.attaqueReussi(attaquant, attaquer, cap);
    }

    private int attaqueReussiEnnemie(Pokemon attaquant, Pokemon attaquer, Capacite cap) {
        this.afficheTexte(attaquant.getNom() + " enemie utilise " + cap.getNom() + " sur " + attaquer.getNom());
        cap.setPp(cap.getPp() - 1);
        return this.attaqueReussi(attaquant, attaquer, cap);
    }

    private int attaqueReussi(Pokemon attaquant, Pokemon attaquer, Capacite cap) {
        // cette fonction permet a l'ennemi d'attaquer un de vos perso
        if (cap.getPrec() == 0) {
            return 0;
        }
        int aleaRate;
        double agil;
        int aleaEsq;
        aleaRate = (int) (Math.random() * 2 + 1);
        if (aleaRate > attaquant.getPrec()) {
            this.afficheTexte(this.textes.rateAttaque(attaquant.getNom()));
            return -1;
        }
        agil = (attaquer.getEsq() - (2 * attaquant.getPrec()));
        if (agil > 0) {
            aleaEsq = (int) (Math.random() * 30 + 1);
            if (aleaEsq >= 1 && aleaEsq <= agil) {
                this.afficheTexte(this.textes.esquiveAttaque(attaquer.getNom()));
                return -1;
            }
        }
        return 0;
    }

    private boolean verifieKO(Pokemon pk) {
        if (pk.estKo()) {
            this.afficheTexte(this.textes.estKO(pk.getNom()));
            return true;
        }
        return false;
    }
    
    private void affichePv (Pokemon pk) {
        this.pcsControlleurVue.firePropertyChange("afficherPvPokemon", null, null);
        this.pcsControlleurVue.firePropertyChange("afficherPvPokemonAdv", null, null);
    }
    
    public double degatAtt(Pokemon attaquant, Pokemon attaquer, Capacite cap) {
        double degat;
        double forceCap = this.getForceCapTerrain(cap);
        int pourcentageAtt = this.getForceTypeCap(attaquant, cap);
        int pourcentageDef = this.getDefTypeCap(attaquer, cap);
        if (cap.getClasse() == Attribut.physique) {
            degat = (((attaquant.getAtt() + (attaquant.getAtt() * ((forceCap  + ((forceCap * pourcentageAtt) / 100 ))/ 100))) * 
                    this.getForceEtFaiblesse(attaquer, cap)) - (attaquer.getDef() + ((attaquer.getDef() * pourcentageDef)/100)));
            degat = this.arrondiDegat(attaquer, degat, Attribut.physique);
        } else {
            if (cap.getClasse() == Attribut.spéciale) {
                degat = (((attaquant.getAttSpe() + (attaquant.getAttSpe() * ((forceCap  + ((forceCap * pourcentageAtt) / 100 ))/ 100))) * 
                        this.getForceEtFaiblesse(attaquer, cap)) - (attaquer.getDefSpe() + ((attaquer.getDefSpe() * pourcentageDef)/100)));
                degat = this.arrondiDegat(attaquer, degat, Attribut.spéciale);
            } else {
                degat = -attaquer.getDef();
                degat = this.arrondiDegat(attaquer, degat, Attribut.physique);
            }
        }
        return degat;
    }
    
    private double getForceCapTerrain (Capacite cap) {
        double forceCap;
        if (this.terrain.affaibliAttaque(cap)) {
            this.afficheTexte(cap.getNom() + " est affaiblie par le terrain");
            forceCap = cap.getForce() - 5;
        } else {
            if (this.terrain.renforceAttque(cap)) {
                this.afficheTexte(cap.getNom() + " est renforcer par le terrain");
                forceCap = cap.getForce() + 5;
            } else {
                forceCap = cap.getForce();
            }
        }
        return forceCap;
    }
    
    private int getForceTypeCap (Pokemon pk, Capacite cap) {
        int pourcentage = 0; 
        if (pk.getType2() == null) {
            if (pk.getType1().equals(cap.getType())) {
                pourcentage = 5;
            }
        } else {
            if (pk.getType1().equals(cap.getType()) || pk.getType2().equals(cap.getType())) {
                pourcentage = 5;
            }
        }
        pourcentage = pourcentage + (((pk.getTypeExp().getNiveauAttParType(cap.getType())) -1) * 5);
        return pourcentage;
    }
    
    private int getDefTypeCap (Pokemon pk, Capacite cap) {
        return (((pk.getTypeExp().getNiveauDefParType(cap.getType())) -1) * 5);
    }
    
    private void verifAttaqueEnnemie (Pokemon attaquant, Pokemon attaquer, Capacite cap, PokemonVise pkmnVise) {
        if (this.attaqueReussiEnnemie(attaquant, attaquer, cap) == 0) {
            this.verifAttaque(attaquant, attaquer, cap, pkmnVise, true, false);
        }
    }
    
    private void verifAttaquePerso (Pokemon attaquant, Pokemon attaquer, Capacite cap, PokemonVise pkmnVise) {
        if (this.attaqueReussiPerso(attaquant, attaquer, cap) == 0) {
            this.verifAttaque(attaquant, attaquer, cap, pkmnVise, false, true);
        }
    }
    
    private void verifAttaque(Pokemon attaquant, Pokemon attaquer, Capacite cap, PokemonVise pkmnVise, boolean attaquantEnnemie, boolean attaquerEnnemie) {
        double degat;
        String libelleAttaquant;
        String libelleAttaquer;
        if (attaquantEnnemie) {
            libelleAttaquant = "ennemie";
        } else {
            libelleAttaquant = "";
        }
        if (attaquerEnnemie) {
            libelleAttaquer = "ennemie";
        } else {
            libelleAttaquer = "";
        }
        if (cap instanceof CapaciteContreCoup) {
            CapaciteContreCoup capaciteContreCoup = (CapaciteContreCoup) cap;
            attaquant.utiliseCap(capaciteContreCoup);
            degat = this.degatAtt(attaquant, attaquer, capaciteContreCoup);
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteContreCoup);
            }
            this.affichePv(attaquer);
            this.afficheTexte(attaquant.getNom() + " " + libelleAttaquant + " se blesse en frappant");
            attaquant.recoitDegat(capaciteContreCoup.degatContreCoup(attaquant));
            this.affichePv(attaquant);
        } else if (cap instanceof CapaciteEtat) {
            CapaciteEtat capaciteEtat = (CapaciteEtat) cap;
            attaquant.utiliseCap(capaciteEtat);
            degat = this.degatAtt(attaquant, attaquer, capaciteEtat);
            attaquer.recoitDegat(degat);
            this.affichePv(attaquer);
            attaquer.recoitCap(cap);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteEtat);
            }
            if (!attaquer.estKo() && capaciteEtat.affecte()) {
                attaquer.setEtat(capaciteEtat.getEtat());
                this.afficheTexte(attaquer.getNom() + " " + libelleAttaquer + " " + capaciteEtat.getEtat().toString());
            }
        } else if (cap instanceof CapaciteFixe) {
            CapaciteFixe capaciteFixe = (CapaciteFixe) cap;
            attaquant.utiliseCap(capaciteFixe);
            degat = capaciteFixe.getForce();
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteFixe);
            }
            this.affichePv(attaquer);
        } else if (cap instanceof CapaciteMort) {
            CapaciteMort capaciteMort = (CapaciteMort) cap;
            attaquant.utiliseCap(capaciteMort);
            degat = capaciteMort.getDegat(attaquer);
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteMort);
            }
            this.affichePv(attaquer);
        } else if (cap instanceof CapaciteMultiple) {
            CapaciteMultiple capaciteMultiple = (CapaciteMultiple) cap;
            attaquant.utiliseCap(capaciteMultiple);
            if (capaciteMultiple.parTour()) {

            } else {
                int nbCoup = capaciteMultiple.getNbCoup();
                int indice = 0;
                while (indice < nbCoup && !attaquer.estKo()) {
                    degat = this.degatAtt(attaquant, attaquer, capaciteMultiple);
                    attaquer.recoitDegat(degat);
                    this.afficheTexte("touché " + (indice+1) + " fois");
                    this.affichePv(attaquer);
                    indice++;
                }
            }
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteMultiple);
            }
        } else if (cap instanceof CapaciteSimple) {
            attaquant.utiliseCap(cap);
            degat = this.degatAtt(attaquant, attaquer, cap);
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(cap);
            }
            this.affichePv(attaquer);
        } else if (cap instanceof CapaciteSoin) {
            CapaciteSoin capaciteSoin = (CapaciteSoin) cap;
            attaquant.utiliseCap(capaciteSoin);
            attaquer.soin(capaciteSoin);
            attaquer.recoitCap(capaciteSoin);
            this.affichePv(attaquer);
        } else if (cap instanceof CapaciteStat) {
            CapaciteStat capaciteStat = (CapaciteStat) cap;
            attaquant.utiliseCap(capaciteStat);
            degat = this.degatAtt(attaquant, attaquer, capaciteStat);
            attaquer.recoitDegat(degat);
            if (!attaquer.estKo()) {
                attaquer.recoitCap(capaciteStat);
            }
            this.affichePv(attaquer);
            int nb = capaciteStat.lenght();
            if (capaciteStat.reussi()) {
                for (int i = 0 ; i<nb ; i++) {
                    if (capaciteStat.aAttribut(i)) {
                        int pourcentage = capaciteStat.getPourCent(i);
                        if (capaciteStat.getAugmente(i)) {
                            if (capaciteStat.getSurSoi(i)) {
                                if (attaquant.augmenteStat(capaciteStat.getAttribut(i), pourcentage)) {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquant.getNom() + " " + 
                                            libelleAttaquant + " augmente");
                                } else {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquant.getNom() + " " + 
                                            libelleAttaquant + " n'iras pas plus haut");
                                }
                            } else {
                                if (attaquer.augmenteStat(capaciteStat.getAttribut(i), pourcentage)) {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquer.getNom() + " " + 
                                            libelleAttaquer + " augmente");
                                } else {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquer.getNom() + " " + 
                                            libelleAttaquer + " n'iras pas plus haut");
                                }
                            }
                        } else {
                            if (capaciteStat.getSurSoi(i)) {
                                if (attaquant.diminueStat(capaciteStat.getAttribut(i), pourcentage)) {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquant.getNom() + " " + 
                                            libelleAttaquant + " diminue");
                                } else {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquant.getNom() + " " + 
                                            libelleAttaquant + " n'iras pas plus bas");
                                }
                            } else {
                                if (attaquer.diminueStat(capaciteStat.getAttribut(i), pourcentage)) {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquer.getNom() + " " + 
                                            libelleAttaquer + " diminue");
                                } else {
                                    this.afficheTexte("Ah! " + capaciteStat.getAttribut(i).toString() + " de " + attaquer.getNom() + " " + 
                                            libelleAttaquer + " n'iras pas plus bas");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void persoChangePokemonKO (Pokemon pk) {
        if (pk != null) {
            this.afficheTexte("Vous envoyez " + pk.getNom());
            this.persoChangePokemon(pk);
        }
    }
    
    private void persoChangePokemon (Pokemon pk) {
        if (pk != null) {
            this.pokemon1 = pk;
            this.pcsControlleurVue.firePropertyChange("afficherVuePokemon", null, null);
            this.TerrainAffectePokemon(pk);
        }
    }
    
    private void advChangePokemon (Pokemon pk) {
        if (pk != null) {
            this.pokemon2 = pk;
            this.pcsControlleurVue.firePropertyChange("afficherVuePokemonAdv", null, null);
            this.TerrainAffectePokemon(pk);
        }
    }
    
    private void utilseSur (Pokemon attaquant, Pokemon attaquer, Capacite cap, PokemonVise pkmnVise) {
        this.afficheTexte(attaquant.getNom() + " utilise " + cap.getNom() + " sur " + attaquer.getNom());
        switch(pkmnVise) {
            case adversaire:
                break;
        }
        
    }
    
    private boolean EtatEmpecheAttaque (Pokemon pk) {
        int alea;
        switch (pk.getEtat()) {
            case folie :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.folie.name());
                    pk.setEtat(Etat.aucun);
                    return false;
                } else {
                    alea = (int) (Math.random() * 100 + 1);
                    if (alea > 50) {
                        return false;
                    } else {
                        this.afficheTexte("sa folie lui inflige des dégât");
                        pk.recoitDegat((pk.getPvi() * 5) / 100);
                        this.affichePv(pk);
                        return true;
                    }
                }
            case gel :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.gel.name());
                    pk.setEtat(Etat.aucun);
                    return false;
                } else {
                    this.afficheTexte(pk.getNom() + " est gelé");
                    return true;
                }
            case paralise :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.paralise.name());
                    pk.setEtat(Etat.aucun);
                    return false;
                } else {
                    this.afficheTexte(pk.getNom() + " est paralisé");
                    return true;
                }
            case peur :
                this.afficheTexte(pk.getNom() + " est appeuré");
                return true;
            case someil :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.someil.name());
                    pk.setEtat(Etat.aucun);
                    return false;
                } else {
                    this.afficheTexte(pk.getNom() + " dort");
                    return true;
                }
            default :
                break;
        }
        return false;
    }
    
    private void EtatEnlevePv (Pokemon pk) {
        int alea;
        switch (pk.getEtat()) {
            case brulure :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.brulure.name());
                    pk.setEtat(Etat.aucun);
                } else {
                    this.afficheTexte(pk.getNom() + " est brulé");
                    pk.recoitDegat((pk.getPvi() * 5) / 100);
                    this.affichePv(pk);
                }
                break;
            case poison :
                alea = (int) (Math.random() * 100 + 1);
                if (alea > 50) {
                    this.afficheTexte(pk.getNom() + " est soigne de " + Etat.poison.name());
                    pk.setEtat(Etat.aucun);
                } else {
                    this.afficheTexte(pk.getNom() + " souffre du poison");
                    pk.recoitDegat((pk.getPvi() * 5) / 100);
                    this.affichePv(pk);
                }
                break;
            case peur :
                pk.setEtat(Etat.aucun);
                break;
            default :
                break;
        }
    }
    
    // cette fonction permet de savoir lequel de vos personnage l'ennemi va attaquer

    private void AttaqueEnnemi(Pokemon attaquant, Pokemon attaquer) {
        Capacite cap = attaquant.getCap().getCapacite(this.choixCapaciteEnnemie);
        this.verifAttaqueEnnemie(attaquant, attaquer, cap, cap.getPokemonVise());
    }

    private void AttaquePerso(Pokemon attaquant, Pokemon attaquer) {
        Capacite cap = attaquant.getCap().getCapacite(this.choixCapacite);
        this.verifAttaquePerso(attaquant, attaquer, cap, cap.getPokemonVise());
    }

    private void Exp(Pokemon pk1, Pokemon pk2, Dresseur dress) {
        int exp;
        if (dress == null) {
            exp = pk2.getExpNivSuiv() / 5;
        } else {
            if (dress instanceof Maitre) {
                exp = pk2.getExpNivSuiv() * 2;
            } else {
                if (dress instanceof Rival) {
                    exp = (int) (pk2.getExpNivSuiv() * 1.5);
                } else {
                    if (dress instanceof Conseil4) {
                        exp = pk2.getExpNivSuiv();
                    } else {
                        if (dress instanceof ChampionArene) {
                            exp = (int) (pk2.getExpNivSuiv() / 1.5);
                        } else {
                            if (dress instanceof Topdresseur) {
                                exp = pk2.getExpNivSuiv() / 2;
                            } else {
                                exp = pk2.getExpNivSuiv() / 3;
                            }
                        }
                    }
                }
            }
        }
        this.afficheTexte(pk1.getNom() + " gagne " + exp + " points d'exp");
        pk1.setExp(pk1.getExp() + exp);
        while (pk1.getExp() >= pk1.getExpNivSuiv()) {
            exp = pk1.getExp() - pk1.getExpNivSuiv();
            this.afficheTexte(pk1.getNom() + "monte de niveau");
            pk1.nivSuiv();
            pk1.setExp(exp);
        }
    }

    private void amour(Pokemon pk, Pokemon pk1, Dresseur dress) {
        if (dress instanceof Maitre) {
            if (pk1.getNom().equals("Mewtwo")) {
                pk.setAmour(pk.getAmour() + 7);
            } else {
                pk.setAmour(pk.getAmour() + 5);
            }
        } else {
            if (dress instanceof Rival) {
                if (pk1.getNom().equals("Mewtwo")) {
                    pk.setAmour(pk.getAmour() + 6);
                } else {
                    pk.setAmour(pk.getAmour() + 4);
                }
            } else {
                if (dress instanceof Conseil4) {
                    if (pk1.getNom().equals("Mewtwo")) {
                        pk.setAmour(pk.getAmour() + 5);
                    } else {
                        pk.setAmour(pk.getAmour() + 3);
                    }
                } else {
                    if (dress instanceof ChampionArene) {
                        if (pk1.getNom().equals("Mewtwo")) {
                            pk.setAmour(pk.getAmour() + 4);
                        } else {
                            pk.setAmour(pk.getAmour() + 2);
                        }
                    } else {
                        if (dress instanceof Topdresseur) {
                            if (pk1.getNom().equals("Mewtwo")) {
                                pk.setAmour(pk.getAmour() + 3);
                            } else {
                                pk.setAmour(pk.getAmour() + 1);
                            }
                        } else {
                            pk.setAmour(pk.getAmour() + 1);
                        }
                    }
                }
            }
        }
    }

    private void KO(Pokemon pk) {
        pk.setAmour(pk.getAmour() - 1);
    }

    private void Argent(Dresseur dress1, Dresseur dress2) {
        int monai = dress2.getArgent();
        this.afficheTexte(dress2.Parler());
        this.afficheTexte("vous gagnez " + monai + "$.");
        dress1.setArgent(dress1.getArgent() + monai);
    }

    private double getForceEtFaiblesse(Pokemon pk, Capacite cap) {
        if (pk.estInefficace(cap.getType())) {
            this.afficheTexte("ça n'affecte pas " + pk.getNom());
            return 0;
        } else {
            if (pk.estTresFort(cap.getType())) {
                this.afficheTexte("ce n'est pas très efficace");
                return 0.25;
            } else {
                if (pk.estTresFaible(cap.getType())) {
                    this.afficheTexte("c'est super efficace");
                    return 4;
                } else {
                    if (pk.estFort(cap.getType())) {
                        this.afficheTexte("ce n'est pas très efficace");
                        return 0.5;
                    } else {
                        if (pk.estFaible(cap.getType())) {
                            this.afficheTexte("c'est super efficace");
                            return 2;
                        } else {
                            return 1;
                        }
                    }
                }
            }
        }
    }
    
    private void defaite () {
        for (int i = 0 ; i < this.dresseur1.getEquipe().lenght() ; i++) {
            if (this.dresseur1.getEquipe().aPokemon(i)) {
                this.dresseur1.getEquipe().getPokemon(i).setAmour(this.dresseur1.getEquipe().getPokemon(i).getAmour() - 5);
            }
        }
    }
    
    private Objet getObjetFromSac (int choixSac, int choixObjet) {
        Sac sac = this.dresseur1.getSac();
        switch (choixSac) {
            case (1):
                return sac.getObjets_divers().getObjet(choixObjet);
            case (2):
                return sac.getObjets_medicament().getObjet(choixObjet);
            case (3):
                return sac.getObjets_ball().getObjet(choixObjet);
            case (4):
                return sac.getObjets_capacite().getObjet(choixObjet);
            case (5):
                return sac.getObjets_baie().getObjet(choixObjet);
            case (6):
                return sac.getObjets_lettre().getObjet(choixObjet);
            case (7):
                return sac.getObjets_combat().getObjet(choixObjet);
            case (8):
                return sac.getObjets_rare().getObjet(choixObjet);
        }
        return null;
    }*/
    
}

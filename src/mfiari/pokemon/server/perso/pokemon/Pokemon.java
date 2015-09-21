/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.perso.pokemon;

import mfiari.pokemon.core.capacite.Attributs;
import mfiari.pokemon.core.capacite.Etat;
import mfiari.pokemon.core.capacite.CapaciteSpe;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import mfiari.lib.game.liste.ListeDEndroit;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Sexe;
import mfiari.lib.game.personnage.Stat;
import mfiari.pokemon.server.liste.ListeDeCapacite;
import mfiari.pokemon.core.perso.Nature;
import mfiari.pokemon.core.stat.EffortValue;
import mfiari.pokemon.core.stat.IndividualValue;
import mfiari.pokemon.core.type.Forme;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.server.type.TypeExp;
import mfiari.pokemon.server.ville.Endroit;
import mfiari.pokemon.core.ville.Environnement;
import mfiari.pokemon.server.capacite.AttributsExp;
import mfiari.pokemon.server.capacite.Capacite;
import mfiari.pokemon.server.capacite.CapaciteSoin;

/**
 *
 * @author mike
 */
public abstract class Pokemon  implements Serializable {
    
    private static final long serialVersionUID = 354054054061L;

    private String nom;
    private String surnom;
    private int numero;
    private Type type1;
    private Type type2;
    private final double taille;
    private final double poids;
    private final String typePokemon;
    private final String description;
    private double pourcentageMale;
    private Sexe sexe;
    private String doNomDresseur;
    private int numeroID;
    private Etat etat;
    private int niveau;
    private int exp;
    private int expBase;
    private Objet objetEquipe;
    private double pv;
    private double att;
    private double def;
    private double attSpe;
    private double defSpe;
    private double vit;
    private double esq;
    private double prec;
    private double tauxCoupCritique;
    private int amour;
    private final double pvBase;
    private final double attBase;
    private final double defBase;
    private final double attSpeBase;
    private final double defSpeBase;
    private final double vitBase;
    private final double esqBase;
    private final double precBase;
    private double tauxCoupCritiqueInitial;
    private CapaciteSpe[] availableCapSpe;
    private CapaciteSpe capSpe;
    private final ListeDeCapacite cap;
    private Map<Integer, Capacite> capacite;
    private ListeDEndroit<Endroit> endroits;
    private Capacite capLaPlusPuissante;
    private Capacite capaciteEvolution;
    private final TypeExp typeExp;
    private final AttributsExp attributsExp;
    private final IndividualValue individualValue;
    private final EffortValue effortValue;
    private Map<Capacite, Boolean> cap_apte;
    private int nbRuban;
    private int tauxCapture;
    private Nature nature;
    private final int nbPasAvantEclosion;
    private Forme forme;
    private final Stat.CourbeExperience courbeExperience;
    
    public Pokemon(String nom, int numero, Type type1, Type type2, double taille, double poids, double pourcentageMale, 
            int nbPasAvantEclosion, String typePokemon, int pv, int att, int def, int attSpe, int defSpe, int vit, int esq, int prec, 
            int expBase, Capacite cap, String description, int tauxCapture, Stat.CourbeExperience courbeExperience) {

        this.nom = nom;
        this.surnom = null;
        this.sexe = Sexe.male;
        this.numero = numero;
        this.nbRuban=0;
        this.type1 = type1;
        this.type2 = type2;
        this.taille = taille;
        this.poids = poids;
        this.typePokemon = typePokemon;
        this.description = description;
        this.pourcentageMale = pourcentageMale;
        this.doNomDresseur = "";
        this.numeroID = 0;
        this.etat = Etat.aucun;
        this.niveau = 1;
        this.objetEquipe = null;
        this.pvBase = pv;
        this.attBase = att;
        this.defBase = def;
        this.attSpeBase = attSpe;
        this.defSpeBase = defSpe;
        this.vitBase = vit;
        this.esqBase = esq;
        this.precBase = prec;
        this.expBase = expBase;
        this.tauxCoupCritique = 1;
        this.amour = 120;
        this.tauxCoupCritiqueInitial = 1;
        this.cap = new ListeDeCapacite();
        this.capacite = new TreeMap<>();
        this.capLaPlusPuissante = cap;
        this.typeExp = new TypeExp();
        this.attributsExp = new AttributsExp();
        this.individualValue = new IndividualValue();
        this.effortValue = new EffortValue();
        this.cap_apte = new TreeMap<>();
        this.nbRuban = 0;
        this.endroits = new ListeDEndroit<>();
        this.tauxCapture = tauxCapture;
        this.nature = Nature.docile;
        this.nbPasAvantEclosion = nbPasAvantEclosion;
        this.forme = Forme.normal;
        this.courbeExperience = courbeExperience;
    }

    public Pokemon (Pokemon pokemon) {
        this.nom = pokemon.nom;
        this.surnom = pokemon.surnom;
        int pourcentage = (int) (Math.random() * 100);
        if (pourcentage < pokemon.pourcentageMale) {
            this.sexe = Sexe.male;
        } else {
            this.sexe = Sexe.femelle;
        }
        this.numero = pokemon.numero;
        this.nbRuban=pokemon.nbRuban;
        this.type1 = pokemon.type1;
        this.type2 = pokemon.type2;
        this.taille = pokemon.taille;
        this.poids = pokemon.poids;
        this.typePokemon = pokemon.typePokemon;
        this.description = pokemon.description;
        this.pourcentageMale = pokemon.pourcentageMale;
        this.doNomDresseur = pokemon.doNomDresseur;
        this.numeroID = pokemon.numeroID;
        this.etat = pokemon.etat;
        this.niveau = pokemon.niveau;
        this.exp = pokemon.exp;
        this.objetEquipe = pokemon.objetEquipe;
        this.pv = pokemon.pv;
        this.att = pokemon.att;
        this.def = pokemon.def;
        this.attSpe = pokemon.attSpe;
        this.defSpe = pokemon.defSpe;
        this.vit = pokemon.vit;
        this.esq = pokemon.esq;
        this.prec = pokemon.prec;
        this.amour = pokemon.amour;
        this.pvBase = pokemon.pvBase;
        this.attBase = pokemon.attBase;
        this.defBase = pokemon.defBase;
        this.attSpeBase = pokemon.attSpeBase;
        this.defSpeBase = pokemon.defSpeBase;
        this.vitBase = pokemon.vitBase;
        this.esqBase = pokemon.esqBase;
        this.precBase = pokemon.precBase;
        this.expBase = pokemon.expBase;
        this.capSpe = pokemon.capSpe;
        this.cap = new ListeDeCapacite(pokemon.cap);
        this.capLaPlusPuissante = pokemon.capLaPlusPuissante;
        this.capacite = pokemon.capacite;
        this.attributsExp = new AttributsExp(pokemon.attributsExp);
        this.typeExp = new TypeExp(pokemon.typeExp);
        this.individualValue = new IndividualValue();
        this.effortValue = new EffortValue();
        this.cap_apte = pokemon.cap_apte;
        this.endroits = pokemon.endroits;
        this.tauxCapture = pokemon.tauxCapture;
        int pourcentageNature = (int) (Math.random() * Nature.values().length);
        this.nature = Nature.values()[pourcentageNature];
        this.nbPasAvantEclosion = pokemon.nbPasAvantEclosion;
        int random = (int) (Math.random() * 8192 +1);
        if (random == 1) {
            this.forme = Forme.mini;
        } else if (random == 4096) {
            this.forme = Forme.geant;
        } else if (random == 8192) {
            this.forme = Forme.shiney;
        } else {
            this.forme = Forme.normal;
        }
        this.courbeExperience = pokemon.courbeExperience;
        if (this.capSpe == null) {
            if (this.availableCapSpe != null) {
                if (this.availableCapSpe.length == 1) {
                    this.capSpe = this.availableCapSpe[0];
                } else {
                    random = (int) (Math.random() * this.availableCapSpe.length);
                    this.capSpe = this.availableCapSpe[random];
                }
            }
        }
    }

    public int getTauxCapture() {
        return this.tauxCapture;
    }

    public void setTauxCapture(int tauxCapture) {
        this.tauxCapture = tauxCapture;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
        this.exp = this.courbeExperience.calcule(niveau);
    }
    
    public boolean hasSexe () {
        return this.pourcentageMale < 100 && this.pourcentageMale > 0;
    }

    public double getPourcentageMale() {
        return pourcentageMale;
    }

    public void setPourcentageMale(int pourcentageMale) {
        this.pourcentageMale = pourcentageMale;
    }

    public void changeNiveau(int niveau) {
        this.niveau = niveau;
        this.exp = this.courbeExperience.calcule(niveau);
        this.setAmour(this.amour);
        int niv = niveau;
        int i=0;
        int nbCap = 0;
        while (niv > 0) {
            if(this.capacite.get(niv) != null) {
                if (nbCap < 6) {
                    if (cap.nbCapacite() < 6) {
                        this.cap.ajoutCapacite(this.capacite.get(niv));
                    } else {
                        this.cap.remplaceCapacite(this.capacite.get(niv), i);
                        i++;
                    }
                    nbCap++;
                }
                this.cap.ajoutListeCapacite(this.capacite.get(niv));
            }
            niv--;
        }
    }
    
    public void nivSuiv () {
        double previousPvMax = this.getPvMax();
        this.niveau++;
        this.pv += this.getPvMax() - previousPvMax;
        this.exp = this.getExpNivPrec();
        this.setAmour(this.amour);
    }
    
    public boolean apprendCapacite (int niveau) {
        return this.capacite.get(niveau) != null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public Type getType1() {
        return type1;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public Type getType2() {
        return type2;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }
    
    public String getTypePokemon () {
        return this.typePokemon;
    }
    
    public double getTaille () {
        return this.taille;
    }
    
    public double getPoids () {
        return this.poids;
    }
    
    public String getDescription () {
        return this.description;
    }

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public int getNbPasAvantEclosion() {
        return nbPasAvantEclosion;
    }

    public boolean isShiney() {
        return this.forme == Forme.shiney;
    }

    public boolean isMini() {
        return this.forme == Forme.mini;
    }

    public boolean isGeant() {
        return this.forme == Forme.geant;
    }
    
    public Forme getForme () {
        return this.forme;
    }

    public void setForme(Forme forme) {
        this.forme = forme;
    }

    public double getPv() {
        return this.pv;
    }
    
    public void mettreKO () {
        this.pv = 0;
    }

    public double getPvMax() {
        return Math.ceil((this.individualValue.getPv() + 2 * this.pvBase + Math.ceil((float)this.effortValue.getPv()/4)) * ((float)this.niveau/100) + 10 + this.niveau);
    }
    
    public int getAmour() {
        return amour;
    }

    public void setAmour(int amour) {
        if (amour < 0) {
            amour = 0;
        }
        if (amour > 1000) {
            amour = 1000;
        }
        if (this.amour == 0) {
            this.alterStat(-20);
        } else if (this.amour > 0 && this.amour < 50) {
            this.alterStat(-10);
        } else if (this.amour >= 50 && this.amour < 100) {
            this.alterStat(-5);
        } else if (this.amour >= 100 && this.amour < 150) {
            this.alterStat(0);
        } else if (this.amour >= 150 && this.amour < 300) {
            this.alterStat(5);
        } else if (this.amour >= 300 && this.amour < 500) {
            this.alterStat(10);
        } else if (this.amour >= 500 && this.amour < 800) {
            this.alterStat(15);
        } else {
            this.alterStat(20);
        }
        this.amour = amour;
    }
    
    private void alterStat (int pourcentage) {
        this.att = this.att + (this.att * (pourcentage / 100));
        this.def = this.def + (this.def * (pourcentage / 100));
        this.attSpe = this.attSpe + (this.attSpe * (pourcentage / 100));
        this.defSpe = this.defSpe + (this.defSpe * (pourcentage / 100));
        this.vit = this.vit + (this.vit * (pourcentage / 100));
        this.esq = this.esq + (this.esq * (pourcentage / 100));
        this.prec = this.prec + (this.prec * (pourcentage / 100));
    }
    
    private double getBonusAttribut (double valeur, Attributs att) {
        if (att == Attributs.esq) {
            return valeur;
        } else if (att == Attributs.prec) {
            return valeur;
        } else {
            double value = Math.ceil(Math.ceil((this.individualValue.get(att) + 2 * valeur + Math.ceil((float)this.effortValue.get(att)/4)) * ((float)this.niveau/100) +5) * 
                    (1+((float)this.nature.getBonus(att)/100)-((float)this.nature.getMalus(att)/100)));
            value = value * (1 + ((float)(((this.attributsExp.getNivAttribut(att) -1 ) * 5))/100));
            value = value * (1 + ((float)(this.forme.alterStat(att))/100));
            return value;
        }
    }

    public double getAtt() {
        return this.att;
    }

    public void setAtt(double att) {
        this.att = att;
    }

    public double getAttInitial() {
        return this.getBonusAttribut(this.attBase, Attributs.att);
    }

    public double getAttSpe() {
        return this.attSpe;
    }

    public void setAttSpe(double attSpe) {
        this.attSpe = attSpe;
    }

    public double getAttSpeInitial() {
        return this.getBonusAttribut(this.attSpeBase, Attributs.attSpe);
    }

    public double getDef() {
        return this.def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getDefInitial() {
        return this.getBonusAttribut(this.defBase, Attributs.def);
    }

    public double getDefSpe() {
        return this.defSpe;
    }

    public void setDefSpe(double defSpe) {
        this.defSpe = defSpe;
    }

    public double getDefSpeInitial() {
        return this.getBonusAttribut(this.defSpeBase, Attributs.defSpe);
    }

    public double getEsq() {
        return this.esq;
    }

    public void setEsq(double esq) {
        this.esq = esq;
    }

    public double getEsqInitial() {
        return this.getBonusAttribut(this.esqBase, Attributs.esq);
    }

    public double getPrec() {
        return this.prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public double getPrecInitial() {
        return this.getBonusAttribut(this.precBase, Attributs.prec);
    }

    public double getVit() {
        return this.vit;
    }

    public void setVit(double vit) {
        this.vit = vit;
    }

    public double getVitInitial() {
        return this.getBonusAttribut(this.vitBase, Attributs.vit);
    }
    
    public IndividualValue getIndividualValue () {
        return this.individualValue;
    }
    
    public EffortValue getEffortValue () {
        return this.effortValue;
    }

    public ListeDeCapacite getCap() {
        return cap;
    }

    public Capacite getCapLaPlusPuissante() {
        return capLaPlusPuissante;
    }

    public void setCapLaPlusPuissante(Capacite capLaPlusPuissante) {
        this.capLaPlusPuissante = capLaPlusPuissante;
    }

    public Capacite getCapEvolution() {
        return this.capaciteEvolution;
    }

    public void setCapEvolution(Capacite capaciteEvolution) {
        this.capaciteEvolution = capaciteEvolution;
    }
    
    public void initCapSpe (CapaciteSpe... capSpes) {
        this.availableCapSpe = capSpes;
        if (this.availableCapSpe.length == 1) {
            this.capSpe = this.availableCapSpe[0];
        } else {
            int random = (int) (Math.random() * this.availableCapSpe.length);
            this.capSpe = this.availableCapSpe[random];
        }
    }

    public CapaciteSpe getCapSpe() {
        return capSpe;
    }

    public void setCapSpe(CapaciteSpe capSpe) {
        this.capSpe = capSpe;
    }

    public Map<Capacite, Boolean> getCap_apte() {
        return cap_apte;
    }

    public void setCap_apte(Map<Capacite, Boolean> cap_apte) {
        this.cap_apte = cap_apte;
    }

    public String getDoNomDresseur() {
        return doNomDresseur;
    }

    public void setDoNomDresseur(String doNomDresseur) {
        this.doNomDresseur = doNomDresseur;
    }

    public int getExpNivSuiv() {
        return this.courbeExperience.calcule(this.niveau+1);
    }

    public int getExpNivPrec() {
        return this.courbeExperience.calcule(this.niveau);
    }

    public int getNbRuban() {
        return nbRuban;
    }

    public void setNbRuban(int nbRuban) {
        this.nbRuban = nbRuban;
    }
    
    public void setEndroits (ListeDEndroit l) {
        this.endroits = l;
        for (int i = 0; i< this.endroits.hashCode() ; i++) {
            this.endroits.getEndroit(i).ajouterPokemon(this, Environnement.haute_herbe, 0);
        }
    }
    
    public void ajouterEndroits (Endroit e) {
        e.ajouterPokemon(this, Environnement.haute_herbe, 0);
        this.endroits.ajouterEndroit(e);
    }
    
    public void setEndroits (ListeDEndroit l, Environnement environnement, int pourcentage) {
        this.endroits = l;
        for (int i = 0; i< this.endroits.hashCode() ; i++) {
            this.endroits.getEndroit(i).ajouterPokemon(this, environnement, pourcentage);
        }
    }
    
    public void ajouterEndroits (Endroit e, Environnement environnement, int pourcentage) {
        e.ajouterPokemon(this, environnement, pourcentage);
        this.endroits.ajouterEndroit(e);
    }
    
    public ListeDEndroit getEndroits () {
        return this.endroits;
    }

    public Objet getObjetEquipe() {
        return objetEquipe;
    }

    public void setObjetEquipe(Objet objetEquipe) {
        this.objetEquipe = objetEquipe;
    }
    
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    public int getExpBase() {
        return expBase;
    }

    public void setExpBase(int exp) {
        this.expBase = exp;
    }
    
    public double getExpDonner() {
        return this.expBase * ((float)this.niveau / 7);
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }
    
    public Etat getEtat () {
        return this.etat;
    }
    
    public void setEtat (Etat etat) {
        this.etat = etat;
    }

    public Map<Integer, Capacite> getCapacite() {
        return capacite;
    }

    public void setCapacite(Map<Integer, Capacite> capacite) {
        this.capacite = capacite;
    }
    
    public TypeExp getTypeExp () {
        return this.typeExp;
    }
    
    public AttributsExp getAttributsExp () {
        return this.attributsExp;
    }
    
    public void recoitDegat (double degat) {
        this.pv = this.pv - degat;
        if (this.pv < 0) {
            this.pv = 0;
        }
    }
    
    public void recoitCap (Capacite cap) {
        this.typeExp.recoitCap(cap);
        this.attributsExp.recoitCap(cap);
    }
    
    public void utiliseCap (Capacite cap) {
        this.typeExp.utiliseCap(cap);
        this.attributsExp.utiliseCap(cap);
    }
    
    public void ajouterAttBase (Capacite c) {
        this.cap.ajoutCapacite(c);
    }
    
    public void ajouterCapacite (int niv, Capacite c) {
        this.capacite.put(niv, c);
    }
    
    public void ajouterCTCS (Capacite c) {
        this.cap_apte.put(c, Boolean.TRUE);
    }
    
    public void soin () {
        this.pv = this.getPvMax();
        this.att = this.getAttInitial();
        this.def = this.getDefInitial();
        this.attSpe = this.getAttSpeInitial();
        this.defSpe = this.getDefSpeInitial();
        this.vit = this.getVitInitial();
        this.prec = this.getPrecInitial();
        this.esq = this.getEsqInitial();
        this.setAmour(this.amour);
        this.etat = Etat.aucun;
        for (int i =0 ; i< this.cap.nbCapacite() ; i++) {
            if (this.cap.getCapacite(i) != null) {
                this.cap.getCapacite(i).setPp(this.cap.getCapacite(i).getPpi());
            }
        }
    }
    
    public void soinFinCombat () {
        this.att = this.getAttInitial();
        this.def = this.getDefInitial();
        this.attSpe = this.getAttSpeInitial();
        this.defSpe = this.getDefSpeInitial();
        this.vit = this.getVitInitial();
        this.prec = this.getPrecInitial();
        this.esq = this.getEsqInitial();
        this.setAmour(this.amour);
        if (this.etat.equals(Etat.folie) || this.etat.equals(Etat.peur)) {
            this.etat = Etat.aucun;
        }
    }
    
    public void soin (CapaciteSoin c) {
        this.pv = this.pv + c.getPvGagner(this);
        if (this.pv > this.getPvMax()) {
            this.pv = this.getPvMax();
        }
        if (!this.etat.equals(Etat.aucun)) {
            Etat[] etats = c.getEtats();
            for (Etat etat1 : etats) {
                if (this.etat.equals(etat1)) {
                    this.etat = Etat.aucun;
                }
            }
        }
    }
    
    public boolean augmenteStat (Attributs a, int pourcentage) {
        boolean augmente = false;
        double max;
        switch (a) {
            case att:
                max = (this.getAttInitial() + (this.getAttInitial() / 2));
                if (this.att < max) {
                    augmente = true;
                    this.att = this.att + ((this.getAttInitial() * pourcentage) /100);
                    if (this.att > max) {
                        this.att = max;
                    }
                }
                break;
            case attSpe:
                max = (this.getAttSpeInitial() + (this.getAttSpeInitial() / 2));
                if (this.attSpe < max) {
                    augmente = true;
                    this.attSpe = this.attSpe + ((this.getAttSpeInitial() * pourcentage) /100);
                    if (this.attSpe > max) {
                        this.attSpe = max;
                    }
                }
                break;
            case def:
                max = (this.getDefInitial() + (this.getDefInitial() / 2));
                if (this.def < max) {
                    augmente = true;
                    this.def = this.def + ((this.getDefInitial() * pourcentage) /100);
                    if (this.def > max) {
                        this.def = max;
                    }
                }
                break;
            case defSpe:
                max = (this.getDefSpeInitial() + (this.getDefSpeInitial() / 2));
                if (this.defSpe < max) {
                    augmente = true;
                    this.defSpe = this.defSpe + ((this.getDefSpeInitial() * pourcentage) /100);
                    if (this.defSpe > max) {
                        this.defSpe = max;
                    }
                }
                break;
            case esq:
                max = (this.getEsqInitial() + (this.getEsqInitial() / 2));
                if (this.esq < max) {
                    augmente = true;
                    this.esq = this.esq + ((this.getEsqInitial() * pourcentage) /100);
                    if (this.esq > max) {
                        this.esq = max;
                    }
                }
                break;
            case prec:
                max = (this.getPrecInitial() + (this.getPrecInitial() / 2));
                if (this.prec < max) {
                    augmente = true;
                    this.prec = this.prec + ((this.getPrecInitial() * pourcentage) /100);
                    if (this.prec > max) {
                        this.prec = max;
                    }
                }
                break;
            case vit:
                max = (this.getVitInitial() + (this.getVitInitial() / 2));
                if (this.vit < max) {
                    augmente = true;
                    this.vit = this.vit + ((this.getVitInitial() * pourcentage) /100);
                    if (this.vit > max) {
                        this.vit = max;
                    }
                }
                break;
        }
        return augmente;
    }
    
    public boolean diminueStat (Attributs a, int pourcentage) {
        boolean diminue = false;
        double min;
        switch (a) {
            case att:
                min = (this.getAttInitial() - (this.getAttInitial() / 2));
                if (this.att > min) {
                    diminue = true;
                    this.att = this.att - ((this.getAttInitial() * pourcentage) /100);
                    if (this.att < min) {
                        this.att = min;
                    }
                }
                break;
            case attSpe:
                min = (this.getAttSpeInitial() - (this.getAttSpeInitial() / 2));
                if (this.attSpe > min) {
                    diminue = true;
                    this.attSpe = this.attSpe - ((this.getAttSpeInitial() * pourcentage) /100);
                    if (this.attSpe < min) {
                        this.attSpe = min;
                    }
                }
                break;
            case def:
                min = (this.getDefInitial() - (this.getDefInitial() / 2));
                if (this.def > min) {
                    diminue = true;
                    this.def = this.def - ((this.getDefInitial() * pourcentage) /100);
                    if (this.def < min) {
                        this.def = min;
                    }
                }
                break;
            case defSpe:
                min = (this.getDefSpeInitial() - (this.getDefSpeInitial() / 2));
                if (this.defSpe > min) {
                    diminue = true;
                    this.defSpe = this.defSpe - ((this.getDefSpeInitial() * pourcentage) /100);
                    if (this.defSpe < min) {
                        this.defSpe = min;
                    }
                }
                break;
            case esq:
                min = (this.getEsqInitial() - (this.getEsqInitial() / 2));
                if (this.esq > min) {
                    diminue = true;
                    this.esq = this.esq - ((this.getEsqInitial() * pourcentage) /100);
                    if (this.esq < min) {
                        this.esq = min;
                    }
                }
                break;
            case prec:
                min = (this.getPrecInitial() - (this.getPrecInitial() / 2));
                if (this.prec > min) {
                    diminue = true;
                    this.prec = this.prec - ((this.getPrecInitial() * pourcentage) /100);
                    if (this.prec < min) {
                        this.prec = min;
                    }
                }
                break;
            case vit:
                min = (this.getVitInitial() - (this.getVitInitial() / 2));
                if (this.vit > min) {
                    diminue = true;
                    this.vit = this.vit - ((this.getVitInitial() * pourcentage) /100);
                    if (this.vit < min) {
                        this.vit = min;
                    }
                }
                break;
        }
        return diminue;
    }
    
    public void estAugmenterParTerrain () {
        int pourcentage = 5;
        double max;
        max = (this.getAttInitial() + (this.getAttInitial() / 2));
        if (this.att < max) {
            this.att = this.att + ((this.getAttInitial() * pourcentage) /100);
            if (this.att > max) {
                this.att = max;
            }
        }
        max = (this.getAttSpeInitial() + (this.getAttSpeInitial() / 2));
        if (this.attSpe < max) {
            this.attSpe = this.attSpe + ((this.getAttSpeInitial() * pourcentage) /100);
            if (this.attSpe > max) {
                this.attSpe = max;
            }
        }
        max = (this.getDefInitial() + (this.getDefInitial() / 2));
        if (this.def < max) {
            this.def = this.def + ((this.getDefInitial() * pourcentage) /100);
            if (this.def > max) {
                this.def = max;
            }
        }
        max = (this.getDefSpeInitial() + (this.getDefSpeInitial() / 2));
        if (this.defSpe < max) {
            this.defSpe = this.defSpe + ((this.getDefSpeInitial() * pourcentage) /100);
            if (this.defSpe > max) {
                this.defSpe = max;
            }
        }
        max = (this.getEsqInitial() + (this.getEsqInitial() / 2));
        if (this.esq < max) {
            this.esq = this.esq + ((this.getEsqInitial() * pourcentage) /100);
            if (this.esq > max) {
                this.esq = max;
            }
        }
        max = (this.getPrecInitial() + (this.getPrecInitial() / 2));
        if (this.prec < max) {
            this.prec = this.prec + ((this.getPrecInitial() * pourcentage) /100);
            if (this.prec > max) {
                this.prec = max;
            }
        }
        max = (this.getVitInitial() + (this.getVitInitial() / 2));
        if (this.vit < max) {
            this.vit = this.vit + ((this.getVitInitial() * pourcentage) /100);
            if (this.vit > max) {
                this.vit = max;
            }
        }
    }
    
    public void estDiminuerParTerrain () {
        int pourcentage = 5;
        double min;
        min = (this.getAttInitial() - (this.getAttInitial() / 2));
        if (this.att > min) {
            this.att = this.att - ((this.getAttInitial() * pourcentage) /100);
            if (this.att < min) {
                this.att = min;
            }
        }
        min = (this.getAttSpeInitial() - (this.getAttSpeInitial() / 2));
        if (this.attSpe > min) {
            this.attSpe = this.attSpe - ((this.getAttSpeInitial() * pourcentage) /100);
            if (this.attSpe < min) {
                this.attSpe = min;
            }
        }
        min = (this.getDefInitial() - (this.getDefInitial() / 2));
        if (this.def > min) {
            this.def = this.def - ((this.getDefInitial() * pourcentage) /100);
            if (this.def < min) {
                this.def = min;
            }
        }
        min = (this.getDefSpeInitial() - (this.getDefSpeInitial() / 2));
        if (this.defSpe > min) {
            this.defSpe = this.defSpe - ((this.getDefSpeInitial() * pourcentage) /100);
            if (this.defSpe < min) {
                this.defSpe = min;
            }
        }
        min = (this.getEsqInitial() - (this.getEsqInitial() / 2));
        if (this.esq > min) {
            this.esq = this.esq - ((this.getEsqInitial() * pourcentage) /100);
            if (this.esq < min) {
                this.esq = min;
            }
        }
        min = (this.getPrecInitial() - (this.getPrecInitial() / 2));
        if (this.prec > min) {
            this.prec = this.prec - ((this.getPrecInitial() * pourcentage) /100);
            if (this.prec < min) {
                this.prec = min;
            }
        }
        min = (this.getVitInitial() - (this.getVitInitial() / 2));
        if (this.vit > min) {
            this.vit = this.vit - ((this.getVitInitial() * pourcentage) /100);
            if (this.vit < min) {
                this.vit = min;
            }
        }
    }
    
    public void utilObjet (Objet obj) {
        if (obj.getPv() > this.getPvMax() - this.pv) {
            this.pv = this.getPvMax();
            obj.vendre(1);
        } else {
            if (this.getPvMax() == this.pv) {
                System.out.println("deja en forme");
            } else {
                this.pv += obj.getPv();
                obj.vendre(1);
            }
        }
    }
    
    public boolean estTresFaible (Type type) {
        if (this.type2 == null) {
            return false;
        } else {
            return this.type1.faible(type) && this.type2.faible(type);
        }
    }
    
    public boolean estFaible (Type type) {
        if (this.type2 == null) {
            return this.type1.faible(type);
        } else {
            return (this.type1.faible(type) && !this.type2.fort(type)) || (!this.type1.fort(type) && this.type2.faible(type));
        }
    }
    
    public boolean estTresFort (Type type) {
        if (this.type2 == null) {
            return false;
        } else {
            return this.type1.fort(type) && this.type2.fort(type);
        }
    }
    
    public boolean estFort (Type type) {
        if (this.type2 == null) {
            return this.type1.fort(type);
        } else {
            return (this.type1.fort(type) && !this.type2.faible(type)) || (!this.type1.faible(type) && this.type2.fort(type));
        }
    }
    
    public boolean estInefficace (Type type) {
        if (this.type2 == null) {
            return this.type1.ineficace(type);
        } else {
            return this.type1.ineficace(type) || this.type2.ineficace(type);
        }
    }
    
    public boolean estKo () {
        return this.pv == 0;
    }
    
    public static Pokemon getInstance (Pokemon pk) {
        if (pk instanceof PokemonClassique) {
            return new PokemonClassique ((PokemonClassique)pk);
        } else if (pk instanceof PokemonFinal) {
            return new PokemonFinal ((PokemonFinal)pk);
        } else if (pk instanceof PokemonLegendaireNiv1) {
            return new PokemonLegendaireNiv1 ((PokemonLegendaireNiv1)pk);
        } else if (pk instanceof PokemonLegendaireNiv2) {
            return new PokemonLegendaireNiv2 ((PokemonLegendaireNiv2)pk);
        } else if (pk instanceof PokemonLegendaireNiv3) {
            return new PokemonLegendaireNiv3 ((PokemonLegendaireNiv3)pk);
        } else if (pk instanceof PokemonMultiEvolution) {
            return new PokemonMultiEvolution ((PokemonMultiEvolution)pk);
        } else {
            return null;
        }
    }
    
    public abstract boolean evolue ();
    
    public abstract Pokemon getPokemonEvolution ();
    
    public abstract void ajouterEndroits (Endroit e, int nivMin, int nivMax, Environnement environnement, int pourcentage);

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nom);
        hash = 41 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return this.numero == other.numero;
    }
    
    
    
}

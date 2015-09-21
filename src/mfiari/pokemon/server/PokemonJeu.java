package mfiari.pokemon.server;

import mfiari.pokemon.core.objet.Objet_endroit_pc;
import mfiari.pokemon.server.perso.pokemon.Pokemon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.controlleur.Vues;
import mfiari.lib.game.liste.ListeDEndroit;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.objet.ObjetEndroit;
import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.objet.ObjetEndroitCoffre;
import mfiari.lib.game.objet.ObjetEndroitObservable;
import mfiari.lib.game.objet.ObjetEndroitPassage;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.position.Position;
import mfiari.lib.game.reseau.ClientListener.ClientCloseException;
import mfiari.lib.game.reseau.NetworkConfig;
import mfiari.lib.game.reseau.NetworkObjectTranmetter;
import mfiari.pokemon.server.combat.Combat;
import mfiari.pokemon.server.evenement.Evenement;
import mfiari.pokemon.server.evenement.EvenementQuete;
import mfiari.pokemon.server.evenement.EvenementQueteAnnexe;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.liste.ListeDePokemon;
import mfiari.pokemon.server.menu.Menu;
import mfiari.pokemon.server.network.ClientListener;
import mfiari.pokemon.server.network.User;
import mfiari.pokemon.server.ville.CentrePokemon;
import mfiari.pokemon.server.ville.Endroit;
import mfiari.pokemon.server.ville.Endroits;
import mfiari.pokemon.core.ville.Environnement;
import mfiari.pokemon.server.objet.Objet_endroit_soin;
import mfiari.pokemon.server.objet.Pokedex;
import mfiari.pokemon.server.objet.Sac;
import mfiari.pokemon.server.perso.ChampionArene;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.ville.Gare;
import mfiari.pokemon.server.ville.Quartier;
import mfiari.pokemon.server.ville.Salle;
import mfiari.pokemon.server.ville.Terrain;

/* demo du jeu pokemon */
public class PokemonJeu extends ControlleurVue {
    
    private String parole;
    private String affichage;
    private boolean confirmation;
    private Dresseur perso;
    private int seconde;
    private int minute;
    private int heure;
    private final Timer t;
    private EvenementQuete jeu;
    private EvenementQuete chapitre;
    private EvenementQuete quete;
    private EvenementQueteAnnexe queteAnnexe;
    private Evenement prochainEvenement;
    private Evenement prochainEvenementAnnexe;
    private ListeDEndroit carte_pokemon;
    private ListeDeDresseur dresseur_vaincu;
    private mfiari.lib.game.ville.Endroit endroit;
    private Position dernierCentrePokemonVisite;
    private Objet objet;
    private ListeDePokemon pokemonAChoisir;
    private ArrayList<Gare> gares;

    class horloge extends TimerTask {

        @Override
        public void run() {
            if (seconde == 59) {
                seconde = 0;
                if (minute == 59) {
                    minute = 0;
                    heure++;
                } else {
                    minute++;
                }
            } else {
                seconde++;
            }
        }
    }

    public PokemonJeu() {
        super(false);
        this.parole = "";
        t = new Timer();
    }

    public int getHeureTempsJeu() {
        return this.heure;
    }

    public int getMinuteTempsJeu() {
        return this.minute;
    }

    public int getSecondeTempsJeu() {
        return this.seconde;
    }

    public void setTime(int heure, int minute, int seconde) {
        this.heure = heure;
        this.minute = minute;
        this.seconde = seconde;
    }
    
    public void afficherEndroit (Endroit endroit) {
        this.endroit = endroit;
        this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
    }

    public void jouer(EvenementQuete jeu, Dresseur perso, ListeDEndroit carte_pokemon, ListeDeDresseur dresseurs) {
        this.jeu = jeu;
        this.perso = perso;
        this.carte_pokemon = carte_pokemon;
        this.dernierCentrePokemonVisite = new Position(2, 4, 0, Endroits.chambreRival1_maisonRival1_quartierDresseur_bourgPalette, Orientation.gauche);
        this.queteAnnexe = null;
        this.prochainEvenementAnnexe=null;
        this.endroit = this.perso.getPosition().getEndroit();
        this.dresseur_vaincu = dresseurs;
        t.schedule(new horloge(), 0, 1 * 1000);
        this.continuer();
        /*
         * this.pcsDeroulementJeu.firePropertyChange("continuer", null, null);
         * affiche la ville où se trouve le perso, en positionnant le perso et les batiments
         * met en marche le timer
         * verifie si il y a un evenement qui se declenche
         * affiche les actions et laisse la main au joueur
         */
    }

    public Dresseur getPerso() {
        return this.perso;
    }

    public void setPerso(Dresseur perso) {
        this.perso = perso;
    }

    public ListeDEndroit getCarte_Pokemon() {
        return this.carte_pokemon;
    }

    public Evenement getEvenement() {
        return this.prochainEvenement;
    }

    public Evenement getEvenementAnnexe() {
        return this.prochainEvenementAnnexe;
    }

    public EvenementQuete getEvenementJeu () {
        return (EvenementQuete) this.jeu;
    }
    
    public ListeDeDresseur getDresseurVaincu () {
        return this.dresseur_vaincu;
    }
    
    public String getParole() {
        return this.parole;
    }

    public void setParole(String texte) {
        this.parole = texte;
        this.pcsControlleurVue.firePropertyChange("parole", null, null);
    }
    
    public String getAffichage() {
        return this.affichage;
    }

    public void setAffichage(String texte) {
        this.affichage = texte;
        this.pcsControlleurVue.firePropertyChange("affichage", null, null);
    }

    public void setConfirmation(boolean b) {
        this.confirmation = b;
    }
    
    public boolean confirmation(String texte) {
        this.affichage = texte;
        this.pcsControlleurVue.firePropertyChange("confirmation", null, null);
        return this.confirmation;
    }
    
    public Objet getObjet () {
        return this.objet;
    }
    
    public ListeDePokemon getPokemonAChoisir () {
        return this.pokemonAChoisir;
    }
    
    public ArrayList<Gare> getGares () {
        return this.gares;
    }
    
    private void recoitObjet(Objet obj) {
        this.objet = obj;
        this.pcsControlleurVue.firePropertyChange("recoitObjet", null, null);
    }
    
    public void afficherPokemonAchoisir(ListeDePokemon pokemonAChoisir) {
        this.pokemonAChoisir = pokemonAChoisir;
        this.pcsControlleurVue.firePropertyChange("afficherPokemonAchoisir", null, null);
    }
    
    public void afficherPokemonAchoisir(Pokemon pk) {
        Pokedex pokedex = new Pokedex(500, true);
        pokedex.pokedexCombat(pk);
    }
    
    public void refreshAtPosition (Position position) {
        this.pcsControlleurVue.firePropertyChange("refreshAtPosition", position, null);
    }

    public void continuer() {
        Position positionPerso = this.perso.getPosition();
        this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
        do {
            this.chapitre = (EvenementQuete) this.jeu.getEvenement();
            this.quete = (EvenementQuete) this.chapitre.getEvenement();
            this.prochainEvenement = this.quete.getEvenement();
            System.out.println(prochainEvenement.toString());
            if (queteAnnexe != null) {
                System.out.println(queteAnnexe.toString());
            }
            if (this.quete.aQueteAnexeActive(this)) {
                /*if (this.quete.getQueteAnnexe().estActiver(this)) {
                    this.queteAnnexe = this.quete.getQueteAnnexe();
                }*/
                this.queteAnnexe = (EvenementQueteAnnexe) this.quete.getQueteAnnexeActive(this);
                this.prochainEvenementAnnexe = this.queteAnnexe.getEvenement();
                System.out.println(prochainEvenementAnnexe.toString());
                System.out.println(prochainEvenementAnnexe.estActiver(this));
                
            }
            while (prochainEvenement instanceof EvenementQuete || this.prochainEvenementAnnexe instanceof EvenementQueteAnnexe || prochainEvenement.estFini()
                    || (this.prochainEvenementAnnexe != null && this.prochainEvenementAnnexe.estFini())) {
                
            System.out.println("while");
                if (prochainEvenement instanceof EvenementQuete) {
                    EvenementQuete even;
                    even = (EvenementQuete) prochainEvenement;
                    prochainEvenement = even.getEvenement();
                    if (prochainEvenement.estFini()) {
                        even.evenementSuivant();
                        if (even.estFini()) {
                            this.quete.evenementSuivant();
                            if (this.quete.estFini()) {
                                this.chapitre.evenementSuivant();
                                if (this.chapitre.estFini()) {
                                    this.jeu.evenementSuivant();
                                    if (this.jeu.estFini()) {
                                    }
                                    this.chapitre = (EvenementQuete) this.jeu.getEvenement();
                                }
                                this.quete = (EvenementQuete) this.chapitre.getEvenement();
                            }
                            even = (EvenementQuete) this.quete.getEvenement();
                        }
                        prochainEvenement = even.getEvenement();
                    }
                } else {
                    if (prochainEvenement.estFini()) {
                        this.quete.evenementSuivant();
                        if (this.quete.estFini()) {
                            this.chapitre.evenementSuivant();
                            this.quete = (EvenementQuete) this.chapitre.getEvenement();
                        }
                        this.prochainEvenement = this.quete.getEvenement();
                    }
                }
                if (this.queteAnnexe instanceof EvenementQueteAnnexe) {
                    this.prochainEvenementAnnexe = this.queteAnnexe.getEvenement();
                    if (this.prochainEvenementAnnexe.estFini()) {
                        queteAnnexe.evenementSuivant();
                        if (queteAnnexe.estFini()) {
                            if (this.quete.aQueteAnexeActive(this)) {
                                this.queteAnnexe = (EvenementQueteAnnexe) this.quete.getQueteAnnexeActive(this);
                                this.prochainEvenementAnnexe = queteAnnexe.getEvenement();
                            } else {
                                this.queteAnnexe=null;
                                this.prochainEvenementAnnexe=null;
                            }
                        }
                    }
                } else {
                    if (this.quete.aQueteAnexe()) {
                        EvenementQueteAnnexe evenAnnexe;
                        queteAnnexe = (EvenementQueteAnnexe) this.quete.getQueteAnnexe();
                        this.prochainEvenementAnnexe = queteAnnexe.getEvenement();
                        if (this.prochainEvenementAnnexe.estFini()) {
                            queteAnnexe.evenementSuivant();
                            if (queteAnnexe.estFini()) {
                                this.queteAnnexe=null;
                                this.prochainEvenementAnnexe=null;
                            }
                        }
                    }
                }
            }
            if (prochainEvenement.estActiver(this)) {
                this.endroit = this.prochainEvenement.getEndroitDeLevenement().getEndroit();
                //this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                if (!positionPerso.getEndroit().equals(this.perso.getPosition().getEndroit())) {
                    this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                }
                System.out.println(prochainEvenement.toString());
                this.prochainEvenement.activeEvenement(this);
                this.prochainEvenement.FinirEvenement();
                //this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                //this.continuer();
                continue;
            }
            System.out.println("deplacerPerso");
            this.pcsControlleurVue.firePropertyChange("deplacerPerso", positionPerso, this.perso.getPosition());
            if (this.prochainEvenementAnnexe!=null && this.prochainEvenementAnnexe.estActiver(this)) {
                this.endroit = this.prochainEvenementAnnexe.getEndroitDeLevenement().getEndroit();
                //this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                System.out.println(this.prochainEvenementAnnexe.toString());
                this.prochainEvenementAnnexe.activeEvenement(this);
                this.prochainEvenementAnnexe.FinirEvenement();
                //this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                //this.continuer();
                continue;
            }
            /*System.out.println("deplacerPerso");
            if (!positionPerso.getEndroit().equals(this.perso.getPosition().getEndroit())) {
                if (this.musique != null) {
                    this.musique.stop();
                }
            }
            this.pcsControlleurVue.firePropertyChange("deplacerPerso", positionPerso, this.perso.getPosition());
            if (!positionPerso.getEndroit().equals(this.perso.getPosition().getEndroit())) {
                this.musique = musiqueVille.getMusique(this.perso.getPosition().getEndroit());
                if (this.musique != null) {
                    this.musique.start(true);
                }
            }*/
            this.pcsControlleurVue.firePropertyChange("actionJeu", null, null);
            positionPerso = this.perso.getPosition();
            this.setChoixAction(this.choix);
            /*
             * prend en compte le choix du joueur et fait les action necessaire (deplacement, parole...)
             * reactualise la ville
             * verifie si il y a un evenement qui se declenche
             * affiche les actions et laisse la main au joueur
             */
        } while (!this.gameOver());
    }
    
    public void setChoixAction (int choix, ClientListener clientListener) {
        try {
            System.out.println("setChoixAction");
            Dresseur dresseur = ((User)clientListener.getUser()).getDresseur();
            Position p = new Position(dresseur.getPosition());
            switch (choix) {
                case (1):
                    if (p.getOrientation().equals(Orientation.dos)) {
                        p.avancer();
                    } else {
                        p.setOrientation(Orientation.dos);
                    }
                    this.bouger(p, clientListener);
                    break;
                case (2):
                    if (p.getOrientation().equals(Orientation.face)) {
                        p.reculer();
                    } else {
                        p.setOrientation(Orientation.face);
                    }
                    this.bouger(p, clientListener);
                    break;
                case (3):
                    if (p.getOrientation().equals(Orientation.droite)) {
                        p.droite();
                    } else {
                        p.setOrientation(Orientation.droite);
                    }
                    this.bouger(p, clientListener);
                    break;
                case (4):
                    if (p.getOrientation().equals(Orientation.gauche)) {
                        p.gauche();
                    } else {
                        p.setOrientation(Orientation.gauche);
                    }
                    this.bouger(p, clientListener);
                    break;
                case (5):
                    this.action(clientListener);
                    break;
                case (6):
                    clientListener.sendMessage(new NetworkObjectTranmetter("menu", null));
                    break;
            }
        } catch (ClientCloseException ex) {
            Logger.getLogger(PokemonJeu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bouger(Position p, ClientListener clientListener) {
        try {
            Dresseur adversaire = this.verifieDresseurAdverse(p);
            System.out.println("bouger");
            Dresseur dresseur = ((User)clientListener.getUser()).getDresseur();
            Endroit endroit = (Endroit)dresseur.getPosition().getEndroit();
            if (adversaire != null && !adversaire.equals(dresseur) && !(adversaire instanceof ChampionArene)) {
                System.out.println("dresseur");
                while (!this.gameOver() && !adversaire.equals(dresseur) && !(adversaire instanceof ChampionArene)) {
                    dresseur.setPosition(p);
                    clientListener.sendMessage(new NetworkObjectTranmetter("deplacePerso", dresseur.getPosition()));
                    Collection<mfiari.lib.game.reseau.ClientListener> clientCollection = clientListener.getManager().getAllClient();
                    NetworkConfig config = new NetworkConfig();
                    config.addConfig("dresseur", dresseur);
                    config.addConfig("position", dresseur.getPosition());
                    for (mfiari.lib.game.reseau.ClientListener client : clientCollection) {
                        if (!client.equals(clientListener)) {
                            client.sendMessage(new NetworkObjectTranmetter("deplaceJoueur", config));
                        }
                    }
                    clientListener.sendMessage(new NetworkObjectTranmetter("combat", adversaire));
                }
                clientListener.sendMessage(new NetworkObjectTranmetter("afficheEndroit", null));
            } else if (endroit.aObjetEndroit(dresseur.getPosition()) instanceof ObjetEndroitPassage) {
                System.out.println("ObjetEndroitPassage");
                ObjetEndroitPassage obj = (ObjetEndroitPassage) endroit.aObjetEndroit(dresseur.getPosition());
                if (p.getPositionX() < 0 || p.getPositionX() == endroit.getLargeur() || p.getPositionY() < 0 || p.getPositionY() == endroit.getLongueur()) {
                    obj.prendre(dresseur);
                    clientListener.sendMessage(new NetworkObjectTranmetter("changeEndroit", dresseur.getPosition()));
                } else {
                    /* Si aucun objet ne bloque le passage */
                    if (this.verifObjetBloquant(p)) {
                        clientListener.sendMessage(new NetworkObjectTranmetter("endroitInnaccessible", null));
                    } else {
                        dresseur.setPosition(p);
                        clientListener.sendMessage(new NetworkObjectTranmetter("deplacePerso", dresseur.getPosition()));
                        Collection<mfiari.lib.game.reseau.ClientListener> clientCollection = clientListener.getManager().getAllClient();
                        NetworkConfig config = new NetworkConfig();
                        config.addConfig("dresseur", dresseur);
                        config.addConfig("position", dresseur.getPosition());
                        for (mfiari.lib.game.reseau.ClientListener client : clientCollection) {
                            if (!client.equals(clientListener)) {
                                client.sendMessage(new NetworkObjectTranmetter("deplaceJoueur", config));
                            }
                        }
                    }
                }
            } else if (p.getPositionX() >= 0 && p.getPositionX() < endroit.getLargeur() && p.getPositionY() >= 0 && p.getPositionY() < endroit.getLongueur()) {
                System.out.println("autre");
                if (endroit.aObjetEndroit(p) != null) {
                    if (endroit.aObjetEndroit(p) instanceof ObjetEndroitPassage) {
                        System.out.println("autre");
                        ObjetEndroitPassage obj = (ObjetEndroitPassage) endroit.aObjetEndroit(p);
                        if (obj.getType().estPassageDirect()) {
                            obj.prendre(dresseur);
                            clientListener.sendMessage(new NetworkObjectTranmetter("changeEndroit", dresseur.getPosition()));
                        } else {
                            dresseur.setPosition(p);
                            clientListener.sendMessage(new NetworkObjectTranmetter("deplacePerso", dresseur.getPosition()));
                            Collection<mfiari.lib.game.reseau.ClientListener> clientCollection = clientListener.getManager().getAllClient();
                            NetworkConfig config = new NetworkConfig();
                            config.addConfig("dresseur", dresseur);
                            config.addConfig("position", dresseur.getPosition());
                            for (mfiari.lib.game.reseau.ClientListener client : clientCollection) {
                                if (!client.equals(clientListener)) {
                                    client.sendMessage(new NetworkObjectTranmetter("deplaceJoueur", config));
                                }
                            }
                        }
                    } else if (endroit.aObjetEndroit(p) instanceof ObjetEndroitClassique) {
                        ObjetEndroitClassique obj = (ObjetEndroitClassique) endroit.aObjetEndroit(p);
                        if (obj.getType().estBloquant()) {
                            clientListener.sendMessage(new NetworkObjectTranmetter("endroitInnaccessible", null));
                        } else if (endroit.aEnvironnement(p) != null) {
                            Environnement environnement = (Environnement) endroit.aEnvironnement(p);
                            dresseur.setPosition(p);
                            clientListener.sendMessage(new NetworkObjectTranmetter("deplacePerso", dresseur.getPosition()));
                            Collection<mfiari.lib.game.reseau.ClientListener> clientCollection = clientListener.getManager().getAllClient();
                            NetworkConfig config = new NetworkConfig();
                            config.addConfig("dresseur", dresseur);
                            config.addConfig("position", dresseur.getPosition());
                            for (mfiari.lib.game.reseau.ClientListener client : clientCollection) {
                                if (!client.equals(clientListener)) {
                                    client.sendMessage(new NetworkObjectTranmetter("deplaceJoueur", config));
                                }
                            }
                            if (endroit instanceof Quartier) {
                                Quartier q = (Quartier) endroit;
                                if (q.aPokemon(environnement)) {
                                    Pokemon pk = q.getPokemonSauvage(environnement);
                                    if (pk != null) {
                                        clientListener.sendMessage(new NetworkObjectTranmetter("combat", pk));
                                    }
                                }
                            }
                        } else {
                            dresseur.setPosition(p);
                            clientListener.sendMessage(new NetworkObjectTranmetter("deplacePerso", dresseur.getPosition()));
                            Collection<mfiari.lib.game.reseau.ClientListener> clientCollection = clientListener.getManager().getAllClient();
                            NetworkConfig config = new NetworkConfig();
                            config.addConfig("dresseur", dresseur);
                            config.addConfig("position", dresseur.getPosition());
                            for (mfiari.lib.game.reseau.ClientListener client : clientCollection) {
                                if (!client.equals(clientListener)) {
                                    client.sendMessage(new NetworkObjectTranmetter("deplaceJoueur", config));
                                }
                            }
                        }
                    } else if (endroit.aEnvironnement(p) != null) {
                        Environnement environnement = (Environnement) endroit.aEnvironnement(p);
                        dresseur.setPosition(p);
                        clientListener.sendMessage(new NetworkObjectTranmetter("deplacePerso", dresseur.getPosition()));
                        Collection<mfiari.lib.game.reseau.ClientListener> clientCollection = clientListener.getManager().getAllClient();
                        NetworkConfig config = new NetworkConfig();
                        config.addConfig("dresseur", dresseur);
                        config.addConfig("position", dresseur.getPosition());
                        for (mfiari.lib.game.reseau.ClientListener client : clientCollection) {
                            if (!client.equals(clientListener)) {
                                client.sendMessage(new NetworkObjectTranmetter("deplaceJoueur", config));
                            }
                        }
                        if (endroit instanceof Quartier) {
                            Quartier q = (Quartier) endroit;
                            if (q.aPokemon(environnement)) {
                                Pokemon pk = q.getPokemonSauvage(environnement);
                                if (pk != null) {
                                    clientListener.sendMessage(new NetworkObjectTranmetter("combat", pk));
                                }
                            }
                        }
                    }
                } else if (endroit.aGens(p) != null) {
                    clientListener.sendMessage(new NetworkObjectTranmetter("endroitInnaccessible", null));
                } else if (endroit.aEndroit(p) != null) {
                    endroit.aEndroit(p).entrer(dresseur);
                    clientListener.sendMessage(new NetworkObjectTranmetter("changeEndroit", dresseur.getPosition()));
                } else {
                    dresseur.setPosition(p);
                    clientListener.sendMessage(new NetworkObjectTranmetter("deplacePerso", dresseur.getPosition()));
                    Collection<mfiari.lib.game.reseau.ClientListener> clientCollection = clientListener.getManager().getAllClient();
                    NetworkConfig config = new NetworkConfig();
                    config.addConfig("dresseur", dresseur);
                    config.addConfig("position", dresseur.getPosition());
                    for (mfiari.lib.game.reseau.ClientListener client : clientCollection) {
                        if (!client.equals(clientListener)) {
                            client.sendMessage(new NetworkObjectTranmetter("deplaceJoueur", config));
                        }
                    }
                }
            }
        } catch (ClientCloseException ex) {
            Logger.getLogger(PokemonJeu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void action(ClientListener clientListener) {
        try {
            Position p = new Position(((User)clientListener.getUser()).getDresseur().getPosition());
            switch (p.getOrientation()) {
                case face :
                    p.reculer();
                    break;
                case dos :
                    p.avancer();
                    break;
                case droite :
                    p.droite();
                    break;
                case gauche :
                    p.gauche();
                    break;
            }
            clientListener.sendMessage(new NetworkObjectTranmetter("action", null));
            Collection<mfiari.lib.game.reseau.ClientListener> clientCollection = clientListener.getManager().getAllClient();
            for (mfiari.lib.game.reseau.ClientListener client : clientCollection) {
                ClientListener pokemonClient = (ClientListener) client;
                if (!clientListener.equals(pokemonClient) && ((User)clientListener.getUser()).getDresseur().getPosition().equals(p)) {
                    clientListener.sendMessage(new NetworkObjectTranmetter("actionJoueur", ((User)clientListener.getUser()).getDresseur()));
                }
            }
        } catch (ClientCloseException ex) {
            Logger.getLogger(PokemonJeu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setChoixAction(int choix) {
        System.out.println("setChoixAction");
        this.choix = choix;
        Position p = new Position(this.perso.getPosition());
        switch (this.choix) {
            case (1):
                if (p.getOrientation().equals(Orientation.dos)) {
                    p.avancer();
                } else {
                    p.setOrientation(Orientation.dos);
                }
                this.bouger(p);
                break;
            case (2):
                if (p.getOrientation().equals(Orientation.face)) {
                    p.reculer();
                } else {
                    p.setOrientation(Orientation.face);
                }
                this.bouger(p);
                break;
            case (3):
                if (p.getOrientation().equals(Orientation.droite)) {
                    p.droite();
                } else {
                    p.setOrientation(Orientation.droite);
                }
                this.bouger(p);
                break;
            case (4):
                if (p.getOrientation().equals(Orientation.gauche)) {
                    p.gauche();
                } else {
                    p.setOrientation(Orientation.gauche);
                }
                this.bouger(p);
                break;
            case (5):
                this.action();
                break;
            case (6):
                Menu menu = new Menu(this.perso, this);
                menu.Menu();
                this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                break;
        }
    }

    public void bouger(Position p) {
        Dresseur adversaire = this.verifieDresseurAdverse(p);
        System.out.println("bouger");
        if (adversaire != null && !adversaire.equals(this.perso) && !(adversaire instanceof ChampionArene)) {
            System.out.println("dresseur");
            while (adversaire != null && !this.gameOver() && !adversaire.equals(this.perso) && !(adversaire instanceof ChampionArene)) {
                
                Position position = new Position(this.perso.getPosition());
                this.perso.setPosition(p);
                this.refreshAtPosition(position);
                this.refreshAtPosition(this.perso.getPosition());
                //this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                String str = adversaire.ParlerAvantCombat();
                while (!str.isEmpty()) {
                    this.setParole(str);
                    str = adversaire.ParlerAvantCombat();
                }
                Combat c = null;
                if (this.endroit instanceof Quartier) {
                    Quartier q = (Quartier) this.endroit;
                    c = new Combat(this, q.getTerrain());
                } else if (this.endroit instanceof Salle) {
                    Salle salle = (Salle) this.endroit;
                    c = new Combat(this, (Terrain)salle.getTerrain());
                }
                if (c != null) {
                    //c.combatSimple(this.perso, adversaire);
                    if (this.perso.aPokemon()) {
                        this.dresseur_vaincu.ajouterDresseur(adversaire);
                    }
                    adversaire = this.verifieDresseurAdverse(p);
                }
            }
            this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
        } else if (this.endroit.aObjetEndroit(this.perso.getPosition()) instanceof ObjetEndroitPassage) {
            System.out.println("ObjetEndroitPassage");
            ObjetEndroitPassage obj = (ObjetEndroitPassage) this.endroit.aObjetEndroit(this.perso.getPosition());
            if (p.getPositionX() < 0 || p.getPositionX() == this.endroit.getLargeur() || p.getPositionY() < 0 || 
                    p.getPositionY() == this.endroit.getLongueur()) {
                System.out.println("quete : "+this.quete.toString()+" arrive : "+this.quete.verifieEndroitAccessible(obj.getEndroitDarive()));
                if (!this.quete.verifieEndroitAccessible(obj.getEndroitDarive()) && (this.queteAnnexe == null || !this.queteAnnexe.verifieEndroitAccessible(obj.getEndroitDarive()))) {
                    obj.prendre(this.perso);
                    this.endroit = this.perso.getPosition().getEndroit();
                    this.ajouterEndroitCarte();
                } else {
                    this.pcsControlleurVue.firePropertyChange("afficheEndroitInnaccessible", null, null);
                }
            } else {
                /* Si aucun objet ne bloque le passage */
                if (this.verifObjetBloquant(p)) {
                    this.pcsControlleurVue.firePropertyChange("afficheEndroitInnaccessible", null, null);
                } else {
                    this.perso.setPosition(p);
                }
            }
        } else if (p.getPositionX() >= 0 && p.getPositionX() < this.endroit.getLargeur() && p.getPositionY() >= 0 && 
                p.getPositionY() < this.endroit.getLongueur()) {
            System.out.println("autre");
            if (this.endroit.aObjetEndroit(p) != null) {
                if (this.endroit.aObjetEndroit(p) instanceof ObjetEndroitPassage) {
                    System.out.println("autre");
                    ObjetEndroitPassage obj = (ObjetEndroitPassage) this.endroit.aObjetEndroit(p);
                    if (obj.getType().estPassageDirect()) {
                        obj.prendre(this.perso);
                        this.endroit = this.perso.getPosition().getEndroit();
                        this.ajouterEndroitCarte();
                    } else {
                        this.perso.setPosition(p);
                    }
                } else if (this.endroit.aObjetEndroit(p) instanceof ObjetEndroitClassique) {
                    ObjetEndroitClassique obj = (ObjetEndroitClassique) this.endroit.aObjetEndroit(p);
                    if (obj.getType().estBloquant()) {
                        this.pcsControlleurVue.firePropertyChange("afficheEndroitInnaccessible", null, null);
                    } else if (this.endroit.aEnvironnement(p) != null) {
                        Environnement environnement = (Environnement) this.endroit.aEnvironnement(p);
                        this.perso.setPosition(p);
                        if (this.endroit instanceof Quartier) {
                            Quartier q = (Quartier) this.endroit;
                            if (q.aPokemon(environnement)) {
                                Pokemon pk = q.getPokemonSauvage(environnement);
                                if (pk != null) {
                                    Combat c = new Combat(this, q.getTerrain());
                                    //c.combatSauvage(this.perso, pk);
                                    this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                                }
                            }
                        }
                    } else {
                        this.perso.setPosition(p);
                    }
                } else if (this.endroit.aEnvironnement(p) != null) {
                    Environnement environnement = (Environnement) this.endroit.aEnvironnement(p);
                    this.perso.setPosition(p);
                    if (this.endroit instanceof Quartier) {
                        Quartier q = (Quartier) this.endroit;
                        if (q.aPokemon(environnement)) {
                            Pokemon pk = q.getPokemonSauvage(environnement);
                            if (pk != null) {
                                Combat c = new Combat(this, q.getTerrain());
                                //c.combatSauvage(this.perso, pk);
                                this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                            }
                        }
                    }
                }
            } else if (this.endroit.aGens(p) != null) {
                this.pcsControlleurVue.firePropertyChange("afficheEndroitInnaccessible", null, null);
            } else if (this.endroit.aEndroit(p) != null) {
                this.endroit.aEndroit(p).entrer(this.perso);
                if (this.endroit.aEndroit(p) instanceof CentrePokemon) {
                    this.dernierCentrePokemonVisite = new Position(1, 5, 0, this.perso.getPosition().getEndroit(), Orientation.dos);
                }
                this.endroit = this.perso.getPosition().getEndroit();
                this.ajouterEndroitCarte();
            } else {
                this.perso.setPosition(p);
            }
        }
    }
    
    private void ajouterEndroitCarte () {
        if (!this.carte_pokemon.contains(this.endroit)) {
            this.carte_pokemon.ajouterEndroit(this.endroit);
        }
    }
    
    private boolean verifObjetBloquant (Position p) {
        return false;
    }

    public void action() {
        Dresseur dresseur = this.verifieDresseurACombattre();
        if (dresseur != null) {
            this.dresseur_vaincu.ajouterDresseur(dresseur);
            String str = dresseur.ParlerAvantCombat();
            while (!str.isEmpty()) {
                this.setParole(str);
                str = dresseur.ParlerAvantCombat();
            }
            Combat c = null;
            if (this.endroit instanceof Quartier) {
                Quartier q = (Quartier) this.endroit;
                c = new Combat(this, q.getTerrain());
            } else if (this.endroit instanceof Salle) {
                Salle salle = (Salle) this.endroit;
                c = new Combat(this, (Terrain)salle.getTerrain());
            }
            if (c != null) {
                //c.combatSimple(this.perso, dresseur);
                this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                if (dresseur instanceof ChampionArene) {
                    ChampionArene champion = (ChampionArene) dresseur;
                    String str2 = champion.ParlerApresCombat();
                    while (!str2.isEmpty()) {
                        this.setParole(str2);
                        str2 = champion.ParlerApresCombat();
                    }
                    this.setAffichage("Vous recever le badge " + champion.getBadge().getNom());
                    this.perso.getBadges().ajouterBadge(champion.getBadge());
                    this.recoitObjet(champion.getCT());
                    this.perso.getSac().acheter(champion.getCT(), 1);
                }
            }
        } else {
            mfiari.lib.game.personnage.Gens gensAquiParler = this.verifieGensAquiParler();
            if (gensAquiParler != null) {
                String str = gensAquiParler.Parler();
                while (!str.isEmpty()) {
                    this.setParole(str);
                    str = gensAquiParler.Parler();
                }
            } else {
                ObjetEndroit objetAobserver = this.verifieObjetAObserver();
                if (objetAobserver != null) {
                    if (objetAobserver instanceof ObjetEndroitCoffre) {
                        ObjetEndroitCoffre Objet_endroit_coffre = (ObjetEndroitCoffre) objetAobserver;
                        Objet obj = Objet_endroit_coffre.ouvrir();
                        if (obj == null) {
                            this.setAffichage(Objet_endroit_coffre.observer());
                        } else {
                            this.recoitObjet(obj);
                            this.perso.getSac().ajouterObjet(obj);
                        }
                        this.endroit.supprimeObjetEndroit(objetAobserver);
                        this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                    } else if (objetAobserver instanceof ObjetEndroitObservable) {
                        ObjetEndroitObservable Objet_endroit_observable = (ObjetEndroitObservable) objetAobserver;
                        this.setAffichage(Objet_endroit_observable.observer());
                    } else if (objetAobserver instanceof Objet_endroit_soin) {
                        Objet_endroit_soin objet_endroit_soin = (Objet_endroit_soin) objetAobserver;
                        if (this.confirmation(objet_endroit_soin.toString())) {
                            objet_endroit_soin.soin(this.perso);
                        }
                    } else if (objetAobserver instanceof Objet_endroit_pc) {
                        Objet_endroit_pc objet_endroit_pc = (Objet_endroit_pc) objetAobserver;
                        Vues.createVue(this.perso.getPC());
                        this.perso.getPC().allumePc(this.perso.getEquipe());
                        this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
                    }
                }
            }
        }
    }
    
    public Dresseur verifieDresseurAdverse (Position p) {
        Endroit endroitEnCours = (Endroit) p.getEndroit();
        for (Orientation value : Orientation.values()) {
            switch (value) {
                case face:
                    for (int j = p.getPositionX() -3 ; j <= p.getPositionX() ; j++ ) {
                        if (endroitEnCours.aDresseur(j, p.getPositionY(), Orientation.face) != null) {
                            Dresseur d = endroitEnCours.aDresseur(j, p.getPositionY(), Orientation.face);
                            for (int i = j ; i < p.getPositionX() ; i++) {
                                Position position = new Position(d.getPosition());
                                d.setPosition(new Position(i, p.getPositionY(), p.getPositionZ(), p.getEndroit(), Orientation.face));
                                this.refreshAtPosition(position);
                                this.refreshAtPosition(d.getPosition());
                                this.attendre(300);
                            }
                            return d;
                        }
                    }
                    
                    break;
            case dos:
                for (int j = p.getPositionX() ; j <= p.getPositionX()  + 3 ; j++ ) {
                    if (endroitEnCours.aDresseur(j, p.getPositionY(), Orientation.dos) != null) {
                        Dresseur d = endroitEnCours.aDresseur(j, p.getPositionY(), Orientation.dos);
                        for (int i = j ; i > p.getPositionX() ; i--) {
                            Position position = new Position(d.getPosition());
                            d.setPosition(new Position(i, p.getPositionY(), p.getPositionZ(), p.getEndroit(), Orientation.dos));
                            this.refreshAtPosition(position);
                            this.refreshAtPosition(d.getPosition());
                            this.attendre(300);
                        }
                        return d;
                    }
                }
                break;
            case gauche:
                for (int j = p.getPositionY() ; j <= p.getPositionY() +3 ; j++ ) {
                    if (endroitEnCours.aDresseur(p.getPositionX(), j, Orientation.gauche) != null) {
                        Dresseur d = endroitEnCours.aDresseur(p.getPositionX(), j, Orientation.gauche);
                        for (int i = j ; i > p.getPositionY() ; i--) {
                            Position position = new Position(d.getPosition());
                            //d.setPosition(new Position(p.getPositionX(), i, p.getPositionZ(), p.getEndroit(), Orientation.gauche));
                            d.getPosition().setPositionY(i);
                            System.out.println("verifieDresseurAdverse => i = " + i);
                            System.out.println("verifieDresseurAdverse => position = " + position.toString());
                            System.out.println("verifieDresseurAdverse => d.getPosition() = " + d.getPosition().toString());
                            this.refreshAtPosition(position);
                            this.refreshAtPosition(d.getPosition());
                            this.attendre(400);
                        }
                        return d;
                    }
                }
                break;
            case droite:
                for (int j = p.getPositionY()-3 ; j <= p.getPositionY() ; j++ ) {
                    if (endroitEnCours.aDresseur(p.getPositionX(), j, Orientation.droite) != null) {
                        Dresseur d = endroitEnCours.aDresseur(p.getPositionX(), j, Orientation.droite);
                        for (int i = j ; i < p.getPositionY() ; i++) {
                            Position position = new Position(d.getPosition());
                            d.setPosition(new Position(p.getPositionX(), i, p.getPositionZ(), p.getEndroit(), Orientation.droite));
                            this.refreshAtPosition(position);
                            this.refreshAtPosition(d.getPosition());
                            this.attendre(300);
                        }
                        return d;
                    }
                }
                break;
            }
        }
        return null;
    }
    
    public Dresseur verifieDresseurACombattre() {
        Position p = new Position(this.perso.getPosition());
        switch (p.getOrientation()) {
            case face :
                p.reculer();
                break;
            case dos :
                p.avancer();
                break;
            case droite :
                p.droite();
                break;
            case gauche :
                p.gauche();
                break;
        }
        Endroit endroitEnCours = (Endroit) this.endroit;
        if (endroitEnCours.aDresseur(p.getPositionX(), p.getPositionY(), Orientation.face) != null) {
            return endroitEnCours.aDresseur(p.getPositionX(), p.getPositionY(), Orientation.face);
        }
        if (endroitEnCours.aDresseur(p.getPositionX(), p.getPositionY(), Orientation.dos) != null) {
            return endroitEnCours.aDresseur(p.getPositionX(), p.getPositionY(), Orientation.dos);
        }
        if (endroitEnCours.aDresseur(p.getPositionX(), p.getPositionY(), Orientation.droite) != null) {
            return endroitEnCours.aDresseur(p.getPositionX(), p.getPositionY(), Orientation.droite);
        }
        if (endroitEnCours.aDresseur(p.getPositionX(), p.getPositionY(), Orientation.gauche) != null) {
            return endroitEnCours.aDresseur(p.getPositionX(), p.getPositionY(), Orientation.gauche);
        }
        return null;
    }

    public mfiari.lib.game.personnage.Gens verifieGensAquiParler() {
        Position p = new Position(this.perso.getPosition());
        switch (p.getOrientation()) {
            case face :
                p.reculer();
                break;
            case dos :
                p.avancer();
                break;
            case droite :
                p.droite();
                break;
            case gauche :
                p.gauche();
                break;
        }
        return this.endroit.aGens(p);
    }

    public ObjetEndroit verifieObjetAObserver() {
        Position p = new Position(this.perso.getPosition());
        switch (p.getOrientation()) {
            case face :
                p.reculer();
                break;
            case dos :
                p.avancer();
                break;
            case droite :
                p.droite();
                break;
            case gauche :
                p.gauche();
                break;
        }
        return this.endroit.aObjetEndroit(p);
    }

    public void setChoixMenu(int choix) {
        this.choix = choix;
    }

    public Sac getSac() {
        return this.perso.getSac();
    }

    public mfiari.lib.game.ville.Endroit getEndroit() {
        return this.endroit;
    }

    private boolean gameOver() {
        if (!this.perso.aPokemon()) {
            this.pcsControlleurVue.firePropertyChange("perdu", null, null);
            this.perso.setPosition(this.dernierCentrePokemonVisite);
            this.endroit = this.dernierCentrePokemonVisite.getEndroit();
            this.pcsControlleurVue.firePropertyChange("afficheEndroit", null, null);
            this.perso.getEquipe().soin();
            return true;
            /*Demarrage d = new Demarrage();
            d.jeu();
            return true;*/
        }
        return false;
    }
}
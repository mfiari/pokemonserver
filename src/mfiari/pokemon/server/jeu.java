package mfiari.pokemon.server;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;
import mfiari.lib.game.reseau.Serveur;
import mfiari.lib.game.reseau.ServeurManager;
import mfiari.pokemon.server.demarrage.CreationPerso;
import mfiari.pokemon.server.demarrage.CreationPokemon;
import mfiari.pokemon.server.demarrage.CreationVille;
import mfiari.pokemon.server.network.ClientListener;
import mfiari.pokemon.server.network.User;

/**
 *
 * @author mike
 */
public class jeu {
    
    //programme principale du jeu, permet de jouer au jeu
    public static void main(String args[]) {
        Serveur serveur = new Serveur();
        serveur.lancerServeur(Global.port);
        ServeurManager manager = new ServeurManager();
        CreationPokemon creationPokemon = new CreationPokemon();
        CreationPerso creationPerso = new CreationPerso();
        CreationVille creationVille = new CreationVille();
        int id = 0;
        while (true) {
            if (serveur.clientArrive()) {
                User user = new User(++id);
                manager.ajouterClient(user, new ClientListener(serveur.getSocket(), manager, user));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(jeu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

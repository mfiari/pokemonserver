package mfiari.pokemon.server;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;
import mfiari.lib.game.reseau.Serveur;
import mfiari.lib.game.reseau.ServeurManager;
import mfiari.pokemon.core.network.User;
import mfiari.pokemon.server.network.ClientListener;

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

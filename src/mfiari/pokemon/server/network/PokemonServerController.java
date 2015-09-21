/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.network;

import mfiari.lib.game.reseau.NetworkObjectTranmetter;
import mfiari.lib.game.reseau.ServeurManager;
import mfiari.pokemon.server.PokemonJeu;

/**
 *
 * @author mike
 */
public class PokemonServerController {
    
    private final PokemonJeu jeu;
    private final ServeurManager manager;
    
    public PokemonServerController (ServeurManager manager) {
        this.jeu = new PokemonJeu();
        this.manager = manager;
    }
    
    public void notifyClientAction (NetworkObjectTranmetter objectTranmetter, mfiari.lib.game.reseau.ClientListener listener) {
        if (objectTranmetter != null) {
            System.out.println("notifyClientAction : " + objectTranmetter);
            switch (objectTranmetter.getMessage()) {
                case "choix" :
                    this.jeu.setChoixAction((int)objectTranmetter.getObject(), (ClientListener) listener);
                    break;
            }
            NetworkObjectTranmetter not = new NetworkObjectTranmetter("message from " + listener.getName(), objectTranmetter.getMessage());
            this.manager.notifyAllClient(not);
        }
    }
    
}

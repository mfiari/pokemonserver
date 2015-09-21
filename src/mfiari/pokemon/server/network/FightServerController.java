/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.server.network;

import java.net.Socket;
import mfiari.lib.game.reseau.NetworkObjectTranmetter;
import mfiari.lib.game.reseau.ServeurManager;
import mfiari.pokemon.server.combat.Combat;
import mfiari.pokemon.server.liste.ListeDeDresseur;
import mfiari.pokemon.server.perso.Dresseur;
import mfiari.pokemon.server.ville.Terrain;

/**
 *
 * @author mike
 */
public class FightServerController {
    
    private final Combat combat;
    private final Dresseur dresseur1;
    private final Dresseur dresseur2;
    private final User client;
    private final ServeurManager manager;
    
    public FightServerController (Terrain terrain, Dresseur dresseur1, Dresseur dresseur2, User client, ServeurManager manager) {
        this.combat = new Combat(terrain);
        this.dresseur1 = dresseur1;
        this.dresseur2 = dresseur2;
        this.client = client;
        this.manager = manager;
    }
    
    public void notifyClientAction (NetworkObjectTranmetter objectTranmetter, mfiari.lib.game.reseau.ClientListener listener) {
        if (objectTranmetter != null) {
            switch (objectTranmetter.getMessage()) {
                case "debut" :
                    this.combat.commencerCombat(new ListeDeDresseur(this.dresseur1), new ListeDeDresseur(this.dresseur2), Combat.TypeCombat.SIMPLEEXTRA);
                    break;
                default :
                    System.out.println(objectTranmetter);
                    this.manager.notifyClient(this.client, objectTranmetter);
                    break;
            }
            /*NetworkObjectTranmetter not = new NetworkObjectTranmetter("message from " + listener.getName(), objectTranmetter.getMessage());
            this.notifyAllClient(not);*/
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.connexionBD;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mfiari.lib.game.connexionBD.Methode;
import mfiari.lib.game.util.Config;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.CharacterSet;
import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;
import mfiari.pokemon.server.Global;
import org.restlet.resource.ResourceException;

/**
 *
 * @author etudiant
 */
public class TransfertDonnee extends Methode {
    
    private String WS_URL;
    
    public TransfertDonnee () {
        super(null);
        init();
    }
    
    private void init () {
        WS_URL = Config.getPropertie("ws.url");
    }
    
    private ClientResource sendPostData (String url, Form form) {
        ClientResource resource = new ClientResource(url);
        try {
            form.encode(CharacterSet.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(TransfertDonnee.class.getName()).log(Level.SEVERE, null, ex);
        }
        Representation rep = form.getWebRepresentation();
        ChallengeResponse authentication = new ChallengeResponse(ChallengeScheme.HTTP_BASIC,Global.webserviceLogin, Global.webserviceMdp);
        resource.setChallengeResponse(authentication);
        // Test du POST
        try {
            Representation result = resource.post(rep);
            System.out.println(result.getText());
        } catch (ResourceException | IOException exception) {
            Logger.getLogger(TransfertDonnee.class.getName()).log(Level.SEVERE, null, exception);
        }
        return resource;
    }
    
    public boolean connexion (String login, String password) {
        String url = WS_URL + "ws/login";
        Form form = new Form();
        form.add("login", login);
        form.add("password", password);
        ClientResource resource = this.sendPostData(url, form);
        if (resource == null) {
            return false;
        }
        System.out.println(resource.getStatus());
        return resource.getStatus().isSuccess();
    }
    
    public boolean create () {
        return false;
    }
    
    public void load () {
        
    }
    
}

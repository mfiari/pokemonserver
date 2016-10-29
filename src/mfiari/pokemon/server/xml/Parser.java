/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.xml;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import mfiari.pokemon.core.ville.Endroit;

/**
 *
 * @author mike
 */
public class Parser {
    
    public Endroit getEndroit () {
        Endroit endroit = null;
        URL url = getClass().getResource("quartier/quartierDresseur_bourgPalette.xml");
        File fichier = null;
        try {
            fichier = new File(url.toURI());
        } catch (URISyntaxException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(fichier);
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser sp = spf.newSAXParser();
            ParserQuartierXML myHandler = new ParserQuartierXML();
            System.out.println("debut parse");
            sp.parse(fichier, myHandler);
            System.out.println("fin parse");
            endroit = myHandler.getQuartier();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return endroit;
    }
    
}

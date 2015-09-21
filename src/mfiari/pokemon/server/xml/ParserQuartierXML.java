/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.xml;

import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.objet.ObjetEndroitPassage;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.core.objet.Type_objet;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.server.ville.Quartier;
import mfiari.pokemon.core.ville.Sol;
import mfiari.pokemon.server.ville.Terrain;
import mfiari.pokemon.server.ville.Terrains;

/**
 *
 * @author mike
 */
public class ParserQuartierXML extends DefaultHandler {

    private Attributes mCurrentAttList = null;
    private Quartier quartier = null;
    private ObjetEndroitPassage objet_endroit_passage = null;
    private boolean boucle = false;
    private String idBoucle = "";
    private int debut = 0;
    private int fin = 0;

    private Terrain getTerrainByTypeName (String type) {
        if (type.equals("normal")) {
            return Terrains.terrainNormal;
        } else {
            return Terrains.terrainNormal;
        }
    }

    private Sol getSolByTypeName (String type) {
        if (type.equals("herbe")) {
            return Sol.herbe;
        } else {
            return Sol.defaut;
        }
    }

    private Type_objet getTypeObjetByTypeName (String type) {
        switch (type) {
            case "chemin":
                return Type_objet.chemin;
            case "arbre":
                return Type_objet.arbre;
            default:
                return Type_objet.chemin;
        }
    }

    private Orientation getOrientationByTypeName (String type) {
        if (type.equals("dos")) {
            return Orientation.dos;
        } else {
            return Orientation.face;
        }
    }

    public Quartier getQuartier () {
        return this.quartier;
    }

    @Override
    public void startDocument() throws SAXException {
    }

    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        this.mCurrentAttList = atts;
        if (qName.equalsIgnoreCase("Quartier")) {
            this.quartier = new Quartier(this.mCurrentAttList.getValue("nom"), Integer.valueOf(this.mCurrentAttList.getValue("positionX")), 
                    Integer.valueOf(this.mCurrentAttList.getValue("positionY")), Integer.valueOf(this.mCurrentAttList.getValue("longueur")), 
                    Integer.valueOf(this.mCurrentAttList.getValue("largeur")), 
                    this.getTerrainByTypeName(this.mCurrentAttList.getValue("terrain")));
        } else if (qName.equalsIgnoreCase("sol")) {
            this.quartier.setSol(this.getSolByTypeName(this.mCurrentAttList.getValue("type")));
        } else if (qName.equalsIgnoreCase("Objet_endroit_passage")) {
            this.objet_endroit_passage = new ObjetEndroitPassage(this.getTypeObjetByTypeName(this.mCurrentAttList.getValue("Type_objet")), 
                    Integer.valueOf(this.mCurrentAttList.getValue("positionX")), Integer.valueOf(this.mCurrentAttList.getValue("positionY")), 
                    null);
        } else if (qName.equalsIgnoreCase("Position")) {
            Position p = new Position(Integer.valueOf(this.mCurrentAttList.getValue("positionX")), 
                    Integer.valueOf(this.mCurrentAttList.getValue("positionY")), Integer.valueOf(this.mCurrentAttList.getValue("positionZ")), 
                    null, this.getOrientationByTypeName(this.mCurrentAttList.getValue("orientation")));
            if (this.objet_endroit_passage != null) {
                this.objet_endroit_passage.setPositionArrive(p);
            }
        } else if (qName.equalsIgnoreCase("boucle")) {
            this.boucle = true;
            this.idBoucle = this.mCurrentAttList.getValue("id");
            this.debut = Integer.valueOf(this.mCurrentAttList.getValue("debut"));
            this.fin = Integer.valueOf(this.mCurrentAttList.getValue("fin"));
        } else if (qName.equalsIgnoreCase("Objet_endroit_classique")) {
            if (this.boucle) {
                for (int i = debut ; i < fin ; i++) {
                    ObjetEndroitClassique objet_endroit_classique;
                    if (this.mCurrentAttList.getValue("positionX").equals(this.idBoucle)) {
                        objet_endroit_classique = new ObjetEndroitClassique(
                            this.getTypeObjetByTypeName(this.mCurrentAttList.getValue("Type_objet")), i, 
                                Integer.valueOf(this.mCurrentAttList.getValue("positionY")));
                    } else {
                        objet_endroit_classique = new ObjetEndroitClassique(
                            this.getTypeObjetByTypeName(this.mCurrentAttList.getValue("Type_objet")), 
                                Integer.valueOf(this.mCurrentAttList.getValue("positionX")), i);
                    }
                    this.quartier.ajouterObjetEndroit(objet_endroit_classique);
                }
            }
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Objet_endroit_passage")) {
            this.quartier.ajouterObjetEndroit(this.objet_endroit_passage);
            this.objet_endroit_passage = null;
        } else if (qName.equalsIgnoreCase("boucle")) {
            this.boucle = false;
            this.idBoucle = "";
            this.debut = 0;
            this.fin = 0;
        }
    }
}

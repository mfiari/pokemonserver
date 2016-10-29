/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import mfiari.pokemon.core.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class ParserPokemon  extends DefaultHandler {

    private Pokemon pokemon;
    private Attributes mCurrentAttList = null;

    public Pokemon getPokemon () {
        return this.pokemon;
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
        if (qName.equalsIgnoreCase("pokemon")) {
        } else if (qName.equalsIgnoreCase("type")) {
        } else if (qName.equalsIgnoreCase("stat")) {
        } else if (qName.equalsIgnoreCase("capaciteSpe")) {
        } else if (qName.equalsIgnoreCase("capacite")) {
        } else if (qName.equalsIgnoreCase("evolution")) {
        } else if (qName.equalsIgnoreCase("description")) {
        } else if (qName.equalsIgnoreCase("capacites")) {
        } else if (qName.equalsIgnoreCase("base")) {
        } else if (qName.equalsIgnoreCase("endroits")) {
        } else if (qName.equalsIgnoreCase("endroit")) {
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.server.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author mike
 */
public class ParserEndroitXML extends DefaultHandler {

    private Attributes mCurrentAttList = null;

    @Override
    public void startDocument() throws SAXException {
    }

    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        this.mCurrentAttList = atts;
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
    }
    
}

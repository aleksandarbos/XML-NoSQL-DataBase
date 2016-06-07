//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.03 at 04:28:13 PM CEST 
//


package models.rs.gov.parlament.korisnici;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.gov.parlament.korisnici package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Odbornik_QNAME = new QName("http://www.parlament.gov.rs/korisnici", "Odbornik");
    private final static QName _Gradjanin_QNAME = new QName("http://www.parlament.gov.rs/korisnici", "Gradjanin");
    private final static QName _PredsednikSkupstine_QNAME = new QName("http://www.parlament.gov.rs/korisnici", "Predsednik_skupstine");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.gov.parlament.korisnici
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Korisnici }
     * 
     */
    public Korisnici createKorisnici() {
        return new Korisnici();
    }

    /**
     * Create an instance of {@link Gradjani }
     * 
     */
    public Gradjani createGradjani() {
        return new Gradjani();
    }

    /**
     * Create an instance of {@link GradjaninTip }
     * 
     */
    public GradjaninTip createGradjaninTip() {
        return new GradjaninTip();
    }

    /**
     * Create an instance of {@link Odbornici }
     * 
     */
    public Odbornici createOdbornici() {
        return new Odbornici();
    }

    /**
     * Create an instance of {@link OdbornikTip }
     * 
     */
    public OdbornikTip createOdbornikTip() {
        return new OdbornikTip();
    }

    /**
     * Create an instance of {@link PredsednikSkupstineTip }
     * 
     */
    public PredsednikSkupstineTip createPredsednikSkupstineTip() {
        return new PredsednikSkupstineTip();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdbornikTip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/korisnici", name = "Odbornik")
    public JAXBElement<OdbornikTip> createOdbornik(OdbornikTip value) {
        return new JAXBElement<OdbornikTip>(_Odbornik_QNAME, OdbornikTip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradjaninTip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/korisnici", name = "Gradjanin")
    public JAXBElement<GradjaninTip> createGradjanin(GradjaninTip value) {
        return new JAXBElement<GradjaninTip>(_Gradjanin_QNAME, GradjaninTip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredsednikSkupstineTip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/korisnici", name = "Predsednik_skupstine")
    public JAXBElement<PredsednikSkupstineTip> createPredsednikSkupstine(PredsednikSkupstineTip value) {
        return new JAXBElement<PredsednikSkupstineTip>(_PredsednikSkupstine_QNAME, PredsednikSkupstineTip.class, null, value);
    }

}
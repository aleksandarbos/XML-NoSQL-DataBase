//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.01 at 11:17:58 AM CEST 
//


package models.rs.gov.parlament.amandmani;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.gov.parlament.amandmani package. 
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

    private final static QName _PredsednikSkupstine_QNAME = new QName("http://www.parlament.gov.rs/amandmani", "Predsednik_skupstine");
    private final static QName _Gradjanin_QNAME = new QName("http://www.parlament.gov.rs/amandmani", "Gradjanin");
    private final static QName _Odbornik_QNAME = new QName("http://www.parlament.gov.rs/amandmani", "Odbornik");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.gov.parlament.amandmani
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Amandmani }
     * 
     */
    public Amandmani createAmandmani() {
        return new Amandmani();
    }

    /**
     * Create an instance of {@link Amandmani.Amandman }
     * 
     */
    public Amandmani.Amandman createAmandmaniAmandman() {
        return new Amandmani.Amandman();
    }

    /**
     * Create an instance of {@link Amandmani.Amandman.TekstZaIzmenu }
     * 
     */
    public Amandmani.Amandman.TekstZaIzmenu createAmandmaniAmandmanTekstZaIzmenu() {
        return new Amandmani.Amandman.TekstZaIzmenu();
    }

    /**
     * Create an instance of {@link PredsednikSkupstineTip }
     * 
     */
    public PredsednikSkupstineTip createPredsednikSkupstineTip() {
        return new PredsednikSkupstineTip();
    }

    /**
     * Create an instance of {@link GradjaninTip }
     * 
     */
    public GradjaninTip createGradjaninTip() {
        return new GradjaninTip();
    }

    /**
     * Create an instance of {@link OdbornikTip }
     * 
     */
    public OdbornikTip createOdbornikTip() {
        return new OdbornikTip();
    }

    /**
     * Create an instance of {@link Amandmani.Amandman.Saglasni }
     * 
     */
    public Amandmani.Amandman.Saglasni createAmandmaniAmandmanSaglasni() {
        return new Amandmani.Amandman.Saglasni();
    }

    /**
     * Create an instance of {@link Amandmani.Amandman.TekstZaIzmenu.Izmena }
     * 
     */
    public Amandmani.Amandman.TekstZaIzmenu.Izmena createAmandmaniAmandmanTekstZaIzmenuIzmena() {
        return new Amandmani.Amandman.TekstZaIzmenu.Izmena();
    }

    /**
     * Create an instance of {@link Amandmani.Amandman.TekstZaIzmenu.Dopuna }
     * 
     */
    public Amandmani.Amandman.TekstZaIzmenu.Dopuna createAmandmaniAmandmanTekstZaIzmenuDopuna() {
        return new Amandmani.Amandman.TekstZaIzmenu.Dopuna();
    }

    /**
     * Create an instance of {@link Amandmani.Amandman.TekstZaIzmenu.Brisanje }
     * 
     */
    public Amandmani.Amandman.TekstZaIzmenu.Brisanje createAmandmaniAmandmanTekstZaIzmenuBrisanje() {
        return new Amandmani.Amandman.TekstZaIzmenu.Brisanje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredsednikSkupstineTip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/amandmani", name = "Predsednik_skupstine")
    public JAXBElement<PredsednikSkupstineTip> createPredsednikSkupstine(PredsednikSkupstineTip value) {
        return new JAXBElement<PredsednikSkupstineTip>(_PredsednikSkupstine_QNAME, PredsednikSkupstineTip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradjaninTip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/amandmani", name = "Gradjanin")
    public JAXBElement<GradjaninTip> createGradjanin(GradjaninTip value) {
        return new JAXBElement<GradjaninTip>(_Gradjanin_QNAME, GradjaninTip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdbornikTip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.parlament.gov.rs/amandmani", name = "Odbornik")
    public JAXBElement<OdbornikTip> createOdbornik(OdbornikTip value) {
        return new JAXBElement<OdbornikTip>(_Odbornik_QNAME, OdbornikTip.class, null, value);
    }

}

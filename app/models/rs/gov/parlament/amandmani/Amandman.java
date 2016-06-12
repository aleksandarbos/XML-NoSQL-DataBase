//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.12 at 03:47:13 PM CEST 
//


package models.rs.gov.parlament.amandmani;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import models.rs.gov.parlament.propisi.Clan;
import models.rs.gov.parlament.propisi.Propis;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.parlament.gov.rs/amandmani}Preambula"/>
 *         &lt;element name="Naziv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Deo_za_izmenu">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.parlament.gov.rs/propisi}Propis"/>
 *                   &lt;element ref="{http://www.parlament.gov.rs/propisi}Clan"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sadrzaj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Obrazlozenje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Oznaka" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "preambula",
    "naziv",
    "deoZaIzmenu",
    "sadrzaj",
    "obrazlozenje"
})
@XmlRootElement(name = "Amandman")
public class Amandman {

    @XmlElement(name = "Preambula", required = true)
    protected Preambula preambula;
    @XmlElement(name = "Naziv", required = true)
    protected String naziv;
    @XmlElement(name = "Deo_za_izmenu", required = true)
    protected Amandman.DeoZaIzmenu deoZaIzmenu;
    @XmlElement(name = "Sadrzaj", required = true)
    protected String sadrzaj;
    @XmlElement(name = "Obrazlozenje", required = true)
    protected String obrazlozenje;
    @XmlAttribute(name = "Oznaka", required = true)
    protected int oznaka;

    /**
     * Gets the value of the preambula property.
     * 
     * @return
     *     possible object is
     *     {@link Preambula }
     *     
     */
    public Preambula getPreambula() {
        return preambula;
    }

    /**
     * Sets the value of the preambula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preambula }
     *     
     */
    public void setPreambula(Preambula value) {
        this.preambula = value;
    }

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the deoZaIzmenu property.
     * 
     * @return
     *     possible object is
     *     {@link Amandman.DeoZaIzmenu }
     *     
     */
    public Amandman.DeoZaIzmenu getDeoZaIzmenu() {
        return deoZaIzmenu;
    }

    /**
     * Sets the value of the deoZaIzmenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amandman.DeoZaIzmenu }
     *     
     */
    public void setDeoZaIzmenu(Amandman.DeoZaIzmenu value) {
        this.deoZaIzmenu = value;
    }

    /**
     * Gets the value of the sadrzaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSadrzaj() {
        return sadrzaj;
    }

    /**
     * Sets the value of the sadrzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSadrzaj(String value) {
        this.sadrzaj = value;
    }

    /**
     * Gets the value of the obrazlozenje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObrazlozenje() {
        return obrazlozenje;
    }

    /**
     * Sets the value of the obrazlozenje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObrazlozenje(String value) {
        this.obrazlozenje = value;
    }

    /**
     * Gets the value of the oznaka property.
     * 
     */
    public int getOznaka() {
        return oznaka;
    }

    /**
     * Sets the value of the oznaka property.
     * 
     */
    public void setOznaka(int value) {
        this.oznaka = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.parlament.gov.rs/propisi}Propis"/>
     *         &lt;element ref="{http://www.parlament.gov.rs/propisi}Clan"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "propis",
        "clan"
    })
    public static class DeoZaIzmenu {

        @XmlElement(name = "Propis", namespace = "http://www.parlament.gov.rs/propisi", required = true)
        protected Propis propis;
        @XmlElement(name = "Clan", namespace = "http://www.parlament.gov.rs/propisi", required = true)
        protected Clan clan;

        /**
         * Gets the value of the propis property.
         * 
         * @return
         *     possible object is
         *     {@link Propis }
         *     
         */
        public Propis getPropis() {
            return propis;
        }

        /**
         * Sets the value of the propis property.
         * 
         * @param value
         *     allowed object is
         *     {@link Propis }
         *     
         */
        public void setPropis(Propis value) {
            this.propis = value;
        }

        /**
         * Gets the value of the clan property.
         * 
         * @return
         *     possible object is
         *     {@link Clan }
         *     
         */
        public Clan getClan() {
            return clan;
        }

        /**
         * Sets the value of the clan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Clan }
         *     
         */
        public void setClan(Clan value) {
            this.clan = value;
        }

    }

}

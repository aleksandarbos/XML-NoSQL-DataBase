//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.03 at 04:28:13 PM CEST 
//


package models.rs.gov.parlament.propisi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi}Odeljak" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi}Clan" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Redni_broj_odeljka" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Naziv_odeljka" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "odeljak",
    "clan"
})
@XmlRootElement(name = "Odeljak")
public class Odeljak {

    @XmlElement(name = "Odeljak")
    protected List<Odeljak> odeljak;
    @XmlElement(name = "Clan", required = true)
    protected List<Clan> clan;
    @XmlAttribute(name = "Redni_broj_odeljka")
    protected Integer redniBrojOdeljka;
    @XmlAttribute(name = "Naziv_odeljka")
    protected String nazivOdeljka;

    /**
     * Gets the value of the odeljak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odeljak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdeljak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Odeljak }
     * 
     * 
     */
    public List<Odeljak> getOdeljak() {
        if (odeljak == null) {
            odeljak = new ArrayList<Odeljak>();
        }
        return this.odeljak;
    }

    /**
     * Gets the value of the clan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clan }
     * 
     * 
     */
    public List<Clan> getClan() {
        if (clan == null) {
            clan = new ArrayList<Clan>();
        }
        return this.clan;
    }

    /**
     * Gets the value of the redniBrojOdeljka property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRedniBrojOdeljka() {
        return redniBrojOdeljka;
    }

    /**
     * Sets the value of the redniBrojOdeljka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRedniBrojOdeljka(Integer value) {
        this.redniBrojOdeljka = value;
    }

    /**
     * Gets the value of the nazivOdeljka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivOdeljka() {
        return nazivOdeljka;
    }

    /**
     * Sets the value of the nazivOdeljka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivOdeljka(String value) {
        this.nazivOdeljka = value;
    }

}

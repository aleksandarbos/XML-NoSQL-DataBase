//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 10:46:39 AM CEST 
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
 *         &lt;element ref="{http://www.parlament.gov.rs/propisi}Stav" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Oznaka_clana" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Naziv_clana" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stav"
})
@XmlRootElement(name = "Clan")
public class Clan {

    @XmlElement(name = "Stav", required = true)
    protected List<StavTip> stav;
    @XmlAttribute(name = "Oznaka_clana", required = true)
    protected int oznakaClana;
    @XmlAttribute(name = "Naziv_clana")
    protected String nazivClana;

    /**
     * Gets the value of the stav property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stav property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStav().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StavTip }
     * 
     * 
     */
    public List<StavTip> getStav() {
        if (stav == null) {
            stav = new ArrayList<StavTip>();
        }
        return this.stav;
    }

    /**
     * Gets the value of the oznakaClana property.
     * 
     */
    public int getOznakaClana() {
        return oznakaClana;
    }

    /**
     * Sets the value of the oznakaClana property.
     * 
     */
    public void setOznakaClana(int value) {
        this.oznakaClana = value;
    }

    /**
     * Gets the value of the nazivClana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivClana() {
        return nazivClana;
    }

    /**
     * Sets the value of the nazivClana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivClana(String value) {
        this.nazivClana = value;
    }

}

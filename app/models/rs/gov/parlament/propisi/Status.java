//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.03 at 04:28:13 PM CEST 
//


package models.rs.gov.parlament.propisi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;choice>
 *         &lt;element name="U_pripremi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Na_razmatranju" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Usvojen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Stupio_na_snagu" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uPripremi",
    "naRazmatranju",
    "usvojen",
    "stupioNaSnagu"
})
@XmlRootElement(name = "Status")
public class Status {

    @XmlElement(name = "U_pripremi")
    protected Boolean uPripremi;
    @XmlElement(name = "Na_razmatranju")
    protected Boolean naRazmatranju;
    @XmlElement(name = "Usvojen")
    protected Boolean usvojen;
    @XmlElement(name = "Stupio_na_snagu")
    protected Boolean stupioNaSnagu;

    /**
     * Gets the value of the uPripremi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUPripremi() {
        return uPripremi;
    }

    /**
     * Sets the value of the uPripremi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUPripremi(Boolean value) {
        this.uPripremi = value;
    }

    /**
     * Gets the value of the naRazmatranju property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNaRazmatranju() {
        return naRazmatranju;
    }

    /**
     * Sets the value of the naRazmatranju property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNaRazmatranju(Boolean value) {
        this.naRazmatranju = value;
    }

    /**
     * Gets the value of the usvojen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsvojen() {
        return usvojen;
    }

    /**
     * Sets the value of the usvojen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsvojen(Boolean value) {
        this.usvojen = value;
    }

    /**
     * Gets the value of the stupioNaSnagu property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStupioNaSnagu() {
        return stupioNaSnagu;
    }

    /**
     * Sets the value of the stupioNaSnagu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStupioNaSnagu(Boolean value) {
        this.stupioNaSnagu = value;
    }

}

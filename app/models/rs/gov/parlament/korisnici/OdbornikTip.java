//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.03 at 04:28:13 PM CEST 
//


package models.rs.gov.parlament.korisnici;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Odbornik_tip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Odbornik_tip">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.parlament.gov.rs/korisnici}Gradjanin_tip">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Odbornik_tip")
@XmlSeeAlso({
    PredsednikSkupstineTip.class
})
public class OdbornikTip
    extends GradjaninTip
{


}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 10:46:39 AM CEST 
//


package models.rs.gov.parlament.propisi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status_akta.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status_akta">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREDLOZEN"/>
 *     &lt;enumeration value="PRIHVACEN"/>
 *     &lt;enumeration value="ODBIJEN"/>
 *     &lt;enumeration value="OBJAVLJEN"/>
 *     &lt;enumeration value="U_PRIMENI"/>
 *     &lt;enumeration value="VAN_SNAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Status_akta")
@XmlEnum
public enum StatusAkta {

    PREDLOZEN,
    PRIHVACEN,
    ODBIJEN,
    OBJAVLJEN,
    U_PRIMENI,
    VAN_SNAGE;

    public String value() {
        return name();
    }

    public static StatusAkta fromValue(String v) {
        return valueOf(v);
    }

}

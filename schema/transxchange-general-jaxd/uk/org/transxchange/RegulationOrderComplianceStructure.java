//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.10 at 10:57:01 PM GMT 
//


package uk.org.transxchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ShortNoticeRegistration results from a requirement to comply either with traffic regulation conditions, or a road traffic order made by a local authority.
 * 
 * <p>Java class for RegulationOrderComplianceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationOrderComplianceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrafficOrderNote" type="{http://www.transxchange.org.uk/}NaturalLanguageStringStructure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationOrderComplianceStructure", propOrder = {
    "trafficOrderNote"
})
public class RegulationOrderComplianceStructure {

    @XmlElement(name = "TrafficOrderNote", required = true)
    protected NaturalLanguageStringStructure trafficOrderNote;

    /**
     * Gets the value of the trafficOrderNote property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getTrafficOrderNote() {
        return trafficOrderNote;
    }

    /**
     * Sets the value of the trafficOrderNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setTrafficOrderNote(NaturalLanguageStringStructure value) {
        this.trafficOrderNote = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.10 at 10:51:42 PM GMT 
//


package uk.org.naptan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of one or more stop areas.
 * 
 * <p>Java class for StopAreasStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopAreasStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopArea" type="{http://www.naptan.org.uk/}StopAreaStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopAreasStructure", propOrder = {
    "stopArea"
})
public class StopAreasStructure {

    @XmlElement(name = "StopArea", required = true)
    protected List<StopAreaStructure> stopArea;

    /**
     * Gets the value of the stopArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopAreaStructure }
     * 
     * 
     */
    public List<StopAreaStructure> getStopArea() {
        if (stopArea == null) {
            stopArea = new ArrayList<StopAreaStructure>();
        }
        return this.stopArea;
    }

}

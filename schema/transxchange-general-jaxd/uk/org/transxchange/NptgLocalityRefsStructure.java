//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.10 at 10:57:01 PM GMT 
//


package uk.org.transxchange;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of one or more references to NPTG localities.
 * 
 * <p>Java class for NptgLocalityRefsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NptgLocalityRefsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NptgLocalityRef" type="{http://www.transxchange.org.uk/}NptgLocalityVersionedRefStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NptgLocalityRefsStructure", propOrder = {
    "nptgLocalityRef"
})
public class NptgLocalityRefsStructure {

    @XmlElement(name = "NptgLocalityRef", required = true)
    protected List<NptgLocalityVersionedRefStructure> nptgLocalityRef;

    /**
     * Gets the value of the nptgLocalityRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nptgLocalityRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNptgLocalityRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NptgLocalityVersionedRefStructure }
     * 
     * 
     */
    public List<NptgLocalityVersionedRefStructure> getNptgLocalityRef() {
        if (nptgLocalityRef == null) {
            nptgLocalityRef = new ArrayList<NptgLocalityVersionedRefStructure>();
        }
        return this.nptgLocalityRef;
    }

}

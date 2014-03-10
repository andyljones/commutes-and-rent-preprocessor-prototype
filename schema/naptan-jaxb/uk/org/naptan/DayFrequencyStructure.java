//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.10 at 10:51:42 PM GMT 
//


package uk.org.naptan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * The scheduled time gap between departures for a frequency-based service. Minimum and maximum time gaps can also be specified.
 * 
 * <p>Java class for DayFrequencyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayFrequencyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ScheduledFrequency" type="{http://www.naptan.org.uk/}DayTimeDurationType"/>
 *         &lt;element name="MinimumFrequency" type="{http://www.naptan.org.uk/}DayTimeDurationType" minOccurs="0"/>
 *         &lt;element name="MaximumFrequency" type="{http://www.naptan.org.uk/}DayTimeDurationType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayFrequencyStructure", propOrder = {

})
public class DayFrequencyStructure {

    @XmlElement(name = "ScheduledFrequency", required = true)
    protected Duration scheduledFrequency;
    @XmlElement(name = "MinimumFrequency")
    protected Duration minimumFrequency;
    @XmlElement(name = "MaximumFrequency")
    protected Duration maximumFrequency;

    /**
     * Gets the value of the scheduledFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getScheduledFrequency() {
        return scheduledFrequency;
    }

    /**
     * Sets the value of the scheduledFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setScheduledFrequency(Duration value) {
        this.scheduledFrequency = value;
    }

    /**
     * Gets the value of the minimumFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumFrequency() {
        return minimumFrequency;
    }

    /**
     * Sets the value of the minimumFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumFrequency(Duration value) {
        this.minimumFrequency = value;
    }

    /**
     * Gets the value of the maximumFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumFrequency() {
        return maximumFrequency;
    }

    /**
     * Sets the value of the maximumFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumFrequency(Duration value) {
        this.maximumFrequency = value;
    }

}

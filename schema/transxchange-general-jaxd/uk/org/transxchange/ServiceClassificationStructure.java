//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.10 at 10:57:01 PM GMT 
//


package uk.org.transxchange;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Classification of the type of service for statutory purposes.
 * 
 * <p>Java class for ServiceClassificationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceClassificationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="NormalStopping" type="{http://www.transxchange.org.uk/}EmptyType" minOccurs="0"/>
 *           &lt;element name="LimitedStops" type="{http://www.transxchange.org.uk/}EmptyType" minOccurs="0"/>
 *           &lt;element name="HailAndRide" type="{http://www.transxchange.org.uk/}EmptyType" minOccurs="0"/>
 *           &lt;element name="Flexible" type="{http://www.transxchange.org.uk/}EmptyType" minOccurs="0"/>
 *           &lt;element name="ExcursionOrTour" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="MaxDepartures" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;choice>
 *           &lt;element name="SchoolOrWorks" type="{http://www.transxchange.org.uk/}EmptyType" minOccurs="0"/>
 *           &lt;element name="RuralService" type="{http://www.transxchange.org.uk/}EmptyType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="OtherService" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.transxchange.org.uk/}NaturalLanguageStringStructure"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceClassificationStructure", propOrder = {
    "normalStopping",
    "limitedStops",
    "hailAndRide",
    "flexible",
    "excursionOrTour",
    "schoolOrWorks",
    "ruralService",
    "otherService"
})
public class ServiceClassificationStructure {

    @XmlElement(name = "NormalStopping")
    protected String normalStopping;
    @XmlElement(name = "LimitedStops")
    protected String limitedStops;
    @XmlElement(name = "HailAndRide")
    protected String hailAndRide;
    @XmlElement(name = "Flexible")
    protected String flexible;
    @XmlElement(name = "ExcursionOrTour")
    protected ServiceClassificationStructure.ExcursionOrTour excursionOrTour;
    @XmlElement(name = "SchoolOrWorks")
    protected String schoolOrWorks;
    @XmlElement(name = "RuralService")
    protected String ruralService;
    @XmlElement(name = "OtherService")
    protected ServiceClassificationStructure.OtherService otherService;

    /**
     * Gets the value of the normalStopping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalStopping() {
        return normalStopping;
    }

    /**
     * Sets the value of the normalStopping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalStopping(String value) {
        this.normalStopping = value;
    }

    /**
     * Gets the value of the limitedStops property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitedStops() {
        return limitedStops;
    }

    /**
     * Sets the value of the limitedStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitedStops(String value) {
        this.limitedStops = value;
    }

    /**
     * Gets the value of the hailAndRide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHailAndRide() {
        return hailAndRide;
    }

    /**
     * Sets the value of the hailAndRide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHailAndRide(String value) {
        this.hailAndRide = value;
    }

    /**
     * Gets the value of the flexible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexible() {
        return flexible;
    }

    /**
     * Sets the value of the flexible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexible(String value) {
        this.flexible = value;
    }

    /**
     * Gets the value of the excursionOrTour property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceClassificationStructure.ExcursionOrTour }
     *     
     */
    public ServiceClassificationStructure.ExcursionOrTour getExcursionOrTour() {
        return excursionOrTour;
    }

    /**
     * Sets the value of the excursionOrTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceClassificationStructure.ExcursionOrTour }
     *     
     */
    public void setExcursionOrTour(ServiceClassificationStructure.ExcursionOrTour value) {
        this.excursionOrTour = value;
    }

    /**
     * Gets the value of the schoolOrWorks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolOrWorks() {
        return schoolOrWorks;
    }

    /**
     * Sets the value of the schoolOrWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolOrWorks(String value) {
        this.schoolOrWorks = value;
    }

    /**
     * Gets the value of the ruralService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuralService() {
        return ruralService;
    }

    /**
     * Sets the value of the ruralService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuralService(String value) {
        this.ruralService = value;
    }

    /**
     * Gets the value of the otherService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceClassificationStructure.OtherService }
     *     
     */
    public ServiceClassificationStructure.OtherService getOtherService() {
        return otherService;
    }

    /**
     * Sets the value of the otherService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceClassificationStructure.OtherService }
     *     
     */
    public void setOtherService(ServiceClassificationStructure.OtherService value) {
        this.otherService = value;
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
     *         &lt;element name="MaxDepartures" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "maxDepartures"
    })
    public static class ExcursionOrTour {

        @XmlElement(name = "MaxDepartures", required = true)
        protected BigInteger maxDepartures;

        /**
         * Gets the value of the maxDepartures property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxDepartures() {
            return maxDepartures;
        }

        /**
         * Sets the value of the maxDepartures property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxDepartures(BigInteger value) {
            this.maxDepartures = value;
        }

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
     *         &lt;element name="Description" type="{http://www.transxchange.org.uk/}NaturalLanguageStringStructure"/>
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
        "description"
    })
    public static class OtherService {

        @XmlElement(name = "Description", required = true)
        protected NaturalLanguageStringStructure description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link NaturalLanguageStringStructure }
         *     
         */
        public NaturalLanguageStringStructure getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link NaturalLanguageStringStructure }
         *     
         */
        public void setDescription(NaturalLanguageStringStructure value) {
            this.description = value;
        }

    }

}

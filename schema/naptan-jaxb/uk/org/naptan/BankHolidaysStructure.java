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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A collection of specific bank holidays.
 * 
 * <p>Java class for BankHolidaysStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankHolidaysStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.naptan.org.uk/}AllBankHolidaysGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.naptan.org.uk/}EarlyRunOffGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankHolidaysStructure", propOrder = {
    "allBankHolidays",
    "christmas",
    "christmasDay",
    "boxingDay",
    "allHolidaysExceptChristmas",
    "goodFriday",
    "newYearsDay",
    "jan2NdScotland",
    "holidayMondays",
    "lateSummerBankHolidayNotScotland",
    "mayDay",
    "easterMonday",
    "springBank",
    "augustBankHolidayScotland",
    "displacementHolidays",
    "christmasDayHoliday",
    "boxingDayHoliday",
    "newYearsDayHoliday",
    "otherPublicHoliday",
    "earlyRunOffDays",
    "christmasEve",
    "newYearsEve"
})
public class BankHolidaysStructure {

    @XmlElement(name = "AllBankHolidays")
    protected String allBankHolidays;
    @XmlElement(name = "Christmas")
    protected String christmas;
    @XmlElement(name = "ChristmasDay")
    protected String christmasDay;
    @XmlElement(name = "BoxingDay")
    protected String boxingDay;
    @XmlElement(name = "AllHolidaysExceptChristmas")
    protected String allHolidaysExceptChristmas;
    @XmlElement(name = "GoodFriday")
    protected String goodFriday;
    @XmlElement(name = "NewYearsDay")
    protected String newYearsDay;
    @XmlElement(name = "Jan2ndScotland")
    protected String jan2NdScotland;
    @XmlElement(name = "HolidayMondays")
    protected String holidayMondays;
    @XmlElement(name = "LateSummerBankHolidayNotScotland")
    protected String lateSummerBankHolidayNotScotland;
    @XmlElement(name = "MayDay")
    protected String mayDay;
    @XmlElement(name = "EasterMonday")
    protected String easterMonday;
    @XmlElement(name = "SpringBank")
    protected String springBank;
    @XmlElement(name = "AugustBankHolidayScotland")
    protected String augustBankHolidayScotland;
    @XmlElement(name = "DisplacementHolidays")
    protected String displacementHolidays;
    @XmlElement(name = "ChristmasDayHoliday")
    protected String christmasDayHoliday;
    @XmlElement(name = "BoxingDayHoliday")
    protected String boxingDayHoliday;
    @XmlElement(name = "NewYearsDayHoliday")
    protected String newYearsDayHoliday;
    @XmlElement(name = "OtherPublicHoliday")
    protected List<BankHolidaysStructure.OtherPublicHoliday> otherPublicHoliday;
    @XmlElement(name = "EarlyRunOffDays")
    protected String earlyRunOffDays;
    @XmlElement(name = "ChristmasEve")
    protected String christmasEve;
    @XmlElement(name = "NewYearsEve")
    protected String newYearsEve;

    /**
     * Gets the value of the allBankHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllBankHolidays() {
        return allBankHolidays;
    }

    /**
     * Sets the value of the allBankHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllBankHolidays(String value) {
        this.allBankHolidays = value;
    }

    /**
     * Gets the value of the christmas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChristmas() {
        return christmas;
    }

    /**
     * Sets the value of the christmas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChristmas(String value) {
        this.christmas = value;
    }

    /**
     * Gets the value of the christmasDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChristmasDay() {
        return christmasDay;
    }

    /**
     * Sets the value of the christmasDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChristmasDay(String value) {
        this.christmasDay = value;
    }

    /**
     * Gets the value of the boxingDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxingDay() {
        return boxingDay;
    }

    /**
     * Sets the value of the boxingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxingDay(String value) {
        this.boxingDay = value;
    }

    /**
     * Gets the value of the allHolidaysExceptChristmas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllHolidaysExceptChristmas() {
        return allHolidaysExceptChristmas;
    }

    /**
     * Sets the value of the allHolidaysExceptChristmas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllHolidaysExceptChristmas(String value) {
        this.allHolidaysExceptChristmas = value;
    }

    /**
     * Gets the value of the goodFriday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodFriday() {
        return goodFriday;
    }

    /**
     * Sets the value of the goodFriday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodFriday(String value) {
        this.goodFriday = value;
    }

    /**
     * Gets the value of the newYearsDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewYearsDay() {
        return newYearsDay;
    }

    /**
     * Sets the value of the newYearsDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewYearsDay(String value) {
        this.newYearsDay = value;
    }

    /**
     * Gets the value of the jan2NdScotland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJan2NdScotland() {
        return jan2NdScotland;
    }

    /**
     * Sets the value of the jan2NdScotland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJan2NdScotland(String value) {
        this.jan2NdScotland = value;
    }

    /**
     * Gets the value of the holidayMondays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayMondays() {
        return holidayMondays;
    }

    /**
     * Sets the value of the holidayMondays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayMondays(String value) {
        this.holidayMondays = value;
    }

    /**
     * Gets the value of the lateSummerBankHolidayNotScotland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateSummerBankHolidayNotScotland() {
        return lateSummerBankHolidayNotScotland;
    }

    /**
     * Sets the value of the lateSummerBankHolidayNotScotland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateSummerBankHolidayNotScotland(String value) {
        this.lateSummerBankHolidayNotScotland = value;
    }

    /**
     * Gets the value of the mayDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMayDay() {
        return mayDay;
    }

    /**
     * Sets the value of the mayDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMayDay(String value) {
        this.mayDay = value;
    }

    /**
     * Gets the value of the easterMonday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEasterMonday() {
        return easterMonday;
    }

    /**
     * Sets the value of the easterMonday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEasterMonday(String value) {
        this.easterMonday = value;
    }

    /**
     * Gets the value of the springBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpringBank() {
        return springBank;
    }

    /**
     * Sets the value of the springBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpringBank(String value) {
        this.springBank = value;
    }

    /**
     * Gets the value of the augustBankHolidayScotland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAugustBankHolidayScotland() {
        return augustBankHolidayScotland;
    }

    /**
     * Sets the value of the augustBankHolidayScotland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAugustBankHolidayScotland(String value) {
        this.augustBankHolidayScotland = value;
    }

    /**
     * Gets the value of the displacementHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplacementHolidays() {
        return displacementHolidays;
    }

    /**
     * Sets the value of the displacementHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplacementHolidays(String value) {
        this.displacementHolidays = value;
    }

    /**
     * Gets the value of the christmasDayHoliday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChristmasDayHoliday() {
        return christmasDayHoliday;
    }

    /**
     * Sets the value of the christmasDayHoliday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChristmasDayHoliday(String value) {
        this.christmasDayHoliday = value;
    }

    /**
     * Gets the value of the boxingDayHoliday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxingDayHoliday() {
        return boxingDayHoliday;
    }

    /**
     * Sets the value of the boxingDayHoliday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxingDayHoliday(String value) {
        this.boxingDayHoliday = value;
    }

    /**
     * Gets the value of the newYearsDayHoliday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewYearsDayHoliday() {
        return newYearsDayHoliday;
    }

    /**
     * Sets the value of the newYearsDayHoliday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewYearsDayHoliday(String value) {
        this.newYearsDayHoliday = value;
    }

    /**
     * Gets the value of the otherPublicHoliday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPublicHoliday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPublicHoliday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankHolidaysStructure.OtherPublicHoliday }
     * 
     * 
     */
    public List<BankHolidaysStructure.OtherPublicHoliday> getOtherPublicHoliday() {
        if (otherPublicHoliday == null) {
            otherPublicHoliday = new ArrayList<BankHolidaysStructure.OtherPublicHoliday>();
        }
        return this.otherPublicHoliday;
    }

    /**
     * Gets the value of the earlyRunOffDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyRunOffDays() {
        return earlyRunOffDays;
    }

    /**
     * Sets the value of the earlyRunOffDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyRunOffDays(String value) {
        this.earlyRunOffDays = value;
    }

    /**
     * Gets the value of the christmasEve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChristmasEve() {
        return christmasEve;
    }

    /**
     * Sets the value of the christmasEve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChristmasEve(String value) {
        this.christmasEve = value;
    }

    /**
     * Gets the value of the newYearsEve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewYearsEve() {
        return newYearsEve;
    }

    /**
     * Sets the value of the newYearsEve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewYearsEve(String value) {
        this.newYearsEve = value;
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
     *         &lt;element name="Description" type="{http://www.naptan.org.uk/}NaturalLanguageStringStructure"/>
     *         &lt;element name="Date" type="{http://www.naptan.org.uk/}DateType" minOccurs="0"/>
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
        "description",
        "date"
    })
    public static class OtherPublicHoliday {

        @XmlElement(name = "Description", required = true)
        protected NaturalLanguageStringStructure description;
        @XmlElement(name = "Date")
        protected XMLGregorianCalendar date;

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

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }

}

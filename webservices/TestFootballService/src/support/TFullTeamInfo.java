
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tFullTeamInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tFullTeamInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCountryFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCountryFlagLarge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sCoach" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iCompeted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sGoalKeepers" type="{http://footballpool.dataaccess.eu}ArrayOfString"/>
 *         &lt;element name="sDefenders" type="{http://footballpool.dataaccess.eu}ArrayOfString"/>
 *         &lt;element name="sMidFields" type="{http://footballpool.dataaccess.eu}ArrayOfString"/>
 *         &lt;element name="sForwards" type="{http://footballpool.dataaccess.eu}ArrayOfString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFullTeamInfo", propOrder = {
    "sName",
    "sCountryFlag",
    "sCountryFlagLarge",
    "sCoach",
    "iCompeted",
    "sGoalKeepers",
    "sDefenders",
    "sMidFields",
    "sForwards"
})
public class TFullTeamInfo {

    @XmlElement(required = true)
    protected String sName;
    @XmlElement(required = true)
    protected String sCountryFlag;
    @XmlElement(required = true)
    protected String sCountryFlagLarge;
    @XmlElement(required = true)
    protected String sCoach;
    protected int iCompeted;
    @XmlElement(required = true)
    protected ArrayOfString sGoalKeepers;
    @XmlElement(required = true)
    protected ArrayOfString sDefenders;
    @XmlElement(required = true)
    protected ArrayOfString sMidFields;
    @XmlElement(required = true)
    protected ArrayOfString sForwards;

    /**
     * Recupera il valore della proprietà sName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Imposta il valore della proprietà sName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Recupera il valore della proprietà sCountryFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryFlag() {
        return sCountryFlag;
    }

    /**
     * Imposta il valore della proprietà sCountryFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryFlag(String value) {
        this.sCountryFlag = value;
    }

    /**
     * Recupera il valore della proprietà sCountryFlagLarge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryFlagLarge() {
        return sCountryFlagLarge;
    }

    /**
     * Imposta il valore della proprietà sCountryFlagLarge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryFlagLarge(String value) {
        this.sCountryFlagLarge = value;
    }

    /**
     * Recupera il valore della proprietà sCoach.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCoach() {
        return sCoach;
    }

    /**
     * Imposta il valore della proprietà sCoach.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCoach(String value) {
        this.sCoach = value;
    }

    /**
     * Recupera il valore della proprietà iCompeted.
     * 
     */
    public int getICompeted() {
        return iCompeted;
    }

    /**
     * Imposta il valore della proprietà iCompeted.
     * 
     */
    public void setICompeted(int value) {
        this.iCompeted = value;
    }

    /**
     * Recupera il valore della proprietà sGoalKeepers.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSGoalKeepers() {
        return sGoalKeepers;
    }

    /**
     * Imposta il valore della proprietà sGoalKeepers.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSGoalKeepers(ArrayOfString value) {
        this.sGoalKeepers = value;
    }

    /**
     * Recupera il valore della proprietà sDefenders.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSDefenders() {
        return sDefenders;
    }

    /**
     * Imposta il valore della proprietà sDefenders.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSDefenders(ArrayOfString value) {
        this.sDefenders = value;
    }

    /**
     * Recupera il valore della proprietà sMidFields.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSMidFields() {
        return sMidFields;
    }

    /**
     * Imposta il valore della proprietà sMidFields.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSMidFields(ArrayOfString value) {
        this.sMidFields = value;
    }

    /**
     * Recupera il valore della proprietà sForwards.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSForwards() {
        return sForwards;
    }

    /**
     * Imposta il valore della proprietà sForwards.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSForwards(ArrayOfString value) {
        this.sForwards = value;
    }

}

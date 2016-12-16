
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per tCardInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tCardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGame" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="iMinute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sGameTeam1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sGameTeam2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sPlayerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bYellowCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bRedCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sGameTeam1Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sGameTeam1FlagLarge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sGameTeam2Flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sGameTeam2FlagLarge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sPlayerFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sPlayerFlagLarge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCardInfo", propOrder = {
    "dGame",
    "iMinute",
    "sGameTeam1",
    "sGameTeam2",
    "sPlayerName",
    "bYellowCard",
    "bRedCard",
    "sGameTeam1Flag",
    "sGameTeam1FlagLarge",
    "sGameTeam2Flag",
    "sGameTeam2FlagLarge",
    "sPlayerFlag",
    "sPlayerFlagLarge"
})
public class TCardInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dGame;
    protected int iMinute;
    @XmlElement(required = true)
    protected String sGameTeam1;
    @XmlElement(required = true)
    protected String sGameTeam2;
    @XmlElement(required = true)
    protected String sPlayerName;
    protected boolean bYellowCard;
    protected boolean bRedCard;
    @XmlElement(required = true)
    protected String sGameTeam1Flag;
    @XmlElement(required = true)
    protected String sGameTeam1FlagLarge;
    @XmlElement(required = true)
    protected String sGameTeam2Flag;
    @XmlElement(required = true)
    protected String sGameTeam2FlagLarge;
    @XmlElement(required = true)
    protected String sPlayerFlag;
    @XmlElement(required = true)
    protected String sPlayerFlagLarge;

    /**
     * Recupera il valore della proprietà dGame.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDGame() {
        return dGame;
    }

    /**
     * Imposta il valore della proprietà dGame.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDGame(XMLGregorianCalendar value) {
        this.dGame = value;
    }

    /**
     * Recupera il valore della proprietà iMinute.
     * 
     */
    public int getIMinute() {
        return iMinute;
    }

    /**
     * Imposta il valore della proprietà iMinute.
     * 
     */
    public void setIMinute(int value) {
        this.iMinute = value;
    }

    /**
     * Recupera il valore della proprietà sGameTeam1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGameTeam1() {
        return sGameTeam1;
    }

    /**
     * Imposta il valore della proprietà sGameTeam1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGameTeam1(String value) {
        this.sGameTeam1 = value;
    }

    /**
     * Recupera il valore della proprietà sGameTeam2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGameTeam2() {
        return sGameTeam2;
    }

    /**
     * Imposta il valore della proprietà sGameTeam2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGameTeam2(String value) {
        this.sGameTeam2 = value;
    }

    /**
     * Recupera il valore della proprietà sPlayerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPlayerName() {
        return sPlayerName;
    }

    /**
     * Imposta il valore della proprietà sPlayerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPlayerName(String value) {
        this.sPlayerName = value;
    }

    /**
     * Recupera il valore della proprietà bYellowCard.
     * 
     */
    public boolean isBYellowCard() {
        return bYellowCard;
    }

    /**
     * Imposta il valore della proprietà bYellowCard.
     * 
     */
    public void setBYellowCard(boolean value) {
        this.bYellowCard = value;
    }

    /**
     * Recupera il valore della proprietà bRedCard.
     * 
     */
    public boolean isBRedCard() {
        return bRedCard;
    }

    /**
     * Imposta il valore della proprietà bRedCard.
     * 
     */
    public void setBRedCard(boolean value) {
        this.bRedCard = value;
    }

    /**
     * Recupera il valore della proprietà sGameTeam1Flag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGameTeam1Flag() {
        return sGameTeam1Flag;
    }

    /**
     * Imposta il valore della proprietà sGameTeam1Flag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGameTeam1Flag(String value) {
        this.sGameTeam1Flag = value;
    }

    /**
     * Recupera il valore della proprietà sGameTeam1FlagLarge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGameTeam1FlagLarge() {
        return sGameTeam1FlagLarge;
    }

    /**
     * Imposta il valore della proprietà sGameTeam1FlagLarge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGameTeam1FlagLarge(String value) {
        this.sGameTeam1FlagLarge = value;
    }

    /**
     * Recupera il valore della proprietà sGameTeam2Flag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGameTeam2Flag() {
        return sGameTeam2Flag;
    }

    /**
     * Imposta il valore della proprietà sGameTeam2Flag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGameTeam2Flag(String value) {
        this.sGameTeam2Flag = value;
    }

    /**
     * Recupera il valore della proprietà sGameTeam2FlagLarge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGameTeam2FlagLarge() {
        return sGameTeam2FlagLarge;
    }

    /**
     * Imposta il valore della proprietà sGameTeam2FlagLarge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGameTeam2FlagLarge(String value) {
        this.sGameTeam2FlagLarge = value;
    }

    /**
     * Recupera il valore della proprietà sPlayerFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPlayerFlag() {
        return sPlayerFlag;
    }

    /**
     * Imposta il valore della proprietà sPlayerFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPlayerFlag(String value) {
        this.sPlayerFlag = value;
    }

    /**
     * Recupera il valore della proprietà sPlayerFlagLarge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPlayerFlagLarge() {
        return sPlayerFlagLarge;
    }

    /**
     * Imposta il valore della proprietà sPlayerFlagLarge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPlayerFlagLarge(String value) {
        this.sPlayerFlagLarge = value;
    }

}

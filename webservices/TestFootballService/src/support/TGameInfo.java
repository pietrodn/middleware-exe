
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per tGameInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tGameInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dPlayDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="tPlayTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="iUTCOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StadiumInfo" type="{http://footballpool.dataaccess.eu}tStadiumInfo"/>
 *         &lt;element name="Team1" type="{http://footballpool.dataaccess.eu}tTeamInfo"/>
 *         &lt;element name="Team2" type="{http://footballpool.dataaccess.eu}tTeamInfo"/>
 *         &lt;element name="sResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sScore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iYellowCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iRedCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cards" type="{http://footballpool.dataaccess.eu}ArrayOftGameCard"/>
 *         &lt;element name="Goals" type="{http://footballpool.dataaccess.eu}ArrayOftGoal"/>
 *         &lt;element name="bChampion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGameInfo", propOrder = {
    "iId",
    "sDescription",
    "dPlayDate",
    "tPlayTime",
    "iutcOffset",
    "stadiumInfo",
    "team1",
    "team2",
    "sResult",
    "sScore",
    "iYellowCards",
    "iRedCards",
    "cards",
    "goals",
    "bChampion"
})
public class TGameInfo {

    protected int iId;
    @XmlElement(required = true)
    protected String sDescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dPlayDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tPlayTime;
    @XmlElement(name = "iUTCOffset")
    protected int iutcOffset;
    @XmlElement(name = "StadiumInfo", required = true)
    protected TStadiumInfo stadiumInfo;
    @XmlElement(name = "Team1", required = true)
    protected TTeamInfo team1;
    @XmlElement(name = "Team2", required = true)
    protected TTeamInfo team2;
    @XmlElement(required = true)
    protected String sResult;
    @XmlElement(required = true)
    protected String sScore;
    protected int iYellowCards;
    protected int iRedCards;
    @XmlElement(name = "Cards", required = true)
    protected ArrayOftGameCard cards;
    @XmlElement(name = "Goals", required = true)
    protected ArrayOftGoal goals;
    protected boolean bChampion;

    /**
     * Recupera il valore della proprietà iId.
     * 
     */
    public int getIId() {
        return iId;
    }

    /**
     * Imposta il valore della proprietà iId.
     * 
     */
    public void setIId(int value) {
        this.iId = value;
    }

    /**
     * Recupera il valore della proprietà sDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDescription() {
        return sDescription;
    }

    /**
     * Imposta il valore della proprietà sDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDescription(String value) {
        this.sDescription = value;
    }

    /**
     * Recupera il valore della proprietà dPlayDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDPlayDate() {
        return dPlayDate;
    }

    /**
     * Imposta il valore della proprietà dPlayDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDPlayDate(XMLGregorianCalendar value) {
        this.dPlayDate = value;
    }

    /**
     * Recupera il valore della proprietà tPlayTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTPlayTime() {
        return tPlayTime;
    }

    /**
     * Imposta il valore della proprietà tPlayTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTPlayTime(XMLGregorianCalendar value) {
        this.tPlayTime = value;
    }

    /**
     * Recupera il valore della proprietà iutcOffset.
     * 
     */
    public int getIUTCOffset() {
        return iutcOffset;
    }

    /**
     * Imposta il valore della proprietà iutcOffset.
     * 
     */
    public void setIUTCOffset(int value) {
        this.iutcOffset = value;
    }

    /**
     * Recupera il valore della proprietà stadiumInfo.
     * 
     * @return
     *     possible object is
     *     {@link TStadiumInfo }
     *     
     */
    public TStadiumInfo getStadiumInfo() {
        return stadiumInfo;
    }

    /**
     * Imposta il valore della proprietà stadiumInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link TStadiumInfo }
     *     
     */
    public void setStadiumInfo(TStadiumInfo value) {
        this.stadiumInfo = value;
    }

    /**
     * Recupera il valore della proprietà team1.
     * 
     * @return
     *     possible object is
     *     {@link TTeamInfo }
     *     
     */
    public TTeamInfo getTeam1() {
        return team1;
    }

    /**
     * Imposta il valore della proprietà team1.
     * 
     * @param value
     *     allowed object is
     *     {@link TTeamInfo }
     *     
     */
    public void setTeam1(TTeamInfo value) {
        this.team1 = value;
    }

    /**
     * Recupera il valore della proprietà team2.
     * 
     * @return
     *     possible object is
     *     {@link TTeamInfo }
     *     
     */
    public TTeamInfo getTeam2() {
        return team2;
    }

    /**
     * Imposta il valore della proprietà team2.
     * 
     * @param value
     *     allowed object is
     *     {@link TTeamInfo }
     *     
     */
    public void setTeam2(TTeamInfo value) {
        this.team2 = value;
    }

    /**
     * Recupera il valore della proprietà sResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSResult() {
        return sResult;
    }

    /**
     * Imposta il valore della proprietà sResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSResult(String value) {
        this.sResult = value;
    }

    /**
     * Recupera il valore della proprietà sScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSScore() {
        return sScore;
    }

    /**
     * Imposta il valore della proprietà sScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSScore(String value) {
        this.sScore = value;
    }

    /**
     * Recupera il valore della proprietà iYellowCards.
     * 
     */
    public int getIYellowCards() {
        return iYellowCards;
    }

    /**
     * Imposta il valore della proprietà iYellowCards.
     * 
     */
    public void setIYellowCards(int value) {
        this.iYellowCards = value;
    }

    /**
     * Recupera il valore della proprietà iRedCards.
     * 
     */
    public int getIRedCards() {
        return iRedCards;
    }

    /**
     * Imposta il valore della proprietà iRedCards.
     * 
     */
    public void setIRedCards(int value) {
        this.iRedCards = value;
    }

    /**
     * Recupera il valore della proprietà cards.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGameCard }
     *     
     */
    public ArrayOftGameCard getCards() {
        return cards;
    }

    /**
     * Imposta il valore della proprietà cards.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGameCard }
     *     
     */
    public void setCards(ArrayOftGameCard value) {
        this.cards = value;
    }

    /**
     * Recupera il valore della proprietà goals.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGoal }
     *     
     */
    public ArrayOftGoal getGoals() {
        return goals;
    }

    /**
     * Imposta il valore della proprietà goals.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGoal }
     *     
     */
    public void setGoals(ArrayOftGoal value) {
        this.goals = value;
    }

    /**
     * Recupera il valore della proprietà bChampion.
     * 
     */
    public boolean isBChampion() {
        return bChampion;
    }

    /**
     * Imposta il valore della proprietà bChampion.
     * 
     */
    public void setBChampion(boolean value) {
        this.bChampion = value;
    }

}


package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tTeamCompete complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tTeamCompete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iCompeted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iWon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CoachInfo" type="{http://footballpool.dataaccess.eu}tCoaches"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTeamCompete", propOrder = {
    "iCompeted",
    "iWon",
    "coachInfo"
})
public class TTeamCompete {

    protected int iCompeted;
    protected int iWon;
    @XmlElement(name = "CoachInfo", required = true)
    protected TCoaches coachInfo;

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
     * Recupera il valore della proprietà iWon.
     * 
     */
    public int getIWon() {
        return iWon;
    }

    /**
     * Imposta il valore della proprietà iWon.
     * 
     */
    public void setIWon(int value) {
        this.iWon = value;
    }

    /**
     * Recupera il valore della proprietà coachInfo.
     * 
     * @return
     *     possible object is
     *     {@link TCoaches }
     *     
     */
    public TCoaches getCoachInfo() {
        return coachInfo;
    }

    /**
     * Imposta il valore della proprietà coachInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link TCoaches }
     *     
     */
    public void setCoachInfo(TCoaches value) {
        this.coachInfo = value;
    }

}

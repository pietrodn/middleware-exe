
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tTopGoalScorer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tTopGoalScorer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iGoals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sFlagLarge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTopGoalScorer", propOrder = {
    "sName",
    "iGoals",
    "sCountry",
    "sFlag",
    "sFlagLarge"
})
public class TTopGoalScorer {

    @XmlElement(required = true)
    protected String sName;
    protected int iGoals;
    @XmlElement(required = true)
    protected String sCountry;
    @XmlElement(required = true)
    protected String sFlag;
    @XmlElement(required = true)
    protected String sFlagLarge;

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
     * Recupera il valore della proprietà iGoals.
     * 
     */
    public int getIGoals() {
        return iGoals;
    }

    /**
     * Imposta il valore della proprietà iGoals.
     * 
     */
    public void setIGoals(int value) {
        this.iGoals = value;
    }

    /**
     * Recupera il valore della proprietà sCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountry() {
        return sCountry;
    }

    /**
     * Imposta il valore della proprietà sCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountry(String value) {
        this.sCountry = value;
    }

    /**
     * Recupera il valore della proprietà sFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFlag() {
        return sFlag;
    }

    /**
     * Imposta il valore della proprietà sFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFlag(String value) {
        this.sFlag = value;
    }

    /**
     * Recupera il valore della proprietà sFlagLarge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFlagLarge() {
        return sFlagLarge;
    }

    /**
     * Imposta il valore della proprietà sFlagLarge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFlagLarge(String value) {
        this.sFlagLarge = value;
    }

}

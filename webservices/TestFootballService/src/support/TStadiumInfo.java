
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tStadiumInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tStadiumInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sStadiumName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iSeatsCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sWikipediaURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sGoogleMapsURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStadiumInfo", propOrder = {
    "sStadiumName",
    "iSeatsCapacity",
    "sCityName",
    "sWikipediaURL",
    "sGoogleMapsURL"
})
public class TStadiumInfo {

    @XmlElement(required = true)
    protected String sStadiumName;
    protected int iSeatsCapacity;
    @XmlElement(required = true)
    protected String sCityName;
    @XmlElement(required = true)
    protected String sWikipediaURL;
    @XmlElement(required = true)
    protected String sGoogleMapsURL;

    /**
     * Recupera il valore della proprietà sStadiumName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStadiumName() {
        return sStadiumName;
    }

    /**
     * Imposta il valore della proprietà sStadiumName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStadiumName(String value) {
        this.sStadiumName = value;
    }

    /**
     * Recupera il valore della proprietà iSeatsCapacity.
     * 
     */
    public int getISeatsCapacity() {
        return iSeatsCapacity;
    }

    /**
     * Imposta il valore della proprietà iSeatsCapacity.
     * 
     */
    public void setISeatsCapacity(int value) {
        this.iSeatsCapacity = value;
    }

    /**
     * Recupera il valore della proprietà sCityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCityName() {
        return sCityName;
    }

    /**
     * Imposta il valore della proprietà sCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCityName(String value) {
        this.sCityName = value;
    }

    /**
     * Recupera il valore della proprietà sWikipediaURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWikipediaURL() {
        return sWikipediaURL;
    }

    /**
     * Imposta il valore della proprietà sWikipediaURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWikipediaURL(String value) {
        this.sWikipediaURL = value;
    }

    /**
     * Recupera il valore della proprietà sGoogleMapsURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGoogleMapsURL() {
        return sGoogleMapsURL;
    }

    /**
     * Imposta il valore della proprietà sGoogleMapsURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGoogleMapsURL(String value) {
        this.sGoogleMapsURL = value;
    }

}

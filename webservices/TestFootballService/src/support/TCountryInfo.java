
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tCountryInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tCountryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sIsoCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCountryInfo", propOrder = {
    "iId",
    "sName",
    "sIsoCode",
    "iPersons"
})
public class TCountryInfo {

    protected int iId;
    @XmlElement(required = true)
    protected String sName;
    @XmlElement(required = true)
    protected String sIsoCode;
    protected int iPersons;

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
     * Recupera il valore della proprietà sIsoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIsoCode() {
        return sIsoCode;
    }

    /**
     * Imposta il valore della proprietà sIsoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIsoCode(String value) {
        this.sIsoCode = value;
    }

    /**
     * Recupera il valore della proprietà iPersons.
     * 
     */
    public int getIPersons() {
        return iPersons;
    }

    /**
     * Imposta il valore della proprietà iPersons.
     * 
     */
    public void setIPersons(int value) {
        this.iPersons = value;
    }

}

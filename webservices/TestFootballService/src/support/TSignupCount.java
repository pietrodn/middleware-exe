
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per tSignupCount complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tSignupCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSignup" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="iCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iAverage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSignupCount", propOrder = {
    "dSignup",
    "iCount",
    "iTotal",
    "iAverage"
})
public class TSignupCount {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dSignup;
    protected int iCount;
    protected int iTotal;
    protected int iAverage;

    /**
     * Recupera il valore della proprietà dSignup.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDSignup() {
        return dSignup;
    }

    /**
     * Imposta il valore della proprietà dSignup.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDSignup(XMLGregorianCalendar value) {
        this.dSignup = value;
    }

    /**
     * Recupera il valore della proprietà iCount.
     * 
     */
    public int getICount() {
        return iCount;
    }

    /**
     * Imposta il valore della proprietà iCount.
     * 
     */
    public void setICount(int value) {
        this.iCount = value;
    }

    /**
     * Recupera il valore della proprietà iTotal.
     * 
     */
    public int getITotal() {
        return iTotal;
    }

    /**
     * Imposta il valore della proprietà iTotal.
     * 
     */
    public void setITotal(int value) {
        this.iTotal = value;
    }

    /**
     * Recupera il valore della proprietà iAverage.
     * 
     */
    public int getIAverage() {
        return iAverage;
    }

    /**
     * Imposta il valore della proprietà iAverage.
     * 
     */
    public void setIAverage(int value) {
        this.iAverage = value;
    }

}

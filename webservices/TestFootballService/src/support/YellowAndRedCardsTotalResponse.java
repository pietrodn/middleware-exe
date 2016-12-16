
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YellowAndRedCardsTotalResult" type="{http://footballpool.dataaccess.eu}tCards"/>
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
    "yellowAndRedCardsTotalResult"
})
@XmlRootElement(name = "YellowAndRedCardsTotalResponse")
public class YellowAndRedCardsTotalResponse {

    @XmlElement(name = "YellowAndRedCardsTotalResult", required = true)
    protected TCards yellowAndRedCardsTotalResult;

    /**
     * Recupera il valore della proprietà yellowAndRedCardsTotalResult.
     * 
     * @return
     *     possible object is
     *     {@link TCards }
     *     
     */
    public TCards getYellowAndRedCardsTotalResult() {
        return yellowAndRedCardsTotalResult;
    }

    /**
     * Imposta il valore della proprietà yellowAndRedCardsTotalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TCards }
     *     
     */
    public void setYellowAndRedCardsTotalResult(TCards value) {
        this.yellowAndRedCardsTotalResult = value;
    }

}

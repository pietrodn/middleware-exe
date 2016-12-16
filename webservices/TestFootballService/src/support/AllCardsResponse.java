
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
 *         &lt;element name="AllCardsResult" type="{http://footballpool.dataaccess.eu}ArrayOftCardInfo"/>
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
    "allCardsResult"
})
@XmlRootElement(name = "AllCardsResponse")
public class AllCardsResponse {

    @XmlElement(name = "AllCardsResult", required = true)
    protected ArrayOftCardInfo allCardsResult;

    /**
     * Recupera il valore della proprietà allCardsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCardInfo }
     *     
     */
    public ArrayOftCardInfo getAllCardsResult() {
        return allCardsResult;
    }

    /**
     * Imposta il valore della proprietà allCardsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCardInfo }
     *     
     */
    public void setAllCardsResult(ArrayOftCardInfo value) {
        this.allCardsResult = value;
    }

}

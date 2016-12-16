
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
 *         &lt;element name="AllPlayersWithRedCardsResult" type="{http://footballpool.dataaccess.eu}ArrayOftPlayersWithCards"/>
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
    "allPlayersWithRedCardsResult"
})
@XmlRootElement(name = "AllPlayersWithRedCardsResponse")
public class AllPlayersWithRedCardsResponse {

    @XmlElement(name = "AllPlayersWithRedCardsResult", required = true)
    protected ArrayOftPlayersWithCards allPlayersWithRedCardsResult;

    /**
     * Recupera il valore della proprietà allPlayersWithRedCardsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftPlayersWithCards }
     *     
     */
    public ArrayOftPlayersWithCards getAllPlayersWithRedCardsResult() {
        return allPlayersWithRedCardsResult;
    }

    /**
     * Imposta il valore della proprietà allPlayersWithRedCardsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftPlayersWithCards }
     *     
     */
    public void setAllPlayersWithRedCardsResult(ArrayOftPlayersWithCards value) {
        this.allPlayersWithRedCardsResult = value;
    }

}

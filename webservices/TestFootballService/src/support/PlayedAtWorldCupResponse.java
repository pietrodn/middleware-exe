
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
 *         &lt;element name="PlayedAtWorldCupResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "playedAtWorldCupResult"
})
@XmlRootElement(name = "PlayedAtWorldCupResponse")
public class PlayedAtWorldCupResponse {

    @XmlElement(name = "PlayedAtWorldCupResult")
    protected int playedAtWorldCupResult;

    /**
     * Recupera il valore della proprietà playedAtWorldCupResult.
     * 
     */
    public int getPlayedAtWorldCupResult() {
        return playedAtWorldCupResult;
    }

    /**
     * Imposta il valore della proprietà playedAtWorldCupResult.
     * 
     */
    public void setPlayedAtWorldCupResult(int value) {
        this.playedAtWorldCupResult = value;
    }

}

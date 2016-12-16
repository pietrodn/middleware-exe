
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
 *         &lt;element name="GameResultCodesResult" type="{http://footballpool.dataaccess.eu}ArrayOftGameResultCode"/>
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
    "gameResultCodesResult"
})
@XmlRootElement(name = "GameResultCodesResponse")
public class GameResultCodesResponse {

    @XmlElement(name = "GameResultCodesResult", required = true)
    protected ArrayOftGameResultCode gameResultCodesResult;

    /**
     * Recupera il valore della proprietà gameResultCodesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGameResultCode }
     *     
     */
    public ArrayOftGameResultCode getGameResultCodesResult() {
        return gameResultCodesResult;
    }

    /**
     * Imposta il valore della proprietà gameResultCodesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGameResultCode }
     *     
     */
    public void setGameResultCodesResult(ArrayOftGameResultCode value) {
        this.gameResultCodesResult = value;
    }

}

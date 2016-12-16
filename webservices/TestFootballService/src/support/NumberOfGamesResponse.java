
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
 *         &lt;element name="NumberOfGamesResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "numberOfGamesResult"
})
@XmlRootElement(name = "NumberOfGamesResponse")
public class NumberOfGamesResponse {

    @XmlElement(name = "NumberOfGamesResult")
    protected int numberOfGamesResult;

    /**
     * Recupera il valore della proprietà numberOfGamesResult.
     * 
     */
    public int getNumberOfGamesResult() {
        return numberOfGamesResult;
    }

    /**
     * Imposta il valore della proprietà numberOfGamesResult.
     * 
     */
    public void setNumberOfGamesResult(int value) {
        this.numberOfGamesResult = value;
    }

}


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
 *         &lt;element name="TournamentInfoResult" type="{http://footballpool.dataaccess.eu}tTournamentInfo"/>
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
    "tournamentInfoResult"
})
@XmlRootElement(name = "TournamentInfoResponse")
public class TournamentInfoResponse {

    @XmlElement(name = "TournamentInfoResult", required = true)
    protected TTournamentInfo tournamentInfoResult;

    /**
     * Recupera il valore della proprietà tournamentInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link TTournamentInfo }
     *     
     */
    public TTournamentInfo getTournamentInfoResult() {
        return tournamentInfoResult;
    }

    /**
     * Imposta il valore della proprietà tournamentInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TTournamentInfo }
     *     
     */
    public void setTournamentInfoResult(TTournamentInfo value) {
        this.tournamentInfoResult = value;
    }

}

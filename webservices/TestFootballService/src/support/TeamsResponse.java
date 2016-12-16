
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
 *         &lt;element name="TeamsResult" type="{http://footballpool.dataaccess.eu}ArrayOftTeamInfo"/>
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
    "teamsResult"
})
@XmlRootElement(name = "TeamsResponse")
public class TeamsResponse {

    @XmlElement(name = "TeamsResult", required = true)
    protected ArrayOftTeamInfo teamsResult;

    /**
     * Recupera il valore della proprietà teamsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamInfo }
     *     
     */
    public ArrayOftTeamInfo getTeamsResult() {
        return teamsResult;
    }

    /**
     * Imposta il valore della proprietà teamsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamInfo }
     *     
     */
    public void setTeamsResult(ArrayOftTeamInfo value) {
        this.teamsResult = value;
    }

}

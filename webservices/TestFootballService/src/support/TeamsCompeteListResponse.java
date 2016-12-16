
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
 *         &lt;element name="TeamsCompeteListResult" type="{http://footballpool.dataaccess.eu}ArrayOftTeamCompete"/>
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
    "teamsCompeteListResult"
})
@XmlRootElement(name = "TeamsCompeteListResponse")
public class TeamsCompeteListResponse {

    @XmlElement(name = "TeamsCompeteListResult", required = true)
    protected ArrayOftTeamCompete teamsCompeteListResult;

    /**
     * Recupera il valore della proprietà teamsCompeteListResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamCompete }
     *     
     */
    public ArrayOftTeamCompete getTeamsCompeteListResult() {
        return teamsCompeteListResult;
    }

    /**
     * Imposta il valore della proprietà teamsCompeteListResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamCompete }
     *     
     */
    public void setTeamsCompeteListResult(ArrayOftTeamCompete value) {
        this.teamsCompeteListResult = value;
    }

}

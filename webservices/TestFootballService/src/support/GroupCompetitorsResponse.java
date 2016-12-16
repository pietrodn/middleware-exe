
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
 *         &lt;element name="GroupCompetitorsResult" type="{http://footballpool.dataaccess.eu}ArrayOftTeamInfo"/>
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
    "groupCompetitorsResult"
})
@XmlRootElement(name = "GroupCompetitorsResponse")
public class GroupCompetitorsResponse {

    @XmlElement(name = "GroupCompetitorsResult", required = true)
    protected ArrayOftTeamInfo groupCompetitorsResult;

    /**
     * Recupera il valore della proprietà groupCompetitorsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamInfo }
     *     
     */
    public ArrayOftTeamInfo getGroupCompetitorsResult() {
        return groupCompetitorsResult;
    }

    /**
     * Imposta il valore della proprietà groupCompetitorsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamInfo }
     *     
     */
    public void setGroupCompetitorsResult(ArrayOftTeamInfo value) {
        this.groupCompetitorsResult = value;
    }

}

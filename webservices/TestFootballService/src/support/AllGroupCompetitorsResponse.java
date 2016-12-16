
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
 *         &lt;element name="AllGroupCompetitorsResult" type="{http://footballpool.dataaccess.eu}ArrayOftGroupsCompetitors"/>
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
    "allGroupCompetitorsResult"
})
@XmlRootElement(name = "AllGroupCompetitorsResponse")
public class AllGroupCompetitorsResponse {

    @XmlElement(name = "AllGroupCompetitorsResult", required = true)
    protected ArrayOftGroupsCompetitors allGroupCompetitorsResult;

    /**
     * Recupera il valore della proprietà allGroupCompetitorsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGroupsCompetitors }
     *     
     */
    public ArrayOftGroupsCompetitors getAllGroupCompetitorsResult() {
        return allGroupCompetitorsResult;
    }

    /**
     * Imposta il valore della proprietà allGroupCompetitorsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGroupsCompetitors }
     *     
     */
    public void setAllGroupCompetitorsResult(ArrayOftGroupsCompetitors value) {
        this.allGroupCompetitorsResult = value;
    }

}

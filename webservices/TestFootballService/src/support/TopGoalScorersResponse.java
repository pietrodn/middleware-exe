
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
 *         &lt;element name="TopGoalScorersResult" type="{http://footballpool.dataaccess.eu}ArrayOftTopGoalScorer"/>
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
    "topGoalScorersResult"
})
@XmlRootElement(name = "TopGoalScorersResponse")
public class TopGoalScorersResponse {

    @XmlElement(name = "TopGoalScorersResult", required = true)
    protected ArrayOftTopGoalScorer topGoalScorersResult;

    /**
     * Recupera il valore della proprietà topGoalScorersResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTopGoalScorer }
     *     
     */
    public ArrayOftTopGoalScorer getTopGoalScorersResult() {
        return topGoalScorersResult;
    }

    /**
     * Imposta il valore della proprietà topGoalScorersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTopGoalScorer }
     *     
     */
    public void setTopGoalScorersResult(ArrayOftTopGoalScorer value) {
        this.topGoalScorersResult = value;
    }

}

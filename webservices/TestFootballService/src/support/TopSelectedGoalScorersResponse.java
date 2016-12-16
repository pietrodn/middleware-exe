
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
 *         &lt;element name="TopSelectedGoalScorersResult" type="{http://footballpool.dataaccess.eu}ArrayOftTopSelectedGoalScorer"/>
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
    "topSelectedGoalScorersResult"
})
@XmlRootElement(name = "TopSelectedGoalScorersResponse")
public class TopSelectedGoalScorersResponse {

    @XmlElement(name = "TopSelectedGoalScorersResult", required = true)
    protected ArrayOftTopSelectedGoalScorer topSelectedGoalScorersResult;

    /**
     * Recupera il valore della proprietà topSelectedGoalScorersResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTopSelectedGoalScorer }
     *     
     */
    public ArrayOftTopSelectedGoalScorer getTopSelectedGoalScorersResult() {
        return topSelectedGoalScorersResult;
    }

    /**
     * Imposta il valore della proprietà topSelectedGoalScorersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTopSelectedGoalScorer }
     *     
     */
    public void setTopSelectedGoalScorersResult(ArrayOftTopSelectedGoalScorer value) {
        this.topSelectedGoalScorersResult = value;
    }

}

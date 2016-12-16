
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
 *         &lt;element name="GoalsScoredResult" type="{http://footballpool.dataaccess.eu}ArrayOftGoal"/>
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
    "goalsScoredResult"
})
@XmlRootElement(name = "GoalsScoredResponse")
public class GoalsScoredResponse {

    @XmlElement(name = "GoalsScoredResult", required = true)
    protected ArrayOftGoal goalsScoredResult;

    /**
     * Recupera il valore della proprietà goalsScoredResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGoal }
     *     
     */
    public ArrayOftGoal getGoalsScoredResult() {
        return goalsScoredResult;
    }

    /**
     * Imposta il valore della proprietà goalsScoredResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGoal }
     *     
     */
    public void setGoalsScoredResult(ArrayOftGoal value) {
        this.goalsScoredResult = value;
    }

}

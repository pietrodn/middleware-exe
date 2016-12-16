
package support;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOftTopSelectedGoalScorer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftTopSelectedGoalScorer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tTopSelectedGoalScorer" type="{http://footballpool.dataaccess.eu}tTopSelectedGoalScorer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftTopSelectedGoalScorer", propOrder = {
    "tTopSelectedGoalScorer"
})
public class ArrayOftTopSelectedGoalScorer {

    @XmlElement(nillable = true)
    protected List<TTopSelectedGoalScorer> tTopSelectedGoalScorer;

    /**
     * Gets the value of the tTopSelectedGoalScorer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tTopSelectedGoalScorer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTTopSelectedGoalScorer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTopSelectedGoalScorer }
     * 
     * 
     */
    public List<TTopSelectedGoalScorer> getTTopSelectedGoalScorer() {
        if (tTopSelectedGoalScorer == null) {
            tTopSelectedGoalScorer = new ArrayList<TTopSelectedGoalScorer>();
        }
        return this.tTopSelectedGoalScorer;
    }

}

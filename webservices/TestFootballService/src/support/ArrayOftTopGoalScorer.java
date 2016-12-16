
package support;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOftTopGoalScorer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftTopGoalScorer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tTopGoalScorer" type="{http://footballpool.dataaccess.eu}tTopGoalScorer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftTopGoalScorer", propOrder = {
    "tTopGoalScorer"
})
public class ArrayOftTopGoalScorer {

    @XmlElement(nillable = true)
    protected List<TTopGoalScorer> tTopGoalScorer;

    /**
     * Gets the value of the tTopGoalScorer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tTopGoalScorer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTTopGoalScorer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTopGoalScorer }
     * 
     * 
     */
    public List<TTopGoalScorer> getTTopGoalScorer() {
        if (tTopGoalScorer == null) {
            tTopGoalScorer = new ArrayList<TTopGoalScorer>();
        }
        return this.tTopGoalScorer;
    }

}

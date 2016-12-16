
package support;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOftCountrySelectedTopScorer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftCountrySelectedTopScorer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tCountrySelectedTopScorer" type="{http://footballpool.dataaccess.eu}tCountrySelectedTopScorer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftCountrySelectedTopScorer", propOrder = {
    "tCountrySelectedTopScorer"
})
public class ArrayOftCountrySelectedTopScorer {

    @XmlElement(nillable = true)
    protected List<TCountrySelectedTopScorer> tCountrySelectedTopScorer;

    /**
     * Gets the value of the tCountrySelectedTopScorer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tCountrySelectedTopScorer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCountrySelectedTopScorer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCountrySelectedTopScorer }
     * 
     * 
     */
    public List<TCountrySelectedTopScorer> getTCountrySelectedTopScorer() {
        if (tCountrySelectedTopScorer == null) {
            tCountrySelectedTopScorer = new ArrayList<TCountrySelectedTopScorer>();
        }
        return this.tCountrySelectedTopScorer;
    }

}

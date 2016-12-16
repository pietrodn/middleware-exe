
package support;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOftSignupCount complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftSignupCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tSignupCount" type="{http://footballpool.dataaccess.eu}tSignupCount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftSignupCount", propOrder = {
    "tSignupCount"
})
public class ArrayOftSignupCount {

    @XmlElement(nillable = true)
    protected List<TSignupCount> tSignupCount;

    /**
     * Gets the value of the tSignupCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tSignupCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTSignupCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSignupCount }
     * 
     * 
     */
    public List<TSignupCount> getTSignupCount() {
        if (tSignupCount == null) {
            tSignupCount = new ArrayList<TSignupCount>();
        }
        return this.tSignupCount;
    }

}

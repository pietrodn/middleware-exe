
package support;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOftTeamCompete complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftTeamCompete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tTeamCompete" type="{http://footballpool.dataaccess.eu}tTeamCompete" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftTeamCompete", propOrder = {
    "tTeamCompete"
})
public class ArrayOftTeamCompete {

    @XmlElement(nillable = true)
    protected List<TTeamCompete> tTeamCompete;

    /**
     * Gets the value of the tTeamCompete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tTeamCompete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTTeamCompete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTeamCompete }
     * 
     * 
     */
    public List<TTeamCompete> getTTeamCompete() {
        if (tTeamCompete == null) {
            tTeamCompete = new ArrayList<TTeamCompete>();
        }
        return this.tTeamCompete;
    }

}

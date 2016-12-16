
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
 *         &lt;element name="AllGoalKeepersResult" type="{http://footballpool.dataaccess.eu}ArrayOfString"/>
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
    "allGoalKeepersResult"
})
@XmlRootElement(name = "AllGoalKeepersResponse")
public class AllGoalKeepersResponse {

    @XmlElement(name = "AllGoalKeepersResult", required = true)
    protected ArrayOfString allGoalKeepersResult;

    /**
     * Recupera il valore della proprietà allGoalKeepersResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAllGoalKeepersResult() {
        return allGoalKeepersResult;
    }

    /**
     * Imposta il valore della proprietà allGoalKeepersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAllGoalKeepersResult(ArrayOfString value) {
        this.allGoalKeepersResult = value;
    }

}

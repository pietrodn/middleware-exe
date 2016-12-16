
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
 *         &lt;element name="sStadiumName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sStadiumName"
})
@XmlRootElement(name = "StadiumInfo")
public class StadiumInfo {

    @XmlElement(required = true)
    protected String sStadiumName;

    /**
     * Recupera il valore della proprietà sStadiumName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStadiumName() {
        return sStadiumName;
    }

    /**
     * Imposta il valore della proprietà sStadiumName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStadiumName(String value) {
        this.sStadiumName = value;
    }

}

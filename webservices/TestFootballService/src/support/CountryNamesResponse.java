
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
 *         &lt;element name="CountryNamesResult" type="{http://footballpool.dataaccess.eu}ArrayOftCountryInfo"/>
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
    "countryNamesResult"
})
@XmlRootElement(name = "CountryNamesResponse")
public class CountryNamesResponse {

    @XmlElement(name = "CountryNamesResult", required = true)
    protected ArrayOftCountryInfo countryNamesResult;

    /**
     * Recupera il valore della proprietà countryNamesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryInfo }
     *     
     */
    public ArrayOftCountryInfo getCountryNamesResult() {
        return countryNamesResult;
    }

    /**
     * Imposta il valore della proprietà countryNamesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryInfo }
     *     
     */
    public void setCountryNamesResult(ArrayOftCountryInfo value) {
        this.countryNamesResult = value;
    }

}

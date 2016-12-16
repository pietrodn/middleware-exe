
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
 *         &lt;element name="StadiumInfoResult" type="{http://footballpool.dataaccess.eu}tStadiumInfo"/>
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
    "stadiumInfoResult"
})
@XmlRootElement(name = "StadiumInfoResponse")
public class StadiumInfoResponse {

    @XmlElement(name = "StadiumInfoResult", required = true)
    protected TStadiumInfo stadiumInfoResult;

    /**
     * Recupera il valore della proprietà stadiumInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link TStadiumInfo }
     *     
     */
    public TStadiumInfo getStadiumInfoResult() {
        return stadiumInfoResult;
    }

    /**
     * Imposta il valore della proprietà stadiumInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TStadiumInfo }
     *     
     */
    public void setStadiumInfoResult(TStadiumInfo value) {
        this.stadiumInfoResult = value;
    }

}

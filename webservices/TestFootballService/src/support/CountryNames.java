
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bWithCompetitors" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "bWithCompetitors"
})
@XmlRootElement(name = "CountryNames")
public class CountryNames {

    protected boolean bWithCompetitors;

    /**
     * Recupera il valore della proprietà bWithCompetitors.
     * 
     */
    public boolean isBWithCompetitors() {
        return bWithCompetitors;
    }

    /**
     * Imposta il valore della proprietà bWithCompetitors.
     * 
     */
    public void setBWithCompetitors(boolean value) {
        this.bWithCompetitors = value;
    }

}


package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tTopSelectedGoalScorer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tTopSelectedGoalScorer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iSelected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Countries" type="{http://footballpool.dataaccess.eu}ArrayOftCountrySelectedTopScorer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTopSelectedGoalScorer", propOrder = {
    "sName",
    "iSelected",
    "countries"
})
public class TTopSelectedGoalScorer {

    @XmlElement(required = true)
    protected String sName;
    protected int iSelected;
    @XmlElement(name = "Countries", required = true)
    protected ArrayOftCountrySelectedTopScorer countries;

    /**
     * Recupera il valore della proprietà sName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Imposta il valore della proprietà sName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Recupera il valore della proprietà iSelected.
     * 
     */
    public int getISelected() {
        return iSelected;
    }

    /**
     * Imposta il valore della proprietà iSelected.
     * 
     */
    public void setISelected(int value) {
        this.iSelected = value;
    }

    /**
     * Recupera il valore della proprietà countries.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountrySelectedTopScorer }
     *     
     */
    public ArrayOftCountrySelectedTopScorer getCountries() {
        return countries;
    }

    /**
     * Imposta il valore della proprietà countries.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountrySelectedTopScorer }
     *     
     */
    public void setCountries(ArrayOftCountrySelectedTopScorer value) {
        this.countries = value;
    }

}

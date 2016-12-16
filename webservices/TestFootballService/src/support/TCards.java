
package support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tCards complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tCards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iYellow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iRed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCards", propOrder = {
    "iYellow",
    "iRed"
})
public class TCards {

    protected int iYellow;
    protected int iRed;

    /**
     * Recupera il valore della proprietà iYellow.
     * 
     */
    public int getIYellow() {
        return iYellow;
    }

    /**
     * Imposta il valore della proprietà iYellow.
     * 
     */
    public void setIYellow(int value) {
        this.iYellow = value;
    }

    /**
     * Recupera il valore della proprietà iRed.
     * 
     */
    public int getIRed() {
        return iRed;
    }

    /**
     * Imposta il valore della proprietà iRed.
     * 
     */
    public void setIRed(int value) {
        this.iRed = value;
    }

}

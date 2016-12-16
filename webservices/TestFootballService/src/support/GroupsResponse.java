
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
 *         &lt;element name="GroupsResult" type="{http://footballpool.dataaccess.eu}ArrayOftGroupInfo"/>
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
    "groupsResult"
})
@XmlRootElement(name = "GroupsResponse")
public class GroupsResponse {

    @XmlElement(name = "GroupsResult", required = true)
    protected ArrayOftGroupInfo groupsResult;

    /**
     * Recupera il valore della proprietà groupsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGroupInfo }
     *     
     */
    public ArrayOftGroupInfo getGroupsResult() {
        return groupsResult;
    }

    /**
     * Imposta il valore della proprietà groupsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGroupInfo }
     *     
     */
    public void setGroupsResult(ArrayOftGroupInfo value) {
        this.groupsResult = value;
    }

}

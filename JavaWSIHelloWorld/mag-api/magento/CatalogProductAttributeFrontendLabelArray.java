
package magento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for catalogProductAttributeFrontendLabelArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catalogProductAttributeFrontendLabelArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complexObjectArray" type="{urn:Magento}catalogProductAttributeFrontendLabelEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogProductAttributeFrontendLabelArray", propOrder = {
    "complexObjectArray"
})
public class CatalogProductAttributeFrontendLabelArray {

    protected List<CatalogProductAttributeFrontendLabelEntity> complexObjectArray;

    /**
     * Gets the value of the complexObjectArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexObjectArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexObjectArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogProductAttributeFrontendLabelEntity }
     * 
     * 
     */
    public List<CatalogProductAttributeFrontendLabelEntity> getComplexObjectArray() {
        if (complexObjectArray == null) {
            complexObjectArray = new ArrayList<CatalogProductAttributeFrontendLabelEntity>();
        }
        return this.complexObjectArray;
    }

}

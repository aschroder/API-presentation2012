
package magento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="customerData" type="{urn:Magento}customerCustomerEntityToCreate"/>
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
    "sessionId",
    "customerId",
    "customerData"
})
@XmlRootElement(name = "customerCustomerUpdateRequestParam")
public class CustomerCustomerUpdateRequestParam {

    @XmlElement(required = true)
    protected String sessionId;
    protected int customerId;
    @XmlElement(required = true)
    protected CustomerCustomerEntityToCreate customerData;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCustomerEntityToCreate }
     *     
     */
    public CustomerCustomerEntityToCreate getCustomerData() {
        return customerData;
    }

    /**
     * Sets the value of the customerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCustomerEntityToCreate }
     *     
     */
    public void setCustomerData(CustomerCustomerEntityToCreate value) {
        this.customerData = value;
    }

}

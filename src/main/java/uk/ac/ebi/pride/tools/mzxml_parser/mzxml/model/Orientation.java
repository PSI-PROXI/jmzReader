
package uk.ac.ebi.pride.tools.mzxml_parser.mzxml.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}anyType"&gt;
 *       &lt;attribute name="firstSpotID" use="required" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}string" /&gt;
 *       &lt;attribute name="secondSpotID" use="required" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Orientation
    implements Serializable, MzXMLObject
{

    private final static long serialVersionUID = 320L;
    @XmlAttribute(required = true)
    protected String firstSpotID;
    @XmlAttribute(required = true)
    protected String secondSpotID;

    /**
     * Gets the value of the firstSpotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSpotID() {
        return firstSpotID;
    }

    /**
     * Sets the value of the firstSpotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSpotID(String value) {
        this.firstSpotID = value;
    }

    /**
     * Gets the value of the secondSpotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondSpotID() {
        return secondSpotID;
    }

    /**
     * Sets the value of the secondSpotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondSpotID(String value) {
        this.secondSpotID = value;
    }

}

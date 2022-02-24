
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour track complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="track">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "track", propOrder = {
    "singer",
    "title"
})
public class Track {

    protected String singer;
    protected String title;

    public Track(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }

    public Track() {
    }

    /**
     * Obtient la valeur de la propri�t� singer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinger() {
        return singer;
    }

    /**
     * D�finit la valeur de la propri�t� singer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinger(String value) {
        this.singer = value;
    }

    /**
     * Obtient la valeur de la propri�t� title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * D�finit la valeur de la propri�t� title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    @Override
    public String toString() {
        return   "{ " +
                "'singer'=" + singer +
                ", 'title'=" + title + '}';
    }
}

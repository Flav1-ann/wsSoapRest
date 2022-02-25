
package eu.ensup.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.ensup.ResponsesPost;

@XmlRootElement(name = "SaveTrackResponse", namespace = "http://ensup.eu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveTrackResponse", namespace = "http://ensup.eu/")
public class SaveTrackResponse {

    @XmlElement(name = "return", namespace = "")
    private ResponsesPost _return;

    /**
     * 
     * @return
     *     returns ResponsesPost
     */
    public ResponsesPost getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ResponsesPost _return) {
        this._return = _return;
    }

}

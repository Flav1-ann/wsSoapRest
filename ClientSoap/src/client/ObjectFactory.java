
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CallRestResponse_QNAME = new QName("http://ensup.eu/", "CallRestResponse");
    private final static QName _CalltrackStringResponse_QNAME = new QName("http://ensup.eu/", "CalltrackStringResponse");
    private final static QName _CallRest_QNAME = new QName("http://ensup.eu/", "CallRest");
    private final static QName _SaveTrack_QNAME = new QName("http://ensup.eu/", "SaveTrack");
    private final static QName _SaveTrackResponse_QNAME = new QName("http://ensup.eu/", "SaveTrackResponse");
    private final static QName _CalltrackString_QNAME = new QName("http://ensup.eu/", "CalltrackString");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveTrackResponse }
     * 
     */
    public SaveTrackResponse createSaveTrackResponse() {
        return new SaveTrackResponse();
    }

    /**
     * Create an instance of {@link SaveTrack }
     * 
     */
    public SaveTrack createSaveTrack() {
        return new SaveTrack();
    }

    /**
     * Create an instance of {@link CalltrackString }
     * 
     */
    public CalltrackString createCalltrackString() {
        return new CalltrackString();
    }

    /**
     * Create an instance of {@link CallRestResponse }
     * 
     */
    public CallRestResponse createCallRestResponse() {
        return new CallRestResponse();
    }

    /**
     * Create an instance of {@link CalltrackStringResponse }
     * 
     */
    public CalltrackStringResponse createCalltrackStringResponse() {
        return new CalltrackStringResponse();
    }

    /**
     * Create an instance of {@link CallRest }
     * 
     */
    public CallRest createCallRest() {
        return new CallRest();
    }

    /**
     * Create an instance of {@link ResponsesPost }
     * 
     */
    public ResponsesPost createResponsesPost() {
        return new ResponsesPost();
    }

    /**
     * Create an instance of {@link Track }
     * 
     */
    public Track createTrack() {
        return new Track();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallRestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ensup.eu/", name = "CallRestResponse")
    public JAXBElement<CallRestResponse> createCallRestResponse(CallRestResponse value) {
        return new JAXBElement<CallRestResponse>(_CallRestResponse_QNAME, CallRestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalltrackStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ensup.eu/", name = "CalltrackStringResponse")
    public JAXBElement<CalltrackStringResponse> createCalltrackStringResponse(CalltrackStringResponse value) {
        return new JAXBElement<CalltrackStringResponse>(_CalltrackStringResponse_QNAME, CalltrackStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallRest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ensup.eu/", name = "CallRest")
    public JAXBElement<CallRest> createCallRest(CallRest value) {
        return new JAXBElement<CallRest>(_CallRest_QNAME, CallRest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTrack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ensup.eu/", name = "SaveTrack")
    public JAXBElement<SaveTrack> createSaveTrack(SaveTrack value) {
        return new JAXBElement<SaveTrack>(_SaveTrack_QNAME, SaveTrack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTrackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ensup.eu/", name = "SaveTrackResponse")
    public JAXBElement<SaveTrackResponse> createSaveTrackResponse(SaveTrackResponse value) {
        return new JAXBElement<SaveTrackResponse>(_SaveTrackResponse_QNAME, SaveTrackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalltrackString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ensup.eu/", name = "CalltrackString")
    public JAXBElement<CalltrackString> createCalltrackString(CalltrackString value) {
        return new JAXBElement<CalltrackString>(_CalltrackString_QNAME, CalltrackString.class, null, value);
    }

}

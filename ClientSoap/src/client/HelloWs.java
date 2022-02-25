
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWs", targetNamespace = "http://ensup.eu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWs {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CalltrackString")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CalltrackString", targetNamespace = "http://ensup.eu/", className = "client.CalltrackString")
    @ResponseWrapper(localName = "CalltrackStringResponse", targetNamespace = "http://ensup.eu/", className = "client.CalltrackStringResponse")
    @Action(input = "http://ensup.eu/HelloWs/CalltrackStringRequest", output = "http://ensup.eu/HelloWs/CalltrackStringResponse")
    public String calltrackString();

    /**
     * 
     * @return
     *     returns client.Track
     */
    @WebMethod(operationName = "CallRest")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CallRest", targetNamespace = "http://ensup.eu/", className = "client.CallRest")
    @ResponseWrapper(localName = "CallRestResponse", targetNamespace = "http://ensup.eu/", className = "client.CallRestResponse")
    @Action(input = "http://ensup.eu/HelloWs/CallRestRequest", output = "http://ensup.eu/HelloWs/CallRestResponse")
    public Track callRest();

    /**
     * 
     * @param arg0
     * @return
     *     returns client.ResponsesPost
     */
    @WebMethod(operationName = "SaveTrack")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SaveTrack", targetNamespace = "http://ensup.eu/", className = "client.SaveTrack")
    @ResponseWrapper(localName = "SaveTrackResponse", targetNamespace = "http://ensup.eu/", className = "client.SaveTrackResponse")
    @Action(input = "http://ensup.eu/HelloWs/SaveTrackRequest", output = "http://ensup.eu/HelloWs/SaveTrackResponse")
    public ResponsesPost saveTrack(
        @WebParam(name = "arg0", targetNamespace = "")
        Track arg0);

}

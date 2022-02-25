package eu.ensup;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


public interface IHello {

    Track CallRest();
    String CalltrackString();
    ResponsesPost SaveTrack(Track track);
}

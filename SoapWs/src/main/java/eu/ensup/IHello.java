package eu.ensup;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHello {

    Track CallRest();
    String CalltrackString();
    ResponsesPost SaveTrack(Track track);
}

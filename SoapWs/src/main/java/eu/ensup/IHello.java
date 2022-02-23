package eu.ensup;


import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHello {

    @WebResult(partName = "response")
    String CallREst();
}

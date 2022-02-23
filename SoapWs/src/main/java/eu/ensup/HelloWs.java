package eu.ensup;

import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.sound.midi.Track;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "eu.ensup.IHello")
public class HelloWs implements IHello {

    public String CallREst(){
        Client client = ClientBuilder.newClient();
        String track = client.target("http://localhost:8080/restfulexample/rest/json/metallica/get").request("application/json").get(String.class);
          System.out.println(track);

        return track;
    }

}

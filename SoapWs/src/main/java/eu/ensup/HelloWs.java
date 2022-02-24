package eu.ensup;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.ResponseWrapper;

@WebService(endpointInterface = "eu.ensup.IHello")
public class HelloWs implements IHello{

    @WebMethod
    public Track CallRest(){
        Client client = ClientBuilder.newClient();
        Track track = client.target("http://localhost:8080/restfulexample/rest/json/metallica/get").request("application/json").get(Track.class);
        System.out.println(track);

        return track;
    }

    @WebMethod
    public String CalltrackString(){
        Client client = ClientBuilder.newClient();
        Track track = client.target("http://localhost:8080/restfulexample/rest/json/metallica/get").request("application/json").get(Track.class);
        System.out.println(track);

        return track.toString();
    }

    @WebMethod
    @ResponseWrapper
    public ResponsesPost SaveTrack(Track track){
        Client client = ClientBuilder.newClient();
        javax.ws.rs.core.Response res = client
        .target("http://localhost:8080/restfulexample/rest/json/metallica/post")
        .request("application/json")
        .post(Entity.entity(track, MediaType.APPLICATION_JSON));
        System.out.println(res);
        return new ResponsesPost(res.getStatus(), res.getStatusInfo().getReasonPhrase());
    }

}

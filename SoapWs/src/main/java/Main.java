import eu.ensup.HelloWs;

import javax.xml.ws.Endpoint;

public class Main {
    public static final String URI = "http://localhost:8888/hello";

    public static void main(String[] args){

        HelloWs imple = new HelloWs();

        Endpoint callbackImpl = Endpoint.publish(URI,imple);

        Boolean status = callbackImpl.isPublished();

        System.out.println("Web service disponible? " + status);
    }
}

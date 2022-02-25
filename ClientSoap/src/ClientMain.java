import client.HelloWs;
import client.HelloWsService;
import client.Track;

public class ClientMain {

    public static void main(String[] args) {

        HelloWsService monService = new HelloWsService();
        HelloWs port = monService.getHelloWsPort();
        System.out.println(" Object complexe : "+ port.callRest());
        System.out.println(" Object simple (string): "+port.calltrackString());

        Track tra = new Track("flavien","vive le vent");

        System.out.println("la musique qui va etre crée: "+ tra);
        System.out.println("Post Response : ");
        System.out.println(port.saveTrack(tra));
    }
}

import client.HelloWsService;
import client.IHello;
import client.Track;

public class ClientMain {

    public static void main(String[] args) {

        HelloWsService monService = new HelloWsService();
        IHello port = monService.getHelloWsPort();
        System.out.println(" Object complexe : "+ port.callRest());
        System.out.println(" Object simple (string): "+port.calltrackString());

        System.out.println("Post Response : ");
        Track tra = new Track("flavien","vive le vent");

        System.out.println("la musique qui va etre crée: "+ tra);
        System.out.println(port.saveTrack(tra));
    }
}

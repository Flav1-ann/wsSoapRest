import client.HelloWsService;
import client.IHello;
import client.Track;

public class ClientMain {

    public static void main(String[] args) {

        HelloWsService monService = new HelloWsService();
        IHello port = monService.getHelloWsPort();
        System.out.println(" Object complexe: "+port.callRest());
        System.out.println(" Object simple (string): "+port.calltrackString());

        Track tra = new Track("test","test");
        System.out.println(port.saveTrack(tra));
    }
}

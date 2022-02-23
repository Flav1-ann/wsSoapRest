import client.HelloWsService;
import client.IHello;

public class ClientMain {

    public static void main(String[] args) {

        HelloWsService monService = new HelloWsService();
        IHello port = monService.getHelloWsPort();
        System.out.println(port.callREst());
    }
}

package Server;


import Firebase.IFirebaseFacilitator;
import static javax.xml.ws.Endpoint.publish;
import static javax.xml.Endpoint


public class Server {
    public static void main(String[] args) {

        System.out.println("publicerer feedbacksystem");
        IFirebaseFacilitator feedback = new impl();
        publish("http://[::]:9901/feedbacktjeneste", feedback);
        System.out.println("Du kan give feedback");
}

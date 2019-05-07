package SOAPFeedback;


import Firebase.IFirebaseFacilitator;



public class Server {
    public static void main(String[] args) {

        System.out.println("publicerer feedbacksystem");
        IFirebaseFacilitator feedback = new impl();
        publish("http://[::]:9901/feedbacktjeneste", feedback);
        System.out.println("Du kan give feedback");
}

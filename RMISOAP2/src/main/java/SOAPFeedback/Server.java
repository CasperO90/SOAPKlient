package SOAPFeedback;






public class Server {
    public static void main(String[] args) {

        System.out.println("publicerer feedbacksystem");
        ISOAP feedback = new Impl();
        publish("http://[::]:9901/feedbacktjeneste", feedback);
        System.out.println("Du kan give feedback");
}

package Klient;

import DTO.FeedbackBatchDTO;
import DTO.FeedbackDTO;
import Firebase.EnumCollectionMapException;
import Firebase.IFirebaseFacilitator;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;


public class Klient {

    public static void main(String[] arg) throws MalformedURLException, InterruptedException, ExecutionException, RemoteException, EnumCollectionMapException {

        URL url = new URL("http://localhost:1617/Feedback-backend");
        QName qname = new QName("http://firebase","ImplementeringService?"); //De rigtige parametre skal indsættes
        Service service = Service.create(url, qname);

        /*

        URL url = new URL("http://localhost:9901/feedbacktjeneste?wsdl");
		QName qname = new QName("http://dist/", "ImplService");
		Service service = Service.create(url, qname);

         */

        //String url = "rmi://localhost:1617/Feedback-backend";


        IFirebaseFacilitator fire = null;
        try {
            fire = (IFirebaseFacilitator) Naming.lookup(String.valueOf(url)); // Naming.lookup(url)
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(fire.HentVirksomhedMedId(0).getNavn());


        Scanner in = new Scanner(System.in);

        /*
        //login
        String username;
        System.out.println("Indtast brugernavn: ");
        String brugernavn = in.next();
        fire.init();
        fire.getUserByUsername(brugernavn);
        //skriv noget med password her
        */

        System.out.println("Velkommen til SpinOff! \n Skriv: \n 1 for at oprette virksomhedsID \n 2 for at give feedback");
        int next = in.nextInt();
        switch (next) {

            case 1:
                System.out.println("Indtast navn på virksomhed");
                String navn = in.nextLine();
                System.out.println("Giv virksomheden et ID");
                int virksomhedsid = in.nextInt();
                fire.tilføjVirksomhed(virksomhedsid, navn);
                break;

            case 2:
                System.out.println("Indtast maksimum seks spørgsmål, du vil stille mødedeltageren");

                List<String> questions = new ArrayList();
                for (int i = 0; i < 6; i++) {
                    System.out.println("Skriv spørgsmål " + i);
                    String spg = in.nextLine();
                    questions.add(spg);
                }
                fire.setCustomQuestions(questions);
                break;


            case 3:
                System.out.println("Give feedback! \n ");
                FeedbackBatchDTO feedbackBatchDTO = new FeedbackBatchDTO();
                ArrayList<FeedbackDTO> feedbackDTOArrayList = new ArrayList<FeedbackDTO>();
                for (int i = 0; i < 6; i++) {
                    System.out.println("Giv en bedømmelse mellem 0-3");
                    int vote = in.nextInt();
                    System.out.println("Skriv en kommentar");
                    String comment = in.nextLine();
                    FeedbackDTO feedbackDTO = new FeedbackDTO();
                    feedbackDTO.setVote(vote);
                    feedbackDTO.setComment(comment);
                    feedbackDTOArrayList.add(feedbackDTO);
                }
                feedbackBatchDTO.setFeedback(feedbackDTOArrayList);
                fire.givFeedback(feedbackBatchDTO);
        }
    }
}



package lezione17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lezione17Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Lezione17Application.class, args);
        configurationClass();
    }

    public static void configurationClass() throws InterruptedException {
//        Scanner input = new Scanner(System.in);
//        System.err.println("Buonasera, benvenuti da Spring, come posso esservi utile?");
//        TimeUnit.MILLISECONDS.sleep(500);
//        System.out.println("Buonasera, sarebbe disponibile un tavolo per...");
//        int l = 0;
//        do {
//            System.out.println("Vuoi selezionare un periodo?");
//            System.out.println("1 - Sì; 2 - No; 0 - Torna indietro.");
//            try {
//                l = Integer.parseInt(input.nextLine().trim());
//                if (l < 0 || l > 3)
//                    System.err.println("Inserisci un valore consentito.");
//            } catch (NumberFormatException ex) {
//                System.err.println("Il valore inserito non è un numero.");
//            } catch (Exception ex) {
//                System.err.println("Problema generico");
//            }
//
//        } while (l != 0);
    }
}

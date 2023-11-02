package lezione17.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Getter
@AllArgsConstructor
@Component("menù")
public class Menu {
    private List<Pizza> pizze;
    private List<Beverage> bevande;

    public void printMenu() throws InterruptedException {
        System.err.println("***************************** PIZZERIA SPRING *****************************"+ System.lineSeparator());
        System.err.println("PIZZE");
        pizze.forEach(System.out::println);
        TimeUnit.MILLISECONDS.sleep(500);
        System.err.println(System.lineSeparator()+"BEVANDE");
        TimeUnit.MILLISECONDS.sleep(500);
        bevande.forEach(System.out::println);
    }
}

package lezione17;

import lezione17.enteties.Beverage;
import lezione17.enteties.Menu;
import lezione17.enteties.Pizza;
import lezione17.enteties.Tavolo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class Lezione17Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Lezione17Application.class, args);
        configurationClass();
    }

    public static void configurationClass() throws InterruptedException {
    }
}

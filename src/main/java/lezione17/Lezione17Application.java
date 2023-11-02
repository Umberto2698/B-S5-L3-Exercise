package lezione17;

import lezione17.enteties.Beverage;
import lezione17.enteties.Pizza;
import lezione17.enteties.Tavolo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class Lezione17Application {

    public static void main(String[] args) {
        SpringApplication.run(Lezione17Application.class, args);
        configurationClass();
    }

    public static void configurationClass() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Lezione17Application.class);
        Tavolo table = (Tavolo) (ctx.getBean("table"));
        List<Pizza> pizze = (List<Pizza>) (ctx.getBean("getPizze"));
        List<Beverage> bevande = (List<Beverage>) (ctx.getBean("getBevande"));
        System.out.println(ctx.getBean("order"));
        ctx.close();
    }
}

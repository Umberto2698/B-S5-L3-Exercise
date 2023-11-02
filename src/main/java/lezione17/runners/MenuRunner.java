package lezione17.runners;

import lezione17.Lezione17Application;
import lezione17.enteties.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class MenuRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Lezione17Application.class);
        Menu menù = (Menu) ctx.getBean("menù");
        menù.printMenu();
        Ordine order = new Ordine((Tavolo) ctx.getBean("table1"), Stream.of((Pizza) ctx.getBean("getDiavola"), (Pizza) ctx.getBean("getBase")).toList(), Stream.of((Beverage) ctx.getBean("getBirra"), (Beverage) ctx.getBean("getWater")).toList(), 2, 2);
        System.out.println(order);
        ctx.close();
    }
}

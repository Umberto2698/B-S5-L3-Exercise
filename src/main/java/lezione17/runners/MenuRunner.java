package lezione17.runners;

import lezione17.Lezione17Application;
import lezione17.enteties.Menu;
import lezione17.enteties.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Lezione17Application.class);
        Menu menù = (Menu) ctx.getBean("menù");
        menù.printMenu();
        Ordine order = (Ordine) ctx.getBean("getOrder");
        System.out.println(System.lineSeparator() + order);
        ctx.close();
    }
}

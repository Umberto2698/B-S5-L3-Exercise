package lezione17.enteties;

import lezione17.enums.OrderState;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@PropertySource("application.properties")
@Getter
@ToString
public class Ordine {
    private long orderNumber = new Random().nextLong(1000000000000L, 10000000000000L);
    private Tavolo tavolo;
    private OrderState orderState = OrderState.IN_CORSO;
    private int clientsNumber;
    private double total;
    private List<Pizza> pizze;
    private List<Beverage> bevande;
    private int hour;
    private int minute;

    public Ordine(Tavolo tavolo, List<Pizza> pizze, List<Beverage> bevande, @Value("${seat.price}") double seatPrice) {
        this.tavolo = tavolo;
        this.pizze = pizze;
        this.clientsNumber = 3;
        this.bevande = bevande;
        this.hour = LocalDateTime.now().getHour();
        this.minute = LocalDateTime.now().getMinute();
        pizze.forEach(pizza -> total += pizza.getPrice());
        bevande.forEach(beverage -> total += beverage.getPrice());
        this.total=total+clientsNumber*seatPrice;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public void setBevande(List<Beverage> bevande) {
        this.bevande = bevande;
    }
}

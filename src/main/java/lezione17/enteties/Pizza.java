package lezione17.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class Pizza {
    private int calories;
    private double price;
    private String name;
    private List<Topping> toppings;

    public Pizza(List<Topping> toppings) {
        this.toppings = toppings;
        toppings.forEach(topping -> price += topping.getPrice());
        setPrice(price);
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

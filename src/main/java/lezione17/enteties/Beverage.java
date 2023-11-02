package lezione17.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Beverage {
    private int calories;
    private double price;
    private String name;
}

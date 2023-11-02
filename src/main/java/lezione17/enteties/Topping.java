package lezione17.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Topping {
    private String name;
    private double price;
}

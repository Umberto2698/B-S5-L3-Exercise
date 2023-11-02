package lezione17.enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizze;
    private List<Beverage> bevande;
}

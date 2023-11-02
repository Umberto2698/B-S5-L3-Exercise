package lezione17;

import lezione17.enteties.Beverage;
import lezione17.enteties.Menu;
import lezione17.enteties.Pizza;
import lezione17.enteties.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    Pizza getBase() {
        return new Pizza(1000, 5.00, "Margherita", null);
    }

    @Bean
    Pizza getBismark() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getPatatine());
        toppings.add(getUovo());
        toppings.add(getWurstel());
        return new Pizza(3000, 8.50, "Bismark", toppings);
    }

    @Bean
    Pizza getBaby() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getPatatine());
        toppings.add(getWurstel());
        return new Pizza(4000, 7.50, "Baby", toppings);
    }

    @Bean
    Pizza getDiavola() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getSalamimno());
        return new Pizza(5000, 6.50, "Diavola", toppings);
    }

    @Bean
    Pizza getCoco() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getUovo());
        toppings.add(getProsciutto());
        return new Pizza(2500, 7.00, "Cocò", toppings);
    }

    @Bean
    Pizza grtProsciuttoEFunghi() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getFunghi());
        toppings.add(getProsciutto());
        return new Pizza(2500, 7.00, "Cocò", toppings);
    }

    @Bean
    Pizza getTonnoCiplla() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getTonno());
        toppings.add(getCipolla());
        return new Pizza(2500, 8.00, "Tonno e cipolla", toppings);
    }

    @Bean
    Beverage getWater() {
        return new Beverage(0, 1.10, "Acqua naturale/frizzante");
    }

    @Bean
    Beverage getBirra() {
        return new Beverage(300, 4.00, "Ceres");
    }

    @Bean
    Beverage getCocaCola() {
        return new Beverage(100, 2.20, "CocaCola");
    }

    @Bean
    Topping getTonno() {
        return new Topping("Tonno", 1.00);
    }

    @Bean
    Topping getPatatine() {
        return new Topping("Patatine fritte", 1.50);
    }

    @Bean
    Topping getWurstel() {
        return new Topping("Wurstel", 1.50);
    }

    @Bean
    Topping getCipolla() {
        return new Topping("Cipolla", 1.00);
    }

    @Bean
    Topping getProsciutto() {
        return new Topping("Prosciutto cotto", 2.00);
    }

    @Bean
    Topping getUovo() {
        return new Topping("Uovo", 1.50);
    }

    @Bean
    Topping getFunghi() {
        return new Topping("Funghi", 2.00);
    }

    @Bean
    Topping getSalamimno() {
        return new Topping("Salamino piccante", 2.00);
    }

    @Bean
    List<Pizza> getPizze() {
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(getDiavola());
        pizze.add(getTonnoCiplla());
        return pizze;
    }

    @Bean
    List<Beverage> getBevande() {
        List<Beverage> bevande = new ArrayList<>();
        bevande.add(getCocaCola());
        bevande.add(getBirra());
        return bevande;
    }

    @Bean
    Menu getMenu() {
        List<Pizza> pizze = new ArrayList<>();
        List<Beverage> bevande = new ArrayList<>();
        pizze.add(getCoco());
        pizze.add(getBase());
        pizze.add(getBaby());
        pizze.add(getDiavola());
        pizze.add(getBismark());
        pizze.add(getDiavola());
        pizze.add(grtProsciuttoEFunghi());
        pizze.add(getTonnoCiplla());
        bevande.add(getWater());
        bevande.add(getCocaCola());
        bevande.add(getBirra());
        return new Menu(pizze, bevande);
    }
}

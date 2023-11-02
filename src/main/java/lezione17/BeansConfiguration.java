package lezione17;

import lezione17.enteties.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Configuration
@PropertySource("application.properties")
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
        return new Pizza(2500, 7.00, "Prosciutto e funghi", toppings);
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
    Tavolo table1() {
        return new Tavolo(1);
    }

    @Bean
    Tavolo table2() {
        return new Tavolo(2);
    }

    @Bean
    Tavolo table3() {
        return new Tavolo(3);
    }

    @Bean
    Tavolo table4() {
        return new Tavolo(4);
    }

    @Bean
    Tavolo table5() {
        return new Tavolo(5);
    }

    @Bean
    Tavolo table6() {
        return new Tavolo(6);
    }

    @Bean
    Tavolo table7() {
        return new Tavolo(7);
    }

    @Bean
    Tavolo table8() {
        return new Tavolo(8);
    }

    @Bean
    Tavolo table9() {
        return new Tavolo(9);
    }

    @Bean
    Ordine getOrder(@Value("${seat.price}") double seatPrice) {
        return new Ordine(table1(), Stream.of(getDiavola(), getBase()).toList(), Stream.of(getBirra(), getWater()).toList(), 2, seatPrice);
    }
}

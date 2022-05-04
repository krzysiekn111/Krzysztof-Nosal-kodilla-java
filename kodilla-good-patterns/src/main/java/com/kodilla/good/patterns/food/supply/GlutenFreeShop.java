package com.kodilla.good.patterns.food.supply;

import java.time.LocalDate;

import static java.time.DayOfWeek.*;

public class GlutenFreeShop implements AbstractCatererProcessor {
    public Product glutenFreeShopProduct1 = new Product("Mleko Owsiane1", 3);

    @Override
    public Double process(Order order) {
        //Sklep przyjmuje nowe zamówienia tylko w Poniedziałki i Piątki
        LocalDate localDate = LocalDate.now();
        if (localDate.getDayOfWeek()==MONDAY || localDate.getDayOfWeek()==FRIDAY) {
            System.out.println("Order in Gluten Free Shop is accepted for: " + order.calculateOrderPrice(order));
            return order.calculateOrderPrice(order);
        }
        else System.out.println("sorry but the shop is closed on : " + localDate.getDayOfWeek() +"\n" +
                "Please Try it on Mondays or Fridays");
        return null;
    }
}

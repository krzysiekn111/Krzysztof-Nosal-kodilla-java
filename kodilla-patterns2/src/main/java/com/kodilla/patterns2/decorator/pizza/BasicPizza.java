package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder {

    @Override
    public BigDecimal getPizzaCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getIngredients() {
        return "dough and tomato sauce with cheese";
    }
}

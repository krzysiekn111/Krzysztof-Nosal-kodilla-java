package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheeseDecorator extends AbstractPizzaOrderDecorator {
    public AdditionalCheeseDecorator(PizzaOrder pizzaOrder) {super(pizzaOrder);}

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + additional cheese";
    }
}

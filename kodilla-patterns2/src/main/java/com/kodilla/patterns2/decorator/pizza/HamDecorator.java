package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HamDecorator extends AbstractPizzaOrderDecorator {
    public HamDecorator(PizzaOrder pizzaOrder) {super(pizzaOrder);}

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + ham";
    }
}

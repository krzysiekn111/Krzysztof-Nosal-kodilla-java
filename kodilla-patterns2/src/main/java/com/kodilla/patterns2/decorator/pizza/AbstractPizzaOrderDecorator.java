package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPizzaCost() {
        return pizzaOrder.getPizzaCost();
    }

    @Override
    public String getIngredients() {
        return pizzaOrder.getIngredients();
    }
}

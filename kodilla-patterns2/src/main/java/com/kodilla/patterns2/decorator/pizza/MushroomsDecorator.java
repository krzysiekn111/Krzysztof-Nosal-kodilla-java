package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsDecorator extends  AbstractPizzaOrderDecorator {
    public MushroomsDecorator(PizzaOrder pizzaOrder) {super(pizzaOrder);}

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + mushrooms";
    }
}

package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getPizzaCost();
        //Then
        assertEquals(new BigDecimal(22), theCost);
    }
    @Test
    void testPizzaOrderGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals("dough and tomato sauce with cheese + ham + additional cheese", ingredients);
    }
}

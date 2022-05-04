package com.kodilla.good.patterns.food.supply;

public class Application {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        OrderItem orderItem1 = new OrderItem(extraFoodShop.extraFoodProduct1, 10);
        OrderItem orderItem2 = new OrderItem(extraFoodShop.extraFoodProduct2, 2);
        OrderItem orderItem3 = new OrderItem(extraFoodShop.extraFoodProduct3, 7);

        OrderItem orderItem4 = new OrderItem(glutenFreeShop.glutenFreeShopProduct1, 57);

        OrderItem orderItem5 = new OrderItem(healthyShop.healthyShopProduct1, 2);
        OrderItem orderItem6 = new OrderItem(healthyShop.healthyShopProduct2, 9);
        OrderItem orderItem7 = new OrderItem(healthyShop.healthyShopProduct3, 8);
        OrderItem orderItem8 = new OrderItem(healthyShop.healthyShopProduct4, 4);

        Order order = new Order(extraFoodShop, orderItem1, orderItem2, orderItem3);
        Order order2 = new Order(glutenFreeShop, orderItem4);
       Order order3 = new Order(healthyShop, orderItem5, orderItem6, orderItem7, orderItem8);

       order.getAbstractCatererProcessor().process(order);
        order2.getAbstractCatererProcessor().process(order2);
        order3.getAbstractCatererProcessor().process(order3);



    }
}
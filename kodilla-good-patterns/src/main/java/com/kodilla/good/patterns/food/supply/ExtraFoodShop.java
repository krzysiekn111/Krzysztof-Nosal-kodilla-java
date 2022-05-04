package com.kodilla.good.patterns.food.supply;

public class ExtraFoodShop implements AbstractCatererProcessor {
    public Product extraFoodProduct1 = new Product("pierś z kurczaka w sosie", 17);
    public Product extraFoodProduct2 = new Product("Żeberka", 20);
    public Product extraFoodProduct3 = new Product("pierogi", 8);

    @Override
    public Double process(Order order) {
        //Sklep oferuje zniżki przy zakupie większej ilości towaru
        Double discountPrice;
        if (order.calculateOrderPrice(order) > 400) {
            discountPrice = order.calculateOrderPrice(order) * 0.9;
            System.out.println("Order in Extra Food Shop is accepted for: " + discountPrice);
            return discountPrice;
        } else if (order.calculateOrderPrice(order) > 300) {
            discountPrice = order.calculateOrderPrice(order) * 0.92;
            System.out.println("Order in Extra Food Shop is accepted for: " + discountPrice);
            return discountPrice;
        } else if (order.calculateOrderPrice(order) > 200) {
            discountPrice = order.calculateOrderPrice(order) * 0.95;
            System.out.println("Order is accepted for: " + discountPrice);
        }
        System.out.println("Order in Extra Food Shop is accepted for: " + order.calculateOrderPrice(order));
        return order.calculateOrderPrice(order);

    }
}

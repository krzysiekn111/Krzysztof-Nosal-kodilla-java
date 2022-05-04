package com.kodilla.good.patterns.food.supply;

import java.util.Collections;
import java.util.List;

public class HealthyShop implements AbstractCatererProcessor {
    public Product healthyShopProduct1 = new Product("product1", 4);
    public Product healthyShopProduct2 = new Product("product2", 8);
    public Product healthyShopProduct3 = new Product("product3", 2);
    public Product healthyShopProduct4 = new Product("product4", 7);

    @Override
    public Double process(Order order) {
        //sklep oferuje zniżki za zakup zróżnicowanego asortymentu
        Double discount = 1.0;

        if (order.getOrderItems().stream()
                .anyMatch(i -> i.getProduct().getProductName().equals("product1"))) {
            discount+=0.05;
        }
        if (order.getOrderItems().stream()
                .anyMatch(i -> i.getProduct().getProductName().equals("product2"))) {
            discount+=0.05;
        }
        if (order.getOrderItems().stream()
                .anyMatch(i -> i.getProduct().getProductName().equals("product3"))) {
            discount+=0.05;
        }
        if (order.getOrderItems().stream()
                .anyMatch(i -> i.getProduct().getProductName().equals("product4"))) {
            discount+=0.05;
        }

        System.out.println("Order in Extra Food Shop is accepted for: " + order.calculateOrderPrice(order)/discount
        + "\nYou discout is: " + discount);
        return order.calculateOrderPrice(order)/discount;

    }

    public Product getHealthyShopProduct1() {
        return healthyShopProduct1;
    }

    public Product getHealthyShopProduct2() {
        return healthyShopProduct2;
    }

    public Product getHealthyShopProduct3() {
        return healthyShopProduct3;
    }

    public Product getHealthyShopProduct4() {
        return healthyShopProduct4;
    }
}

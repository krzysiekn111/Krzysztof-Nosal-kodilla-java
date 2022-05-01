package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basket {
    Double overallPrice = 0.0;
    private static final String MOJA_DANA = "MOJA_WARTOSC";
    private List<OrderPosition> orderPositions;
    private String  order = "";

    public Basket(List<OrderPosition> orderPositions) {
        this.orderPositions = orderPositions;
    }

    public void order() {
        for (int i = 0; i < orderPositions.size(); i++) {
            order+= orderPositions.get(i).getProduct().productsName + ": " + orderPositions.get(i).getQuantity() + "\n";
        }
        System.out.println(order);
    }

    public Double calculateOverallPrice() {
        for (int i = 0; i < orderPositions.size(); i++) {
            if (orderPositions.get(i).getQuantity()>orderPositions.get(i).getProduct().getOnStock()) {
                System.out.println(orderPositions.get(i).getProduct().getProductsName() + ": Product is out of stock");
                return null;
            }
            overallPrice += orderPositions.get(i).getQuantity() * orderPositions.get(i).getProduct().getPrice();
        }
        return overallPrice;
    }
}

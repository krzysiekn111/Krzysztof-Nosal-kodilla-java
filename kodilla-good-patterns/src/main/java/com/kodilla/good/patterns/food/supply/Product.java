package com.kodilla.good.patterns.food.supply;

public class Product {
    private String product;
    private Integer productsPrice;

    public Product(String product, Integer productsPrice) {
        this.product = product;
        this.productsPrice = productsPrice;
    }

    public String getProductName() {
        return product;
    }

    public Integer getProductsPrice() {
        return productsPrice;
    }
}


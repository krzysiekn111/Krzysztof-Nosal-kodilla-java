package com.kodilla.good.patterns.challenges;

public class Product {
    public final String productsName;
    public Integer onStock;
    public Double price;

    public Product(String productsName, Integer onStock, Double price) {
        this.productsName = productsName;
        this.onStock = onStock;
        this.price = price;
    }

    public String getProductsName() {
        return productsName;
    }

    public Integer getOnStock() {
        return onStock;
    }

    public void setOnStock(Integer onStock) {
        this.onStock = onStock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

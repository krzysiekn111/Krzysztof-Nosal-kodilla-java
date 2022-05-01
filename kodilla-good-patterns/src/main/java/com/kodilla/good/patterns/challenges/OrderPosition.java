package com.kodilla.good.patterns.challenges;

public class OrderPosition {
    private Product product;

    private Integer quantity;
    public OrderPosition(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    private Double createOrderToBasket() {
        return product.getPrice()*quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}

package com.kodilla.good.patterns.food.supply;

import java.util.List;

public class Order {
    private List<OrderItem> orderItems;
    protected Double overallPrice = 0.0;
    private AbstractCatererProcessor abstractCatererProcessor;
    protected String namesOfOrderItems;

    Order(AbstractCatererProcessor abstractCatererProcessor, OrderItem... orderItems){
        this.orderItems = List.of(orderItems);
        this.abstractCatererProcessor = abstractCatererProcessor;
    }

    Double calculateOrderPrice(Order order) {
        for (int i = 0; i<order.getOrderItems().size(); i++) {
            overallPrice+=order.getOrderItems().get(i).getProduct().getProductsPrice() *
                    order.getOrderItems().get(i).getQuantity();
        }
        return overallPrice;
    }
    String getOrderItemString() {
        for (int i = 0; i<orderItems.size(); i++) {
            namesOfOrderItems+=orderItems.get(i).getProduct();
        }
        return namesOfOrderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public AbstractCatererProcessor getAbstractCatererProcessor() {
        return abstractCatererProcessor;
    }
}

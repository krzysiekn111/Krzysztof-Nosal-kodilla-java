package com.kodilla.good.patterns.food.supply;

public class OrderService {

    public void processOrder(Order order) {
        AbstractCatererProcessor processor = order.getAbstractCatererProcessor();
        processor.process(order);
    }

}

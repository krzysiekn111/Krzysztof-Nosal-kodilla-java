package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderAppTest {

    public static void main(String[] args) {
        Client client = new Client("Adam", 370.0);
        Product szelki = new Product("Szelki", 20, 14.50);
        Product doniczki = new Product("doniczki", 80, 6.0);
        Product klapki = new Product("klapki", 12, 31.0);

        OrderPosition orderPosition = new OrderPosition(szelki, 20);
        OrderPosition orderPosition1 = new OrderPosition(doniczki, 3);
        OrderPosition orderPosition2 = new OrderPosition(klapki, 1);

        System.out.println(client.accountBalance); //Przed zakupem
        List<OrderPosition> orderPositions = List.of(orderPosition, orderPosition1, orderPosition2);
        Basket basket = new Basket(orderPositions);
        CashRegister cashRegister = new CashRegister();
        cashRegister.purchase(client, basket);
        System.out.println(client.accountBalance);//Po zakupie

    }

}

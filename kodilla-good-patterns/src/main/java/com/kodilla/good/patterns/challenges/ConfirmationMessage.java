package com.kodilla.good.patterns.challenges;

public class ConfirmationMessage {
    public void confirmation(Client client,Basket basket) {
        client.accountBalance-=basket.overallPrice;
        System.out.println("Order has been placed\n");
        basket.order();
    }
}

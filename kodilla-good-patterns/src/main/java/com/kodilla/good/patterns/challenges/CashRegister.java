package com.kodilla.good.patterns.challenges;

public class CashRegister {
    public void purchase(Client client, Basket basket) {
        if (client.accountBalance < basket.calculateOverallPrice()) {
            System.out.println("Lack of account funds");
        } else {
            ConfirmationMessage confirmationMessage = new ConfirmationMessage();
            confirmationMessage.confirmation(client,basket);
        }
    }
}

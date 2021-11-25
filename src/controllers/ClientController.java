package controllers;

import views.ClientView;
import models.Client;
import utils.Rounder;

public class ClientController {

    ClientView view;
    Client clientModel;
    String pattern;
    double discount;
    double discountRate;
    double payment;
    double finalPayment;
    String discountRound;
    String paymentRound;
    String finalPaymentRound;

    public ClientController(ClientView view, Client model) {
        this.view = view;
        this.clientModel = model;
    }

    public void runAppClient() {

        discountRate = 10;
        pattern = "#.00";

        view.inputDataClient();

        payment = clientModel.calcPayment(clientModel.getQuantity(), clientModel.getPrice());
        discount = clientModel.calcDiscount(payment, discountRate);
        finalPayment = payment - discount;

        paymentRound = Rounder.round(payment, pattern);
        discountRound = Rounder.round(discount, pattern);
        finalPaymentRound = Rounder.round(finalPayment, pattern);

        System.out.println("Имя покупателя: " + clientModel.getName() +
                "\nКолличество купленного товара: " + clientModel.getQuantity() +
                " шт.\nЦена единицы товара: " + clientModel.getPrice() +
                " грн.\nСумма покупок: " + paymentRound +
                " грн.\nСкидка: " + discountRound +
                " грн.\nСумма с учетом скидки: " + finalPaymentRound + " грн.");
    }
}

package controllers;

import views.ClientView;
import models.Client;
import utils.Rounder;

public class ClientController {

    ClientView view;
    Client model;
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
        this.model = model;
    }

    public void runAppClient() {

        discountRate = 10;
        pattern = "#.00";

        view.inputDataClient();

        payment = model.calcPayment(model.getQuantity(), model.getPrice());
        discount = model.calcDiscount(payment, discountRate);
        finalPayment = payment - discount;

        paymentRound = Rounder.round(payment, pattern);
        discountRound = Rounder.round(discount, pattern);
        finalPaymentRound = Rounder.round(finalPayment, pattern);

        String output = "Имя покупателя: " + model.getName() +
                "\nКолличество купленного товара: " + model.getQuantity() +
                " шт.\nЦена единицы товара: " + model.getPrice() +
                " грн.\nСумма покупок: " + paymentRound +
                " грн.\nСкидка: " + discountRound +
                " грн.\nСумма с учетом скидки: " + finalPaymentRound + " грн.";

        view.outputDataClient(output);
    }
}

package controllers;

import views.ClientView;
import models.Client;
import utils.Rounder;

public class ClientController {

    ClientView view;
    Client model;
    String pattern;
//    Rounder rounder;
//    int quantity;
//    double price;
    double discount;
    double discountRate;
    double payment;
    double finalPayment;
    String discountRound;
    String paymentRound;
    String finalPaymentRound;

    void runAppClient() {
        discountRate = 10;
        pattern = "#.00";
        model = new Client();
        view = new ClientView();

        view.inputDataClient();

        payment = model.calcPayment(model.getQuantity(),model.getPrice());
        discount = model.calcDiscount(payment, discountRate);
        finalPayment = payment - discount;

        paymentRound = Rounder.round(payment, pattern);
        discountRound = Rounder.round(discount, pattern);
        finalPaymentRound = Rounder.round(finalPayment, pattern);
    }

    public String getDiscountRound() {
        return discountRound;
    }

    public String getPaymentRound() {
        return paymentRound;
    }

    public String getFinalPaymentRound() {
        return finalPaymentRound;
    }
}

package controllers;

import views.ClientView;
import models.Client;
import utils.Rounder;

public class ClientController {

    ClientView view;
    Client model;
    Rounder rounder;
    int quantity;
    double price;
    double discount;
    double discountRate;
    double payment;
    double finalPayment;
    String discountRound;
    String paymentRound;
    String finalPaymentRound;


    void runAppClient() {
        view = new ClientView();
        view.inputDataClient();
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

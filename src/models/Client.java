package models;

import base.Discount;
import base.Payment;

public class Client implements Payment, Discount {

    @Override
    public double calcDiscount(double payment, double discountRate) {
        return payment * discountRate / 100;
    }

    @Override
    public double calcPayment(int quantity, double price) {
        return quantity * price;
    }
}

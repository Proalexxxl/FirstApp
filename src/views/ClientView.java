package views;

import utils.Validator;
import models.Client;
import java.util.Scanner;
import controllers.ClientController;

public class ClientView {

    Client model;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    public void inputDataClient() {
        model = new Client();
        scanner = new Scanner(System.in);

        System.out.println("Введите имя клиента:");
        name = Validator.validateName(scanner);
        model.setName(name);

        System.out.println("Введите колличество купленного товара:");
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        System.out.println("Введите цену единицы товара:");
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    void outputDataClient() {
        System.out.println("Имя покупателя: " + model.getName() +
                "\nКолличество купленного товара: " + model.getQuantity() +
                "шт.\nЦена единицы товара: " + model.getPrice() +
                "грн.\nСумма покупок: " +
                "грн.\nСкидка: " +
                "грн.\nСумма с учетом скидки: " + "грн.");
    }
}

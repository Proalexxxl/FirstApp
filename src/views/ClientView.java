package views;

import utils.Validator;
import models.Client;
import java.util.Scanner;

public class ClientView {

    Client model;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    public void inputData() {
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
}

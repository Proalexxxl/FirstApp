package views;

import utils.Validator;
import models.Client;
import java.util.Scanner;

public class ClientView {

    Client clientModel;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    public ClientView(Client model) {
        this.clientModel = model;
    }

    public void inputDataClient() {
        scanner = new Scanner(System.in);

        System.out.println("Введите имя клиента:");
        name = Validator.validateString(scanner);
        clientModel.setName(name);

        System.out.println("Введите колличество купленного товара:");
        quantity = Validator.validateIntInput(scanner);
        clientModel.setQuantity(quantity);

        System.out.println("Введите цену единицы товара:");
        price = Validator.validateDoubleInput(scanner);
        clientModel.setPrice(price);

        scanner.close();
    }
}

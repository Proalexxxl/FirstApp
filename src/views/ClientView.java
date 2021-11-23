package views;

import utils.Validator;
import models.Client;
import java.util.Scanner;
import controllers.ClientController;

public class ClientView {

    Client model;
    ClientController clientController;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    public ClientView(Client model, ClientController clientController) {
        this.model = model;
        this.clientController = clientController;
    }

    public void inputDataClient() {
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

    public void outputDataClient(String output) {

        System.out.println(output);
    }
}

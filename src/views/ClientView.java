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


    }
}

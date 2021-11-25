package controllers;

import utils.Validator;
import java.util.Scanner;

public class AppController {

    String subject;
    ClientController clientController;
    EmployeeController employeeController;
    Scanner scanner;

    public AppController(ClientController clientController, EmployeeController employeeController) {
        this.clientController = clientController;
        this.employeeController = employeeController;
    }

    public void subjectChoice(){

        scanner = new Scanner(System.in);
        System.out.println("Введите субъекта (клиент/сотрудник): ");
        subject = Validator.validateSubject(scanner);

        subject = subject.toLowerCase().trim();

        switch (subject) {
            case "клиент" -> clientController.runAppClient();
            case "сотрудник" -> employeeController.runAppEmployee();
            default -> System.out.println("Неверный ввод.");
        }

        scanner.close();
    }
}

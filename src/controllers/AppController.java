package controllers;

import java.util.Scanner;

public class AppController {

    String subject;
    ClientController client;
    EmployeeController employee;

    public void subjectChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите субъекта (клиент/сотрудник): ");
        subject = sc.nextLine();

        subject = subject.toLowerCase().trim();

        switch (subject) {
            case "клиент" -> client.runAppClient();
            case "сотрудник" -> employee.runAppEmployee();
            default -> System.out.println("Неверный ввод.");
        }
    }
}

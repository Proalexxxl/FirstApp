package views;

import java.util.Scanner;

import models.Employee;
import utils.Validator;

public class EmployeeView {

    Scanner scanner;
    Employee employeeModel;
    String name;
    String post;
    double hours;
    double salesAmount;

    public void inputData() {

        scanner = new Scanner(System.in);
        System.out.println("Введите имя сотрудника: ");
        name = Validator.validateName(scanner);
        employeeModel.setName(name);

        System.out.println("Введите должность сотрудника: ");
        post = Validator.validatePost(scanner);
        employeeModel.setPost(post);

        System.out.println("Введите колличество отработанных часов: ");
        hours = Validator.validateHoursInput(scanner);
        employeeModel.setHours(hours);

        System.out.println("Ввудите сумму продаж: ");
        salesAmount = Validator.validateSalesInput(scanner);
        employeeModel.setSalesAmount(salesAmount);

        scanner.close();
        }
}

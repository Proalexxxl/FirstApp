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

    public EmployeeView(Employee employeeModel) {
        this.employeeModel = employeeModel;
    }

    public void inputData() {

        scanner = new Scanner(System.in);
        System.out.println("Введите имя сотрудника: ");
        name = Validator.validateString(scanner);
        employeeModel.setName(name);

        System.out.println("Введите должность сотрудника: ");
        post = Validator.validateString(scanner);
        employeeModel.setPost(post);

        System.out.println("Введите колличество отработанных часов: ");
        hours = Validator.validateDoubleInput(scanner);
        employeeModel.setHours(hours);

        System.out.println("Ввудите сумму продаж: ");
        salesAmount = Validator.validateDoubleInput(scanner);
        employeeModel.setSalesAmount(salesAmount);

        scanner.close();
        }
}

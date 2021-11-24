package controllers;

import models.Employee;
import views.EmployeeView;
import utils.Rounder;

public class EmployeeController {

    Employee employeeModel;
    EmployeeView employeeView;
    double hoursRate;
    double prizeRate;
    double salary;
    double prize;
    double totalSalary;
    String salaryRound;
    String prizeRound;
    String totalSalaryRound;
    String pattern;



    public EmployeeController(Employee employeeModel, EmployeeView employeeView) {
        this.employeeModel = employeeModel;
        this.employeeView = employeeView;
    }

    public void runAppEmployee() {

        employeeView.inputData();

        hoursRate = 300;
        prizeRate = 4;
        pattern = "#.00";

        salary = employeeModel.calcSalary(employeeModel.getHours(), hoursRate);
        prize = employeeModel.calcPrize(employeeModel.getSalesAmount(), prizeRate);
        totalSalary = salary + prize;

        salaryRound = Rounder.round(salary, pattern);
        prizeRound = Rounder.round(prize, pattern);
        totalSalaryRound = Rounder.round(totalSalary, pattern);

        System.out.println("Имя сотрудника: " + employeeModel.getName() +
                        "\nДолжность сотрудника: " + employeeModel.getPost() +
                        "\nКолличество отработанных часов: " + employeeModel.getHours() +
                        " ч.\nСсума продаж: " + employeeModel.getSalesAmount() +
                        " грн.\nЗаработная плата: " + salaryRound +
                        " грн.\nПремия: " + prizeRound +
                        " грн.\nИтого к начислению: " + totalSalaryRound + " грн.");
    }
}

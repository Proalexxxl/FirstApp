package controllers;

import models.Employee;
import views.EmployeeView;

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


    }
}

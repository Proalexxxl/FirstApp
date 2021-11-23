package controllers;

import models.Employee;
import views.EmployeeView;

public class EmployeeController {

    Employee employeeModel;
    EmployeeView employeeView;

    public EmployeeController(Employee employeeModel, EmployeeView employeeView) {
        this.employeeModel = employeeModel;
        this.employeeView = employeeView;
    }

    public void runAppEmployee() {

        employeeView.inputData();
    }
}

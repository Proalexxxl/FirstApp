package models;

import base.Prize;
import base.Salary;

public class Employee implements Salary, Prize {

    private String name;
    private String post;
    private double hours;
    private double hoursRate;
    private double salesAmount;
    private double prizeRate;

    @Override
    public double calcPrize(double salesAmount, double prizeRate) {
        return salesAmount * prizeRate /100;
    }

    @Override
    public double calcSalary(double hours, double hoursRate) {
        return hours * hoursRate;
    }
}

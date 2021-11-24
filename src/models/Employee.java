package models;

import base.Prize;
import base.Salary;

public class Employee implements Salary, Prize {

    private String name;
    private String post;
    private double hours;
    private double salesAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public double calcPrize(double salesAmount, double prizeRate) {
        return salesAmount * prizeRate /100;
    }

    @Override
    public double calcSalary(double hours, double hoursRate) {
        return hours * hoursRate;
    }
}

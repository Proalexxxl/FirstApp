package controllers;

import java.util.Scanner;

public class AppController {

    String subject;

    public void subjectChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите субъекта (клиент/сотрудник): ");
        subject = sc.nextLine();

        subject = subject.toLowerCase().trim();

    }
}

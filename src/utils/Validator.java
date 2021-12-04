package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

// Валидатор ввода значений
public class Validator {

    // Валидация ввода субъерка
    public static String validateString(Scanner scanner) {
        String str = scanner.nextLine().trim();

            while (str.isEmpty()) {
                System.out.print("Пусто! Введите данные: ");
                str = scanner.nextLine().trim();
            }

        return str;
    }

    // Валидация ввода целого числа
    public static int validateIntInput(Scanner scanner) {
        int quantity;
        String str1 = null;
        String str;

        while (!scanner.hasNextInt()) {
            str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!%nВведите целое число!: ", str);
        }

        quantity = scanner.nextInt();

        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите целое число: ");

            while (!scanner.hasNextInt()) {
                try {
                    str1 = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - не число!%nВведите целое число!: ", str1);
                }
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // Валидация ввода дробного числа
    public static double validateDoubleInput(Scanner scanner) {
        double price;
        String str;
        String str1 = null;

        while (!scanner.hasNextDouble()) {
            str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!%nВведите число!: ", str);
        }

        price = scanner.nextDouble();

        while (price <= 0) {
            System.out.print("Неверное значение! Введите число: ");

            while (!scanner.hasNextDouble()) {
                try {
                    str1 = scanner.nextLine().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - не число!%nВведите число!: ", str1);
                }
            }

            price = scanner.nextDouble();
        }

        return price;
    }
}

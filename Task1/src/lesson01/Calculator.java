package lesson01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");

        double firstNumber = scanner.nextDouble();
        System.out.println("Select operation:");
        char operation = scanner.next().charAt(0);
        System.out.println("Select second number:");
        double secondNumber = scanner.nextDouble();

        Numbers numbers = new Numbers(firstNumber, secondNumber);
        String error = numbers.errorCheck(operation);
        if (error.isEmpty()) {
            System.out.println("Result: " + numbers.getResult(operation));
        } else {
            System.out.println(error);
        }
    }
}

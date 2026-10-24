
package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking User for number 1
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Asking User for number 2
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Asking for user to select the options
        System.out.println(""" 
                What do you want to do with the numbers:
                A, Add
                S, Subtract
                M, Multiply
                D, Divide""");

        // Creating another scanner.nextLine to collect left over
        scanner.nextLine();
        String operation = scanner.nextLine();

        int M = num1 * num2;
        System.out.println(num1 + " * " +  num2 + " = " +  M);

    }
}

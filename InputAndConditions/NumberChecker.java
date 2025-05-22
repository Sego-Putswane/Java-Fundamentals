package InputAndConditions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        /*
        Task 1: Number Checker
        Ask the user to enter a number.
        Tell them if it’s:
        Even or Odd
        Positive, Negative, or Zero
        👉 Do this in both Java and Python.
         */
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            try {
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                if (number % 2 == 0) {
                    System.out.println("Number is Even!");
                } else {
                    System.out.println("Number is Odd!");
                }
                break; // exit after successful input
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a valid number.");
                scanner.next(); // clear the invalid input
            }
        }

        if (number == 0) {
            System.out.println("Number is Zero!");
        } else if (number < 0) {
            System.out.println("Number is Negative!");
        } else {
            System.out.println("Number is Positive!");
        }

        scanner.close();
    }
}
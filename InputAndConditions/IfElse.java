package InputAndConditions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*
        🧪 Exercise #2 — "Movie Ticket Price Checker"
        Task:
        Ask the user for their age.
        Then:
        If the age is 12 or younger, the ticket price is R40
        If the age is between 13 and 64, the price is R70
        If the age is 65 or older, the price is R50
        👉 Print a message like:
        “You pay R40 for your ticket.”
        or
        “You pay R70 for your ticket.”
        ✅ Requirements:
        Use if, else if, and else (Java) or if, elif, and else (Python)
        Clean, readable output
        You can assume users enter a valid number (we’ll do error handling later)
        */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();

                if (age <= 12) {
                    System.out.println("You pay R40 for your ticket.");
                } else if (age > 65) {
                    System.out.println("You pay R50 for your ticket.");

                } else {
                    System.out.println("You pay R70 for your ticket.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a valid number");
                scanner.next();

            }
        }
        scanner.close();
    }
}

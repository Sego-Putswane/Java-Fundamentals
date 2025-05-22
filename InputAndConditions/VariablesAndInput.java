package InputAndConditions;

import java.util.Scanner;

public class VariablesAndInput {
    public static void main(String[] args) {
        /*
        🔤 Exercise Name: "Greeting the User"
        Task:
        Ask the user for their name and age.
        Then print a greeting that says:
        Hello, [name]! You are [age] years old.
        ✅ Requirements:
        Use a variable to store the name
        Use a variable to store the age
        Print the greeting in the correct format
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();

        System.out.println("Hello, "+name+"! You are "+age+" years old.");
    }
}

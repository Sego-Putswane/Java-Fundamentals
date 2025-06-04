import java.util.List;
import java.util.ArrayList;

/*
Write a function that takes a list of integers and returns the sum of all the even numbers in the list.
 */
public class SumOfEvenNumbers {
    public static int sumEvenNumbers(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }
}

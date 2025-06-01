import java.util.Arrays;
import java.util.List;
/*
Write a function that takes a list (or array) of integers and a number n.
The function must return the number of elements in the list that are divisible by n (i.e. the remainder is zero).
*/

public class Multiples {
    public static int countMultiples(List<Integer> numbers, int n) {
        int count = 0;

        for (int number : numbers){
            if(number % n == 0){
                count++;
            }
        }return count;
    }
}
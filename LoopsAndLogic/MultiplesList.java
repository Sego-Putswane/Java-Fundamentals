import java.util.List;
import java.util.ArrayList;

/*
Write a method that takes a start number, an end number, and a divisor n.
Return an array or list of all numbers between start and end (inclusive) that are divisible by n.
If none, return an empty list.
 */
public class MultiplesList {
    public static List<Integer> countMultiplesList(int start, int end, int n){
        List<Integer> multiples = new ArrayList<>();

        for (int i = start; i <= end; i++){
            if (i % n == 0){
                multiples.add(i);
            }
        }return multiples;
    }
}
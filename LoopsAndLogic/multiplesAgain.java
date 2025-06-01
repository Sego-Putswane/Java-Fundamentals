/*
'''Write a function that takes a start number, an end number, and a divisor n.
The function must return how many numbers in the range from start to end (inclusive) are divisible by n.'''
 */
public class MultiplesAgain {
    public static int countMultiplesAgain(int start, int end, int n){
        int count = 0;

        for(int i = start; i <= end; i++){
            if(i % n == 0){
                count++;
            }
        }return count;
    }
}
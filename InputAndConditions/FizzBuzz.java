package InputAndConditions;
public class FizzBuzz {
    public static void main(String[] args){
        /*
        🧪 Problem:
        Write a function that takes a number and returns:
        "Fizz" if it's divisible by 3
        "Buzz" if it's divisible by 5
        "FizzBuzz" if divisible by both
        Otherwise, return the number itself as a string
         */
        int number = 15;
        System.out.println(checkeFizzBuzz(number));
    }
    public static String checkeFizzBuzz(int number);{
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}
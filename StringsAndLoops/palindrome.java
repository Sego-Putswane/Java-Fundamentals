/*
Write a function that takes a string and checks if it is a palindrome.
A palindrome is a word that reads the same forward and backward.
Ignore case (e.g. "Racecar" is a palindrome).
 */
public class Palindrome {
    public static boolean isPalindrome(String word){
        String reversed = new StringBuilder(word).reverse().toString();

        return word.toLowerCase().equals(reversed.toLowerCase());
    }
}
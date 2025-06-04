/*
🧠 Question (No Solutions, As Requested):
Write a function that takes a string as input and returns the string reversed.
The reverse must be character by character.
If the input is an empty string, return an empty string.
 */
public class ReversedString {
    public static String getReversedString(String word){
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        return reversed;
    }
}


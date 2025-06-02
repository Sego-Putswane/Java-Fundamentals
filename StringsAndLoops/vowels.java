public class Vowels {
    public static int vowelCounter(String word) {
        int counter = 0;
        String vowels = "aeiou";

        for (int i = 0; i < word.length(); i++) {
            char letter = Character.toLowerCase(word.charAt(i));
            if (vowels.indexOf(letter) != -1) {
                counter++;
            }
        }

        return counter;
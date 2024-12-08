import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String test = "leetcode";
        test = reverseVowels(test);
        System.out.println(test);

    }

    public static String reverseVowels(String s) {
        /*  I'll use two pointers, one starting at the beginning and another starting at the end
         *   they will run through the list until each of them find a vowel
         *   that's when they change its contents
         *   and then continue until they are on the same spot
         *   and return the string
         */

        // Build aux vowels Set
        String vowels = "AaEeIiOoUu";

        Set<Character> vowelSet = new HashSet<Character>();
        for (Character a : vowels.toCharArray()) {
            vowelSet.add(a);
        }

        StringBuilder phrase = new StringBuilder(s);

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {

            boolean containInStart = vowelSet.contains(phrase.charAt(start));
            boolean containInEnd = vowelSet.contains(phrase.charAt(end));
            if (!containInStart){
                start++;
            }

            if (!containInEnd){
                end--;
            }

            if (containInStart && containInEnd) {
                char placeH = phrase.charAt(start);
                phrase.setCharAt(start, phrase.charAt(end));
                phrase.setCharAt(end, placeH);
                start++;
                end--;
            }

        }

        return phrase.toString();

    }
}

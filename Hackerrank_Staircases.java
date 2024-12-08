import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Method String.repeat is a new feature in Java 11.
     * For Java 8
     * new int n = 10; // Specify the number of spaces
     * char[] spaces = new char[n];
     * Arrays.fill(spaces, ' '); // Fill the array with spaces
     *
     */

    public static void staircase(int n) {
    // Write your code here
        StringBuilder degrees = new StringBuilder(" ".repeat(n));
    
        for (int i = degrees.length() - 1; i >= 0; i--){
            degrees.setCharAt(i, '#');
            System.out.println(degrees);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}

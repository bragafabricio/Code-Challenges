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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    char[] input = s.toCharArray();
    String output ="";
    String hour = s.substring(0, 2);
    if (input[8] == 'P'){
        if (hour.equals("12")){
            output = s.substring(0, 8);      
        } else {
            Integer time = Integer.parseInt(hour);
            time += 12;
            output = time.toString();
            output += s.substring(2, 8);      
        }
        
    } else {
        if (hour.equals("12")){
            hour = "00";
        }
        output = hour + s.substring(2, 8);
    }
    
    return (output);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        List <Integer> results = Arrays.asList(0,0);
        Integer minRecord = scores.get(0);
        //Listas de objetos não podem ser acessadas diretamente (scores[0] p.e.). É necessário usar o método get/set.
        Integer maxRecord = scores.get(0);
        Integer maxCount = 0;
        Integer minCount = 0;
        
        for (Integer game : scores ){
            if (game < minRecord){
                minRecord = game;
                minCount += 1;
            }
            if (game > maxRecord){
                maxRecord = game;
                maxCount += 1;
            }
        }
        
        results.set(0, maxCount);
        results.set(1, minCount);
        
        return results;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

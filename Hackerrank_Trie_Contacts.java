//Hackerrank - Trie - Contacts
//This solution exceeds time limit for cases 3 and 4 also


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
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */
    
    public static class TrieNode {
        private HashMap<Character, TrieNode> children = new HashMap<>();
        private int times = 0;
    }
    
    public static class Trie {
        TrieNode root = new TrieNode();
        
        public void insert(String word) {
            TrieNode current = root;
            for (char l: word.toCharArray()) {
                current.children.putIfAbsent(l, new TrieNode());
                current = current.children.get(l);
                current.times++;
            }
        }
        
        public int find(String prefix) {
            TrieNode current = root;
            for (char l : prefix.toCharArray()) {
                current = current.children.get(l);
                if (current == null) {
                    return 0;
                }
            }
            return current.times;
        }
    }
    

    public static List<Integer> contacts(List<List<String>> queries) {
    // Write your code here
        Trie contactTrie = new Trie();
        List<Integer> results = new ArrayList<>();
        for (int i=0; i < queries.size(); i++){
            List<String> command = queries.get(i);
            if (command.get(0).equals("add")){
                contactTrie.insert(command.get(1));                
            }
            else{
                results.add(contactTrie.find(command.get(1)));
            }
        }
        return results;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> queries = new ArrayList<>();

        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.contacts(queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//Hackerrank - Trie - Contacts
//This solution exceeds time limit for cases 3 and 4 also


class Result {

    /*
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */
     
    public static class TrieNode {
        private HashMap<Character, TrieNode> children = new HashMap<>();
        private int times;
        
        public TrieNode(){
            times = 1;
        }        
    }
    
    public static class Trie {
        TrieNode root;
        
        public Trie(){
            root = new TrieNode();
        }
        public void insert(String word) {
            TrieNode current = root;
            for (char l: word.toCharArray()) {
                if(!current.children.containsKey(l)){
                    TrieNode newNode = new TrieNode();
                    current.children.put(l, newNode);
                    current = newNode;
                } else {
                    current = current.children.get(l);
                    current.times++;
                }
            }
        }
        
        public int find(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                if (!current.children.containsKey(ch)) {
                    return 0;
                }
                current = current.children.get(ch);
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

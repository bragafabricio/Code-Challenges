class Solution {
    public int romanToInt(String s) {
        
        HashMap map = buildMap();
        
        ArrayList<Character> roman = readInput(s);
        
        Integer previous = 0;
        Integer sum = 0;
        
        for (int counter = roman.size()-1; counter >= 0; counter--){
            
            Integer value = checkValue(roman.get(counter), map);
            
            if (value < previous){
                sum -= value;
            } else {
                sum += value;
            }
            
            previous = value;
        }
        
        return sum;        
    }
    
    
    public static ArrayList<Character> readInput(String s){
        String input = s;
        ArrayList<Character> roman = new ArrayList<>();
        
        for (char c : input.toCharArray()){
            roman.add(c);
        }      
        return roman;
    }
    
    public static HashMap buildMap(){
        HashMap <Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        return map;
    }
    
    public static Integer checkValue(Character symbol, HashMap map){
        return (Integer) map.get(symbol);
    }

}


// build a method to check value
// Get the input in a array of chars
// loop through the chars form right to left and check value
// sum or subtrack? if the next char is less than the previous, i will subtract the next value
// get the total sum


//     ['I'] = 1;
//     ['V'] = 5;
//     ['X'] = 10;
//     ['L'] = 50;
//     ['I'] = 100;
    
//     Steps:
//     1 - Read the input
//     2 - Store it on a Appropriate data structure
//         - This case might be an Array of Chars, so I can read it the way I need it.
//         - Do I need to know the lenght of this array?
    
//     Thoughts:
//         - I know that I have to check for cases that have a Subtraction
//             - I, before V and X
//             - X, before L and C
//             - C, before D and M
        

// Post Commentaries:
// Had a lot of problems due to my will of using a HashMap for the solution (HashMap only accepts Objects and not primitive types), if I had used a simple chain of Ifs, os a Switch case using primitive type char, it would have been much simpler.
// The key for solving this problem was understand that if a Symbol is preceded by a lesser value symbol, you would need to subtract instead of sum.P


// What I have learned:
//     - HashMap just works with Object, not with Primitive types.
//     - size of ArrayList = array.size()
//     - transform a String in array of chars = string.toCharArray()

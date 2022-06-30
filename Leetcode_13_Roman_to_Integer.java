class Solution {
    public int romanToInt(String s) {
        
        int previous = 0;
        int sum = 0;
        char[] roman = s.toCharArray();
      
        for (int i = roman.length -1; i >= 0; i--){
            int value = checkValue(roman[i]);
            if (value < previous){
                sum -= value;
            } else {
                sum += value;
            }
            previous = value;
        }
        
        return sum;        
    }
    
        
    public static int checkValue(Character symbol){
        switch(symbol){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

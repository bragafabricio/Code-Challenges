// Leetcode 1929. Concatenation of Array
// First solution running in 2ms

class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size*2];
        for (int i= 0; i<size*2; i++){
            ans[i] = nums[i%size];
        }
        return ans;
    }
}

// 2nd solution running in 1ms 

class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size*2];
        for (int i= 0; i<size; i++){
            ans[i+size] = ans[i] = nums[i];
        }
        return ans;
    }
}

//That's interesting. An unusual aproach to save a half of cicles.

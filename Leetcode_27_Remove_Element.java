// Solution O(n)
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k; 
    }
}


// Solution O(n-k)
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0;
        int j = nums.length-1;
        int k = 0;
        while (i <= j){
            if (nums[i] != val){
                i++;
                k++;
            } else if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
                k++;
                j--;
            } else {
                j--;
            }
        }
        return k; 
    }
}


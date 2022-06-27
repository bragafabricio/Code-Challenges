// 1920. Build Array from Permutation

//Simple solution (Time complexity O(n), Space Complexity O(n))

class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        for (int i =  0; i < size; i++){
            ans[i] = nums[nums[i]];
        }
    return ans;
    }
}

//Optimized solution (Time complexity O(n), Space Complexity O(1))

class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        for (int i =  0; i < size; i++){
            nums[i] = size * (nums[nums[i]] % size) + nums[i];
        }
        for (int i =  0; i < size; i++){
            nums[i] /= size;
        }
    return nums;
    }
}

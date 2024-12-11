class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = (int) Integer.MAX_VALUE;
        int second = (int) Integer.MAX_VALUE;

        for (int i : nums){
            if (i <= first) {
                first = i;
            } else if (i <= second) {
                second = i;
            } else {
                return true;
            }
        }
        return false;
    }
}

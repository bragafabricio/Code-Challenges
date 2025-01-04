class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        
        while (left <= right) {
            int side = Math.min(height[left], height[right]);
            int tempArea = side * (right - left);
            if (tempArea > area) {
                area = tempArea;
            } else {
                if (height[left] > height[right]) {
                    right -= 1;
                } else {
                    left += 1;
                }
            }
        }
        return area;
    }
}

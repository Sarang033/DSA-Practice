class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int ans = 0;
        int r = height.length - 1;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            int water = ((r - l) * h);
            ans = Math.max(ans, water);
            while (height[l] <= h && l < r) {
                l++;
            }
            while (height[r] <= h && l < r) {
                r--;
            }
        }
        return ans;
    }
}
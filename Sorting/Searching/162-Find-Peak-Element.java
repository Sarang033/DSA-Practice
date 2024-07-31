class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int n = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ((mid == 0 || nums[mid - 1] < nums[mid]) && (mid == n - 1 || nums[mid + 1] < nums[mid]))
                return mid;
            else if (mid > 0 && nums[mid - 1] > nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            // if right side is sorted, move left
            if(mid > 0 && nums[mid] < nums[mid - 1]){  
                return nums[mid];
            }else if(nums[mid] < nums[end]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
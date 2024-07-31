class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=binarySearchFirst(nums,target);
        ans[1]=binarySearchSecond(nums,target);
        return ans;
    }
    public int binarySearchFirst(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int idx = -1;
        while(l <=r){
            int m = l + ( r - l) / 2;
            if(nums[m] == target){
                idx = m;
                r = m - 1;
            }else if(nums[m] < target){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return idx;
    }
    public int binarySearchSecond(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int idx = -1;
        while(l <=r){
            int m = l + ( r - l) / 2;
            if(nums[m] == target){
                idx = m;
                l = m + 1;
            }else if(nums[m] < target){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return idx;
    }
}
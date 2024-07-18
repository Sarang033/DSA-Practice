class Solution {
    public int findDuplicate(int[] nums) {
        int i =0 ; 
        while(i < nums.length){
            int correctIdx = nums[i];
            if(nums[i] != nums[correctIdx]){
                swap(nums,i,correctIdx);
            }else{
                i++;
            }
        }
        for(int idx = 0; idx < nums.length;idx++){
            if(nums[idx] != idx){
                return nums[idx];
            }
        }
        return nums.length;
    }
    public void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
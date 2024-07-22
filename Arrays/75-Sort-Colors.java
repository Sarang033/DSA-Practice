class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,high,mid);
                high--;
            }
        }
    }
    public void swap(int[] array, int l, int r){
        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;
    }
}
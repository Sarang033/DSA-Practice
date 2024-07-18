class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        int [] res = new int[2];
        for(int idx = 0 ; idx < nums.length ; idx++){
            if(nums[idx]!=idx + 1){
                res[0]=nums[idx];
                res[1]=idx+1;
            }
        }  
        return res;
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
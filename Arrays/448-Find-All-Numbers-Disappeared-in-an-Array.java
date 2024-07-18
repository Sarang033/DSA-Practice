class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0 ; 
        while(i < nums.length){
            int correctIdx = nums[i] - 1;
            if(nums[i] != nums[correctIdx]){
                swap(nums,i,correctIdx);
            }else{
                i++;
            }
        }
        List<Integer> res = new LinkedList<>();
        for(int idx = 0; idx < nums.length;idx++){
            if(nums[idx]!= idx+1){
                res.add(idx + 1);
            }
        }
        return res;
    }
    public void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
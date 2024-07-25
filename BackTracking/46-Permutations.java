class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        solve(nums,0,res);
        return res;
    }
    public void solve(int[] nums, int idx,List<List<Integer>> res){
        if(idx == nums.length - 1){
            List<Integer> subList = new ArrayList<>();
            for(int n:nums){
                subList.add(n);
            }
            res.add(new ArrayList<>(subList));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            solve(nums,idx+1,res);
            swap(nums,i,idx);
        }
    }
    public void swap(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

}
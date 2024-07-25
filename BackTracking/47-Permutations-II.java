class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        permute(nums,0);
        return res;
    }
    List<List<Integer>> res = new ArrayList<>();
    public void permute(int[] nums,int idx){
        if(idx == nums.length){
            List<Integer> subList = new ArrayList<>();
            for(int n:nums){
                subList.add(n);
            }
            res.add(subList);
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = idx ; i < nums.length ; i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(nums,i,idx);
            permute(nums,idx+1);
            swap(nums,i,idx);
        }
    }
    public void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if( i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int newTarget = 0 - nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                if(nums[l]+nums[r] < newTarget){
                    l++;
                }else if(nums[l]+nums[r] > newTarget){
                    r--;
                }else{
                    while(l<r && nums[l] == nums[l+1]) l++;
                    while(l<r && nums[r] == nums[r-1]) r--;
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}
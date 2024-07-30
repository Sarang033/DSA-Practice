class Solution {
    public int maxProduct(int[] nums) {
        double pre = 1;
        double suff = 1;
        double ans = nums[0];
        int n = nums.length;
        for(int i = 0 ; i < nums.length; i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff =1;
            pre = pre * nums[i];
            suff = suff * nums[n-i-1];
            ans = Math.max(ans,Math.max(pre,suff));
        }
        return (int)ans;
    }
}
class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i =0 ; i < quantities.length; i++){ //finding max
            if(quantities[i] > end){
                end = quantities[i];
            }
        }
        int ans = -1;
        //apply binary search on the possible values of k->(1,max(quantities))
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(isDistributionPossible(quantities,mid,n)){
                ans = mid;
                end = mid -1 ;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public boolean isDistributionPossible(int[] quantities,int maxProducts,int stores){
        int storeCount = 0;
        for(int i = 0 ; i < quantities.length ; i++){
            storeCount +=quantities[i] / maxProducts;
            if(quantities[i] % maxProducts!=0){
                storeCount+=1;
            }
            if(storeCount > stores) return false;
        } 
        return true;
    }
}
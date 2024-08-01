class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;
        for(int ele:weights){
            // min capacity -> largest element(wieght) -> start idx
            start=Math.max(start,ele);   
            // max capacity -> sum of weights -> end
            end+=ele;               
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(countday(weights,mid)<=days){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int countday(int arr[],int capacity){
        int day=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>capacity){
                day++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return day;
    }
}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = '$';
        int l = 0 ;
        int r = letters.length - 1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(letters[m]<=target){
                l=m+1;
            }else{
                r=m-1;
                ans=letters[m];
            }
        }
        return (ans == '$')?letters[0]:ans;
    }
}
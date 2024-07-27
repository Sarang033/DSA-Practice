class Solution {
    public boolean validPalindrome(String s) {
        int l =0;
        int r = s.length() -1 ;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                if(isPalindrome(s, l+1, r)){
                    return true;
                }
                if(isPalindrome(s, l, r-1)){
                    return true;
                }
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
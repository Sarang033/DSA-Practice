class Solution {
    public int minSwaps(String s) {
        int close = 0;
        int open = 0;

        for (char ch : s.toCharArray()) {
            if(ch=='[') {
                open++;
            } else {
                if(open>0){
                    open--;
                } else {
                    close++;
                }
            }
        }
        

        int total = ((close + open) /2);

        //now since one replace makes two pair balanced
        // for ex: }}{{ there are four unbalancedBrackets
        // Two UnBalancePair of brackets
        // replacing first bracket with four, make whole string balanced
        // replacing one brack making two pairs balanced.
        int swapRequired = (total)/2;
        if(total % 2 !=0){
            swapRequired++;
        }
        return swapRequired;
    }
}
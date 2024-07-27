class Solution {
    public String intToRoman(int num) {
        final int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        final String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < value.length;i++){
            if(num==0) break;
            while(num>=value[i]){
                num=num-value[i];
                res.append(symbols[i]);
            }
        }
        return res.toString();
    }
}
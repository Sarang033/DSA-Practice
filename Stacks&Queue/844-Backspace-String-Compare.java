class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }
    public String compare(String str){
        StringBuilder sb= new StringBuilder();
        char[] cArr = str.toCharArray();
        for(int i =0 ; i<cArr.length;i++){
            if(cArr[i] =='#' && sb.length()!=0){
                sb.deleteCharAt(sb.length() - 1);
                continue;
            }
            if(cArr[i]!='#') sb.append(cArr[i]);
        }
        return sb.toString();
    }
}
class Solution {
    public String reverseWords(String s) {
    int n = s.length();
    StringBuilder res = new StringBuilder();
    int i = n - 1;
    while (i >= 0) {
        
        while (i >= 0 && s.charAt(i) == ' ') i--;
        if (i < 0) break;

        int j = i;
    
        while (i >= 0 && s.charAt(i) != ' ') i--;
        
        if (res.length() == 0) {
            res.append(s.substring(i + 1, j + 1));
        } else {
            res.append(" ").append(s.substring(i + 1, j + 1));
        }
    }

    return res.toString();
    }
}
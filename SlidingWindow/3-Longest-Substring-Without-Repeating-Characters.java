class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int winStart =0;
        int winEnd = 0;
        int maxLen = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        while(winEnd < s.length()){
            char ch = s.charAt(winEnd);
            if(set.contains(ch)){
                while(winStart < winEnd && set.contains(ch)){
                    set.remove(s.charAt(winStart));
                    winStart++;
                }
            }
            set.add(ch);
            maxLen = Math.max(maxLen, winEnd - winStart + 1);
            winEnd++;
        }
        return maxLen;
    }
}
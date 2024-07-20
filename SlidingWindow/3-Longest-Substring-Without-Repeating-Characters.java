class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int winStart =0;
        int winEnd = 0;
        int maxLen = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        while(winEnd < s.length()){
            char ch = s.charAt(winEnd);
            // if(map.contains(ch)){
                if(map.containsKey(ch) && map.get(ch) >= winStart){
                // while(winStart < winEnd && map.contains(ch)){
                //     map.remove(s.charAt(winStart));
                //     winStart++;
                // }
                winStart = map.get(ch) + 1;
            }
            map.put(ch,winEnd);
            maxLen = Math.max(maxLen, winEnd - winStart + 1);
            winEnd++;
        }
        return maxLen;
    }
}
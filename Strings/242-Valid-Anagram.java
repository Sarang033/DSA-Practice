class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letters = new int[26];
        for(char ch:s.toCharArray()){
            letters[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            letters[ch-'a']--;
        }
        for(int i : letters){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pat = new int[26];
        int[] str = new int[26];
        for(char ch: p.toCharArray()){
            pat[ch -'a']++;
        }
        int i=0,j=0;
        List<Integer> res = new ArrayList<>();
        while(j < s.length()){
            int c = s.charAt(j) - 'a';
            str[c]++;
            if(j - i + 1 < p.length()){
                j++;
            }else{
                if(Arrays.equals(pat,str)){
                    res.add(i);
                }
                int x = s.charAt(i) - 'a';
                str[x]--;
                i++;
                j++;
            }
        }
        return res;
    }
}
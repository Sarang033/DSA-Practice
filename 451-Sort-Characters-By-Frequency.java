class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n =s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder st = new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        q.addAll(map.entrySet());
        while(!q.isEmpty()){
            Map.Entry<Character , Integer> entry = q.poll();
            char c = entry.getKey();
            int freq = entry.getValue();
            for(int i=0;i<freq;i++){
                st.append(c);
            } 
        }
        return st.toString();
    }
}
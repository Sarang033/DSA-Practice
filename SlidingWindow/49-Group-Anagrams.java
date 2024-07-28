class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String st = String.valueOf(charArr);
            if (!m.containsKey(st)) {
                m.put(st, new ArrayList<>());
            }
            m.get(st).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
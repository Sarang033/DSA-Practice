class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!s.isEmpty() && temperatures[s.peek()] < temperatures[i]){
                int idx = s.pop();
                res[idx]=i-idx;
            }
            s.push(i);
        }
        return res;
    }
}
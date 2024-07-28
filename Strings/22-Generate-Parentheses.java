class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generate(result,n,0,0,"");
        return result;
    }
    public void generate(List<String>res,int max, int open, int close, String up){
        if(up.length() == (2*max)){
            res.add(up);
            return;
        }
        if(open < max){
            generate(res,max,open+1,close,up+"(");
        }
        if(close < open){
            generate(res,max,open,close+1,up+")");
        }
    }
}
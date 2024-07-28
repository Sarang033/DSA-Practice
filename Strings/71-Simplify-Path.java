class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] dir = path.split("/");
        for(String str:dir){
            if(str.equals(".") || str.isEmpty()){
                continue;
            }else if(str.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(str);
            }
        }
        StringBuilder res = new StringBuilder();
        for(String str:s){
            res.append("/").append(str);
        }
        return res.length() > 0 ? res.toString() : "/";
    }
}
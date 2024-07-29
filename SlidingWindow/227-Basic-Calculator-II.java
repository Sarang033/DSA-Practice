class Solution {
    public int calculate(String str) {
        Stack<Integer> s = new Stack<>();
        char prevSign = '+';                      // Maintain previous sign
        int n = 0;                                // Current digit 
        for(int i = 0 ; i < str.length();i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                n = n * 10 + (c - '0');             // Converting char into int to push onto the stack
            }
            if(isOperator(c) || i == str.length() -1){
                if(prevSign == '+'){
                    s.push(n);                     // push + sign number onto stack         
                }else if(prevSign == '-'){
                    s.push(-n);                    // push - sign number onto stack             
                }else if(prevSign == '*'){
                    int top = s.pop();             //multiply top of stack and n & store
                    s.push(top * n);
                }else if(prevSign == '/'){
                    int top = s.pop();
                    s.push(top / n);                //divide top of stack by n & store
                }
                n = 0;              // make n to zero after every iteration
                prevSign = c;        //previous sign to c which was recent operator
            }
        }
        int res = 0;
        while(!s.isEmpty()){
            res+=s.pop();
        }
        return res;
    }
    private static boolean isOperator(char ch){
        return ch=='-'||ch=='+'||ch=='*'||ch=='/';
    }
}
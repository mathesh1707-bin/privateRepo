//20. Valid Paranthesis
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>(); 
        int n=s.length();
        if(n<2){
            return false;
        }  
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==']' || c=='}' || c==')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(c==']' && stack.peek()=='[' ||
                c== '}' && stack.peek()=='{' ||
                c== ')' && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

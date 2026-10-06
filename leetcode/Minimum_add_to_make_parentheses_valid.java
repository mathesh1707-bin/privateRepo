//921.Minimum_add_to_make_parentheses_valid

//Attemp 1: Own code 
class Solution1 {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int count=0;
        Stack<Character> stack =new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.isEmpty()){
                    count++;
                }
                else if(stack.peek()=='('){
                    stack.pop();
                }
                else {
                    continue;
                }
            }
            else {
                continue;
            }
        }
        return count+stack.size();
    }
}

//Attemp 2 : Optimized 
class Solution2 {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int ans=0;
        int open=0;
        Stack<Character> stack =new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                open++;
            }
            else{
                 if(open>0){
                    open--;
                }
                else {
                    ans++;
                }
            }
        }
        return ans+open;
    }
}

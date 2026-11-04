// 32.Longest Valid Parentheses

// Approach: Finding the difference between the last known invalid parentheses and the latest closing paretheses 
// Here this difference is the length of the valid parentheses 

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        int n=s.length();
        int base=-1;
        int maxC=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else if(s.charAt(i)==')' && !stack.isEmpty()){
                stack.pop();
                int diff=0;
                if(!stack.isEmpty()){
                    diff=i-stack.peek();
                }
                else{
                    diff=i-base;
                }
                maxC=Math.max(diff,maxC);
            }
            else{
                base=i;
            }
        }
        return maxC;
    }
}

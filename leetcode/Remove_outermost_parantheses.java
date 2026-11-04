//1021. Remove_outermost_parantheses
// Approach: simply add only the parantheses if there aldready exist 1 opening

class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder result=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(count>0){
                    result.append(c);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}

//1614. Maximum Nesting Depth Of The Paranthesis
class Solution {
    public int maxDepth(String s) {
        int  count=0;
        int maxCount=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                count++;
                if(count>maxCount){
                    maxCount=count;
                }
            }
            else if(i==')'){
                count--;
            }
        }
        return maxCount;
    }
}

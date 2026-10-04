//678. Valid_Parantheses_String

//#Attemp1 : TLE 
class Solution {
    public boolean checkValidString(String s) {
        return solve(s,0,0);
    }

    boolean solve(String s,int index,int balance){
        if(index==s.length()){
            return balance==0;
        }
        if(s.charAt(index)=='('){
            return solve(s,index+1,balance+1);
        }
        if(s.charAt(index)==')'){
            if(balance==0){
                return false;
            }
            return solve(s,index+1,balance-1);
        }
        if (s.charAt(index) == '*') {
             return solve(s, index + 1, balance + 1)
            || (balance > 0 && solve(s, index + 1, balance - 1))
            || solve(s, index + 1, balance);
        }
        else{
            return false;
        }
    }
}

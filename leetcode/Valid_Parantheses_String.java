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

//#Attemp 2: DP memoizatiion

class Solution {
    Boolean[][] reference;
    public boolean checkValidString(String s) {
        reference=new Boolean[s.length()][s.length()+1];
        return solve(s,0,0);
    }
    boolean solve(String s,int index,int balance){
        if(index==s.length()){
            return balance==0;
        }
        if(reference[index][balance]!=null){
            return reference[index][balance];
        }
        boolean result;
        if(s.charAt(index)=='('){
            result=solve(s,index+1,balance+1);
        }
        else if(s.charAt(index)==')'){
            if(balance==0){
                result= false;
            }
            else{
            result=solve(s,index+1,balance-1);
            }
        }   
        else if(s.charAt(index)=='*'){
            boolean asOpen=solve(s,index+1,balance+1);
            boolean asEmpty= solve(s,index+1,balance);
            boolean asClose= false;
            if (balance>0) {
                asClose= solve(s,index+1,balance-1);
            }
            result=asOpen || asClose || asEmpty;
        }       
        else{
            result=false;
        }                         
        reference[index][balance]=result;
        return result;   
    }
}



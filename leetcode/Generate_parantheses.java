// 22.Generate Parantheses

//Approach :
// Set up Rules in order to solve any Backtracking problem 
// Here there a two rules and 1 winning condition 
// open < n ||||| close < open ||||| if(open==n && close ==n) its a valid parantheses combo

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        int open=0;
        int close=0;
        String s="";
        generate(s,open,close,n,result);
        return result;
    }
    void generate(String s,int open,int close,int n,List<String> result){
        if(open==n && close==n){
            result.add(s);
            return;
        }
        if(open<n){
            String str=s+"(";
            generate(str,open+1,close,n,result);
        }
        
        if(close<open){
            String str=s+")";
            generate(str,open,close+1,n,result);
        }
    }
}

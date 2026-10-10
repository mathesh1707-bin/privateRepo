//1541. Minimum Insertions to Balance a Parentheses String

class Solution {
    public int minInsertions(String s) {
       int open=0;
       int n=s.length();
       int insertion =0;
         for(int i=0;i<n;i++){
        char c=s.charAt(i);
        if(c=='('){
            open++;
        } 
        else{
            if(i+1<n && s.charAt(i+1)==')'){
                i++;
            }
            else{
                insertion++;
            }

            if(open>0){
                open--;
            }
            else{
                insertion++;
            }
        }
        }
        insertion+=open*2;
        return insertion;
    }
}

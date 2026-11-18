//2914
//Attempt 1 : Own code no AI 21ms
class Solution {
    public int minChanges(String s) {
        if(s.length()==1){
            return 0;
        }
        int moves=0;
        int count=1;
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            str.append(c);
        }
        System.out.println(str);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                if(count%2==0){
                    count=1;
                }
                else{
                    str.setCharAt(i,str.charAt(i-1));
                    moves++;
                    count++;
                }
            }
        }
        return moves;
    }

  // Attempt 2 : 6ms no AI removes stringbuilder 
  class Solution {
    public int minChanges(String s) {
        if(s.length()==1){
            return 0;
        }
        int moves=0;
        int count=1;
        char p=s.charAt(0);       
        for(int i=1;i<s.length();i++){
            if(p==s.charAt(i)){
                count++;
                p=s.charAt(i);
            }
            else{
                if(count%2==0){
                    count=1;
                    p=s.charAt(i);
                }
                else{
                    p=s.charAt(i-1);
                    moves++;
                    count++;
                }
            }
        }
        return moves;
    }
}
  // Optimal soln : that increments by 2 smart idea 
  class Solution {
    public int minChanges(String s) {
        if(s.length()==1){
            return 0;
        }
        int moves=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                moves++;
            }
        }
        return moves;
    }
}

  
}

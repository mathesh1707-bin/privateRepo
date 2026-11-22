//2124

//Easy Question 
class Solution {
    public boolean checkString(String s) {
        boolean bPresence=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                bPresence=true;
            }
            if(bPresence && s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}



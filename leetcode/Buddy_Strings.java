import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        if(n!=m){
            return false;
        }
        int first=-1;
        int last=-1;
        char [] giv=s.toCharArray();
        char [] res=goal.toCharArray();
        int mismatch=0;
        for(int i=0;i<giv.length;i++){
            if(giv[i]!=res[i] ){
                mismatch++;
                if(mismatch==1){
                    first=i;
                }
                else if(mismatch==2){
                    last=i;
                }
            }
        }
        if(mismatch==0){
            Set<Character> set = new HashSet<>();
            for(char c : giv){
                if(!set.add(c)){
                return true;
                }
            }
        }
        else if (mismatch==1){
            return false;
        }
        else if(mismatch==2){
            char temp=giv[first];
            giv[first]=giv[last];
            giv[last]=temp;
            if(Arrays.equals(giv,res)){
                return true;
            }
        }
        return false;
    }
}
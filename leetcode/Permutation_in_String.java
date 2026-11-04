//567. Permuataion in String

class Solution {
    public boolean checkInclusion(String p, String s) {
        int [] freqP =new int [26];
        int [] freqWindow=new int[26];
        if(p.length()>s.length()){
            return false;
        }
        for (int i = 0; i < p.length(); i++) {
            freqP[p.charAt(i)-'a']++;
        }   
        for (int i = 0; i < p.length(); i++) {
            freqWindow[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freqP,freqWindow)){
            return true;
            
        }
        for(int i=1;i<=s.length()-p.length();i++){
            freqWindow[s.charAt(i-1)-'a']--;
            freqWindow[s.charAt(i+p.length()-1)-'a']++;
            if(Arrays.equals(freqP,freqWindow)){
            return true;
            
            }   
        }
    return false;
    }
}

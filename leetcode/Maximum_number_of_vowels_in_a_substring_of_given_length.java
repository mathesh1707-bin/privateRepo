//1456
class Solution {
    boolean isVowel(char c){
        boolean vowel=false;
        if(c=='a'||c=='e'||c=='i'||c=='i'||c=='u'){
            vowel=true;
        }
        return vowel;
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int n=s.length();
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                count++;
            }
        }
        int max=count;
        for(int i=k;i<n;i++){
            char c=s.charAt(i);
            char d=s.charAt(i-k);
            if(isVowel(c) ){
                count++;
            }
            if(isVowel(d)){
                count--;
            }
            max=Math.max(count,max);
        }
           
        return max;
    }
}

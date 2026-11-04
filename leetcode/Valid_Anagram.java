class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> freq1=new HashMap<>();
        // HashMap<Character,Integer> freq2=new HashMap<>();
        // int n=s.length();
        // int m=t.length();
        // if(n!=m){
        //     return false;
        // }
        // for(int i=0;i<n;i++){
        //     freq1.put(s.charAt(i),freq1.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0;i<m;i++){
        //     freq2.put(t.charAt(i),freq2.getOrDefault(t.charAt(i),0)+1);
        // }
        // return freq1.equals(freq2);
        int [] arr=new int [26];
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        
        for(char c:t.toCharArray()){
            arr[c-'a']--;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}

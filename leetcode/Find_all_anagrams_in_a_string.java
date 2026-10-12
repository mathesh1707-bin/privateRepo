//438. Find_all_anagrams_in_a_string

//Attemp1 : brute-force

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            String win=s.substring(i,i+p.length());
            if(isAnagram(win,p)){
                result.add(i);
            }
        }
        return result;
        
    }

    public static boolean isAnagram(String s,String p){
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:p.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        return map1.equals(map2);
    }
}

//Attempt 2 : Optimized

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] freqP =new int [26];
        ArrayList<Integer> result=new ArrayList<>();
        int [] freqWindow=new int[26];
        if(p.length()>s.length()){
            return result;
        }
        for (int i = 0; i < p.length(); i++) {
            freqP[p.charAt(i)-'a']++;
        }   
        for (int i = 0; i < p.length(); i++) {
            freqWindow[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freqP,freqWindow)){
            result.add(0);
        }
        for(int i=1;i<=s.length()-p.length();i++){
            freqWindow[s.charAt(i-1)-'a']--;
            freqWindow[s.charAt(i+p.length()-1)-'a']++;
            if(Arrays.equals(freqP,freqWindow)){
            result.add(i);
            }   
        }
        return result;
    }
}

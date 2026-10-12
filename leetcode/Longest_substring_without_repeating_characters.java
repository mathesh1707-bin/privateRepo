// 3.Longest substring without repeating characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i)); 
            count=Math.max(count,i-left+1);
        }
        return count;
    }
}


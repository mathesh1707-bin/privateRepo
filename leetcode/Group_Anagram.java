//49.Group Anagram

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String> > result=new HashMap<>();
        for(String str:strs){
            char [] c=str.toCharArray();
            Arrays.sort(c);
            String sorted=new String(c);
            result.putIfAbsent(sorted,new ArrayList<>());
            result.get(sorted).add(str);
        }
        return new ArrayList<>(result.values());
    }
}

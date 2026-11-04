//49.Group Anagram
//#Attemp1 Brute Force:
class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        
        Set<Integer> visited=new HashSet<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
             if (visited.contains(i)) {
                continue;
            }
            HashMap<Character,Integer> freq=new HashMap<>();
            List<String> inter=new ArrayList<>();
            inter.add(strs[i]);
            visited.add(i);
            for(char c:strs[i].toCharArray()){
                freq.put(c,freq.getOrDefault(c,0)+1);
            }

            for(int j=i+1;j<n;j++){
                if(visited.contains(j)){
                    continue;
                }
                HashMap<Character, Integer> temp = new HashMap<>(freq);
                boolean isAnagram=true;
                for(char c:strs[j].toCharArray()){
                    temp.put(c,temp.getOrDefault(c,0)-1);
                } 
                for(int x:temp.values()){
                    if(x!=0){
                        isAnagram=false;
                        break;
                    }
                }
                if(isAnagram){
                    visited.add(j);
                    inter.add(strs[j]);
                }
            }
            result.add(inter);
        }
        return result;
    }
}

//Attemp2 : GPT suggestion
class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String> > result=new HashMap<>();
        for(String str:strs){
            int [] arr=new int[26];
            for(char c:str.toCharArray()){
                arr[c-'a']++;
            }
            String key=arr.toString();
            result.putIfAbsent(key,new ArrayList<>());
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}

//Attemp3: Optimal
class Solution3 {
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

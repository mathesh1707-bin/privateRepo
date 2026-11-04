//128. Longest Consecutive Sequence

//#Attempt 1 - Sorting method O(n log n)
class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if(n<1){
            return 0;
        }
        Arrays.sort(arr);
        int maxc=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
                continue;
            }
            if(arr[i]==arr[i-1]+1){
                count++;
            }
            else{
                count=1;
            }
            maxc=Math.max(count,maxc);
        }
        return maxc;
    }
}

//#Attemp 2 - Optimal HashSet method O(n)

class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if(n<1){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int i :arr){
            set.add(i);
        }
        int maxc=1;
        
        for(int i:set){
           
            if(!set.contains(i-1)){
                int count=1;
                while(set.contains(i+count)){
                    count++;
                }
                 maxc=Math.max(maxc,count);
            }
           
        }
        return maxc;
    }
}

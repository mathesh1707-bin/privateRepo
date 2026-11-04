//560. Subarray sum equals k

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int n=nums.length;
        int prefixSum=0;

        for(int i:nums){
            prefixSum+=i;
            int needed=prefixSum-k;
            if(map.containsKey(needed)){
                count+=map.get(needed);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}

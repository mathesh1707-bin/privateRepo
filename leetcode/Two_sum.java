//1. Two Sum

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int needed=target-arr[i];
            if(map.containsKey(needed)){
                return new int[] {i,map.get(needed)};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}

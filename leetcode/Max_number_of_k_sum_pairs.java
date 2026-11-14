//1679. Max number of K sum Pairs

//Approach 1 : HashMap (2sum) method 
class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int n=nums.length;
        for(int i:nums){
            int needed=k-i;
            if(map.getOrDefault(needed,0)>0){
                count++;
                map.put(needed,map.get(needed)-1);
            }
            else{
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        return count;
    }
}

//Approach 2 : II-pointer

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==k){
                i++;
                j--;
                count++;
            }
            else if(sum<k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}

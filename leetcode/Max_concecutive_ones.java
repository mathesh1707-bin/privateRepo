class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(j<n){
            
            if(nums[j]==0){
                i=j;
                j++;
                count=0;
            }
            while(j<n && nums[j]==1){
                j++;
                count++;
            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
}
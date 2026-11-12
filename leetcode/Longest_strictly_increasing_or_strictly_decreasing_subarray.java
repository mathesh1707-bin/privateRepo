//3105. Longest Strictly Increasing or Strictly Decreasing Subarray

//Attempt 1: Own code 0% help pakka brute force - 2ms
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int n=nums.length;
        if(n<2){
            return 1;
        }
        int i=0,j=1;
        int icount=1;
        int dcount=1;
        while(j<nums.length){
            if(nums[i]<nums[j]){
                icount++;
                i++;
                j++;
            }
            else{
                i=j;j++;
                icount=1;
            }
            max=Math.max(icount,max);
        }
        i=0;
        j=1;
        while(j<nums.length){
            if(nums[i]>nums[j]){
                dcount++;
                i++;
                j++;
            }
            else{
                i=j;j++;
                dcount=1;
            }
            max=Math.max(dcount,max);
        }
        return max;
    }
}

//Attempt 2: Optimized
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int n=nums.length;
        int icount=1;
        int dcount=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                icount++;
                dcount=1;
            }
            else if(nums[i-1]>nums[i]){
                dcount++;
                icount=1;
            }
            else{
                icount=1;
                dcount=1;
            }
            max=Math.max(max,Math.max(icount,dcount));
        }
        return max;
    }
}

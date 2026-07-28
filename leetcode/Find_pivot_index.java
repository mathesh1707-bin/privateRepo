class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int [] leftSum=new int[n];
        int [] rightSum=new int[n];
        int i=0;
        int j=n-1;
        int lsum=0;
        int rsum=0;
        while(i<n && j>=0){
            lsum+=nums[i];
            rsum+=nums[j];
            leftSum[i]=lsum;
            rightSum[j]=rsum;
            i++;j--;
        }
        for(int p=0;p<n;p++){
            if(leftSum[p]==rightSum[p]){
                return p;
            }
        }
        return -1;
    }
}
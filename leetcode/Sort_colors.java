class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i]>nums[j]){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}
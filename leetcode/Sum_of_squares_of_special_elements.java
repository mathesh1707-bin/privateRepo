//2778. Sum_of_squares_of_special_elements

class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int spcl=nums[0]*nums[n-1];
        int result=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                result+=nums[i-1]*nums[i-1];
            }
        }
        return result;
    }
}

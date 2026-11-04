import java.util.Arrays;

class Solution {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            arr[i]=findGCD(nums[i],max);
        }
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        long sum=0;
        while(i<j){
            sum+=findGCD(arr[i],arr[j]);
            i++;
            j--;
        }
    return sum;
    }
}
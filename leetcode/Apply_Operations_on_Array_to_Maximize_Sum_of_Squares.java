// 2897. Apply Operations on Array to Maximize Sum of Squares
class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int [] bits=new int [32];
        long MOD = 1_000_000_007L;
        for(int num:nums){
            for(int b=0;b<32;b++){
                if((num & (1<<b))!=0){
                 bits[b]++;   
                }
            }
        }
        long sum=0;
        for(int i=0;i<k;i++){
                int num = 0;
            for (int b = 0; b < 32; b++) {
                if (bits[b] > 0) {
                    num |=(1<<b);
                    bits[b]--; 
                }
            }
            sum=(sum+((long)num*(long)num))%1000000007;
        }
        return (int) sum;
    }
}

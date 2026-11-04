//3736.Minimum moves to equal array III 
// Approach 1: treating each elements seperately to find the solution
class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int i:nums){
            if(i>max){
                max=i;
            }
            
        }
        int moves=0;
        for(int i:nums){
            moves+=max-i;
        }
        return moves;
    }
}


// Approach 2: treating entire array as one to find the solution
class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int sum=0;
        for(int i:nums){
            max=Math.max(i,max);
            sum+=i;
        }
        return nums.length*max - sum;
    }
}

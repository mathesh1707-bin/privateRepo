import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=0;
        int i=0;
        while(i<n){
            sum+=nums[i];
            if(i<n-1 && nums[i+1]==nums[i]+1){
                i++;
            }
            else{
                break;
            }
        }
        Setv<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int result=sum;
        while(set.contains(result)){
            result++;
        }
        return result;
    }
}
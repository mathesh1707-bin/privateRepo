package TwoPointer;
import java.util.ArrayList;

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:nums){
            if(i!=0){
                res.add(i);
            }
        }
        int d=n-res.size();
        while(d>0){
            res.add(0);
            d--;
        }
        for(int i=0;i<res.size();i++){
            nums[i]=res.get(i);
        }
        // int i=0;
        // for(int j=0;j<n;j++){
        //     if(nums[j]!=0){
        //         int temp=nums[j];
        //         nums[j]=nums[i];
        //         nums[i]=temp;
        //         i++;
        //     }
        // }

    }
}
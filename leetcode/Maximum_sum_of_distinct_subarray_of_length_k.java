// import java.util.HashMap;
// import java.util.Map;

// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         int n = nums.length;
//         if (k > n) {
//             return 0;
//         }
//         Map<Integer, Integer> freq = new HashMap<>();
        
//         int i=0;
//         int j = 0;
//         long sum=0;
//         long max = 0;
        
//         while (j < n) {
//             sum += nums[j];
//             freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
//             while (freq.get(nums[j]) > 1) {
//                 freq.put(nums[i], freq.get(nums[i]) - 1);
//                 sum -= nums[i];
//                 if (freq.get(nums[i]) == 0) {
//                     freq.remove(nums[i]);
//                 }
//                 i++;
//             }
//             if (j - i + 1 == k) {
//                 max = Math.max(max, sum);
//                 sum -= nums[i];
//                 freq.put(nums[i], freq.get(nums[i]) - 1);
//                 if (freq.get(nums[i]) == 0) {
//                     freq.remove(nums[i]);
//                 }
//                 i++;
//             }
//             j++;
//         }
//         return max;
//     }
// }

import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n<k){
            return 0;
        }
        long max=0;
        long sum=0;
        int left=0;
        HashSet<Integer> set=new HashSet<>();
        for(int right=0;right<n;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            
            set.add(nums[right]);
            sum+=nums[right];

            if(right-left+1==k){
                max=Math.max(max,sum);
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }

        }
        
        return max;
    }
}
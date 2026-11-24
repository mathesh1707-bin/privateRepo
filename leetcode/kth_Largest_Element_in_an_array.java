//215

//Sorting Approach
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

//Priority Queue approach
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i:nums){
            q.offer(i);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}

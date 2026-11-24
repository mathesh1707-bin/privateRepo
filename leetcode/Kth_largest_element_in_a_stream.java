//703.
//Own code 
class KthLargest {
    Queue<Integer> q= new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i=0;i<k;i++){
            if(i>=nums.length){
                break;
            }
            q.offer(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>q.peek()){
                q.offer(nums[i]);
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        if(q.size()<k){
            q.offer(val);
            return q.peek();    
        }
        
        if(q.peek()<val){
            q.offer(val);
            q.poll();
        }
        return q.peek();
    }
}

//Optimized 
class KthLargest {
    Queue<Integer> q= new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){
            add(i);
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size()>k){
            q.poll();
        }
        return q.peek();
    }
}

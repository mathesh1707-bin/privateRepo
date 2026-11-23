//1046

//Priority queue approach
class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            q.offer(i);
        }

        while(q.size()>=2){
            int x=q.poll();
            int y=q.poll();
            if(x==y){
                continue;
            }
            q.offer(x-y);
        }
        if(q.size()==0){
            return 0;
        }
        return q.peek();
    }
}

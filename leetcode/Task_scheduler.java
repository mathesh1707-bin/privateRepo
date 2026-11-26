//621.
class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int count=0;

        for(char c:tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i:map.values()){
            q.offer(i);
        }
        while(true){
            int executed=0;
            for(int i=0;i<=n;i++){
                if(q.isEmpty()){
                    break;
                }
                executed++;
                int remaining=q.poll()-1;
                if(remaining>0){
                    list.add(remaining);
                }
            }
            if(list.isEmpty()){
                break;
            }
            for(int i:list){
                q.offer(i);
            }
            list.clear();
            count+=n+1-executed;
        }
        return count+tasks.length;
    }
}

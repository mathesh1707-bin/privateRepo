//3364.Minimum Positive Sum Subarray

//Own Code --> 212 ms though :(
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minL=Integer.MAX_VALUE;
        int n=nums.size();
        for(int size=l;size<=r;size++){

            for(int i=0;i<=n-size;i++){
                int sum=0;

                for(int j=0;j<size;j++){
                    sum+=nums.get(i+j);
                }
                if(sum>0){
                    minL=Math.min(minL,sum);
                    System.out.println(minL);
                }   
            }
        } 
        
        return minL!=Integer.MAX_VALUE ? minL:-1;
    }
}

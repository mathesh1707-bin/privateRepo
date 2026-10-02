//15. 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i-1]==arr[i]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    result.add(List.of(arr[i],arr[j],arr[k]));
                    j++;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                }
            }
        }
        return result;
    }
}

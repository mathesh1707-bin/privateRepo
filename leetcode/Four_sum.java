//18. 4Sum

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int l=0;l<n;l++){
            if(l>0 && arr[l-1]==arr[l]){
                    continue;
                }
            for(int i=l+1;i<n;i++){
                if(i>l+1 && arr[i-1]==arr[i]){
                    continue;
                }
                int j=i+1;
                int k=n-1;
                while(j<k){
                    long sum=(long) arr[l]+arr[i]+arr[j]+arr[k];
                    if(sum<target){
                        j++;
                    }
                    else if(sum>target){
                        k--;
                    }
                    else{
                        result.add(List.of(arr[l],arr[i],arr[j],arr[k]));
                        j++;
                        k--;
                        while(j<k && arr[j]==arr[j-1]){
                            j++;
                        }
                        while(j<k && arr[k]==arr[k+1]){
                            k--;
                        }
                    }
                }
            }
        }
        return result;
    }
}

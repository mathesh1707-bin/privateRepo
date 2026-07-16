import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){
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
                    res.add(List.of(arr[i],arr[j],arr[k]));
                    j++;
                    while(arr[j]==arr[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
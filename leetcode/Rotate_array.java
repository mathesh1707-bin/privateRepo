class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int st=0;
        int lt=n-1;
        k%=n;
        if(k==0){
            return;
        }
        if(n<=1){
            return;
        }
        while(st<lt){
            int temp=nums[st];
            nums[st]=nums[lt];
            nums[lt]=temp;
            st++;
            lt--;
        }
        int a=0;
        int b=k-1;
        while(a<b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
        int i=k;
        int j=n-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
    }
}
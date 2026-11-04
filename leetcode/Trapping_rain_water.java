//42. Trapping Rain Water
//Approach 1 : 1ms
class Solution1 {
    public int trap(int[] arr) {
        int n=arr.length;
        int [] left=new int [n];
        int [] right=new int [n];
        int l=Integer.MIN_VALUE;
        int r=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>l){
                l=arr[i];
            }
            left[i]=l;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>r){
                r=arr[i];
            }
            right[i]=r;
        }
        int [] min=new int [n];
        int sum=0;
        for(int i=0;i<n;i++){
            min[i]=Math.min(left[i],right[i]);
            sum+=min[i]-arr[i];
        }
        return sum;
        }
}

//#Attempt 2: 0ms Payaluga 
class Solution2 {
    public int trap(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        int leftMax=arr[left];
        int rightMax=arr[right];
        int ans=0;
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=Math.max(leftMax,arr[left]);
                ans+=leftMax-arr[left];
            }
            else{
                right--;
                rightMax=Math.max(rightMax,arr[right]);
                ans+=rightMax-arr[right];
            }
        }
        return ans;
        }
}

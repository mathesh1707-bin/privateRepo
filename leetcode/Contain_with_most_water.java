class Solution {
    public int maxArea(int[] height) {
       int maxArea=Integer.MIN_VALUE;
       int left=0;
       int n=height.length;
       int right=n-1;
       while(left<right){
        int curHeight=Math.min(height[left],height[right]);
        int curWater=(right-left)*curHeight;
        
        maxArea=Math.max(maxArea,curWater);
        
        while(left<right && height[left]<=curHeight){
            left++;
        }
        while(left<right && height[right]<=curHeight){
            right--;
        }
       }
       return maxArea;     
    }
}
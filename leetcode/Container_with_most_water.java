//11. Container with most water
// #Attemp1 : Using basic knowledge (4ms)
class Solution1 {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int maxArea=Integer.MIN_VALUE;
        int area=0;
        while(i<j){
            int h=Math.min(arr[i],arr[j]);
            int w=j-i;
            area=h*w;
            maxArea=Math.max(area,maxArea);
            if(i==h){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}

// #Attemp2 : Optimized (2ms)

class Solution2 {
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

//268. Missing Number 
//Attemp 1 : Use a collection's method .contains to check whether a number exist from max to min order
class Solution1 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int max=n;
        for(int i:nums){
            arr.add(i);
        }
        int res=0;
        while(max>=0){
            if(!arr.contains(max)){
                res=max;
                break;
            }
            max--;
        }
        return res;
        
    }
}

//Attempt 2 : Sum of given array and its difference from the expected array is the value of the missing number 
class Solution2 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int ogSum=0;
        for(int i:nums){
            sum+=i;
        }
        for(int i=0;i<=n;i++){
            ogSum+=i;
        }
        return ogSum-sum;
        
    }
}

//3727 . Maximum altering sum of squares

//Attemp1: O(nlogn)

//The key intuition is, the alternating pattern which can be solved by Sorting the array subtracting the first half and adding the second half to the result
class Solution {
    public long maxAlternatingSum(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]*=arr[i];
        }
        long sum=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            sum-=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

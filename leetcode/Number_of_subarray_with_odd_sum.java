//1524
class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd=0,even=1,prefixSum=0,result=0;
        int MOD=1000000007;
        for(int i:arr){
            prefixSum+=i;
            if(prefixSum % 2 ==0){
                result=(result+odd)%MOD;
                even++;
            }
            else{
                result=(result+even)%MOD;
                odd++;
            }
        }
        return result;
    }
}
//I died mentally solving this

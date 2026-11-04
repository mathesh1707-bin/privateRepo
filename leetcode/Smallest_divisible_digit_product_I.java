class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int og=n;
        int product=1;
        while(og>0){
            product*=(og % 10);
            og/=10;
        }
        if(product%t==0){
            return n;
        }
        n++;
        }
    }
}
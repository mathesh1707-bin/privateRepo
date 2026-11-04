//3723. Maximize Sum of Squares of Digits
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9 * num) {
            return "";          // maximum possible digit 9 ; so return "" if a sum so greater appears that even when muliplying 9 num times will be lesser
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < num;i++) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }
        return ans.toString();
     }  
}     

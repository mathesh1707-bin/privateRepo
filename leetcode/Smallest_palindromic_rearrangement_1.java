import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n<=1){
            return s;
        }
        char[] arr=s.substring(0,n/2).toCharArray();
        Arrays.sort(arr);
        String res=new String(arr);
        String ser=new StringBuilder(res).reverse().toString();
        if(n%2==1){
            return res+s.charAt((n/2))+ser;
        }
        return res+ser;
    }
}
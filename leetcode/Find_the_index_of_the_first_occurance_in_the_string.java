class Solution {
    public int strStr(String str, String pat) {
        int m=str.length();
        int n=pat.length();
        
        for(int i=0;i<=m-n;i++){
            int j;
            for(j=0;j<n;j++){
                if(str.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==n){
                return i;
            }
        }
    return -1;
    }
}
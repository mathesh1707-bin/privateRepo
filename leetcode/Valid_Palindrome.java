//125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        //remove all non alphanumeric characters and manage case sensitivity
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      
        boolean isPalindrome=true;
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }
}

//345. Reverse Vowels of a String
class Solution {

    public boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder str=new StringBuilder();
        char[] arr=s.toCharArray();
        
        while(i<j){
            if(isVowel(arr[i]) && isVowel(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!isVowel(arr[i])){
                i++;
            }
            else{
                j--;
            }
        }
        for(char c:arr){
            str.append(c);
        }
        return str.toString();
    }
}

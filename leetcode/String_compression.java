//443. String Compression 

class Solution {
    public int compress(char[] arr) {
        int n=arr.length;
        int j=0;
        int count=1;
        for(int i=1;i<=n;i++){
            if(i<n && arr[i]==arr[i-1]){
                count++;
            }
            else{
                arr[j++]=arr[i-1];
                if(count>1){
                    for(char ch:String.valueOf(count).toCharArray()){
                        arr[j++]=ch;
                    }
                }
                count=1;
            }
        }
        return j;
    }
}

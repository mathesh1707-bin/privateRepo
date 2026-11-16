//2243

//Note : The first optimized soln done without the use of any AI so glad 

class Solution {
    public String sumItUp(String s,int k){
        StringBuilder str=new StringBuilder();
        int j=0;
        while(j<s.length()){
            int sum=0;
            for(int i=0;i<k;i++){
                if(i+j<s.length()){
                    sum+=s.charAt(j+i)-'0';
                }
            }
            str.append(sum);
            j+=k;
        }
        return str.toString();
    }
    public String digitSum(String s, int k) {
        if(s.length()<k){
            return s;
        }
        while(s.length()>k){
            s=sumItUp(s,k);
        }
        return s;
    }
}

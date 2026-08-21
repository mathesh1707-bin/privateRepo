import java.util.ArrayList;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        int n=logs.length;
        ArrayList<String> letterLogs=new ArrayList<>();
        ArrayList<String> digitLogs=new ArrayList<>();

        for(String log:logs){
            int idx=log.indexOf(' ');
            if(Character.isDigit(log.charAt(idx+1))){
                digitLogs.add(log);
            }
            else{
                letterLogs.add(log);
            }
        }
        letterLogs.sort((a,b)->{
            int idx1=a.indexOf(' ');
            int idx2=b.indexOf(' ');
            String content1=a.substring(idx1+1);
            String content2=b.substring(idx2+1);
            int result=content1.compareTo(content2);
            if(result!=0){
                return result;
            }
            String iden1=a.substring(0,idx1);
            String iden2=b.substring(0,idx2);
            return iden1.compareTo(iden2);
        });
        String [] result=new String[n];
        int i=0;
        for(String let:letterLogs){
            result[i++]=let;
        }
        for(String dig:digitLogs){
            result[i++]=dig;
        }
        return result;
    }
}
import java.util.*;
public class Find_the_highest_altitude {
    public static int largestAltitude(int[] gain) {
        int len=gain.length+1;
        int[] altitudes=new int[len];
        altitudes[0]=0;
        int max=0;
        for(int i=1;i<len;i++){
            if(gain[i-1]>altitudes[i-1]){
                altitudes[i]=gain[i-1]+altitudes[i-1];
            }
            else{
            altitudes[i]=altitudes[i-1]+gain[i-1];
            }
            if(altitudes[i]>max){
                max=altitudes[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(largestAltitude(nums));
    }
}

import java.util.Scanner;

public class Maximum_no_of_balloons {
    public static int Solution(String s) {
        int bCount=0,aCount=0,lCount=0,oCount=0,nCount=0;
        for (char ch:s.toCharArray()) {
            if (ch == 'b') {
                bCount++;
            } else if (ch == 'a') {
                aCount++;
            } else if (ch == 'l') {
                lCount++;
            } else if (ch == 'o') {
                oCount++;
            } else if (ch == 'n') {
                nCount++;
            }
        }
        lCount/=2;
        oCount/=2;
        return Math.min(Math.min(bCount,aCount),Math.min(lCount,Math.min(oCount,nCount)));
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = Solution(s);
        System.out.println(result);
    }
}


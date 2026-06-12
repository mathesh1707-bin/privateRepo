import java.util.*;
class Is_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n2 = s.length();
        int n1 = t.length();
        int i=0;
        int j = 0;
        int count = 0;
        while (i < n1 && j < n2) {
            if (t.charAt(i) == s.charAt(j)) {
                count++;
                j++;
            }
            i++;
        }
        System.out.print(count==n2);
    }
}
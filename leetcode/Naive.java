import java.util.Scanner;

public class Naive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count=0;
        int n = str1.length();
        int m = str2.length();
        for (int i = 0; i <=n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str1.charAt(i+j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}
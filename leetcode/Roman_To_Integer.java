import java.util.*;

public class Roman_To_Integer {
    
    public static int romanToInt(String s) {
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'I') {
                result += 1;
            }
            if (ch == 'V') {
                result += 5;
            }
            if (ch == 'X') {
                result += 10;
            }
            if (ch == 'L') {
                result += 50;
            }
            if (ch == 'C') {
                result += 100;
            }
            if (ch == 'D') {
                result += 500;
            }
            if (ch == 'M') {
                result += 1000;
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = romanToInt(s);
        System.out.println(result);
    }
}
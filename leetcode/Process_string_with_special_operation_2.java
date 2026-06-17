import java.util.*;

public class Process_string_with_special_operation_2 {
    
    public static char processStr(String s, long k) {
        long len = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                len++;
            } else if (ch == '#') {
                len *= 2;
            } else if (ch == '*') {
                if (len > 0)
                    len--;
            }
        }
        if (k >= len) {
            return '.';
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (k == len - 1) {
                    return ch;
                }
                len--;
            } else if (ch == '#') {
                len /= 2;
                if (k >= len) {
                    k -= len;
                }
            } else if (ch == '%') {
                k = len - 1 - k;
            } else if (ch == '*') {
                len++;
                if (k == len - 1) {
                    return '.';
                }
            }
        }
        
            return '.';
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long k = sc.nextLong();
        System.out.println(processStr(s,k));
    }
}

import java.util.*;

public class Process_string_with_special_operation_2 {
    
    public static char processStr(String s, long k) {
        StringBuilder str=new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                str.append(ch);
            } else if (ch == '#') {
                str.append(str.toString());
            } else if (ch == '%') {
                str.reverse();
            } else if (ch == '*') {
                str.deleteCharAt(str.length() - 1);
            }
        }
        return str.charAt((int)k);
        
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long k = sc.nextLong();
        System.out.println(processStr(s,k));
    }
}

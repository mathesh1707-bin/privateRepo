import java.util.*;

public class Process_string_with_special_operation {
    
        public static String processStr(String s) {
            StringBuilder result = new StringBuilder();
            int len = s.length();
            for (int i = 0; i < len; i++) {
                char ch = s.charAt(i);
                if (Character.isLowerCase(ch)) {
                    result.append(ch);
                } else if (ch == '*' && result.length() >= 1) {
                    result.deleteCharAt(result.length() - 1);
                } else if (ch == '#') {
                    int size = result.length();
                    for (int j = 0; j < size; j++) {
                        result.append(result.charAt(j));
                    }
                }
            }
            return result.toString();

        }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(processStr(s));
        }
}

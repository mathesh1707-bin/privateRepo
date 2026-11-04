import java.util.*;

public class digitReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        digits.reverse();
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                result.append(digits.charAt(index));
                index++;
            } else {
                result.append(ch);
            }
        }
        sc.close();
        System.out.print(result);
    }
}
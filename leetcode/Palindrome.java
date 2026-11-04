import java.util.*;

public class Palindrome {
    
    public static void checkPalindrome(String str) {
        int n = str.length();
        int i = 0;
        int j = n-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Yes");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkPalindrome(str);
    }
}

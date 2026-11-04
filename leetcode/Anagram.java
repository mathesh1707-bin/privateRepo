import java.util.Scanner;


public class Anagram {
    public static void checkAnagram(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int[] count = new int[26];    
        if (n != m) {
            System.out.print("No");
            return;
        }
        for (int i = 0; i < n; i++) {
            int index = str1.charAt(i) - 'a';
            count[index]++;
        }
        for (int i = 0; i < m; i++) {
            int index = str2.charAt(i) - 'a';
            count[index]--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("Not");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        checkAnagram(str1,str2);
    }
}

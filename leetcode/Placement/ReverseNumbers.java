package Placement;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int i = 0;
        int j = n - 1;
        char[] res = str.toCharArray();
        while (i < j) {
            if (!Character.isDigit(str.charAt(i))) {
                i++;
            }
            if (!Character.isDigit(str.charAt(j))) {
                j--;
            } else {
                char temp = str.charAt(i);
                res[i] = str.charAt(j);
                res[j] = temp;
                i++;
                j--;
            }
        }
        String result=new String(res);
        System.out.println(result);
    }
}

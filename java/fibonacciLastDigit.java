import java.util.*;

public class fibonacciLastDigit {
    public static int fibb(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return fibb(n - 1)+fibb(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibResult = fibb(n);
        String str = Integer.toString(fibResult);
        System.out.print(str.charAt(str.length()-1));
    }
}
import java.util.*;

public class Roman_To_Integer {
    
    public static int romanToInt(String s) {
        int result = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int current=value(s.charAt(i));
            if(i<s.length()-1 && current<value(s.charAt(i+1))){
                result-=current;
            }
            else{
                result+=current;
            }
        }
        return result;
    }
    public static int value(char ch){
        if (ch == 'I') {
                return 1;
            }
            if (ch == 'V') {
                return 5;
            }
            if (ch == 'X') {
                return 10;
            }
            if (ch == 'L') {
                return 50;
            }
            if (ch == 'C') {
                return 100;
            }
            if (ch == 'D') {
                return 500;
            }
           return 1000;    
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = romanToInt(s);
        System.out.println(result);
    }
}
package Placement;

import java.util.Scanner;

public class ValidDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        str.toLowerCase();
        if (str.equals("monday")) {
            System.out.println("x");
        }
        else if (str.equals("tuesday")) {
            System.out.println("y");
        }
        else if (str.equals("wednesday")) {
            System.out.println("z");
        }
        else if (str.equals("thursday")) {
            System.out.println("a");
        }
        else {
            System.out.println("Invalid day");
        }

    }
}

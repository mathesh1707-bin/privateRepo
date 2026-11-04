package Placement;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        str=str.toLowerCase();
        if (str.equals("monday")) {
            System.out.println("Express 1");
        }
        else if (str.equals("tuesday")) {
            System.out.println("Rapid 2");
        }
        else if (str.equals("wednesday")) {
            System.out.println("Swift 3");
        }
        else if (str.equals("thursday")) {
            System.out.println("Lightning 4");
            
        }
        else {
            System.out.println("Invalid day");
        }

    }
}



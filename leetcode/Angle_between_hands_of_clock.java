import java.util.*;

class Angle_between_hands_of_clock {
    
    public static double angleClock(int hours, int minutes) {
        double minuteAngle=minutes*6;
        double hourAngle = hours * 30 + minutes * 0.5;
        double diff = Math.abs(hourAngle - minuteAngle);        
        if (diff > 180) {
            diff = 360 - diff;
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        System.out.print(angleClock(hours, minutes));
    }
}
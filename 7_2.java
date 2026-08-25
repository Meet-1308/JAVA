import java.util.Scanner;

class Clock {
    int hour;
    int minute;

    void findAngle() {
        // Minute hand angle
        double minuteAngle = minute * 6;

        // Hour hand angle
        double hourAngle = (hour % 12) * 30 + minute * 0.5;

        // Difference between two angles
        double angle = Math.abs(hourAngle - minuteAngle);

        // Smaller angle
        if (angle > 180) {
            angle = 360 - angle;
        }

        System.out.println("Angle = " + angle + " degrees");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Clock c = new Clock();

        System.out.print("Enter hour: ");
        c.hour = sc.nextInt();

        System.out.print("Enter minute: ");
        c.minute = sc.nextInt();

        c.findAngle();
    }
}

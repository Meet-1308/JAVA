import java.util.Scanner;

class Circle {
    double radius;

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();

        c.area();
    }
}

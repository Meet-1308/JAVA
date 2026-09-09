import java.util.*;
class student{
    String name;
    int  roll_no;
    double spi;
    String course;

    public void setter()
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        this.name = sc.next();

        System.out.println("Enter roll_no. : ");
        this.roll_no = sc.nextInt();

        System.out.println("Enter spi: ");
        this.spi = sc.nextDouble();

        System.out.println("Enter course: ");
        this.course = sc.next();
    }
    public void getter()
    {
        System.out.println("Name: " +name);

        System.out.println("roll_no. : " +roll_no);

        System.out.println("spi: " +spi);

        System.out.println("course: " +course);
    }
}

public class Lab6_1 {

    public static void main(String[] args) {
    
    student s1 = new student();
    student s2 = new student();
    student s3 = new student();

    s1.setter();
    s1.getter();

    s2.setter();
    s2.getter();

    s3.setter();
    s3.getter();
}
    }
    

import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] Args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        System.out.print("enter c:");
        int c=sc.nextInt();
        System.out.print("enter d:");
        int d=sc.nextInt();
        System.out.print("enter e:");
        int e=sc.nextInt();

        double A=(a+b*c);
        System.out.print("enter a sum:"+A);

        double B=(a/b*c);
        System.out.print("enter a ans:"+B);

        double C=(a*b/c%d);
        System.out.print("enter a ans:"+B);

        double D=(a+b/c-d*e);
        System.out.print("enter a ans:"+B);
    }
}

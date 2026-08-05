import java.util.Scanner;

public class lab2_5 {
     public static void main(String[] Args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a Meters:");
        float meters=sc.nextInt();

        double sum=(meters*3.28);        
        System.out.print("enter a sum:"+sum);
    }
}

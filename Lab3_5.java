import java.util.Scanner;

public class Lab3_5 {
     public static void main(String[] Args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        
        System.out.print("enter b: ");
        int b = sc.nextInt();

        System.out.print("enter c: ");
        int c = sc.nextInt();

          if(a>=b && a>=c)
        {
            System.out.println(a + "Is Large");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b + "Is Large");
        }
        else{
            System.out.print(c+"is Large");
        }
    }
}

import java.util.Scanner;

public class lab4_2 {
    public static void main(String[] Args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter A:");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.print("number is even");
        }
        else{
            System.out.print("number is odd");
        }
        

    }
}

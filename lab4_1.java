import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] Args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter marks:");
        
        int i,total=0,marks;
        

        for(i=0;i<=4;i++)
        {
            marks = sc.nextInt();
            total=total+marks;
        }
        double per=total/0.5;
        System.out.println("percentaeg is:"+ per);
        if(per>=60)
        {
            System.out.print("First Division");
        }
        else if(per>=50 && per<=59)
        {
            System.out.print("First Division");
        }
        else if(per>=40 && per<=49)
        {
            System.out.print("First Division");
        }
        else{
            System.out.print("Faill");
        }
    }
}

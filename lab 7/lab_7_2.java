import java.util.Scanner;
class angle{
    float hour;
    float minute;


    public void Setter()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your hour");
        this.hour=sc.nextFloat();
        

        System.out.println("Enter Your minute");
        this.minute=sc.nextFloat();

        float hourangle= (hour * 30) + (minute * 0.5);
        float minangle= minute*6;

        float angle=Math.abs(hourangle-minangle);
    }


    public void Getter()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("hour :"+hour);
        System.out.println("minute :"+minute);
        System.out.println("angle :"+angle);


    }
}


public class lab_7_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

         circle c1=new circle();
         c1.Setter();
         c1.Getter();
    }
}

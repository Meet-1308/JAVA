import java.util.Scanner;
class circle{
    double r;

    public double area(double r)
    {
        return Math.PI * r * r;
    }


    public void Setter()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your radius");
        this.r=sc.nextDouble();
    }


    public void Getter()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" radius:"+r);

        circle c1=new circle();
        double area= c1.area(r);
        System.out.println(" Area is:"+area);
    }
}


public class lab_7_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

         circle c1=new circle();
         c1.Setter();
         c1.Getter();
    }
}

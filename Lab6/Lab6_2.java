import java.util.Scanner;
class Cubes{
    double height;
    double width;
    double depth;

    public void Setter()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter height\n");
        this.height=sc.nextDouble();
        System.out.println("Enter width\n");
        this.width=sc.nextDouble();
        System.out.println("Enter Your depth\n");
        this.depth=sc.nextDouble();
    }
    public void Getter()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" \nheight:"+height);
        System.out.println(" \nwidth:"+width);
        System.out.println(" \ndepth:"+depth);
    }
     public void volume1(){
        double ans;
        ans=height*width*depth;
        System.out.println(" \nvolume is:"+ans);
     }
}

public class Lab6_2 {
    public static void main(String[] args) {
        
        Cubes st=new Cubes();
        st.Setter();
        st.Getter();
        st.volume1();


    }
}




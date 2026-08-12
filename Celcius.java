import java.util.*;

class Ferenith
{
    public static void findCelsius(double f)
    {
        double c = f-((32*5)/9);
        System.out.println("Celcius is :"+ c);
    }
}

public class Celcius
{
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Ferenith:");

        double f = sc.nextDouble();

        Ferenith.findCelsius(f);
    }
}
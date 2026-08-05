import java.util.Scanner;

public class lab2_6 {
    public static void main(String[] Args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a one  letter:");
        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);

        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
        {
            System.out.print("letter Vovel");
        }
        else
        {
            System.out.print("letter constant");
        }
    
    }
}

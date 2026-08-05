
import java.util.Scanner;
public class Lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a: ");
        int a = sc.nextInt();
        
        System.out.print("enter b: ");
        int b = sc.nextInt();
        
        System.out.print("enter a + , - , * , / : ");
        String sign = sc.next();
        int sum = 0; 
        
        switch (sign) {
            case "+":
                sum = (a + b);
                System.out.print("sum is \n" + sum);
                break;

            case "-":
                sum = (a - b);
                System.out.print("difference is \n" + sum);
                break;

            case "*":
                sum = (a * b);
                System.out.print("product is \n" + sum);
                break;

            case "/":
                if (b != 0) {
                    sum = (a / b);
                    System.out.print("quotient is \n" + sum);
                } else {
                    System.out.print("Error: Division by zero!");
                }
                break;
            default:
                System.out.print("enter a valid sign");
        }
    }
}


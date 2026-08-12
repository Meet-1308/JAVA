
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Choose an operator (+, -, *, /) or q to quit: ");
            char operator = sc.next().charAt(0);

            if (operator == 'q' || operator == 'Q') {
                System.out.println("Calculator closed.");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result is: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result is: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result is: " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
            }

            System.out.println();
        }

    }
}


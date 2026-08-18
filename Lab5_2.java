import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum=0;
        float avg;
        for (int i = 0; i < n; i++) {
          sum=sum+arr[i];
        }
        avg=sum/4;
        
        System.out.println( "sum is:"+sum);
        
        System.out.println( "avg is:"+avg);
    }
}

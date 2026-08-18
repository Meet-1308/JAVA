import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter array 1 elements:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        for(int i=0;i<n;i++)
        {
          arr2[i] = arr1[i];
        }
        System.out.println("Copy Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}

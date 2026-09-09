import java.util.Arrays;

class A {
    int arr[] = {5, 2, 8, 1, 6};

    void sortArray() {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    void searchArray(int n) {
        for (int x : arr) {
            if (x == n) {
                System.out.println(n + " found in array");
                return;
            }
        }
        System.out.println(n + " not found in array");
    }

    void SumArray() {
        int sum = 0;
        for (int x : arr)
            sum += x;

        System.out.println("Sum = " + sum);
    }

    void avgArray() {
        int sum = 0;
        for (int x : arr)
            sum += x;

        System.out.println("Average = " + (sum / 5.0));
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();

        obj.sortArray();
        obj.searchArray(8);
        obj.SumArray();
        obj.avgArray();
    }
}

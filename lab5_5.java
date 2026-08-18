import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }

            System.out.println();
        }
    }
}

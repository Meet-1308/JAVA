import java.util.Scanner;

class VowelCounter {
    int a = 0;
    int e = 0;
    int i = 0;
    int o = 0;
    int u = 0;

    void countVowels(String str) {
        str = str.toLowerCase();

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            if (ch == 'a')
                a++;
            else if (ch == 'e')
                e++;
            else if (ch == 'i')
                i++;
            else if (ch == 'o')
                o++;
            else if (ch == 'u')
                u++;
        }
    }

    void display() {
        System.out.println("Total A = " + a);
        System.out.println("Total E = " + e);
        System.out.println("Total I = " + i);
        System.out.println("Total O = " + o);
        System.out.println("Total U = " + u);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VowelCounter vc = new VowelCounter();

        while (true) {
            System.out.print("Enter a sentence: ");
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("quit")) {
                break;
            }

            vc.countVowels(str);
        }

        vc.display();
    }
}

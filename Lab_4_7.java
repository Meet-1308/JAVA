public class ThreeDigitPrime {
    public static void main(String[] args) {

        System.out.println("3-digit prime numbers are:");

        for (int num = 100; num <= 999; num++) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {

        /*
         * // FOR
         * for (int i = 0; i < 5; i++) {
         * System.out.println(i);
         * }
         */

        // WHILE

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce números");
        int n = 8;
        while (n != 10) {
            n = sc.nextInt();
            System.out.println(n);
        }
    }
}
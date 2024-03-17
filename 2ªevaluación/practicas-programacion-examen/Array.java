import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Dime un numero: ");
            int numero = sc.nextInt();

            arr[i] = numero;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

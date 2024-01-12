import java.util.Scanner;

/**
 * Exercicio1
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número binario: ");
        String binario = sc.nextLine();
        int decimalNumber = Integer.parseInt(binario, 2);

        System.out.println(decimalNumber);

    }
}
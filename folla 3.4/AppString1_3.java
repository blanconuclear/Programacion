import java.util.Scanner;

/**
 * Fai un programa que pida unha frase, e mostre a mesma sen a primeira ‘a’ da
 * frase
 */
public class AppString1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime unha frase: ");

        String frase = sc.nextLine();

        frase = frase.replace("a", "");

        System.out.println(frase);

        sc.close();

    }

}
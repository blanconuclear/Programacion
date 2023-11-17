import java.util.Scanner;

/**
 * O programa deberá ir pedindo unha cadea e un char, eliminará ese char da
 * cadea, o mostrará a cadea.
 * Logo pedirá outro par cadea/char. Rematará cando o char sexa o punto ‘.’
 */
public class AppString1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadea;
        int quitarChar;

        while (true) {
            System.out.println("Dime unha cadea: ");
            cadea = sc.nextLine();
            System.out.println("Dime o char: ");
            quitarChar = sc.nextInt();

            StringBuilder cadeaFinal = new StringBuilder(cadea);

            cadeaFinal = cadeaFinal.deleteCharAt(quitarChar);

            System.out.println("O resultado é: " + cadeaFinal);

            if (quitarChar == ".") {
                System.out.println("mal");
            }

        }

    }
}

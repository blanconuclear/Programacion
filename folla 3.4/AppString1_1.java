import java.util.Scanner;

/**
 * Crea unha clase que vaia pedindo frases por teclado, e que repita as que
 * teñan como lonxitude maior
 * que 15 caracteres. Rematará cando a palabra introducida sexa “Fin”
 */

public class AppString1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        while (true) {
            System.out.println("Dime unha frase: ");
            frase = sc.nextLine();
            if (frase.length() > 15) {
                System.out.println(frase);
            }
            if (frase.equalsIgnoreCase("Fin")) {
                break;
            }
        }
        sc.close();
    }

}

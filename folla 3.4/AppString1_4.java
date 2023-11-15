import java.util.Scanner;

/**
 * Fai un programa que pida frases por teclado e as copie noutro String sen
 * letras ‘a’. Mostrará cada frase
 * sen letras ‘a’ e pedirá outra frase. Rematará cando a frase non teña letras
 * ‘a’.
 */
public class AppString1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        while (true) {

            System.out.println("Dime unha frase: ");
            frase = sc.nextLine();
            String fraseSenA = frase.replace("a", "");

            System.out.println(fraseSenA);

            if (!frase.contains("a")) {
                System.out.println("Ata logo!");
                break;
            } else {
            }
        }
        sc.close();
    }

}

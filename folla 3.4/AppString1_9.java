import java.util.Scanner;

/**
 * O programa deberá ir pedindo cadeas de caracteres, sen puntos, e para cada
 * unha delas cambiar todas
 * as letras 'a' por 'e', e todas as 'e' por 'a', e despois imprimir a cadea. O
 * programa rematará se o tamaño da
 * cadea introducida é 2 (ten só 2 letras)
 */
public class AppString1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;

        while (true) {
            System.out.println("Dime unha cadea de caracteres, sen puntos: ");
            frase = sc.nextLine();

            String fraseModificada = frase.replace("a", ".").replace("e", "a").replace(".", "e");
            System.out.println(fraseModificada);

            if (frase.length() <= 2) {
                System.out.println("Ata logo!");
                break;
            }
        }
        sc.close();
    }
}

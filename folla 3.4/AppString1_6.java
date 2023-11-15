import java.util.Scanner;

/**
 * Programa que pida unha cadea, e quite os espazo en branco repetidos entre 2
 * palabras. De cada
 * “conxunto” de espazos en branco, só quedará un espacio. Exemplo: “o espazo”
 * quedará “o espazo”.
 */
public class AppString1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime unha frase: ");
        String frase = sc.nextLine();
        frase = frase.trim();
        System.out.println(frase);

        sc.close();
    }

}
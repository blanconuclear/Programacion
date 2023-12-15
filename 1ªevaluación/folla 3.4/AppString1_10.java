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
        String palabra = "";

        while (!palabra.equals(".")) {
            System.out.println("Dime unha frase: ");
            cadea = sc.nextLine();
            System.out.println("Dime unha palabra: ");
            palabra = sc.nextLine();

            String cadeaMinusculas = cadea.toLowerCase();
            String palabraMinusculas = palabra.toLowerCase();

            if (cadeaMinusculas.contains(palabraMinusculas)) {
                System.out.println(cadeaMinusculas.replace(palabraMinusculas, "").trim().replace("  ", " "));
            } else if (palabra.equals(".")) {
                System.out.println("Ata logo");
            } else {
                System.out.println("A cadea: " + cadeaMinusculas + ". Non contén a palabra: " + palabraMinusculas);
            }
        }
        sc.close();
    }
}

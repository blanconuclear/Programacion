package exercicio2;

/**
 * Crea un validador de direcciones IP. Lembra que as direcciones IP son
 * especificadas en decimal como 4 grupos de números separados por ‘.’ Cada
 * grupo puede contener un número decimal de 0 a 255. Por exemplo son IP
 * válidas:
 * 
 * 0.1.2.3
 * 255.255.255.255
 * 9.234.1.199
 * Son inválidas:
 * 
 * 0.1.2.
 * 0.1.2.3.
 * 256.1.2.3
 */
import java.util.Scanner;

public class ValidadorIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe a tua dirección IP: ");
        String direccionIP = sc.nextLine();

        String[] words = direccionIP.replace(".", " ").split(" ");
        boolean eValida = true;

        for (String string : words) {
            try {
                int proba = Integer.parseInt(string);
                if (words.length != 4) {
                    eValida = false;
                } else {

                    if (!(proba >= 0 && proba <= 255)) {
                        eValida = false;
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                eValida = false;
                break;
            }
        }

        if (eValida) {
            System.out.println("A dirección: " + direccionIP + " é correcta");
        } else {
            System.out.println("A dirección: " + direccionIP + " non é correcta");
        }

        sc.close();
    }

}

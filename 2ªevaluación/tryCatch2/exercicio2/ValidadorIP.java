package exercicio2;

import java.util.Scanner;

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
public class ValidadorIP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe a tua dirección IP: ");
        String direccionIP = sc.nextLine();

        String[] words = direccionIP.replace(".", " ").split(" ");

        for (String string : words) {
            int proba = Integer.parseInt(string);
            if (proba > 0 && proba < 250) {
                System.out.println("A IP é correcta: " + direccionIP);
            } else {
                System.out.println("A direccion non é correcta");
            }
        }
    }
}

/*
 * for (String word : words) {
 * System.out.println(word);
 * }
 */

/*
 * String convertirString = words.toString();
 * int convertirNumero = Integer.parseInt(convertirString);
 * 
 * System.out.println(convertirString);
 */

import java.util.Scanner;

/**
 * Programa que conte o numero de palabras que aparecen nunha cadea de
 * caracteres. As palabras
 * poderán estar separadas por un espacio ou por varios
 */

public class AppString1_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime unha frase: ");
        String cadena = sc.nextLine();
        String[] partes = cadena.split(" ");
        int contarPalabras = partes.length;

        if (contarPalabras > 1) {
            System.out.println("A tua cadea ten: " + contarPalabras + " palabras.");
        } else {
            System.out.println("A tua cadea ten: " + contarPalabras + " palabra.");
        }
        sc.close();
    }
}

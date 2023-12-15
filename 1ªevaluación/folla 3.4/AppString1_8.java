
/**
 * Programa que intercambie a primeira metade dunha cadea de caracteres coa
 * segunda metade.
 */

import java.util.Scanner;

public class AppString1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime unha frase: ");
        String cadena = sc.nextLine();
        int puntoMedio = cadena.length() / 2;
        String primeiraMetade = cadena.substring(0, puntoMedio);
        String segundaMedate = cadena.substring(puntoMedio);

        System.out.println("Frase orixinal: " + cadena);
        System.out.println("Frase intercambiada" + segundaMedate + primeiraMetade);

        sc.close();
    }
}

/*Programa que cambie a primeira letra de cada palabra e a poña en maiúsculas se está en minúsculas.
Busca como funciona o método toUpperCase( ) da clase Character */

import java.util.Scanner;

public class AppString1_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime unha frase: ");
        String cadena = sc.nextLine();
        String[] palabras = cadena.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            resultado += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
            resultado += " ";
        }
        resultado = resultado.trim();
        System.out.println(resultado);

        sc.close();
    }
}

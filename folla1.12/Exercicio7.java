/*Fai un programa que pida unha cadea de caracteres de ata 20 letras, e chamando a funcións, vaia
facendo o seguinte:  cambia a primeira letra de cada palabra a maiúsculas, elimina a letra 'a' da
cadea, e elimina espazos seguidos. Logo de cada paso deberás chamar a unha función imprime ( )
que mostre a cadea */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce unha cadea de caracteres de ata 20 letras: ");
        String cadea = sc.nextLine();

        if (cadea.length() > 20) {
            System.out.println("a cadea ten mas de 20 letras");
        }

        primeiraLetraMayuscula(cadea);

        eliminarLetraA(cadea);

    }

    public static void primeiraLetraMayuscula(String cadea) {
        String[] resultado = cadea.split(" ");

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i].substring(0, 1).toUpperCase() + resultado[i].substring(1) + " ");
        }
    }

    public static void eliminarLetraA(String cadea) {
        String resultado = cadea.replace("a", "");
        System.out.println("Esta é a cadea sen a letra a: " + resultado.trim());
    }
}

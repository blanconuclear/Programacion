/*
 * Fai un programa que empregue unha función para introducir unha cadea.
 * Introduce no main( ) 2 letras distintas: letra1 e letra2. Fai despois outra
 * función elimina( ) que elimine as sílabas compostas por esas dúas letras
 * seguidas. Ex: “Na casa do ferreiro” e 's', 'a'. Deberá eliminar “sa”,
 * quedando a cadea como “Na ca do ferreiro”.
 */

import java.util.Scanner;

/**
 * Exercicio3
 */
public class Exercicio3 {

    public static void main(String[] args) {
        String letraA = "s";
        String letraB = "a";
        String cadeaSC = introducirCadea();
        String resultadooFinal = elimina(letraA, letraB, cadeaSC);

        System.out.println(resultadooFinal);
    }

    public static String introducirCadea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce unha cadea de texto");
        String cadea = sc.nextLine();
        return cadea;
    }

    public static String elimina(String letraA, String letraB, String cadeaSC) {

        String letrasConcat = letraA + letraB;

        String solucion = cadeaSC.replace(letrasConcat, "");
        return solucion;
    }
}

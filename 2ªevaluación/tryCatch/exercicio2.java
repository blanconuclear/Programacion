/*
 * Queremos calcular o factorial dun número pero asegurándonos que o usuario
 * introduce un enteiro por teclado. Ata que non introduza un enteiro
 * pedirémoslle de novo o número. Faino primeiro coa clase Scanner e logo co
 * JOptionPane. Investiga InputMismatchException e a, para
 * cada un dos casos.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio2 {

    public static int dameNum() throws InputMismatchException, NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int n = sc.nextInt();
        return n;

    }

    public static void main(String[] args) {
        int resultado = 1;
        while (resultado == 1) {
            try {
                int dameNumero = dameNum();
                System.out.println("");
                for (int i = 1; i < dameNumero + 1; i++) {
                    resultado = resultado * i;
                    System.out.println(resultado);
                }
            } catch (Exception e) {
                System.out.println("Excepción recibida --> " + e);
            }
        }

    }

}
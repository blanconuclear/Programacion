//Queremos calcular o factorial dun número pero asegurándonos que o usuario introduce 
//un enteiro por teclado. Ata que non introduza un enteiro pedirémoslle de novo o 
//número. Faino primeiro coa clase Scanner e logo co JOptionPane. 
//Investiga InputMismatchException e NumberFormatException, para cada un dos casos.

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while (true) {
            System.out.print("Por favor, introduza un número enteiro: ");

            try {
                numero = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduza un número enteiro válido.");
                scanner.next();
            }
        }

        scanner.close();

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("O factorial de " + numero + " é: " + factorial);
    }
}

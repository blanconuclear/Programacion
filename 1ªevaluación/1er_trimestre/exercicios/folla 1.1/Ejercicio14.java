//14. Pedir un número maior que 5 e contestar se foi “correcto” ou “incorrecto”

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número maior que 5: ");
        int num = sc.nextInt();

        if (num > 5) {
            
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
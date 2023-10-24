/*Facer a división de 2 números enteiros, amosando unha mensaxe de erro se o divisor é 0 (non
podemos facer a división por 0).*/

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Número 1: ");
        int n1 = sc.nextInt();

        System.out.println("Número 2: ");
        int n2 = sc.nextInt();

        if(n1%n2==0 || n2%n1==0){
            System.out.println("Non se pode facer a división por 0!!");
        }


    }
}
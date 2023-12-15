import java.util.Scanner;

public class Ejercicio1 {

     public static void main(String[] args) {
        System.out.println("Introduce o número maior");
        Scanner escaner = new Scanner(System.in);
        int numeroMaior = escaner.nextInt();
        System.out.println("Introduce o número menor");
        int numeroMenor = escaner.nextInt();
        int resta = numeroMaior-numeroMenor;
        System.out.println("O resultado de "+ numeroMaior +"-"+ numeroMenor+ " é "+ resta);

escaner.close();
        }

}
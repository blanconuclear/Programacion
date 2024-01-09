package exercicio4;

import java.util.Scanner;

/**
 * Appbici
 */
public class Appbici {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion="";
       BiciElect [] arrayBicis= new BiciElect[5];



       while (!opcion.equals("f")) {
        System.out.println("Selecciona unha opción: ");
        System.out.println("a)Introducir bici.\nb)Mostrar elementos array\nc)Cambiar os datos de unha bici en concreto.\nd)Mostrar a bici con mais autonomía.\ne)mostrar a bici con menos autonomía\nf)Sair. ");
        opcion=sc.nextLine();

        switch (opcion) {
            case "a":
                for (int i = 0; i < arrayBicis.length; i++) {
                    System.out.println("Introduce a bicicleta nº "+(i+1));
                    arrayBicis[i]=
                }
                break;
        
            default:
                break;
        }
       }


    }
}
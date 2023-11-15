import java.util.Scanner;

/**
 * Programa que pida dúas palabras, e diga cal é a que iría primeiro no
 * dicionario
 */
public class AppString1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime a primera palabra: ");
        String primeiraPalabra = sc.nextLine();

        System.out.println("Dime a segunda palabra: ");
        String segundaPalabra = sc.nextLine();

        if (primeiraPalabra.compareTo(segundaPalabra) == 0) {
            System.out.println("As cadeas son iguais");
        } else if (primeiraPalabra.compareTo(segundaPalabra) < 0) {
            System.out.println("A primeira palabra vai antes");
        } else {
            System.out.println("A segunda palabra vai antes");
        }
        sc.close();
    }
}

/*
 * String cadea = new String("probando");
 * String cadeaNova = new String("Probando");
 * if(cadea.compareTo(cadeaNova) == 0){
 * System.out.println("As cadeas son iguais");
 * }
 */
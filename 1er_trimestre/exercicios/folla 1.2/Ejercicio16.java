import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Por favor, ingresa un número de 4 cifras: ");
        int numero = scanner.nextInt();


        scanner.close();

   
        int cifraUnidad = numero % 10;
        int cifraDecena = (numero / 10) % 10;
        int cifraCentena = (numero / 100) % 10;
        int cifraMillar = numero / 1000;


        int numeroInvertido = cifraUnidad * 1000 + cifraDecena * 100 + cifraCentena * 10 + cifraMillar;
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}
import java.util.Scanner;

/**
 * Exercicio1
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numerosNegativos=0;
        int numerosPositivos=0;
        int sumaNumeros=0;
        int numero=0;


    while (numero != 1313 || sumaNumeros!=23) {
        System.out.println("Dime un número: ");
        numero=sc.nextInt();

        if(numero != 1313){
            if(numero>=0){
                 numerosPositivos++;
            sumaNumeros+=numero; 
            }else{
                 numerosNegativos++;
            sumaNumeros+=numero;
            }
        }
    }

    System.out.println("Numeros negativos: "+numerosNegativos);
    System.out.println("Numeros positivos: "+numerosPositivos);
    System.out.println("suma total: "+sumaNumeros);


    sc.close();
    }
}
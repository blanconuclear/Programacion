/*Fai o exercicio anterior empregando unha variable chamada menor onde se vaia gardando o
menor número en cada comparación. Emprega só 2 comparacións . */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Número 1: ");
        int n1 = sc.nextInt();
        System.out.println("Número : ");
        int n2 = sc.nextInt();
        System.out.println("Número 3: ");
        int n3 = sc.nextInt();

        int minimo = n1

        if(n2<minimo){
            minimo = n2;
        }else{
            minimo = n3;
        }
          
    
        sc.close();
    }
}
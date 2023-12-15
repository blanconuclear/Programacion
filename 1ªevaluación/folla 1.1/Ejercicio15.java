//15. Pedir un número enteiro por pantalla e mostrar se é múltiplo de 3. 

import java.util.Scanner;

public class Ejercicio15 {
        
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Dime un número: ");
                int n = sc.nextInt();
            
                if(n%3==0){
                    System.out.println(n+" é primo de 3");
                }
         
            else{
                System.out.println(n +" non é primo de 3"); 
            }
                   sc.close();
        }
    }
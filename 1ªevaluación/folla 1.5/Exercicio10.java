/*Simula o xogo de lanzar 1 dado, dándolle ao xogador o número de intentos que considere oportuno
para achegarse ao 21. Se chega xusto felicítao, e se non indícalle que perdeu. O xogador pode
plantarse en calquera intento */

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaDado = 0;
        int numeroTiradas = 0;

        while (sumaDado < 21) {
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("¿Queres tirar o dado?(s/n): ");
            String tirar = sc.next();

            if (tirar.equals("s")) {
                sumaDado += dado;
                numeroTiradas++;
                System.out.println("Dado: " + dado + " " + "acumulado: " + sumaDado);
            } else {
                break;
            }

        }
        if (sumaDado == 21) {
            System.out.println("Felicidades. Sacaches: " + sumaDado + ". Tieches " + numeroTiradas + " tiradas.");
        } else {
            System.out.println("Perdeches. Sacaches: " + sumaDado + ". Tieches " + numeroTiradas + " tiradas.");

        }
    }
}

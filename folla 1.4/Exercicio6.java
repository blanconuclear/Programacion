/*Calcula canto vale o sumatorio 1/1+1/3+1/5+1/7+1/9+ ..., con 40 sumandos (pensa que NON podes
facer a división entre enteiros). */

public class Exercicio6 {

    public static void main(String[] args) {
        int n = 1;
        int sumandos = 40;
        float suma = 0;

        while (sumandos > 0) {
            suma += 1.0 / n;
            n += 2;
            sumandos--;
        }

        System.out.println("El sumatorio de la serie es: " + suma);
    }
}

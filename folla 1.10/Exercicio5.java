/*
 * Escribe un programa que devolva a área dun círculo dado o seu radio (double).
 * PI * radio* radio
 */

public class Exercicio5 {

    public static void main(String[] args) {

        double radio = 34;

        double resultado = calcularRadio(radio);
        System.out.println("A área do cículo é: " + resultado);

    }

    public static double calcularRadio(double a) {
        return 3.14 * Math.pow(a, 2);
    }
}
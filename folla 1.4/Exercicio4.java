/*Mostra todos os números pares menores que 100 */

public class Exercicio4 {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {

            if (i % 2 == 0) {
                System.out.println("O número " + i + " é par.");
            }
        }
    }
}
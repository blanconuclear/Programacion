//5. Mostra os impares menores que 100 de maior a menor.

public class Exercicio5 {
    public static void main(String[] args) {

        int n = 99;
        while (n >= 1) {
            if (n % 2 != 0) {
                System.out.println("O número " + n + " é impar.");
            }
            n -= 1;
        }
    }
}

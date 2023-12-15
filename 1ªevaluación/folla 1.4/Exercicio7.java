//Mostra os múltiplos de 3 e 7 (de ambos) menores que 100.

public class Exercicio7 {
    public static void main(String[] args) {

        int n = 1;

        while (n < 100) {
            if (n % 3 == 0 && n % 7 == 0) {
                System.out.println("El número " + n + " es múltiplo de 3 y 7 ");
            }
            n++;
        }
    }
}

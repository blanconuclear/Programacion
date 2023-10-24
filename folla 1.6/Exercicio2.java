/*Modifica o exercicio anterior para que o faga 10 veces pero cada vez con un saúdo distinto
de 3 elixidos por ti. A elección será aleatoria */

public class Exercicio2 {
    public static void main(String[] args) {
        int nAleatorio = (int) (Math.random() * 3 + 1);

        for (int i = 1; i <= 10; i++) {
            if (nAleatorio == 1) {
                System.out.println("Ola, Ola Caracola!");
            } else if (nAleatorio == 2) {
                System.out.println("Moi boas!");
            } else {
                System.out.println("Hola mundo!");
            }
        }
    }
}

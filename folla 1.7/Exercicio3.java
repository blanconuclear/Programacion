/*Declara un array de 100 ints. Mostra o que hai nas 5 primeiras posicións (deberían ser 0). Introduce
nas 20 primeiras posicións os 20 primeiros números comezando no 0: 0,1, 2, 3, ... , 19. Mostra eses
20 valores desde o vixésimo ata o primeiro */

public class Exercicio3 {

    public static void main(String[] args) {
        int[] arrayEnteiros = new int[100];
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayEnteiros[i]);
        }

        for (int i = 20; i >= 0; i--) {
            System.out.println(arrayEnteiros[i] = i);
        }

    }
}
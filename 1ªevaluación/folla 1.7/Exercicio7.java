/*Crea un array de 100 enteiros . Asígnalle desde o valor 1 ata 100. Mostrao como unha conta atrás.
Modifícao agora de xeito que en todas posicións na que hai un múltiplo de 5 se garde o valor 5.
Móstrao de novo como unha conta atrás */

public class Exercicio7 {

    public static void main(String[] args) {
        int[] arrayEnteiros = new int[100];
        for (int i = 0; i < 100; i++) {
            arrayEnteiros[i] = i;

        }

        for (int i = 99; i >= 0; i--) {
            System.out.println(arrayEnteiros[i] = i);
        }

        for (int i = 0; i < 100; i++) {
            if (arrayEnteiros[i] % 5 == 0) {
                arrayEnteiros[i] = 5;
            }

        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(arrayEnteiros[i]);
        }

    }
}
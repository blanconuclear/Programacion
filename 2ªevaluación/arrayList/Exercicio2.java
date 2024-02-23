import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fai unha lista para almacenar saúdos diferentes introducidos por teclado. O
 * programa pedirá saúdos ata que se introduza “fin”. Entón o programa
 * despedirase cun dos saúdos introducidos, elixido aleatoriamente.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        List<String> listSaudos = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un saudo: ");
        String respota = sc.nextLine();

        while (!respota.equals("fin")) {
            listSaudos.add(respota);
            System.out.println("Dime un saudo: ");
            respota = sc.nextLine();
        }

        double saudoAleatorio = Math.random() * listSaudos.size();
        int saudoAleatorio1 = (int) saudoAleatorio;

        System.out.println(listSaudos.get(saudoAleatorio1));

        sc.close();

    }
}
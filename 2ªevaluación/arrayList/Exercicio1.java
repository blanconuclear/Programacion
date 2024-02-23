import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fai unha lista para gardar datos double, que corresponden a varias medidas
 * dunha temperatura ambiente. O programa irá pedindo esas medidas ata que se
 * introduce 100. Cando se introduce o 100, mostrarase a media das temperaturas
 * medidas.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> tempList = new ArrayList<Double>();
        System.out.println("Dime a temperatura ambiente: ");
        Double input = sc.nextDouble();

        while (input != 100) {
            tempList.add(input);
            System.out.println("Dime a temperatura ambiente: ");
            input = sc.nextDouble();

        }

        Double mediaTemperatura = 0.0;

        System.out.println("A lista das temperaturas é: ");
        for (Double temperatura : tempList) {
            mediaTemperatura += temperatura;
        }

        System.out.println(mediaTemperatura / tempList.size());

        sc.close();

    }
}
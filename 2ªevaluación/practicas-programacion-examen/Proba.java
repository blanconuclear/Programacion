
/**
 * Fai unha lista para gardar datos double, que corresponden a varias medidas
 * dunha temperatura ambiente. O programa irá pedindo esas medidas ata que se
 * introduce 100. Cando se introduce o 100, mostrarase a media das temperaturas
 * medidas.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> listaDoubles = new ArrayList<Double>();

        System.out.println("Dime unha temperatura: ");
        Double tem = sc.nextDouble();

        while (tem != 100) {

            listaDoubles.add(tem);
            System.out.println("Dime unha temperatura: ");
            tem = sc.nextDouble();
        }

        Double mediaTemp = 0.0;

        for (Double double1 : listaDoubles) {
            mediaTemp += double1;
        }

        System.out.println(mediaTemp / listaDoubles.size());
    }
}

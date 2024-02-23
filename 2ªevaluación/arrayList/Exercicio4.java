import java.util.ArrayList;
import java.util.Arrays;

/**
 * Crea un array de 10 enteiros. Asigna os 10 primeiros pares como valores. Crea
 * agora un arraList que sexa similar ao array creado.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Integer[] arrayNum = new Integer[9];

        for (int i = 1; i < arrayNum.length; i++) {
            arrayNum[i] = i * 2;
        }

        ArrayList<Integer> listNum = new ArrayList<Integer>(Arrays.asList(arrayNum));

        for (Integer integer : listNum) {
            System.out.println(integer);
        }
    }
}
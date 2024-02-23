import java.util.ArrayList;
import java.util.List;

/**
 * Crea unha lista de tipo String, e engade 4 elementos String: “Roma”, “París”,
 * “Estocolmo”, “Vilna”. Convirte a lista nun array e mostra os elementos cun
 * for.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        List<String> elementList = new ArrayList<String>();

        elementList.add("Roma");
        elementList.add("París");
        elementList.add("Estocolmo");
        elementList.add("Vilna");

        String[] elementArray = new String[elementList.size()];
        elementArray = elementList.toArray(elementArray);

        for (String string : elementArray) {
            System.out.println(string);
        }
    }
}
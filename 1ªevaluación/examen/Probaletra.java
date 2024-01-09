/**
 * Probaletra
 */
public class Probaletra {

    public static void main(String[] args) {
        String nome="armenda";
        String intermedia=nome.replace("a", "+").replace("e", "*").replace("+", "e").replace("*", "a");
    

        

        System.out.println(intermedia);

    }
}
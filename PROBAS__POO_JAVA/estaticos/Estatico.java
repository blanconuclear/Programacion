package estaticos;

/**
 * Estatico
 */

// Cuando es static(tanto el atributo, como el método). Ya no le pertenece al
// objeto. Le pertenece a la clase.
public class Estatico {
    private static String frase = "Hola mundo";
    private static int contador = 0;

    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public static int contador(int p) {
        return contador += p;
    }

    public static void main(String[] args) {
        System.out.println(Estatico.sumar(2, 2));
        System.out.println(Estatico.frase);

        System.out.println(Estatico.contador(2));
        System.out.println(Estatico.contador(2));
        System.out.println(Estatico.contador(2));
        System.out.println(Estatico.contador(-2));

    }
}
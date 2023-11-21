import java.util.Scanner;

/**
 * Fai un programa no que definas unha frase. Mostra un menú coas seguintes
 * posibilidades (cada opción
 * fará exactamente o que di, para mostrar a frase premeremos 'f'):
 * a) Introducir frase.
 * b) Pasar as minúsculas a maiúsculas.
 * c) Borrar espazos, poden ser varios espazos seguidos
 * d) Inverter a frase.
 * e) Escriba a primeira letra de cada palabra en maiúscula (se é minúscula).
 * f) Mostrar a frase
 * g) Saia do programa
 */
public class AppString1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "";
        while (true) {
            System.out.println(
                    "a) Introducir frase.\nb) Pasar as minúsculas a maiúsculas.\nc) Borrar espazos, poden ser varios espazos seguidos.\nd) Inverter a frase.\ne) Escriba a primeira letra de cada palabra en maiúscula (se é minúscula).\nf) Mostrar a frase\ng) Saia do programa");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Intriduce unha frase: ");
                    frase = sc.nextLine();
                    break;
                case "b":
                    frase = frase.toUpperCase();
                    break;
                case "c":
                    frase = frase.replace(" ", "");
                    break;
                case "d":
                    StringBuilder stringBuilder = new StringBuilder(frase);
                    String invertida = stringBuilder.reverse().toString();
                case "e":

            }
        }
    }
}

/**
 * Programa que conte o numero de palabras que aparecen nunha cadea de
 * caracteres. As palabras
 * poderán estar separadas por un espacio ou por varios
 */
public class AppString1_7 {

    public static void main(String[] args) {

        String cadena = "hola mundo";
        int cantidadDeEspacios = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ')
                cantidadDeEspacios++;
        }
        System.out.println("A cantidade de espacios é: " + cantidadDeEspacios);
    }
}

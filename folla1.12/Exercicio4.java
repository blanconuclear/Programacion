import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        String cadMaisLonga = "";

        while (true) {
            System.out.println("Dime unha cadea");
            String cadea = sc.nextLine();

            contador = contaCs(cadea);
            int contadorSimbolos = contaCaracteresNoAlfanumericos(cadea);
            if (contador >= 1) {
                System.out.println("A tua cadea ten este número de Cs: " + contador);

                // 1
                System.out.println("A cadea ten estos díxitos: " + cadea.length());

                // 2
                System.out.println("A cadea ten estos díxitos especiais: " + contadorSimbolos);

                // 3
                contarMayusculasMinusculas(cadea);

                if (cadea.length() > cadMaisLonga.length()) {
                    cadMaisLonga = cadea;
                }
            } else {
                System.out.println("Non tes cs");
                if (cadea.length() > cadMaisLonga.length()) {
                    cadMaisLonga = cadea;
                }
                break;
            }

        }
        System.out.println("A cadea máis longa é: " + cadMaisLonga);

    }

    public static int contaCs(String cadea) {
        int contador = 0;
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) == 'c') {
                contador++;
            }
        }
        return contador;
    }

    public static int contaCaracteresNoAlfanumericos(String cadea) {
        int contador = 0;
        for (int i = 0; i < cadea.length(); i++) {
            char caracter = cadea.charAt(i);

            // Verificar si el caracter no es una letra ni un número
            if (!Character.isLetterOrDigit(caracter)) {
                contador++;
            }
        }
        return contador;
    }

    public static void contarMayusculasMinusculas(String cadena) {
        int mayusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (Character.isUpperCase(caracter)) {
                minusculas++;
                System.out.println(Character.toLowerCase(caracter));
            } else if (Character.isLowerCase(caracter)) {
                mayusculas++;
                System.out.println(Character.toUpperCase(caracter));
            }
        }

        System.out.println("Número de mayúsculas: " + mayusculas);
        System.out.println("Número de minúsculas: " + minusculas);
    }
}

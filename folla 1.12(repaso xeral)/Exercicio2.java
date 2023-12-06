import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Dime o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Dime o terceiro número: ");
        double n3 = sc.nextDouble();
        System.out.println("Dime o cuarto número: ");
        double n4 = sc.nextDouble();

        double resultadoNumMaximo = numMaximo(n1, n2, n3, n4);
        double resultadoNumMinimo = numMinimo(n1, n2, n3, n4);
        double resultadoNumMedio = numMedio(n1, n2, n3, n4);

        System.out.println("El número mas alto es: " + resultadoNumMaximo);
        System.out.println("El número mas bajo es: " + resultadoNumMinimo);
        System.out.println(
                "La media de los números: " + n1 + " " + n2 + " " + n3 + " " + n4 + " es: " + resultadoNumMedio);
    }

    // Función número máximo
    public static double numMaximo(double n1, double n2, double n3, double n4) {
        double nMaximo = n1;

        if (n2 > nMaximo) {
            nMaximo = n2;
        }

        if (n3 > nMaximo) {
            nMaximo = n3;
        }

        if (n4 > nMaximo) {
            nMaximo = n4;
        }

        return nMaximo;

    }

    // FUnción número mínimo
    public static double numMinimo(double n1, double n2, double n3, double n4) {
        double nMinimo = n1;

        if (n2 < nMinimo) {
            nMinimo = n2;
        }

        if (n3 < nMinimo) {
            nMinimo = n3;
        }

        if (n4 < nMinimo) {
            nMinimo = n4;
        }

        return nMinimo;

    }

    // FUnción da media
    public static double numMedio(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
}

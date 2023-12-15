/*
 * Fai un programa que mostre o seguinte menú e faga o que se explica a
 * continuación ao pulsar esa
 * letra:
 * a) Introducir o número flotante.
 * b) Mostre a táboa de multiplicar ata 15 dese número. Emprega while.
 * c) Mostre a táboa de multiplicar ata 15 dese número, con 1 decimal.
 * d) Mostre a táboa de multiplicar ata 15 dese número, sen multiplicar polos
 * múltiplos de 3. (non
 * multiplicará por 3, 6, 9, 12 e 15). Emprega continue.
 * e) Mostre a táboa de multiplicar dese número por 0.5 ata 7.5, de 0.5 en 0.5
 * f) Sair
 * Podemos empregar printf (print format) para mostrar un double ou float cun
 * número de decimais.
 * No seguinte exemplo 7 será o ancho total do número, e 3 o número de decimais:
 * double numeroDouble = 1.23995888;
 * System.out.printf("%7.3f", numeroDouble); /* MOSTRARÁ 1,24
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        double n = 0;

        while (!salir) {
            System.out.println(
                    "a) Introducir un número flotante.\nb) Mostre a táboa de multiplicar ata 15 dese número.\nc) Mostre a táboa de multiplicar ata 15 dese número, con 1 decimal.\nd) Mostre a táboa de multiplicar ata 15 dese número, sen multiplicar polos.\ne) Mostre a táboa de multiplicar dese número por 0.5 ata 7.5, de 0.5 en 0.5.\nf)sair.");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            int multi = 1;
            double multiD = 0.5;

            switch (opcion) {
                case "a":
                    System.out.println("Introduce o número: ");
                    n = sc.nextDouble();
                    break;

                case "b":
                    while (multi <= 15) {
                        System.out.println(n * multi);
                        multi++;
                    }
                    break;
                case "c":
                    while (multi <= 15) {
                        System.out.printf("%7.3f", n * multi);
                        System.out.println("");
                        multi++;
                    }
                    break;
                case "d":
                    while (multi <= 15) {
                        if (multi % 3 != 0) {
                            System.out.println(n + " * " + multi + " = " + (n * multi));
                        }
                        multi++;
                    }
                    break;
                case "e":
                    while (multiD <= 7.5) {

                        System.out.println(n + " * " + multiD + " = " + (n * multiD));
                        multiD += 0.5;
                    }
                    break;
                case "f":
                    System.out.println("Ata logo");
                    salir = true;
            }
        }
        sc.close();
    }
}
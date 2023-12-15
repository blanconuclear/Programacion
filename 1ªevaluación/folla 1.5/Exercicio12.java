/*
 * Vai pedindo números de 4 cifras e redondéaos á centena máis próxima. 1234
 * dará 1200 e 1298 dará
 * 1300. Remata cando o usuario queira.
 */

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1234;
        System.out.println(Math.round(n * 100) / 100);
    }

}
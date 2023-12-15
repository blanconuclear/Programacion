
/*Na empresa ProgSys, creada no 2015, os programadores comezan gañando 1200 € netos ao mes,
tendo un aumento anual do seu soldo dun 5 %. Pregunta o ano no que entrou un traballador, e indica o
soldo neto anual  deste ano. (Un aumento anual do 5% do soldo quere dicir que o soldo do ano seguinte
vale soldoAnoPasado*1,05 ).*/

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En que ano entraches na empresa?: ");
        int ano = sc.nextInt();
        int soldo = 1200 * 12;
        int anosQueLeva = 2023 - ano;

        if (ano >= 2015 && ano <= 2023) {
            for (int i = 1; i <= anosQueLeva; i++) {
                soldo *= 1.05;
            }
        } else {
            System.out.println("O ano non é correcto...");
            return;
        }

        System.out.println("O soldo neto de este ano é: " + soldo);
    }
}
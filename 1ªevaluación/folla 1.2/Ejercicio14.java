/*
 * Un traballador tivo un aumento do 3% do seu soldo desde o ano 2002. Calcula
 * canto cobra
 * agora se no 2002 cobraba 1200 €.
 */

public class Ejercicio14 {

    public static void main(String[] args) {

        double sueldo = 1200;
        double aumento = 0.03;

        for (int i = 2002; i <= 2023; i++) {
            sueldo += sueldo * aumento;
            System.out.println("O solo é de: " + sueldo + " € no ano " + i);

        }

    }
}
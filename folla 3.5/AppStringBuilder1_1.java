
/**
 * Realiza un programa que vaia facendo o seguinte:
 * a) Crea un StringBuilder coa cadea “Bo día paseante”
 * b) Mostra a súa capacidade e a súa lonxitude (ten relación co tamaño da
 * cadea? )
 * c) Partindo da cadea anterior emprega os métodos de StringBuilder para
 * converter a cadea en “Bo día
 * aos 3000 paseantes”, e mostrar a cadea. O número 300 debe ser un int
 * almacenado anteriormente
 * nunha variable.
 * d) Partindo da cadea anterior emprega os métodos de StringBuilder para
 * converter a cadea en “Bo día
 * aos 3000 paseantes da zona vella”. Mostra a cadea.
 * e) Crea un String coas 10 últimas letras da cadea anterior e móstrao.
 */

/**
 * AppStringBuilder1_1
 */
public class AppStringBuilder1_1 {

    public static void main(String[] args) {

        /* A */
        StringBuilder cadea = new StringBuilder("Bo día paseante");
        int n = 3000;

        /* B */
        System.out.println(cadea.length());

        /* C */
        cadea.delete(7, cadea.length());
        System.out.println(cadea);
        cadea.append("os " + n + " pasantes");
        System.out.println(cadea);

        /* D */
        cadea.append(" da zona vella");

        /* E */
        String deProba = cadea.substring(cadea.length() - 10);
        System.out.println(deProba);
    }
}
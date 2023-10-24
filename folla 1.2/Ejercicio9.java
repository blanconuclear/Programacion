/*
 * Un kg de castañas valía no ano 2018 1.20 €/kg. Se o seu prezo subiu cada ano
 * un 10 %, mostra
 * o prezo que tivo cada ano ata o 2022.
 */

public class Ejercicio9 {

    public static void main(String[] args) {

        double precioCastañas = 1.20;
        double incrementoPrecio = 0.1;

        System.out.println("El precio es de " + precioCastañas + " en el año 2018");

        for (int i = 2019; i <= 2022; i++) {
            precioCastañas += precioCastañas * incrementoPrecio;

            System.out.println("El precio es de " + precioCastañas + " en el año " + i);
        }
    }
}
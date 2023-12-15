/*
 * Un comprador de material para unha empresa será preguntado polo material a
 * comprar de
 * cada:
 * paquetes de folios a 3.00 €, 
 * caixas de bolígrafos a 2.50 €,
 * grapadoras a 10.00 € 
 * tóner de impresora a 60.00 €. 
 * Finalmente, mostraremos o prezo a pagar, tendo
 * en conta que se
 * éste supera os 1000.00 € o prezo será rebaixado nun 17.5 %, e se o prezo
 * supera os 2000.00
 * € a rebaixa será do 30 %. Mostra a cantidade a pagar, e a rebaixa.
 */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidade de paquetes de folios: ");
        int folios = sc.nextInt();
        System.out.println("Cantidade de caixas de bolígrafos: ");
        int boligrafos = sc.nextInt();
        System.out.println("Cantidade de grapadoras: ");
        int grapadoras = sc.nextInt();
        System.out.println("Cantidade de toners de impresora:");
        int toners = sc.nextInt();

        double totalPrecio = folios * 3 + boligrafos * 2.5 + grapadoras * 10 + toners * 60;

        if ((totalPrecio > 1000.0) && (totalPrecio <= 2000.0)) {
            double rebaixa1 = totalPrecio / 0.175;
            System.out.println("A cantidade a pagar sería: " + totalPrecio
                    + " .O superar os 1000€. Aplícaseche unha rebaixa do 17,5%. O total sería: " + rebaixa1);
        } else if (totalPrecio > 2000.00) {
            double rebaixa2 = totalPrecio / 0.3;
            System.out.println("A cantidade a pagar sería: " + totalPrecio
                    + " .O superar os 2000€. Aplícaseche unha rebaixa do 30%. O total sería: " + rebaixa2);
        } else {
            System.out.println("O total a pagar sería: " + totalPrecio);
        }
    }
}

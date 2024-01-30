package exercicio1;

import java.util.Arrays;

public class AppFigura {
    public static void main(String[] args) {

        Figura arrFigura[] = new Figura[9];

        arrFigura[0] = new Triangulo(5, 7, 2, "Vermello");
        arrFigura[1] = new Triangulo(8, 4, 1, "Verde");
        arrFigura[2] = new Triangulo(6, 9, 4, "Azul");

        // Crear 3 cuadrados
        arrFigura[3] = new Cadrado(4, 6, "Amarelo");
        arrFigura[4] = new Cadrado(6, 2, "Laranxa");
        arrFigura[5] = new Cadrado(3, 3, "Marrom");

        // Crear 3 círculos
        arrFigura[6] = new Circulo(2, 7, "Violeta");
        arrFigura[7] = new Circulo(5, 8, "Rosa");
        arrFigura[8] = new Circulo(3, 1, "Gris");

        for (Figura figura : arrFigura) {
            if (figura.getArea() > 4) {
                figura.setCor("negro");

            }
        }

        Arrays.sort(arrFigura);

        for (Figura figura : arrFigura) {
            System.out.println("Área: " + figura.getArea() + "\nCor: " + figura.getCor() + "\n ");
        }

    }
}

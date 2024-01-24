package exercicio3;

/**
 * AppVehiculo
 */
public class AppVehiculo {

    public static void main(String[] args) {

        Terrestre camion1 = new Terrestre(4, "militar", 80, 100);

        camion1.acelerar(20);
        camion1.frear(9);
        int camion1Rev = camion1.calculaRevolucionsMotor(5, 8);

        camion1.imprimir();
        System.out.println(camion1Rev + " revolucións");

        System.out.println("--------------------");

        Terrestre camion2 = new Terrestre(4, "civil", 87, 120);

        camion2.acelerar(25);
        camion2.frear(8);
        int camion2Rev = camion2.calculaRevolucionsMotor(10, 10);

        camion2.imprimir();
        System.out.println(camion2Rev + " revolucións");

        System.out.println("--------------------");

        Acuatico barca1 = new Acuatico("superficie", 20, 120, 150);

        barca1.acelerar(30);
        barca1.frear(10);
        int barca1Rev = barca1.calculaRevolucionsMotor(13, 13);

        barca1.imprimir();
        System.out.println(barca1Rev + " revolucións");

        Acuatico barca2 = new Acuatico("submarino", 30, 210, 250);

        barca2.acelerar(30);
        barca2.frear(15);
        int barca2Rev = barca2.calculaRevolucionsMotor(16, 16);

        barca2.imprimir();
        System.out.println(barca2Rev + " revolucións");

    }
}
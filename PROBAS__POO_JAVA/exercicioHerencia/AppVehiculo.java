package exercicioHerencia;

public class AppVehiculo {
    public static void main(String[] args) {
        Terrestre camion1 = new Terrestre(120, 6, "civil");
        Terrestre camion2 = new Terrestre(100, 8, "militar");
        Acuatico barca1 = new Acuatico(60, "superficie", 8);
        Acuatico barca2 = new Acuatico(50, "submarino", 4);

        // Probar los métodos
        camion1.acelerar(50);
        camion1.imprimir();

        camion2.frenar(20);
        camion2.imprimir();

        barca1.acelerar(40);
        barca1.recomendarVelocidade(70);
        barca1.imprimir();

        barca2.frenar(30);
        barca2.recomendarVelocidade(5);
    }
}

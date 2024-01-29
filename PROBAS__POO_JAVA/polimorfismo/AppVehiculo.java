package polimorfismo;

public class AppVehiculo {
    public static void main(String[] args) {

        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("1435ctr", "Ferrari", "A89");
        misVehiculos[1] = new Vehiculoturismo("2345tyh", "audi", "P14", 4);
        misVehiculos[2] = new VehiculoDeportivo("4567yiu", "Toyota", "JI7", 500);

        for (Vehiculo vehiculo : misVehiculos) {
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }
    }
}

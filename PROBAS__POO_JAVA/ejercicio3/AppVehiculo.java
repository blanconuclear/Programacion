package ejercicio3;

import java.util.Scanner;

public class AppVehiculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la cantidad de vehículos");
        int numeroVehiculos = sc.nextInt();

        // Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {
            System.out.println("Dime las caracteristicas del coche " + (i + 1) + ": ");
            System.out.println("Dime marca: ");
            String marca = sc.next();
            System.out.println("Dime el modelo: ");
            String modelo = sc.next();
            System.out.println("Dime el precio: ");
            float precio = sc.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);

        }

        for (Vehiculo vehiculo : coches) {
            vehiculo.mostrarDatos();
        }

        sc.close();

    }
}

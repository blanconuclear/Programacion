import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AppClub {

    private static final String ACTIVIDADES_FILE = "actividades.txt";
    private static final String SOCIOS_FILE = "socios.txt";

    private ArrayList<Actividad> actividades;
    private ArrayList<Miembro> socios;

    public AppClub() {
        actividades = new ArrayList<>();
        socios = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        cargarActividades();
        cargarSocios();
    }

    private void cargarActividades() {
        try (BufferedReader br = new BufferedReader(new FileReader(ACTIVIDADES_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                actividades.add(new Actividad(parts[0], parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3]), parts[4]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarSocios() {
        try (BufferedReader br = new BufferedReader(new FileReader(SOCIOS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                LocalDate fechaNacimiento = LocalDate.parse(parts[4]);
                ArrayList<String> actividadesRegistradas = new ArrayList<>();
                if (parts.length > 5 && !parts[5].isEmpty()) {
                    String[] actividadesArray = parts[5].split(",");
                    for (String actividad : actividadesArray) {
                        actividadesRegistradas.add(actividad);
                    }
                }
                socios.add(new Miembro(parts[0], Integer.parseInt(parts[1]), parts[2], parts[3], fechaNacimiento, actividadesRegistradas));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AppClub app = new AppClub();
        app.mostrarMenu();
    }

    private void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido al Centro Sociocultural");
            System.out.println("1. Mostrar todas las actividades");
            System.out.println("2. Agregar nueva actividad");
            System.out.println("3. Eliminar actividad");
            System.out.println("4. Mostrar todos los socios");
            System.out.println("5. Agregar nuevo socio");
            System.out.println("6. Eliminar socio");
            System.out.println("7. Buscar socio por apellido");
            System.out.println("8. Asignar actividad a socio");
            System.out.println("9. Desasignar actividad a socio");
            System.out.println("10. Mostrar actividades de un socio específico");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    mostrarTodasLasActividades();
                    break;
                case 2:
                    agregarNuevaActividad(scanner);
                    break;
                case 3:
                    eliminarActividad(scanner);
                    break;
                case 4:
                    mostrarTodosLosSocios();
                    break;
                case 5:
                    agregarNuevoSocio(scanner);
                    break;
                case 6:
                    eliminarSocio(scanner);
                    break;
                case 7:
                    buscarSocioPorApellido(scanner);
                    break;
                case 8:
                    asignarActividadASocio(scanner);
                    break;
                case 9:
                    desasignarActividadASocio(scanner);
                    break;
                case 10:
                    mostrarActividadesDeSocio(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número válido.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }

    private void mostrarTodasLasActividades() {
        for (Actividad actividad : actividades) {
            System.out.println(actividad);
        }
    }

    private void agregarNuevaActividad(Scanner scanner) {
        System.out.print("Ingrese el código de la actividad: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese el nombre de la actividad: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese las horas semanales: ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.print("Ingrese la sala de actividad (Castelao/Dalí): ");
        String sala = scanner.nextLine();

        Actividad nuevaActividad = new Actividad(codigo, nombre, horas, precio, sala);
        if (nuevaActividad.validarDatos()) {
            actividades.add(nuevaActividad);
            guardarActividades();
            System.out.println("Actividad agregada correctamente.");
        } else {
            System.out.println("Los datos ingresados no son válidos. Inténtelo nuevamente.");
        }
    }

    private void guardarActividades() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ACTIVIDADES_FILE))) {
            for (Actividad actividad : actividades) {
                bw.write(actividad.toStringToFile());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void eliminarActividad(Scanner scanner) {
        System.out.print("Ingrese el código de la actividad a eliminar: ");
        String codigo = scanner.nextLine();
        actividades.removeIf(actividad -> actividad.getCodigoActividad().equals(codigo));
        guardarActividades();
        System.out.println("Actividad eliminada correctamente.");
    }

    private void mostrarTodosLosSocios() {
        for (Miembro socio : socios) {
            System.out.println(socio);
        }
    }

    private void agregarNuevoSocio(Scanner scanner) {
        // Implementar lógica para agregar nuevo socio
    }

    private void eliminarSocio(Scanner scanner) {
        // Implementar lógica para eliminar socio
    }

    private void buscarSocioPorApellido(Scanner scanner) {
        // Implementar lógica para buscar socio por apellido
    }

    private void asignarActividadASocio(Scanner scanner) {
        // Implementar lógica para asignar actividad a socio
    }

    private void desasignarActividadASocio(Scanner scanner) {
        // Implementar lógica para desasignar actividad a socio
    }

    private void mostrarActividadesDeSocio(Scanner scanner) {
        // Implementar lógica para mostrar actividades de un socio específico
    }
}

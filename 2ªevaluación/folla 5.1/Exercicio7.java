
// Importaciones de clases necesarias
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Clase principal del programa
public class Exercicio7 {
    // Método principal, punto de entrada del programa
    public static void main(String[] args) {

        // Nombre de la carpeta que se va a crear
        String nombreCarpetaCopia = "ficheirostemporaisCopia";

        // Se obtiene un objeto Path que representa la ruta de la carpeta a crear
        Path rutaCopia = Paths.get(nombreCarpetaCopia);

        try {
            // Se intenta crear la carpeta
            Files.createDirectories(rutaCopia);
        } catch (Exception e) { // Captura de excepciones en caso de error
            // Se imprime el mensaje de la excepción
            System.out.println(e);
        }

    }
}


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppClube {

    private static int ultimoCodigoActividade = 0;
    private static int ultimoCodigoSocio = 0;

    public static void main(String[] args) {

        ArrayList<Actividade> actividades = new ArrayList<>();
        ArrayList<Socio> socios = new ArrayList<>();

        String menu = """
                Benvidos ao Centro Cultura

                 a) Mostrar todas as asctividades.
                 b) Engadir actividade.
                 c) Borrar actividade.
                 d) Mostrar todos os socios.
                 e) Engadir socio.
                 f) Borar socio.
                 g) Buscar socio polo apelido.
                 h) Asignar acitivade a socio.
                 i) Designar acitividade.
                 j) Mostrar as actividades dun socio concreto.
                 i) Sair.

                 """;

        String resposta = JOptionPane.showInputDialog(menu);

        while (!resposta.equals("i")) {

            switch (resposta) {
                case "a":
                    mostrarActividade(actividades);
                    break;
                case "b":
                    engadirActividade(actividades);
                    try {
                        gardarActividadesEnFicheiro(actividades);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "c":
                    eliminarActividade(actividades);
                    break;
                case "d":
                    mostrarSocio(socios);
                    break;
                case "e":
                    engadirSocio(socios);
                    gardarSociosEnFicheiro(socios);
                    break;
                case "f":
                    eliminarSocio(socios);
                    break;
                case "g":
                    buscarSocioApelido(socios);
                    break;
                case "h":
                    // asignarActividadeAsocio(socios);
                    break;
                case "i":
                    // designarActividade(socios);
                    break;
                case "j":
                    // mostrarActividadeConcreta(socios);
                    break;
                default:
                    break;
            }

            resposta = JOptionPane.showInputDialog(menu);
        }

    }

    // Engadir actividade
    public static void engadirActividade(ArrayList<Actividade> actividades) {
        try {
            String nomeActividade = JOptionPane.showInputDialog("Introduce o nome da actividade: ");
            int horasSemanales = Integer
                    .parseInt(JOptionPane.showInputDialog("Introduce as horas semanais da actividade: "));
            int precioActividade = Integer.parseInt(JOptionPane.showInputDialog("Introduce o prezo da actividade: "));
            String roomActividade = JOptionPane.showInputDialog("Introduce a sala da actividade (Castelao ou Dalí): ")
                    .toLowerCase();

            ultimoCodigoActividade++;
            Actividade novaActividade = new Actividade(ultimoCodigoActividade, nomeActividade, horasSemanales,
                    precioActividade, roomActividade);

            actividades.add(novaActividade);
            JOptionPane.showMessageDialog(null, "Actividade engadida correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro: Por favor, introduce un número válido para as horas semanales ou prezo da actividade.");
        } catch (ExcepcionsSociedade e) {
            JOptionPane.showMessageDialog(null, "Erro de validación: " + e.getMessage());
        }
    }

    // Mostrar actividade
    public static void mostrarActividade(ArrayList<Actividade> actividades) {
        for (Actividade actividade : actividades) {
            System.out.println(actividade.toString());
        }
    }

    // Eliminar actividade
    public static void eliminarActividade(ArrayList<Actividade> actividades) {
        int codigoBorrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese o código que quere borrar: "));

        for (int i = 0; i < actividades.size(); i++) {
            if (codigoBorrar == actividades.get(i).getCodActividade()) {
                actividades.remove(i);
                JOptionPane.showMessageDialog(null, "Actividad eliminada correctamente.");
                return;
            }
        }
    }

    // Engadir Socio
    public static void engadirSocio(ArrayList<Socio> socios) {
        String nome = JOptionPane.showInputDialog("Introduce o nome do socio: ");
        String apelido = JOptionPane.showInputDialog("Introduce o apelido do socio: ");
        String email = JOptionPane.showInputDialog("Introduce o email do socio: ");
        Date dataNacemento = Date
                .valueOf(JOptionPane.showInputDialog("Introduce a data de nacemento do socio (FORMATO AAAA-MM-DD): "));
        Socio socio = new Socio(ultimoCodigoSocio, nome, apelido, email, dataNacemento);
        socios.add(socio);
    }

    // Mostrar socios
    public static void mostrarSocio(ArrayList<Socio> socio) {
        for (Socio socios : socio) {
            System.out.println(socios.toString());
        }
    }

    // Eliminar socio
    public static void eliminarSocio(ArrayList<Socio> socios) {
        int codigoBorrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese o código que quere borrar: "));
        for (int i = 0; i < socios.size(); i++) {
            if (codigoBorrar == socios.get(i).getCodSocio()) {
                socios.remove(i);
                JOptionPane.showMessageDialog(null, "Socio eliminado correctamente.");
                return;
            }
        }
    }

    // Buscar por apelido
    public static void buscarSocioApelido(ArrayList<Socio> socios) {
        String apelidoSocio = JOptionPane.showInputDialog("Ingrese o apelido polo que quere buscar: ");
        String almacenarDatos = "";
        boolean bandera = false;

        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getApelido().equals(apelidoSocio)) {
                almacenarDatos = socios.get(i).toString();
                bandera = true;
                break;
            }
        }
        if (bandera == false) {

            JOptionPane.showMessageDialog(null, "Ese apelido non existe");
        } else {
            JOptionPane.showMessageDialog(null, almacenarDatos);
        }
    }

    // Crear e escribir archivos ACTIVIDADES
    public static void gardarActividadesEnFicheiro(ArrayList<Actividade> actividades) throws IOException {
        File archivo = new File("actividades.txt");
        FileWriter escritor = new FileWriter(archivo);
        archivo.createNewFile();
        BufferedWriter print = new BufferedWriter(escritor);
        for (Actividade actividade : actividades) {
            print.write(actividade.toStringToFile());
        }
        print.close();
    }

    // Crear e escribir archivo SOCIO

    public static void gardarSociosEnFicheiro(ArrayList<Socio> socios) {
        Path archivo = Paths.get("socios.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(archivo)) {
            for (Socio socio : socios) {
                writer.write(socio.toStringParaFichero());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Socio gardado correctamente no ficheiro.", "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error o gardar o socio no ficheiro: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}

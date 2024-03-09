
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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

        // Cargar Datos
        cargarDatosActividades(actividades);
        // cargarDatosSocios(socios);

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
                    try {
                        gardarSociosEnFicheiro(socios);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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
                    // mostrarActividadeSocioConcreto(actividades);
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

        try {
            ultimoCodigoSocio++;
            Socio socio = new Socio(ultimoCodigoSocio, nome, apelido, email, dataNacemento);
            socios.add(socio);
        } catch (ExcepcionsSociedade e) {
            e.printStackTrace();
        }
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
        boolean comprobante = false;

        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getApelido().equals(apelidoSocio)) {
                almacenarDatos = socios.get(i).toString();
                comprobante = true;
                break;
            }
        }
        if (comprobante == false) {

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

    public static void gardarSociosEnFicheiro(ArrayList<Socio> socios) throws IOException {
        Path archivo = Paths.get("socios.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(archivo)) {
            for (Socio socio : socios) {

                String linea = String.format("%d;%s;%s;%s;%s",
                        socio.getCodSocio(), socio.getNome().toLowerCase(), socio.getApelido().toLowerCase(),
                        socio.getEmail().toLowerCase(), socio.getDataNacemento().toString());
                writer.write(linea);
                writer.newLine();
            }
        }
    }

    // Cargar ficheiro actividades
    public static void cargarDatosActividades(ArrayList<Actividade> actividades) {
        File archivo = new File("actividades.txt");
        if (!archivo.exists()) {
            System.out.println("");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                int codActividade = Integer.parseInt(datos[0]);
                String nomeActividade = datos[1];
                int horasSemanais = Integer.parseInt(datos[2]);
                int precioActividade = Integer.parseInt(datos[3]);
                String salaActividade = datos[4];
                try {
                    actividades.add(
                            new Actividade(codActividade, nomeActividade, horasSemanais, precioActividade,
                                    salaActividade));
                } catch (ExcepcionsSociedade e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Datos dentro do ficheiro de actividades:");
            for (Actividade actividade : actividades) {
                System.out.println(actividade.toString());
            }
        } catch (IOException e) {
            System.out.println("Error o cargar as actividades do ficheiro: " + e.getMessage());
        }
    }

}

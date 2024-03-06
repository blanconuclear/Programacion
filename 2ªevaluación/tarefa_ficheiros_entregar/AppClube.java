
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
                    break;
                case "c":
                    eliminarActividade(actividades);
                    break;
                case "d":
                    try {
                        gardarActividadesEnFicheiro(actividades);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "e":
                    engadirSocio(socios);
                    break;
                default:
                    break;
            }

            resposta = JOptionPane.showInputDialog(menu);
        }

    }

    // Engadir actividade
    private static void engadirActividade(ArrayList<Actividade> actividades) {

        String nomeActividade = JOptionPane.showInputDialog("Introduce o nome da actividade: ");
        int horasSemanales = Integer
                .parseInt(JOptionPane.showInputDialog("Introduce as horas semanais da actividade: "));
        int precioActividade = Integer.parseInt(JOptionPane.showInputDialog("Introduce o prezo da actividade: "));
        String roomActividade = JOptionPane.showInputDialog("Introduce a sala da actividade (Castelao ou Dalí): ");

        ultimoCodigoActividade++;
        Actividade novaActividade = new Actividade(ultimoCodigoActividade, nomeActividade, horasSemanales,
                precioActividade,
                roomActividade);

        if (novaActividade.validarDatos()) {
            actividades.add(novaActividade);
            JOptionPane.showMessageDialog(null, "Actividade engadida correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Os datos ingresados non son válidos. Por favor, inténtao de novo.");
        }
    }

    // Mostrar actividade
    private static void mostrarActividade(ArrayList<Actividade> actividades) {
        for (Actividade actividade : actividades) {
            System.out.println(actividade.toString());
        }
    }

    // Eliminar actividade
    private static void eliminarActividade(ArrayList<Actividade> actividades) {
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
    private static void engadirSocio(ArrayList<Socio> socios) {
        String nome = JOptionPane.showInputDialog("Introduce o nome do socio: ");
        String apelido = JOptionPane.showInputDialog("Introduce o apelido do socio: ");
        String email = JOptionPane.showInputDialog("Introduce o email do socio: ");
        String dataNacemento = JOptionPane.showInputDialog("Introduce a data de nacemento do socio: ");

    }

    // Crear e escribir archivos
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

}

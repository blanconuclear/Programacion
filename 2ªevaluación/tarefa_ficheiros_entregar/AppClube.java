import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppClube {

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
                default:
                    break;
            }

            resposta = JOptionPane.showInputDialog(menu);
        }

    }

    private static void engadirActividade(ArrayList<Actividade> actividades) {
        int codActividade = Integer.parseInt(JOptionPane.showInputDialog("Introduce o código da actividade: "));
        String nomeActividade = JOptionPane.showInputDialog("Introduce o nome da actividade: ");
        int horasSemanales = Integer
                .parseInt(JOptionPane.showInputDialog("Introduce as horas semanais da actividade: "));
        int precioActividade = Integer.parseInt(JOptionPane.showInputDialog("Introduce o prezo da actividade: "));
        String roomActividade = JOptionPane.showInputDialog("Introduce a sala da actividade (Castelao ou Dalí): ");

        Actividade novaActividade = new Actividade(codActividade, nomeActividade, horasSemanales, precioActividade,
                roomActividade);

        if (novaActividade.validarDatos()) {
            actividades.add(novaActividade);
            gardarActividades(actividades);
            JOptionPane.showMessageDialog(null, "Actividade engadida correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Os datos ingresados non son válidos. Por favor, inténtao de novo.");
        }
    }

    }

    private static void mostrarActividade(ArrayList<Actividade> actividades) {
        for (Actividade actividade : actividades) {
            System.out.println(actividade.toString());

        }
    }
}
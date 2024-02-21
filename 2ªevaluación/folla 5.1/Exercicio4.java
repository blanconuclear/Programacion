import javax.swing.JOptionPane;
import java.io.File;

public class Exercicio4 {
    public static void main(String[] args) {
        String input = "";

        while (!input.equals("fin")) {
            input = JOptionPane
                    .showInputDialog("Introduce o nome do archivo ou directorio (ou escribe 'fin' para sair):");

            if (!input.equals("fin")) {
                File file = new File(input);

                if (file.exists()) {
                    if (file.isDirectory()) {
                        JOptionPane.showMessageDialog(null, "A entrada '" + input + "' é un directorio.");
                    } else {
                        JOptionPane.showMessageDialog(null, "A entrada '" + input + "' é un archivo.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "A entrada '" + input + "' non existe.");
                }
            }
        }
    }
}

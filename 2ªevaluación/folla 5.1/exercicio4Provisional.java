import javax.swing.JOptionPane;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String input = "";
        
        while (!input.equals("fin")) {
            input = JOptionPane.showInputDialog("Introduce el nombre del archivo o directorio (o escribe 'fin' para salir):");
            
            if (!input.equals("fin")) {
                File file = new File(input);
                
                if (file.exists()) {
                    if (file.isDirectory()) {
                        JOptionPane.showMessageDialog(null, "La entrada '" + input + "' es un directorio.");
                    } else {
                        JOptionPane.showMessageDialog(null, "La entrada '" + input + "' es un archivo.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La entrada '" + input + "' no existe.");
                }
            }
        }
    }
}


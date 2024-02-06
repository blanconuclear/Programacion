import javax.swing.JOptionPane;

public class Exercicio2B {
    public static void main(String[] args) {
        int numero = 0;

        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Por favor, introduza un número enteiro:");
                if (input == null)
                    System.exit(0);

                numero = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduza un número enteiro válido.");
            }
        }

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O factorial de " + numero + " é: " + factorial);
    }
}

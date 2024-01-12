/* Emprega a clase JOptionPane para ir pedindo unha letra por teclado (se son varias, o programa collerá
a primeira). Despois emprega os métodos da clase Character para formar unha cadea de texto que
indique se o carácter é ou non unha letra, se está en minúsculas ou maiúsculas, e se é ou non un
número. */

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Digite uma letra:");
        String cadea;
        char let = input.charAt(0);

        if (Character.isDigit(let)) {
            cadea = " é un díxito";
        }

    }
}

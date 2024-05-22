package exercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Calculadora
 */
public class Calculadora extends JFrame {
    JPanel panel = new JPanel();
    JTextField textValor1 = new JTextField("valor1");
    JTextField textValor2 = new JTextField("valor2");

    JButton btnSumar = new JButton("Sumar");
    JButton btnRestar = new JButton("Restar");

    JLabel etiqueta = new JLabel("O resultado é: ");

    JMenuBar barraMenu = new JMenuBar();
    JMenu menu = new JMenu("operacions");
    JMenuItem submenuSumar = new JMenuItem("sumar");
    JMenuItem submenuRestar = new JMenuItem("restar");

    public Calculadora() {
        setSize(500, 500);
        getContentPane().add(panel);
        // panel.setLayout(null); // Use null layout for absolute positioning

        panel.add(textValor1);
        panel.add(textValor2);
        panel.add(btnRestar);
        panel.add(btnSumar);
        panel.add(etiqueta);

        setJMenuBar(barraMenu);
        barraMenu.add(menu);
        menu.add(submenuRestar);
        menu.add(submenuSumar);

        btnRestar.addActionListener(new Operacions());
        btnSumar.addActionListener(new Operacions());
        submenuRestar.addActionListener(new Operacions());
        submenuSumar.addActionListener(new Operacions());

    }

    private class Operacions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int valor1 = Integer.parseInt(textValor1.getText());
            int valor2 = Integer.parseInt(textValor1.getText());

            int resultado = 0;
            if (e.getSource() == btnRestar || e.getSource() == submenuSumar) {
                resultado = valor1 - valor2;
                etiqueta.setText("o resultado é:" + resultado);
            } else if (e.getSource() == btnSumar || e.getSource() == submenuRestar) {
                resultado = valor1 + valor2;
                etiqueta.setText("o resultado é:" + resultado);
            }

        }

    }

    public static void main(String[] args) {
        Calculadora panel = new Calculadora();
        panel.setVisible(true);
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
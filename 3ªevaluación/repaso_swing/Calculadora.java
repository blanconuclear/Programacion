import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
    JPanel panel = new JPanel();
    JTextField textValor1 = new JTextField("valor1");
    JTextField textValor2 = new JTextField("valor2");
    JButton btnSumar = new JButton("Sumar");
    JButton btnRestar = new JButton("Restar");
    JLabel etiqueta = new JLabel("O resultado é: ");

    JMenuBar barraMenu = new JMenuBar();
    JMenu menu = new JMenu("operaciones");
    JMenuItem submenuRestar = new JMenuItem("restar");
    JMenuItem submenuSumar = new JMenuItem("sumar");
    JMenuItem submenuSair = new JMenuItem("Sair");

    public Calculadora() {
        setSize(500, 500);
        getContentPane().add(panel);
        panel.setBackground(Color.BLUE);
        // panel.setLayout(null);

        setJMenuBar(barraMenu);
        barraMenu.add(menu);
        menu.add(submenuRestar);
        menu.add(submenuSumar);

        panel.add(textValor1);
        panel.add(textValor2);
        panel.add(btnSumar);
        panel.add(btnRestar);
        panel.add(etiqueta);

        panel.addMouseListener(new EntrarRato());
        btnRestar.addActionListener(new Calcular());
        submenuRestar.addActionListener(new CalcularMenu());

    }

    private class EntrarRato extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            panel.setBackground(Color.red);
        }
    }

    private class Calcular implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Double n1 = Double.parseDouble(textValor1.getText());
            Double n2 = Double.parseDouble(textValor2.getText());
            Double resultado = 0.0;

            if (e.getSource() == btnRestar) {
                resultado = n1 - n2;
                etiqueta.setText("O resultado é: " + resultado);
            }

        }

    }

    private class CalcularMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Double n1 = Double.parseDouble(textValor1.getText());
            Double n2 = Double.parseDouble(textValor2.getText());
            Double resultado = 0.0;
            if (e.getSource() == submenuRestar) {
                resultado = n1 - n2;
                etiqueta.setText("O resultado é: " + resultado);
            }

        }

    }

    public static void main(String[] args) {
        Calculadora panel = new Calculadora();
        panel.setVisible(true);
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}

package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {
    JPanel panel = new JPanel();
    JButton bntCorlor = new JButton("cambiar color");
    JButton btnSumar = new JButton("sumar");
    JButton bntRestar = new JButton("restar");
    JTextField textoValor1 = new JTextField("valor1");
    JTextField textoValor2 = new JTextField("valor2");
    JLabel etiqueta = new JLabel("o resultado é: ");

    JMenuBar barraMenu = new JMenuBar();
    JMenu menu = new JMenu("Opcions");
    JMenuItem submenuSair = new JMenuItem("sair");

    public Main() {
        setSize(700, 700);
        getContentPane().add(panel);
        panel.add(bntCorlor);
        setJMenuBar(barraMenu);
        barraMenu.add(menu);
        menu.add(submenuSair);

        panel.add(bntRestar);
        panel.add(btnSumar);
        panel.add(textoValor1);
        panel.add(textoValor2);
        panel.add(etiqueta);

        bntCorlor.addActionListener(new CambiarColor());
        btnSumar.addActionListener(new Calcular());
        submenuSair.addActionListener(new Sair());
        addMouseListener(new MouseColor());

    }

    private class Calcular implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Double n1 = Double.parseDouble(textoValor1.getText());
            Double n2 = Double.parseDouble(textoValor1.getText());
            Double resultado = 0.0;

            if (e.getSource() == btnSumar) {
                resultado = n1 + n2;
                etiqueta.setText("O resutaldo é: " + resultado);
            }

        }

    }

    private class CambiarColor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bntCorlor) {
                panel.setBackground(Color.red);
            }

        }

    }

    private class Sair implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submenuSair) {
                System.exit(0);
            }

        }

    }

    private class MouseColor implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            panel.setBackground(Color.green);
        }

    }

    public static void main(String[] args) {
        Main panel = new Main();
        panel.setVisible(true);
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UnBoton extends JFrame {
    JButton boton = new JButton("Preme");
    JPanel panel = new JPanel();
    JLabel etiqueta = new JLabel("Hola Hola");

    public UnBoton() {
        setSize(500, 500);

        getContentPane().add(panel);

        boton.setBounds(100, 100, 200, 70);
        panel.add(boton);

        etiqueta.setBounds(200, 200, 100, 100);
        panel.add(etiqueta);

        boton.addActionListener(new BotonListener());

        panel.addMouseListener(new RatolistenerDentro());
        panel.addKeyListener(new PremeTecla());

    }

    public static void main(String[] args) {
        UnBoton panel = new UnBoton();
        panel.setVisible(true);
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class BotonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton) {
                panel.setBackground(Color.red);
                etiqueta.setText("adios adios");
            }
        }
    }

    private class RatolistenerDentro extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            panel.setBackground(Color.BLUE);
        }

    }

    private class PremeTecla extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyChar() == '1 ') { // Comprueba si la tecla presionada es 'a'
                panel.setSize(700, 700);
            }
        }

    }

}

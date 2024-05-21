import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumeroAleatorio extends JFrame {
    JPanel panel = new JPanel();
    JButton boton = new JButton("Preme para número");
    JLabel etiqueta = new JLabel("0");

    public NumeroAleatorio() {
        setSize(500, 500);
        getContentPane().add(panel);

        panel.add(boton);
        panel.add(etiqueta);

        boton.addActionListener(new numeroRandom());
    }

    public static void main(String[] args) {
        NumeroAleatorio panel = new NumeroAleatorio();
        panel.setVisible(true);
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public class numeroRandom implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton) {
                int nRandom = (int) (Math.random() * 100 + 0);
                etiqueta.setText("o numero random é: " + nRandom);
            }

        }

    }

}

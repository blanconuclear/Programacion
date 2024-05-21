import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotonMedra extends JFrame {
    JPanel panel = new JPanel();
    JButton boton1 = new JButton("medra");
    JButton boton2 = new JButton("reduce");
    int aumentarTamaño = 50;
    int width = 300;
    int height = 300;

    public BotonMedra() {
        setSize(width, height);
        getContentPane().add(panel);

        // botones
        boton1.setBounds(100, 100, 100, 100);
        boton1.setBounds(200, 200, 100, 100);

        // añadir botons panel
        panel.add(boton1);
        panel.add(boton2);

        boton1.addActionListener(new BotonListener());
        boton2.addActionListener(new BotonListener());

    }

    public static void main(String[] args) {
        BotonMedra panel = new BotonMedra();
        panel.setVisible(true);
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public class BotonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                setSize(width += aumentarTamaño, height += aumentarTamaño);
            } else if (e.getSource() == boton2) {
                setSize(width -= aumentarTamaño, height -= aumentarTamaño);
            }
        }

    }
}

/* Fai un programa con unha ventá na que se mostran 2 botóns, un que poña “Pechar” e outro “Minimízame”. 
Cando se pulse “Pechar” a ventá debe pecharse. 
Cando “Minimízame” debe minimizarse. 
(Mira a axuda do método setExtendedState() de JFrame, herdado de Frame) */

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio2 extends JFrame {
    JPanel panel = new JPanel();
    JButton boton1 = new JButton("pechar");
    JButton boton2 = new JButton("minimizar");
    int aumentarTamaño = 50;
    int width = 300;
    int height = 300;

    public Exercicio2() {
        setSize(width, height);
        getContentPane().add(panel);

        // botones
        boton1.setBounds(100, 100, 100, 100);
        boton1.setBounds(200, 200, 100, 100);

        // añadir botons panel
        panel.add(boton1);
        panel.add(boton2);

        boton1.addActionListener(new modificarVentana());
        boton2.addActionListener(new modificarVentana());

    }

    public class modificarVentana implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                setExtendedState(Frame.MAXIMIZED_BOTH);
            } else if (e.getSource() == boton2) {
                System.exit(0);
            }

        }

    }

    public static void main(String[] args) {
        Exercicio2 panel = new Exercicio2();
        panel.setVisible(true);
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
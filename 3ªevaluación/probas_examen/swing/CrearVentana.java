import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * CrearVentana
 */
public class CrearVentana extends JFrame {

    public CrearVentana() {
        // Frame
        setSize(500, 500);
        // Crear Panel
        JPanel panel = new JPanel();
        // Añadir panel o frame
        getContentPane().add(panel);
        panel.setBackground(Color.red);

        // Crear etiqueta
        JLabel etiqueta = new JLabel("Hola mundo");
        panel.add(etiqueta);

        //Crear boton
        JButton boton = new JButton("Hola boton");
        panel.add(boton);
    }

    public static void main(String[] args) {
        CrearVentana v1 = new CrearVentana();
        v1.setVisible(true);
        v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        v1.setTitle("título");
    }
}
package exercicio3;

/*
 * Programa que xera números enteiros aleatorios entre 0 e 100. Para xerar un
 * número aleatorio podes empregar o método java.lang.Math.random( ), que
 * devolve un double entre 0.0 e 1.0. Pon un botón que ao ser premido produza o
 * número aleatorio que se debe mostrar nunha etiqueta. Terás que empregar na
 * etiqueta o método setText(oStringQueSexa).
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class BotonEtiqueta extends JFrame {

    // DEFINIMOS E RESERVAMOS MEMORIA PARA:
    JButton oboton = new JButton("Preme"); // UN BOTON
    JLabel aetiqueta = new JLabel(""); // UNHA ETIQUETA
    JPanel opanel = new JPanel(); // UN PANEL. OBRIGATORIO!!

    /** CONSTRUCTOR */
    public BotonEtiqueta() {
        defineCaracteristicasObxectos();
        colocaObxectos();
        addEscoitadoresObxectos();
    }

    public static void main(String[] args) {
        BotonEtiqueta oframe = new BotonEtiqueta();
        oframe.setSize(250, 200);
        oframe.setVisible(true);
        oframe.setTitle("Botón e Etiqueta!");

    }

    public void defineCaracteristicasObxectos() {
        oboton.setBounds(50, 40, 150, 40); // pos X, pos Y, ANCHO E ALTO.
        aetiqueta.setBounds(50, 100, 150, 40);
        opanel.setLayout(null); // NECESARIO PARA QUE OS OBXECTOS NON SE MOVAN CANDO OS COLOQUEMOS
    }

    public void colocaObxectos() {
        opanel.add(oboton);
        opanel.add(aetiqueta);
        // FACEMOS QUE O PANEL DO FRAME SEXA O PANEL QUE DEFINIMOS NOS.
        getContentPane().add(opanel);
    }

    /* LIGAMOS OS OBXECTOS COAS SUAS CLASES LISTENERS: */
    public void addEscoitadoresObxectos() {
        addWindowListener(new VentaListener());
        oboton.addActionListener(new BotonListener());
    }

    // DEFINIMOS AS CLASES LISTENERS:
    private class VentaListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    private class BotonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int nRamdon = (int) (Math.random() * 100 + 0);
            aetiqueta.setText("Número ramdon: " + nRamdon);
        }
    }
}
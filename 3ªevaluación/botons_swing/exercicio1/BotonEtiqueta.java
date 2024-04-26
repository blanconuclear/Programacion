import javax.swing.*;
import java.awt.event.*;

public class BotonEtiqueta extends JFrame {
    int i = 0; // CONTADOR
    int width = 300;
    int height = 300;
    int aumentarTamaño = 50;
    // DEFINIMOS E RESERVAMOS MEMORIA PARA:
    JButton oboton = new JButton("Medra"); // UN BOTON
    JLabel aetiqueta = new JLabel(""); // UNHA ETIQUETA
    JPanel opanel = new JPanel(); // UN PANEL. OBRIGATORIO!!

    JButton oboton2 = new JButton("Reduce");
    JLabel aetiqueta2 = new JLabel(""); // UNHA ETIQUETA

    /** CONSTRUCTOR */
    public BotonEtiqueta() {
        defineCaracteristicasObxectos();
        colocaObxectos();
        addEscoitadoresObxectos();
    }

    public static void main(String[] args) {
        BotonEtiqueta oframe = new BotonEtiqueta();
        oframe.setSize(oframe.width, oframe.height); // Ajusté el tamaño para que quepan los dos paneles
        oframe.setVisible(true);
        oframe.setTitle("Botón e Etiqueta!");
    }

    public void defineCaracteristicasObxectos() {
        oboton.setBounds(50, 40, 150, 40); // pos X, pos Y, ANCHO E ALTO.
        aetiqueta.setBounds(50, 150, 150, 40);
        opanel.setLayout(null); // NECESARIO PARA QUE OS OBXECTOS NON SE MOVAN CANDO OS COLOQUEMOS

        oboton2.setBounds(50, 100, 150, 40); // pos X, pos Y, ANCHO E ALTO.

    }

    public void colocaObxectos() {
        opanel.add(oboton);
        opanel.add(aetiqueta);
        opanel.add(oboton2);
        opanel.add(aetiqueta2);

        getContentPane().add(opanel);
    }

    public void addEscoitadoresObxectos() {
        addWindowListener(new VentaListener());
        oboton.addActionListener(new BotonListener());
        oboton2.addActionListener(new BotonListener());
    }

    // DEFINIMOS AS CLASES LISTENERS:
    private class VentaListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    private class BotonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aetiqueta.setText("Pulsado " + i + " veces");
            i++;

            if (e.getSource() == oboton) {
                setSize(width += aumentarTamaño, height += aumentarTamaño);
            } else if (e.getSource() == oboton2) {
                setSize(width -= aumentarTamaño, height -= aumentarTamaño);

            }

        }

    }
}
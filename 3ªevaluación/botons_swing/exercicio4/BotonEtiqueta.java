package exercicio4;
/*
 * 
 * Programa que pregunte cál é a suma de dous números menores que 4, xerados
 * aleatoriamente. O usuario deberá dar a resposta pulsando botóns con números
 * do 0 ao 6. O que pulsa o usuario deberase ver nunha etiqueta. O programa
 * deberá mostrar noutra etiqueta se o resultado é correcto ou incorrecto.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class BotonEtiqueta extends JFrame {
    int i = 0; // CONTADOR

    int nRamdon1 = (int) (Math.random() * 3 + 0);
    int nRamdon2 = (int) (Math.random() * 3 + 0);

    int suma = (char) 0;

    // DEFINIMOS E RESERVAMOS MEMORIA PARA:
    JButton oboton0 = new JButton("0");
    JButton oboton1 = new JButton("1");
    JButton oboton2 = new JButton("2");
    JButton oboton3 = new JButton("3");
    JButton oboton4 = new JButton("4");
    JButton oboton5 = new JButton("5");
    JButton oboton6 = new JButton("6");

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
        oframe.setSize(600, 600);
        oframe.setVisible(true);
        oframe.setTitle("Botón e Etiqueta!");
    }

    public void defineCaracteristicasObxectos() {
        oboton0.setBounds(70, 10, 50, 50);
        oboton1.setBounds(50, 40, 50, 50);
        oboton2.setBounds(50, 90, 50, 50);
        oboton3.setBounds(50, 150, 50, 50);
        oboton4.setBounds(50, 200, 50, 50);
        oboton5.setBounds(50, 250, 50, 50);
        oboton6.setBounds(50, 350, 50, 50);

        aetiqueta.setBounds(200, 400, 150, 40);
        opanel.setLayout(null); // NECESARIO PARA QUE OS OBXECTOS NON SE MOVAN CANDO OS COLOQUEMOS
    }

    public void colocaObxectos() {
        opanel.add(oboton0);
        opanel.add(oboton1);
        opanel.add(oboton2);
        opanel.add(oboton3);
        opanel.add(oboton4);
        opanel.add(oboton5);
        opanel.add(oboton6);
        opanel.add(aetiqueta);
        // FACEMOS QUE O PANEL DO FRAME SEXA O PANEL QUE DEFINIMOS NOS.
        getContentPane().add(opanel);

        aetiqueta.setText(nRamdon1 + " + " + nRamdon2 + " é igual a?: ");
    }

    /* LIGAMOS OS OBXECTOS COAS SUAS CLASES LISTENERS: */
    public void addEscoitadoresObxectos() {
        addWindowListener(new VentaListener());
        oboton1.addActionListener(new BotonListener());
    }

    // DEFINIMOS AS CLASES LISTENERS:
    private class VentaListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    private class BotonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (oboton0.equals(suma)) {
                System.out.println("correcto");
            }
        }
    }
}
/*
 * Fai un programa que faga unha calculadora de 2 valores introducidos cada un
 * na súa caixa de
 * texto (JTextField). A calculadora debe ter unha etiqueta na que se amose o
 * resultado, e 4
 * botóns “Sumar”, “Restar”, “Multiplicar” e “Dividir”. Cada botón fará o que o
 * seu nome indica
 * amosando o resultado na etiqueta Resultado. Engade un menú “Opcións” que teña
 * os
 * seguintes submenús: “Sumar”, “Restar”, “Multiplicar”, “Dividir” e ”Limpar
 * entradas”, que fagan
 * o que o seu nome indica.
 */

package exercicio2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.event.*;

public class BotonEtiqueta extends JFrame {
    int i = 0; // CONTADOR
    int width = 400;
    int height = 400;
    int aumentarTamaño = 100;
    // DEFINIMOS E RESERVAMOS MEMORIA PARA:
    JButton oboton = new JButton("+"); // UN BOTON
    JLabel aetiqueta = new JLabel(""); // UNHA ETIQUETA
    JPanel opanel = new JPanel(); // UN PANEL. OBRIGATORIO!!

    JButton oboton2 = new JButton("-");
    JLabel aetiqueta2 = new JLabel(""); // UNHA ETIQUETA

    JMenuBar barraMenus = new JMenuBar();
    JMenu menu1 = new JMenu("Opcións"); // Cambié el nombre del menú principal
    JMenuItem submenuBloqueada = new JMenuItem("Bloqueada");
    JMenuItem submenuDesbloqueada = new JMenuItem("Desbloqueada");

    /** CONSTRUCTOR */
    public BotonEtiqueta() {
        defineCaracteristicasObxectos();
        colocaObxectos();
        addEscoitadoresObxectos();

        menu1.add(submenuBloqueada);
        menu1.add(submenuDesbloqueada);
        barraMenus.add(menu1);
        setJMenuBar(barraMenus); // Aquí añades la barra de menú al JFrame
        setSize(300, 300);

        submenuBloqueada.addActionListener(new ActionEscoitadorMenu());
        submenuDesbloqueada.addActionListener(new ActionEscoitadorMenu());

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
            if (e.getSource() == oboton) {
                setTitle("Tamaño bloqueado");
                setSize(width += aumentarTamaño, height += aumentarTamaño);
            } else if (e.getSource() == oboton2) {
                setTitle("Tamaño desbloqueado");
                setSize(width -= aumentarTamaño, height -= aumentarTamaño);
            }
        }
    }

    private class ActionEscoitadorMenu implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == submenuBloqueada) {
                setTitle("Tamaño bloqueado");
                oboton.setEnabled(false);
                oboton2.setEnabled(false);
            } else if (event.getSource() == submenuDesbloqueada) {
                setTitle("Tamaño desbloqueado");
                oboton.setEnabled(true);
                oboton2.setEnabled(true);
            }
        }
    }

    public static void main(String[] args) {
        BotonEtiqueta oframe = new BotonEtiqueta();
        oframe.setSize(oframe.width, oframe.height);
        oframe.setVisible(true);
    }
}

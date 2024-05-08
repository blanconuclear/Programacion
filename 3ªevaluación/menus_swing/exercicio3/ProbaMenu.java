package exercicio3;

/*
 * Fai un programa semellante ao exercicio anterior, pero que ademáis teña un
 * botón que faga que a etiqueta cambie a cor do fondo da etiqueta entre azul,
 * verde, vermello e branco, sucesivamente: engade un menú Cor que teñan como
 * submenús Azul, Verde, Vermello e Branco que farán que cambie tamén a cor á
 * cor elixida. Para cambiar a cor de fondo dun compoñente poderías empregar o
 * método setBackground(new Color(100,100,255)); pasándolle os valores RGB (Red,
 * Green,Blue).
 */

//SIN ACABAR. FALTA BOTÓN

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class ProbaMenu extends JFrame {
    private JMenuBar barraMenus = new JMenuBar(); // O NOSO OBXECTO JMENUBAR
    private JMenu menu1 = new JMenu("Ficheiro"); // O NOSO MENU
    private JMenu menu2 = new JMenu("Tamaño");
    private JMenu menu3 = new JMenu("Cor");

    private JMenuItem submenuSair = new JMenuItem("Saír"); // O SUBMENU

    private JMenuItem submenuMinimizar = new JMenuItem("Minimizar");
    private JMenuItem submenuMaximizar = new JMenuItem("Maximizar");
    private JMenuItem submenuNormal = new JMenuItem("Normal");

    private JMenuItem submenuAzul = new JMenuItem("Azul");
    private JMenuItem submenuVerde = new JMenuItem("Verde");
    private JMenuItem submenuVermello = new JMenuItem("Vermello");
    private JMenuItem submenuBranco = new JMenuItem("Branco");

    public ProbaMenu() {
        /* ENGADIMOS O SUBMENU AO MENU, ESTE Á BARRA de MENÚS E A BARRA Á VENTÁ */

        menu1.add(submenuSair);

        menu2.add(submenuMinimizar);
        menu2.add(submenuMaximizar);
        menu2.add(submenuNormal);

        menu3.add(submenuAzul);
        menu3.add(submenuVerde);
        menu3.add(submenuVermello);
        menu3.add(submenuBranco);

        barraMenus.add(menu1);
        barraMenus.add(menu2);
        barraMenus.add(menu3);
        setJMenuBar(barraMenus);
        setSize(300, 300);
        /* E XESTIONAMOS O QUE FAI O MENU CUN LISTENER */
        submenuSair.addActionListener(new ActionEscoitadorMenu());
        submenuMaximizar.addActionListener(new MaximizarAction());
        submenuMinimizar.addActionListener(new MinimizarAction());
        submenuNormal.addActionListener(new NormalizarAction());

        submenuAzul.addActionListener(new CambiarColor());
        submenuVermello.addActionListener(new CambiarColor());
        submenuVerde.addActionListener(new CambiarColor());
        submenuBranco.addActionListener(new CambiarColor());

    }

    // DEFINIMOS A CLASE LISTENER DOS EVENTOS DE MENU
    private class ActionEscoitadorMenu implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

    private class MaximizarAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
    }

    private class MinimizarAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            setExtendedState(JFrame.ICONIFIED);
        }
    }

    private class NormalizarAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            setExtendedState(JFrame.NORMAL);
        }
    }

    private class CambiarColor implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == submenuAzul) {
                getContentPane().setBackground(new Color(0, 0, 255));
            } else if (event.getSource() == submenuVerde) {
                getContentPane().setBackground(new Color(0, 255, 0));
            } else if (event.getSource() == submenuVermello) {
                getContentPane().setBackground(new Color(255, 0, 0));
            } else {
                getContentPane().setBackground(new Color(255, 255, 255));
            }
        }
    }

}

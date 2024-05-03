package exercicio2;

/*
* Fai un programa con unha ventá con unha etiqueta na que se mostre o estado da
* ventá (maximizada, normal). Engade dous menús, un que se chame Ficheiro, con
* un submenú Saír como no exercicio anterior, e outro menú que se chame Tamaño,
* con submenús Minimizar, Maximizar, Normal. Os submenús deberán facer esas
* accións cando sexan seleccionados. (Podes empregar o método
* setExtendedState() de JFrame, herdado de Frame)
*/

import javax.swing.*;
import javax.swing.event.*;

import exercicio2.ProbaMenu.MaximizarJFrame;

import java.awt.event.*;
import java.awt.*;

public class ProbaMenu extends JFrame {
    private JMenuBar barraMenus = new JMenuBar(); // O NOSO OBXECTO JMENUBAR
    private JMenu menu1 = new JMenu("Ficheiro"); // O NOSO MENU
    private JMenu menu2 = new JMenu("Tamaño");

    private JMenuItem submenuSair = new JMenuItem("Saír"); // O SUBMENU
    private JMenuItem submenuMinimizar = new JMenuItem("Minimizar");
    private JMenuItem submenuMaximizar = new JMenuItem("Maximizar");
    private JMenuItem submenuNormal = new JMenuItem("Normal");

    public ProbaMenu() {
        /* ENGADIMOS O SUBMENU AO MENU, ESTE Á BARRA de MENÚS E A BARRA Á VENTÁ */

        menu1.add(submenuSair);
        menu2.add(submenuMinimizar);
        menu2.add(submenuMaximizar);
        menu2.add(submenuNormal);

        barraMenus.add(menu1);
        barraMenus.add(menu2);
        setJMenuBar(barraMenus);
        setSize(300, 300);
        /* E XESTIONAMOS O QUE FAI O MENU CUN LISTENER */
        submenuSair.addActionListener(new ActionEscoitadorMenu());
        submenuMaximizar.addActionListener(new MaximizarAction());
        submenuMinimizar.addActionListener(new MinimizarAction());
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

}
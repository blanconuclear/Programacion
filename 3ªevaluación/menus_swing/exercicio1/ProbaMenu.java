package exercicio1;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class ProbaMenu extends JFrame {
    private JMenuBar barraMenus = new JMenuBar(); // O NOSO OBXECTO JMENUBAR
    private JMenu menu1 = new JMenu("Ficheiro"); // O NOSO MENU
    private JMenuItem submenuSair = new JMenuItem("Saír"); // O SUBMENU

    public ProbaMenu() {
        /* ENGADIMOS O SUBMENU AO MENU, ESTE Á BARRA de MENÚS E A BARRA Á VENTÁ */

        menu1.add(submenuSair);
        barraMenus.add(menu1);
        setJMenuBar(barraMenus);
        setSize(300, 300);
        /* E XESTIONAMOS O QUE FAI O MENU CUN LISTENER */
        submenuSair.addActionListener(new ActionEscoitadorMenu());
    }

    // DEFINIMOS A CLASE LISTENER DOS EVENTOS DE MENU
    private class ActionEscoitadorMenu implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

}
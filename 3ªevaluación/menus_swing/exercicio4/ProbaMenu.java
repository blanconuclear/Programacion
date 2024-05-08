package exercicio4;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * Fai un programa que mostre un menú “Bit” con 2 submenús, cada un etiquetado
 * “0” e “1”. A ventá debe ter unha etiqueta na que se vai escribindo os bits
 * pulsados, concatenando o que xa hai cun “0” ou con un “1”. O máximo número de
 * díxitos que pode ter a etiqueta é 16 (dous bytes), cando se pulsen máis
 * díxitos non se engadirán á etiqueta. (emprega un contador no que gardes o
 * número de díxitos engadidos). Engade un botón “Borrar”, que borre o texto da
 * etiqueta (poña o texto a "" ), e poña o contador do número de díxitos a 0,
 * para que se poda volver a escribir. Engade outro botón “Bloquea” que impida
 * que se poida escribir máis na etiqueta.
 */

/**
 * ProbaMenu
 */
public class ProbaMenu extends JFrame {
    private JMenuBar barraMenus = new JMenuBar();
    private JMenu menu1 = new JMenu("Bit");

    private JMenuItem submenu0 = new JMenuItem("0");
    private JMenuItem submenu1 = new JMenuItem("1");

    public ProbaMenu() {
        menu1.add(submenu0);
        menu1.add(submenu1);

        barraMenus.add(menu1);
        setJMenuBar(barraMenus);
        setSize(300, 300);
    }
}
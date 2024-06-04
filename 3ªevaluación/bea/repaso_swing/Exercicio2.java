/* 
 * Fai un programa con unha ventá con unha etiqueta na que se mostre o estado da ventá (maximizada, normal). 
 * Engade dous menús, un que se chame Ficheiro, con un submenú Saír como no exercicio anterior, 
 * e outro menú que se chame Tamaño, con submenús Minimizar, Maximizar, Normal. 
 * Os submenús deberán facer esas accións cando sexan seleccionados. 
 * (Podes empregar o método setExtendedState() de JFrame, herdado de Frame)
 */

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Exercicio2 extends JFrame {
    JPanel panel = new JPanel();
    JLabel etiqueta = new JLabel("Hola");
    JMenuBar barraMenu = new JMenuBar();
    JMenu menu1 = new JMenu("Fihcheiro");
    JMenu menu2 = new JMenu("Tamaño");

    JMenuItem submenuSair = new JMenuItem("Sair");
    JMenuItem submenuMinimizar = new JMenuItem("Minimizar");
    JMenuItem submenuMaximizar = new JMenuItem("Maximizar");
    JMenuItem submenuNormal = new JMenuItem("Normal");

    public Exercicio2() {
        setSize(500, 500);
        getContentPane().add(panel);

        setJMenuBar(barraMenu);
        barraMenu.add(menu1);
        barraMenu.add(menu2);

        menu1.add(submenuSair);

        menu2.add(submenuMaximizar);
        menu2.add(submenuMinimizar);
        menu2.add(submenuNormal);

        panel.add(etiqueta);

        submenuSair.addActionListener(new ActionMenu());
        submenuMaximizar.addActionListener(new ActionMenu());
        submenuMinimizar.addActionListener(new ActionMenu());
        submenuNormal.addActionListener(new ActionMenu());

    }

    public static void main(String[] args) {
        Exercicio2 panel = new Exercicio2();
        panel.setVisible(true);
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ActionMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submenuSair) {
                System.exit(0);
            } else if (e.getSource() == submenuMaximizar) {
                setExtendedState(Frame.MAXIMIZED_BOTH);
                etiqueta.setText("Maximizar");
            } else if (e.getSource() == submenuMinimizar) {
                etiqueta.setText("Miminizar");
                setExtendedState(Frame.ICONIFIED);
            } else if (e.getSource() == submenuNormal) {
                etiqueta.setText("Normal");
                setSize(500, 500);
            }

        }

    }
}

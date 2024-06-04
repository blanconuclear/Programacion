import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ProbaMenu
 */
public class ProbaMenu extends JFrame {
    JMenuBar barraMenu = new JMenuBar();
    JMenu menu = new JMenu("Ficheiro");
    JMenuItem submenu = new JMenuItem("Sair");

    public ProbaMenu() {
        setSize(500, 500);
        setJMenuBar(barraMenu);
        barraMenu.add(menu);
        menu.add(submenu);

        submenu.addActionListener(new accionMenu());

    }

    public static void main(String[] args) {
        ProbaMenu menu = new ProbaMenu();
        menu.setVisible(true);
    }

    private class accionMenu implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
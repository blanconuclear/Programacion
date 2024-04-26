package exercicio7;

import javax.swing.*;
import java.awt.event.*;

class Oframe extends JFrame {

    private int width = 300;
    private int height = 250;

    private boolean ratoDentro = false;

    public Oframe() {
        setTitle("Primeir título");
        setSize(width, height);
        addWindowListener(new OListener());
        // addKeyListener(new TeclaListener());
        addMouseListener(new RatoListener());

    }

    class OListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.println("SAIN. FINALIZANDO");
            System.exit(0);
        }
    }

    class TeclaListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {

            setSize(700, 650);

        }
    }

    class RatoListener extends MouseAdapter {
        public void mouseEntered(MouseEvent e) {
            ratoDentro = true;
            addKeyListener(new TeclaListener());
        }

        public void mouseExited(MouseEvent e) {
            ratoDentro = false;
            setSize(width, height);
        }
    }
}

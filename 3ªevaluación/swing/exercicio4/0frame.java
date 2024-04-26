package exercicio4;

import javax.swing.*;
import java.awt.event.*;

class Oframe extends JFrame {

    private int width = 300;
    private int height = 250;

    private int incremento = 50;
    private boolean incrementando = true;

    public Oframe() {
        setTitle("Terceiro Frame!!!");
        setSize(width, height);
        addWindowListener(new OListener());

    }

    class OListener implements WindowListener {
        public void windowClosing(WindowEvent e) {
            System.out.println("SAIN. FINALIZANDO");
            System.exit(0);
        }

        /*
         * A INTERFACE WindowListener obriga a definir os métodos, pero quedan baleiros
         */
        public void windowOpened(WindowEvent e) {
        }

        public void windowClosed(WindowEvent e) {
        }

        public void windowActivated(WindowEvent e) {
            System.out.println("frame activo");

            if (incrementando) {
                setSize(width += incremento, height += incremento);
                if (width == 700 && height == 650) {
                    incrementando = false;
                    System.out.println("incrementando");
                }
            } else {
                setSize(width -= incremento, height -= incremento);
                if (width == 300 && height == 250) {
                    incrementando = true;
                    System.out.println("Restando");
                }
            }
        }

        public void windowDeactivated(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

    }
}

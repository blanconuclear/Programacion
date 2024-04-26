package exercicio2;

import javax.swing.*;
import java.awt.event.*;

class Oframe extends JFrame {

    public int count;

    public Oframe() {
        setTitle("Terceiro Frame!!!");
        setSize(300, 200);
        addWindowListener(new OListener());
        count = 0;
    }

    private class OListener extends WindowAdapter {
        public void windowDeiconified(WindowEvent e) {
            count++;

            if (count == 1) {
                setTitle("contador un ");
            } else if (count == 2) {
                setTitle("contador dous ");
            } else if (count == 3) {
                System.out.println("rematou");
                System.exit(0);
            }

        }

    }
    // os outros métodos...
}

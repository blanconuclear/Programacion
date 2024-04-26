package exercicio1;

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
            System.out.println("SAIN. FINALIZANDO ");
            count++;
            setTitle("contador " + count);
        }
        // os outros métodos...
    }
}

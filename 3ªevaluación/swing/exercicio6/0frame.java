package exercicio6;

/*Modifica o exercicio anterior para que a mensaxe sexa distinta cando se mantén pulsada e cando se libere a tecla. */

import javax.swing.*;
import java.awt.event.*;

class Oframe extends JFrame {

    private int width = 300;
    private int height = 250;

    public Oframe() {
        setTitle("Primeir título");
        setSize(width, height);
        addWindowListener(new OListener());
        addKeyListener(new TeclaListener());
        addKeyListener(new TeclaSoltaListener());
    }

    class OListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.println("SAIN. FINALIZANDO");
            System.exit(0);
        }
    }

    class TeclaListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            setTitle("Tecla presionada");
        }
    }

    class TeclaSoltaListener extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            setTitle("Tecla soltada");
        }

    }

}

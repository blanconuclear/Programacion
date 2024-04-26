package exercicio5;

/*Fai un programa que nun frame mostre no título unha mensaxe cando se preme unha tecla co frame como ventá activa, 
e outro diferente cando o rato entra no espacio da ventá. 
A túas clases Listener deberán ser subclases de WindowAdapter, de KeyAdapter e de MouseAdapter. */

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
            setTitle("Tecla presionada");
        }
    }

    class RatoListener extends MouseAdapter {
        public void mouseEntered(MouseEvent e) {
            setTitle("Rato entrou na ventá");
        }
    }
}

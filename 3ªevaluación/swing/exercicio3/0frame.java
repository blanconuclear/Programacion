package exercicio3;

/*Fai un programa que abra 2 JFrames de 300 x 250, de título “Tamaño modificable”. 
A túa clase deberá implementar a interface WindowListener. 
Os 2 frames deberán modificar o seu tamaño cada vez que son activadas, 
incrementando en 50 pixels tanto o alto como o ancho. O tamaño máximo será 700 x 650. 
Cando se chegue ao tamaño máximo non modificarán máis o tamaño, mostrando no seu título unha mensaxe de que xa non o modifican */

import javax.swing.*;
import java.awt.event.*;

class Oframe extends JFrame {

    private int width = 300;
    private int height = 250;

    private int incremento = 50;

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

            setSize(width += incremento, height += incremento);

            if (width == 700 && height == 650) {
                setTitle("Non se pode modificar mais");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                System.exit(0);

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

package exercicio2;

public class Gaivota implements Voador, Ovipero {

    @Override
    public void voa() {
        System.out.println("A gaivota voa");
    }

    @Override
    public void porOvos() {
        System.out.println("A gaivota pon ovos");
    }

}
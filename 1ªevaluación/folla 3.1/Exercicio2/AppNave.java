package Exercicio2;

public class AppNave {
    public static void main(String[] args) {

        Nave nave = new Nave();

        for (int i = nave.getTempo(); i >= 0; i--) {
            nave.SetTempo(i);
            System.out.println(i);
        }
        System.out.println("A nave " + nave.nome + " acaba de despegar!!");

    }
}
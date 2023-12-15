package Exercicio1;

public class AppNave {
    public static void main(String[] args) {

        Nave nave = new Nave();

        for (int i = nave.tempo; i >= 0; i--) {

            System.out.println(i);
        }
        System.out.println("A nave " + nave.nome + " acaba de despegar!!");

    }
}
package Exercicio6;

public class AppDinosaurio {

    public static void main(String[] args) {
        Dinosaurio din1 = new Dinosaurio("Rodrigo", 10);
        Dinosaurio din2 = new Dinosaurio();
        Dinosaurio din3 = new Dinosaurio("Pep3", 60);

        System.out.println("O nome do dinosaurio 1 é: " + din1.getNome() + ". E a sua idade é: " + din1.getIdade());
        System.out.println("O nome do dinosaurio 2 é: " + din2.getNome() + ". E a sua idade é: " + din2.getIdade());
        System.out.println("O nome do dinosaurio 3 é: " + din3.getNome() + ". E a sua idade é: " + din3.getIdade());

        din1.setIdade(70);
        din1.setNome("Cuevas");

        System.out
                .println("Ahora o nome do dinosaurio 1 é: " + din1.getNome() + ". E a sua idade é: " + din1.getIdade());

    }
}
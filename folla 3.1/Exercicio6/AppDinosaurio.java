package exercicio6;

public class AppDinosaurio {
    public static void main(String[] args) {

        Dinosaurio din1 = new Dinosaurio();
        Dinosaurio din2 = new Dinosaurio("Andrea", 12);
        Dinosaurio din3 = new Dinosaurio("paca", 4);

        System.out.println("O dinosaurio 1 chámase: " + din1.getNome() + " e ten: " + din1.getIdade() + " anos.");
        System.out.println();
        System.out.println("O dinosaurio 2 chámase: " + din2.getNome() + " e ten: " + din2.getIdade() + " anos.");
        System.out.println();

        System.out.println("O dinosaurio 3 chámase: " + din3.getNome() + " e ten: " + din3.getIdade() + " anos.");

        din3.setNome("Manolito");
        din3.setIdade(6);
        System.out.println();

        System.out.println("Ahora o dinosaurio 3 chámase: " + din3.getNome() + " e ten: " + din3.getIdade() + " anos.");

    }
}

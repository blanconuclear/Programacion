package exercicio1;

public class AppAnimal {

    public static void main(String[] args) {
        Animal animal1 = new Animal(1, "Rodrigo", false);
        Animal animal2 = new Animal(7, "Manolo", false);
        Animal animal3 = new Animal(78, "Pepa", false);

        animal1.getDatos();
        animal2.getDatos();
        animal3.getDatos();

        animal1.nace(animal1);
        animal2.nace(animal2);
        animal3.nace(animal3);

        animal1.morre(animal1);
        animal2.morre(animal2);
        animal3.morre(animal3);

    }
}
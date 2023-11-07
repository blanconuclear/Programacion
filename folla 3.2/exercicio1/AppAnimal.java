package exercicio1;

public class AppAnimal {

    public static void main(String[] args) {
        Animal animal1 = new Animal(1, "Rodrigo", false);
        Animal animal2 = new Animal(7, "Manolo", true);
        Animal animal3 = new Animal(78, "Pepa", false);

        animal1.getDatos();
        animal2.getDatos();
        animal3.getDatos();

        Animal.nace(animal1);
        Animal.nace(animal2);
        Animal.nace(animal3);

        Animal.morre(animal1);
        Animal.morre(animal2);
        Animal.morre(animal3);

    }
}
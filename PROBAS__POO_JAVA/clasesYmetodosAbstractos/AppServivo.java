package clasesYmetodosAbstractos;

public class AppServivo {
    public static void main(String[] args) {

        Planta planta1 = new Planta();
        AnimalCarnivoro animalCarnivoro1 = new AnimalCarnivoro();
        AnimalHervivoro animalHervivoro = new AnimalHervivoro();

        planta1.alimentarse();
        animalCarnivoro1.alimentarse();
        animalHervivoro.alimentarse();
    }
}

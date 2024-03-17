package clase_abstracta;

public class AppSerVivo {
    public static void main(String[] args) {

        Planta planta = new Planta();
        Carnivoro carnivoro = new Carnivoro();

        planta.alimentarse();
        carnivoro.alimentarse();
    }
}

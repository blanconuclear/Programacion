package exercicio1;

public class AppPersoeiro {
    public static void main(String[] args) {

        Persoa[] arrayPersoas = new Persoa[4];

        arrayPersoas[0] = new Empregado("Efrén", "Corzón", 32, 1400);
        arrayPersoas[1] = new Empregado("Jose", "Perez", 50, 1500);
        arrayPersoas[2] = new Estudante("Andrés", "Calvo", 20, "Informática");
        arrayPersoas[3] = new Estudante("Lorena", "Alvarez", 40, "Matemáticas");

        for (Persoa persoa : arrayPersoas) {
            System.out.println("Descricion: " + persoa.dameDescricion());
            System.out.println("");
        }

    }
}

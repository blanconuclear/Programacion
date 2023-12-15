package exercicio4;

public class AppLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro("O quixote", "Jose", 55, 1);
        Libro libro2 = new Libro("La weedypedia", "El William de Conjo", 5, 4);
        Libro libro3 = new Libro("100 años de soledad", "Gabriel Garcia Marquez", 32, 5);
        Libro libro4 = new Libro("100 años de soledad", "Gabriel Garcia Marquez", 32, 9);

        libro2.setPrezo(14.56);

        libro1.seVende();
        libro2.seVende();

        System.out.println("Os libros vendidos son: " + Libro.numLibrosVendidos);

        System.out.println("Comparando libro1 con libro2, resultado: " + Libro.valeMais(libro1, libro2));
        System.out.println("Comparando libro2 con libro1, resultado: " + Libro.valeMais(libro2, libro1));

        libro2.setPrezo(55);

        System.out.println("Comparando libro1 con libro2, resultado: " + Libro.valeMais(libro1, libro2));

    }
}
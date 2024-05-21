package exercicio22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CrearArchivoBinario {
    public static void main(String[] args) {
        ArrayList<Tema> temas = new ArrayList<>();
        temas.add(new Tema("Take the A Train", "Duke Ellington", 1941, "Jazz"));
        temas.add(new Tema("Sympathy for the Devil", "The Rolling Stones", 1968, "Rock"));
        temas.add(new Tema("Round Midnight", "Thelonious Monk", 1944, "Jazz"));
        temas.add(new Tema("Love You To", "The Beatles", 1966, "Rock-Pop"));
        temas.add(new Tema("All Blues", "Miles Davis", 1959, "Jazz"));
        temas.add(new Tema("Eleanor Rigby", "The Beatles", 1966, "Rock-Pop"));
        temas.add(new Tema("Minor Vamp", "Blue Mitchell", 1959, "Jazz"));
        temas.add(new Tema("Smells like Teen Spirit", "Nirvana", 1991, "Rock"));
        temas.add(new Tema("So What", "Miles Davis", 1959, "Jazz"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temas.dat"))) {
            oos.writeObject(temas);
            System.out.println("Temas gardados en temas.dat");
        } catch (IOException e) {
            System.err.println("Erro ao gardar os temas: " + e.getMessage());
        }
    }
}
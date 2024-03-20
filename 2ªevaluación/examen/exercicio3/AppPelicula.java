package exercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AppPelicula {

    public static void main(String[] args) throws IOException {
        List<Pelicula> listaPeliculas = new ArrayList<>();

        try {

            // Ler archivo (Falla a hora de engadir na lista).
            FileReader fr = new FileReader("peliculas.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = "";
            while (linea != null) {
                linea = br.readLine();
                String titulo = linea;
                String duracion = linea;
                String ano = linea;
                String director = linea;
                String actorPrincipal = linea;
                String actrizPrincipal = linea;

                Pelicula pelicula = new Pelicula(titulo, duracion, ano, director, actorPrincipal, actrizPrincipal);
                listaPeliculas.add(pelicula);
            }

            for (Pelicula pelicula : listaPeliculas) {
                System.out.println(pelicula.toString());
            }

            // Función Engadir película.
            engadirPelicula(listaPeliculas);

            // Escribir película.
            FileWriter fw = new FileWriter("peliculas.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (Pelicula pelicula : listaPeliculas) {
                bw.write(pelicula.toString());
                bw.newLine();
            }

            bw.close();

            // Volver a ler archivo
            linea = "";
            while (linea != null) {
                linea = br.readLine();
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }

    public static void engadirPelicula(List<Pelicula> listaPeliculas) {
        for (int i = 0; i < 1; i++) {
            String titulo = JOptionPane.showInputDialog("Dime un título: ");
            String duracion = JOptionPane.showInputDialog("Dime a duración: ");
            String ano = JOptionPane.showInputDialog("Dime o ano: ");
            String director = JOptionPane.showInputDialog("Dime o director: ");
            String actorPrincipal = JOptionPane.showInputDialog("Dime o actor principal: ");
            String actrizPrincipal = JOptionPane.showInputDialog("Dime a actriz principal: ");

            Pelicula pelicula = new Pelicula(titulo, duracion, ano, director, actorPrincipal, actrizPrincipal);
            listaPeliculas.add(pelicula);
        }
    }

}
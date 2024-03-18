package ultimaDeFicheiros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.ExceptionPersonalizada;

public class FilesProbaa {
    public static void main(String[] args) throws IOException {
        List<Persona> listaPersonas = new ArrayList<>();

        crearPersona(listaPersonas);

        crearArchivo();

        escribirArchivo(listaPersonas);

        leerArchivo(listaPersonas);

        borrarPersoa(listaPersonas);

        escribirArchivo(listaPersonas);

        leerArchivo(listaPersonas);
    }

    public static void crearPersona(List<Persona> listaPersonas) {
        for (int i = 0; i < 2; i++) {
            String nombre = JOptionPane.showInputDialog("Dime o nome: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Dime a idade: "));
            String direccion = JOptionPane.showInputDialog("Dime direccion: ");

            Persona persona = new Persona(nombre, edad, direccion);
            try {
                persona.validarEdad();
            } catch (ExceptionPersonalizada e) {
                e.printStackTrace();
            }
            listaPersonas.add(persona);
        }
    }

    public static void crearArchivo() {
        File fl = new File("Pruebaaaaaaa.txt");
        try {
            fl.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escribirArchivo(List<Persona> listaPersonas) {
        try {
            FileWriter fw = new FileWriter("Pruebaaaaaaa.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Persona persona : listaPersonas) {
                bw.write(persona.toString());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo(List<Persona> listaPersonas) throws IOException {
        FileReader fr;
        try {
            fr = new FileReader("Pruebaaaaaaa.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = bf.readLine(); // Leer la siguiente línea del archivo
            }

            try {
                bf.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    public static void borrarPersoa(List<Persona> listaPersonas) {
        int codPersoa = Integer.parseInt(JOptionPane.showInputDialog("DIme o código: "));

        for (int i = 0; i < listaPersonas.size(); i++) {
            if (codPersoa == listaPersonas.get(i).getEdad()) {
                listaPersonas.remove(i);
            }
        }
    }
}

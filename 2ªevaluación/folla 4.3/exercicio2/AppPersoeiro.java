package exercicio2;

import java.util.Arrays;

public class AppPersoeiro {
    public static void main(String[] args) {
        Estudante[] arrayEstudantes = new Estudante[2];

        arrayEstudantes[0] = new Estudante("Lorena", "Gonzalez", 25, "Master");
        arrayEstudantes[1] = new Estudante("Jose", "Fontán", 22, "Matemáticas");

        Arrays.sort(arrayEstudantes);

        for (Estudante estudante : arrayEstudantes) {
            System.out.println(estudante.nome + " " + estudante.idade);
        }
    }
}

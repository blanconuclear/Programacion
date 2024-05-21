package exercicio1;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import exercicio2.Tema;

/* Crea unha clase Participante con nome, apelidos, e idade, que sexa serializable. Fai un programa que pida 3
participantes, e os grave un a un nun ficheiro binario participantes.dat, empregando serialización.
 */
public class AppParticipante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Participante> participantes = new ArrayList<>();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("participantes.bin"))) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Dime o nome: ");
                String nome = sc.nextLine();
                System.out.println("Dime o apelido: ");
                String apelido = sc.nextLine();
                System.out.println("Dime idade: ");
                int idade = sc.nextInt();

                participantes.add(new Participante(nome, apelido, idade));
            }

            oos.writeObject(participantes);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("participantes.bin"))) {
            // System.out.println(ois.readObject());
            participantes = (ArrayList<Participante>) ois.readObject();
            System.out.println(participantes);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

/* Fai un programa que permita almacenar nun ficheiro binario as temperaturas máxima e mínima
rexistradas nun lugar neste 2024. As temperaturas serán gardadas en ºC con decimais, e o día
identificado polo dia do ano (desde 1 a 366, pois este ano é bisesto). O usuario xestionará as
temperaturas. Deberá mostrar un menú para:
➢ introducir temperaturas (varias, ata que queira parar). Deberán gardarse no ficheiro
➢ ver as temperaturas gardadas
➢ saír do programa */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                a) introducir temperaturas (varias, ata que queira parar). Deberán gardarse no ficheiro
                b) ver as temperaturas gardadas
                c) saír do programa
                    """;
        System.out.println(menu);

        String opcionMenu = "";

        while (!opcionMenu.equals("c")) {
            System.out.print("Elige una opción: ");
            opcionMenu = sc.nextLine();

            switch (opcionMenu) {
                case "a":

                    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("temperaturas.bin"))) {
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Dime la temperatura mínima: ");
                            double tempMin = sc.nextDouble();

                            System.out.println("Dime la temperatura máxima: ");
                            double tempMax = sc.nextDouble();

                            dos.writeDouble(tempMin);
                            dos.writeDouble(tempMax);

                            // Consumir la nueva línea sobrante
                            // sc.nextLine();
                        }
                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;

                case "b":
                    try (DataInputStream dis = new DataInputStream(new FileInputStream("temperaturas.bin"))) {
                        while (dis.available() > 0) {
                            double tempMin = dis.readDouble();
                            double tempMax = dis.readDouble();
                            System.out.println("Temperatura mínima: " + tempMin + " ºC");
                            System.out.println("Temperatura máxima: " + tempMax + " ºC");
                        }
                    } catch (IOException e) {
                        e.getMessage();
                    }
            }
        }

        sc.close();
    }
}

/* . Fai un programa que permita almacenar nun ficheiro binario as temperaturas máxima e mínima
rexistradas nun lugar neste 2024. As temperaturas serán gardadas en ºC con decimais, e o día
identificado polo dia do ano (desde 1 a 366, pois este ano é bisesto). O usuario xestionará as
temperaturas. Deberá mostrar un menú para:
➢ introducir temperaturas (varias, ata que queira parar). Deberán gardarse no ficheiro
➢ ver as temperaturas gardadas
➢ saír do programa
 */

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1Repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                1. introducir temperaturas (varias, ata que queira parar). Deberán gardarse no ficheiro
                2. ver as temperaturas gardadas
                3. saír do programa
                    """;
        System.out.println(menu);
        String opcionMenu = " ";

        while (!opcionMenu.equals("3")) {
            System.out.println("Escolle unha opción: ");
            opcionMenu = sc.nextLine();

            switch (opcionMenu) {
                case "1":
                    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("exercicioRepaso1.bin"))) {
                        for (int i = 0; i < 2; i++) {
                            System.out.println("Dime temp minima:");
                            Double tempMin = sc.nextDouble();
                            System.out.println("Dime temp max: ");
                            Double tempMax = sc.nextDouble();
                            System.out.println("Dime el día del año: ");
                            int dia = sc.nextInt();

                            dos.writeDouble(tempMax);
                            dos.writeDouble(tempMin);
                            dos.writeInt(dia);
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2":
                    try (DataInputStream dis = new DataInputStream(new FileInputStream("exercicioRepaso1.bin"))) {
                        while (dis.available() > 0) {
                            Double tempMin = dis.readDouble();
                            Double tempMax = dis.readDouble();
                            int dia = dis.readInt();

                            System.out.println(tempMin + "c");
                            System.out.println(tempMax + "c");
                            System.out.println(dia);
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            System.out.println(menu);
        }
    }
}

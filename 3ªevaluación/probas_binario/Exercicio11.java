/* Fai un programa que permita almacenar nun ficheiro binario as temperaturas máxima e mínima
rexistradas nun lugar neste 2024. As temperaturas serán gardadas en ºC con decimais, e o día
identificado polo dia do ano (desde 1 a 366, pois este ano é bisesto). O usuario xestionará as
temperaturas. Deberá mostrar un menú para:
➢ introducir temperaturas (varias, ata que queira parar). Deberán gardarse no ficheiro
➢ ver as temperaturas gardadas
➢ saír do programa */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                a) introducir temperaturas (varias, ata que queira parar). Deberán gardarse no ficheiro
                b) ver as temperaturas gardadas
                c) saír do programa */
                    """;

        System.out.println(menu);
        String menuOpcion = "";

        while (!menuOpcion.equals("fin")) {

            System.out.println(menu);
            menuOpcion = sc.nextLine();

            switch (menuOpcion) {
                case "a":
                    Double tempMin;
                    Double tempMax;

                    try {
                        FileOutputStream fos = new FileOutputStream("temperaturas.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Introduce a temperatura mínima");
                            tempMin = sc.nextDouble();
                            System.out.println("Introduce a temperatura máxima: ");
                            tempMax = sc.nextDouble();

                            oos.writeDouble(tempMin);
                        }

                    } catch (Exception e) {
                        e.getMessage();
                    }

                    break;
                case "b":
                    try {
                        InputStream fis = new FileInputStream("temperaturas.txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        System.out.println(ois.readDouble());

                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                    break;
                default:
                    break;
            }
        }
    }

}
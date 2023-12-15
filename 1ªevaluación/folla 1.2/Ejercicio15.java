/*
 * Fai un programa que calcule cantas horas e minutos reais tes cada semana de
 * cada módulo de
 * do ciclo, e o mostre por pantalla o resultado.
 */

public class Ejercicio15 {

    public static void main(String[] args) {

        int prog = 7 * 50;
        int lmdxi = 5 * 50;
        int cd = 7 * 50;
        int sist = 7 * 50;
        int bbdd = 7 * 50;
        int ingl = 2 * 50;
        int fol = 4 * 50;

        System.out.println("PROG: " + prog / 60 + " Horas y " + (prog - (prog / 60) * 60) + " minutos");
        System.out.println("LMDXI: " + lmdxi / 60 + " Horas y " + (lmdxi - (lmdxi / 60) * 60) + " minutos");
        System.out.println("CD: " + cd / 60 + " Horas y " + (cd - (cd / 60) * 60) + " minutos");
        System.out.println("SIST: " + sist / 60 + " Horas y " + (sist - (sist / 60) * 60) + " minutos");
        System.out.println("BBDD: " + bbdd / 60 + " Horas y " + (bbdd - (bbdd / 60) * 60) + " minutos");
        System.out.println("INGL: " + ingl / 60 + " Horas y " + (ingl - (ingl / 60) * 60) + " minutos");
        System.out.println("FOL: " + fol / 60 + " Horas y " + (fol - (fol / 60) * 60) + " minutos");

    }
}
